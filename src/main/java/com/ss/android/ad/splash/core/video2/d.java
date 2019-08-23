package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.core.video2.VolumeChangeObserver;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

public class d {

    /* renamed from: d  reason: collision with root package name */
    private static volatile d f27816d = null;

    /* renamed from: e  reason: collision with root package name */
    private static long f27817e = 500;

    /* renamed from: f  reason: collision with root package name */
    private static long f27818f = 3000;

    /* renamed from: a  reason: collision with root package name */
    public Timer f27819a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27820b;

    /* renamed from: c  reason: collision with root package name */
    public int f27821c;
    private VolumeChangeObserver g;

    public final void c() {
        this.f27820b = false;
        if (this.f27819a != null) {
            this.f27819a.cancel();
            this.f27819a = null;
        }
    }

    public static d a() {
        if (f27816d == null) {
            synchronized (d.class) {
                if (f27816d == null) {
                    f27816d = new d();
                }
            }
        }
        return f27816d;
    }

    public final void b() {
        if (this.g != null) {
            this.g.d();
            this.g = null;
        }
        if (this.f27819a != null) {
            this.f27819a.cancel();
            this.f27819a = null;
        }
    }

    public static void a(b bVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", 0);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", 1);
            jSONObject.put("log_extra", bVar.n());
            e.a(bVar.l(), "splash_ad", "mute", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void a(b bVar, float f2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", new DecimalFormat("0.0000").format((double) f2));
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", 1);
            jSONObject.put("log_extra", bVar.n());
            e.a(bVar.l(), "splash_ad", "unmute", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void a(final b bVar, Context context) {
        if (this.g == null) {
            this.g = new VolumeChangeObserver(context);
        }
        final int b2 = this.g.b();
        this.f27821c = this.g.a();
        final float f2 = (((float) this.f27821c) * 1.0f) / ((float) b2);
        if (f2 == 0.0f) {
            a(bVar);
        } else {
            a(bVar, f2);
        }
        this.f27820b = false;
        this.g.f27796a = new VolumeChangeObserver.a() {

            /* renamed from: a  reason: collision with root package name */
            float f27822a = f2;

            public final void a(int i) {
                if (!d.this.f27820b) {
                    if (this.f27822a == 0.0f && i > 0) {
                        this.f27822a = (((float) i) * 1.0f) / ((float) b2);
                        d.a(bVar, this.f27822a);
                    } else if (this.f27822a > 0.0f && i == 0) {
                        this.f27822a = (float) i;
                        d.a(bVar);
                    }
                }
            }
        };
        new StringBuilder("Init volume:").append(this.f27821c);
        this.g.c();
    }

    public final void a(final e eVar, int i, long j) {
        if (eVar != null || this.g != null || j > f27818f) {
            switch (i) {
                case 0:
                    eVar.a(true);
                    return;
                case 1:
                    eVar.a(false);
                    eVar.a(0.0f, 0.0f);
                    return;
                case 2:
                    eVar.a(false);
                    this.f27819a = new Timer();
                    this.f27820b = true;
                    final float a2 = (((float) this.g.a()) * 1.0f) / ((float) f27818f);
                    if (a2 > 0.0f) {
                        this.f27819a.schedule(new TimerTask() {
                            public final void run() {
                                try {
                                    float c2 = a2 * ((float) eVar.c());
                                    if (c2 >= ((float) d.this.f27821c)) {
                                        eVar.a((float) d.this.f27821c, (float) d.this.f27821c);
                                        d.this.f27819a.cancel();
                                        return;
                                    }
                                    eVar.a(c2, c2);
                                } catch (Exception unused) {
                                }
                            }
                        }, 0, f27817e);
                        return;
                    }
                    break;
                case 3:
                    int a3 = this.g.a();
                    eVar.a(false);
                    float f2 = ((float) a3) * 1.0f;
                    eVar.a(f2, f2);
                    return;
                default:
                    eVar.a(true);
                    break;
            }
        }
    }
}
