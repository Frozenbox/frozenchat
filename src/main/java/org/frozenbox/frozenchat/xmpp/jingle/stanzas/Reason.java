package org.frozenbox.frozenchat.xmpp.jingle.stanzas;

import org.frozenbox.frozenchat.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}

	public Reason() {
		super("reason");
	}
}
