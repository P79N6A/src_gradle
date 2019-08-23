package com.xiaomi.push;

public class ko extends kq {

    /* renamed from: a  reason: collision with root package name */
    private int f82437a;

    /* renamed from: a  reason: collision with other field name */
    private jy f876a;

    public ko(int i) {
        this.f876a = new jy(i);
    }

    public int a(byte[] bArr, int i, int i2) {
        byte[] a2 = this.f876a.a();
        if (i2 > this.f876a.a() - this.f82437a) {
            i2 = this.f876a.a() - this.f82437a;
        }
        if (i2 > 0) {
            System.arraycopy(a2, this.f82437a, bArr, i, i2);
            this.f82437a += i2;
        }
        return i2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m561a(byte[] bArr, int i, int i2) {
        this.f876a.write(bArr, i, i2);
    }

    public int a_() {
        return this.f876a.size();
    }
}
