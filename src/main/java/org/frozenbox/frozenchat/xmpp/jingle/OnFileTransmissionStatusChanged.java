package org.frozenbox.frozenchat.xmpp.jingle;

import org.frozenbox.frozenchat.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
