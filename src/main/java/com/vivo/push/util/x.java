package com.vivo.push.util;

import android.content.Context;
import java.util.HashMap;

public final class x implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Integer> f81693a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, Long> f81694b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, String> f81695c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static x f81696d;

    /* renamed from: e  reason: collision with root package name */
    private Context f81697e;

    /* renamed from: f  reason: collision with root package name */
    private c f81698f;
    private boolean g;

    public final void a() {
        w wVar = new w();
        if (wVar.a(this.f81697e)) {
            wVar.a();
            o.d("SystemCache", "sp cache is cleared");
        }
    }

    public static synchronized x b(Context context) {
        x xVar;
        synchronized (x.class) {
            if (f81696d == null) {
                f81696d = new x(context.getApplicationContext());
            }
            xVar = f81696d;
        }
        return xVar;
    }

    private x(Context context) {
        this.f81697e = context;
        this.g = a(context);
        o.d("SystemCache", "init status is " + this.g + ";  curCache is " + this.f81698f);
    }

    public final boolean a(Context context) {
        this.f81698f = new u();
        boolean a2 = this.f81698f.a(context);
        if (!a2) {
            this.f81698f = new t();
            a2 = this.f81698f.a(context);
        }
        if (!a2) {
            this.f81698f = new w();
            a2 = this.f81698f.a(context);
        }
        if (!a2) {
            this.f81698f = null;
        }
        return a2;
    }

    public final String a(String str, String str2) {
        String str3 = f81695c.get(str);
        if (str3 != null || this.f81698f == null) {
            return str3;
        }
        return this.f81698f.a(str, str2);
    }

    public final void b(String str, String str2) {
        f81695c.put(str, str2);
        if (this.g && this.f81698f != null) {
            this.f81698f.b(str, str2);
        }
    }
}
