package com.bytedance.frameworks.plugin.b;

import android.app.Instrumentation;
import android.content.ComponentCallbacks;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.frameworks.plugin.Mira;
import com.bytedance.frameworks.plugin.core.f;
import com.bytedance.frameworks.plugin.core.h;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.e.b;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.f.l;
import com.bytedance.frameworks.plugin.pm.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Class f2155a;

    /* renamed from: b  reason: collision with root package name */
    public static Object f2156b;

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, f> f2157c = new ConcurrentHashMap(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Handler f2158d = new Handler(Looper.getMainLooper()) {
    };

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f2159e = false;

    public static Object b() {
        try {
            return com.bytedance.frameworks.plugin.e.a.a(a(), "mBoundApplication");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Instrumentation c() {
        try {
            return (Instrumentation) b.a(a(), "getInstrumentation", new Object[0]);
        } catch (Exception e2) {
            g.a("ActivityThreadHelper", "ERROR in getInstrumentation.", e2);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized java.lang.Object a() {
        /*
            java.lang.Class<com.bytedance.frameworks.plugin.b.a> r0 = com.bytedance.frameworks.plugin.b.a.class
            monitor-enter(r0)
            java.lang.Object r1 = f2156b     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0051
            java.lang.Class r1 = f2155a     // Catch:{ Exception -> 0x0051 }
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0051 }
            f2155a = r1     // Catch:{ Exception -> 0x0051 }
        L_0x0013:
            java.lang.Class r1 = f2155a     // Catch:{ Exception -> 0x0051 }
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r1 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class) r1, (java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ Exception -> 0x0051 }
            f2156b = r1     // Catch:{ Exception -> 0x0051 }
            if (r1 != 0) goto L_0x0051
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x0051 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0051 }
            if (r1 == r2) goto L_0x0051
            java.lang.Object r1 = new java.lang.Object     // Catch:{ Exception -> 0x0051 }
            r1.<init>()     // Catch:{ Exception -> 0x0051 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ Exception -> 0x0051 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0051 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0051 }
            com.bytedance.frameworks.plugin.b.a$2 r3 = new com.bytedance.frameworks.plugin.b.a$2     // Catch:{ Exception -> 0x0051 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0051 }
            r2.post(r3)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r2 = f2156b     // Catch:{ Exception -> 0x0051 }
            if (r2 != 0) goto L_0x0051
            monitor-enter(r1)     // Catch:{ Exception -> 0x0051 }
            r1.wait()     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x004d
        L_0x004b:
            r2 = move-exception
            goto L_0x004f
        L_0x004d:
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            goto L_0x0051
        L_0x004f:
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            throw r2     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            java.lang.Object r1 = f2156b     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)
            return r1
        L_0x0055:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.b.a.a():java.lang.Object");
    }

    public static f a(String str) {
        return f2157c.get(str);
    }

    private static Object a(ApplicationInfo applicationInfo) {
        if (applicationInfo != null) {
            try {
                Object a2 = a();
                if (Build.VERSION.SDK_INT >= 11) {
                    return b.a(a2, "getPackageInfoNoCheck", applicationInfo, b.a());
                }
                return b.a(a2, "getPackageInfoNoCheck", applicationInfo);
            } catch (Exception e2) {
                g.a("ActivityThreadHelper", "ERROR in createLoadedApk.", e2);
            }
        }
        return null;
    }

    public static boolean b(String str) {
        com.bytedance.frameworks.plugin.a.b a2 = com.bytedance.frameworks.plugin.d.b.a().a(str);
        if (a2 != null && a2.h) {
            return true;
        }
        a(c.b(str, 0), (ComponentInfo) null);
        if (a(str) != null) {
            return true;
        }
        return false;
    }

    private static boolean c(String str) {
        com.bytedance.c.a aVar = com.bytedance.c.a.a.a().f2107a;
        if ((aVar == null || aVar.f2096c) && c.d(str) && Mira.b()) {
            return true;
        }
        return false;
    }

    public static void a(ApplicationInfo applicationInfo, ComponentInfo componentInfo) {
        b(applicationInfo, componentInfo);
    }

    private static void a(ApplicationInfo applicationInfo, Object obj) {
        if (!c(applicationInfo.packageName)) {
            if (g.a()) {
                g.a(String.format("ShareRes false: %s", new Object[]{applicationInfo.packageName}));
            }
            return;
        }
        try {
            final Resources a2 = h.a().a(applicationInfo.sourceDir);
            g.b("hookResource on " + applicationInfo.packageName + ". resources = " + l.b(a2.getAssets()));
            if (a2 != null) {
                com.bytedance.frameworks.plugin.e.a.a(obj, "mResources", (Object) a2);
                if (Build.VERSION.SDK_INT > 23) {
                    e.a().registerComponentCallbacks(new ComponentCallbacks() {
                        public final void onLowMemory() {
                        }

                        public final void onConfigurationChanged(Configuration configuration) {
                            a2.updateConfiguration(configuration, e.a().getResources().getDisplayMetrics());
                        }
                    });
                }
            }
        } catch (Throwable th) {
            g.a("ActivityThreadHelper", "ERROR in hookResource.", th);
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, java.lang.ClassLoader] */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r6v40, types: [com.bytedance.frameworks.plugin.core.e] */
    /* JADX WARNING: type inference failed for: r6v41, types: [com.bytedance.frameworks.plugin.core.f] */
    /* JADX WARNING: type inference failed for: r6v42, types: [com.bytedance.frameworks.plugin.core.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x026c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x01ec */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void b(final android.content.pm.ApplicationInfo r14, android.content.pm.ComponentInfo r15) {
        /*
            java.lang.Class<com.bytedance.frameworks.plugin.b.a> r0 = com.bytedance.frameworks.plugin.b.a.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            java.lang.String r2 = "EXEC doLoad: applicationInfo="
            r1.<init>(r2)     // Catch:{ all -> 0x026d }
            r1.append(r14)     // Catch:{ all -> 0x026d }
            java.lang.String r2 = " componentInfo="
            r1.append(r2)     // Catch:{ all -> 0x026d }
            r1.append(r15)     // Catch:{ all -> 0x026d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x026d }
            com.bytedance.frameworks.plugin.f.g.b(r1)     // Catch:{ all -> 0x026d }
            if (r14 == 0) goto L_0x026b
            java.lang.String r1 = r14.className     // Catch:{ all -> 0x026d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x026d }
            if (r1 == 0) goto L_0x0028
            goto L_0x026b
        L_0x0028:
            java.lang.Object r1 = a()     // Catch:{ all -> 0x026d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            java.lang.String r3 = "EXEC doLoad: activityThread="
            r2.<init>(r3)     // Catch:{ all -> 0x026d }
            r2.append(r1)     // Catch:{ all -> 0x026d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x026d }
            com.bytedance.frameworks.plugin.f.g.b(r2)     // Catch:{ all -> 0x026d }
            if (r1 == 0) goto L_0x0269
            r2 = 0
            java.lang.String r3 = "mPackages"
            java.lang.Object r1 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r1, (java.lang.String) r3)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0050
        L_0x0047:
            r1 = move-exception
            java.lang.String r3 = "ActivityThreadHelper"
            java.lang.String r4 = "EXEC doLoad: get mPackages failed."
            com.bytedance.frameworks.plugin.f.g.a(r3, r4, r1)     // Catch:{ all -> 0x026d }
            r1 = r2
        L_0x0050:
            if (r1 == 0) goto L_0x0269
            boolean r3 = r1 instanceof java.util.Map     // Catch:{ all -> 0x026d }
            if (r3 == 0) goto L_0x0269
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x026d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            java.lang.String r4 = "EXEC doLoad: packages contains "
            r3.<init>(r4)     // Catch:{ all -> 0x026d }
            java.lang.String r4 = r14.packageName     // Catch:{ all -> 0x026d }
            r3.append(r4)     // Catch:{ all -> 0x026d }
            java.lang.String r4 = ":"
            r3.append(r4)     // Catch:{ all -> 0x026d }
            java.lang.String r4 = r14.packageName     // Catch:{ all -> 0x026d }
            boolean r4 = r1.containsKey(r4)     // Catch:{ all -> 0x026d }
            r3.append(r4)     // Catch:{ all -> 0x026d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x026d }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r3)     // Catch:{ all -> 0x026d }
            java.lang.String r3 = r14.packageName     // Catch:{ all -> 0x026d }
            boolean r1 = r1.containsKey(r3)     // Catch:{ all -> 0x026d }
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x022d
            java.lang.String r1 = "EXEC doLoad: loading..."
            com.bytedance.frameworks.plugin.f.g.b(r1)     // Catch:{ all -> 0x026d }
            java.lang.String r1 = "ActivityThreadHelper"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            java.lang.String r6 = "load plugin: "
            r5.<init>(r6)     // Catch:{ all -> 0x026d }
            java.lang.String r6 = r14.packageName     // Catch:{ all -> 0x026d }
            r5.append(r6)     // Catch:{ all -> 0x026d }
            java.lang.String r6 = " mainThread: "
            r5.append(r6)     // Catch:{ all -> 0x026d }
            android.os.Looper r6 = android.os.Looper.myLooper()     // Catch:{ all -> 0x026d }
            android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x026d }
            if (r6 != r7) goto L_0x00a7
            r6 = 1
            goto L_0x00a8
        L_0x00a7:
            r6 = 0
        L_0x00a8:
            r5.append(r6)     // Catch:{ all -> 0x026d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x026d }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ all -> 0x026d }
            java.lang.String r1 = r14.packageName     // Catch:{ all -> 0x026d }
            java.lang.String r1 = com.bytedance.frameworks.plugin.pm.c.h(r1)     // Catch:{ all -> 0x026d }
            java.lang.String r5 = r14.packageName     // Catch:{ all -> 0x026d }
            boolean r5 = com.bytedance.frameworks.plugin.pm.c.i(r5)     // Catch:{ all -> 0x026d }
            java.lang.Object r12 = a((android.content.pm.ApplicationInfo) r14)     // Catch:{ all -> 0x026d }
            if (r12 != 0) goto L_0x00cd
            java.lang.String r14 = "ActivityThreadHelper"
            java.lang.String r15 = "ERROR in createLoadedApk"
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x026d }
            monitor-exit(r0)
            return
        L_0x00cd:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r7 = r14.nativeLibraryDir     // Catch:{ Exception -> 0x01f3 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x01f3 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x01f3 }
            java.io.File r6 = r6.getParentFile()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r8 = "dalvik-cache"
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r6 = r14.sourceDir     // Catch:{ Exception -> 0x01f3 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01f3 }
            if (r6 == 0) goto L_0x0117
            java.lang.String r6 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            int r6 = com.bytedance.frameworks.plugin.pm.c.c(r6)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r8 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r6 = com.bytedance.frameworks.plugin.core.g.a(r8, r6)     // Catch:{ Exception -> 0x01f3 }
            r14.sourceDir = r6     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r6 = r14.sourceDir     // Catch:{ Exception -> 0x01f3 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01f3 }
            if (r6 == 0) goto L_0x0117
            java.lang.String r2 = "ActivityThreadHelper"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f3 }
            r3.<init>()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r5 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            r3.append(r5)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r5 = " application#sourceDir is empty!!!"
            r3.append(r5)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01f3 }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x01f3 }
            monitor-exit(r0)
            return
        L_0x0117:
            java.lang.String r6 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            com.bytedance.frameworks.plugin.core.f r6 = a((java.lang.String) r6)     // Catch:{ Exception -> 0x01f3 }
            if (r6 != 0) goto L_0x01a8
            java.lang.String r6 = "com.ss.android.video"
            java.lang.String r8 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x01f3 }
            if (r6 != 0) goto L_0x0190
            java.lang.String r6 = "com.ss.android.wenda"
            java.lang.String r8 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x01f3 }
            if (r6 != 0) goto L_0x0190
            java.lang.String r6 = "com.ss.android.ugc"
            java.lang.String r8 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x01f3 }
            if (r6 != 0) goto L_0x0190
            java.lang.String r6 = "com.bytedance.concernrelated"
            java.lang.String r8 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x01f3 }
            if (r6 != 0) goto L_0x0190
            java.lang.String r6 = "com.ss.android.dynamicdocker"
            java.lang.String r8 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x01f3 }
            if (r6 == 0) goto L_0x0152
            goto L_0x0190
        L_0x0152:
            java.lang.String r6 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            com.bytedance.frameworks.plugin.a.a r6 = com.bytedance.frameworks.plugin.pm.c.f(r6)     // Catch:{ Exception -> 0x01f3 }
            if (r6 == 0) goto L_0x0178
            boolean r6 = r6.f2147c     // Catch:{ Exception -> 0x01f3 }
            if (r6 == 0) goto L_0x0178
            if (r5 != 0) goto L_0x0178
            com.bytedance.frameworks.plugin.core.e r13 = new com.bytedance.frameworks.plugin.core.e     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r8 = r14.sourceDir     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r9 = r7.getPath()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r10 = r14.nativeLibraryDir     // Catch:{ Exception -> 0x01f3 }
            java.lang.ClassLoader r11 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x01f3 }
            r6 = r13
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01f3 }
            goto L_0x01a9
        L_0x0178:
            com.bytedance.frameworks.plugin.core.f r13 = new com.bytedance.frameworks.plugin.core.f     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r8 = r14.sourceDir     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r9 = r7.getPath()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r10 = r14.nativeLibraryDir     // Catch:{ Exception -> 0x01f3 }
            java.lang.ClassLoader r11 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x01f3 }
            r6 = r13
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01f3 }
            goto L_0x01a9
        L_0x0190:
            com.bytedance.frameworks.plugin.core.e r13 = new com.bytedance.frameworks.plugin.core.e     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r8 = r14.sourceDir     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r9 = r7.getPath()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r10 = r14.nativeLibraryDir     // Catch:{ Exception -> 0x01f3 }
            java.lang.ClassLoader r11 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x01f3 }
            r6 = r13
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01f3 }
            goto L_0x01a9
        L_0x01a8:
            r13 = r6
        L_0x01a9:
            monitor-enter(r12)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r6 = "mPackageName"
            com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r12, (java.lang.String) r6, (java.lang.Object) r1)     // Catch:{ all -> 0x01f0 }
            java.lang.String r6 = "mClassLoader"
            if (r5 == 0) goto L_0x01b5
            r5 = r13
            goto L_0x01bd
        L_0x01b5:
            android.content.Context r5 = com.bytedance.frameworks.plugin.e.a()     // Catch:{ all -> 0x01f0 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ all -> 0x01f0 }
        L_0x01bd:
            com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r12, (java.lang.String) r6, (java.lang.Object) r5)     // Catch:{ all -> 0x01f0 }
            monitor-exit(r12)     // Catch:{ all -> 0x01f0 }
            java.util.Map<java.lang.String, com.bytedance.frameworks.plugin.core.f> r5 = f2157c     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r6 = r14.packageName     // Catch:{ Exception -> 0x01f3 }
            r5.put(r6, r13)     // Catch:{ Exception -> 0x01f3 }
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x01f3 }
            r5.setContextClassLoader(r13)     // Catch:{ Exception -> 0x01f3 }
            if (r15 == 0) goto L_0x01ec
            java.lang.String r5 = r15.processName     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r6 = "android.os.Process"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r7 = "setArgV0"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x01ec }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r4] = r9     // Catch:{ Exception -> 0x01ec }
            java.lang.reflect.Method r6 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class<?>) r6, (java.lang.String) r7, (java.lang.Class<?>[]) r8)     // Catch:{ Exception -> 0x01ec }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01ec }
            r3[r4] = r5     // Catch:{ Exception -> 0x01ec }
            r6.invoke(r2, r3)     // Catch:{ Exception -> 0x01ec }
        L_0x01ec:
            a((android.content.pm.ApplicationInfo) r14, (java.lang.Object) r12)     // Catch:{ Exception -> 0x01f3 }
            goto L_0x01fb
        L_0x01f0:
            r2 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01f0 }
            throw r2     // Catch:{ Exception -> 0x01f3 }
        L_0x01f3:
            r2 = move-exception
            java.lang.String r3 = "ActivityThreadHelper"
            java.lang.String r5 = "ERROR in makeApplication."
            com.bytedance.frameworks.plugin.f.g.a(r3, r5, r2)     // Catch:{ all -> 0x026d }
        L_0x01fb:
            if (r15 == 0) goto L_0x0200
            java.lang.String r15 = r15.processName     // Catch:{ all -> 0x026d }
            goto L_0x0202
        L_0x0200:
            java.lang.String r15 = r14.processName     // Catch:{ all -> 0x026d }
        L_0x0202:
            java.lang.String r2 = r14.packageName     // Catch:{ all -> 0x026d }
            boolean r2 = com.bytedance.frameworks.plugin.pm.c.i(r2)     // Catch:{ all -> 0x026d }
            if (r2 != 0) goto L_0x0213
            android.content.Context r2 = com.bytedance.frameworks.plugin.e.a()     // Catch:{ all -> 0x026d }
            java.lang.String r3 = r14.packageName     // Catch:{ all -> 0x026d }
            com.bytedance.frameworks.plugin.component.a.c.a(r2, r3, r15, r4)     // Catch:{ all -> 0x026d }
        L_0x0213:
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch:{ all -> 0x026d }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x026d }
            if (r2 != r3) goto L_0x0221
            a(r12, r15, r1, r14)     // Catch:{ all -> 0x026d }
            goto L_0x0269
        L_0x0221:
            android.os.Handler r2 = f2158d     // Catch:{ all -> 0x026d }
            com.bytedance.frameworks.plugin.b.a$3 r3 = new com.bytedance.frameworks.plugin.b.a$3     // Catch:{ all -> 0x026d }
            r3.<init>(r12, r15, r1, r14)     // Catch:{ all -> 0x026d }
            r2.post(r3)     // Catch:{ all -> 0x026d }
            monitor-exit(r0)
            return
        L_0x022d:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            java.lang.String r1 = "is MainProcess = "
            r15.<init>(r1)     // Catch:{ all -> 0x026d }
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x026d }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x026d }
            if (r1 != r2) goto L_0x023f
            goto L_0x0240
        L_0x023f:
            r3 = 0
        L_0x0240:
            r15.append(r3)     // Catch:{ all -> 0x026d }
            java.lang.String r1 = " waitingMainHandlerResource= "
            r15.append(r1)     // Catch:{ all -> 0x026d }
            boolean r1 = f2159e     // Catch:{ all -> 0x026d }
            r15.append(r1)     // Catch:{ all -> 0x026d }
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x026d }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r15)     // Catch:{ all -> 0x026d }
            android.os.Looper r15 = android.os.Looper.myLooper()     // Catch:{ all -> 0x026d }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x026d }
            if (r15 != r1) goto L_0x0269
            boolean r15 = f2159e     // Catch:{ all -> 0x026d }
            if (r15 == 0) goto L_0x0269
            java.lang.Object r15 = a((android.content.pm.ApplicationInfo) r14)     // Catch:{ all -> 0x026d }
            a((android.content.pm.ApplicationInfo) r14, (java.lang.Object) r15)     // Catch:{ all -> 0x026d }
        L_0x0269:
            monitor-exit(r0)
            return
        L_0x026b:
            monitor-exit(r0)
            return
        L_0x026d:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.b.a.b(android.content.pm.ApplicationInfo, android.content.pm.ComponentInfo):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077 A[Catch:{ Exception -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086 A[Catch:{ Exception -> 0x008c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Object r11, java.lang.String r12, java.lang.CharSequence r13, android.content.pm.ApplicationInfo r14) {
        /*
            java.lang.Object r0 = a()
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "EXEC doLoad: make Application..."
            com.bytedance.frameworks.plugin.f.g.b(r4)     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r4 = "mApplication"
            java.lang.Object r4 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r11, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0050 }
            android.app.Application r4 = (android.app.Application) r4     // Catch:{ Throwable -> 0x0050 }
            if (r4 == 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.String r5 = "android.app.LoadedApk"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Throwable -> 0x004e }
            java.lang.String r6 = "makeApplication"
            r7 = 2
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ Throwable -> 0x004e }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x004e }
            r8[r3] = r9     // Catch:{ Throwable -> 0x004e }
            java.lang.Class<android.app.Instrumentation> r9 = android.app.Instrumentation.class
            r8[r2] = r9     // Catch:{ Throwable -> 0x004e }
            java.lang.reflect.Method r5 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class<?>) r5, (java.lang.String) r6, (java.lang.Class<?>[]) r8)     // Catch:{ Throwable -> 0x004e }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ Throwable -> 0x004e }
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ Throwable -> 0x004e }
            r6[r3] = r7     // Catch:{ Throwable -> 0x004e }
            r6[r2] = r1     // Catch:{ Throwable -> 0x004e }
            java.lang.Object r1 = r5.invoke(r11, r6)     // Catch:{ Throwable -> 0x004e }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ Throwable -> 0x004e }
            java.lang.String r4 = r14.packageName     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r5 = r14.packageName     // Catch:{ Throwable -> 0x0050 }
            com.bytedance.frameworks.plugin.core.f r5 = a((java.lang.String) r5)     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r6 = r14.packageName     // Catch:{ Throwable -> 0x0050 }
            java.util.List r6 = com.bytedance.frameworks.plugin.pm.c.e(r6, r3)     // Catch:{ Throwable -> 0x0050 }
            com.bytedance.frameworks.plugin.component.broadcast.b.a(r4, r5, r6)     // Catch:{ Throwable -> 0x0050 }
            goto L_0x005c
        L_0x004e:
            r1 = move-exception
            goto L_0x0054
        L_0x0050:
            r4 = move-exception
            r10 = r4
            r4 = r1
            r1 = r10
        L_0x0054:
            java.lang.String r5 = "ActivityThreadHelper"
            java.lang.String r6 = "ERROR in makeApplication."
            com.bytedance.frameworks.plugin.f.g.a(r5, r6, r1)
            r1 = r4
        L_0x005c:
            java.lang.String r4 = "EXEC doLoad: installContentProviders..."
            com.bytedance.frameworks.plugin.f.g.b(r4)     // Catch:{ Exception -> 0x008e }
            java.lang.String r4 = "mApplication"
            java.lang.Object r11 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r11, (java.lang.String) r4)     // Catch:{ Exception -> 0x008e }
            android.app.Application r11 = (android.app.Application) r11     // Catch:{ Exception -> 0x008e }
            android.content.Context r1 = com.bytedance.frameworks.plugin.e.a()     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x008c }
            boolean r13 = android.text.TextUtils.equals(r13, r1)     // Catch:{ Exception -> 0x008c }
            if (r13 != 0) goto L_0x007e
            android.content.Context r13 = r11.getBaseContext()     // Catch:{ Exception -> 0x008c }
            com.bytedance.frameworks.plugin.b.c.a(r13)     // Catch:{ Exception -> 0x008c }
        L_0x007e:
            java.lang.String r13 = r14.packageName     // Catch:{ Exception -> 0x008c }
            boolean r13 = com.bytedance.frameworks.plugin.pm.c.i(r13)     // Catch:{ Exception -> 0x008c }
            if (r13 == 0) goto L_0x0097
            java.lang.String r13 = r14.packageName     // Catch:{ Exception -> 0x008c }
            com.bytedance.frameworks.plugin.component.a.c.a(r11, r13, r12, r2)     // Catch:{ Exception -> 0x008c }
            goto L_0x0097
        L_0x008c:
            r12 = move-exception
            goto L_0x0090
        L_0x008e:
            r12 = move-exception
            r11 = r1
        L_0x0090:
            java.lang.String r13 = "ActivityThreadHelper"
            java.lang.String r14 = "ERROR in installContentProviders."
            com.bytedance.frameworks.plugin.f.g.a(r13, r14, r12)
        L_0x0097:
            java.lang.String r12 = "EXEC doLoad: callApplicationOnCreate..."
            com.bytedance.frameworks.plugin.f.g.b(r12)     // Catch:{ Exception -> 0x00cc }
            android.app.Instrumentation r12 = c()     // Catch:{ Exception -> 0x00cc }
            if (r12 == 0) goto L_0x00a6
            boolean r12 = r12 instanceof com.bytedance.frameworks.plugin.hook.InstrumentationHook.PluginInstrumentation     // Catch:{ Exception -> 0x00cc }
            if (r12 != 0) goto L_0x00b8
        L_0x00a6:
            java.lang.String r12 = "mInstrumentation"
            java.lang.Object r12 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r0, (java.lang.String) r12)     // Catch:{ Exception -> 0x00cc }
            android.app.Instrumentation r12 = (android.app.Instrumentation) r12     // Catch:{ Exception -> 0x00cc }
            java.lang.String r13 = "mInstrumentation"
            com.bytedance.frameworks.plugin.hook.InstrumentationHook$PluginInstrumentation r14 = new com.bytedance.frameworks.plugin.hook.InstrumentationHook$PluginInstrumentation     // Catch:{ Exception -> 0x00cc }
            r14.<init>(r12)     // Catch:{ Exception -> 0x00cc }
            com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r0, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ Exception -> 0x00cc }
        L_0x00b8:
            android.app.Instrumentation r12 = c()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r13 = "callApplicationOnCreate"
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00cc }
            r14[r3] = r11     // Catch:{ Exception -> 0x00cc }
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00cc }
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            r11[r3] = r0     // Catch:{ Exception -> 0x00cc }
            com.bytedance.frameworks.plugin.e.b.a((java.lang.Object) r12, (java.lang.String) r13, (java.lang.Object[]) r14, (java.lang.Class<?>[]) r11)     // Catch:{ Exception -> 0x00cc }
            return
        L_0x00cc:
            r11 = move-exception
            java.lang.String r12 = "ActivityThreadHelper"
            java.lang.String r13 = "ERROR in callApplicationOnCreate."
            com.bytedance.frameworks.plugin.f.g.a(r12, r13, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.b.a.a(java.lang.Object, java.lang.String, java.lang.CharSequence, android.content.pm.ApplicationInfo):void");
    }
}
