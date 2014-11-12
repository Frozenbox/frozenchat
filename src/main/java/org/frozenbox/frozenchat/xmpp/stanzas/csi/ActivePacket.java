package org.frozenbox.frozenchat.xmpp.stanzas.csi;

import org.frozenbox.frozenchat.xmpp.stanzas.AbstractStanza;

public class ActivePacket extends AbstractStanza {
	public ActivePacket() {
		super("active");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
