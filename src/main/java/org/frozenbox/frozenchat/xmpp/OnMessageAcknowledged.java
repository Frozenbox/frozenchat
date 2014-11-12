package org.frozenbox.frozenchat.xmpp;

import org.frozenbox.frozenchat.entities.Account;

public interface OnMessageAcknowledged {
	public void onMessageAcknowledged(Account account, String id);
}
