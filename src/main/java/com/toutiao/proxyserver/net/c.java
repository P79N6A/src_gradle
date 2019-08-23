package com.toutiao.proxyserver.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80142a;

    /* renamed from: b  reason: collision with root package name */
    public final String f80143b;

    /* renamed from: c  reason: collision with root package name */
    public final String f80144c;

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f80142a, false, 91814, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f80142a, false, 91814, new Class[0], String.class);
        }
        return "HttpHeader{name='" + this.f80143b + '\'' + ", value='" + this.f80144c + '\'' + '}';
    }

    public c(String str, String str2) {
        String trim = str.trim();
        String trim2 = str2.trim();
        if (trim.length() == 0 || trim2.length() == 0) {
            throw new IllegalArgumentException("name and value can't be empty");
        }
        this.f80143b = trim;
        this.f80144c = trim2;
    }
}
