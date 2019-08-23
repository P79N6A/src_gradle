package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.bytedance.android.live.uikit.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12046a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDetailFragment f12047b;

    cx(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f12047b = liveProfileDetailFragment;
    }

    public final void run() {
        ObjectAnimator objectAnimator;
        if (PatchProxy.isSupport(new Object[0], this, f12046a, false, 6123, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12046a, false, 6123, new Class[0], Void.TYPE);
            return;
        }
        LiveProfileDetailFragment liveProfileDetailFragment = this.f12047b;
        if (liveProfileDetailFragment.b_() && !liveProfileDetailFragment.C) {
            liveProfileDetailFragment.C = true;
            liveProfileDetailFragment.f11638c.setVisibility(0);
            float x = liveProfileDetailFragment.f11637b.getX() + ((float) liveProfileDetailFragment.f11637b.getWidth());
            if (c.a(liveProfileDetailFragment.getContext())) {
                objectAnimator = ObjectAnimator.ofFloat(liveProfileDetailFragment.f11638c, "translationX", new float[]{x, liveProfileDetailFragment.f11637b.getX()});
            } else {
                objectAnimator = ObjectAnimator.ofFloat(liveProfileDetailFragment.f11638c, "translationX", new float[]{liveProfileDetailFragment.f11637b.getX(), x});
            }
            objectAnimator.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a */
                public static ChangeQuickRedirect f11642a;

                public final void onAnimationEnd(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment.2.onAnimationEnd(android.animation.Animator):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment.2.onAnimationEnd(android.animation.Animator):void, class status: UNLOADED
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
            objectAnimator.setDuration(1000);
            objectAnimator.start();
        }
    }
}
