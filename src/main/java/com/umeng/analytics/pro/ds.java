package com.umeng.analytics.pro;

public final class ds extends dt {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f80632a;

    /* renamed from: b  reason: collision with root package name */
    private int f80633b;

    /* renamed from: c  reason: collision with root package name */
    private int f80634c;

    public final boolean a() {
        return true;
    }

    public final void b() throws du {
    }

    public final void c() {
    }

    public final void e() {
        this.f80632a = null;
    }

    public ds() {
    }

    public final byte[] f() {
        return this.f80632a;
    }

    public final int g() {
        return this.f80633b;
    }

    public final int h() {
        return this.f80634c - this.f80633b;
    }

    public ds(byte[] bArr) {
        a(bArr);
    }

    public final void a(int i) {
        this.f80633b += i;
    }

    public final void a(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public final void b(byte[] bArr, int i, int i2) throws du {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    public final void c(byte[] bArr, int i, int i2) {
        this.f80632a = bArr;
        this.f80633b = i;
        this.f80634c = i + i2;
    }

    public ds(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public final int a(byte[] bArr, int i, int i2) throws du {
        int h = h();
        if (i2 > h) {
            i2 = h;
        }
        if (i2 > 0) {
            System.arraycopy(this.f80632a, this.f80633b, bArr, i, i2);
            a(i2);
        }
        return i2;
    }
}
