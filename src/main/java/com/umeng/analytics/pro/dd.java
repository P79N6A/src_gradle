package com.umeng.analytics.pro;

public final class dd {

    /* renamed from: a  reason: collision with root package name */
    public final String f80623a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f80624b;

    /* renamed from: c  reason: collision with root package name */
    public final int f80625c;

    public dd() {
        this("", (byte) 0, 0);
    }

    public final String toString() {
        return "<TMessage name:'" + this.f80623a + "' type: " + this.f80624b + " seqid:" + this.f80625c + ">";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dd) {
            return a((dd) obj);
        }
        return false;
    }

    public final boolean a(dd ddVar) {
        if (this.f80623a.equals(ddVar.f80623a) && this.f80624b == ddVar.f80624b && this.f80625c == ddVar.f80625c) {
            return true;
        }
        return false;
    }

    public dd(String str, byte b2, int i) {
        this.f80623a = str;
        this.f80624b = b2;
        this.f80625c = i;
    }
}
