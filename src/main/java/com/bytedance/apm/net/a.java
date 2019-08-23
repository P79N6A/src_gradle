package com.bytedance.apm.net;

public final class a extends Exception {
    public String message;
    public int statusCode;

    public final String getMsg() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public a(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
