package org.frozenbox.frozenchat.xmpp.jingle;

import org.frozenbox.frozenchat.entities.Account;
import org.frozenbox.frozenchat.xmpp.PacketReceived;
import org.frozenbox.frozenchat.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
