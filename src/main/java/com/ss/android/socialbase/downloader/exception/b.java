package com.ss.android.socialbase.downloader.exception;

public final class b extends BaseException {
    private final int httpStatusCode;

    public final int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public b(int i, int i2, String str) {
        super(i, str);
        this.httpStatusCode = i2;
    }
}
