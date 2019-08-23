package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.net.Uri;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.banner.a;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.e.c;
import com.bytedance.android.livesdk.chatroom.event.aj;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget;
import com.bytedance.android.livesdk.j.b.k;
import com.bytedance.android.livesdk.j.b.n;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13267a;

    /* renamed from: b  reason: collision with root package name */
    private final BottomRightBannerWidget f13268b;

    g(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f13268b = bottomRightBannerWidget;
    }

    public final void accept(Object obj) {
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13267a, false, 6586, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13267a, false, 6586, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BottomRightBannerWidget bottomRightBannerWidget = this.f13268b;
        f fVar = ((a.b) obj).f9105c;
        if (PatchProxy.isSupport(new Object[]{fVar}, bottomRightBannerWidget, BottomRightBannerWidget.f12363a, false, 6580, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, bottomRightBannerWidget, BottomRightBannerWidget.f12363a, false, 6580, new Class[]{f.class}, Void.TYPE);
        } else if (!bottomRightBannerWidget.isViewValid() || fVar == null || fVar.f11114a == null || Lists.isEmpty(fVar.f11114a.f11118b)) {
            bottomRightBannerWidget.h = false;
            UIUtils.setViewVisibility(bottomRightBannerWidget.containerView, 8);
        } else {
            bottomRightBannerWidget.h = true;
            UIUtils.setViewVisibility(bottomRightBannerWidget.containerView, 0);
            if (bottomRightBannerWidget.dataCenter != null) {
                bottomRightBannerWidget.dataCenter.lambda$put$1$DataCenter("data_right_bottom_banner_show", new aj(0, true));
            }
            if (bottomRightBannerWidget.f12365c != null) {
                bottomRightBannerWidget.f12365c.f9317b.setVisibility(4);
            }
            bottomRightBannerWidget.g = fVar;
            com.bytedance.android.livesdk.chatroom.presenter.a aVar = bottomRightBannerWidget.f12364b;
            String str2 = fVar.f11114a.f11117a;
            if (PatchProxy.isSupport(new Object[]{str2}, aVar, com.bytedance.android.livesdk.chatroom.presenter.a.f11194a, false, 5128, new Class[]{String.class}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{str2}, aVar, com.bytedance.android.livesdk.chatroom.presenter.a.f11194a, false, 5128, new Class[]{String.class}, String.class);
            } else {
                String str3 = "";
                String str4 = "";
                String str5 = "";
                String str6 = "";
                String str7 = "";
                com.bytedance.android.livesdk.j.b.g a2 = com.bytedance.android.livesdk.j.a.a().a(j.class);
                if (a2 instanceof k) {
                    k kVar = (k) a2;
                    if (kVar.a().containsKey("enter_from")) {
                        str3 = (String) kVar.a().get("enter_from");
                    }
                    if (kVar.a().containsKey("source")) {
                        str4 = (String) kVar.a().get("source");
                    }
                }
                com.bytedance.android.livesdk.j.b.g a3 = com.bytedance.android.livesdk.j.a.a().a(Room.class);
                if (a3 instanceof n) {
                    n nVar = (n) a3;
                    if (nVar.a().containsKey("anchor_id")) {
                        str5 = (String) nVar.a().get("anchor_id");
                    }
                    if (nVar.a().containsKey("log_pb")) {
                        str6 = (String) nVar.a().get("log_pb");
                    }
                    if (nVar.a().containsKey("request_id")) {
                        str7 = (String) nVar.a().get("request_id");
                    }
                }
                i iVar = new i(str2);
                iVar.a("room_id", aVar.f11196c.getId());
                iVar.a("mode", "live_room");
                iVar.a("anchor_id", aVar.f11196c.getOwner().getId());
                iVar.a("is_anchor", String.valueOf(aVar.f11195b));
                iVar.a("enter_from", str3);
                iVar.a("source_v3", str4);
                iVar.a("anchor_id", str5);
                iVar.a("log_pb", str6);
                iVar.a("request_id", str7);
                iVar.a("event_page", aVar.f11195b ? "live_take_detail" : "live_detail");
                iVar.a("event_belong", "live_interact");
                str = iVar.a();
            }
            Uri parse = Uri.parse(str);
            if (bottomRightBannerWidget.f12365c != null) {
                b.e eVar = bottomRightBannerWidget.f12365c;
                BottomRightBannerWidget.AnonymousClass1 r6 = new com.bytedance.android.livesdk.browser.e.a(fVar) {

                    /* renamed from: b */
                    public static ChangeQuickRedirect f12369b;

                    /* renamed from: c */
                    final /* synthetic */ f f12370c;

                    public final java.lang.String b(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.1.b():java.lang.String, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.1.b():java.lang.String, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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

                    public final java.lang.String a(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.1.a(android.net.Uri):java.lang.String, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.1.a(android.net.Uri):java.lang.String, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                };
                if (PatchProxy.isSupport(new Object[]{r6}, eVar, b.e.f9316a, false, 3431, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{r6}, eVar, b.e.f9316a, false, 3431, new Class[]{c.class}, Void.TYPE);
                } else {
                    eVar.f9321f.add(r6);
                }
            }
            bottomRightBannerWidget.f12368f.a(bottomRightBannerWidget.f12365c, parse.buildUpon().appendQueryParameter("room_id", String.valueOf(bottomRightBannerWidget.f12366d.getId())).appendQueryParameter("anchor_id", String.valueOf(bottomRightBannerWidget.f12366d.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(TTLiveSDKContext.getHostService().k().b())).toString());
        }
    }
}
