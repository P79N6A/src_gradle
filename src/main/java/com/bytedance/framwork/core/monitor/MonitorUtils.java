package com.bytedance.framwork.core.monitor;

import com.bytedance.apm.b;
import com.bytedance.apm.c;
import com.bytedance.apm.internal.ApmDelegate;
import org.json.JSONObject;

public class MonitorUtils {
    @Deprecated
    public static void monitorDebugReal(String str) {
    }

    @Deprecated
    public static void monitorDebugReal(String str, String str2) {
    }

    @Deprecated
    public static void monitorDirectOnCount(String str, String str2, float f2) {
    }

    @Deprecated
    public static void monitorOnCount(String str, String str2) {
    }

    @Deprecated
    public static void monitorOnCount(String str, String str2, float f2) {
    }

    @Deprecated
    public static void monitorOnStore(String str, String str2, float f2) {
    }

    @Deprecated
    public static void monitorOnTimer(String str, String str2, float f2) {
    }

    @Deprecated
    public static void setDebugMode() {
        c.f1922b = true;
    }

    @Deprecated
    public static void setIsBackGround(boolean z) {
    }

    public static boolean getLogTypeSwitch(String str) {
        return ApmDelegate.getInstance().getLogTypeSwitch(str);
    }

    public static boolean getMetricsTypeSwitch(String str) {
        return ApmDelegate.getInstance().getMetricsTypeSwitch(str);
    }

    public static boolean getServiceNameSwitch(String str) {
        return ApmDelegate.getInstance().getServiceNameSwitch(str);
    }

    public static void monitorCommonLog(String str, JSONObject jSONObject) {
        b.a(str, jSONObject);
    }

    public static void monitorStartTime(String str, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, (double) f2);
            monitorPerformance("start", str, jSONObject, null, null);
        } catch (Exception unused) {
        }
    }

    @Deprecated
    public static void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        b.a(str, jSONObject, jSONObject2);
    }

    @Deprecated
    public static void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        b.a(str, i, jSONObject);
    }

    public static void monitorUIAction(String str, String str2, JSONObject jSONObject) {
        b.a(str, str2, jSONObject);
    }

    public static void monitorCommonLog(String str, JSONObject jSONObject, boolean z) {
        b.a(str, jSONObject, z);
    }

    @Deprecated
    public static void monitorDirectOnTimer(String str, String str2, float f2) {
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable(str, str2, f2) {

            /* renamed from: a */
            final /* synthetic */ String f1892a;

            /* renamed from: b */
            final /* synthetic */ String f1893b;

            /* renamed from: c */
            final /* synthetic */ float f1894c;

            public final void run(
/*
Method generation error in method: com.bytedance.apm.b.3.run():void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.apm.b.3.run():void, class status: UNLOADED
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

    public static void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b.a(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Deprecated
    public static void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        b.a(str, i, jSONObject, jSONObject2);
    }

    public static void monitorPerformance(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b.b(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void monitorPerformance(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b.a(str, str2, jSONObject, jSONObject2, jSONObject3);
    }

    @Deprecated
    public static void monitorApiError(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        JSONObject a2 = b.a(jSONObject);
        com.bytedance.apm.j.b a3 = com.bytedance.apm.j.b.a();
        b.AnonymousClass4 r0 = new Runnable(j, j2, str, str2, str3, i, a2) {

            /* renamed from: a */
            final /* synthetic */ long f1895a;

            /* renamed from: b */
            final /* synthetic */ long f1896b;

            /* renamed from: c */
            final /* synthetic */ String f1897c;

            /* renamed from: d */
            final /* synthetic */ String f1898d;

            /* renamed from: e */
            final /* synthetic */ String f1899e;

            /* renamed from: f */
            final /* synthetic */ int f1900f;
            final /* synthetic */ JSONObject g;

            public final void run(
/*
Method generation error in method: com.bytedance.apm.b.4.run():void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.apm.b.4.run():void, class status: UNLOADED
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
        a3.a((Runnable) r0);
    }

    @Deprecated
    public static void monitorSLA(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        JSONObject a2 = b.a(jSONObject);
        com.bytedance.apm.j.b a3 = com.bytedance.apm.j.b.a();
        b.AnonymousClass1 r0 = new Runnable(j, j2, str, str2, str3, i, a2) {

            /* renamed from: a */
            final /* synthetic */ long f1877a;

            /* renamed from: b */
            final /* synthetic */ long f1878b;

            /* renamed from: c */
            final /* synthetic */ String f1879c;

            /* renamed from: d */
            final /* synthetic */ String f1880d;

            /* renamed from: e */
            final /* synthetic */ String f1881e;

            /* renamed from: f */
            final /* synthetic */ int f1882f;
            final /* synthetic */ JSONObject g;

            public final void run(
/*
Method generation error in method: com.bytedance.apm.b.1.run():void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.apm.b.1.run():void, class status: UNLOADED
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
        a3.a((Runnable) r0);
    }
}
