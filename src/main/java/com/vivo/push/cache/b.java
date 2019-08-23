package com.vivo.push.cache;

import android.content.Context;
import com.google.a.a.a.a.a.a;
import com.vivo.push.util.o;
import com.vivo.push.util.y;
import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f81579a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f81580b;

    /* renamed from: c  reason: collision with root package name */
    private e f81581c;

    private b() {
    }

    public static b a() {
        if (f81580b == null) {
            synchronized (f81579a) {
                if (f81580b == null) {
                    f81580b = new b();
                }
            }
        }
        return f81580b;
    }

    public final e a(Context context) {
        String str;
        if (this.f81581c != null) {
            return this.f81581c;
        }
        try {
            if (y.a(context)) {
                str = "com.vivo.push.cache.ServerConfigManagerImpl";
            } else {
                str = "com.vivo.push.cache.ClientConfigManagerImpl";
            }
            Method method = Class.forName(str).getMethod("getInstance", new Class[]{Context.class});
            o.d("ConfigManagerFactory", "createConfig success is ".concat(String.valueOf(str)));
            this.f81581c = (e) method.invoke(null, new Object[]{context});
            return this.f81581c;
        } catch (Exception e2) {
            a.b(e2);
            o.b("ConfigManagerFactory", "createConfig error", e2);
            return null;
        }
    }
}
