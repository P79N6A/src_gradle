package com.amap.api.services.a;

import android.text.TextUtils;
import java.net.Proxy;
import java.util.Map;

public abstract class dg {

    /* renamed from: f  reason: collision with root package name */
    int f6816f = 20000;
    int g = 20000;
    Proxy h;

    public abstract Map<String, String> d();

    public abstract Map<String, String> e();

    public byte[] h() {
        return null;
    }

    public abstract String i();

    /* access modifiers changed from: package-private */
    public byte[] n() {
        byte[] h2 = h();
        if (h2 != null && h2.length != 0) {
            return h2;
        }
        String a2 = de.a(d());
        if (!TextUtils.isEmpty(a2)) {
            return bo.a(a2);
        }
        return h2;
    }

    /* access modifiers changed from: package-private */
    public String m() {
        byte[] h2 = h();
        if (h2 == null || h2.length == 0) {
            return i();
        }
        Map<String, String> d2 = d();
        if (d2 == null) {
            return i();
        }
        String a2 = de.a(d2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i());
        stringBuffer.append("?");
        stringBuffer.append(a2);
        return stringBuffer.toString();
    }

    public final void a(int i) {
        this.f6816f = i;
    }

    public final void b(int i) {
        this.g = i;
    }

    public final void a(Proxy proxy) {
        this.h = proxy;
    }
}
