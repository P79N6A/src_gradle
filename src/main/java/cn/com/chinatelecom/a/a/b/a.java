package cn.com.chinatelecom.a.a.b;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.a.a.a.a;
import cn.com.chinatelecom.a.a.b.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1679a = "a";

    /* renamed from: b  reason: collision with root package name */
    private static String f1680b;

    /* renamed from: c  reason: collision with root package name */
    private static String f1681c;

    /* renamed from: d  reason: collision with root package name */
    private static a f1682d;

    public static a a() {
        synchronized (a.class) {
            if (f1682d == null) {
                f1682d = new a();
            }
        }
        return f1682d;
    }

    public static void a(Context context, String str, b bVar) {
        a.AnonymousClass1 r0 = new Runnable(context, bVar, f1680b, f1681c, str) {

            /* renamed from: a */
            final /* synthetic */ Context f1645a;

            /* renamed from: b */
            final /* synthetic */ b f1646b;

            /* renamed from: c */
            final /* synthetic */ String f1647c;

            /* renamed from: d */
            final /* synthetic */ String f1648d;

            /* renamed from: e */
            final /* synthetic */ String f1649e;

            public final void run(
/*
Method generation error in method: cn.com.chinatelecom.a.a.a.a.1.run():void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: cn.com.chinatelecom.a.a.a.a.1.run():void, class status: UNLOADED
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
        cn.com.chinatelecom.a.a.a.a.a(r0);
    }

    public static void a(Context context, String str, String str2) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null!");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("appKey must not be null!");
        } else if (!TextUtils.isEmpty(str2)) {
            f1680b = str;
            f1681c = str2;
        } else {
            throw new IllegalArgumentException("appSecret must not be null!");
        }
    }
}
