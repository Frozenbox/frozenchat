package org.frozenbox.frozenchat.xmpp;

import org.frozenbox.frozenchat.entities.Account;
import org.frozenbox.frozenchat.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
