package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.share.command.e;
import com.ss.android.ugc.aweme.feed.share.command.o;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.feed.ui.g;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.q;
import java.util.HashMap;

public final /* synthetic */ class cd implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64925a;

    /* renamed from: b  reason: collision with root package name */
    private final ShareDialog f64926b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64927c;

    cd(ShareDialog shareDialog, a aVar) {
        this.f64926b = shareDialog;
        this.f64927c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64925a, false, 73302, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64925a, false, 73302, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ShareDialog shareDialog = this.f64926b;
        a aVar = this.f64927c;
        if (!com.ss.android.ugc.aweme.c.a.a.a(view) && !d.c(shareDialog.v) && !TimeLockRuler.isEnableShowTeenageTip(C0906R.string.cij)) {
            if (PatchProxy.isSupport(new Object[]{aVar}, shareDialog, ShareDialog.f64541a, false, 73299, new Class[]{a.class}, Void.TYPE)) {
                ShareDialog shareDialog2 = shareDialog;
                PatchProxy.accessDispatch(new Object[]{aVar}, shareDialog2, ShareDialog.f64541a, false, 73299, new Class[]{a.class}, Void.TYPE);
            } else if (c.L(shareDialog.v)) {
                IShareService.ShareResult shareResult = new IShareService.ShareResult();
                shareResult.success = true;
                shareResult.type = aVar.d();
                shareDialog.onShareComplete(shareResult);
            }
            ca.a(aVar);
            if (shareDialog.mActionHandler != null && (shareDialog.mActionHandler instanceof p)) {
                ((p) shareDialog.mActionHandler).f46814f = new ce(shareDialog);
            }
            if (!shareDialog.a(aVar.d())) {
                cl a2 = cg.a(aVar.d(), cg.a());
                if (a2 == null || a2.f64988c != 3 || com.ss.android.ugc.aweme.feed.share.a.c.c(shareDialog.v)) {
                    shareDialog.dismiss();
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) shareDialog.f64542b, shareDialog.f64542b.getString(C0906R.string.ah9)).a();
                }
            } else {
                if (aVar.a()) {
                    if (!g.b(shareDialog.v)) {
                        shareDialog.dismiss();
                    } else if (cg.b(aVar.d())) {
                        com.ss.android.ugc.aweme.feed.share.command.d a3 = e.a(shareDialog.v, (Context) shareDialog.f64542b);
                        HashMap<String, String> hashMap = new HashMap<>();
                        hashMap.put("enter_from", shareDialog.u);
                        hashMap.put("group_id", shareDialog.v.getAid());
                        a3.j.extraParams = hashMap;
                        new o(shareDialog.f64542b, a3, 7, aVar.d()).show();
                        shareDialog.dismiss();
                        IShareService.ShareResult shareResult2 = new IShareService.ShareResult();
                        shareResult2.success = true;
                        shareResult2.type = aVar.d();
                        shareResult2.identifier = shareDialog.v.getAid();
                        shareResult2.eventType = shareDialog.w;
                        shareDialog.onShareComplete(shareResult2);
                    } else {
                        if (PatchProxy.isSupport(new Object[]{aVar}, shareDialog, ShareDialog.f64541a, false, 73297, new Class[]{a.class}, Void.TYPE)) {
                            Object[] objArr = {aVar};
                            ShareDialog shareDialog3 = shareDialog;
                            ChangeQuickRedirect changeQuickRedirect = ShareDialog.f64541a;
                            PatchProxy.accessDispatch(objArr, shareDialog3, changeQuickRedirect, false, 73297, new Class[]{a.class}, Void.TYPE);
                        } else {
                            IShareService.ShareStruct a4 = i.a((Context) shareDialog.f64542b, shareDialog.v);
                            a4.enterFrom = shareDialog.u;
                            com.ss.android.ugc.aweme.qrcode.f.a a5 = com.ss.android.ugc.aweme.qrcode.f.a.a(shareDialog.f64542b, shareDialog.f64542b.getResources().getString(C0906R.string.a8b));
                            a5.a();
                            com.ss.android.b.a.a.a.a(new Runnable(aVar, a4, a5) {

                                /* renamed from: a */
                                public static ChangeQuickRedirect f64551a;

                                /* renamed from: b */
                                final /* synthetic */ a f64552b;

                                /* renamed from: c */
                                final /* synthetic */ IShareService.ShareStruct f64553c;

                                /* renamed from: d */
                                final /* synthetic */ com.ss.android.ugc.aweme.qrcode.f.a f64554d;

                                public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.share.ShareDialog.3.run():void, dex: classes5.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.share.ShareDialog.3.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                        }
                    }
                } else if (q.a(aVar.d())) {
                    ca.a(shareDialog.f64542b, shareDialog.mShareStruct, new com.ss.android.ugc.aweme.base.a<Boolean>(aVar) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f64544a;

                        /* renamed from: b */
                        final /* synthetic */ a f64545b;

                        public final /* synthetic */ void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.share.ShareDialog.1.run(java.lang.Object):void, dex: classes5.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.share.ShareDialog.1.run(java.lang.Object):void, class status: UNLOADED
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
                    shareDialog.dismiss();
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) shareDialog.f64542b, aVar.c(), 0).a();
                }
            }
        }
    }
}
