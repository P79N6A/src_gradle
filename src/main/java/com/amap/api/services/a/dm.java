package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

public class dm {

    /* renamed from: a  reason: collision with root package name */
    static WeakReference<dk> f6829a;

    public static void a(final Context context) {
        ca.c().submit(new Runnable() {
            public final void run() {
                synchronized (dm.class) {
                    dk a2 = dq.a(dm.f6829a);
                    dq.a(context, a2, by.j, 50, 102400, "10");
                    if (a2.g == null) {
                        String b2 = dm.c(context);
                        dt dtVar = new dt(context, new dy(), new bq(new bu(new bs())), "WImFwcG5hbWUiOiIlcyIsInBrZyI6IiVzIiwiZGl1IjoiJXMi", bf.b(context), bf.c(context), b2);
                        a2.g = new du(dtVar);
                    }
                    a2.h = 14400000;
                    if (TextUtils.isEmpty(a2.i)) {
                        a2.i = by.a(context, "e.log");
                    }
                    if (a2.f6828f == null) {
                        a2.f6828f = new eb(a2.h, a2.i, new dz(5, a2.f6823a, new ed(context, false)));
                    }
                    dl.a(a2);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static String c(Context context) {
        String t = bj.t(context);
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        String h = bj.h(context);
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        String l = bj.l(context);
        if (!TextUtils.isEmpty(l)) {
            return l;
        }
        return bj.b(context);
    }
}
