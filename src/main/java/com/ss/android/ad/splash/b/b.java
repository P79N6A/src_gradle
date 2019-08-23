package com.ss.android.ad.splash.b;

import org.json.JSONObject;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f27511c;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f27512a = true;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f27513b;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f27514d;

    public final void c() {
        this.f27512a = false;
    }

    private b() {
    }

    public final void b() {
        this.f27514d = System.currentTimeMillis();
        this.f27512a = true;
    }

    public static b a() {
        if (f27511c == null) {
            synchronized (b.class) {
                if (f27511c == null) {
                    f27511c = new b();
                }
            }
        }
        return f27511c;
    }

    public final void e() {
        long currentTimeMillis = System.currentTimeMillis() - this.f27513b;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_ad_show_total_time", currentTimeMillis);
            a.a().a("service_splash_ad_show_time", jSONObject, (JSONObject) null);
        } catch (Exception unused) {
        }
    }

    public void d() {
        if (a().f27512a) {
            try {
                long j = this.f27513b - this.f27514d;
                if (j > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("duration_init_to_show_ad", Long.valueOf(j));
                    a.a().a("service_init_to_show_ad", jSONObject, (JSONObject) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(int i) {
        a.a().a("service_splash_ad_show_result", i, (JSONObject) null);
    }
}
