package com.tt.option.net;

import java.io.File;

public class TmaFileResponse extends TmaResponse {
    private File downloadedFile;

    public File getDownloadedFile() {
        return this.downloadedFile;
    }

    public void setDownloadedFile(File file) {
        this.downloadedFile = file;
    }
}
