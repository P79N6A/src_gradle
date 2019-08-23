package com.alipay.c.b;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f5314b = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f5315a;

    public static a a() {
        return f5314b;
    }

    public final String b() {
        if (com.alipay.d.a.a.a.a.b(null)) {
            return null;
        }
        switch (this.f5315a) {
            case 1:
                return "http://mobilegw.stable.alipay.net/mgw.htm";
            case 2:
                return "https://mobilegw.alipay.com/mgw.htm";
            case 3:
                return "http://mobilegw-1-64.test.alipay.net/mgw.htm";
            case 4:
                return "http://mobilegw.aaa.alipay.net/mgw.htm";
            default:
                return "https://mobilegw.alipay.com/mgw.htm";
        }
    }
}
