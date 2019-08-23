package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.ui.FeedTagLayout;
import com.ss.android.ugc.aweme.base.ui.FeedTagLayout2;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.link.f;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.festival.christmas.view.FeedStickerTagView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.utils.ax;

public final class bp extends e implements Observer<a> {
    public static ChangeQuickRedirect l;
    FeedTagLayout m;
    FeedTagLayout2 n;
    private ad o;

    public final void b() {
    }

    public bp(View view) {
        super(view);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43224, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43224, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.layout_video_tag);
        this.m = (FeedTagLayout) a2.findViewById(C0906R.id.ad1);
        this.n = (FeedTagLayout2) a2.findViewById(C0906R.id.ad2);
        this.o = new ad((FeedStickerTagView) a2.findViewById(C0906R.id.dtx));
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, l, false, 43226, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, l, false, 43226, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        if (dataCenter != null) {
            dataCenter.a("show_poi_info", (Observer<a>) this).a("hide_poi_info", (Observer<a>) this).a("on_page_selected", (Observer<a>) this).a("show_poi_info_with_expend", (Observer<a>) this);
            if (this.n != null) {
                this.n.setDataCenter(dataCenter);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.ss.android.ugc.aweme.arch.widgets.base.a r7 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = l
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43227(0xa8db, float:6.0574E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43227(0xa8db, float:6.0574E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0035:
            if (r7 == 0) goto L_0x013f
            java.lang.String r0 = r7.f34376a
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -2102809467(0xffffffff82a9ac85, float:-2.493134E-37)
            if (r2 == r3) goto L_0x0071
            r3 = -1212389408(0xffffffffb7bc67e0, float:-2.2459717E-5)
            if (r2 == r3) goto L_0x0067
            r3 = -1173726595(0xffffffffba0a5a7d, float:-5.277766E-4)
            if (r2 == r3) goto L_0x005d
            r3 = 350216171(0x14dfdfeb, float:2.2605566E-26)
            if (r2 == r3) goto L_0x0053
            goto L_0x007b
        L_0x0053:
            java.lang.String r2 = "on_page_selected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 3
            goto L_0x007c
        L_0x005d:
            java.lang.String r2 = "show_poi_info_with_expend"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 1
            goto L_0x007c
        L_0x0067:
            java.lang.String r2 = "hide_poi_info"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 2
            goto L_0x007c
        L_0x0071:
            java.lang.String r2 = "show_poi_info"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 0
            goto L_0x007c
        L_0x007b:
            r0 = -1
        L_0x007c:
            switch(r0) {
                case 0: goto L_0x011f;
                case 1: goto L_0x0119;
                case 2: goto L_0x010f;
                case 3: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x013f
        L_0x0081:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43228(0xa8dc, float:6.0575E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a5
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43228(0xa8dc, float:6.0575E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00a5:
            com.ss.android.ugc.aweme.base.ui.FeedTagLayout2 r0 = r10.n
            if (r0 == 0) goto L_0x013f
            com.ss.android.ugc.aweme.base.ui.FeedTagLayout2 r0 = r10.n
            boolean r0 = r0.r
            if (r0 == 0) goto L_0x013f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43229(0xa8dd, float:6.0577E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00d3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43229(0xa8dd, float:6.0577E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00d3:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f3210b
            if (r0 == 0) goto L_0x013f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f3210b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "show_mission_icon"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = r10.f3211c
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f3210b
            java.lang.String r4 = r4.getAid()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "author_id"
            java.lang.String r0 = com.ss.android.ugc.aweme.u.aa.b((com.ss.android.ugc.aweme.profile.model.User) r0)
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r2 = "entrance_location"
            java.lang.String r3 = "poi_location"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
            goto L_0x013f
        L_0x010f:
            com.ss.android.ugc.aweme.base.ui.FeedTagLayout2 r0 = r10.n
            if (r0 == 0) goto L_0x013f
            com.ss.android.ugc.aweme.base.ui.FeedTagLayout2 r0 = r10.n
            r0.c()
            return
        L_0x0119:
            com.ss.android.ugc.aweme.base.ui.FeedTagLayout2 r0 = r10.n
            r0.b()
            return
        L_0x011f:
            com.ss.android.ugc.aweme.base.ui.FeedTagLayout2 r0 = r10.n
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = "poi"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.f3210b
            boolean r0 = com.ss.android.ugc.aweme.commercialize.link.f.a(r0, r1)
            if (r0 == 0) goto L_0x013f
            java.lang.Object r0 = r7.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x013e
            com.ss.android.ugc.aweme.base.ui.FeedTagLayout2 r0 = r10.n
            r0.b()
        L_0x013e:
            return
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bp.onChanged(java.lang.Object):void");
    }

    public final void a(VideoItemParams videoItemParams) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (PatchProxy.isSupport(new Object[]{videoItemParams2}, this, l, false, 43225, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams2}, this, l, false, 43225, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.a(videoItemParams);
        int i = 8;
        if (!f.a("poi", this.f3210b)) {
            this.m.setVisibility(8);
            this.n.setVisibility(8);
            if (this.g != null) {
                this.g.a("show_poi_distance", (Object) Boolean.FALSE);
            }
        } else {
            if (!p.b()) {
                Aweme aweme = this.f3210b;
                if (PatchProxy.isSupport(new Object[]{aweme}, null, com.ss.android.ugc.aweme.opensdk.share.share.a.f58423a, true, 63459, new Class[]{Aweme.class}, Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, com.ss.android.ugc.aweme.opensdk.share.share.a.f58423a, true, 63459, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                } else if (aweme == null || aweme.getOpenPlatformStruct() == null || TextUtils.isEmpty(aweme.getOpenPlatformStruct().getName())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).havePGCShow() || !this.f3210b.isPgcShow()) {
                        this.m.setVisibility(8);
                    } else {
                        this.m.a(this.f3210b, (Activity) this.h, this.f3211c, this.f3212d);
                    }
                    if (this.g != null) {
                        this.g.a("show_poi_distance", (Object) Boolean.FALSE);
                    }
                }
            }
            this.n.setVisibility(0);
            this.m.setVisibility(8);
            this.n.setOnIntervalEventListener(new aa<ar>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46629a;

                public final /* synthetic */ void a(Object obj) {
                    ar arVar = (ar) obj;
                    if (PatchProxy.isSupport(new Object[]{arVar}, this, f46629a, false, 43231, new Class[]{ar.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{arVar}, this, f46629a, false, 43231, new Class[]{ar.class}, Void.TYPE);
                        return;
                    }
                    if (bp.this.g != null) {
                        bp.this.g.a("feed_internal_event", (Object) arVar);
                    }
                }
            });
            this.n.a(this.f3210b, (Activity) this.h, this.f3211c, this.f3212d);
        }
        if (this.o != null) {
            this.o.a(videoItemParams2.mPageType, videoItemParams2.mEventType, videoItemParams2.mRequestId);
            if (PatchProxy.isSupport(new Object[0], this, l, false, 43230, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 43230, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.m == null || this.n == null || ((this.m.getVisibility() != 0 || !this.m.l) && (this.n.getVisibility() != 0 || !this.n.l))) {
                z = false;
            } else {
                z = true;
            }
            if (z || !f.a("sticker", this.f3210b)) {
                ad adVar = this.o;
                if (PatchProxy.isSupport(new Object[0], adVar, ad.f46392a, false, 42726, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], adVar, ad.f46392a, false, 42726, new Class[0], Void.TYPE);
                } else {
                    if (adVar.f46394c != null) {
                        adVar.f46394c.setVisibility(8);
                    }
                }
            } else {
                ad adVar2 = this.o;
                Aweme aweme2 = this.f3210b;
                if (PatchProxy.isSupport(new Object[]{aweme2}, adVar2, ad.f46392a, false, 42723, new Class[]{Aweme.class}, Void.TYPE)) {
                    ad adVar3 = adVar2;
                    PatchProxy.accessDispatch(new Object[]{aweme2}, adVar3, ad.f46392a, false, 42723, new Class[]{Aweme.class}, Void.TYPE);
                } else if (adVar2.f46394c != null) {
                    adVar2.f46395d = aweme2;
                    adVar2.f46394c.setOnClickListener(new ax(aweme2) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f46401a;

                        /* renamed from: b */
                        final /* synthetic */ Aweme f46402b;

                        public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.feed.ui.ad.2.a(android.view.View):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.feed.ui.ad.2.a(android.view.View):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                        
*/
                    });
                    FeedStickerTagView feedStickerTagView = adVar2.f46394c;
                    if (aweme2.getStickerEntranceInfo() != null) {
                        str = aweme2.getStickerEntranceInfo().name;
                    } else {
                        str = "";
                    }
                    feedStickerTagView.setStickerName(str);
                    if (PatchProxy.isSupport(new Object[]{aweme2}, null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43898, new Class[]{Aweme.class}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43898, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        if (aweme2 != null && aweme2.getStickerEntranceInfo() != null && !TextUtils.isEmpty(aweme2.getStickerEntranceInfo().id) && com.ss.android.ugc.aweme.festival.christmas.a.a()) {
                            com.ss.android.ugc.aweme.festival.common.a e2 = com.ss.android.ugc.aweme.festival.christmas.a.e();
                            if (e2 != null && !TextUtils.isEmpty(e2.f47288b) && !CollectionUtils.isEmpty(e2.i) && e2.i.contains(aweme2.getStickerEntranceInfo().id)) {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        adVar2.f46394c.setVisibility(0);
                        FeedStickerTagView feedStickerTagView2 = adVar2.f46394c;
                        if (com.ss.android.ugc.aweme.festival.christmas.a.e() != null) {
                            str2 = com.ss.android.ugc.aweme.festival.christmas.a.e().f47288b;
                        } else {
                            str2 = "";
                        }
                        feedStickerTagView2.a(true, str2);
                        return;
                    }
                    boolean a2 = ad.a(aweme2);
                    FeedStickerTagView feedStickerTagView3 = adVar2.f46394c;
                    if (a2) {
                        i = 0;
                    }
                    feedStickerTagView3.setVisibility(i);
                    adVar2.f46394c.a(false, null);
                }
            }
        }
    }
}
