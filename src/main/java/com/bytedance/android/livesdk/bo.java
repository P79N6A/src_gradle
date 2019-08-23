package com.bytedance.android.livesdk;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.chatroom.model.ae;
import com.bytedance.android.livesdk.chatroom.ui.aj;
import com.bytedance.android.livesdk.effect.LiveFilterDialogFragment;
import com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter;
import com.bytedance.android.livesdk.game.SelectGameDialogFragment;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.m.b.d;
import com.bytedance.android.livesdk.m.f;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdk.widget.LiveTagPicker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class bo implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9268a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9269b;

    bo(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9269b = startLiveFragmentDefault;
    }

    public final void onClick(View view) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view}, this, f9268a, false, 2937, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9268a, false, 2937, new Class[]{View.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f9269b;
        int id = view.getId();
        if (id == C0906R.id.aiw) {
            int i2 = 1 - startLiveFragmentDefault.u;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), (byte) 1}, startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2895, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                StartLiveFragmentDefault startLiveFragmentDefault2 = startLiveFragmentDefault;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), (byte) 1}, startLiveFragmentDefault2, StartLiveFragmentDefault.f8844a, false, 2895, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            } else {
                a.a().a("camera_switch", new j().a("live_take_page").b("live").f("click"));
                startLiveFragmentDefault.u = i2;
                b.g.b(Integer.valueOf(startLiveFragmentDefault.u));
                if (startLiveFragmentDefault.s != null) {
                    startLiveFragmentDefault.s.a(i2);
                }
            }
        } else {
            LiveFilterDialogFragment liveFilterDialogFragment = null;
            if (id == C0906R.id.ti) {
                startLiveFragmentDefault.C = null;
                if (startLiveFragmentDefault.s != null) {
                    startLiveFragmentDefault.s.a();
                }
            } else if (id == C0906R.id.aih) {
                startLiveFragmentDefault.f();
            } else if (id == C0906R.id.co7) {
                a.a().a("live_take_beauty_click", startLiveFragmentDefault.b(new HashMap<>()), new j().b("live_take").f("click").a("live_take_page"));
                startLiveFragmentDefault.g();
            } else if (id == C0906R.id.djh) {
                if (PatchProxy.isSupport(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2891, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2891, new Class[0], Void.TYPE);
                } else {
                    if (startLiveFragmentDefault.k == null) {
                        startLiveFragmentDefault.k = new aj(startLiveFragmentDefault.getContext(), startLiveFragmentDefault.t);
                        startLiveFragmentDefault.k.setOnDismissListener(new bv(startLiveFragmentDefault));
                    }
                    startLiveFragmentDefault.k.f11830b = startLiveFragmentDefault;
                    if (!startLiveFragmentDefault.k.isShowing()) {
                        startLiveFragmentDefault.k.show();
                        startLiveFragmentDefault.b(8);
                    }
                }
            } else if (id == C0906R.id.d89) {
                if (PatchProxy.isSupport(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2892, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2892, new Class[0], Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_belong", "live");
                    hashMap.put("event_type", "click");
                    hashMap.put("event_page", "live_take_page");
                    hashMap.put("event_module", "location");
                    hashMap.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().k().b()));
                    a.a().a("remind_location_click", hashMap, new Object[0]);
                    if (startLiveFragmentDefault.getActivity() != null) {
                        f.a(startLiveFragmentDefault.getActivity()).a(bw.f9662b).b(bx.f9664b).a(new d() {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f8863a;

                            public final void a(
/*
Method generation error in method: com.bytedance.android.livesdk.StartLiveFragmentDefault.8.a(java.lang.String[]):void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.StartLiveFragmentDefault.8.a(java.lang.String[]):void, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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

                            public final void b(
/*
Method generation error in method: com.bytedance.android.livesdk.StartLiveFragmentDefault.8.b(java.lang.String[]):void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.StartLiveFragmentDefault.8.b(java.lang.String[]):void, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                        }, "android.permission.ACCESS_FINE_LOCATION");
                    }
                }
            } else if (id == C0906R.id.cob) {
                if (PatchProxy.isSupport(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2900, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2900, new Class[0], Void.TYPE);
                } else {
                    SelectGameDialogFragment a2 = SelectGameDialogFragment.a(startLiveFragmentDefault.A);
                    a2.a((SelectGameDialogFragment.a) new cc(startLiveFragmentDefault, a2));
                    a2.f14637b = new cd(startLiveFragmentDefault);
                    a2.show(startLiveFragmentDefault.getChildFragmentManager(), SelectGameDialogFragment.class.getSimpleName());
                    startLiveFragmentDefault.e(8);
                }
            } else if (id == C0906R.id.bec) {
                if (PatchProxy.isSupport(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2896, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2896, new Class[0], Void.TYPE);
                } else if (startLiveFragmentDefault.t == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
                    a.a().a("game_take_guide", new j().b("live").f("click").a("live_take_page"));
                    com.bytedance.android.livesdk.v.j.q().f().a(startLiveFragmentDefault.getContext(), c.b("https://hotsoon.snssdk.com/falcon/live_inroom/page/game_course/index.html").a(ac.a((int) C0906R.string.dfj)));
                } else {
                    com.bytedance.android.livesdk.v.j.q().f().a(startLiveFragmentDefault.getContext(), c.b("https://hotsoon.snssdk.com/falcon/live_inroom/page/obs_course/index.html").a(ac.a((int) C0906R.string.d8x)));
                    a.a().a("thirdparty_take_guide", new j().b("live_take").f("click").a("live_take_page"));
                }
            } else if (id == C0906R.id.csm) {
                if (PatchProxy.isSupport(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2893, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2893, new Class[0], Void.TYPE);
                } else {
                    a.a().a("room_tag_button_click", new j().b("live").f("click").a("live_take_page"));
                    ae aeVar = (ae) StartLiveFragmentDefault.f8845b.fromJson((String) ((Map) b.C.a()).get(startLiveFragmentDefault.t.name()), ae.class);
                    if (aeVar == null) {
                        i = -1;
                    } else {
                        i = aeVar.f11091a;
                    }
                    LiveTagPicker a3 = LiveTagPicker.a(i);
                    a3.h = new by(startLiveFragmentDefault);
                    a3.show(startLiveFragmentDefault.getFragmentManager(), "TAG_PICKER");
                    startLiveFragmentDefault.e(8);
                }
            } else if (id == C0906R.id.cog) {
                if (PatchProxy.isSupport(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2902, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2902, new Class[0], Void.TYPE);
                } else {
                    Boolean valueOf = Boolean.valueOf(!((Boolean) startLiveFragmentDefault.j.getTag(C0906R.id.d7u)).booleanValue());
                    startLiveFragmentDefault.j.setTag(C0906R.id.d7u, valueOf);
                    startLiveFragmentDefault.h();
                    startLiveFragmentDefault.v.a("hotsoon.pref.LAST_SET_LANDSCAPE", (Object) valueOf).a();
                }
            } else if (id == C0906R.id.coa) {
                a.a().a("live_take_filter_click", startLiveFragmentDefault.b(new HashMap<>()), new j().b("live_take").f("click").a("live_take_page"));
                if (PatchProxy.isSupport(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2898, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], startLiveFragmentDefault, StartLiveFragmentDefault.f8844a, false, 2898, new Class[0], Void.TYPE);
                } else if (startLiveFragmentDefault.isAdded() && startLiveFragmentDefault.getChildFragmentManager().findFragmentByTag("filter_dialog_tag") == null) {
                    if (startLiveFragmentDefault.s != null && !TextUtils.isEmpty(null)) {
                        liveFilterDialogFragment = LiveFilterDialogFragment.a(startLiveFragmentDefault.E, null, true, true);
                    }
                    if (liveFilterDialogFragment == null && startLiveFragmentDefault.D != null) {
                        liveFilterDialogFragment = LiveFilterDialogFragment.a(startLiveFragmentDefault.E, startLiveFragmentDefault.D, true);
                    }
                    if (liveFilterDialogFragment == null) {
                        LiveFilterAdapter.a aVar = startLiveFragmentDefault.E;
                        if (PatchProxy.isSupport(new Object[]{aVar, (byte) 1}, null, LiveFilterDialogFragment.f13693a, true, 8145, new Class[]{LiveFilterAdapter.a.class, Boolean.TYPE}, LiveFilterDialogFragment.class)) {
                            liveFilterDialogFragment = (LiveFilterDialogFragment) PatchProxy.accessDispatch(new Object[]{aVar, (byte) 1}, null, LiveFilterDialogFragment.f13693a, true, 8145, new Class[]{LiveFilterAdapter.a.class, Boolean.TYPE}, LiveFilterDialogFragment.class);
                        } else {
                            LiveFilterDialogFragment liveFilterDialogFragment2 = new LiveFilterDialogFragment();
                            liveFilterDialogFragment2.f13694b = aVar;
                            Bundle bundle = new Bundle();
                            liveFilterDialogFragment2.f13696d = com.bytedance.android.livesdk.effect.j.a().f13785b;
                            bundle.putBoolean("bundle_full_screen", true);
                            liveFilterDialogFragment2.setArguments(bundle);
                            liveFilterDialogFragment = liveFilterDialogFragment2;
                        }
                    }
                    liveFilterDialogFragment.f13695c = new bz(startLiveFragmentDefault);
                    liveFilterDialogFragment.show(startLiveFragmentDefault.getChildFragmentManager(), "filter_dialog_tag");
                    startLiveFragmentDefault.e(8);
                }
            } else if (id == C0906R.id.tt) {
                startLiveFragmentDefault.a((ae) null);
            } else if (id == C0906R.id.co8) {
                startLiveFragmentDefault.q();
            } else if (id == C0906R.id.bdj && startLiveFragmentDefault.r == null) {
                startLiveFragmentDefault.p.a();
            }
        }
    }
}
