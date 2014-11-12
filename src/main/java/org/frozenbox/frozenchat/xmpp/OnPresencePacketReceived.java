package org.frozenbox.frozenchat.xmpp;

import org.frozenbox.frozenchat.entities.Account;
import org.frozenbox.frozenchat.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
