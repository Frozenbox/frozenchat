package org.frozenbox.frozenchat.xmpp.stanzas.csi;

import org.frozenbox.frozenchat.xmpp.stanzas.AbstractStanza;

public class InactivePacket extends AbstractStanza {
	public InactivePacket() {
		super("inactive");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
