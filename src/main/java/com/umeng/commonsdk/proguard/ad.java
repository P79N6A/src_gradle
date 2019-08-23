package com.umeng.commonsdk.proguard;

public class ad {

    /* renamed from: a  reason: collision with root package name */
    public final String f80812a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f80813b;

    /* renamed from: c  reason: collision with root package name */
    public final short f80814c;

    public ad() {
        this("", (byte) 0, 0);
    }

    public String toString() {
        return "<TField name:'" + this.f80812a + "' type:" + this.f80813b + " field-id:" + this.f80814c + ">";
    }

    public boolean a(ad adVar) {
        if (this.f80813b == adVar.f80813b && this.f80814c == adVar.f80814c) {
            return true;
        }
        return false;
    }

    public ad(String str, byte b2, short s) {
        this.f80812a = str;
        this.f80813b = b2;
        this.f80814c = s;
    }
}
