package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import java.lang.Thread;

public class ef implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static ef f6017a;

    /* renamed from: b  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f6018b = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: c  reason: collision with root package name */
    private Context f6019c;

    /* renamed from: d  reason: collision with root package name */
    private cy f6020d;

    /* access modifiers changed from: package-private */
    public void a(Throwable th) {
        String a2 = cz.a(th);
        try {
            if (!TextUtils.isEmpty(a2)) {
                if ((a2.contains("amapdynamic") || a2.contains("admic")) && a2.contains("com.amap.api")) {
                    dm dmVar = new dm(this.f6019c, eg.c());
                    if (a2.contains("loc")) {
                        ee.a(dmVar, this.f6019c, "loc");
                    }
                    if (a2.contains("navi")) {
                        ee.a(dmVar, this.f6019c, "navi");
                    }
                    if (a2.contains("sea")) {
                        ee.a(dmVar, this.f6019c, "sea");
                    }
                    if (a2.contains("2dmap")) {
                        ee.a(dmVar, this.f6019c, "2dmap");
                    }
                    if (a2.contains("3dmap")) {
                        ee.a(dmVar, this.f6019c, "3dmap");
                    }
                }
                if (a2.contains("com.autonavi.aps.amapapi.offline")) {
                    ee.a(new dm(this.f6019c, eg.c()), this.f6019c, "OfflineLocation");
                } else if (a2.contains("com.data.carrier_v4")) {
                    ee.a(new dm(this.f6019c, eg.c()), this.f6019c, "Collection");
                } else if (a2.contains("com.autonavi.aps.amapapi.httpdns") || a2.contains("com.autonavi.httpdns")) {
                    ee.a(new dm(this.f6019c, eg.c()), this.f6019c, "HttpDNS");
                }
            }
        } catch (Throwable th2) {
            dd.a(th2, "DynamicExceptionHandler", "uncaughtException");
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        a(th);
        if (this.f6018b != null) {
            this.f6018b.uncaughtException(thread, th);
        }
    }

    private ef(Context context, cy cyVar) {
        this.f6019c = context.getApplicationContext();
        this.f6020d = cyVar;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    static synchronized ef a(Context context, cy cyVar) {
        ef efVar;
        synchronized (ef.class) {
            if (f6017a == null) {
                f6017a = new ef(context, cyVar);
            }
            efVar = f6017a;
        }
        return efVar;
    }
}
