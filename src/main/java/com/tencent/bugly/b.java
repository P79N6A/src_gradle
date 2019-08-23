package com.tencent.bugly;

import android.content.Context;
import com.tencent.bugly.crashreport.common.info.a;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.x;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f79235a = true;

    /* renamed from: b  reason: collision with root package name */
    public static List<a> f79236b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f79237c;

    /* renamed from: d  reason: collision with root package name */
    private static p f79238d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f79239e;

    public static synchronized void a(Context context) {
        synchronized (b.class) {
            a(context, null);
        }
    }

    public static synchronized void a(a aVar) {
        synchronized (b.class) {
            if (!f79236b.contains(aVar)) {
                f79236b.add(aVar);
            }
        }
    }

    private static boolean a(a aVar) {
        List<String> list = aVar.o;
        aVar.getClass();
        if (list == null || !list.contains("bugly")) {
            return false;
        }
        return true;
    }

    public static synchronized void a(Context context, BuglyStrategy buglyStrategy) {
        synchronized (b.class) {
            if (f79239e) {
                x.d("[init] initial Multi-times, ignore this.", new Object[0]);
            } else if (context != null) {
                a a2 = a.a(context);
                if (a(a2)) {
                    f79235a = false;
                    return;
                }
                String f2 = a2.f();
                if (f2 != null) {
                    a(context, f2, a2.u, buglyStrategy);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:27|(3:29|(1:31)|32)|33|34|(2:36|(3:38|(1:40)|41))(2:42|(2:44|(1:46)))|47|48|49|(3:51|(1:53)|54)|55|(3:57|(1:59)|60)|61) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x015f */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0169 A[Catch:{ Throwable -> 0x01f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019a A[Catch:{ Throwable -> 0x01f6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r20, java.lang.String r21, boolean r22, com.tencent.bugly.BuglyStrategy r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.Class<com.tencent.bugly.b> r3 = com.tencent.bugly.b.class
            monitor-enter(r3)
            boolean r4 = f79239e     // Catch:{ all -> 0x0212 }
            r5 = 0
            if (r4 == 0) goto L_0x0017
            java.lang.String r0 = "[init] initial Multi-times, ignore this."
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.d(r0, r1)     // Catch:{ all -> 0x0212 }
            monitor-exit(r3)
            return
        L_0x0017:
            if (r20 != 0) goto L_0x001b
            monitor-exit(r3)
            return
        L_0x001b:
            if (r0 != 0) goto L_0x001f
            monitor-exit(r3)
            return
        L_0x001f:
            r6 = 1
            f79239e = r6     // Catch:{ all -> 0x0212 }
            if (r1 == 0) goto L_0x0060
            f79237c = r6     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.f79540b = r6     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "Bugly debug模式开启，请在发布时把isDebug关闭。 -- Running in debug model for 'isDebug' is enabled. Please disable it when you release."
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.d(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "--------------------------------------------------------------------------------------------"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.e(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "Bugly debug模式将有以下行为特性 -- The following list shows the behaviour of debug model: "
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.d(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "[1] 输出详细的Bugly SDK的Log -- More detailed log of Bugly SDK will be output to logcat;"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.d(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "[2] 每一条Crash都会被立即上报 -- Every crash caught by Bugly will be uploaded immediately."
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.d(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "[3] 自定义日志将会在Logcat中输出 -- Custom log will be output to logcat."
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.d(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "--------------------------------------------------------------------------------------------"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.e(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "[init] Open debug mode of Bugly."
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.b(r7, r8)     // Catch:{ all -> 0x0212 }
        L_0x0060:
            java.lang.String r7 = "[init] Bugly version: v%s"
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0212 }
            java.lang.String r9 = "2.6.6"
            r8[r5] = r9     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.a(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = " crash report start initializing..."
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.a(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "[init] Bugly start initializing..."
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.b(r7, r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r7 = "[init] Bugly complete version: v%s"
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0212 }
            java.lang.String r9 = "2.6.6"
            r8[r5] = r9     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.a(r7, r8)     // Catch:{ all -> 0x0212 }
            android.content.Context r4 = com.tencent.bugly.proguard.z.a((android.content.Context) r20)     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.crashreport.common.info.a r7 = com.tencent.bugly.crashreport.common.info.a.a((android.content.Context) r4)     // Catch:{ all -> 0x0212 }
            r7.t()     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.y.a((android.content.Context) r4)     // Catch:{ all -> 0x0212 }
            java.util.List<com.tencent.bugly.a> r8 = f79236b     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.p r8 = com.tencent.bugly.proguard.p.a((android.content.Context) r4, (java.util.List<com.tencent.bugly.a>) r8)     // Catch:{ all -> 0x0212 }
            f79238d = r8     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.u.a((android.content.Context) r4)     // Catch:{ all -> 0x0212 }
            java.util.List<com.tencent.bugly.a> r8 = f79236b     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.crashreport.common.strategy.a r8 = com.tencent.bugly.crashreport.common.strategy.a.a((android.content.Context) r4, (java.util.List<com.tencent.bugly.a>) r8)     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.n r9 = com.tencent.bugly.proguard.n.a((android.content.Context) r4)     // Catch:{ all -> 0x0212 }
            boolean r10 = a((com.tencent.bugly.crashreport.common.info.a) r7)     // Catch:{ all -> 0x0212 }
            if (r10 == 0) goto L_0x00b1
            f79235a = r5     // Catch:{ all -> 0x0212 }
            monitor-exit(r3)
            return
        L_0x00b1:
            r7.a((java.lang.String) r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r10 = "[param] Set APP ID:%s"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0212 }
            r11[r5] = r0     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.a(r10, r11)     // Catch:{ all -> 0x0212 }
            if (r2 == 0) goto L_0x01ce
            java.lang.String r0 = r23.getAppVersion()     // Catch:{ all -> 0x0212 }
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0212 }
            r11 = 2
            r12 = 3
            r13 = 100
            if (r10 != 0) goto L_0x00f8
            int r10 = r0.length()     // Catch:{ all -> 0x0212 }
            if (r10 <= r13) goto L_0x00e9
            java.lang.String r10 = r0.substring(r5, r13)     // Catch:{ all -> 0x0212 }
            java.lang.String r14 = "appVersion %s length is over limit %d substring to %s"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ all -> 0x0212 }
            r15[r5] = r0     // Catch:{ all -> 0x0212 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0212 }
            r15[r6] = r0     // Catch:{ all -> 0x0212 }
            r15[r11] = r10     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.d(r14, r15)     // Catch:{ all -> 0x0212 }
            r0 = r10
        L_0x00e9:
            r7.j = r0     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "[param] Set App version: %s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0212 }
            java.lang.String r14 = r23.getAppVersion()     // Catch:{ all -> 0x0212 }
            r10[r5] = r14     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.a(r0, r10)     // Catch:{ all -> 0x0212 }
        L_0x00f8:
            boolean r0 = r23.isReplaceOldChannel()     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r23.getAppChannel()     // Catch:{ Exception -> 0x015f }
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x015f }
            if (r10 != 0) goto L_0x0154
            int r10 = r0.length()     // Catch:{ Exception -> 0x015f }
            if (r10 <= r13) goto L_0x0124
            java.lang.String r10 = r0.substring(r5, r13)     // Catch:{ Exception -> 0x015f }
            java.lang.String r14 = "appChannel %s length is over limit %d substring to %s"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x015f }
            r15[r5] = r0     // Catch:{ Exception -> 0x015f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x015f }
            r15[r6] = r0     // Catch:{ Exception -> 0x015f }
            r15[r11] = r10     // Catch:{ Exception -> 0x015f }
            com.tencent.bugly.proguard.x.d(r14, r15)     // Catch:{ Exception -> 0x015f }
            r0 = r10
        L_0x0124:
            com.tencent.bugly.proguard.p r14 = f79238d     // Catch:{ Exception -> 0x015f }
            r15 = 556(0x22c, float:7.79E-43)
            java.lang.String r16 = "app_channel"
            byte[] r17 = r0.getBytes()     // Catch:{ Exception -> 0x015f }
            r18 = 0
            r19 = 0
            r14.a((int) r15, (java.lang.String) r16, (byte[]) r17, (com.tencent.bugly.proguard.o) r18, (boolean) r19)     // Catch:{ Exception -> 0x015f }
            r7.l = r0     // Catch:{ Exception -> 0x015f }
            goto L_0x0154
        L_0x0138:
            com.tencent.bugly.proguard.p r0 = f79238d     // Catch:{ Exception -> 0x015f }
            r10 = 556(0x22c, float:7.79E-43)
            r14 = 0
            java.util.Map r0 = r0.a((int) r10, (com.tencent.bugly.proguard.o) r14, (boolean) r6)     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x0154
            java.lang.String r10 = "app_channel"
            java.lang.Object r0 = r0.get(r10)     // Catch:{ Exception -> 0x015f }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x0154
            java.lang.String r10 = new java.lang.String     // Catch:{ Exception -> 0x015f }
            r10.<init>(r0)     // Catch:{ Exception -> 0x015f }
            r7.l = r10     // Catch:{ Exception -> 0x015f }
        L_0x0154:
            java.lang.String r0 = "[param] Set App channel: %s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x015f }
            java.lang.String r14 = r7.l     // Catch:{ Exception -> 0x015f }
            r10[r5] = r14     // Catch:{ Exception -> 0x015f }
            com.tencent.bugly.proguard.x.a(r0, r10)     // Catch:{ Exception -> 0x015f }
        L_0x015f:
            java.lang.String r0 = r23.getAppPackageName()     // Catch:{ all -> 0x0212 }
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0212 }
            if (r10 != 0) goto L_0x0194
            int r10 = r0.length()     // Catch:{ all -> 0x0212 }
            if (r10 <= r13) goto L_0x0185
            java.lang.String r10 = r0.substring(r5, r13)     // Catch:{ all -> 0x0212 }
            java.lang.String r14 = "appPackageName %s length is over limit %d substring to %s"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ all -> 0x0212 }
            r15[r5] = r0     // Catch:{ all -> 0x0212 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0212 }
            r15[r6] = r0     // Catch:{ all -> 0x0212 }
            r15[r11] = r10     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.d(r14, r15)     // Catch:{ all -> 0x0212 }
            r0 = r10
        L_0x0185:
            r7.f79276c = r0     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "[param] Set App package: %s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0212 }
            java.lang.String r14 = r23.getAppPackageName()     // Catch:{ all -> 0x0212 }
            r10[r5] = r14     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.a(r0, r10)     // Catch:{ all -> 0x0212 }
        L_0x0194:
            java.lang.String r0 = r23.getDeviceID()     // Catch:{ all -> 0x0212 }
            if (r0 == 0) goto L_0x01c2
            int r10 = r0.length()     // Catch:{ all -> 0x0212 }
            if (r10 <= r13) goto L_0x01b6
            java.lang.String r10 = r0.substring(r5, r13)     // Catch:{ all -> 0x0212 }
            java.lang.String r14 = "deviceId %s length is over limit %d substring to %s"
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0212 }
            r12[r5] = r0     // Catch:{ all -> 0x0212 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0212 }
            r12[r6] = r0     // Catch:{ all -> 0x0212 }
            r12[r11] = r10     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.d(r14, r12)     // Catch:{ all -> 0x0212 }
            r0 = r10
        L_0x01b6:
            r7.c(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r10 = "s[param] Set device ID: %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0212 }
            r6[r5] = r0     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.a(r10, r6)     // Catch:{ all -> 0x0212 }
        L_0x01c2:
            boolean r0 = r23.isUploadProcess()     // Catch:{ all -> 0x0212 }
            r7.f79278e = r0     // Catch:{ all -> 0x0212 }
            boolean r0 = r23.isBuglyLogUpload()     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.y.f79542a = r0     // Catch:{ all -> 0x0212 }
        L_0x01ce:
            com.tencent.bugly.crashreport.biz.b.a((android.content.Context) r4, (com.tencent.bugly.BuglyStrategy) r2)     // Catch:{ all -> 0x0212 }
            r6 = 0
        L_0x01d2:
            java.util.List<com.tencent.bugly.a> r0 = f79236b     // Catch:{ all -> 0x0212 }
            int r0 = r0.size()     // Catch:{ all -> 0x0212 }
            if (r6 >= r0) goto L_0x01fd
            java.util.List<com.tencent.bugly.a> r0 = f79236b     // Catch:{ Throwable -> 0x01f6 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Throwable -> 0x01f6 }
            com.tencent.bugly.a r0 = (com.tencent.bugly.a) r0     // Catch:{ Throwable -> 0x01f6 }
            int r0 = r0.id     // Catch:{ Throwable -> 0x01f6 }
            boolean r0 = r9.a((int) r0)     // Catch:{ Throwable -> 0x01f6 }
            if (r0 == 0) goto L_0x01fa
            java.util.List<com.tencent.bugly.a> r0 = f79236b     // Catch:{ Throwable -> 0x01f6 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Throwable -> 0x01f6 }
            com.tencent.bugly.a r0 = (com.tencent.bugly.a) r0     // Catch:{ Throwable -> 0x01f6 }
            r0.init(r4, r1, r2)     // Catch:{ Throwable -> 0x01f6 }
            goto L_0x01fa
        L_0x01f6:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)     // Catch:{ all -> 0x0212 }
        L_0x01fa:
            int r6 = r6 + 1
            goto L_0x01d2
        L_0x01fd:
            if (r2 == 0) goto L_0x0204
            long r0 = r23.getAppReportDelay()     // Catch:{ all -> 0x0212 }
            goto L_0x0206
        L_0x0204:
            r0 = 0
        L_0x0206:
            r8.a((long) r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "[init] Bugly initialization finished."
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            com.tencent.bugly.proguard.x.b(r0, r1)     // Catch:{ all -> 0x0212 }
            monitor-exit(r3)
            return
        L_0x0212:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.b.a(android.content.Context, java.lang.String, boolean, com.tencent.bugly.BuglyStrategy):void");
    }
}
