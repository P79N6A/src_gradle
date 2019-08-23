package com.bytedance.g.a;

public class a extends Exception {
    public final String url;

    public a(String str, Throwable th) {
        super("fetch failed " + str, th);
        this.url = str;
    }
}
