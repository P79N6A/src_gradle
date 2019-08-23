package com.ss.android.ugc.aweme.poi.ui.publish;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60867a;

    /* renamed from: b  reason: collision with root package name */
    private final b f60868b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f60869c;

    g(b bVar, boolean z) {
        this.f60868b = bVar;
        this.f60869c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        if (r8 != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f60867a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 66665(0x10469, float:9.3418E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f60867a
            r3 = 0
            r4 = 66665(0x10469, float:9.3418E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r18)
            com.ss.android.ugc.aweme.poi.ui.publish.b r0 = r7.f60868b
            boolean r1 = r7.f60869c
            com.ss.android.ugc.aweme.shortvideo.ui.a r2 = r0.f60852d
            boolean r2 = r2.i
            if (r2 != 0) goto L_0x00ca
            com.ss.android.ugc.aweme.shortvideo.ui.k r2 = r0.f60850b
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.ui.k.f70904a
            r13 = 0
            r14 = 80235(0x1396b, float:1.12433E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r2
            r15 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x0072
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.ui.k.f70904a
            r13 = 0
            r14 = 80235(0x1396b, float:1.12433E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r2
            r15 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x007f
        L_0x0072:
            java.lang.String r2 = r2.getPoiId()
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x007e
            r2 = 1
            goto L_0x007f
        L_0x007e:
            r2 = 0
        L_0x007f:
            if (r2 != 0) goto L_0x008b
            com.ss.android.ugc.aweme.shortvideo.ui.j r2 = r0.f60851c
            com.ss.android.ugc.aweme.poi.ui.publish.PoiContext r2 = r2.f70903d
            if (r2 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r8 = 0
        L_0x0089:
            if (r8 == 0) goto L_0x0099
        L_0x008b:
            android.content.Context r2 = r0.b()
            r3 = 2131559366(0x7f0d03c6, float:1.8744074E38)
            java.lang.String r3 = r0.a((int) r3)
            com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r2, (java.lang.String) r3)
        L_0x0099:
            if (r1 == 0) goto L_0x00a9
            android.content.Context r1 = r0.b()
            r2 = 2131561245(0x7f0d0b1d, float:1.8747885E38)
            java.lang.String r2 = r0.a((int) r2)
            com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r1, (java.lang.String) r2)
        L_0x00a9:
            boolean r1 = r0.i()
            if (r1 != 0) goto L_0x00bb
            boolean r1 = r0.j()
            if (r1 != 0) goto L_0x00bb
            boolean r1 = r0.k()
            if (r1 == 0) goto L_0x00c9
        L_0x00bb:
            android.content.Context r1 = r0.b()
            r2 = 2131562665(0x7f0d10a9, float:1.8750765E38)
            java.lang.String r0 = r0.a((int) r2)
            com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r1, (java.lang.String) r0)
        L_0x00c9:
            return
        L_0x00ca:
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            java.lang.String r1 = r1.getBindPhone()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00eb
            com.ss.android.ugc.aweme.m r1 = com.ss.android.ugc.aweme.account.c.c()
            android.app.Activity r0 = r0.a()
            java.lang.String r2 = ""
            r3 = 0
            r1.bindMobile(r0, r2, r3, r3)
            return
        L_0x00eb:
            android.app.Activity r1 = r0.a()
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
            int r2 = r2.getVerifyStatus()
            java.lang.String r3 = "video_post_page"
            java.lang.String r4 = "click_add_product"
            com.ss.android.ugc.aweme.poi.ui.publish.j r5 = new com.ss.android.ugc.aweme.poi.ui.publish.j
            r5.<init>(r0)
            com.ss.android.ugc.aweme.commercialize.g.a((android.content.Context) r1, (int) r2, (java.lang.String) r3, (java.lang.String) r4, (com.ss.android.ugc.aweme.commerce.service.a.a) r5)
            com.ss.android.ugc.aweme.shortvideo.ui.a r0 = r0.f60852d
            r0.a(r9)
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            r0.setShowAddBusinessGoodsDot(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.publish.g.onClick(android.view.View):void");
    }
}
