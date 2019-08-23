package com.tt.option.net;

public class TmaFileRequest extends TmaRequest {
    private String targetFileDir;
    private String targetFileName;

    public String getTargetFileDir() {
        return this.targetFileDir;
    }

    public String getTargetFileName() {
        return this.targetFileName;
    }

    public void setTargetFileDir(String str) {
        this.targetFileDir = str;
    }

    public void setTargetFileName(String str) {
        this.targetFileName = str;
    }

    public TmaFileRequest(String str) {
        super(str, "GET");
    }
}
