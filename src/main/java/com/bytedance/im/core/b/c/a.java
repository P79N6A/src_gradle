package com.bytedance.im.core.b.c;

public final class a extends Exception {
    private final int mErrorCode;

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    public a(int i) {
        this.mErrorCode = i;
    }
}
