package com.ss.android.ugc.aweme.app;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.c.a;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.uikit.base.AppHooks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.commercialize.splash.h;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.utils.ai;
import java.util.ArrayList;

public abstract class r extends Application implements AppHooks.InitHook {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2671b = true;

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f2672c = null;

    /* renamed from: d  reason: collision with root package name */
    public static long f2673d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static long f2674e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static long f2675f = -1;
    protected static r h;

    /* renamed from: a  reason: collision with root package name */
    private long f2676a = -1;
    protected boolean g;

    public void c() {
    }

    public boolean d() {
        return false;
    }

    public abstract void i();

    public static r h() {
        return h;
    }

    public r() {
        i.a().f2654b = this;
        c();
    }

    private boolean a() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f2672c, false, 22331, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2672c, false, 22331, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f2676a == -1) {
            if (PatchProxy.isSupport(new Object[]{this}, null, am.f2630a, true, 22577, new Class[]{Context.class}, Long.TYPE)) {
                j = ((Long) PatchProxy.accessDispatch(new Object[]{this}, null, am.f2630a, true, 22577, new Class[]{Context.class}, Long.TYPE)).longValue();
            } else if (ToolUtils.isMainProcess(this)) {
                j = Thread.currentThread().getId();
            } else {
                j = 0;
            }
            this.f2676a = j;
        }
        if (this.f2676a == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d8, code lost:
        if (r5 != null) goto L_0x01c9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0273 */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d3 A[SYNTHETIC, Splitter:B:85:0x01d3] */
    @com.ss.android.ugc.thermometer.annotation.MeasureFunction
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r27 = this;
            r8 = r27
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 22332(0x573c, float:3.1294E-41)
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22332(0x573c, float:3.1294E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0027:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.app.a.f2614a
            r12 = 1
            r13 = 22109(0x565d, float:3.0981E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r15 = java.lang.Void.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            r9 = 19
            r10 = 1
            if (r1 == 0) goto L_0x004e
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.a.f2614a
            r14 = 1
            r15 = 22109(0x565d, float:3.0981E-41)
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00b8
        L_0x004e:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00b7 }
            if (r1 != r9) goto L_0x00b8
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x00b7 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00b7 }
            if (r1 != 0) goto L_0x00b8
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x00b7 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Throwable -> 0x00b7 }
            java.lang.String r1 = r1.trim()     // Catch:{ Throwable -> 0x00b7 }
            java.lang.String r2 = "vivo"
            boolean r1 = r1.startsWith(r2)     // Catch:{ Throwable -> 0x00b7 }
            if (r1 == 0) goto L_0x00b8
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x00b7 }
            com.bytedance.common.utility.reflect.Reflect r1 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Class<?>) r1)     // Catch:{ Throwable -> 0x00b7 }
            java.lang.String r2 = "currentActivityThread"
            com.bytedance.common.utility.reflect.Reflect r1 = r1.call(r2)     // Catch:{ Throwable -> 0x00b7 }
            if (r1 == 0) goto L_0x00b8
            java.lang.String r2 = "mH"
            java.lang.Class[] r3 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x00b7 }
            java.lang.String r4 = "android.app.ActivityThread$H"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Throwable -> 0x00b7 }
            r3[r0] = r4     // Catch:{ Throwable -> 0x00b7 }
            com.bytedance.common.utility.reflect.Reflect r1 = r1.field(r2, r3)     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r1 = r1.get()     // Catch:{ Throwable -> 0x00b7 }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ Throwable -> 0x00b7 }
            if (r1 == 0) goto L_0x00b8
            com.bytedance.common.utility.reflect.Reflect r2 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r1)     // Catch:{ Throwable -> 0x00b7 }
            java.lang.String r3 = "mCallback"
            java.lang.Class[] r4 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Class<android.os.Handler$Callback> r5 = android.os.Handler.Callback.class
            r4[r0] = r5     // Catch:{ Throwable -> 0x00b7 }
            com.bytedance.common.utility.reflect.Reflect r3 = r2.field(r3, r4)     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r3 = r3.get()     // Catch:{ Throwable -> 0x00b7 }
            android.os.Handler$Callback r3 = (android.os.Handler.Callback) r3     // Catch:{ Throwable -> 0x00b7 }
            com.ss.android.ugc.aweme.app.a$a r4 = new com.ss.android.ugc.aweme.app.a$a     // Catch:{ Throwable -> 0x00b7 }
            r4.<init>(r1, r3)     // Catch:{ Throwable -> 0x00b7 }
            java.lang.String r1 = "mCallback"
            r2.set(r1, r4)     // Catch:{ Throwable -> 0x00b7 }
            goto L_0x00b8
        L_0x00b7:
        L_0x00b8:
            h = r8
            com.ss.android.common.applog.AppLog.addAppCount()
            java.lang.String r1 = "douyin"
            com.ss.android.g.a.f2462a = r1
            com.ss.android.ugc.aweme.app.i r1 = com.ss.android.ugc.aweme.app.i.a()
            java.lang.Object[] r11 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.i.f2653a
            r14 = 0
            r15 = 22254(0x56ee, float:3.1184E-41)
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r7 = 2
            if (r2 == 0) goto L_0x00ed
            java.lang.Object[] r11 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.i.f2653a
            r14 = 0
            r15 = 22254(0x56ee, float:3.1184E-41)
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x027c
        L_0x00ed:
            r2 = 0
            android.app.Application r3 = r1.f2654b     // Catch:{ Exception -> 0x00ff }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x00ff }
            android.app.Application r4 = r1.f2654b     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x00ff }
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r0)     // Catch:{ Exception -> 0x00ff }
            goto L_0x0100
        L_0x00ff:
            r3 = r2
        L_0x0100:
            android.app.Application r4 = r1.f2654b
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "SS_VERSION_NAME"
            java.lang.String r5 = com.bytedance.common.utility.android.ManifestData.getString(r4, r5)     // Catch:{ Exception -> 0x010e }
            r1.f2657e = r5     // Catch:{ Exception -> 0x010e }
        L_0x010e:
            java.lang.String r5 = r1.f2657e
            boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x011c
            if (r3 == 0) goto L_0x011c
            java.lang.String r5 = r3.versionName
            r1.f2657e = r5
        L_0x011c:
            java.lang.String r5 = "SS_VERSION_CODE"
            int r5 = com.bytedance.common.utility.android.ManifestData.getInt(r4, r5)     // Catch:{ Exception -> 0x0124 }
            r1.f2658f = r5     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            int r5 = r1.f2658f
            r6 = -1
            if (r5 == r6) goto L_0x012d
            int r5 = r1.f2658f
            if (r5 != 0) goto L_0x0135
        L_0x012d:
            if (r3 == 0) goto L_0x0132
            int r5 = r3.versionCode
            goto L_0x0133
        L_0x0132:
            r5 = 1
        L_0x0133:
            r1.f2658f = r5
        L_0x0135:
            java.lang.String r5 = "UPDATE_VERSION_CODE"
            int r4 = com.bytedance.common.utility.android.ManifestData.getInt(r4, r5)     // Catch:{ Exception -> 0x013d }
            r1.g = r4     // Catch:{ Exception -> 0x013d }
        L_0x013d:
            if (r3 == 0) goto L_0x0147
            int r4 = r3.versionCode
            r1.h = r4
            java.lang.String r3 = r3.versionName
            r1.i = r3
        L_0x0147:
            java.lang.String r3 = r1.f2657e
            if (r3 != 0) goto L_0x014f
            java.lang.String r3 = "-1"
            r1.f2657e = r3
        L_0x014f:
            java.lang.String r3 = r1.getChannel()
            r1.f2656d = r3
            boolean r3 = com.ss.android.g.a.a()
            if (r3 != 0) goto L_0x0232
            java.lang.Object[] r11 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.i.f2653a
            r14 = 0
            r15 = 22255(0x56ef, float:3.1186E-41)
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x0182
            java.lang.Object[] r11 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.i.f2653a
            r14 = 0
            r15 = 22255(0x56ef, float:3.1186E-41)
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0232
        L_0x0182:
            java.lang.String r3 = "2345"
            java.lang.String r4 = r1.f2655c
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0232
            java.lang.String r3 = "META-INF/channel_"
            android.app.Application r4 = r1.f2654b     // Catch:{ Exception -> 0x01d7, all -> 0x01cf }
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch:{ Exception -> 0x01d7, all -> 0x01cf }
            java.lang.String r4 = r4.sourceDir     // Catch:{ Exception -> 0x01d7, all -> 0x01cf }
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x01d7, all -> 0x01cf }
            r5.<init>(r4)     // Catch:{ Exception -> 0x01d7, all -> 0x01cf }
            java.util.Enumeration r4 = r5.entries()     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
        L_0x019f:
            boolean r6 = r4.hasMoreElements()     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
            if (r6 == 0) goto L_0x01c9
            java.lang.Object r6 = r4.nextElement()     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
            java.lang.String r6 = com.ss.android.common.util.ToolUtils.handleZipEntryGetNameLeak(r6)     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
            boolean r11 = r6.startsWith(r3)     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
            if (r11 == 0) goto L_0x019f
            java.lang.String r3 = "_"
            r4 = 4
            java.lang.String[] r3 = r6.split(r3, r4)     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
            if (r3 == 0) goto L_0x01c9
            int r4 = r3.length     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
            r6 = 3
            if (r4 < r6) goto L_0x01c9
            r3 = r3[r7]     // Catch:{ Exception -> 0x01d8, all -> 0x01cd }
            r2 = r3
        L_0x01c9:
            r5.close()     // Catch:{ Exception -> 0x01db }
            goto L_0x01db
        L_0x01cd:
            r0 = move-exception
            goto L_0x01d1
        L_0x01cf:
            r0 = move-exception
            r5 = r2
        L_0x01d1:
            if (r5 == 0) goto L_0x01d6
            r5.close()     // Catch:{ Exception -> 0x01d6 }
        L_0x01d6:
            throw r0
        L_0x01d7:
            r5 = r2
        L_0x01d8:
            if (r5 == 0) goto L_0x01db
            goto L_0x01c9
        L_0x01db:
            if (r2 == 0) goto L_0x0232
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0232
            int r3 = r2.length()
            r4 = 50
            if (r3 >= r4) goto L_0x0232
            int r3 = r2.length()
            r4 = 0
        L_0x01f0:
            if (r4 >= r3) goto L_0x0217
            char r5 = r2.charAt(r4)
            r6 = 97
            if (r5 < r6) goto L_0x01fe
            r6 = 122(0x7a, float:1.71E-43)
            if (r5 <= r6) goto L_0x0214
        L_0x01fe:
            r6 = 65
            if (r5 < r6) goto L_0x0206
            r6 = 90
            if (r5 <= r6) goto L_0x0214
        L_0x0206:
            r6 = 48
            if (r5 < r6) goto L_0x020e
            r6 = 57
            if (r5 <= r6) goto L_0x0214
        L_0x020e:
            r6 = 45
            if (r5 == r6) goto L_0x0214
            r3 = 0
            goto L_0x0218
        L_0x0214:
            int r4 = r4 + 1
            goto L_0x01f0
        L_0x0217:
            r3 = 1
        L_0x0218:
            if (r3 == 0) goto L_0x0232
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.f2655c
            r3.append(r4)
            java.lang.String r4 = "_"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.f2656d = r2
        L_0x0232:
            android.app.Application r2 = r1.f2654b
            com.ss.android.common.util.NetworkUtils.setAppContext(r2)
            com.ss.android.newmedia.logsdk.AppLogNetworkClient r2 = new com.ss.android.newmedia.logsdk.AppLogNetworkClient
            r2.<init>()
            com.bytedance.common.utility.NetworkClient.setDefault(r2)
            com.ss.android.newmedia.logsdk.a r2 = new com.ss.android.newmedia.logsdk.a
            r2.<init>()
            com.ss.android.common.util.NetworkUtils.setApiProcessHook(r2)
            com.ss.android.statistic.d r2 = com.ss.android.statistic.d.a()
            com.ss.android.statistic.a r2 = r2.f2563b
            if (r2 == 0) goto L_0x0262
            int r3 = r1.f2658f
            r2.g = r3
            java.lang.String r3 = r1.f2657e
            r2.f2561f = r3
            java.lang.String r3 = r1.f2655c
            r2.f2559d = r3
            com.ss.android.statistic.d r3 = com.ss.android.statistic.d.a()
            r3.a((com.ss.android.statistic.a) r2)
        L_0x0262:
            android.app.Application r1 = r1.f2654b     // Catch:{ Exception -> 0x0273 }
            com.ss.android.newmedia.app.e r1 = com.ss.android.newmedia.app.e.a((android.content.Context) r1)     // Catch:{ Exception -> 0x0273 }
            java.lang.String r2 = "release_build"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.a(r2, r3)     // Catch:{ Exception -> 0x0273 }
            com.ss.android.common.applog.AppLog.setReleaseBuild(r1)     // Catch:{ Exception -> 0x0273 }
        L_0x0273:
            com.ss.android.common.applog.b r1 = com.ss.android.common.applog.b.a()     // Catch:{ Exception -> 0x027b }
            com.ss.android.common.applog.AppLog.setAliYunHanlder(r1)     // Catch:{ Exception -> 0x027b }
            goto L_0x027c
        L_0x027b:
        L_0x027c:
            com.ss.android.common.applog.GlobalContext.setContext(r27)
            com.bytedance.c.a.a r1 = com.bytedance.c.a.a.a()
            r1.b()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22339(0x5743, float:3.1304E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r11 = java.lang.Void.TYPE
            r2 = r27
            r12 = 2
            r7 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x02ac
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22339(0x5743, float:3.1304E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02e1
        L_0x02ac:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.bytedance.ies.ugc.aweme.plugin.service.IPluginService> r2 = com.bytedance.ies.ugc.aweme.plugin.service.IPluginService.class
            com.ss.android.ugc.aweme.framework.services.ServiceProvider r3 = com.ss.android.ugc.aweme.app.t.f2689b
            com.ss.android.ugc.aweme.framework.services.Binding r1 = r1.bind(r2, r3)
            r1.asSingleton()
            com.ss.android.newmedia.BaseAppData r1 = com.ss.android.newmedia.BaseAppData.a()
            boolean r1 = r1.k()
            if (r1 == 0) goto L_0x02e1
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.bytedance.ies.ugc.aweme.plugin.service.IPluginService> r2 = com.bytedance.ies.ugc.aweme.plugin.service.IPluginService.class
            java.lang.Object r1 = r1.getService(r2)
            com.bytedance.ies.ugc.aweme.plugin.service.IPluginService r1 = (com.bytedance.ies.ugc.aweme.plugin.service.IPluginService) r1
            if (r1 == 0) goto L_0x02e1
            com.ss.android.ugc.aweme.app.application.b.i r2 = new com.ss.android.ugc.aweme.app.application.b.i
            r2.<init>()
            r1.initPatchCallback(r2)
            r1.initSaveu(r8)
            r1.install(r8)
        L_0x02e1:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22340(0x5744, float:3.1305E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0305
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22340(0x5744, float:3.1305E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x030d
        L_0x0305:
            com.ss.android.ugc.aweme.app.application.task.b r1 = new com.ss.android.ugc.aweme.app.application.task.b
            r1.<init>()
            r1.run()
        L_0x030d:
            com.ss.android.newmedia.BaseAppData r1 = com.ss.android.newmedia.BaseAppData.a()
            boolean r1 = r1.k()
            if (r1 == 0) goto L_0x03dc
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22333(0x573d, float:3.1295E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x033c
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22333(0x573d, float:3.1295E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x03dc
        L_0x033c:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r2 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r1 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r1
            if (r1 == 0) goto L_0x03dc
            java.lang.String r2 = "Douyin"
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.miniapp_api.services.a.f3612a
            r16 = 1
            r17 = 59648(0xe900, float:8.3585E-41)
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService$a> r19 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.a.class
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x0379
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.miniapp_api.services.a.f3612a
            r16 = 1
            r17 = 59648(0xe900, float:8.3585E-41)
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService$a> r19 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.a.class
            r18 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService$a r3 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.a) r3
            goto L_0x037e
        L_0x0379:
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService$a r3 = new com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService$a
            r3.<init>()
        L_0x037e:
            java.lang.String r4 = "1128"
            r3.f3606a = r4
            r3.f3610e = r2
            com.ss.android.ugc.aweme.app.i r2 = com.ss.android.ugc.aweme.app.i.a()
            java.lang.String r2 = r2.getChannel()
            r3.f3607b = r2
            com.ss.android.ugc.aweme.app.i r2 = com.ss.android.ugc.aweme.app.i.a()
            int r2 = r2.getUpdateVersionCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3.f3608c = r2
            java.lang.String r2 = "miniapp"
            int r2 = com.bytedance.frameworks.plugin.pm.c.c(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3.f3609d = r2
            com.ss.android.ugc.aweme.miniapp.f.c r2 = new com.ss.android.ugc.aweme.miniapp.f.c
            r2.<init>()
            r3.g = r2
            com.ss.android.ugc.aweme.miniapp.f.d r2 = new com.ss.android.ugc.aweme.miniapp.f.d
            r2.<init>()
            r3.i = r2
            com.ss.android.ugc.aweme.miniapp.f.j r2 = new com.ss.android.ugc.aweme.miniapp.f.j
            r2.<init>()
            r3.l = r2
            com.ss.android.ugc.aweme.miniapp.f.k r2 = new com.ss.android.ugc.aweme.miniapp.f.k
            r2.<init>()
            r3.h = r2
            com.ss.android.ugc.aweme.miniapp.f.a r2 = new com.ss.android.ugc.aweme.miniapp.f.a
            r2.<init>()
            r3.j = r2
            com.ss.android.ugc.aweme.miniapp.f.b r2 = new com.ss.android.ugc.aweme.miniapp.f.b
            r2.<init>()
            r3.k = r2
            com.ss.android.ugc.aweme.miniapp.f.e r2 = new com.ss.android.ugc.aweme.miniapp.f.e
            r2.<init>()
            r3.f3611f = r2
            r1.initialize(r8, r3)
        L_0x03dc:
            super.onCreate()
            android.content.Context r1 = r27.getApplicationContext()
            java.lang.String r11 = com.ss.android.common.util.ToolUtils.getCurProcessName(r1)
            boolean r1 = r27.d()
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            r13[r0] = r2
            r13[r10] = r11
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.h.a.f2652a
            r16 = 1
            r17 = 23748(0x5cc4, float:3.3278E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r0] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0433
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r13[r0] = r1
            r13[r10] = r11
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.h.a.f2652a
            r16 = 1
            r17 = 23748(0x5cc4, float:3.3278E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r0] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x047a
        L_0x0433:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r1)
            r2[r0] = r3
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.app.h.a.f2652a
            r23 = 1
            r24 = 23749(0x5cc5, float:3.328E-41)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r0] = r4
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r2
            r25 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r20, r21, r22, r23, r24, r25, r26)
            if (r2 == 0) goto L_0x0472
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r13[r0] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.h.a.f2652a
            r16 = 1
            r17 = 23749(0x5cc5, float:3.328E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r0] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0477
        L_0x0472:
            if (r1 == 0) goto L_0x0477
            com.bytedance.common.utility.Logger.setLogLevel(r12)
        L_0x0477:
            com.bytedance.common.utility.Logger.debug()
        L_0x047a:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r0] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22334(0x573e, float:3.1297E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r0] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x04ab
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r0] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22334(0x573e, float:3.1297E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r0] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0548
        L_0x04ab:
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r11)
            if (r1 != 0) goto L_0x0548
            java.lang.String r1 = ":ad"
            boolean r1 = r11.endsWith(r1)
            if (r1 == 0) goto L_0x0548
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r9) goto L_0x0548
            com.bytedance.common.utility.reflect.Reflect r1 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r27)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.newmedia.b r2 = new com.ss.android.newmedia.b     // Catch:{ Throwable -> 0x04d1 }
            android.content.Context r3 = r27.getBaseContext()     // Catch:{ Throwable -> 0x04d1 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r3 = "mBase"
            r1.set(r3, r2)     // Catch:{ Throwable -> 0x04d1 }
            goto L_0x0548
        L_0x04d1:
            int r1 = android.os.Process.myPid()
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r13[r0] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.u.f2690a
            r16 = 1
            r17 = 22346(0x574a, float:3.1313E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r0] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0512
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13[r0] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.u.f2690a
            r16 = 1
            r17 = 22346(0x574a, float:3.1313E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0548
        L_0x0512:
            com.ss.android.ugc.aweme.framework.core.a r2 = com.ss.android.ugc.aweme.framework.core.a.b()
            java.lang.String r2 = r2.f3304b
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0545
            java.lang.String r3 = "gray_"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0545
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            boolean r2 = com.ss.android.common.util.ToolUtils.isMainProcess(r2)
            if (r2 != 0) goto L_0x0531
            goto L_0x0545
        L_0x0531:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Process killed, pid is "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0545:
            android.os.Process.killProcess(r1)
        L_0x0548:
            com.ss.android.ugc.aweme.lego.a r1 = com.ss.android.ugc.aweme.lego.a.i
            com.ss.android.ugc.aweme.lego.a$f r1 = r1.a()
            com.ss.android.ugc.aweme.app.application.task.TokenSdkTask r2 = new com.ss.android.ugc.aweme.app.application.task.TokenSdkTask
            r2.<init>()
            com.ss.android.ugc.aweme.lego.a$f r1 = r1.a(r2)
            r1.a()
            com.ss.android.ugc.awemepushapi.IPushApi r2 = com.ss.android.di.push.a.a()
            android.content.Context r3 = r27.getApplicationContext()
            com.ss.android.ugc.aweme.app.i r4 = com.ss.android.ugc.aweme.app.i.a()
            boolean r5 = r8.g
            com.ss.android.ugc.aweme.services.MainServiceForPush r6 = new com.ss.android.ugc.aweme.services.MainServiceForPush
            com.ss.android.ugc.aweme.app.i r1 = com.ss.android.ugc.aweme.app.i.a()
            int r1 = r1.getAid()
            r6.<init>(r1)
            com.ss.android.ugc.aweme.ad.a r7 = new com.ss.android.ugc.aweme.ad.a
            android.content.Context r1 = r27.getApplicationContext()
            r7.<init>(r1)
            r2.init(r3, r4, r5, r6, r7)
            boolean r1 = com.ss.android.common.util.ToolUtils.isMessageProcess(r27)
            if (r1 == 0) goto L_0x058a
            com.bytedance.frameworks.plugin.e.a(r27)
        L_0x058a:
            boolean r1 = r27.a()
            if (r1 != 0) goto L_0x0604
            java.lang.String r1 = com.ss.android.common.util.ToolUtils.getCurProcessName(r27)
            java.lang.String r2 = "miniapp"
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0604
            java.lang.String r1 = ":push"
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r0] = r8
            r13[r10] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.am.f2630a
            r16 = 1
            r17 = 22575(0x582f, float:3.1634E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r0] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x05e5
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r0] = r8
            r13[r10] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.am.f2630a
            r16 = 1
            r17 = 22575(0x582f, float:3.1634E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r0] = r2
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r10] = r0
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x05f6
        L_0x05e5:
            int r2 = android.os.Process.myPid()
            java.lang.String r2 = com.ss.android.ugc.aweme.app.am.a(r2)
            if (r2 == 0) goto L_0x05f6
            boolean r1 = r2.endsWith(r1)
            if (r1 == 0) goto L_0x05f6
            r0 = 1
        L_0x05f6:
            if (r0 == 0) goto L_0x0603
            com.bytedance.common.utility.Logger.debug()
            com.ss.android.common.config.AppConfig r0 = com.ss.android.common.config.AppConfig.getInstance(r27)
            r0.tryRefreshConfig()
            return
        L_0x0603:
            return
        L_0x0604:
            com.ss.android.ugc.aweme.app.i.a()
            java.lang.String r1 = com.ss.android.ugc.aweme.app.i.b()
            com.ss.android.sdk.e.f2555a = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22335(0x573f, float:3.1298E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0631
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22335(0x573f, float:3.1298E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x063a
        L_0x0631:
            boolean r1 = r27.a()
            if (r1 == 0) goto L_0x063a
            com.ss.android.ugc.aweme.app.af.a((android.content.Context) r27)
        L_0x063a:
            boolean r1 = r27.a()
            if (r1 == 0) goto L_0x0645
            com.bytedance.ies.uikit.dialog.AlertDialog$NightMode r1 = com.ss.android.ugc.aweme.app.s.f2678b
            com.bytedance.ies.uikit.dialog.AlertDialog.setNightMode(r1)
        L_0x0645:
            com.ss.android.ugc.aweme.app.v r1 = com.ss.android.ugc.aweme.app.v.a.f2697a
            com.ss.android.common.util.NetworkUtils.setCommandListener(r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22336(0x5740, float:3.13E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x066e
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22336(0x5740, float:3.13E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0686
        L_0x066e:
            com.bytedance.ies.uikit.base.AppHooks.setInitHook(r27)
            com.ss.android.newmedia.BaseAppData r1 = com.ss.android.newmedia.BaseAppData.a()
            com.bytedance.ies.uikit.base.AppHooks.setActivityHook(r1)
            com.ss.android.newmedia.BaseAppData r1 = com.ss.android.newmedia.BaseAppData.a()
            com.bytedance.ies.uikit.base.AppHooks.setActivityResultHook(r1)
            com.ss.android.newmedia.BaseAppData r1 = com.ss.android.newmedia.BaseAppData.a()
            com.bytedance.ies.uikit.base.AppHooks.setAppBackgroundHook(r1)
        L_0x0686:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r0] = r8
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.newmedia.e.f2507a
            r14 = 1
            r15 = 18241(0x4741, float:2.5561E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r0] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x06b8
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r0] = r8
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.newmedia.e.f2507a
            r14 = 1
            r15 = 18241(0x4741, float:2.5561E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r0] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x06be
        L_0x06b8:
            android.content.Context r1 = r27.getApplicationContext()
            com.ss.android.newmedia.e.f2508b = r1
        L_0x06be:
            boolean r1 = r27.a()
            if (r1 == 0) goto L_0x070a
            com.ss.android.ugc.aweme.app.i r1 = com.ss.android.ugc.aweme.app.i.a()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r0] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.update.m.f4275a
            r14 = 1
            r15 = 87410(0x15572, float:1.22487E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.common.AppContext> r3 = com.ss.android.common.AppContext.class
            r2[r0] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x06fc
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r0] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.update.m.f4275a
            r14 = 1
            r15 = 87410(0x15572, float:1.22487E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.common.AppContext> r2 = com.ss.android.common.AppContext.class
            r1[r0] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x070a
        L_0x06fc:
            com.ss.android.ugc.aweme.update.m r2 = com.ss.android.ugc.aweme.update.m.f4276f
            if (r2 != 0) goto L_0x070a
            com.ss.android.ugc.aweme.update.m r2 = new com.ss.android.ugc.aweme.update.m     // Catch:{ Exception -> 0x0707 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0707 }
            com.ss.android.ugc.aweme.update.m.f4276f = r2     // Catch:{ Exception -> 0x0707 }
        L_0x0707:
            com.bytedance.common.utility.Logger.debug()
        L_0x070a:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22337(0x5741, float:3.1301E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x072e
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22337(0x5741, float:3.1301E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x078b
        L_0x072e:
            com.ss.android.newmedia.BaseAppData r1 = com.ss.android.newmedia.BaseAppData.a()
            com.ss.android.common.applog.AppLog.setSessionHook(r1)
            com.ss.android.ugc.aweme.app.AwemeAppData r1 = com.ss.android.ugc.aweme.app.AwemeAppData.p()
            com.ss.android.newmedia.logsdk.b r1 = r1.ab
            com.ss.android.ugc.aweme.app.application.b.e r2 = new com.ss.android.ugc.aweme.app.application.b.e
            r2.<init>()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.newmedia.logsdk.b.f2516a
            r14 = 0
            r15 = 18647(0x48d7, float:2.613E-41)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.newmedia.logsdk.b$b> r4 = com.ss.android.newmedia.logsdk.b.C0020b.class
            r3[r0] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x0772
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.newmedia.logsdk.b.f2516a
            r14 = 0
            r15 = 18647(0x48d7, float:2.613E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.newmedia.logsdk.b$b> r3 = com.ss.android.newmedia.logsdk.b.C0020b.class
            r2[r0] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0777
        L_0x0772:
            java.util.Set<com.ss.android.newmedia.logsdk.b$b> r1 = r1.f2517b
            r1.add(r2)
        L_0x0777:
            com.ss.android.newmedia.BaseAppData r1 = com.ss.android.newmedia.BaseAppData.a()
            com.ss.android.newmedia.logsdk.b r1 = r1.ab
            com.ss.android.common.applog.AppLog.setConfigUpdateListener((com.ss.android.common.applog.AppLog.e) r1)
            com.ss.android.ugc.aweme.app.application.b.b r1 = new com.ss.android.ugc.aweme.app.application.b.b
            r1.<init>()
            com.ss.android.common.applog.AppLog.setLogEncryptConfig(r1)
            com.ss.android.common.applog.AppLog.setIsNotRequestSender(r10)
        L_0x078b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snssdk"
            r1.<init>(r2)
            com.ss.android.ugc.aweme.app.i.a()
            java.lang.String r2 = com.ss.android.ugc.aweme.app.i.b()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x07a8
            com.ss.android.j.f.f2469a = r1
        L_0x07a8:
            com.ss.android.ugc.aweme.app.application.b.g r1 = new com.ss.android.ugc.aweme.app.application.b.g
            r1.<init>(r8)
            com.ss.android.common.d.c.f2444d = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22338(0x5742, float:3.1302E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x07d3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2672c
            r4 = 0
            r5 = 22338(0x5742, float:3.1302E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x07ee
        L_0x07d3:
            android.content.Context r1 = r27.getApplicationContext()     // Catch:{ Exception -> 0x07ee }
            boolean r1 = com.ss.android.newmedia.BaseAppData.h(r1)     // Catch:{ Exception -> 0x07ee }
            if (r1 != 0) goto L_0x07ee
            android.content.Context r1 = r27.getApplicationContext()     // Catch:{ Exception -> 0x07ee }
            boolean r1 = com.ss.android.newmedia.BaseAppData.i(r1)     // Catch:{ Exception -> 0x07ee }
            if (r1 == 0) goto L_0x07ee
            android.content.Context r1 = r27.getApplicationContext()     // Catch:{ Exception -> 0x07ee }
            com.ss.android.newmedia.BaseAppData.b((android.content.Context) r1, (boolean) r0)     // Catch:{ Exception -> 0x07ee }
        L_0x07ee:
            com.ss.android.ugc.aweme.services.MainServiceForJsb r0 = new com.ss.android.ugc.aweme.services.MainServiceForJsb
            r0.<init>()
            com.ss.android.sdk.c.a.b.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.r.onCreate():void");
    }

    public void tryInit(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f2672c, false, 22341, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f2672c, false, 22341, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Logger.debug();
        BaseAppData.a().b(context2);
    }

    public void attachBaseContext(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f2672c, false, 22343, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f2672c, false, 22343, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.attachBaseContext(context);
        GlobalContext.setContext(this);
        h = this;
        this.g = ToolUtils.isMainProcess(this);
        if (this.g) {
            ag i = ag.i();
            if (PatchProxy.isSupport(new Object[0], i, ag.f3141a, false, 40154, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i, ag.f3141a, false, 40154, new Class[0], Void.TYPE);
            } else if (i.f3143c > 0) {
                i.h();
            } else {
                i.f3143c = SystemClock.uptimeMillis();
            }
            h hVar = h.i;
            if (PatchProxy.isSupport(new Object[0], hVar, h.f2931a, false, 32018, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], hVar, h.f2931a, false, 32018, new Class[0], Void.TYPE);
            } else if (h.f2932b <= 0) {
                h.f2932b = System.currentTimeMillis();
            }
            if (f2673d == -1) {
                f2673d = System.currentTimeMillis();
            }
            if (f2674e == -1) {
                f2674e = System.currentTimeMillis();
            }
            if (f2675f == -1) {
                f2675f = SystemClock.elapsedRealtime();
            }
        }
        a.C0008a aVar = new a.C0008a();
        if (!TextUtils.isEmpty("[\\w|.]*:miniapp\\d+")) {
            if (aVar.f2100a.isEmpty()) {
                aVar.f2100a = new ArrayList(2);
            }
            aVar.f2100a.add("[\\w|.]*:miniapp\\d+");
        }
        a a2 = aVar.a();
        if (PatchProxy.isSupport(new Object[0], null, ai.f4286a, true, 88072, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, ai.f4286a, true, 88072, new Class[0], Void.TYPE);
        } else if (Build.BRAND.toLowerCase().contains("oppo") || Build.MODEL.toLowerCase().contains("oppo")) {
            try {
                Class.forName("com.ss.android.ugc.awemepushlib.di.ies.MessageHandler");
            } catch (Throwable th) {
                ai.f4287b = th;
            }
        }
        com.bytedance.c.a.a.a().a(this, a2);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        String str2 = str;
        SQLiteDatabase.CursorFactory cursorFactory2 = cursorFactory;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), cursorFactory2}, this, f2672c, false, 22342, new Class[]{String.class, Integer.TYPE, SQLiteDatabase.CursorFactory.class}, SQLiteDatabase.class)) {
            return (SQLiteDatabase) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), cursorFactory2}, this, f2672c, false, 22342, new Class[]{String.class, Integer.TYPE, SQLiteDatabase.CursorFactory.class}, SQLiteDatabase.class);
        }
        Logger.debug();
        String curProcessName = ToolUtils.getCurProcessName(this);
        if (!StringUtils.isEmpty(curProcessName) && !StringUtils.isEmpty(str) && curProcessName.endsWith(":ad") && Build.VERSION.SDK_INT < 19) {
            str2 = "ad_" + str2;
            Logger.debug();
        }
        return super.openOrCreateDatabase(str2, i, cursorFactory2);
    }
}
