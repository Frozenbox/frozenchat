package org.frozenbox.frozenchat.xmpp;

import org.frozenbox.frozenchat.crypto.axolotl.AxolotlService;

public interface OnKeyStatusUpdated {
	public void onKeyStatusUpdated(AxolotlService.FetchStatus report);
}
