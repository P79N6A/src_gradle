package com.ss.android.ugc.aweme.net.a;

import a.g;
import a.i;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.frameworks.baselib.network.http.b.a;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ttnet.TTNetInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.net.ab;
import java.net.CookieHandler;
import java.net.URI;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3635a;

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f3636b = i.f1051a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f3637c;

    /* renamed from: d  reason: collision with root package name */
    private static byte[] f3638d = new byte[1];

    /* renamed from: e  reason: collision with root package name */
    private static i<Boolean> f3639e;

    private static boolean d() {
        if (Build.VERSION.SDK_INT <= 19) {
            return true;
        }
        return false;
    }

    @Nullable
    public static p a() {
        if (PatchProxy.isSupport(new Object[0], null, f3635a, true, 60895, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], null, f3635a, true, 60895, new Class[0], p.class);
        }
        if (c() == null) {
            return null;
        }
        return c().f56880b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|(2:12|13)|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3635a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = 0
            r4 = 1
            r5 = 60896(0xede0, float:8.5333E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f3635a
            r5 = 1
            r6 = 60896(0xede0, float:8.5333E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            boolean r0 = f3637c
            if (r0 == 0) goto L_0x002a
            return
        L_0x002a:
            byte[] r0 = f3638d
            monitor-enter(r0)
            boolean r1 = f3637c     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0039
            byte[] r1 = f3638d     // Catch:{ Throwable -> 0x0039 }
            r1.wait()     // Catch:{ Throwable -> 0x0039 }
            r1 = 1
            f3637c = r1     // Catch:{ Throwable -> 0x0039 }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.a.j.b():void");
    }

    @Nullable
    private static q c() {
        if (PatchProxy.isSupport(new Object[0], null, f3635a, true, 60894, new Class[0], q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[0], null, f3635a, true, 60894, new Class[0], q.class);
        }
        return q.a();
    }

    private static boolean e() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f3635a, true, 60898, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f3635a, true, 60898, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT == 18) {
                return true;
            }
            if (Build.VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
            } else {
                str = Build.SUPPORTED_ABIS[0];
            }
            if (!"x86".equals(str)) {
                if (!"x86_64".equals(str)) {
                    return false;
                }
            }
            new StringBuilder("Cronet unsupported CPU arch: ").append(str);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static void a(Context context, boolean z) {
        Context context2 = context;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f3635a, true, 60891, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, null, f3635a, true, 60891, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        TTNetInit.useCustomizedCookieStoreName();
        if (!z2) {
            try {
                CookieSyncManager.createInstance(a().f56867b);
                CookieManager instance = CookieManager.getInstance();
                instance.setAcceptCookie(true);
                CookieHandler.setDefault(new ab(a().f56867b, instance, n.f56862b));
                e.a((e.h) new e.h() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f56852a;

                    public final List<String> d(String str) {
                        if (PatchProxy.isSupport(new Object[]{str}, this, f56852a, false, 60905, new Class[]{String.class}, List.class)) {
                            return (List) PatchProxy.accessDispatch(new Object[]{str}, this, f56852a, false, 60905, new Class[]{String.class}, List.class);
                        }
                        List<String> shareCookieHostList = NetworkUtils.getShareCookieHostList(str);
                        if (shareCookieHostList != null && !shareCookieHostList.contains(NetworkUtils.getShareCookieHost())) {
                            shareCookieHostList.add(NetworkUtils.getShareCookieHost());
                        }
                        return shareCookieHostList;
                    }

                    public final List<String> a(CookieManager cookieManager, a aVar, URI uri) {
                        String str;
                        CookieManager cookieManager2 = cookieManager;
                        if (PatchProxy.isSupport(new Object[]{cookieManager2, aVar, uri}, this, f56852a, false, 60904, new Class[]{CookieManager.class, a.class, URI.class}, List.class)) {
                            return (List) PatchProxy.accessDispatch(new Object[]{cookieManager2, aVar, uri}, this, f56852a, false, 60904, new Class[]{CookieManager.class, a.class, URI.class}, List.class);
                        }
                        if (uri != null) {
                            str = uri.toString();
                        } else {
                            str = null;
                        }
                        return NetworkUtils.getShareCookie(cookieManager2, str);
                    }
                });
            } catch (Throwable th) {
                if (ToolUtils.isMainProcess(context) && Thread.currentThread() != context.getMainLooper().getThread()) {
                    new Handler(context.getMainLooper()).post(new o(context2, z2));
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error", th.getMessage());
                    } catch (JSONException unused) {
                    }
                    n.b("async_init_cookie_manager_fail", "", jSONObject);
                }
            }
        }
    }

    public static void a(@NonNull p pVar, @Nullable Runnable runnable) {
        p pVar2 = pVar;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{pVar2, runnable2}, null, f3635a, true, 60890, new Class[]{p.class, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2, runnable2}, null, f3635a, true, 60890, new Class[]{p.class, Runnable.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{pVar2}, null, q.f56878a, true, 60909, new Class[]{p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2}, null, q.f56878a, true, 60909, new Class[]{p.class}, Void.TYPE);
        } else {
            q.f56879c = new q(pVar2);
        }
        if (!ToolUtils.isMainProcess(pVar2.f56867b)) {
            f3639e = i.b((Callable<TResult>) new k<TResult>(pVar2));
        } else {
            f3639e = i.a((Callable<TResult>) new l<TResult>(pVar2), (Executor) f3636b);
        }
        if (f3639e != null) {
            f3639e = f3639e.a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(runnable2, pVar2), (Executor) f3636b);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0134 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Boolean a(@android.support.annotation.Nullable java.lang.Runnable r26, @android.support.annotation.NonNull com.ss.android.ugc.aweme.net.a.p r27) throws java.lang.Exception {
        /*
            r1 = r27
            if (r26 == 0) goto L_0x0007
            r26.run()
        L_0x0007:
            android.app.Application r0 = r1.f56867b
            r9 = 1
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r10 = 0
            r2[r10] = r0
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f3635a
            r5 = 1
            r6 = 60892(0xeddc, float:8.5328E-41)
            java.lang.Class[] r7 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r10] = r8
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f3635a
            r14 = 1
            r15 = 60892(0xeddc, float:8.5328E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0168
        L_0x003e:
            long r11 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.net.a.p r2 = a()
            com.ss.android.ugc.aweme.net.f r2 = r2.f56869d
            com.bytedance.ies.net.a.a.f20845a = r2
            com.ss.android.ugc.aweme.net.a.p r2 = a()
            com.bytedance.ttnet.c r2 = r2.f56870e
            com.bytedance.ttnet.TTNetInit.setTTNetDepend(r2)
            boolean r2 = d()
            r3 = 0
            if (r2 != 0) goto L_0x0064
            boolean r2 = com.ss.android.common.util.ToolUtils.isMainProcess(r0)
            if (r2 == 0) goto L_0x0064
            com.bytedance.ttnet.TTNetInit.setFirstRequestWaitTime(r3)
        L_0x0064:
            java.lang.String r2 = com.ss.android.common.util.ToolUtils.getCurProcessName(r0)
            if (r2 == 0) goto L_0x009f
            java.lang.String r5 = "miniapp"
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x009f
            boolean r2 = d()
            if (r2 != 0) goto L_0x007b
            com.bytedance.ttnet.TTNetInit.setFirstRequestWaitTime(r3)
        L_0x007b:
            com.ss.android.ugc.aweme.net.a.p r2 = a()
            android.app.Application r3 = r2.f56867b
            com.ss.android.ugc.aweme.net.a.d r4 = new com.ss.android.ugc.aweme.net.a.d
            r4.<init>()
            com.ss.android.ugc.aweme.net.a.b r5 = new com.ss.android.ugc.aweme.net.a.b
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            r5.<init>(r2)
            r6 = 0
            com.ss.android.ugc.aweme.net.a.p r2 = a()
            boolean r7 = r2.p
            boolean[] r8 = new boolean[r9]
            r8[r10] = r9
            r2 = r0
            com.bytedance.ttnet.TTNetInit.tryInitTTNet(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00c2
        L_0x009f:
            com.ss.android.ugc.aweme.net.a.p r2 = a()
            android.app.Application r3 = r2.f56867b
            com.ss.android.ugc.aweme.net.a.d r4 = new com.ss.android.ugc.aweme.net.a.d
            r4.<init>()
            com.ss.android.ugc.aweme.net.a.b r5 = new com.ss.android.ugc.aweme.net.a.b
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            r5.<init>(r2)
            r6 = 0
            com.ss.android.ugc.aweme.net.a.p r2 = a()
            boolean r7 = r2.p
            boolean[] r8 = new boolean[r9]
            r8[r10] = r10
            r2 = r0
            com.bytedance.ttnet.TTNetInit.tryInitTTNet(r2, r3, r4, r5, r6, r7, r8)
        L_0x00c2:
            boolean r2 = e()     // Catch:{ Throwable -> 0x0140 }
            if (r2 == 0) goto L_0x00ce
            com.bytedance.ttnet.config.a.a((android.content.Context) r0)     // Catch:{ Throwable -> 0x0140 }
            com.bytedance.ttnet.config.a.o = r9     // Catch:{ Throwable -> 0x0140 }
            goto L_0x00d4
        L_0x00ce:
            com.bytedance.ttnet.config.a.a((android.content.Context) r0)     // Catch:{ Throwable -> 0x0140 }
            com.bytedance.ttnet.config.a.c((boolean) r9)     // Catch:{ Throwable -> 0x0140 }
        L_0x00d4:
            org.chromium.d r0 = org.chromium.d.a()     // Catch:{ Throwable -> 0x0140 }
            com.ss.android.ugc.aweme.net.a.p r2 = a()     // Catch:{ Throwable -> 0x0140 }
            com.bytedance.ttnet.a.a r2 = r2.f56868c     // Catch:{ Throwable -> 0x0140 }
            r0.setAdapter(r2)     // Catch:{ Throwable -> 0x0140 }
            org.chromium.c r0 = org.chromium.c.a()     // Catch:{ Throwable -> 0x0140 }
            com.ss.android.ugc.aweme.net.a.p r2 = a()     // Catch:{ Throwable -> 0x0140 }
            com.bytedance.ttnet.a.a r2 = r2.f56868c     // Catch:{ Throwable -> 0x0140 }
            if (r2 == 0) goto L_0x0134
            java.lang.Class r3 = r2.getClass()     // Catch:{ Throwable -> 0x0134 }
            if (r3 != 0) goto L_0x00f4
            goto L_0x0134
        L_0x00f4:
            java.util.List r3 = org.chromium.f.a((java.lang.Class) r3)     // Catch:{ Throwable -> 0x0134 }
            if (r3 == 0) goto L_0x0134
            boolean r4 = r3.isEmpty()     // Catch:{ Throwable -> 0x0134 }
            if (r4 == 0) goto L_0x0101
            goto L_0x0134
        L_0x0101:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x0134 }
        L_0x0105:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x0134 }
            if (r4 == 0) goto L_0x0134
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x0134 }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ Throwable -> 0x0134 }
            java.lang.String r5 = "com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider"
            java.lang.String r4 = r4.getName()     // Catch:{ Throwable -> 0x0134 }
            boolean r4 = r5.equals(r4)     // Catch:{ Throwable -> 0x0134 }
            if (r4 == 0) goto L_0x0105
            org.chromium.d r3 = org.chromium.d.a()     // Catch:{ Throwable -> 0x0134 }
            boolean r3 = r3.loggerDebug()     // Catch:{ Throwable -> 0x0134 }
            if (r3 == 0) goto L_0x0132
            org.chromium.d r3 = org.chromium.d.a()     // Catch:{ Throwable -> 0x0134 }
            java.lang.String r4 = "CronetAppProviderManager"
            java.lang.String r5 = "inject CronetAppProviderManager success"
            r3.loggerD(r4, r5)     // Catch:{ Throwable -> 0x0134 }
        L_0x0132:
            r0.f84073a = r2     // Catch:{ Throwable -> 0x0134 }
        L_0x0134:
            com.bytedance.ttnet.TTNetInit.preInitCronetKernel()     // Catch:{ Throwable -> 0x0140 }
            com.ss.android.ugc.aweme.net.a.p r0 = a()     // Catch:{ Throwable -> 0x0140 }
            boolean r0 = r0.o     // Catch:{ Throwable -> 0x0140 }
            com.bytedance.ttnet.TTNetInit.setEnableURLDispatcher(r0)     // Catch:{ Throwable -> 0x0140 }
        L_0x0140:
            com.ss.android.ugc.aweme.net.a.j$2 r0 = new com.ss.android.ugc.aweme.net.a.j$2
            r0.<init>()
            com.bytedance.ttnet.utils.e.a((com.bytedance.ttnet.utils.e.a) r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r11
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r4 = "ttnet_init_time"
            r0.put(r4, r2)     // Catch:{ JSONException -> 0x0157 }
        L_0x0157:
            java.lang.String r4 = "ttnet_init_time"
            java.lang.String r5 = ""
            com.ss.android.ugc.aweme.base.n.b((java.lang.String) r4, (java.lang.String) r5, (org.json.JSONObject) r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "ttnet init cost time:"
            r0.<init>(r4)
            r0.append(r2)
        L_0x0168:
            android.app.Application r0 = r1.f56867b
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            r2 = 0
            com.meituan.robust.ChangeQuickRedirect r3 = f3635a
            r4 = 1
            r5 = 60893(0xeddd, float:8.5329E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r10] = r7
            java.lang.Class r7 = java.lang.Void.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x019c
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r10] = r0
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f3635a
            r5 = 1
            r6 = 60893(0xeddd, float:8.5329E-41)
            java.lang.Class[] r7 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r7[r10] = r0
            java.lang.Class r8 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
        L_0x0199:
            r0 = 0
            goto L_0x03a4
        L_0x019c:
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.sec.c.b.f63758a
            r14 = 1
            r15 = 71151(0x115ef, float:9.9704E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x01db
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.sec.c.b.f63758a
            r14 = 1
            r15 = 71151(0x115ef, float:9.9704E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x01f8
        L_0x01db:
            java.lang.String r3 = com.ss.android.ugc.aweme.sec.c.b.a(r0)
            if (r3 == 0) goto L_0x01e9
            java.lang.String r4 = ":"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L_0x01f7
        L_0x01e9:
            if (r3 == 0) goto L_0x01f7
            java.lang.String r4 = r0.getPackageName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01f7
            r3 = 1
            goto L_0x01f8
        L_0x01f7:
            r3 = 0
        L_0x01f8:
            if (r3 == 0) goto L_0x037f
            com.ss.android.ugc.aweme.net.a.p r3 = a()
            java.lang.String r4 = r3.g
            if (r4 == 0) goto L_0x0206
            java.lang.String r4 = r3.g
        L_0x0204:
            r15 = r4
            goto L_0x0209
        L_0x0206:
            java.lang.String r4 = ""
            goto L_0x0204
        L_0x0209:
            java.lang.String r4 = r3.h
            if (r4 == 0) goto L_0x0210
            java.lang.String r4 = r3.h
            goto L_0x0212
        L_0x0210:
            java.lang.String r4 = ""
        L_0x0212:
            java.lang.String r5 = r3.i
            if (r5 == 0) goto L_0x021a
            java.lang.String r5 = r3.i
        L_0x0218:
            r13 = r5
            goto L_0x021d
        L_0x021a:
            java.lang.String r5 = ""
            goto L_0x0218
        L_0x021d:
            boolean r12 = r3.j
            int r14 = r3.f56871f
            r3 = 6
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r10] = r0
            r5[r9] = r13
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r7 = 2
            r5[r7] = r6
            r6 = 3
            r5[r6] = r15
            r8 = 4
            r5[r8] = r4
            java.lang.Byte r11 = java.lang.Byte.valueOf(r12)
            r23 = 5
            r5[r23] = r11
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.sec.a.f63719a
            r19 = 1
            r20 = 71078(0x115a6, float:9.9601E-41)
            java.lang.Class[] r11 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r16 = android.content.Context.class
            r11[r10] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11[r9] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r11[r7] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11[r6] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11[r8] = r16
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11[r23] = r16
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r5
            r21 = r11
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r5 == 0) goto L_0x02b0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r10] = r0
            r5[r9] = r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r5[r7] = r0
            r5[r6] = r15
            r5[r8] = r4
            java.lang.Byte r0 = java.lang.Byte.valueOf(r12)
            r5[r23] = r0
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.sec.a.f63719a
            r19 = 1
            r20 = 71078(0x115a6, float:9.9601E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r0[r10] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r0[r7] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r6] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r8] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r0[r23] = r3
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r5
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x037f
        L_0x02b0:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "language"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r3)
            java.lang.String r3 = "appName"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r3)
            java.lang.String r3 = "channel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r3)
            com.ss.android.ugc.aweme.sec.c.c r3 = com.ss.android.ugc.aweme.sec.c.c.f63761b
            java.lang.String r5 = "DmtSec"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "init language = "
            r6.<init>(r7)
            r6.append(r13)
            java.lang.String r7 = ", aid = "
            r6.append(r7)
            r6.append(r14)
            java.lang.String r7 = ", appName = "
            r6.append(r7)
            r6.append(r15)
            java.lang.String r7 = ", channel= "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r3.a(r5, r6)
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = (long) r14
            com.ss.sys.ces.out.ISdk r3 = com.ss.sys.ces.out.StcSDKFactory.getSDK((android.content.Context) r0, (long) r9)
            com.ss.android.ugc.aweme.sec.a.f63721c = r3
            long r9 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.sec.c.c r3 = com.ss.android.ugc.aweme.sec.c.c.f63761b
            java.lang.String r11 = "DmtSec"
            r24 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "init getSdkTime = "
            r1.<init>(r2)
            long r9 = r9 - r7
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r3.a(r11, r1)
            long r1 = java.lang.System.currentTimeMillis()
            com.ss.sys.ces.out.ISdk r3 = com.ss.android.ugc.aweme.sec.a.f63721c
            if (r3 == 0) goto L_0x0328
            r7 = 0
            r3.SetRegionType(r7)
        L_0x0328:
            long r7 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.sec.c.c r3 = com.ss.android.ugc.aweme.sec.c.c.f63761b
            java.lang.String r9 = "DmtSec"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "init setRegionTime = "
            r10.<init>(r11)
            long r7 = r7 - r1
            r10.append(r7)
            java.lang.String r1 = r10.toString()
            r3.a(r9, r1)
            com.ss.android.ugc.aweme.sec.b.a r1 = new com.ss.android.ugc.aweme.sec.b.a
            com.ss.sys.ces.out.ISdk r2 = com.ss.android.ugc.aweme.sec.a.f63721c
            r1.<init>(r2)
            com.ss.android.ugc.aweme.sec.a.f63723e = r1
            r1 = 1000(0x3e8, double:4.94E-321)
            a.i r1 = a.i.a((long) r1)
            com.ss.android.ugc.aweme.sec.a$a r2 = new com.ss.android.ugc.aweme.sec.a$a
            r11 = r2
            r16 = r4
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            a.g r2 = (a.g) r2
            java.util.concurrent.ExecutorService r0 = a.i.f1051a
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r1.a((a.g<TResult, TContinuationResult>) r2, (java.util.concurrent.Executor) r0)
            long r0 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.sec.c.c r2 = com.ss.android.ugc.aweme.sec.c.c.f63761b
            java.lang.String r3 = "DmtSec"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "init Time = "
            r4.<init>(r7)
            long r0 = r0 - r5
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.a(r3, r0)
            goto L_0x0381
        L_0x037f:
            r24 = r1
        L_0x0381:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "sec init cost time:"
            r2.<init>(r3)
            r2.append(r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "sec_init_time"
            r2.put(r3, r0)     // Catch:{ JSONException -> 0x039b }
        L_0x039b:
            java.lang.String r0 = "sec_init_time"
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.base.n.b((java.lang.String) r0, (java.lang.String) r1, (org.json.JSONObject) r2)
            goto L_0x0199
        L_0x03a4:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            com.meituan.robust.ChangeQuickRedirect r3 = f3635a
            r4 = 1
            r5 = 60897(0xede1, float:8.5335E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x03c8
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f3635a
            r5 = 1
            r6 = 60897(0xede1, float:8.5335E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x03d4
        L_0x03c8:
            byte[] r1 = f3638d
            monitor-enter(r1)
            r0 = 1
            f3637c = r0     // Catch:{ all -> 0x03d7 }
            byte[] r0 = f3638d     // Catch:{ all -> 0x03d7 }
            r0.notifyAll()     // Catch:{ all -> 0x03d7 }
            monitor-exit(r1)     // Catch:{ all -> 0x03d7 }
        L_0x03d4:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x03d7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03d7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.a.j.a(java.lang.Runnable, com.ss.android.ugc.aweme.net.a.p):java.lang.Boolean");
    }
}
