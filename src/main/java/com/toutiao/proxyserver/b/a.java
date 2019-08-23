package com.toutiao.proxyserver.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80009a;

    /* renamed from: b  reason: collision with root package name */
    public final String f80010b;

    /* renamed from: c  reason: collision with root package name */
    public final String f80011c;

    /* renamed from: d  reason: collision with root package name */
    public final int f80012d;

    /* renamed from: e  reason: collision with root package name */
    public final int f80013e;

    /* renamed from: f  reason: collision with root package name */
    public final String f80014f;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f80009a, false, 91775, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f80009a, false, 91775, new Class[0], String.class);
        }
        return "VideoHttpHeaderInfo{key='" + this.f80010b + '\'' + ", mime='" + this.f80011c + '\'' + ", contentLength=" + this.f80012d + ", flag=" + this.f80013e + ", extra='" + this.f80014f + '\'' + '}';
    }

    public a(String str, String str2, int i, int i2, String str3) {
        this.f80010b = str;
        this.f80011c = str2;
        this.f80012d = i;
        this.f80013e = i2;
        this.f80014f = str3;
    }
}
