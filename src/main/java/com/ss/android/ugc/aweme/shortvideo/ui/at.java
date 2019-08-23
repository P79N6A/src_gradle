package com.ss.android.ugc.aweme.shortvideo.ui;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class at implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70782a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70783b;

    at(VideoPublishFragment videoPublishFragment) {
        this.f70783b = videoPublishFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0176, code lost:
        if (com.ss.android.ugc.aweme.port.in.a.t.a() != false) goto L_0x00d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(a.i r19) {
        /*
            r18 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r19
            com.meituan.robust.ChangeQuickRedirect r4 = f70782a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<a.i> r3 = a.i.class
            r7[r9] = r3
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r5 = 0
            r6 = 80484(0x13a64, float:1.12782E-40)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r19
            com.meituan.robust.ChangeQuickRedirect r12 = f70782a
            r13 = 0
            r14 = 80484(0x13a64, float:1.12782E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<a.i> r0 = a.i.class
            r15[r9] = r0
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            r11 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0037:
            r0 = r18
            com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishFragment r10 = r0.f70783b
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishFragment.f70600a
            r5 = 0
            r6 = 80439(0x13a37, float:1.12719E-40)
            java.lang.Class[] r7 = new java.lang.Class[r9]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r10
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0067
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishFragment.f70600a
            r5 = 0
            r6 = 80439(0x13a37, float:1.12719E-40)
            java.lang.Class[] r7 = new java.lang.Class[r9]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r10
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x017b
        L_0x0067:
            com.ss.android.ugc.aweme.property.a r2 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r3 = com.ss.android.ugc.aweme.property.a.C0682a.EnableMVThemePreUpload
            boolean r2 = r2.a(r3)
            if (r2 != 0) goto L_0x0079
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r10.n
            boolean r2 = r2.isMvThemeVideoType()
            if (r2 != 0) goto L_0x017a
        L_0x0079:
            com.ss.android.ugc.aweme.shortvideo.publish.e r2 = r10.f70604e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a
            r14 = 0
            r15 = 78233(0x13199, float:1.09628E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r2
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x00aa
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a
            r14 = 0
            r15 = 78233(0x13199, float:1.09628E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r2
            r16 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x00c2
        L_0x00aa:
            com.ss.android.ugc.aweme.shortvideo.publish.e$b r2 = r2.c()
            int[] r3 = com.ss.android.ugc.aweme.shortvideo.publish.f.f68927a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto L_0x00c1;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00bf;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x00bf:
            r2 = 1
            goto L_0x00c2
        L_0x00c1:
            r2 = 0
        L_0x00c2:
            if (r2 == 0) goto L_0x017a
            com.ss.android.ugc.aweme.property.a r2 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r3 = com.ss.android.ugc.aweme.property.a.C0682a.QuietlySynthetic
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L_0x00db
            com.ss.android.ugc.aweme.property.a r2 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r3 = com.ss.android.ugc.aweme.property.a.C0682a.EnableParallelSynthesizeUpload
            boolean r2 = r2.a(r3)
            if (r2 != 0) goto L_0x00db
        L_0x00d8:
            r2 = 1
            goto L_0x017b
        L_0x00db:
            com.ss.android.ugc.aweme.property.a r2 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r3 = com.ss.android.ugc.aweme.property.a.C0682a.EnableParallelSynthesizeUpload
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L_0x017a
            android.content.Context r2 = r10.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.property.f.f63287a
            r14 = 1
            r15 = 70222(0x1124e, float:9.8402E-41)
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x0124
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.property.f.f63287a
            r14 = 1
            r15 = 70222(0x1124e, float:9.8402E-41)
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x0158
        L_0x0124:
            com.ss.android.ugc.aweme.property.a r3 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r4 = com.ss.android.ugc.aweme.property.a.C0682a.EnablePreUpload
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L_0x0157
            com.ss.android.ugc.aweme.property.e r3 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r4 = com.ss.android.ugc.aweme.property.e.a.EnablePreUploadByUser
            boolean r3 = r3.a((com.ss.android.ugc.aweme.property.e.a) r4)
            if (r3 == 0) goto L_0x0157
            com.ss.android.ugc.aweme.account.f r3 = com.ss.android.ugc.aweme.port.in.a.x
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x0157
            long r2 = com.ss.android.ugc.aweme.common.h.a.a((android.content.Context) r2)
            r4 = 1024(0x400, double:5.06E-321)
            long r2 = r2 / r4
            long r2 = r2 / r4
            int r2 = (int) r2
            if (r2 <= 0) goto L_0x0155
            com.ss.android.ugc.aweme.property.e r3 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r4 = com.ss.android.ugc.aweme.property.e.a.PreUploadMemoryLimit
            int r3 = r3.b(r4)
            if (r2 <= r3) goto L_0x0157
        L_0x0155:
            r2 = 1
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            if (r2 == 0) goto L_0x017a
            android.content.Context r2 = r10.getContext()
            boolean r2 = com.ss.android.ugc.aweme.framework.d.a.a(r2)
            if (r2 == 0) goto L_0x0166
            goto L_0x00d8
        L_0x0166:
            android.content.Context r2 = r10.getContext()
            boolean r2 = com.ss.android.ugc.aweme.framework.d.a.b(r2)
            if (r2 == 0) goto L_0x017a
            com.ss.android.ugc.aweme.port.in.af r2 = com.ss.android.ugc.aweme.port.in.a.t
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x017a
            goto L_0x00d8
        L_0x017a:
            r2 = 0
        L_0x017b:
            if (r2 == 0) goto L_0x01b5
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.os.Bundle r3 = r10.b((boolean) r1)
            com.ss.android.ugc.aweme.property.a r4 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r5 = com.ss.android.ugc.aweme.property.a.C0682a.UploadOptimizeForPie
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L_0x0196
            java.lang.String r4 = "publish_bundle"
            r2.putExtra(r4, r3)
            goto L_0x0199
        L_0x0196:
            r2.putExtras(r3)
        L_0x0199:
            java.lang.String r3 = "synthetise_only"
            r2.putExtra(r3, r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r3 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r3)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.ss.android.ugc.aweme.services.IAVService) r1
            com.ss.android.ugc.aweme.services.publish.IPublishService r1 = r1.getPublishService()
            android.support.v4.app.FragmentActivity r3 = r10.getActivity()
            r1.processPublish(r3, r2)
        L_0x01b5:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.at.then(a.i):java.lang.Object");
    }
}
