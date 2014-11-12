package org.frozenbox.frozenchat.xmpp;

import org.frozenbox.frozenchat.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(Contact contact, boolean online);
}
