package com.ss.android.ugc.aweme.account.fragment;

import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31957a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseLoginNewFragment f31958b;

    /* renamed from: c  reason: collision with root package name */
    private final View f31959c;

    c(BaseLoginNewFragment baseLoginNewFragment, View view) {
        this.f31958b = baseLoginNewFragment;
        this.f31959c = view;
    }

    public final void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f31957a, false, 19903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31957a, false, 19903, new Class[0], Void.TYPE);
            return;
        }
        BaseLoginNewFragment baseLoginNewFragment = this.f31958b;
        View view = this.f31959c;
        if (baseLoginNewFragment.isViewValid() && baseLoginNewFragment.getContext() != null && baseLoginNewFragment.f31898b != null) {
            int height = view.getRootView().getHeight() - view.getHeight();
            baseLoginNewFragment.f31898b.removeCallbacksAndMessages(null);
            baseLoginNewFragment.f31898b.post(new Runnable(height) {

                /* renamed from: a */
                public static ChangeQuickRedirect f31900a;

                /* renamed from: b */
                final /* synthetic */ int f31901b;

                public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.account.fragment.BaseLoginNewFragment.1.run():void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.account.fragment.BaseLoginNewFragment.1.run():void, class status: UNLOADED
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
        }
    }
}
