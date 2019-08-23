package com.bytedance.framwork.core.b;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.framwork.core.a.d.a;
import com.bytedance.framwork.core.b.h;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, h> f20167a = new ConcurrentHashMap<>();

    public static h a(@NonNull String str) {
        h hVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
        } else if (f20167a.get(str) != null) {
            return f20167a.get(str);
        } else {
            synchronized (i.class) {
                if (f20167a.get(str) != null) {
                    hVar = f20167a.get(str);
                } else {
                    throw new RuntimeException("please call init method before this");
                }
            }
            return hVar;
        }
    }

    public static synchronized void a(@NonNull Context context, @NonNull String str, @NonNull JSONObject jSONObject, h.a aVar) {
        synchronized (i.class) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
            } else if (jSONObject == null) {
                throw new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
            } else if (f20167a.get(str) == null) {
                h hVar = new h(str);
                a.a().a((Runnable) new Runnable(context, jSONObject, aVar) {

                    /* renamed from: a */
                    final /* synthetic */ Context f20154a;

                    /* renamed from: b */
                    final /* synthetic */ JSONObject f20155b;

                    /* renamed from: c */
                    final /* synthetic */ a f20156c;

                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run(
/*
Method generation error in method: com.bytedance.framwork.core.b.h.1.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.framwork.core.b.h.1.run():void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:260)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:70)
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
                f20167a.put(str, hVar);
            }
        }
    }
}
