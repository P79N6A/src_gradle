package com.xiaomi.push;

public class aq implements as {

    /* renamed from: a  reason: collision with root package name */
    private final String f81835a;

    /* renamed from: b  reason: collision with root package name */
    private final String f81836b;

    public aq(String str, String str2) {
        if (str != null) {
            this.f81835a = str;
            this.f81836b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    public String a() {
        return this.f81835a;
    }

    public String b() {
        return this.f81836b;
    }
}
