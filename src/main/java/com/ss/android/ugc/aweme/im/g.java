package com.ss.android.ugc.aweme.im;

import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.aj;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.utils.bg;

public class g implements b.a, com.ss.android.ugc.aweme.im.service.a.b {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f50066d;

    /* renamed from: a  reason: collision with root package name */
    private b.C0026b f50067a;

    /* renamed from: b  reason: collision with root package name */
    private IShareService.SharePage f50068b;

    /* renamed from: c  reason: collision with root package name */
    private String f50069c;

    /* renamed from: e  reason: collision with root package name */
    public aj f50070e;

    /* renamed from: f  reason: collision with root package name */
    private IShareService.ShareStruct f50071f;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50066d, false, 50113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50066d, false, 50113, new Class[0], Void.TYPE);
            return;
        }
        this.f50070e.a(true);
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f50066d, false, 50114, new Class[0], Boolean.TYPE)) {
            return this.f50070e.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50066d, false, 50114, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(IShareService.ShareStruct shareStruct) {
        if (PatchProxy.isSupport(new Object[]{shareStruct}, this, f50066d, false, 50111, new Class[]{IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct}, this, f50066d, false, 50111, new Class[]{IShareService.ShareStruct.class}, Void.TYPE);
            return;
        }
        this.f50070e.a(shareStruct);
        if (shareStruct != null) {
            shareStruct.extraParams.put("aid", this.f50069c);
        }
    }

    /* JADX WARNING: type inference failed for: r0v42, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r9 = 0
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50066d
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 50107(0xc3bb, float:7.0215E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50066d
            r3 = 0
            r4 = 50107(0xc3bb, float:7.0215E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003e:
            com.ss.android.ugc.aweme.feed.aj r0 = r7.f50070e
            boolean r0 = r0.r
            if (r0 != 0) goto L_0x0256
            com.ss.android.ugc.aweme.im.b$b r0 = r7.f50067a
            com.ss.android.ugc.aweme.im.h r0 = r0.a()
            if (r0 == 0) goto L_0x0256
            com.ss.android.ugc.aweme.feed.aj r1 = r7.f50070e
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.feed.aj.f45001a
            r13 = 0
            r14 = 40211(0x9d13, float:5.6348E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.im.h> r2 = com.ss.android.ugc.aweme.im.h.class
            r15[r9] = r2
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x007f
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.feed.aj.f45001a
            r13 = 0
            r14 = 40211(0x9d13, float:5.6348E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.im.h> r0 = com.ss.android.ugc.aweme.im.h.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0256
        L_0x007f:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f50072a
            r1.k = r2
            android.view.View r2 = r0.f50074c
            r1.f45004d = r2
            android.view.View r2 = r0.f50076e
            r1.f45006f = r2
            android.view.View r2 = r0.h
            r1.i = r2
            com.bytedance.ies.dmt.ui.widget.DmtEditText r2 = r0.k
            r1.m = r2
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r0.j
            r1.j = r2
            android.view.View r2 = r0.f50075d
            r1.f45005e = r2
            android.view.View r2 = r0.f50077f
            r1.g = r2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f50073b
            r1.l = r2
            com.ss.android.ugc.aweme.framework.services.IShareService$SharePage r2 = r0.l
            r1.f45003c = r2
            android.view.View r2 = r0.g
            r1.h = r2
            boolean r2 = r0.m
            r1.s = r2
            boolean r2 = r0.n
            r1.q = r2
            android.view.View r2 = r1.f45006f
            if (r2 == 0) goto L_0x00cd
            android.view.View r2 = r1.f45006f
            int r2 = r2.getHeight()
            if (r2 <= 0) goto L_0x00cd
            com.bytedance.ies.dmt.ui.widget.DmtEditText r2 = r1.m
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.View r3 = r1.f45006f
            int r3 = r3.getHeight()
            r2.height = r3
        L_0x00cd:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r2 = r1.f45002b
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L_0x0159
            java.lang.String r2 = "good_window"
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r4 = r1.f45002b
            java.lang.String r4 = r4.itemType
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00eb
            java.lang.String r2 = "good"
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r4 = r1.f45002b
            java.lang.String r4 = r4.itemType
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0159
        L_0x00eb:
            com.bytedance.ies.dmt.ui.widget.DmtEditText r2 = r1.m
            com.ss.android.ugc.aweme.feed.aj$1 r4 = new com.ss.android.ugc.aweme.feed.aj$1
            r4.<init>()
            r2.addTextChangedListener(r4)
            r2 = 0
            android.view.View r4 = r0.i
            boolean r4 = r4 instanceof android.widget.ImageView
            if (r4 == 0) goto L_0x0101
            android.view.View r0 = r0.i
            r2 = r0
            android.widget.ImageView r2 = (android.widget.ImageView) r2
        L_0x0101:
            java.lang.String r0 = "good_window"
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r4 = r1.f45002b
            java.lang.String r4 = r4.itemType
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0126
            com.facebook.drawee.generic.RoundingParams r0 = new com.facebook.drawee.generic.RoundingParams
            r0.<init>()
            r0.setRoundAsCircle(r8)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r1.j
            com.facebook.drawee.interfaces.DraweeHierarchy r3 = r3.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r3 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r3
            r3.setRoundingParams(r0)
            if (r2 == 0) goto L_0x0174
            r2.setVisibility(r9)
            goto L_0x0174
        L_0x0126:
            java.lang.String r0 = "good"
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r4 = r1.f45002b
            java.lang.String r4 = r4.itemType
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0174
            com.facebook.drawee.generic.RoundingParams r0 = new com.facebook.drawee.generic.RoundingParams
            r0.<init>()
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r4, r3)
            r0.setCornersRadius(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r1.j
            com.facebook.drawee.interfaces.DraweeHierarchy r3 = r3.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r3 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r3
            r3.setRoundingParams(r0)
            if (r2 == 0) goto L_0x0174
            r0 = 2130839296(0x7f020700, float:1.7283599E38)
            r2.setImageResource(r0)
            r2.setVisibility(r9)
            goto L_0x0174
        L_0x0159:
            com.facebook.drawee.generic.RoundingParams r0 = new com.facebook.drawee.generic.RoundingParams
            r0.<init>()
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            r0.setCornersRadius(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r1.j
            com.facebook.drawee.interfaces.DraweeHierarchy r2 = r2.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r2 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r2
            r2.setRoundingParams(r0)
        L_0x0174:
            com.ss.android.ugc.aweme.framework.services.IShareService$SharePage r0 = r1.f45003c
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.e.f50064a
            r13 = 1
            r14 = 50087(0xc3a7, float:7.0187E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class<android.app.Dialog> r2 = android.app.Dialog.class
            r15[r9] = r2
            java.lang.Class r16 = java.lang.Void.TYPE
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x01a6
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.e.f50064a
            r13 = 1
            r14 = 50087(0xc3a7, float:7.0187E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class<android.app.Dialog> r0 = android.app.Dialog.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01c8
        L_0x01a6:
            if (r0 == 0) goto L_0x01c8
            boolean r2 = r0 instanceof android.support.design.widget.BottomSheetDialog
            if (r2 != 0) goto L_0x01ad
            goto L_0x01c8
        L_0x01ad:
            android.support.design.widget.BottomSheetDialog r0 = (android.support.design.widget.BottomSheetDialog) r0
            r2 = 2131166326(0x7f070476, float:1.7946894E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 == 0) goto L_0x01c8
            android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.from(r0)
            int r0 = r0.getHeight()
            r2.setPeekHeight(r0)
            r2.setSkipCollapsed(r8)
        L_0x01c8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r1.l
            if (r0 == 0) goto L_0x01d3
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r1.l
            android.view.View$OnClickListener r2 = r1.n
            r0.setOnClickListener(r2)
        L_0x01d3:
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r1.m
            if (r0 == 0) goto L_0x01de
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r1.m
            android.view.View$OnTouchListener r2 = r1.o
            r0.setOnTouchListener(r2)
        L_0x01de:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r1.k
            if (r0 == 0) goto L_0x01ff
            android.view.View r0 = r1.f45004d
            if (r0 != 0) goto L_0x01ea
            android.view.View r0 = r1.f45006f
            if (r0 == 0) goto L_0x01ff
        L_0x01ea:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r1.j
            if (r0 == 0) goto L_0x01ff
            android.view.View r0 = r1.f45005e
            if (r0 == 0) goto L_0x01ff
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r1.m
            if (r0 == 0) goto L_0x01ff
            android.view.View r0 = r1.g
            if (r0 == 0) goto L_0x01ff
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r1.l
            if (r0 == 0) goto L_0x01ff
            goto L_0x0200
        L_0x01ff:
            r8 = 0
        L_0x0200:
            r1.r = r8
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.feed.aj.f45001a
            r13 = 0
            r14 = 40212(0x9d14, float:5.6349E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r1
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x0226
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.feed.aj.f45001a
            r13 = 0
            r14 = 40212(0x9d14, float:5.6349E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0239
        L_0x0226:
            com.ss.android.ugc.aweme.framework.services.IShareService$SharePage r0 = r1.f45003c
            r2 = 2131170513(0x7f0714d1, float:1.7955386E38)
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L_0x0239
            com.ss.android.ugc.aweme.feed.aj$3 r2 = new com.ss.android.ugc.aweme.feed.aj$3
            r2.<init>()
            r0.setOnClickListener(r2)
        L_0x0239:
            android.view.View r0 = r1.i
            if (r0 == 0) goto L_0x0256
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r1.f45002b
            java.lang.String r0 = r0.itemType
            java.lang.String r2 = "coupon"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x024f
            android.view.View r0 = r1.i
            r0.setVisibility(r9)
            goto L_0x0256
        L_0x024f:
            android.view.View r0 = r1.i
            r1 = 8
            r0.setVisibility(r1)
        L_0x0256:
            com.ss.android.ugc.aweme.feed.aj r0 = r7.f50070e
            r1 = r18
            r0.a((int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.g.a(int):void");
    }

    public final void a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f50066d, false, 50110, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f50066d, false, 50110, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (obj2 instanceof IShareService.ShareStruct) {
            a((IShareService.ShareStruct) obj2);
        }
    }

    public final void a(IShareService.ShareStruct shareStruct, com.ss.android.ugc.aweme.feed.widget.g gVar) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        com.ss.android.ugc.aweme.feed.widget.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, gVar2}, this, f50066d, false, 50112, new Class[]{IShareService.ShareStruct.class, com.ss.android.ugc.aweme.feed.widget.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, gVar2}, this, f50066d, false, 50112, new Class[]{IShareService.ShareStruct.class, com.ss.android.ugc.aweme.feed.widget.g.class}, Void.TYPE);
            return;
        }
        aj ajVar = this.f50070e;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, gVar2}, ajVar, aj.f45001a, false, 40225, new Class[]{IShareService.ShareStruct.class, com.ss.android.ugc.aweme.feed.widget.g.class}, Void.TYPE)) {
            aj ajVar2 = ajVar;
            PatchProxy.accessDispatch(new Object[]{shareStruct2, gVar2}, ajVar2, aj.f45001a, false, 40225, new Class[]{IShareService.ShareStruct.class, com.ss.android.ugc.aweme.feed.widget.g.class}, Void.TYPE);
            return;
        }
        ajVar.f45002b = shareStruct2;
        ajVar.p = gVar2;
        IIMService a2 = b.a(false);
        if (!(a2 == null || shareStruct2 == null || ajVar.j == null)) {
            a2.setImage(ajVar.j, shareStruct2);
        }
    }

    public void a(IMContact iMContact, boolean z) {
        if (PatchProxy.isSupport(new Object[]{iMContact, Byte.valueOf(z ? (byte) 1 : 0)}, this, f50066d, false, 50108, new Class[]{IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact, Byte.valueOf(z)}, this, f50066d, false, 50108, new Class[]{IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f50068b.dismiss();
        IShareService.ShareStruct shareStruct = this.f50068b.getShareStruct();
        if (this.f50070e.s || TextUtils.equals(shareStruct.itemType, "live")) {
            a.a(GlobalContext.getContext(), (int) C0906R.string.axi).a();
            return;
        }
        com.ss.android.ugc.aweme.im.service.model.g gVar = new com.ss.android.ugc.aweme.im.service.model.g(iMContact, z, shareStruct.itemType, shareStruct.enterFrom, this.f50069c);
        bg.a(gVar);
    }

    public g(String str, IShareService.ShareStruct shareStruct, b.C0026b bVar, IShareService.SharePage sharePage) {
        this.f50070e = new aj(shareStruct);
        this.f50067a = bVar;
        this.f50068b = sharePage;
        this.f50069c = str;
        this.f50071f = shareStruct;
    }
}
