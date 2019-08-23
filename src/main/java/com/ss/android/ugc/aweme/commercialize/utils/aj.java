package com.ss.android.ugc.aweme.commercialize.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.l;
import com.ss.android.ad.splash.m;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39697a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f39698b;

    public static void a(@NonNull l lVar) {
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{lVar2}, null, f39697a, true, 32572, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar2}, null, f39697a, true, 32572, new Class[]{l.class}, Void.TYPE);
            return;
        }
        lVar2.b(1);
    }

    public static void a(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, null, f39697a, true, 32574, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, null, f39697a, true, 32574, new Class[]{m.class}, Void.TYPE);
            return;
        }
        f39698b = true;
        if (mVar != null) {
            mVar.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r19, java.util.HashMap<java.lang.String, java.lang.String> r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f39697a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.util.HashMap> r4 = java.util.HashMap.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 32573(0x7f3d, float:4.5644E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f39697a
            r15 = 1
            r16 = 32573(0x7f3d, float:4.5644E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.util.HashMap> r1 = java.util.HashMap.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            com.ss.android.ugc.aweme.commercialize.utils.aj$1 r2 = new com.ss.android.ugc.aweme.commercialize.utils.aj$1
            r2.<init>(r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r3 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0058 }
            java.lang.Integer r3 = r3.bj()     // Catch:{ a -> 0x0058 }
            int r3 = r3.intValue()     // Catch:{ a -> 0x0058 }
            if (r3 != r11) goto L_0x0058
            r3 = 1
            goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            com.ss.android.ad.splash.i$a r4 = new com.ss.android.ad.splash.i$a
            r4.<init>()
            r4.j = r3
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.splash.SplashAdManagerHolder.f71578a
            r15 = 1
            r16 = 81897(0x13fe9, float:1.14762E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ad.splash.a> r18 = com.ss.android.ad.splash.a.class
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x008b
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.splash.SplashAdManagerHolder.f71578a
            r15 = 1
            r16 = 81897(0x13fe9, float:1.14762E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ad.splash.a> r18 = com.ss.android.ad.splash.a.class
            r17 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ad.splash.a r3 = (com.ss.android.ad.splash.a) r3
            goto L_0x0104
        L_0x008b:
            com.ss.android.ugc.aweme.app.i r3 = com.ss.android.ugc.aweme.app.i.a()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.ss.android.common.applog.AppLog.getSSIDs(r5)
            java.lang.String r6 = com.ss.android.common.applog.AppLog.getServerDeviceId()
            if (r6 != 0) goto L_0x009f
            java.lang.String r6 = ""
        L_0x009f:
            com.ss.android.ad.splash.a r7 = new com.ss.android.ad.splash.a
            com.ss.android.ad.splash.a$a r8 = new com.ss.android.ad.splash.a$a
            r8.<init>()
            int r9 = r3.getAid()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.f22774a = r9
            java.lang.String r9 = r3.getAppName()
            r8.f22775b = r9
            java.lang.String r9 = r3.getChannel()
            r8.f22779f = r9
            java.lang.String r9 = r3.getManifestVersion()
            r8.g = r9
            int r9 = r3.getVersionCode()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.f22776c = r9
            java.lang.String r9 = r3.getVersion()
            r8.f22777d = r9
            int r9 = r3.getUpdateVersionCode()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.f22778e = r9
            r8.j = r6
            java.lang.String r6 = com.ss.android.common.applog.AppLog.getInstallId()
            r8.i = r6
            java.lang.String r6 = r3.getAbVersion()
            r8.n = r6
            java.lang.String r6 = r3.getAbClient()
            r8.o = r6
            java.lang.String r6 = "openudid"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            r8.k = r5
            java.lang.String r3 = r3.getDeviceId()
            r8.l = r3
            r7.<init>(r8)
            r3 = r7
        L_0x0104:
            r4.f22827c = r3
            r4.g = r1
            r4.h = r2
            r4.i = r11
            com.ss.android.ad.splash.i r1 = new com.ss.android.ad.splash.i
            r1.<init>(r4, r10)
            com.ss.android.ad.splash.core.f.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.aj.a(android.content.Context, java.util.HashMap):void");
    }
}
