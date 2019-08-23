package com.ss.android.ad.splash.c;

import android.text.TextUtils;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.core.r;
import com.ss.android.ad.splash.utils.g;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f27519a;

    /* renamed from: b  reason: collision with root package name */
    private long f27520b;

    private b() {
    }

    public static b a() {
        if (f27519a == null) {
            synchronized (b.class) {
                if (f27519a == null) {
                    f27519a = new b();
                }
            }
        }
        return f27519a;
    }

    private boolean c() {
        if (System.currentTimeMillis() - this.f27520b > 3600000) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (c() && e.I() != null) {
            a a2 = e.I().a();
            if (a2 != null) {
                this.f27520b = System.currentTimeMillis();
                r.a().e(a2.toString());
                a(a2.f27515a);
            }
        }
    }

    private static void a(String str) {
        String str2 = "";
        if (e.e() != null) {
            str2 = e.e().f22771d;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!g.a(str)) {
            r.a().c(str).d();
        }
    }
}
