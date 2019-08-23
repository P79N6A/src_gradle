package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.g;
import com.vivo.push.util.o;
import com.vivo.push.util.x;
import java.util.ArrayList;
import java.util.List;

public abstract class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f81582a = {34, 32, 33, 37, 33, 34, 32, 33, 33, 33, 34, 41, 35, 32, 32, 32};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f81583b = {33, 34, 35, 36, 37, 38, 39, 40, 41, 32, 38, 37, 36, 35, 34, 33};

    /* renamed from: c  reason: collision with root package name */
    protected static final Object f81584c = new Object();

    /* renamed from: d  reason: collision with root package name */
    protected List<T> f81585d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    protected Context f81586e;

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract List<T> a(String str);

    /* access modifiers changed from: package-private */
    public abstract String b(String str) throws Exception;

    public final void d() {
        synchronized (f81584c) {
            this.f81585d.clear();
            x.b(this.f81586e).b(a(), "");
            o.d("CacheSettings", "clear " + a() + " strApps");
        }
    }

    public final void c() {
        synchronized (f81584c) {
            g.a(a());
            this.f81585d.clear();
            String a2 = x.b(this.f81586e).a(a(), null);
            if (TextUtils.isEmpty(a2)) {
                o.d("CacheSettings", "ClientManager init " + a() + " strApps empty.");
            } else if (a2.length() > 10000) {
                o.d("CacheSettings", "sync " + a() + " strApps lenght too large");
                d();
            } else {
                try {
                    o.d("CacheSettings", "ClientManager init " + a() + " strApps : " + a2);
                    List a3 = a(b(a2));
                    if (a3 != null) {
                        this.f81585d.addAll(a3);
                    }
                } catch (Exception e2) {
                    d();
                    o.d("CacheSettings", o.a((Throwable) e2));
                }
            }
        }
    }

    protected d(Context context) {
        this.f81586e = context.getApplicationContext();
        c();
    }
}
