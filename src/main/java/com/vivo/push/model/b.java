package com.vivo.push.model;

import android.text.TextUtils;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private String f81608a;

    /* renamed from: b  reason: collision with root package name */
    private long f81609b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f81610c = -1;

    /* renamed from: d  reason: collision with root package name */
    private String f81611d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f81612e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f81613f;

    public final String a() {
        return this.f81608a;
    }

    public final long b() {
        return this.f81609b;
    }

    public final boolean c() {
        return this.f81612e;
    }

    public final boolean d() {
        return this.f81613f;
    }

    public final String toString() {
        return "PushPackageInfo{mPackageName=" + this.f81608a + ", mPushVersion=" + this.f81609b + ", mPackageVersion=" + this.f81610c + ", mInBlackList=" + this.f81612e + ", mPushEnable=" + this.f81613f + "}";
    }

    public final void a(int i) {
        this.f81610c = i;
    }

    public final void b(boolean z) {
        this.f81613f = z;
    }

    public final void a(long j) {
        this.f81609b = j;
    }

    public b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f81608a = str;
            return;
        }
        throw new IllegalAccessError("PushPackageInfo need a non-null pkgName.");
    }

    public final void a(String str) {
        this.f81611d = str;
    }

    public final void a(boolean z) {
        this.f81612e = z;
    }
}
