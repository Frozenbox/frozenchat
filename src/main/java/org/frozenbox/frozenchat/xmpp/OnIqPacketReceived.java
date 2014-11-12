package org.frozenbox.frozenchat.xmpp;

import org.frozenbox.frozenchat.entities.Account;
import org.frozenbox.frozenchat.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	public void onIqPacketReceived(Account account, IqPacket packet);
}
