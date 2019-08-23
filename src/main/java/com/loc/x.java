package com.loc;

import android.content.Context;
import android.text.TextUtils;
import java.lang.Thread;

public final class x implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static x f25898a;

    /* renamed from: b  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f25899b = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: c  reason: collision with root package name */
    private Context f25900c;

    /* renamed from: d  reason: collision with root package name */
    private dh f25901d;

    private x(Context context, dh dhVar) {
        this.f25900c = context.getApplicationContext();
        this.f25901d = dhVar;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    static synchronized x a(Context context, dh dhVar) {
        x xVar;
        synchronized (x.class) {
            if (f25898a == null) {
                f25898a = new x(context, dhVar);
            }
            xVar = f25898a;
        }
        return xVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        n nVar;
        Context context;
        String str;
        String a2 = di.a(th);
        try {
            if (!TextUtils.isEmpty(a2)) {
                if ((a2.contains("amapdynamic") || a2.contains("admic")) && a2.contains("com.amap.api")) {
                    n nVar2 = new n(this.f25900c, y.b());
                    if (a2.contains("loc")) {
                        w.a(nVar2, this.f25900c, "loc");
                    }
                    if (a2.contains("navi")) {
                        w.a(nVar2, this.f25900c, "navi");
                    }
                    if (a2.contains("sea")) {
                        w.a(nVar2, this.f25900c, "sea");
                    }
                    if (a2.contains("2dmap")) {
                        w.a(nVar2, this.f25900c, "2dmap");
                    }
                    if (a2.contains("3dmap")) {
                        w.a(nVar2, this.f25900c, "3dmap");
                    }
                } else {
                    if (a2.contains("com.autonavi.aps.amapapi.offline")) {
                        nVar = new n(this.f25900c, y.b());
                        context = this.f25900c;
                        str = "OfflineLocation";
                    } else if (a2.contains("com.data.carrier_v4")) {
                        nVar = new n(this.f25900c, y.b());
                        context = this.f25900c;
                        str = "Collection";
                    } else {
                        if (!a2.contains("com.autonavi.aps.amapapi.httpdns")) {
                            if (!a2.contains("com.autonavi.httpdns")) {
                                if (a2.contains("com.amap.api.aiunet")) {
                                    nVar = new n(this.f25900c, y.b());
                                    context = this.f25900c;
                                    str = "aiu";
                                }
                            }
                        }
                        nVar = new n(this.f25900c, y.b());
                        context = this.f25900c;
                        str = "HttpDNS";
                    }
                    w.a(nVar, context, str);
                }
            }
        } catch (Throwable th2) {
            f.a(th2, "DynamicExceptionHandler", "uncaughtException");
        }
        if (this.f25899b != null) {
            this.f25899b.uncaughtException(thread, th);
        }
    }
}
