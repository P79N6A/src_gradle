package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.eo;
import com.bytedance.android.livesdk.d.a;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdk.widget.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class o implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12287a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12288b;

    o(AbsInteractionFragment absInteractionFragment) {
        this.f12288b = absInteractionFragment;
    }

    public final boolean a(Runnable runnable, boolean z) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12287a, false, 5569, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{runnable2, Byte.valueOf(z)}, this, f12287a, false, 5569, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        AbsInteractionFragment absInteractionFragment = this.f12288b;
        if (com.bytedance.android.live.uikit.a.a.a() || z) {
            return false;
        }
        if (!absInteractionFragment.u || !TTLiveSDKContext.getHostService().k().c() || absInteractionFragment.f11425b.getOwner().isFollowing() || SystemClock.elapsedRealtime() - absInteractionFragment.w.o <= 30000) {
            absInteractionFragment.f();
            return false;
        }
        long id = absInteractionFragment.f11425b.getId();
        long id2 = absInteractionFragment.f11425b.getOwner().getId();
        String labels = absInteractionFragment.f11425b.getLabels();
        if (com.bytedance.android.live.uikit.a.a.b()) {
            u uVar = new u(absInteractionFragment.getActivity());
            uVar.d((int) C0906R.string.dhj);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.cqy)}, uVar, u.f18560a, false, 14624, new Class[]{Integer.TYPE}, u.class)) {
                u uVar2 = uVar;
                u uVar3 = (u) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.cqy)}, uVar2, u.f18560a, false, 14624, new Class[]{Integer.TYPE}, u.class);
            } else {
                uVar.a(uVar.f18561b.getString(C0906R.string.cqy));
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.d9_)}, uVar, u.f18560a, false, 14626, new Class[]{Integer.TYPE}, u.class)) {
                u uVar4 = uVar;
                u uVar5 = (u) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.d9_)}, uVar4, u.f18560a, false, 14626, new Class[]{Integer.TYPE}, u.class);
            } else {
                uVar.b(uVar.f18561b.getString(C0906R.string.d9_));
            }
            Dialog a2 = uVar.a();
            u uVar6 = uVar;
            j jVar = new j(absInteractionFragment, id2, id, labels, a2, runnable);
            uVar6.a((View.OnClickListener) jVar);
            uVar6.b((View.OnClickListener) new k(a2, runnable2));
            a2.show();
        } else if (com.bytedance.android.live.uikit.a.a.d()) {
            SpannableString spannableString = new SpannableString(ac.a((int) C0906R.string.d9a));
            spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_t)), 0, spannableString.length(), 33);
            AbsInteractionFragment.AnonymousClass13 r0 = new DialogInterface.OnClickListener(id2, id, labels, runnable) {

                /* renamed from: a */
                public static ChangeQuickRedirect f11441a;

                /* renamed from: b */
                final /* synthetic */ long f11442b;

                /* renamed from: c */
                final /* synthetic */ long f11443c;

                /* renamed from: d */
                final /* synthetic */ String f11444d;

                /* renamed from: e */
                final /* synthetic */ Runnable f11445e;

                public final void onClick(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.13.onClick(android.content.DialogInterface, int):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.13.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
            new eo.a(absInteractionFragment.getContext(), 2).a(true).a((int) C0906R.string.d42).b((int) C0906R.string.d9b).a(ac.a((int) C0906R.string.d9_), new DialogInterface.OnClickListener(runnable2) {

                /* renamed from: a */
                public static ChangeQuickRedirect f11449a;

                /* renamed from: b */
                final /* synthetic */ Runnable f11450b;

                public final void onClick(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.14.onClick(android.content.DialogInterface, int):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.14.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
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
            }).b(spannableString, r0).b();
        } else {
            m.a b2 = new m.a(absInteractionFragment.getContext()).a(true).d((int) C0906R.string.d42).c((int) C0906R.string.d9b);
            l lVar = new l(absInteractionFragment, id2, id, labels, runnable);
            m a3 = b2.b(0, (int) C0906R.string.d9a, (DialogInterface.OnClickListener) lVar).b(1, (int) C0906R.string.d9_, (DialogInterface.OnClickListener) new n(runnable2)).a();
            if (com.bytedance.android.live.uikit.a.a.a()) {
                a3.f18501d.setTextColor(ac.b((int) C0906R.color.af1));
            }
            a3.show();
        }
        return true;
    }
}
