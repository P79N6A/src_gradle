package com.ss.android.ugc.aweme.newfollow.f;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.h.o;
import com.ss.android.ugc.aweme.feed.h.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.view.b;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57124a;

    /* renamed from: b  reason: collision with root package name */
    private final b f57125b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f57126c;

    /* renamed from: d  reason: collision with root package name */
    private final List f57127d;

    c(b bVar, Aweme aweme, List list) {
        this.f57125b = bVar;
        this.f57126c = aweme;
        this.f57127d = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f57124a, false, 61272, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f57124a, false, 61272, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.f57125b;
        Aweme aweme = this.f57126c;
        List list = this.f57127d;
        if (PatchProxy.isSupport(new Object[]{aweme, list, dialogInterface, Integer.valueOf(i)}, bVar, b.f3643c, false, 61230, new Class[]{Aweme.class, List.class, DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {aweme, list, dialogInterface, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b.f3643c;
            Object[] objArr2 = objArr;
            b bVar2 = bVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, 61230, new Class[]{Aweme.class, List.class, DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        dialogInterface.dismiss();
        String str = (String) list.get(i);
        if (TextUtils.equals(str, bVar.r().getString(C0906R.string.c65))) {
            bVar.c(null, null, aweme);
        } else if (TextUtils.equals(str, bVar.r().getString(C0906R.string.dpt))) {
            new a(new b(bVar.r()), new a.c(aweme) {

                /* renamed from: a */
                public static ChangeQuickRedirect f57115a;

                /* renamed from: b */
                final /* synthetic */ Aweme f57116b;

                public final java.lang.String a(
/*
Method generation error in method: com.ss.android.ugc.aweme.newfollow.f.b.1.a():java.lang.String, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.newfollow.f.b.1.a():java.lang.String, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:623)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
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

                public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.newfollow.f.b.1.a(int, com.ss.android.ugc.aweme.profile.model.User):void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.newfollow.f.b.1.a(int, com.ss.android.ugc.aweme.profile.model.User):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:623)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
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
            }).a(aweme.getAuthor());
            e eVar = new e();
            eVar.f57087a = aweme.getAuthorUid();
            bg.a(eVar);
        } else {
            if (TextUtils.equals(str, bVar.r().getString(C0906R.string.ai2))) {
                p pVar = new p(bVar.r());
                pVar.a(new o());
                pVar.a(aweme, 2);
                pVar.a(aweme.getAid(), 3);
            }
        }
    }
}
