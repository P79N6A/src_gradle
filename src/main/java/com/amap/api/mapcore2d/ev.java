package com.amap.api.mapcore2d;

import android.text.TextUtils;
import java.net.Proxy;
import java.util.Map;

public abstract class ev {

    /* renamed from: c  reason: collision with root package name */
    int f6091c = 20000;

    /* renamed from: d  reason: collision with root package name */
    int f6092d = 20000;

    /* renamed from: e  reason: collision with root package name */
    Proxy f6093e;

    public byte[] a_() {
        return null;
    }

    public abstract Map<String, String> e();

    public abstract Map<String, String> f();

    public abstract String g();

    /* access modifiers changed from: package-private */
    public byte[] m() {
        byte[] a_ = a_();
        if (a_ != null && a_.length != 0) {
            return a_;
        }
        String a2 = es.a(f());
        if (!TextUtils.isEmpty(a2)) {
            return cz.a(a2);
        }
        return a_;
    }

    /* access modifiers changed from: package-private */
    public String l() {
        byte[] a_ = a_();
        if (a_ == null || a_.length == 0) {
            return g();
        }
        Map<String, String> f2 = f();
        if (f2 == null) {
            return g();
        }
        String a2 = es.a(f2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(g());
        stringBuffer.append("?");
        stringBuffer.append(a2);
        return stringBuffer.toString();
    }

    public final void a(int i) {
        this.f6091c = i;
    }

    public final void b(int i) {
        this.f6092d = i;
    }

    public final void a(Proxy proxy) {
        this.f6093e = proxy;
    }
}
