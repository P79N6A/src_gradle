package com.xiaomi.push;

public final class kp extends kq {

    /* renamed from: a  reason: collision with root package name */
    private int f82438a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f877a;

    /* renamed from: b  reason: collision with root package name */
    private int f82439b;

    public final int a() {
        return this.f82438a;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int b2 = b();
        if (i2 > b2) {
            i2 = b2;
        }
        if (i2 > 0) {
            System.arraycopy(this.f877a, this.f82438a, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    public final void a(int i) {
        this.f82438a += i;
    }

    public final void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m562a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    /* renamed from: a  reason: collision with other method in class */
    public final byte[] m563a() {
        return this.f877a;
    }

    public final int b() {
        return this.f82439b - this.f82438a;
    }

    public final void b(byte[] bArr, int i, int i2) {
        this.f877a = bArr;
        this.f82438a = i;
        this.f82439b = i + i2;
    }
}
