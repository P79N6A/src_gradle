package com.umeng.commonsdk.proguard;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public final String f80820a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f80821b;

    /* renamed from: c  reason: collision with root package name */
    public final int f80822c;

    public ag() {
        this("", (byte) 0, 0);
    }

    public final String toString() {
        return "<TMessage name:'" + this.f80820a + "' type: " + this.f80821b + " seqid:" + this.f80822c + ">";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ag) {
            return a((ag) obj);
        }
        return false;
    }

    public final boolean a(ag agVar) {
        if (this.f80820a.equals(agVar.f80820a) && this.f80821b == agVar.f80821b && this.f80822c == agVar.f80822c) {
            return true;
        }
        return false;
    }

    public ag(String str, byte b2, int i) {
        this.f80820a = str;
        this.f80821b = b2;
        this.f80822c = i;
    }
}
