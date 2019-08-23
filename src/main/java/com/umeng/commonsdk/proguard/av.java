package com.umeng.commonsdk.proguard;

public final class av extends aw {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f80829a;

    /* renamed from: b  reason: collision with root package name */
    private int f80830b;

    /* renamed from: c  reason: collision with root package name */
    private int f80831c;

    public final boolean a() {
        return true;
    }

    public final void b() throws ax {
    }

    public final void c() {
    }

    public final void e() {
        this.f80829a = null;
    }

    public av() {
    }

    public final byte[] f() {
        return this.f80829a;
    }

    public final int g() {
        return this.f80830b;
    }

    public final int h() {
        return this.f80831c - this.f80830b;
    }

    public av(byte[] bArr) {
        a(bArr);
    }

    public final void a(int i) {
        this.f80830b += i;
    }

    public final void a(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public final void b(byte[] bArr, int i, int i2) throws ax {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    public final void c(byte[] bArr, int i, int i2) {
        this.f80829a = bArr;
        this.f80830b = i;
        this.f80831c = i + i2;
    }

    public av(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public final int a(byte[] bArr, int i, int i2) throws ax {
        int h = h();
        if (i2 > h) {
            i2 = h;
        }
        if (i2 > 0) {
            System.arraycopy(this.f80829a, this.f80830b, bArr, i, i2);
            a(i2);
        }
        return i2;
    }
}
