package com.umeng.commonsdk.proguard;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private short[] f80851a;

    /* renamed from: b  reason: collision with root package name */
    private int f80852b = -1;

    public void c() {
        this.f80852b = -1;
    }

    public short b() {
        return this.f80851a[this.f80852b];
    }

    public short a() {
        short[] sArr = this.f80851a;
        int i = this.f80852b;
        this.f80852b = i - 1;
        return sArr[i];
    }

    private void d() {
        short[] sArr = new short[(this.f80851a.length * 2)];
        System.arraycopy(this.f80851a, 0, sArr, 0, this.f80851a.length);
        this.f80851a = sArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i = 0; i < this.f80851a.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (i == this.f80852b) {
                sb.append(">>");
            }
            sb.append(this.f80851a[i]);
            if (i == this.f80852b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }

    public h(int i) {
        this.f80851a = new short[i];
    }

    public void a(short s) {
        if (this.f80851a.length == this.f80852b + 1) {
            d();
        }
        short[] sArr = this.f80851a;
        int i = this.f80852b + 1;
        this.f80852b = i;
        sArr[i] = s;
    }
}
