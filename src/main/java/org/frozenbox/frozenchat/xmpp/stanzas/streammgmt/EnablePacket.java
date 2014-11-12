package org.frozenbox.frozenchat.xmpp.stanzas.streammgmt;

import org.frozenbox.frozenchat.xmpp.stanzas.AbstractStanza;

public class EnablePacket extends AbstractStanza {

	public EnablePacket(int smVersion) {
		super("enable");
		this.setAttribute("xmlns", "urn:xmpp:sm:" + smVersion);
		this.setAttribute("resume", "true");
	}

}
