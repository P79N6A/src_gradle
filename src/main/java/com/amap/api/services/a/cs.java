package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import java.lang.Thread;

public class cs implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static cs f6746a;

    /* renamed from: b  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f6747b = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: c  reason: collision with root package name */
    private Context f6748c;

    /* renamed from: d  reason: collision with root package name */
    private bn f6749d;

    /* access modifiers changed from: package-private */
    public void a(Throwable th) {
        String a2 = bo.a(th);
        try {
            if (!TextUtils.isEmpty(a2)) {
                if ((a2.contains("amapdynamic") || a2.contains("admic")) && a2.contains("com.amap.api")) {
                    ce ceVar = new ce(this.f6748c, ct.c());
                    if (a2.contains("loc")) {
                        cq.a(ceVar, this.f6748c, "loc");
                    }
                    if (a2.contains("navi")) {
                        cq.a(ceVar, this.f6748c, "navi");
                    }
                    if (a2.contains("sea")) {
                        cq.a(ceVar, this.f6748c, "sea");
                    }
                    if (a2.contains("2dmap")) {
                        cq.a(ceVar, this.f6748c, "2dmap");
                    }
                    if (a2.contains("3dmap")) {
                        cq.a(ceVar, this.f6748c, "3dmap");
                    }
                }
                if (a2.contains("com.autonavi.aps.amapapi.offline")) {
                    cq.a(new ce(this.f6748c, ct.c()), this.f6748c, "OfflineLocation");
                } else if (a2.contains("com.data.carrier_v4")) {
                    cq.a(new ce(this.f6748c, ct.c()), this.f6748c, "Collection");
                } else if (a2.contains("com.autonavi.aps.amapapi.httpdns") || a2.contains("com.autonavi.httpdns")) {
                    cq.a(new ce(this.f6748c, ct.c()), this.f6748c, "HttpDNS");
                }
            }
        } catch (Throwable th2) {
            bx.a(th2, "DynamicExceptionHandler", "uncaughtException");
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        a(th);
        if (this.f6747b != null) {
            this.f6747b.uncaughtException(thread, th);
        }
    }

    private cs(Context context, bn bnVar) {
        this.f6748c = context.getApplicationContext();
        this.f6749d = bnVar;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    static synchronized cs a(Context context, bn bnVar) {
        cs csVar;
        synchronized (cs.class) {
            if (f6746a == null) {
                f6746a = new cs(context, bnVar);
            }
            csVar = f6746a;
        }
        return csVar;
    }
}
