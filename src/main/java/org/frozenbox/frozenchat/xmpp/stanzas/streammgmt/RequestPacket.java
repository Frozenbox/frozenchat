package org.frozenbox.frozenchat.xmpp.stanzas.streammgmt;

import org.frozenbox.frozenchat.xmpp.stanzas.AbstractStanza;

public class RequestPacket extends AbstractStanza {

	public RequestPacket(int smVersion) {
		super("r");
		this.setAttribute("xmlns", "urn:xmpp:sm:" + smVersion);
	}

}
