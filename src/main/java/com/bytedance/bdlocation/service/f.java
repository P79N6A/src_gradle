package com.bytedance.bdlocation.service;

import android.content.Context;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.ss.b.a.a;
import java.util.concurrent.ExecutorService;

public final class f implements c {

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f19317d;

    /* renamed from: a  reason: collision with root package name */
    Context f19318a;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f19319b;

    /* renamed from: c  reason: collision with root package name */
    BDLocationClient f19320c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19321e = true;

    /* renamed from: f  reason: collision with root package name */
    private ExecutorService f19322f = h.a(m.a(p.FIXED).a(1).a());

    public static boolean c() {
        return f19317d;
    }

    public final long a() {
        return BDLocationConfig.getUploadInterval();
    }

    public final void b() {
        this.f19319b = false;
        if (!this.f19321e || BDLocationConfig.isReportAtStart()) {
            this.f19321e = false;
            this.f19322f.submit(new Runnable() {
                public final void run() {
                    f fVar = f.this;
                    if (!fVar.f19319b) {
                        try {
                            SystemBaseLocationImpl.getAndUploadLocation(fVar.f19320c.getLocation(), fVar.f19318a);
                        } catch (Exception e2) {
                            a.b("BDLocation_Upload", (Throwable) e2);
                        }
                    }
                }
            });
            return;
        }
        this.f19321e = false;
    }

    public static synchronized void a(boolean z) {
        synchronized (f.class) {
            f19317d = true;
        }
    }

    public f(Context context) {
        this.f19318a = context;
        this.f19320c = new BDLocationClient("BDLocation_Upload");
        this.f19320c.setLocationMode(2);
        this.f19320c.setMaxCacheTime(a());
    }
}
