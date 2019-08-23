package com.umeng.analytics.pro;

public class da {

    /* renamed from: a  reason: collision with root package name */
    public final String f80615a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f80616b;

    /* renamed from: c  reason: collision with root package name */
    public final short f80617c;

    public da() {
        this("", (byte) 0, 0);
    }

    public String toString() {
        return "<TField name:'" + this.f80615a + "' type:" + this.f80616b + " field-id:" + this.f80617c + ">";
    }

    public boolean a(da daVar) {
        if (this.f80616b == daVar.f80616b && this.f80617c == daVar.f80617c) {
            return true;
        }
        return false;
    }

    public da(String str, byte b2, short s) {
        this.f80615a = str;
        this.f80616b = b2;
        this.f80617c = s;
    }
}
