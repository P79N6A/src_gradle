package com.facebook.common.f;

public final class a extends Exception {
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public a(String str) {
        super(str);
    }
}
