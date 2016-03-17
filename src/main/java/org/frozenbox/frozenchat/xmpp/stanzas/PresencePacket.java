package org.frozenbox.frozenchat.xmpp.stanzas;

public class PresencePacket extends AbstractAcknowledgeableStanza {

	public PresencePacket() {
		super("presence");
	}
}
