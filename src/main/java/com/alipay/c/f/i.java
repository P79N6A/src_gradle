package com.alipay.c.f;

import android.content.Context;
import com.alipay.d.a.a.a.a;
import java.util.HashMap;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static String f5333a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f5334b = "";

    /* renamed from: c  reason: collision with root package name */
    public static String f5335c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f5336d = "";

    /* renamed from: e  reason: collision with root package name */
    public static String f5337e = "";

    /* renamed from: f  reason: collision with root package name */
    public static Map<String, String> f5338f = new HashMap();

    public static synchronized String a() {
        String str;
        synchronized (i.class) {
            str = f5333a;
        }
        return str;
    }

    public static synchronized String a(String str) {
        synchronized (i.class) {
            String concat = "apdidTokenCache".concat(String.valueOf(str));
            if (f5338f.containsKey(concat)) {
                String str2 = f5338f.get(concat);
                if (a.b(str2)) {
                    return str2;
                }
            }
            return "";
        }
    }

    public static synchronized void a(b bVar) {
        synchronized (i.class) {
            if (bVar != null) {
                f5333a = bVar.f5319a;
                f5334b = bVar.f5320b;
                f5335c = bVar.f5321c;
            }
        }
    }

    public static synchronized void a(c cVar) {
        synchronized (i.class) {
            if (cVar != null) {
                f5333a = cVar.f5322a;
                f5334b = cVar.f5323b;
                f5336d = cVar.f5325d;
                f5337e = cVar.f5326e;
                f5335c = cVar.f5324c;
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (i.class) {
            String concat = "apdidTokenCache".concat(String.valueOf(str));
            if (f5338f.containsKey(concat)) {
                f5338f.remove(concat);
            }
            f5338f.put(concat, str2);
        }
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z;
        synchronized (i.class) {
            try {
                if (Math.abs(System.currentTimeMillis() - h.b(context, str)) < 86400000) {
                    z = true;
                }
            } catch (Throwable th) {
                com.alipay.c.c.a.a(th);
            }
            z = false;
        }
        return z;
    }

    public static synchronized String b() {
        String str;
        synchronized (i.class) {
            str = f5334b;
        }
        return str;
    }

    public static void b(String str) {
        f5336d = str;
    }

    public static synchronized String c() {
        String str;
        synchronized (i.class) {
            str = f5336d;
        }
        return str;
    }

    public static void c(String str) {
        f5337e = str;
    }

    public static synchronized String d() {
        String str;
        synchronized (i.class) {
            str = f5337e;
        }
        return str;
    }

    public static synchronized String e() {
        String str;
        synchronized (i.class) {
            str = f5335c;
        }
        return str;
    }

    public static synchronized c f() {
        c cVar;
        synchronized (i.class) {
            cVar = new c(f5333a, f5334b, f5335c, f5336d, f5337e);
        }
        return cVar;
    }
}
