package org.frozenbox.frozenchat.xmpp.jingle;

import org.frozenbox.frozenchat.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	public void onFileTransmitted(DownloadableFile file);

	public void onFileTransferAborted();
}
