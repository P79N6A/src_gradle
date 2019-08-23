package com.bytedance.framwork.core.b;

public final class c extends Exception {
    public String message;
    public int statusCode;

    public final String getMsg() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public c(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
