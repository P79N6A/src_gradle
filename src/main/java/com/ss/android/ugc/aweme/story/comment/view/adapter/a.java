package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.g;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72281a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentListAdapter f72282b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72283c;

    a(CommentListAdapter commentListAdapter, int i) {
        this.f72282b = commentListAdapter;
        this.f72283c = i;
    }

    public final void onClick(View view) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, f72281a, false, 82978, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72281a, false, 82978, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentListAdapter commentListAdapter = this.f72282b;
        int i = this.f72283c;
        g gVar = (g) commentListAdapter.getData().get(i);
        if (PatchProxy.isSupport(new Object[]{gVar}, commentListAdapter, CommentListAdapter.f72236a, false, 82974, new Class[]{g.class}, Boolean.TYPE)) {
            CommentListAdapter commentListAdapter2 = commentListAdapter;
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{gVar}, commentListAdapter2, CommentListAdapter.f72236a, false, 82974, new Class[]{g.class}, Boolean.TYPE)).booleanValue();
        } else {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (!(iUserService == null || gVar == null)) {
                User user = gVar.f71853c;
                if (user != null && TextUtils.equals(user.getUid(), iUserService.getCurrentUserID())) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            g gVar2 = (g) commentListAdapter.getData().get(i);
            if (PatchProxy.isSupport(new Object[]{gVar2}, commentListAdapter, CommentListAdapter.f72236a, false, 82976, new Class[]{g.class}, Void.TYPE)) {
                Object[] objArr = {gVar2};
                CommentListAdapter commentListAdapter3 = commentListAdapter;
                ChangeQuickRedirect changeQuickRedirect = CommentListAdapter.f72236a;
                PatchProxy.accessDispatch(objArr, commentListAdapter3, changeQuickRedirect, false, 82976, new Class[]{g.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(commentListAdapter.f72237b.getContext());
                aVar.a((CharSequence[]) new String[]{"删除"}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(gVar2) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f72241a;

                    /* renamed from: b */
                    final /* synthetic */ g f72242b;

                    public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.story.comment.view.adapter.CommentListAdapter.2.onClick(android.content.DialogInterface, int):void, dex: classes5.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.story.comment.view.adapter.CommentListAdapter.2.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
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
                aVar.b();
            }
        } else {
            g gVar3 = (g) commentListAdapter.getData().get(i);
            if (PatchProxy.isSupport(new Object[]{gVar3}, commentListAdapter, CommentListAdapter.f72236a, false, 82975, new Class[]{g.class}, Void.TYPE)) {
                Object[] objArr2 = {gVar3};
                CommentListAdapter commentListAdapter4 = commentListAdapter;
                ChangeQuickRedirect changeQuickRedirect2 = CommentListAdapter.f72236a;
                PatchProxy.accessDispatch(objArr2, commentListAdapter4, changeQuickRedirect2, false, 82975, new Class[]{g.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.common.ui.a aVar2 = new com.ss.android.ugc.aweme.common.ui.a(commentListAdapter.f72237b.getContext());
            aVar2.a((CharSequence[]) new String[]{"回复"}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(gVar3) {

                /* renamed from: a */
                public static ChangeQuickRedirect f72238a;

                /* renamed from: b */
                final /* synthetic */ g f72239b;

                public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.story.comment.view.adapter.CommentListAdapter.1.onClick(android.content.DialogInterface, int):void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.story.comment.view.adapter.CommentListAdapter.1.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
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
            });
            aVar2.b();
        }
    }
}
