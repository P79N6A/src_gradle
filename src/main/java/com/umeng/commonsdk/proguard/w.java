package com.umeng.commonsdk.proguard;

import java.io.Serializable;

public class w implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f80867a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f80868b;

    /* renamed from: c  reason: collision with root package name */
    private final String f80869c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f80870d;

    public boolean a() {
        return this.f80867a;
    }

    public String b() {
        return this.f80869c;
    }

    public boolean e() {
        return this.f80870d;
    }

    public boolean c() {
        if (this.f80868b == 12) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.f80868b == 15 || this.f80868b == 13 || this.f80868b == 14) {
            return true;
        }
        return false;
    }

    public w(byte b2) {
        this(b2, false);
    }

    public w(byte b2, String str) {
        this.f80868b = b2;
        this.f80867a = true;
        this.f80869c = str;
    }

    public w(byte b2, boolean z) {
        this.f80868b = b2;
        this.f80870d = z;
    }
}
