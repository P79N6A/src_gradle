package com.xiaomi.push;

import java.net.InetSocketAddress;

public final class dr {

    /* renamed from: a  reason: collision with root package name */
    private int f81952a;

    /* renamed from: a  reason: collision with other field name */
    private String f276a;

    public dr(String str, int i) {
        this.f276a = str;
        this.f81952a = i;
    }

    public static dr a(String str, int i) {
        int lastIndexOf = str.lastIndexOf(":");
        if (lastIndexOf != -1) {
            String substring = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
            str = substring;
        }
        return new dr(str, i);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static InetSocketAddress m184a(String str, int i) {
        dr a2 = a(str, i);
        return new InetSocketAddress(a2.a(), a2.a());
    }

    public final int a() {
        return this.f81952a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final String m185a() {
        return this.f276a;
    }

    public final String toString() {
        if (this.f81952a <= 0) {
            return this.f276a;
        }
        return this.f276a + ":" + this.f81952a;
    }
}
