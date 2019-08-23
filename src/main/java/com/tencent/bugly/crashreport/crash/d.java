package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import com.taobao.android.dexposed.ClassUtils;
import com.tencent.bugly.crashreport.common.strategy.a;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.Map;

public final class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static d f79357a;

    /* renamed from: b  reason: collision with root package name */
    private a f79358b;

    /* renamed from: c  reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.info.a f79359c;

    /* renamed from: d  reason: collision with root package name */
    private b f79360d;

    /* renamed from: e  reason: collision with root package name */
    private Context f79361e;

    public static d a(Context context) {
        if (f79357a == null) {
            f79357a = new d(context);
        }
        return f79357a;
    }

    private d(Context context) {
        c a2 = c.a();
        if (a2 != null) {
            this.f79358b = a.a();
            this.f79359c = com.tencent.bugly.crashreport.common.info.a.a(context);
            this.f79360d = a2.o;
            this.f79361e = context;
            w.a().a(new Runnable() {
                public final void run() {
                    d.a(d.this);
                }
            });
        }
    }

    static /* synthetic */ void a(d dVar) {
        x.c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            String str = "com.tencent.bugly";
            dVar.f79359c.getClass();
            if (!"".equals("")) {
                str = str + ClassUtils.PACKAGE_SEPARATOR + "";
            }
            z.a(cls, "sdkPackageName", (Object) str, (Object) null);
            x.c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            x.a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    public static void a(Thread thread, int i, String str, String str2, String str3, Map<String, String> map) {
        w a2 = w.a();
        final Thread thread2 = thread;
        final int i2 = i;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final Map<String, String> map2 = map;
        AnonymousClass2 r1 = new Runnable() {
            public final void run() {
                try {
                    if (d.f79357a == null) {
                        x.e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                    } else {
                        d.a(d.f79357a, thread2, i2, str4, str5, str6, map2);
                    }
                } catch (Throwable th) {
                    x.b(th);
                    x.e("[ExtraCrashManager] Crash error %s %s %s", str4, str5, str6);
                }
            }
        };
        a2.a(r1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.tencent.bugly.crashreport.crash.d r9, java.lang.Thread r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.Map r15) {
        /*
            r0 = 1
            r1 = 0
            switch(r11) {
                case 4: goto L_0x0019;
                case 5: goto L_0x0016;
                case 6: goto L_0x0016;
                case 7: goto L_0x0005;
                case 8: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r9 = "[ExtraCrashManager] Unknown extra crash type: %d"
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r1] = r11
            com.tencent.bugly.proguard.x.d(r9, r10)
            return
        L_0x0013:
            java.lang.String r2 = "H5"
            goto L_0x001b
        L_0x0016:
            java.lang.String r2 = "Cocos"
            goto L_0x001b
        L_0x0019:
            java.lang.String r2 = "Unity"
        L_0x001b:
            r3 = r2
            java.lang.String r2 = "[ExtraCrashManager] %s Crash Happen"
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r3
            com.tencent.bugly.proguard.x.e(r2, r4)
            com.tencent.bugly.crashreport.common.strategy.a r2 = r9.f79358b     // Catch:{ Throwable -> 0x0231 }
            boolean r2 = r2.b()     // Catch:{ Throwable -> 0x0231 }
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = "waiting for remote sync"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.proguard.x.e(r2, r4)     // Catch:{ Throwable -> 0x0231 }
            r2 = 0
        L_0x0035:
            com.tencent.bugly.crashreport.common.strategy.a r4 = r9.f79358b     // Catch:{ Throwable -> 0x0231 }
            boolean r4 = r4.b()     // Catch:{ Throwable -> 0x0231 }
            if (r4 != 0) goto L_0x0048
            r4 = 500(0x1f4, double:2.47E-321)
            com.tencent.bugly.proguard.z.b((long) r4)     // Catch:{ Throwable -> 0x0231 }
            int r2 = r2 + 500
            r4 = 3000(0xbb8, float:4.204E-42)
            if (r2 < r4) goto L_0x0035
        L_0x0048:
            com.tencent.bugly.crashreport.common.strategy.a r2 = r9.f79358b     // Catch:{ Throwable -> 0x0231 }
            boolean r2 = r2.b()     // Catch:{ Throwable -> 0x0231 }
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = "[ExtraCrashManager] There is no remote strategy, but still store it."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.proguard.x.d(r2, r4)     // Catch:{ Throwable -> 0x0231 }
        L_0x0057:
            com.tencent.bugly.crashreport.common.strategy.a r2 = r9.f79358b     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r2 = r2.c()     // Catch:{ Throwable -> 0x0231 }
            boolean r4 = r2.g     // Catch:{ Throwable -> 0x0231 }
            if (r4 != 0) goto L_0x00a1
            com.tencent.bugly.crashreport.common.strategy.a r4 = r9.f79358b     // Catch:{ Throwable -> 0x0231 }
            boolean r4 = r4.b()     // Catch:{ Throwable -> 0x0231 }
            if (r4 == 0) goto L_0x00a1
            java.lang.String r11 = "[ExtraCrashManager] Crash report was closed by remote , will not upload to Bugly , print local for helpful!"
            java.lang.Object[] r15 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.proguard.x.e(r11, r15)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r4 = com.tencent.bugly.proguard.z.a()     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r9 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r5 = r9.f79277d     // Catch:{ Throwable -> 0x0231 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0231 }
            r9.<init>()     // Catch:{ Throwable -> 0x0231 }
            r9.append(r12)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = "\n"
            r9.append(r11)     // Catch:{ Throwable -> 0x0231 }
            r9.append(r13)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = "\n"
            r9.append(r11)     // Catch:{ Throwable -> 0x0231 }
            r9.append(r14)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r7 = r9.toString()     // Catch:{ Throwable -> 0x0231 }
            r8 = 0
            r6 = r10
            com.tencent.bugly.crashreport.crash.b.a(r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r9 = "[ExtraCrashManager] Successfully handled."
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            return
        L_0x00a1:
            switch(r11) {
                case 4: goto L_0x00cf;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00ba;
                case 7: goto L_0x00a4;
                case 8: goto L_0x00a5;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x00cf
        L_0x00a5:
            boolean r2 = r2.m     // Catch:{ Throwable -> 0x0231 }
            if (r2 != 0) goto L_0x00cf
            java.lang.String r9 = "[ExtraCrashManager] %s report is disabled."
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0231 }
            r10[r1] = r3     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.proguard.x.e(r9, r10)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r9 = "[ExtraCrashManager] Successfully handled."
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            return
        L_0x00ba:
            boolean r2 = r2.l     // Catch:{ Throwable -> 0x0231 }
            if (r2 != 0) goto L_0x00cf
            java.lang.String r9 = "[ExtraCrashManager] %s report is disabled."
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0231 }
            r10[r1] = r3     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.proguard.x.e(r9, r10)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r9 = "[ExtraCrashManager] Successfully handled."
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            return
        L_0x00cf:
            r0 = 8
            if (r11 != r0) goto L_0x00d4
            r11 = 5
        L_0x00d4:
            com.tencent.bugly.crashreport.crash.CrashDetailBean r0 = new com.tencent.bugly.crashreport.crash.CrashDetailBean     // Catch:{ Throwable -> 0x0231 }
            r0.<init>()     // Catch:{ Throwable -> 0x0231 }
            long r4 = com.tencent.bugly.crashreport.common.info.b.h()     // Catch:{ Throwable -> 0x0231 }
            r0.B = r4     // Catch:{ Throwable -> 0x0231 }
            long r4 = com.tencent.bugly.crashreport.common.info.b.f()     // Catch:{ Throwable -> 0x0231 }
            r0.C = r4     // Catch:{ Throwable -> 0x0231 }
            long r4 = com.tencent.bugly.crashreport.common.info.b.j()     // Catch:{ Throwable -> 0x0231 }
            r0.D = r4     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r2 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            long r4 = r2.p()     // Catch:{ Throwable -> 0x0231 }
            r0.E = r4     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r2 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            long r4 = r2.o()     // Catch:{ Throwable -> 0x0231 }
            r0.F = r4     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r2 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            long r4 = r2.q()     // Catch:{ Throwable -> 0x0231 }
            r0.G = r4     // Catch:{ Throwable -> 0x0231 }
            android.content.Context r2 = r9.f79361e     // Catch:{ Throwable -> 0x0231 }
            int r4 = com.tencent.bugly.crashreport.crash.c.f79348e     // Catch:{ Throwable -> 0x0231 }
            r5 = 0
            java.lang.String r2 = com.tencent.bugly.proguard.z.a((android.content.Context) r2, (int) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0231 }
            r0.w = r2     // Catch:{ Throwable -> 0x0231 }
            r0.f79303b = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = r11.h()     // Catch:{ Throwable -> 0x0231 }
            r0.f79306e = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = r11.j     // Catch:{ Throwable -> 0x0231 }
            r0.f79307f = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = r11.w()     // Catch:{ Throwable -> 0x0231 }
            r0.g = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = r11.g()     // Catch:{ Throwable -> 0x0231 }
            r0.m = r11     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x0231 }
            r0.n = r11     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch:{ Throwable -> 0x0231 }
            r0.o = r11     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = ""
            if (r14 == 0) goto L_0x014b
            java.lang.String r2 = "\n"
            java.lang.String[] r2 = r14.split(r2)     // Catch:{ Throwable -> 0x0231 }
            int r4 = r2.length     // Catch:{ Throwable -> 0x0231 }
            if (r4 <= 0) goto L_0x0149
            r11 = r2[r1]     // Catch:{ Throwable -> 0x0231 }
        L_0x0149:
            r2 = r14
            goto L_0x014d
        L_0x014b:
            java.lang.String r2 = ""
        L_0x014d:
            r0.p = r11     // Catch:{ Throwable -> 0x0231 }
            r0.q = r2     // Catch:{ Throwable -> 0x0231 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0231 }
            r0.r = r4     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = r0.q     // Catch:{ Throwable -> 0x0231 }
            byte[] r11 = r11.getBytes()     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = com.tencent.bugly.proguard.z.b((byte[]) r11)     // Catch:{ Throwable -> 0x0231 }
            r0.u = r11     // Catch:{ Throwable -> 0x0231 }
            int r11 = com.tencent.bugly.crashreport.crash.c.f79349f     // Catch:{ Throwable -> 0x0231 }
            java.util.Map r11 = com.tencent.bugly.proguard.z.a((int) r11, (boolean) r1)     // Catch:{ Throwable -> 0x0231 }
            r0.y = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = r11.f79277d     // Catch:{ Throwable -> 0x0231 }
            r0.z = r11     // Catch:{ Throwable -> 0x0231 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0231 }
            r11.<init>()     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r2 = r10.getName()     // Catch:{ Throwable -> 0x0231 }
            r11.append(r2)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r2 = "("
            r11.append(r2)     // Catch:{ Throwable -> 0x0231 }
            long r4 = r10.getId()     // Catch:{ Throwable -> 0x0231 }
            r11.append(r4)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r2 = ")"
            r11.append(r2)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0231 }
            r0.A = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r11 = r11.y()     // Catch:{ Throwable -> 0x0231 }
            r0.H = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.util.Map r11 = r11.v()     // Catch:{ Throwable -> 0x0231 }
            r0.h = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            long r4 = r11.f79274a     // Catch:{ Throwable -> 0x0231 }
            r0.L = r4     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            boolean r11 = r11.a()     // Catch:{ Throwable -> 0x0231 }
            r0.M = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            int r11 = r11.H()     // Catch:{ Throwable -> 0x0231 }
            r0.O = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            int r11 = r11.I()     // Catch:{ Throwable -> 0x0231 }
            r0.P = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.util.Map r11 = r11.B()     // Catch:{ Throwable -> 0x0231 }
            r0.Q = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.util.Map r11 = r11.G()     // Catch:{ Throwable -> 0x0231 }
            r0.R = r11     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.crash.b r11 = r9.f79360d     // Catch:{ Throwable -> 0x0231 }
            r11.c((com.tencent.bugly.crashreport.crash.CrashDetailBean) r0)     // Catch:{ Throwable -> 0x0231 }
            byte[] r11 = com.tencent.bugly.proguard.y.a()     // Catch:{ Throwable -> 0x0231 }
            r0.x = r11     // Catch:{ Throwable -> 0x0231 }
            java.util.Map<java.lang.String, java.lang.String> r11 = r0.N     // Catch:{ Throwable -> 0x0231 }
            if (r11 != 0) goto L_0x01e8
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0231 }
            r11.<init>()     // Catch:{ Throwable -> 0x0231 }
            r0.N = r11     // Catch:{ Throwable -> 0x0231 }
        L_0x01e8:
            if (r15 == 0) goto L_0x01ef
            java.util.Map<java.lang.String, java.lang.String> r11 = r0.N     // Catch:{ Throwable -> 0x0231 }
            r11.putAll(r15)     // Catch:{ Throwable -> 0x0231 }
        L_0x01ef:
            java.lang.String r4 = com.tencent.bugly.proguard.z.a()     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.common.info.a r11 = r9.f79359c     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r5 = r11.f79277d     // Catch:{ Throwable -> 0x0231 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0231 }
            r11.<init>()     // Catch:{ Throwable -> 0x0231 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r12 = "\n"
            r11.append(r12)     // Catch:{ Throwable -> 0x0231 }
            r11.append(r13)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r12 = "\n"
            r11.append(r12)     // Catch:{ Throwable -> 0x0231 }
            r11.append(r14)     // Catch:{ Throwable -> 0x0231 }
            java.lang.String r7 = r11.toString()     // Catch:{ Throwable -> 0x0231 }
            r6 = r10
            r8 = r0
            com.tencent.bugly.crashreport.crash.b.a(r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0231 }
            com.tencent.bugly.crashreport.crash.b r10 = r9.f79360d     // Catch:{ Throwable -> 0x0231 }
            boolean r10 = r10.a((com.tencent.bugly.crashreport.crash.CrashDetailBean) r0)     // Catch:{ Throwable -> 0x0231 }
            if (r10 != 0) goto L_0x0227
            com.tencent.bugly.crashreport.crash.b r9 = r9.f79360d     // Catch:{ Throwable -> 0x0231 }
            r10 = 3000(0xbb8, double:1.482E-320)
            r9.a((com.tencent.bugly.crashreport.crash.CrashDetailBean) r0, (long) r10, (boolean) r1)     // Catch:{ Throwable -> 0x0231 }
        L_0x0227:
            java.lang.String r9 = "[ExtraCrashManager] Successfully handled."
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            return
        L_0x022f:
            r9 = move-exception
            goto L_0x023d
        L_0x0231:
            r9 = move-exception
            com.tencent.bugly.proguard.x.a(r9)     // Catch:{ all -> 0x022f }
            java.lang.String r9 = "[ExtraCrashManager] Successfully handled."
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            return
        L_0x023d:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "[ExtraCrashManager] Successfully handled."
            com.tencent.bugly.proguard.x.e(r11, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.d.a(com.tencent.bugly.crashreport.crash.d, java.lang.Thread, int, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }
}
