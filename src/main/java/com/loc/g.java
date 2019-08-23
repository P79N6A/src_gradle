package com.loc;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.google.a.a.a.a.a.a;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25819a = "/a/";

    /* renamed from: b  reason: collision with root package name */
    static final String f25820b = "b";

    /* renamed from: c  reason: collision with root package name */
    static final String f25821c = "c";

    /* renamed from: d  reason: collision with root package name */
    static final String f25822d = "d";

    /* renamed from: e  reason: collision with root package name */
    static final String f25823e = "i";

    /* renamed from: f  reason: collision with root package name */
    public static final String f25824f = "g";
    public static final String g = "h";
    public static final String h = "e";
    public static final String i = "f";
    public static final String j = "j";

    public static String a(Context context, String str) {
        return c.a(context, "AMSKLG_CFG", 0).getString(str, "");
    }

    public static void a(final Context context) {
        try {
            ExecutorService d2 = i.d();
            if (d2 != null) {
                if (!d2.isShutdown()) {
                    d2.submit(new Runnable() {
                        public final void run() {
                            try {
                                i.d().submit(new Runnable(context) {

                                    /* renamed from: a */
                                    final /* synthetic */ Context f25483a;

                                    public final void run(
/*
Method generation error in method: com.loc.ar.1.run():void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.loc.ar.1.run():void, class status: UNLOADED
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
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                                Context context = context;
                                bh bhVar = new bh(j.f25837b);
                                j.f25837b = false;
                                j.a(context, bhVar, g.f25821c);
                                Context context2 = context;
                                if (j.f25839d == null || j.f25839d.get() == null) {
                                    j.f25839d = new WeakReference<>(new bi(context2, 3600000, "gKey", new bk(context2)));
                                }
                                j.a(context2, (bj) j.f25839d.get(), g.f25820b);
                                Context context3 = context;
                                if (j.f25838c == null || j.f25838c.get() == null) {
                                    j.f25838c = new WeakReference<>(new bi(context3, 3600000, "hKey", new bk(context3)));
                                }
                                j.a(context3, (bj) j.f25838c.get(), g.f25822d);
                                i.d().submit(new Runnable(context) {

                                    /* renamed from: a */
                                    final /* synthetic */ Context f25505a;

                                    public final void run(
/*
Method generation error in method: com.loc.av.3.run():void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.loc.av.3.run():void, class status: UNLOADED
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
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                                i.d().submit(new Runnable(context) {

                                    /* renamed from: a */
                                    final /* synthetic */ Context f25494a;

                                    public final void run(
/*
Method generation error in method: com.loc.at.2.run():void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.loc.at.2.run():void, class status: UNLOADED
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
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                            } catch (RejectedExecutionException unused) {
                            } catch (Throwable th) {
                                i.b(th, "Lg", "proL");
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            i.b(th, "Lg", "proL");
        }
    }

    @TargetApi(9)
    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = c.a(context, "AMSKLG_CFG", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    static boolean a(String[] strArr, String str) {
        if (!(strArr == null || str == null)) {
            try {
                for (String trim : str.split("\n")) {
                    if (b(strArr, trim.trim())) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                a.b(th);
            }
        }
        return false;
    }

    static List<dh> b(Context context) {
        List<dh> list = null;
        try {
            synchronized (Looper.getMainLooper()) {
                try {
                    List<dh> a2 = new q(context, false).a();
                    try {
                        return a2;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        list = a2;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            a.b(th4);
            return list;
        }
    }

    public static void b(Context context, String str) {
        SharedPreferences.Editor edit = c.a(context, "AMSKLG_CFG", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    static boolean b(String[] strArr, String str) {
        if (!(strArr == null || str == null)) {
            try {
                String str2 = str;
                for (String str3 : strArr) {
                    str2 = str2.trim();
                    if (str2.startsWith("at ")) {
                        if (str2.contains(str3 + ClassUtils.PACKAGE_SEPARATOR) && str2.endsWith(")") && !str2.contains("uncaughtException")) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                a.b(th);
            }
        }
        return false;
    }

    public static String c(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + f25819a + str;
    }
}
