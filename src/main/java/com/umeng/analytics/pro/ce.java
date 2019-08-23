package com.umeng.analytics.pro;

public class ce {

    /* renamed from: a  reason: collision with root package name */
    private short[] f80576a;

    /* renamed from: b  reason: collision with root package name */
    private int f80577b = -1;

    public void c() {
        this.f80577b = -1;
    }

    public short b() {
        return this.f80576a[this.f80577b];
    }

    public short a() {
        short[] sArr = this.f80576a;
        int i = this.f80577b;
        this.f80577b = i - 1;
        return sArr[i];
    }

    private void d() {
        short[] sArr = new short[(this.f80576a.length * 2)];
        System.arraycopy(this.f80576a, 0, sArr, 0, this.f80576a.length);
        this.f80576a = sArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i = 0; i < this.f80576a.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (i == this.f80577b) {
                sb.append(">>");
            }
            sb.append(this.f80576a[i]);
            if (i == this.f80577b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }

    public ce(int i) {
        this.f80576a = new short[i];
    }

    public void a(short s) {
        if (this.f80576a.length == this.f80577b + 1) {
            d();
        }
        short[] sArr = this.f80576a;
        int i = this.f80577b + 1;
        this.f80577b = i;
        sArr[i] = s;
    }
}
