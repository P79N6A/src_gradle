package com.ss.android.socialbase.downloader.exception;

public final class a extends BaseException {
    private String existTargetFileName;

    public final String getExistTargetFileName() {
        return this.existTargetFileName;
    }

    public a(String str) {
        this.existTargetFileName = str;
    }
}
