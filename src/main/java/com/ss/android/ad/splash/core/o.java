package com.ss.android.ad.splash.core;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import com.ss.android.ad.splash.b.a;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.d;
import com.ss.android.ad.splash.j;
import com.ss.android.ad.splash.l;
import com.ss.android.ad.splash.m;
import com.ss.android.ad.splash.n;
import com.ss.android.ad.splash.p;
import com.ss.android.ad.splash.q;
import com.ss.android.ad.splash.utils.e;
import com.ss.android.ad.splash.utils.i;
import com.ss.android.ugc.aweme.C0906R;
import java.util.concurrent.Future;
import org.json.JSONObject;

public class o implements j, l, p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile o f27712a;

    private o() {
    }

    public final void c() {
        q.a().f27726a = 0;
    }

    @NonNull
    public final m d() {
        g();
        return new p();
    }

    public static o f() {
        if (f27712a == null) {
            synchronized (o.class) {
                if (f27712a == null) {
                    f27712a = new o();
                }
            }
        }
        return f27712a;
    }

    public final void b() {
        e.f27662d = System.currentTimeMillis();
        e.f27664f = false;
        s.a().f27735b = -1;
        e.b(false);
        e.a((Future) null);
        e.a(-1);
    }

    private static void g() {
        int i = 0;
        try {
            if (e.t() == null) {
                i = 1;
                if (e.d()) {
                    i.a("SplashNetWork为空！ 请在SplashAdManager中设置！");
                }
            }
            if (e.v() == null) {
                i = 2;
                if (e.d()) {
                    i.a("EventListener为空！ 请在SplashAdManager中设置！");
                }
            }
            if (e.u() == null) {
                i = 3;
                if (e.d()) {
                    i.a("SplashAdResourceLoader为空！ 请在SplashAdManager中设置！");
                }
            }
            if (i > 0) {
                a.a().a("service_sdk_engine_invalidate", i, (JSONObject) null);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean e() {
        boolean z;
        g();
        b b2 = k.a().b();
        s.a().f();
        if (b2 == null || !b2.a()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            d a2 = d.a();
            a2.f27655a = b2;
            a2.f27656b = System.currentTimeMillis();
        } else {
            j.a().b();
        }
        e.b(false);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                e.y().submit(new Runnable() {
                    public final void run() {
                        a.a();
                        a.b();
                        com.ss.android.ad.splash.c.b.a().b();
                    }
                });
            }
        }, e.U());
        return z;
    }

    public final void a() {
        e.g = System.currentTimeMillis();
        e.f27664f = true;
    }

    public final l a(int i) {
        e.f27841a = 2;
        return this;
    }

    public final l b(int i) {
        e.a(i);
        return this;
    }

    public final l c(boolean z) {
        e.v = z;
        return this;
    }

    public final l d(boolean z) {
        e.y = z;
        return this;
    }

    public final l e(boolean z) {
        e.w = true;
        return this;
    }

    public final p h(int i) {
        e.t = i;
        return this;
    }

    public final p i(int i) {
        e.u = i;
        return this;
    }

    public final l a(d dVar) {
        e.f27659a = dVar;
        return this;
    }

    public final l b(long j) {
        e.z = j;
        return this;
    }

    public final p c(@StyleRes int i) {
        e.m = C0906R.style.l3;
        return this;
    }

    public final p d(@DrawableRes int i) {
        e.i = 2130840560;
        return this;
    }

    public final p e(@StringRes int i) {
        e.k = C0906R.string.c_c;
        return this;
    }

    public final p f(int i) {
        e.n = 2130840561;
        return this;
    }

    public final p g(@StringRes int i) {
        e.l = C0906R.string.c_b;
        return this;
    }

    public final l a(long j) {
        if (j <= 86400000) {
            j = 86400000;
        }
        e.q = j;
        return this;
    }

    public final l b(boolean z) {
        e.h = false;
        return this;
    }

    public final l a(n nVar) {
        e.f27661c = nVar;
        return this;
    }

    public final l a(q qVar) {
        e.f27660b = qVar;
        e.C().a();
        return this;
    }

    public final l a(boolean z) {
        e.f27663e = z;
        return this;
    }

    public final l a(String str, boolean z) {
        e.p = str;
        e.r = true;
        return this;
    }

    public final p a(boolean z, @StringRes int i) {
        e.o = z;
        e.j = 0;
        return this;
    }
}
