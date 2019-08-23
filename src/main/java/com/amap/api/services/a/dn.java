package com.amap.api.services.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

public class dn {

    /* renamed from: a  reason: collision with root package name */
    static int f6831a = 1000;

    /* renamed from: b  reason: collision with root package name */
    static boolean f6832b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static WeakReference<dk> f6833c;

    public static void a(final Context context) {
        ca.c().submit(new Runnable() {
            public final void run() {
                try {
                    dk a2 = dq.a(dn.f6833c);
                    dq.a(context, a2, by.i, dn.f6831a, 2097152, "6");
                    a2.h = 14400000;
                    if (a2.g == null) {
                        bq bqVar = new bq(new bs(new bu()));
                        dt dtVar = new dt(context, new dy(), bqVar, new String(bv.a(10)), bf.f(context), bj.t(context), bj.l(context), bj.h(context), bj.a(), Build.MANUFACTURER, Build.DEVICE, bj.u(context), bf.c(context), Build.MODEL, bf.d(context), bf.b(context));
                        a2.g = new du(dtVar);
                    }
                    if (TextUtils.isEmpty(a2.i)) {
                        a2.i = by.a(context, "f.log");
                    }
                    if (a2.f6828f == null) {
                        a2.f6828f = new eb(a2.h, a2.i, new ed(context, dn.f6832b));
                    }
                    dl.a(a2);
                } catch (Throwable th) {
                    ca.c(th, "ofm", "uold");
                }
            }
        });
    }
}
