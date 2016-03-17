package org.frozenbox.frozenchat.utils;

import org.frozenbox.frozenchat.Config;

public final class Xmlns {
	public static final String BLOCKING = "urn:xmpp:blocking";
	public static final String ROSTER = "jabber:iq:roster";
	public static final String REGISTER = "jabber:iq:register";
	public static final String BYTE_STREAMS = "http://jabber.org/protocol/bytestreams";
	public static final String HTTP_UPLOAD = Config.LEGACY_NAMESPACE_HTTP_UPLOAD ? "org:frozenbox:frozenchat:http:upload" : "urn:xmpp:http:upload";
}
