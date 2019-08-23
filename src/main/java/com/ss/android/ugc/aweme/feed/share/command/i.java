package com.ss.android.ugc.aweme.feed.share.command;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.feed.share.command.g;
import com.ss.android.ugc.aweme.feed.share.command.h;
import com.ss.android.ugc.aweme.feed.share.command.k;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45984a;

    /* renamed from: b  reason: collision with root package name */
    private final h f45985b;

    /* renamed from: c  reason: collision with root package name */
    private final k.b f45986c;

    /* renamed from: d  reason: collision with root package name */
    private final String f45987d;

    /* renamed from: e  reason: collision with root package name */
    private final String f45988e;

    i(h hVar, k.b bVar, String str, String str2) {
        this.f45985b = hVar;
        this.f45986c = bVar;
        this.f45987d = str;
        this.f45988e = str2;
    }

    public final Object call() {
        g gVar;
        if (PatchProxy.isSupport(new Object[0], this, f45984a, false, 42202, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f45984a, false, 42202, new Class[0], Object.class);
        }
        h hVar = this.f45985b;
        k.b bVar = this.f45986c;
        String str = this.f45987d;
        String str2 = this.f45988e;
        Activity e2 = p.a().e();
        if (e2 == null) {
            return null;
        }
        IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
        g.a aVar = new g.a();
        String str3 = bVar.f45998b.f45994a;
        g.b bVar2 = g.b.f45962d;
        aVar.f45957b = str3;
        aVar.j = bVar2;
        String str4 = bVar.f45997a.f46001c;
        g.b bVar3 = g.b.f45962d;
        aVar.f45959d = str4;
        aVar.l = bVar3;
        String string = e2.getString(C0906R.string.pm);
        g.b bVar4 = g.b.f45962d;
        aVar.g = string;
        aVar.m = bVar4;
        String string2 = e2.getString(C0906R.string.om);
        g.b bVar5 = g.b.f45962d;
        aVar.h = string2;
        aVar.n = bVar5;
        aVar.f45961f = bVar.f45998b.f45995b;
        if (PatchProxy.isSupport(new Object[]{e2}, aVar, g.a.f45956a, false, 42199, new Class[]{Context.class}, g.class)) {
            g.a aVar2 = aVar;
            gVar = (g) PatchProxy.accessDispatch(new Object[]{e2}, aVar2, g.a.f45956a, false, 42199, new Class[]{Context.class}, g.class);
        } else {
            g gVar2 = new g(e2);
            gVar2.f45949b = aVar;
            gVar = gVar2;
        }
        h.AnonymousClass2 r3 = new View.OnClickListener(gVar) {

            /* renamed from: a */
            public static ChangeQuickRedirect f45975a;

            /* renamed from: b */
            final /* synthetic */ g f45976b;

            public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.feed.share.command.h.2.onClick(android.view.View):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.feed.share.command.h.2.onClick(android.view.View):void, class status: UNLOADED
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
        if (PatchProxy.isSupport(new Object[]{r3}, gVar, g.f45948a, false, 42197, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            g gVar3 = gVar;
            PatchProxy.accessDispatch(new Object[]{r3}, gVar3, g.f45948a, false, 42197, new Class[]{View.OnClickListener.class}, Void.TYPE);
        } else if (gVar.f45949b != null) {
            gVar.f45949b.q = r3;
        } else {
            throw new IllegalStateException("You must init Builder first !");
        }
        h.AnonymousClass3 r9 = new View.OnClickListener(str, iMiniAppService, str2, e2, gVar) {

            /* renamed from: a */
            public static ChangeQuickRedirect f45978a;

            /* renamed from: b */
            final /* synthetic */ String f45979b;

            /* renamed from: c */
            final /* synthetic */ IMiniAppService f45980c;

            /* renamed from: d */
            final /* synthetic */ String f45981d;

            /* renamed from: e */
            final /* synthetic */ Activity f45982e;

            /* renamed from: f */
            final /* synthetic */ g f45983f;

            public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.feed.share.command.h.3.onClick(android.view.View):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.feed.share.command.h.3.onClick(android.view.View):void, class status: UNLOADED
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
        if (PatchProxy.isSupport(new Object[]{r9}, gVar, g.f45948a, false, 42196, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            g gVar4 = gVar;
            PatchProxy.accessDispatch(new Object[]{r9}, gVar4, g.f45948a, false, 42196, new Class[]{View.OnClickListener.class}, Void.TYPE);
        } else if (gVar.f45949b != null) {
            gVar.f45949b.r = r9;
        } else {
            throw new IllegalStateException("You must init Builder first !");
        }
        gVar.setCancelable(false);
        gVar.show();
        return null;
    }
}
