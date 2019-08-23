package com.ss.android.http.a.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f29144a;

    /* renamed from: b  reason: collision with root package name */
    public int f29145b;

    public a(int i) {
        if (i >= 0) {
            this.f29144a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }
}
