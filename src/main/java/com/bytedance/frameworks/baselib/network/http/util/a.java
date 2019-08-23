package com.bytedance.frameworks.baselib.network.http.util;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public char[] f19868a = new char[32];

    /* renamed from: b  reason: collision with root package name */
    public int f19869b;

    public final String toString() {
        return new String(this.f19868a, 0, this.f19869b);
    }

    public a(int i) {
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        char[] cArr = new char[Math.max(this.f19868a.length << 1, i)];
        System.arraycopy(this.f19868a, 0, cArr, 0, this.f19869b);
        this.f19868a = cArr;
    }

    public final void a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f19869b + length;
        if (i > this.f19868a.length) {
            a(i);
        }
        str.getChars(0, length, this.f19868a, this.f19869b);
        this.f19869b = i;
    }
}
