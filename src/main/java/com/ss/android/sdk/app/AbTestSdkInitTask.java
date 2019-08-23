package com.ss.android.sdk.app;

import android.content.Context;
import com.bytedance.dataplatform.b;
import com.bytedance.dataplatform.g;
import com.bytedance.dataplatform.i;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.http.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import org.jetbrains.annotations.NotNull;

public class AbTestSdkInitTask implements LegoTask {
    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    static final /* synthetic */ String lambda$run$0$AbTestSdkInitTask(String str) {
        try {
            return a.a().a(0, 0, AppLog.addCommonParams(str, true), null, false, false, null, false);
        } catch (Exception unused) {
            return null;
        }
    }

    @MeasureFunction
    public void run(@NotNull Context context) {
        String str;
        com.ss.android.ugc.aweme.framework.a.a.a("AbTestSdkInitTask");
        if (!com.ss.android.g.a.a()) {
            str = "https://abtest-ch.snssdk.com/common";
        } else if (com.ss.android.g.a.b()) {
            str = "https://abtest-va-tiktok.byteoversea.com/common";
        } else {
            str = "https://abtest-sg-tiktok.byteoversea.com/common";
        }
        Context context2 = context;
        b.AnonymousClass1 r1 = new Runnable(context2, false, str.trim(), false, new com.bytedance.dataplatform.f() {

            /* renamed from: b  reason: collision with root package name */
            private Gson f30668b = new Gson();
        }, a.f30669a, b.f30670a, new g() {
        }) {

            /* renamed from: a */
            final /* synthetic */ Context f19605a;

            /* renamed from: b */
            final /* synthetic */ boolean f19606b;

            /* renamed from: c */
            final /* synthetic */ String f19607c;

            /* renamed from: d */
            final /* synthetic */ boolean f19608d;

            /* renamed from: e */
            final /* synthetic */ f f19609e;

            /* renamed from: f */
            final /* synthetic */ d f19610f;
            final /* synthetic */ e g;
            final /* synthetic */ g h;

            public final void run(
/*
Method generation error in method: com.bytedance.dataplatform.b.1.run():void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.dataplatform.b.1.run():void, class status: UNLOADED
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
        b.f19604c = i.f19619a.submit(r1);
    }
}
