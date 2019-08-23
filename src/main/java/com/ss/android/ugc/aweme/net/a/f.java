package com.ss.android.ugc.aweme.net.a;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;

public final class f extends com.ss.android.ugc.aweme.net.f {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f56843d;

    /* renamed from: e  reason: collision with root package name */
    private static String f56844e;

    public static boolean b() {
        if (Build.VERSION.SDK_INT == 18) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01bd, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ss.android.common.http.b a() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x01ce }
            com.meituan.robust.ChangeQuickRedirect r3 = f56843d     // Catch:{ all -> 0x01ce }
            r4 = 0
            r5 = 60869(0xedc5, float:8.5296E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x01ce }
            java.lang.Class<com.ss.android.common.http.b> r7 = com.ss.android.common.http.b.class
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01ce }
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x01ce }
            com.meituan.robust.ChangeQuickRedirect r4 = f56843d     // Catch:{ all -> 0x01ce }
            r5 = 0
            r6 = 60869(0xedc5, float:8.5296E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x01ce }
            java.lang.Class<com.ss.android.common.http.b> r8 = com.ss.android.common.http.b.class
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01ce }
            com.ss.android.common.http.b r0 = (com.ss.android.common.http.b) r0     // Catch:{ all -> 0x01ce }
            monitor-exit(r12)
            return r0
        L_0x002a:
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x01ce }
            r2 = 0
            com.meituan.robust.ChangeQuickRedirect r3 = f56843d     // Catch:{ all -> 0x01ce }
            r4 = 1
            r5 = 60868(0xedc4, float:8.5294E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x01ce }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x01ce }
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01ce }
            if (r1 == 0) goto L_0x004e
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x01ce }
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f56843d     // Catch:{ all -> 0x01ce }
            r5 = 1
            r6 = 60868(0xedc4, float:8.5294E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x01ce }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x01ce }
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01ce }
            goto L_0x00b8
        L_0x004e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ all -> 0x01ce }
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r2 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r1 = r1.getService(r2)     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r1 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r1     // Catch:{ all -> 0x01ce }
            if (r1 == 0) goto L_0x0062
            boolean r1 = r1.disableSyncShareCookieHost()     // Catch:{ all -> 0x01ce }
            if (r1 != 0) goto L_0x00b8
        L_0x0062:
            com.ss.android.ugc.aweme.app.x r1 = com.ss.android.ugc.aweme.app.x.a()     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.app.an r1 = r1.ae()     // Catch:{ all -> 0x01ce }
            java.lang.Object r1 = r1.c()     // Catch:{ all -> 0x01ce }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x01ce }
            int r2 = r1.intValue()     // Catch:{ all -> 0x01ce }
            r3 = 1600(0x640, float:2.242E-42)
            if (r2 < r3) goto L_0x0093
            int r1 = r1.intValue()     // Catch:{ all -> 0x01ce }
            r2 = 1640(0x668, float:2.298E-42)
            if (r1 > r2) goto L_0x0093
            java.lang.String r1 = ".tiktokv.com"
            com.ss.android.common.util.NetworkUtils.setShareCookieHost(r1)     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.app.an r1 = r1.getShareCookieCacheItem()     // Catch:{ all -> 0x01ce }
            java.lang.String r2 = ".tiktokv.com"
            r1.a(r2)     // Catch:{ all -> 0x01ce }
            goto L_0x00b8
        L_0x0093:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.app.an r1 = r1.getShareCookieCacheItem()     // Catch:{ all -> 0x01ce }
            java.lang.Object r1 = r1.c()     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01ce }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01ce }
            if (r2 != 0) goto L_0x00b3
            java.lang.String r2 = ".tiktokv.com"
            boolean r2 = android.text.TextUtils.equals(r2, r1)     // Catch:{ all -> 0x01ce }
            if (r2 == 0) goto L_0x00b3
            com.ss.android.common.util.NetworkUtils.setShareCookieHost(r1)     // Catch:{ all -> 0x01ce }
            goto L_0x00b8
        L_0x00b3:
            java.lang.String r1 = ".snssdk.com"
            com.ss.android.common.util.NetworkUtils.setShareCookieHost(r1)     // Catch:{ all -> 0x01ce }
        L_0x00b8:
            com.ss.android.ugc.aweme.net.a.j.b()     // Catch:{ all -> 0x01ce }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x01ce }
            com.meituan.robust.ChangeQuickRedirect r4 = f56843d     // Catch:{ all -> 0x01ce }
            r5 = 0
            r6 = 60867(0xedc3, float:8.5293E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x01ce }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01ce }
            r3 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01ce }
            r2 = 1
            if (r1 == 0) goto L_0x00e7
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x01ce }
            com.meituan.robust.ChangeQuickRedirect r5 = f56843d     // Catch:{ all -> 0x01ce }
            r6 = 0
            r7 = 60867(0xedc3, float:8.5293E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ all -> 0x01ce }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01ce }
            r4 = r12
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01ce }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01ce }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01ce }
            goto L_0x00f0
        L_0x00e7:
            boolean r1 = b()     // Catch:{ all -> 0x01ce }
            if (r1 != 0) goto L_0x00ef
            r1 = 1
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            if (r1 == 0) goto L_0x01be
            java.lang.String r1 = "CronetClient"
            f56844e = r1     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.net.a.a r1 = new com.ss.android.ugc.aweme.net.a.a     // Catch:{ all -> 0x01ce }
            r1.<init>()     // Catch:{ all -> 0x01ce }
            com.bytedance.ttnet.b.d r3 = r1.f20860a     // Catch:{ all -> 0x01ce }
            if (r3 != 0) goto L_0x0106
            com.bytedance.ttnet.b.d r3 = new com.bytedance.ttnet.b.d     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r1.f20860a = r3     // Catch:{ all -> 0x01ce }
        L_0x0106:
            com.bytedance.ttnet.b.d r3 = r1.f20860a     // Catch:{ all -> 0x01ce }
            r4 = 60000(0xea60, double:2.9644E-319)
            r3.f19738c = r4     // Catch:{ all -> 0x01ce }
            com.bytedance.ttnet.b.d r3 = r1.f20860a     // Catch:{ all -> 0x01ce }
            if (r3 != 0) goto L_0x0118
            com.bytedance.ttnet.b.d r3 = new com.bytedance.ttnet.b.d     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r1.f20860a = r3     // Catch:{ all -> 0x01ce }
        L_0x0118:
            com.bytedance.ttnet.b.d r3 = r1.f20860a     // Catch:{ all -> 0x01ce }
            r3.f19739d = r4     // Catch:{ all -> 0x01ce }
            com.bytedance.ttnet.b.d r3 = r1.f20860a     // Catch:{ all -> 0x01ce }
            if (r3 != 0) goto L_0x0127
            com.bytedance.ttnet.b.d r3 = new com.bytedance.ttnet.b.d     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r1.f20860a = r3     // Catch:{ all -> 0x01ce }
        L_0x0127:
            com.bytedance.ttnet.b.d r3 = r1.f20860a     // Catch:{ all -> 0x01ce }
            r3.f19740e = r4     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptor r3 = new com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptor     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r1.a((com.bytedance.retrofit2.intercept.Interceptor) r3)     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptor r3 = new com.ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptor     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r1.a((com.bytedance.retrofit2.intercept.Interceptor) r3)     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorCornet r3 = new com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorCornet     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r1.a((com.bytedance.retrofit2.intercept.Interceptor) r3)     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.net.interceptor.OKParamsInterceptor r3 = new com.ss.android.ugc.aweme.net.interceptor.OKParamsInterceptor     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r1.a((com.bytedance.retrofit2.intercept.Interceptor) r3)     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.net.interceptor.SecUidInterceptorCronet r3 = new com.ss.android.ugc.aweme.net.interceptor.SecUidInterceptorCronet     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r1.a((com.bytedance.retrofit2.intercept.Interceptor) r3)     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ all -> 0x01ce }
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r4 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r3 = r3.getService(r4)     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r3 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r3     // Catch:{ all -> 0x01ce }
            java.util.List r3 = r3.getSpecialNetworkInterceptor(r0)     // Catch:{ all -> 0x01ce }
            boolean r4 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r3)     // Catch:{ all -> 0x01ce }
            if (r4 != 0) goto L_0x017d
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x01ce }
        L_0x016d:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01ce }
            if (r4 == 0) goto L_0x017d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01ce }
            com.bytedance.retrofit2.intercept.Interceptor r4 = (com.bytedance.retrofit2.intercept.Interceptor) r4     // Catch:{ all -> 0x01ce }
            r1.a((com.bytedance.retrofit2.intercept.Interceptor) r4)     // Catch:{ all -> 0x01ce }
            goto L_0x016d
        L_0x017d:
            com.ss.android.ugc.aweme.net.a.c r3 = new com.ss.android.ugc.aweme.net.a.c     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r1.f20861b = r3     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.net.a.g r3 = new com.ss.android.ugc.aweme.net.a.g     // Catch:{ all -> 0x01ce }
            r3.<init>(r1)     // Catch:{ all -> 0x01ce }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ce }
            r4[r0] = r3     // Catch:{ all -> 0x01ce }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.app.application.initialization.a.f33947a     // Catch:{ all -> 0x01ce }
            r7 = 1
            r8 = 23254(0x5ad6, float:3.2586E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ all -> 0x01ce }
            java.lang.Class<com.ss.android.ugc.aweme.app.application.initialization.a$a> r10 = com.ss.android.ugc.aweme.app.application.initialization.a.C0436a.class
            r9[r0] = r10     // Catch:{ all -> 0x01ce }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ all -> 0x01ce }
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01ce }
            if (r4 == 0) goto L_0x01b7
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ce }
            r5[r0] = r3     // Catch:{ all -> 0x01ce }
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.app.application.initialization.a.f33947a     // Catch:{ all -> 0x01ce }
            r8 = 1
            r9 = 23254(0x5ad6, float:3.2586E-41)
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ all -> 0x01ce }
            java.lang.Class<com.ss.android.ugc.aweme.app.application.initialization.a$a> r2 = com.ss.android.ugc.aweme.app.application.initialization.a.C0436a.class
            r10[r0] = r2     // Catch:{ all -> 0x01ce }
            java.lang.Class r11 = java.lang.Void.TYPE     // Catch:{ all -> 0x01ce }
            com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01ce }
            goto L_0x01bc
        L_0x01b7:
            java.util.concurrent.atomic.AtomicReference<com.ss.android.ugc.aweme.app.application.initialization.a$a<com.ss.android.ugc.a.b.b>> r0 = com.ss.android.ugc.aweme.app.application.initialization.a.f33950d     // Catch:{ all -> 0x01ce }
            r0.set(r3)     // Catch:{ all -> 0x01ce }
        L_0x01bc:
            monitor-exit(r12)
            return r1
        L_0x01be:
            java.lang.String r0 = "SsOkhttp3Client"
            f56844e = r0     // Catch:{ all -> 0x01ce }
            com.bytedance.ies.net.b.c r0 = new com.bytedance.ies.net.b.c     // Catch:{ all -> 0x01ce }
            com.ss.android.ugc.aweme.net.z r1 = new com.ss.android.ugc.aweme.net.z     // Catch:{ all -> 0x01ce }
            r1.<init>()     // Catch:{ all -> 0x01ce }
            r0.<init>(r1)     // Catch:{ all -> 0x01ce }
            monitor-exit(r12)
            return r0
        L_0x01ce:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.a.f.a():com.ss.android.common.http.b");
    }

    public f(Context context) {
        super(context);
    }
}
