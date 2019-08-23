package com.douyin.share.a.a.b;

import android.os.Handler;
import com.bytedance.common.utility.StringUtils;
import com.douyin.share.a.a.b.a;
import com.douyin.share.a.b.b.d;
import com.douyin.share.a.b.c.a;
import com.douyin.share.a.b.c.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class b implements a, c {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f23122a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23123b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23124c;

    /* renamed from: d  reason: collision with root package name */
    private final String f23125d;

    /* renamed from: e  reason: collision with root package name */
    private final String f23126e;

    public final boolean a(d dVar, Handler handler) {
        Runnable runnable;
        Handler handler2 = handler;
        long j = dVar.j();
        long k = dVar.k();
        String b2 = dVar.b();
        if (j > 0 || k > 0) {
            a.AnonymousClass2 r17 = r2;
            a.AnonymousClass2 r2 = new Callable(this.f23123b, dVar.i(), dVar.j(), dVar.k(), dVar.l(), 0, 0, this.f23124c, this.f23125d, this.f23126e) {

                /* renamed from: a */
                final /* synthetic */ String f23111a;

                /* renamed from: b */
                final /* synthetic */ String f23112b;

                /* renamed from: c */
                final /* synthetic */ long f23113c;

                /* renamed from: d */
                final /* synthetic */ long f23114d;

                /* renamed from: e */
                final /* synthetic */ long f23115e;

                /* renamed from: f */
                final /* synthetic */ int f23116f;
                final /* synthetic */ int g;
                final /* synthetic */ String h;
                final /* synthetic */ String i;
                final /* synthetic */ String j;

                public final java.lang.Object call(
/*
Method generation error in method: com.douyin.share.a.a.b.a.2.call():java.lang.Object, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.douyin.share.a.a.b.a.2.call():java.lang.Object, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
            runnable = a.a(handler2, (Callable) r17);
        } else if (!StringUtils.isEmpty(b2)) {
            a.AnonymousClass3 r6 = new Callable(this.f23123b, b2, dVar.i(), dVar.d(), 0) {

                /* renamed from: a */
                final /* synthetic */ String f23117a;

                /* renamed from: b */
                final /* synthetic */ String f23118b;

                /* renamed from: c */
                final /* synthetic */ String f23119c;

                /* renamed from: d */
                final /* synthetic */ String f23120d;

                /* renamed from: e */
                final /* synthetic */ int f23121e;

                public final java.lang.Object call(
/*
Method generation error in method: com.douyin.share.a.a.b.a.3.call():java.lang.Object, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.douyin.share.a.a.b.a.3.call():java.lang.Object, class status: UNLOADED
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
            runnable = a.a(handler2, (Callable) r6);
        } else {
            runnable = null;
        }
        if (runnable == null) {
            return false;
        }
        this.f23122a.execute(runnable);
        return true;
    }
}
