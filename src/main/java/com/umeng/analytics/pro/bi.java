package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.af;

public class bi implements az {
    private static bi l;

    /* renamed from: a  reason: collision with root package name */
    private final long f80443a = 1296000000;

    /* renamed from: b  reason: collision with root package name */
    private final long f80444b = 129600000;

    /* renamed from: c  reason: collision with root package name */
    private final int f80445c = 1800000;

    /* renamed from: d  reason: collision with root package name */
    private final int f80446d = 10000;

    /* renamed from: e  reason: collision with root package name */
    private cc f80447e;

    /* renamed from: f  reason: collision with root package name */
    private be f80448f;
    private long g = 1296000000;
    private int h = 10000;
    private long i;
    private long j;
    private Context k;

    public long b() {
        return this.i;
    }

    public long c() {
        return this.j;
    }

    public boolean a() {
        if (this.f80447e.h() || this.f80448f.f()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f80448f.m();
        if (currentTimeMillis > this.g) {
            this.i = (long) bt.a(this.h, aa.a(this.k));
            this.j = currentTimeMillis;
            return true;
        } else if (currentTimeMillis <= 129600000) {
            return false;
        } else {
            this.i = 0;
            this.j = currentTimeMillis;
            return true;
        }
    }

    public void a(af.a aVar) {
        this.g = aVar.a(1296000000);
        int b2 = aVar.b(0);
        if (b2 != 0) {
            this.h = b2;
        } else if (AnalyticsConfig.sLatentWindow <= 0 || AnalyticsConfig.sLatentWindow > 1800000) {
            this.h = 10000;
        } else {
            this.h = AnalyticsConfig.sLatentWindow;
        }
    }

    public static synchronized bi a(Context context, be beVar) {
        bi biVar;
        synchronized (bi.class) {
            if (l == null) {
                bi biVar2 = new bi(context, beVar);
                l = biVar2;
                biVar2.a(af.a(context).b());
            }
            biVar = l;
        }
        return biVar;
    }

    private bi(Context context, be beVar) {
        this.k = context;
        this.f80447e = cc.a(context);
        this.f80448f = beVar;
    }
}
