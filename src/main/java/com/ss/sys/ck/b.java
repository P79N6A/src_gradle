package com.ss.sys.ck;

import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.a.b.f;
import com.ss.sys.ck.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f78565a = "SCCheckLog";

    /* renamed from: b  reason: collision with root package name */
    public static String f78566b = (com.ss.a.a.a.b() + "/view");

    /* renamed from: c  reason: collision with root package name */
    public static float f78567c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public static HashMap<Integer, a> f78568d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static boolean f78569e = false;

    /* renamed from: f  reason: collision with root package name */
    private static int f78570f = 0;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f78571a;

        /* renamed from: b  reason: collision with root package name */
        public float f78572b;

        /* renamed from: c  reason: collision with root package name */
        public int f78573c;

        a() {
        }

        a(Integer num, float f2, int i) {
            this.f78571a = num;
            this.f78572b = f2;
            this.f78573c = 200;
        }
    }

    public static void a() {
        a aVar = new a(1105, 1.1533333f, 200);
        a aVar2 = new a(3058, 1.1533333f, 200);
        a aVar3 = new a(10031, 1.1533333f, 200);
        a aVar4 = new a(1104, 0.9533333f, 200);
        a aVar5 = new a(3059, 0.9533333f, 200);
        a aVar6 = new a(10030, 0.9533333f, 200);
        f78568d.put(aVar.f78571a, aVar);
        f78568d.put(aVar2.f78571a, aVar2);
        f78568d.put(aVar3.f78571a, aVar3);
        f78568d.put(aVar4.f78571a, aVar4);
        f78568d.put(aVar5.f78571a, aVar5);
        f78568d.put(aVar6.f78571a, aVar6);
    }

    public static boolean a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("challenge_setting");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                a aVar = new a();
                aVar.f78571a = Integer.valueOf(jSONObject2.getInt("mode"));
                aVar.f78572b = (float) jSONObject2.getDouble("percent");
                aVar.f78573c = jSONObject2.getInt("min_width");
                f78568d.put(aVar.f78571a, aVar);
            }
            f78566b = jSONObject.getString("h5_url");
            f78567c = (float) jSONObject.getDouble("alpha");
            f78569e = true;
            return true;
        } catch (Exception unused) {
            f78566b = com.ss.a.a.a.b() + "/view";
            return false;
        }
    }

    public static void c() {
        new Thread("CZL-11") {
            public final void run() {
                int i = 0;
                while (i < 10) {
                    if (!b.f78569e && i < 10) {
                        b.b();
                        i++;
                    }
                    i++;
                    f.a((long) (i * PushConstants.WORK_RECEIVER_EVENTCORE_ERROR));
                    if (b.f78569e) {
                        return;
                    }
                }
            }
        }.start();
    }

    public static void b() {
        SCCheckUtils instance = SCCheckUtils.getInstance();
        if (instance != null) {
            String str = "?aid=" + instance.appID + "&lang=" + instance.language + "&app_name=" + instance.appName + "&iid=" + instance.iid + "&vc=" + instance.versionCode + "&did=" + instance.deviceID + "&ch=" + instance.channel + "&os=0";
            try {
                h hVar = new h(instance.ctx, instance.session, str);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Header("Cookie", "sessionid=" + hVar.f78560a));
                ((com.ss.sys.ck.a.f) RetrofitUtils.getSsRetrofit(hVar.f78562c).create(com.ss.sys.ck.a.f.class)).a(hVar.f78562c, (List<Header>) arrayList).enqueue(new c<TypedInput>() {
                    public final void a(
/*
Method generation error in method: com.ss.sys.ck.a.h.1.a(com.bytedance.retrofit2.Call, com.bytedance.retrofit2.SsResponse):void, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.sys.ck.a.h.1.a(com.bytedance.retrofit2.Call, com.bytedance.retrofit2.SsResponse):void, class status: UNLOADED
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

                    public final void a(
/*
Method generation error in method: com.ss.sys.ck.a.h.1.a(com.bytedance.retrofit2.Call, java.lang.Throwable):void, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.sys.ck.a.h.1.a(com.bytedance.retrofit2.Call, java.lang.Throwable):void, class status: UNLOADED
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
                });
            } catch (Throwable unused) {
                new com.ss.sys.ck.a.a(instance.ctx, instance.session, str).a(2, 2, null);
            }
        }
    }
}
