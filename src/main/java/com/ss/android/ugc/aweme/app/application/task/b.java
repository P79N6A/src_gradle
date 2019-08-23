package com.ss.android.ugc.aweme.app.application.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.app.application.a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/app/application/task/NetworkTask;", "Lcom/ss/android/ugc/aweme/app/application/AmeTask;", "()V", "cronetInterceptor", "", "Lcom/bytedance/retrofit2/intercept/Interceptor;", "getCronetInterceptor", "()Ljava/util/List;", "language", "", "getLanguage", "()Ljava/lang/String;", "run", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2647a;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ac, code lost:
        if (r2 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2647a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 23291(0x5afb, float:3.2638E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2647a
            r5 = 0
            r6 = 23291(0x5afb, float:3.2638E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            com.ss.android.ugc.aweme.app.k r1 = com.ss.android.ugc.aweme.app.k.a()
            android.app.Application r1 = (android.app.Application) r1
            com.ss.android.ugc.aweme.net.a.p$a r1 = com.ss.android.ugc.aweme.net.a.p.a(r1)
            com.ss.android.ugc.aweme.net.a.h r2 = new com.ss.android.ugc.aweme.net.a.h
            r2.<init>()
            com.bytedance.ttnet.c r2 = (com.bytedance.ttnet.c) r2
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.a((com.bytedance.ttnet.c) r2)
            com.ss.android.ugc.aweme.net.i r2 = com.ss.android.ugc.aweme.net.i.f56948c
            com.bytedance.ttnet.a.a r2 = (com.bytedance.ttnet.a.a) r2
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.a((com.bytedance.ttnet.a.a) r2)
            com.ss.android.ugc.aweme.net.a.f r2 = new com.ss.android.ugc.aweme.net.a.f
            com.ss.android.ugc.aweme.app.k r3 = com.ss.android.ugc.aweme.app.k.a()
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            com.ss.android.ugc.aweme.net.f r2 = (com.ss.android.ugc.aweme.net.f) r2
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.a((com.ss.android.ugc.aweme.net.f) r2)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2647a
            r5 = 0
            r6 = 23290(0x5afa, float:3.2636E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r10
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0076
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f2647a
            r6 = 0
            r7 = 23290(0x5afa, float:3.2636E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = r10
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00b9
        L_0x0076:
            boolean r2 = com.ss.android.g.a.a()
            if (r2 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.language.I18nManagerService> r3 = com.ss.android.ugc.aweme.language.I18nManagerService.class
            java.lang.Object r2 = r2.getService(r3)
            com.ss.android.ugc.aweme.language.I18nManagerService r2 = (com.ss.android.ugc.aweme.language.I18nManagerService) r2
            java.lang.String r3 = "i18nManagerService"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getAppLanguage()
            goto L_0x009f
        L_0x0092:
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "Locale.getDefault()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getLanguage()
        L_0x009f:
            if (r2 == 0) goto L_0x00b7
            if (r2 == 0) goto L_0x00af
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r3 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            if (r2 != 0) goto L_0x00b9
            goto L_0x00b7
        L_0x00af:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x00b7:
            java.lang.String r2 = ""
        L_0x00b9:
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.e((java.lang.String) r2)
            com.ss.android.ugc.aweme.app.i r2 = com.ss.android.ugc.aweme.app.i.a()
            java.lang.String r3 = "AppContextInfoManager.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getChannel()
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.d((java.lang.String) r2)
            r2 = 1
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.e((boolean) r2)
            java.lang.String r3 = "aweme"
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.c((java.lang.String) r3)
            com.ss.android.ugc.aweme.app.i r3 = com.ss.android.ugc.aweme.app.i.a()
            java.lang.String r4 = "AppContextInfoManager.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.getAid()
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.a((int) r3)
            java.lang.String r3 = com.ss.android.c.b.f2437f
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.a((java.lang.String) r3)
            java.lang.String r3 = com.ss.android.ugc.aweme.language.e.b()
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.b((java.lang.String) r3)
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r4 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            boolean r3 = r3.r()
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.b((boolean) r3)
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r4 = "SharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.getUseHttps()
            if (r3 == 0) goto L_0x0138
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r4 = "SharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.getUseHttps()
            java.lang.String r4 = "SharePrefCache.inst().useHttps"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r3 = r3.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0138
            r3 = 1
            goto L_0x0139
        L_0x0138:
            r3 = 0
        L_0x0139:
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.a((boolean) r3)
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r4 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.ar()
            if (r3 != 0) goto L_0x014e
            r3 = 1
            goto L_0x014f
        L_0x014e:
            r3 = 0
        L_0x014f:
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.d((boolean) r3)
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r4 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.S()
            if (r3 != r2) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r2 = 0
        L_0x0164:
            com.ss.android.ugc.aweme.net.a.p$a r1 = r1.c((boolean) r2)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2647a
            r5 = 0
            r6 = 23289(0x5af9, float:3.2635E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r10
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x018d
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f2647a
            r6 = 0
            r7 = 23289(0x5af9, float:3.2635E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r4 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.util.List r0 = (java.util.List) r0
            goto L_0x019c
        L_0x018d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.ss.android.ugc.aweme.net.interceptor.OKParamsInterceptor r2 = new com.ss.android.ugc.aweme.net.interceptor.OKParamsInterceptor
            r2.<init>()
            r0.add(r2)
            java.util.List r0 = (java.util.List) r0
        L_0x019c:
            com.ss.android.ugc.aweme.net.a.p$a r0 = r1.a((java.util.List<com.bytedance.retrofit2.intercept.Interceptor>) r0)
            com.ss.android.ugc.aweme.net.a.p r0 = r0.a()
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r2 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            int r1 = r1.aJ()
            com.ttnet.org.chromium.base.ContextUtils.sNetworkThreadPriority = r1
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x01bf
            com.ss.android.ugc.aweme.app.application.task.TokenSdkTask r1 = new com.ss.android.ugc.aweme.app.application.task.TokenSdkTask
            r1.<init>()
            goto L_0x01c0
        L_0x01bf:
            r1 = 0
        L_0x01c0:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            com.ss.android.ugc.aweme.net.a.j.a((com.ss.android.ugc.aweme.net.a.p) r0, (java.lang.Runnable) r1)
            com.ss.android.ugc.aweme.lego.a r0 = com.ss.android.ugc.aweme.lego.a.i
            com.ss.android.ugc.aweme.lego.a$f r0 = r0.a()
            com.ss.android.ugc.aweme.app.application.task.SetReportCountTask r1 = new com.ss.android.ugc.aweme.app.application.task.SetReportCountTask
            r1.<init>()
            com.ss.android.ugc.aweme.lego.LegoTask r1 = (com.ss.android.ugc.aweme.lego.LegoTask) r1
            com.ss.android.ugc.aweme.lego.a$f r0 = r0.a(r1)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.application.task.b.run():void");
    }
}
