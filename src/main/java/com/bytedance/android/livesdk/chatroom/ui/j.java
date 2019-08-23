package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.view.View;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.user.f;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observer;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12268a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12269b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12270c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12271d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12272e;

    /* renamed from: f  reason: collision with root package name */
    private final Dialog f12273f;
    private final Runnable g;

    j(AbsInteractionFragment absInteractionFragment, long j, long j2, String str, Dialog dialog, Runnable runnable) {
        this.f12269b = absInteractionFragment;
        this.f12270c = j;
        this.f12271d = j2;
        this.f12272e = str;
        this.f12273f = dialog;
        this.g = runnable;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12268a, false, 5564, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12268a, false, 5564, new Class[]{View.class}, Void.TYPE);
            return;
        }
        AbsInteractionFragment absInteractionFragment = this.f12269b;
        long j = this.f12270c;
        long j2 = this.f12271d;
        String str = this.f12272e;
        Dialog dialog = this.f12273f;
        Runnable runnable = this.g;
        TTLiveSDKContext.getHostService().k().a(((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.a) f.a().a(j)).a(absInteractionFragment.f11425b.getRequestId())).b("live_detail")).c("live")).b(j2)).d(str)).c()).subscribe((Observer<? super T>) new g<a>() {

            /* renamed from: a */
            public static ChangeQuickRedirect f11439a;

            public final void onSubscribe(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.12.onSubscribe(io.reactivex.disposables.Disposable):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment.12.onSubscribe(io.reactivex.disposables.Disposable):void, class status: UNLOADED
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
        af.a(dialog);
        runnable.run();
        absInteractionFragment.w.g();
    }
}
