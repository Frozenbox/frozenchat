package org.frozenbox.frozenchat.xmpp.jingle;

public interface OnPrimaryCandidateFound {
	public void onPrimaryCandidateFound(boolean success,
			JingleCandidate canditate);
}
