package com.bytedance.android.livesdk.bgbroadcast;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.uikit.toast.a;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.live.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9241a;

    /* renamed from: b  reason: collision with root package name */
    private final BgBroadcastFragment f9242b;

    h(BgBroadcastFragment bgBroadcastFragment) {
        this.f9242b = bgBroadcastFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9241a, false, 3257, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9241a, false, 3257, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BgBroadcastFragment bgBroadcastFragment = this.f9242b;
        com.bytedance.android.livesdkapi.depend.model.live.h hVar = (com.bytedance.android.livesdkapi.depend.model.live.h) ((d) obj).f7871b;
        if (PatchProxy.isSupport(new Object[]{hVar}, bgBroadcastFragment, BgBroadcastFragment.f9140a, false, 3246, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, bgBroadcastFragment, BgBroadcastFragment.f9140a, false, 3246, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.h.class}, Void.TYPE);
            return;
        }
        if (hVar != null) {
            double d2 = hVar.f18739b;
            long j = hVar.f18741d;
            boolean z = ((Double) b.aR.a()).doubleValue() >= 9.0d && d2 < 9.0d;
            if (com.bytedance.android.livesdkapi.depend.model.live.h.f18738a == hVar.f18740c && ((Long) b.aS.a()).longValue() != j) {
                z = true;
            }
            if (z) {
                new a(bgBroadcastFragment.getContext()).a(48).a(5000).b(true).a(false).a(C0906R.layout.ahq, new com.bytedance.android.live.uikit.toast.d(hVar) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f9158a;

                    /* renamed from: b */
                    final /* synthetic */ h f9159b;

                    public final void a(
/*
Method generation error in method: com.bytedance.android.livesdk.bgbroadcast.BgBroadcastFragment.8.a(android.view.View):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.bgbroadcast.BgBroadcastFragment.8.a(android.view.View):void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            }
            b.aR.a(Double.valueOf(d2));
            b.aS.a(Long.valueOf(j));
        }
    }
}
