package com.xiaomi.push;

public class kd {

    /* renamed from: a  reason: collision with root package name */
    public final byte f82422a;

    /* renamed from: a  reason: collision with other field name */
    public final String f870a;

    /* renamed from: a  reason: collision with other field name */
    public final short f871a;

    public kd() {
        this("", (byte) 0, 0);
    }

    public kd(String str, byte b2, short s) {
        this.f870a = str;
        this.f82422a = b2;
        this.f871a = s;
    }

    public String toString() {
        return "<TField name:'" + this.f870a + "' type:" + this.f82422a + " field-id:" + this.f871a + ">";
    }
}
