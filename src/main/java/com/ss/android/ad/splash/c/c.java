package com.ss.android.ad.splash.c;

import com.ss.android.ad.splash.b.a;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.core.i;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ad.splash.utils.f;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f27521a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f27522b;

    private c() {
    }

    public static c a() {
        if (f27521a == null) {
            synchronized (c.class) {
                if (f27521a == null) {
                    f27521a = new c();
                }
            }
        }
        return f27521a;
    }

    public final void b() {
        if (e.H() && e.I() != null && NetworkUtils.b(e.F()) && !this.f27522b) {
            this.f27522b = true;
            f.e();
            f.d();
            new i() {
                public final void a(int i, Object obj) {
                }

                public final void a() {
                    a.a().a("service_real_time_request_result", 0, (JSONObject) null);
                }
            };
            this.f27522b = false;
        }
    }
}
