package org.frozenbox.frozenchat.entities;

import org.frozenbox.frozenchat.xmpp.jid.Jid;

public interface ListItem extends Comparable<ListItem> {
	public String getDisplayName();

	public Jid getJid();
}
