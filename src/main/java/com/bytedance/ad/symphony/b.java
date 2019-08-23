package com.bytedance.ad.symphony;

import android.content.Context;
import com.bytedance.ad.symphony.a;
import com.bytedance.ad.symphony.a.a.e;
import com.bytedance.ad.symphony.a.a.g;
import com.bytedance.ad.symphony.a.a.h;
import com.bytedance.ad.symphony.b.f;
import com.bytedance.ad.symphony.c.d;
import com.bytedance.ad.symphony.d.c;
import com.bytedance.ad.symphony.g.a;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.TimeUnit;

public class b {

    /* renamed from: f  reason: collision with root package name */
    private static volatile b f7569f = null;
    private static boolean g = false;
    private static boolean h = true;
    private static d i;

    /* renamed from: a  reason: collision with root package name */
    public Context f7570a;

    /* renamed from: b  reason: collision with root package name */
    public c f7571b;

    /* renamed from: c  reason: collision with root package name */
    public g f7572c;

    /* renamed from: d  reason: collision with root package name */
    public e f7573d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.ad.symphony.a.a.c f7574e;

    public static boolean b() {
        return g;
    }

    public static b a() {
        if (f7569f == null) {
            if (b()) {
                throw new IllegalStateException("instance is null");
            } else if (f7569f == null) {
                synchronized (b.class) {
                    if (f7569f == null) {
                        if (SymphonyContentProvider.f7535a != null) {
                            f7569f = new b(new c(SymphonyContentProvider.f7535a, new com.bytedance.ad.symphony.d.b()));
                        } else {
                            throw new IllegalStateException("context == null");
                        }
                    }
                    new IllegalStateException("create fake symphony instance").getMessage();
                }
            }
        }
        return f7569f;
    }

    private b(c cVar) {
        this.f7570a = cVar.f7603b.getApplicationContext();
        i = cVar.k;
        d.f7609b = cVar.k;
        if (cVar.f7602a != null) {
            a.a(cVar.f7602a);
        }
        boolean z = cVar.f7605d;
        g = z;
        if (z) {
            Logger.setLogLevel(3);
        }
        this.f7571b = cVar.f7604c;
        if (cVar.f7606e != null) {
            f.f7594b = cVar.f7606e;
        }
        if (cVar.f7607f != null) {
            f.f7593a = cVar.f7607f;
        }
        this.f7572c = new g(cVar.g == null ? new h(cVar.f7603b) : cVar.g);
        this.f7573d = new e(cVar.h == null ? new com.bytedance.ad.symphony.a.a.f(cVar.f7603b) : cVar.h);
        this.f7574e = new com.bytedance.ad.symphony.a.a.c(cVar.i == null ? new com.bytedance.ad.symphony.a.a.d(cVar.f7603b) : cVar.i);
        d.f7608a = cVar.j;
        a.a((Runnable) new Runnable() {
            public final void run() {
                a.C0058a a2 = a.a(b.this.f7570a).a();
                b bVar = b.this;
                if (a2 != null) {
                    if (bVar.f7572c != null) {
                        bVar.f7572c.a(a2.f7544a);
                        bVar.f7572c.i = a2.f7547d;
                        bVar.f7572c.a(a2.f7548e);
                    }
                    if (bVar.f7573d != null) {
                        bVar.f7573d.a(a2.f7545b);
                        bVar.f7573d.a(a2.f7548e);
                    }
                    if (bVar.f7574e != null) {
                        bVar.f7574e.a(a2.f7546c);
                        bVar.f7574e.a(a2.f7548e);
                    }
                    com.bytedance.ad.symphony.model.config.e a3 = com.bytedance.ad.symphony.model.config.e.a();
                    if (a2.f7549f != null) {
                        a3 = a2.f7549f;
                    }
                    d.f7610c = a3;
                }
                a a4 = a.a(b.this.f7570a);
                a4.b().scheduleAtFixedRate(new Runnable(b.this.f7571b) {

                    /* renamed from: a */
                    final /* synthetic */ c f7542a;

                    public final void run(
/*
Method generation error in method: com.bytedance.ad.symphony.a.1.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.ad.symphony.a.1.run():void, class status: UNLOADED
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
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
                }, 10, (long) a4.f7539c, TimeUnit.SECONDS);
            }
        });
    }
}
