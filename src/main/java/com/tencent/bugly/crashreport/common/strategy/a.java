package com.tencent.bugly.crashreport.common.strategy;

import android.content.Context;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.crashreport.biz.b;
import com.tencent.bugly.proguard.ap;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.r;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f79288a = 1000;

    /* renamed from: b  reason: collision with root package name */
    private static a f79289b;
    private static String h;

    /* renamed from: c  reason: collision with root package name */
    private final List<com.tencent.bugly.a> f79290c;

    /* renamed from: d  reason: collision with root package name */
    private final w f79291d;

    /* renamed from: e  reason: collision with root package name */
    private final StrategyBean f79292e = new StrategyBean();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public StrategyBean f79293f;
    /* access modifiers changed from: private */
    public Context g;

    static /* synthetic */ String e() {
        return null;
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            aVar = f79289b;
        }
        return aVar;
    }

    public final synchronized boolean b() {
        boolean z;
        if (this.f79293f != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final StrategyBean c() {
        if (this.f79293f != null) {
            return this.f79293f;
        }
        return this.f79292e;
    }

    public static StrategyBean d() {
        List<r> a2 = p.a().a(2);
        if (a2 != null && a2.size() > 0) {
            r rVar = a2.get(0);
            if (rVar.g != null) {
                return (StrategyBean) z.a(rVar.g, StrategyBean.CREATOR);
            }
        }
        return null;
    }

    public final void a(long j) {
        this.f79291d.a(new Thread() {
            public final void run() {
                try {
                    Map<String, byte[]> a2 = p.a().a(a.f79288a, (o) null, true);
                    if (a2 != null) {
                        byte[] bArr = a2.get("key_imei");
                        byte[] bArr2 = a2.get("key_ip");
                        if (bArr != null) {
                            com.tencent.bugly.crashreport.common.info.a.a(a.this.g).e(new String(bArr));
                        }
                        if (bArr2 != null) {
                            com.tencent.bugly.crashreport.common.info.a.a(a.this.g).d(new String(bArr2));
                        }
                    }
                    StrategyBean unused = a.this.f79293f = a.d();
                    if (a.this.f79293f != null && !z.a(a.e()) && z.c(a.e())) {
                        a.this.f79293f.r = a.e();
                        a.this.f79293f.s = a.e();
                    }
                } catch (Throwable th) {
                    x.a(th);
                }
                a.this.a(a.this.f79293f, false);
            }
        }, j);
    }

    public final void a(ap apVar) {
        if (apVar != null) {
            if (this.f79293f == null || apVar.h != this.f79293f.p) {
                StrategyBean strategyBean = new StrategyBean();
                strategyBean.g = apVar.f79440a;
                strategyBean.i = apVar.f79442c;
                strategyBean.h = apVar.f79441b;
                if (z.a((String) null) || !z.c((String) null)) {
                    if (z.c(apVar.f79443d)) {
                        x.c("[Strategy] Upload url changes to %s", apVar.f79443d);
                        strategyBean.r = apVar.f79443d;
                    }
                    if (z.c(apVar.f79444e)) {
                        x.c("[Strategy] Exception upload url changes to %s", apVar.f79444e);
                        strategyBean.s = apVar.f79444e;
                    }
                }
                if (apVar.f79445f != null && !z.a(apVar.f79445f.f79438a)) {
                    strategyBean.u = apVar.f79445f.f79438a;
                }
                if (apVar.h != 0) {
                    strategyBean.p = apVar.h;
                }
                if (apVar.g != null && apVar.g.size() > 0) {
                    strategyBean.v = apVar.g;
                    String str = apVar.g.get("B11");
                    if (str == null || !str.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                        strategyBean.j = false;
                    } else {
                        strategyBean.j = true;
                    }
                    String str2 = apVar.g.get("B3");
                    if (str2 != null) {
                        strategyBean.y = Long.valueOf(str2).longValue();
                    }
                    strategyBean.q = (long) apVar.i;
                    strategyBean.x = (long) apVar.i;
                    String str3 = apVar.g.get("B27");
                    if (str3 != null && str3.length() > 0) {
                        try {
                            int parseInt = Integer.parseInt(str3);
                            if (parseInt > 0) {
                                strategyBean.w = parseInt;
                            }
                        } catch (Exception e2) {
                            x.a(e2);
                        }
                    }
                    String str4 = apVar.g.get("B25");
                    if (str4 == null || !str4.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                        strategyBean.l = false;
                    } else {
                        strategyBean.l = true;
                    }
                }
                x.a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean.g), Boolean.valueOf(strategyBean.i), Boolean.valueOf(strategyBean.h), Boolean.valueOf(strategyBean.j), Boolean.valueOf(strategyBean.k), Boolean.valueOf(strategyBean.n), Boolean.valueOf(strategyBean.o), Long.valueOf(strategyBean.q), Boolean.valueOf(strategyBean.l), Long.valueOf(strategyBean.p));
                this.f79293f = strategyBean;
                p.a().b(2);
                r rVar = new r();
                rVar.f79509b = 2;
                rVar.f79508a = strategyBean.f79286e;
                rVar.f79512e = strategyBean.f79287f;
                rVar.g = z.a((Parcelable) strategyBean);
                p.a().a(rVar);
                a(strategyBean, true);
            }
        }
    }

    private a(Context context, List<com.tencent.bugly.a> list) {
        this.g = context;
        this.f79290c = list;
        this.f79291d = w.a();
    }

    public static synchronized a a(Context context, List<com.tencent.bugly.a> list) {
        a aVar;
        synchronized (a.class) {
            if (f79289b == null) {
                f79289b = new a(context, list);
            }
            aVar = f79289b;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public final void a(StrategyBean strategyBean, boolean z) {
        x.c("[Strategy] Notify %s", b.class.getName());
        b.a(strategyBean, z);
        for (com.tencent.bugly.a next : this.f79290c) {
            try {
                x.c("[Strategy] Notify %s", next.getClass().getName());
                next.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                x.a(th);
            }
        }
    }
}
