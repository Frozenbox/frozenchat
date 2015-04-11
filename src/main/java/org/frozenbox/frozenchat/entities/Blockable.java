package org.frozenbox.frozenchat.entities;

import org.frozenbox.frozenchat.xmpp.jid.Jid;

public interface Blockable {
	public boolean isBlocked();
	public boolean isDomainBlocked();
	public Jid getBlockedJid();
	public Jid getJid();
	public Account getAccount();
}
