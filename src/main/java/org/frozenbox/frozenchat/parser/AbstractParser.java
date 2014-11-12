package org.frozenbox.frozenchat.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

import org.frozenbox.frozenchat.entities.Account;
import org.frozenbox.frozenchat.entities.Contact;
import org.frozenbox.frozenchat.services.XmppConnectionService;
import org.frozenbox.frozenchat.xml.Element;
import org.frozenbox.frozenchat.xmpp.jid.InvalidJidException;
import org.frozenbox.frozenchat.xmpp.jid.Jid;

public abstract class AbstractParser {

	protected XmppConnectionService mXmppConnectionService;

	protected AbstractParser(XmppConnectionService service) {
		this.mXmppConnectionService = service;
	}

	protected long getTimestamp(Element packet) {
		long now = System.currentTimeMillis();
		ArrayList<String> stamps = new ArrayList<>();
		for (Element child : packet.getChildren()) {
			if (child.getName().equals("delay")) {
				stamps.add(child.getAttribute("stamp").replace("Z", "+0000"));
			}
		}
		Collections.sort(stamps);
		if (stamps.size() >= 1) {
			try {
				String stamp = stamps.get(stamps.size() - 1);
				if (stamp.contains(".")) {
					Date date = new SimpleDateFormat(
							"yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US)
							.parse(stamp);
					if (now < date.getTime()) {
						return now;
					} else {
						return date.getTime();
					}
				} else {
					Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ",
							Locale.US).parse(stamp);
					if (now < date.getTime()) {
						return now;
					} else {
						return date.getTime();
					}
				}
			} catch (ParseException e) {
				return now;
			}
		} else {
			return now;
		}
	}

	protected void updateLastseen(final Element packet, final Account account,
			final boolean presenceOverwrite) {
        Jid from;
        try {
            from = Jid.fromString(packet.getAttribute("from")).toBareJid();
        } catch (final InvalidJidException e) {
            // TODO: Handle this?
            from = null;
        }
        String presence = from == null || from.isBareJid() ? "" : from.getResourcepart();
		Contact contact = account.getRoster().getContact(from);
		long timestamp = getTimestamp(packet);
		if (timestamp >= contact.lastseen.time) {
			contact.lastseen.time = timestamp;
			if (!presence.isEmpty() && presenceOverwrite) {
				contact.lastseen.presence = presence;
			}
		}
	}

	protected String avatarData(Element items) {
		Element item = items.findChild("item");
		if (item == null) {
			return null;
		}
		Element data = item.findChild("data", "urn:xmpp:avatar:data");
		if (data == null) {
			return null;
		}
		return data.getContent();
	}
}
