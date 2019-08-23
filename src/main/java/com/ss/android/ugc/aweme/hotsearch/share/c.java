package com.ss.android.ugc.aweme.hotsearch.share;

import a.g;
import a.i;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.q;
import com.ss.android.ugc.aweme.share.ca;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49818a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchRankingShareDialog f49819b;

    /* renamed from: c  reason: collision with root package name */
    private final a f49820c;

    c(HotSearchRankingShareDialog hotSearchRankingShareDialog, a aVar) {
        this.f49819b = hotSearchRankingShareDialog;
        this.f49820c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49818a, false, 49765, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49818a, false, 49765, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        HotSearchRankingShareDialog hotSearchRankingShareDialog = this.f49819b;
        a aVar = this.f49820c;
        if (!hotSearchRankingShareDialog.a(aVar.d())) {
            hotSearchRankingShareDialog.cancel();
        } else if (aVar.a()) {
            if (TextUtils.equals(aVar.d(), "rocket") || TextUtils.equals(aVar.d(), "more") || TextUtils.equals(aVar.d(), "copy") || TextUtils.equals(aVar.d(), "chat_merge")) {
                hotSearchRankingShareDialog.onShareComplete(aVar.a(hotSearchRankingShareDialog.mShareStruct));
                if (hotSearchRankingShareDialog.mActionHandler != null) {
                    hotSearchRankingShareDialog.mActionHandler.onAction(hotSearchRankingShareDialog.mShareStruct, aVar.d());
                }
                hotSearchRankingShareDialog.cancel();
                return;
            }
            i.a((Callable<TResult>) new e<TResult>(hotSearchRankingShareDialog)).a((g<TResult, TContinuationResult>) new f<TResult,TContinuationResult>(hotSearchRankingShareDialog, aVar), i.f1052b);
        } else if (q.a(aVar.d())) {
            ca.a(hotSearchRankingShareDialog.f49788b, hotSearchRankingShareDialog.mShareStruct, new com.ss.android.ugc.aweme.base.a<Boolean>(aVar) {

                /* renamed from: a */
                public static ChangeQuickRedirect f49790a;

                /* renamed from: b */
                final /* synthetic */ a f49791b;

                public final /* synthetic */ void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.hotsearch.share.HotSearchRankingShareDialog.1.run(java.lang.Object):void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.hotsearch.share.HotSearchRankingShareDialog.1.run(java.lang.Object):void, class status: UNLOADED
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
            });
            hotSearchRankingShareDialog.dismiss();
        } else {
            com.bytedance.ies.dmt.ui.d.a.b((Context) hotSearchRankingShareDialog.f49788b, aVar.c(), 0).a();
        }
    }
}
