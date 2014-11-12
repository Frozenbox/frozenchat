package org.frozenbox.frozenchat.xmpp;

import org.frozenbox.frozenchat.entities.Account;

public interface OnStatusChanged {
	public void onStatusChanged(Account account);
}
