package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.tencent.bugly.crashreport.common.info.b;
import com.tencent.bugly.crashreport.common.strategy.a;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.lang.Thread;
import java.util.HashMap;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class e implements Thread.UncaughtExceptionHandler {
    private static String h;
    private static final Object i = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f79369a;

    /* renamed from: b  reason: collision with root package name */
    private b f79370b;

    /* renamed from: c  reason: collision with root package name */
    private a f79371c;

    /* renamed from: d  reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.info.a f79372d;

    /* renamed from: e  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f79373e;

    /* renamed from: f  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f79374f;
    private boolean g;
    private int j;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(int i) {
            String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                System.exit(i);
                return;
            }
            throw new RuntimeException("Process killed, status is " + i);
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(int i) {
            String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                Process.killProcess(i);
                return;
            }
            throw new RuntimeException("Process killed, pid is " + i);
        }
    }

    public final synchronized void b() {
        this.g = false;
        x.a("close java monitor!", new Object[0]);
        if (Thread.getDefaultUncaughtExceptionHandler().getClass().getName().contains("bugly")) {
            x.a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f79373e);
            this.j--;
        }
    }

    public final synchronized void a() {
        if (this.j >= 10) {
            x.a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (!getClass().getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                    x.a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                    this.f79374f = defaultUncaughtExceptionHandler;
                    this.f79373e = defaultUncaughtExceptionHandler;
                } else {
                    x.a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                    this.f79373e = defaultUncaughtExceptionHandler;
                }
            } else {
                return;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.j++;
        x.a("registered java monitor: %s", toString());
    }

    private static boolean a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            return true;
        }
        String name = uncaughtExceptionHandler.getClass().getName();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (name.equals(className) && "uncaughtException".equals(methodName)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Thread thread) {
        synchronized (i) {
            if (h != null && thread.getName().equals(h)) {
                return true;
            }
            h = thread.getName();
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.tencent.bugly.crashreport.common.strategy.StrategyBean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x002a
            boolean r0 = r5.g     // Catch:{ all -> 0x0027 }
            boolean r1 = r4.g     // Catch:{ all -> 0x0027 }
            if (r0 == r1) goto L_0x002a
            java.lang.String r0 = "java changed to %b"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0027 }
            r2 = 0
            boolean r3 = r5.g     // Catch:{ all -> 0x0027 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0027 }
            r1[r2] = r3     // Catch:{ all -> 0x0027 }
            com.tencent.bugly.proguard.x.a(r0, r1)     // Catch:{ all -> 0x0027 }
            boolean r5 = r5.g     // Catch:{ all -> 0x0027 }
            if (r5 == 0) goto L_0x0023
            r4.a()     // Catch:{ all -> 0x0027 }
            monitor-exit(r4)
            return
        L_0x0023:
            r4.b()     // Catch:{ all -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x002a:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.e.a(com.tencent.bugly.crashreport.common.strategy.StrategyBean):void");
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (i) {
            a(thread, th, true, null, null);
        }
    }

    private static String b(Throwable th, int i2) {
        if (th.getMessage() == null) {
            return "";
        }
        if (th.getMessage().length() <= 1000) {
            return th.getMessage();
        }
        return th.getMessage().substring(0, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) + "\n[Message over limit size:1000, has been cutted!]";
    }

    private static String a(Throwable th, int i2) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                int i3 = 0;
                while (i3 < length) {
                    StackTraceElement stackTraceElement = stackTrace[i3];
                    if (i2 <= 0 || sb.length() < i2) {
                        sb.append(stackTraceElement.toString());
                        sb.append("\n");
                        i3++;
                    } else {
                        sb.append("\n[Stack over limit size :" + i2 + " , has been cutted !]");
                        return sb.toString();
                    }
                }
            }
        } catch (Throwable th2) {
            x.e("gen stack error %s", th2.toString());
        }
        return sb.toString();
    }

    public e(Context context, b bVar, a aVar, com.tencent.bugly.crashreport.common.info.a aVar2) {
        this.f79369a = context;
        this.f79370b = bVar;
        this.f79371c = aVar;
        this.f79372d = aVar2;
    }

    private CrashDetailBean b(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
        String str2;
        int i2;
        int i3;
        boolean z2;
        String str3;
        boolean z3;
        boolean z4 = false;
        if (th == null) {
            x.d("We can do nothing with a null throwable.", new Object[0]);
            return null;
        }
        boolean l = c.a().l();
        if (!l || !z) {
            str2 = "";
        } else {
            str2 = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
        }
        if (l && z) {
            x.e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.B = b.h();
        crashDetailBean.C = b.f();
        crashDetailBean.D = b.j();
        crashDetailBean.E = this.f79372d.p();
        crashDetailBean.F = this.f79372d.o();
        crashDetailBean.G = this.f79372d.q();
        crashDetailBean.w = z.a(this.f79369a, c.f79348e, (String) null);
        crashDetailBean.x = y.a();
        Object[] objArr = new Object[1];
        if (crashDetailBean.x == null) {
            i2 = 0;
        } else {
            i2 = crashDetailBean.x.length;
        }
        objArr[0] = Integer.valueOf(i2);
        x.a("user log size:%d", objArr);
        if (z) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        crashDetailBean.f79303b = i3;
        crashDetailBean.f79306e = this.f79372d.h();
        crashDetailBean.f79307f = this.f79372d.j;
        crashDetailBean.g = this.f79372d.w();
        crashDetailBean.m = this.f79372d.g();
        String name = th.getClass().getName();
        String b2 = b(th, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        if (b2 == null) {
            b2 = "";
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(th.getStackTrace().length);
        if (th.getCause() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        objArr2[1] = Boolean.valueOf(z2);
        x.e("stack frame :%d, has cause %b", objArr2);
        String str4 = "";
        if (th.getStackTrace().length > 0) {
            str4 = th.getStackTrace()[0].toString();
        }
        Throwable th2 = th;
        while (th2 != null && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (th2 == null || th2 == th) {
            crashDetailBean.n = name;
            crashDetailBean.o = b2 + str2;
            if (crashDetailBean.o == null) {
                crashDetailBean.o = "";
            }
            crashDetailBean.p = str4;
            str3 = a(th, c.f79349f);
            crashDetailBean.q = str3;
        } else {
            crashDetailBean.n = th2.getClass().getName();
            crashDetailBean.o = b(th2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            if (crashDetailBean.o == null) {
                crashDetailBean.o = "";
            }
            if (th2.getStackTrace().length > 0) {
                crashDetailBean.p = th2.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(":");
            sb.append(b2);
            sb.append("\n");
            sb.append(str4);
            sb.append("\n......");
            sb.append("\nCaused by:\n");
            sb.append(crashDetailBean.n);
            sb.append(":");
            sb.append(crashDetailBean.o);
            sb.append("\n");
            str3 = a(th2, c.f79349f);
            sb.append(str3);
            crashDetailBean.q = sb.toString();
        }
        crashDetailBean.r = System.currentTimeMillis();
        crashDetailBean.u = z.b(crashDetailBean.q.getBytes());
        try {
            crashDetailBean.y = z.a(c.f79349f, false);
            crashDetailBean.z = this.f79372d.f79277d;
            crashDetailBean.A = thread.getName() + "(" + thread.getId() + ")";
            crashDetailBean.y.put(crashDetailBean.A, str3);
            crashDetailBean.H = this.f79372d.y();
            crashDetailBean.h = this.f79372d.v();
            crashDetailBean.i = this.f79372d.K();
            crashDetailBean.L = this.f79372d.f79274a;
            crashDetailBean.M = this.f79372d.a();
            crashDetailBean.O = this.f79372d.H();
            crashDetailBean.P = this.f79372d.I();
            crashDetailBean.Q = this.f79372d.B();
            crashDetailBean.R = this.f79372d.G();
        } catch (Throwable th3) {
            x.e("handle crash error %s", th3.toString());
        }
        if (z) {
            this.f79370b.c(crashDetailBean);
        } else {
            if (str == null || str.length() <= 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (bArr != null && bArr.length > 0) {
                z4 = true;
            }
            if (z3) {
                crashDetailBean.N = new HashMap(1);
                crashDetailBean.N.put("UserData", str);
            }
            if (z4) {
                crashDetailBean.S = bArr;
            }
        }
        return crashDetailBean;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d4, code lost:
        if (r8.f79374f != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d8, code lost:
        com.tencent.bugly.proguard.x.e("crashreport last handle start!", new java.lang.Object[0]);
        com.tencent.bugly.proguard.x.e("current process die", new java.lang.Object[0]);
        com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(android.os.Process.myPid());
        com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(1);
        com.tencent.bugly.proguard.x.e("crashreport last handle end!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0210, code lost:
        if (r8.f79374f != null) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Thread r9, java.lang.Throwable r10, boolean r11, java.lang.String r12, byte[] r13) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x004c
            java.lang.String r2 = "Java Crash Happen cause by %s(%d)"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r9.getName()
            r3[r1] = r4
            long r4 = r9.getId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r0] = r4
            com.tencent.bugly.proguard.x.e(r2, r3)
            boolean r2 = a((java.lang.Thread) r9)
            if (r2 == 0) goto L_0x0053
            java.lang.String r2 = "this class has handled this exception"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.a(r2, r3)
            java.lang.Thread$UncaughtExceptionHandler r2 = r8.f79374f
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = "call system handler"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.a(r2, r3)
            java.lang.Thread$UncaughtExceptionHandler r2 = r8.f79374f
            r2.uncaughtException(r9, r10)
            goto L_0x0053
        L_0x003a:
            java.lang.String r2 = "current process die"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r2, r3)
            int r2 = android.os.Process.myPid()
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(r2)
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(r0)
            goto L_0x0053
        L_0x004c:
            java.lang.String r2 = "Java Catch Happen"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r2, r3)
        L_0x0053:
            boolean r2 = r8.g     // Catch:{ Throwable -> 0x01fa }
            if (r2 != 0) goto L_0x00b8
            java.lang.String r12 = "Java crash handler is disable. Just return."
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x01fa }
            com.tencent.bugly.proguard.x.c(r12, r13)     // Catch:{ Throwable -> 0x01fa }
            if (r11 == 0) goto L_0x00b7
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            if (r11 == 0) goto L_0x0080
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            boolean r11 = a((java.lang.Thread.UncaughtExceptionHandler) r11)
            if (r11 == 0) goto L_0x0080
        L_0x006c:
            java.lang.String r11 = "sys default last handle start!"
            java.lang.Object[] r12 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r11, r12)
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            r11.uncaughtException(r9, r10)
            java.lang.String r9 = "sys default last handle end!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            return
        L_0x0080:
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79374f
            if (r11 == 0) goto L_0x0098
        L_0x0084:
            java.lang.String r11 = "system handle start!"
            java.lang.Object[] r12 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r11, r12)
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79374f
            r11.uncaughtException(r9, r10)
            java.lang.String r9 = "system handle end!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            return
        L_0x0098:
            java.lang.String r9 = "crashreport last handle start!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            java.lang.String r9 = "current process die"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            int r9 = android.os.Process.myPid()
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(r9)
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(r0)
            java.lang.String r9 = "crashreport last handle end!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
        L_0x00b7:
            return
        L_0x00b8:
            com.tencent.bugly.crashreport.common.strategy.a r2 = r8.f79371c     // Catch:{ Throwable -> 0x01fa }
            boolean r2 = r2.b()     // Catch:{ Throwable -> 0x01fa }
            if (r2 != 0) goto L_0x00db
            java.lang.String r2 = "waiting for remote sync"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x01fa }
            com.tencent.bugly.proguard.x.e(r2, r3)     // Catch:{ Throwable -> 0x01fa }
            r2 = 0
        L_0x00c8:
            com.tencent.bugly.crashreport.common.strategy.a r3 = r8.f79371c     // Catch:{ Throwable -> 0x01fa }
            boolean r3 = r3.b()     // Catch:{ Throwable -> 0x01fa }
            if (r3 != 0) goto L_0x00db
            r3 = 500(0x1f4, double:2.47E-321)
            com.tencent.bugly.proguard.z.b((long) r3)     // Catch:{ Throwable -> 0x01fa }
            int r2 = r2 + 500
            r3 = 3000(0xbb8, float:4.204E-42)
            if (r2 < r3) goto L_0x00c8
        L_0x00db:
            com.tencent.bugly.crashreport.common.strategy.a r2 = r8.f79371c     // Catch:{ Throwable -> 0x01fa }
            boolean r2 = r2.b()     // Catch:{ Throwable -> 0x01fa }
            if (r2 != 0) goto L_0x00ea
            java.lang.String r2 = "no remote but still store!"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x01fa }
            com.tencent.bugly.proguard.x.d(r2, r3)     // Catch:{ Throwable -> 0x01fa }
        L_0x00ea:
            com.tencent.bugly.crashreport.common.strategy.a r2 = r8.f79371c     // Catch:{ Throwable -> 0x01fa }
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r2 = r2.c()     // Catch:{ Throwable -> 0x01fa }
            boolean r2 = r2.g     // Catch:{ Throwable -> 0x01fa }
            if (r2 != 0) goto L_0x0152
            com.tencent.bugly.crashreport.common.strategy.a r2 = r8.f79371c     // Catch:{ Throwable -> 0x01fa }
            boolean r2 = r2.b()     // Catch:{ Throwable -> 0x01fa }
            if (r2 == 0) goto L_0x0152
            java.lang.String r12 = "crash report was closed by remote , will not upload to Bugly , print local for helpful!"
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x01fa }
            com.tencent.bugly.proguard.x.e(r12, r13)     // Catch:{ Throwable -> 0x01fa }
            if (r11 == 0) goto L_0x0108
            java.lang.String r12 = "JAVA_CRASH"
            goto L_0x010a
        L_0x0108:
            java.lang.String r12 = "JAVA_CATCH"
        L_0x010a:
            r2 = r12
            java.lang.String r3 = com.tencent.bugly.proguard.z.a()     // Catch:{ Throwable -> 0x01fa }
            com.tencent.bugly.crashreport.common.info.a r12 = r8.f79372d     // Catch:{ Throwable -> 0x01fa }
            java.lang.String r4 = r12.f79277d     // Catch:{ Throwable -> 0x01fa }
            java.lang.String r6 = com.tencent.bugly.proguard.z.a((java.lang.Throwable) r10)     // Catch:{ Throwable -> 0x01fa }
            r7 = 0
            r5 = r9
            com.tencent.bugly.crashreport.crash.b.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x01fa }
            if (r11 == 0) goto L_0x0151
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            if (r11 == 0) goto L_0x012c
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            boolean r11 = a((java.lang.Thread.UncaughtExceptionHandler) r11)
            if (r11 == 0) goto L_0x012c
            goto L_0x006c
        L_0x012c:
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79374f
            if (r11 == 0) goto L_0x0132
            goto L_0x0084
        L_0x0132:
            java.lang.String r9 = "crashreport last handle start!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            java.lang.String r9 = "current process die"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            int r9 = android.os.Process.myPid()
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(r9)
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(r0)
            java.lang.String r9 = "crashreport last handle end!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
        L_0x0151:
            return
        L_0x0152:
            com.tencent.bugly.crashreport.crash.CrashDetailBean r12 = r8.b(r9, r10, r11, r12, r13)     // Catch:{ Throwable -> 0x01fa }
            if (r12 != 0) goto L_0x0195
            java.lang.String r12 = "pkg crash datas fail!"
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x01fa }
            com.tencent.bugly.proguard.x.e(r12, r13)     // Catch:{ Throwable -> 0x01fa }
            if (r11 == 0) goto L_0x0194
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            if (r11 == 0) goto L_0x016f
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            boolean r11 = a((java.lang.Thread.UncaughtExceptionHandler) r11)
            if (r11 == 0) goto L_0x016f
            goto L_0x006c
        L_0x016f:
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79374f
            if (r11 == 0) goto L_0x0175
            goto L_0x0084
        L_0x0175:
            java.lang.String r9 = "crashreport last handle start!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            java.lang.String r9 = "current process die"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            int r9 = android.os.Process.myPid()
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(r9)
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(r0)
            java.lang.String r9 = "crashreport last handle end!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
        L_0x0194:
            return
        L_0x0195:
            if (r11 == 0) goto L_0x019a
            java.lang.String r13 = "JAVA_CRASH"
            goto L_0x019c
        L_0x019a:
            java.lang.String r13 = "JAVA_CATCH"
        L_0x019c:
            r2 = r13
            java.lang.String r3 = com.tencent.bugly.proguard.z.a()     // Catch:{ Throwable -> 0x01fa }
            com.tencent.bugly.crashreport.common.info.a r13 = r8.f79372d     // Catch:{ Throwable -> 0x01fa }
            java.lang.String r4 = r13.f79277d     // Catch:{ Throwable -> 0x01fa }
            java.lang.String r6 = com.tencent.bugly.proguard.z.a((java.lang.Throwable) r10)     // Catch:{ Throwable -> 0x01fa }
            r5 = r9
            r7 = r12
            com.tencent.bugly.crashreport.crash.b.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x01fa }
            com.tencent.bugly.crashreport.crash.b r13 = r8.f79370b     // Catch:{ Throwable -> 0x01fa }
            boolean r13 = r13.a((com.tencent.bugly.crashreport.crash.CrashDetailBean) r12)     // Catch:{ Throwable -> 0x01fa }
            if (r13 != 0) goto L_0x01bd
            com.tencent.bugly.crashreport.crash.b r13 = r8.f79370b     // Catch:{ Throwable -> 0x01fa }
            r2 = 3000(0xbb8, double:1.482E-320)
            r13.a((com.tencent.bugly.crashreport.crash.CrashDetailBean) r12, (long) r2, (boolean) r11)     // Catch:{ Throwable -> 0x01fa }
        L_0x01bd:
            com.tencent.bugly.crashreport.crash.b r13 = r8.f79370b     // Catch:{ Throwable -> 0x01fa }
            r13.b((com.tencent.bugly.crashreport.crash.CrashDetailBean) r12)     // Catch:{ Throwable -> 0x01fa }
            if (r11 == 0) goto L_0x0214
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            if (r11 == 0) goto L_0x01d2
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            boolean r11 = a((java.lang.Thread.UncaughtExceptionHandler) r11)
            if (r11 == 0) goto L_0x01d2
            goto L_0x006c
        L_0x01d2:
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79374f
            if (r11 == 0) goto L_0x01d8
            goto L_0x0084
        L_0x01d8:
            java.lang.String r9 = "crashreport last handle start!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            java.lang.String r9 = "current process die"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            int r9 = android.os.Process.myPid()
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(r9)
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(r0)
            java.lang.String r9 = "crashreport last handle end!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.e(r9, r10)
            return
        L_0x01f8:
            r12 = move-exception
            goto L_0x0215
        L_0x01fa:
            r12 = move-exception
            com.tencent.bugly.proguard.x.a(r12)     // Catch:{ all -> 0x01f8 }
            if (r11 == 0) goto L_0x0214
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            if (r11 == 0) goto L_0x020e
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            boolean r11 = a((java.lang.Thread.UncaughtExceptionHandler) r11)
            if (r11 == 0) goto L_0x020e
            goto L_0x006c
        L_0x020e:
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79374f
            if (r11 == 0) goto L_0x01d8
            goto L_0x0084
        L_0x0214:
            return
        L_0x0215:
            if (r11 == 0) goto L_0x026f
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            if (r11 == 0) goto L_0x0238
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            boolean r11 = a((java.lang.Thread.UncaughtExceptionHandler) r11)
            if (r11 != 0) goto L_0x0224
            goto L_0x0238
        L_0x0224:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r13 = "sys default last handle start!"
            com.tencent.bugly.proguard.x.e(r13, r11)
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79373e
            r11.uncaughtException(r9, r10)
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "sys default last handle end!"
            com.tencent.bugly.proguard.x.e(r10, r9)
            goto L_0x026f
        L_0x0238:
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79374f
            if (r11 == 0) goto L_0x0250
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r13 = "system handle start!"
            com.tencent.bugly.proguard.x.e(r13, r11)
            java.lang.Thread$UncaughtExceptionHandler r11 = r8.f79374f
            r11.uncaughtException(r9, r10)
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "system handle end!"
            com.tencent.bugly.proguard.x.e(r10, r9)
            goto L_0x026f
        L_0x0250:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "crashreport last handle start!"
            com.tencent.bugly.proguard.x.e(r10, r9)
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "current process die"
            com.tencent.bugly.proguard.x.e(r10, r9)
            int r9 = android.os.Process.myPid()
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(r9)
            com.tencent.bugly.crashreport.crash.e._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(r0)
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "crashreport last handle end!"
            com.tencent.bugly.proguard.x.e(r10, r9)
        L_0x026f:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.e.a(java.lang.Thread, java.lang.Throwable, boolean, java.lang.String, byte[]):void");
    }
}
