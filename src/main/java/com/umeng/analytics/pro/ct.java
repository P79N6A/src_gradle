package com.umeng.analytics.pro;

import java.io.Serializable;

public class ct implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f80592a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f80593b;

    /* renamed from: c  reason: collision with root package name */
    private final String f80594c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f80595d;

    public boolean a() {
        return this.f80592a;
    }

    public String b() {
        return this.f80594c;
    }

    public boolean e() {
        return this.f80595d;
    }

    public boolean c() {
        if (this.f80593b == 12) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.f80593b == 15 || this.f80593b == 13 || this.f80593b == 14) {
            return true;
        }
        return false;
    }

    public ct(byte b2) {
        this(b2, false);
    }

    public ct(byte b2, String str) {
        this.f80593b = b2;
        this.f80592a = true;
        this.f80594c = str;
    }

    public ct(byte b2, boolean z) {
        this.f80593b = b2;
        this.f80595d = z;
    }
}
