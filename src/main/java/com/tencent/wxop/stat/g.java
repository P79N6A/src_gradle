package com.tencent.wxop.stat;

import android.content.Context;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.tencent.wxop.stat.a.b;
import com.tencent.wxop.stat.a.f;
import com.tencent.wxop.stat.a.n;
import com.tencent.wxop.stat.a.r;
import com.tencent.wxop.stat.b.c;
import com.tencent.wxop.stat.b.e;
import com.tencent.wxop.stat.b.h;
import java.lang.Thread;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Map<String, Properties> f79892a = new ConcurrentHashMap();
    /* access modifiers changed from: package-private */

    /* renamed from: b  reason: collision with root package name */
    public static volatile long f79893b = 0;
    /* access modifiers changed from: package-private */

    /* renamed from: c  reason: collision with root package name */
    public static Thread.UncaughtExceptionHandler f79894c = null;

    /* renamed from: d  reason: collision with root package name */
    static volatile int f79895d = 0;

    /* renamed from: e  reason: collision with root package name */
    static volatile long f79896e = 0;

    /* renamed from: f  reason: collision with root package name */
    static volatile long f79897f = 0;
    private static f g;
    private static volatile Map<c, Long> h = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public static volatile Map<Integer, Integer> i = new ConcurrentHashMap(10);
    private static volatile long j = 0;
    private static volatile long k = 0;
    private static String l = "";
    private static volatile int m = 0;
    private static volatile String n = "";
    private static volatile String o = "";
    private static Map<String, Long> p = new ConcurrentHashMap();
    private static Map<String, Long> q = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public static b r = n.c();
    private static volatile boolean s = true;
    /* access modifiers changed from: private */
    public static Context t = null;

    static void a(Context context) {
        if (d.c()) {
            Context d2 = d(context);
            if (d2 == null) {
                r.d("The Context of StatService.sendNetworkDetector() can not be null!");
                return;
            }
            try {
                aj.a(d2).a((e) new com.tencent.wxop.stat.b.f(d2), (ai) new ao());
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context, int i2) {
        if (d.c()) {
            if (d.b()) {
                r.a(new StringBuilder("commitEvents, maxNumber=-1").toString());
            }
            Context d2 = d(context);
            if (d2 == null) {
                r.d("The Context of StatService.commitEvents() can not be null!");
                return;
            }
            if (i.a(t).b() && f(d2) != null) {
                g.a(new j(d2, -1));
            }
        }
    }

    public static void a(Context context, String str, Properties properties, h hVar) {
        b bVar;
        String str2;
        if (d.c()) {
            Context d2 = d(context);
            if (d2 == null) {
                bVar = r;
                str2 = "The Context of StatService.trackCustomEvent() can not be null!";
            } else if (a(str)) {
                bVar = r;
                str2 = "The event_id of StatService.trackCustomEvent() can not be null or empty.";
            } else {
                c cVar = new c(str, null, properties);
                if (f(d2) != null) {
                    g.a(new ap(d2, null, cVar));
                }
                return;
            }
            bVar.d(str2);
        }
    }

    static void a(Context context, Throwable th) {
        if (d.c()) {
            Context d2 = d(context);
            if (d2 == null) {
                r.d("The Context of StatService.reportSdkSelfException() can not be null!");
                return;
            }
            if (f(d2) != null) {
                g.a(new an(d2, th));
            }
        }
    }

    static boolean a() {
        if (f79895d < 2) {
            return false;
        }
        f79896e = System.currentTimeMillis();
        return true;
    }

    private static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    static void b() {
        f79895d = 0;
        f79896e = 0;
    }

    static void c() {
        f79895d++;
        f79896e = System.currentTimeMillis();
        b(t);
    }

    static void c(Context context) {
        f79897f = System.currentTimeMillis() + ((long) (d.h() * 60000));
        r.b(context, "last_period_ts", f79897f);
        a(context, -1);
    }

    private static Context d(Context context) {
        return context != null ? context : t;
    }

    private static f f(Context context) {
        if (g == null) {
            synchronized (g.class) {
                if (g == null) {
                    try {
                        e(context);
                    } catch (Throwable unused) {
                        d.a(false);
                    }
                }
            }
        }
        return g;
    }

    private static JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (d.f79886c.f79843d != 0) {
                jSONObject2.put(NotifyType.VIBRATE, d.f79886c.f79843d);
            }
            jSONObject.put(Integer.toString(d.f79886c.f79840a), jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            if (d.f79885b.f79843d != 0) {
                jSONObject3.put(NotifyType.VIBRATE, d.f79885b.f79843d);
            }
            jSONObject.put(Integer.toString(d.f79885b.f79840a), jSONObject3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void e(android.content.Context r11) {
        /*
            java.lang.Class<com.tencent.wxop.stat.g> r0 = com.tencent.wxop.stat.g.class
            monitor-enter(r0)
            if (r11 != 0) goto L_0x0007
            monitor-exit(r0)
            return
        L_0x0007:
            com.tencent.wxop.stat.a.f r1 = g     // Catch:{ all -> 0x0099 }
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = com.tencent.wxop.stat.d.h     // Catch:{ all -> 0x0099 }
            r2 = 0
            long r4 = com.tencent.wxop.stat.a.r.a((android.content.Context) r11, (java.lang.String) r1, (long) r2)     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "2.0.4"
            long r6 = com.tencent.wxop.stat.a.n.b((java.lang.String) r1)     // Catch:{ all -> 0x0099 }
            r1 = 1
            r8 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x003b
            com.tencent.wxop.stat.a.b r1 = r     // Catch:{ all -> 0x0099 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            java.lang.String r10 = "MTA is disable for current version:"
            r9.<init>(r10)     // Catch:{ all -> 0x0099 }
            r9.append(r6)     // Catch:{ all -> 0x0099 }
            java.lang.String r6 = ",wakeup version:"
            r9.append(r6)     // Catch:{ all -> 0x0099 }
            r9.append(r4)     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x0099 }
            r1.d(r4)     // Catch:{ all -> 0x0099 }
            r1 = 0
        L_0x003b:
            java.lang.String r4 = com.tencent.wxop.stat.d.i     // Catch:{ all -> 0x0099 }
            long r2 = com.tencent.wxop.stat.a.r.a((android.content.Context) r11, (java.lang.String) r4, (long) r2)     // Catch:{ all -> 0x0099 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0099 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0069
            com.tencent.wxop.stat.a.b r1 = r     // Catch:{ all -> 0x0099 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "MTA is disable for current time:"
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0099 }
            r4.append(r5)     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = ",wakeup time:"
            r4.append(r5)     // Catch:{ all -> 0x0099 }
            r4.append(r2)     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0099 }
            r1.d(r2)     // Catch:{ all -> 0x0099 }
            r1 = 0
        L_0x0069:
            com.tencent.wxop.stat.d.a((boolean) r1)     // Catch:{ all -> 0x0099 }
            if (r1 != 0) goto L_0x0070
            monitor-exit(r0)
            return
        L_0x0070:
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x0099 }
            t = r11     // Catch:{ all -> 0x0099 }
            com.tencent.wxop.stat.a.f r1 = new com.tencent.wxop.stat.a.f     // Catch:{ all -> 0x0099 }
            r1.<init>()     // Catch:{ all -> 0x0099 }
            g = r1     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = com.tencent.wxop.stat.a.n.a((int) r8)     // Catch:{ all -> 0x0099 }
            l = r1     // Catch:{ all -> 0x0099 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0099 }
            long r3 = com.tencent.wxop.stat.d.p     // Catch:{ all -> 0x0099 }
            r5 = 0
            long r1 = r1 + r3
            f79893b = r1     // Catch:{ all -> 0x0099 }
            com.tencent.wxop.stat.a.f r1 = g     // Catch:{ all -> 0x0099 }
            com.tencent.wxop.stat.am r2 = new com.tencent.wxop.stat.am     // Catch:{ all -> 0x0099 }
            r2.<init>(r11)     // Catch:{ all -> 0x0099 }
            r1.a(r2)     // Catch:{ all -> 0x0099 }
        L_0x0097:
            monitor-exit(r0)
            return
        L_0x0099:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.g.e(android.content.Context):void");
    }

    private static void a(Context context, h hVar) {
        if (f(context) != null) {
            if (d.b()) {
                r.g("start new session.");
            }
            if (hVar == null || m == 0) {
                m = n.a().nextInt(Integer.MAX_VALUE);
            }
            d.a(0);
            d.v++;
            new p(new h(context, m, i(), hVar)).a();
        }
    }

    static int a(Context context, boolean z, h hVar) {
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        j = currentTimeMillis;
        if (k == 0) {
            k = n.d();
        }
        boolean z3 = true;
        if (currentTimeMillis >= k) {
            k = n.d();
            if (t.a(context).b(context).f79786c != 1) {
                t.a(context).b(context).f79786c = 1;
            }
            d.v = 0;
            f79895d = 0;
            l = n.a(0);
            z2 = true;
        } else {
            z2 = false;
        }
        String str = l;
        if (n.a(hVar)) {
            str = hVar.f79898a + l;
        }
        if (q.containsKey(str)) {
            z3 = z2;
        }
        if (z3) {
            if (n.a(hVar)) {
                a(context, hVar);
            } else if (d.v < d.u) {
                n.q(context);
                a(context, (h) null);
            } else {
                r.e("Exceed StatConfig.getMaxDaySessionNumbers().");
            }
            q.put(str, 1L);
        }
        if (s) {
            if (d.c()) {
                Context d2 = d(context);
                if (d2 == null) {
                    r.d("The Context of StatService.testSpeed() can not be null!");
                } else if (f(d2) != null) {
                    g.a(new k(d2));
                }
            }
            s = false;
        }
        return m;
    }

    public static boolean a(Context context, String str, String str2, h hVar) {
        try {
            if (!d.c()) {
                r.d("MTA StatService is disable.");
                return false;
            }
            if (d.b()) {
                r.g("MTA SDK version, current: " + "2.0.4" + " ,required: " + str2);
            }
            if (context != null) {
                if (str2 != null) {
                    if (n.b("2.0.4") < n.b(str2)) {
                        String str3 = "MTA SDK version conflicted, current: " + "2.0.4" + ",required: " + str2;
                        r.d(str3 + ". please delete the current SDK and download the latest one. official website: http://mta.qq.com/ or http://mta.oa.com/");
                        d.a(false);
                        return false;
                    }
                    String g2 = d.g();
                    if (g2 == null || g2.length() == 0) {
                        d.k = "-";
                    }
                    if (str != null) {
                        d.a(context, str);
                    }
                    if (f(context) != null) {
                        g.a(new m(context, null));
                    }
                    return true;
                }
            }
            r.d("Context or mtaSdkVersion in StatService.startStatService() is null, please check it!");
            d.a(false);
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(Context context) {
        if (d.c() && d.y > 0) {
            Context d2 = d(context);
            if (d2 == null) {
                r.d("The Context of StatService.testSpeed() can not be null!");
                return;
            }
            t a2 = t.a(d2);
            if (d.c()) {
                try {
                    a2.f79927a.a(new w(a2));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
