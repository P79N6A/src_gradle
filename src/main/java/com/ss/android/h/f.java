package com.ss.android.h;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.plugin.core.d;
import com.bytedance.frameworks.plugin.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.h.a.c;
import com.ss.android.h.b.a;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.s;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f implements WeakHandler.IHandler {

    /* renamed from: f  reason: collision with root package name */
    public static c f29123f;
    private static volatile f i;
    private static final Object j = new Object();
    private static long k = 7200000;

    /* renamed from: a  reason: collision with root package name */
    public Context f29124a;

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f29125b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f29126c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f29127d = true;

    /* renamed from: e  reason: collision with root package name */
    public volatile c f29128e;
    public d g;
    public Map<String, Long> h = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public JSONArray f29129a;

        /* renamed from: b  reason: collision with root package name */
        public JSONArray f29130b;

        public final String toString() {
            return "ModuleData{pluginInfos=" + this.f29129a + ", patchInfos=" + this.f29130b + '}';
        }
    }

    private boolean a() {
        boolean z = false;
        try {
            if ((this.f29124a.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static f a(Context context) {
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = new f(context);
                }
            }
        }
        return i;
    }

    private f(Context context) {
        this.f29124a = context;
        if (this.f29124a != null) {
            this.f29125b = new WeakHandler(Looper.getMainLooper(), this);
        }
    }

    public final void handleMsg(Message message) {
        Message message2 = message;
        if (message2.what == 1000 && (message2.obj instanceof a)) {
            a aVar = (a) message2.obj;
            if (!(!this.f29126c || aVar == null || aVar.f29130b == null || f29123f == null)) {
                f29123f.a(aVar.f29130b);
            }
            if (this.f29127d && aVar != null && aVar.f29129a != null && aVar.f29129a.length() > 0) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < aVar.f29129a.length()) {
                    try {
                        JSONObject jSONObject = aVar.f29129a.getJSONObject(i3);
                        if (jSONObject != null) {
                            String optString = jSONObject.optString("packagename");
                            int optInt = jSONObject.optInt("versioncode");
                            String optString2 = jSONObject.optString(PushConstants.WEB_URL);
                            String optString3 = jSONObject.optString("md5");
                            boolean optBoolean = jSONObject.optBoolean("offline");
                            boolean optBoolean2 = jSONObject.optBoolean("revert");
                            boolean optBoolean3 = jSONObject.optBoolean("wifionly", true);
                            int optInt2 = jSONObject.optInt("clientversion_min", i2);
                            int optInt3 = jSONObject.optInt("clientversion_max", Integer.MAX_VALUE);
                            if (optInt3 == 0) {
                                optInt3 = Integer.MAX_VALUE;
                            }
                            JSONArray optJSONArray = jSONObject.optJSONArray("backup_urls");
                            LinkedList linkedList = new LinkedList();
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                while (i2 < optJSONArray.length()) {
                                    linkedList.add(optJSONArray.getString(i2));
                                    i2++;
                                }
                            }
                            if (optBoolean) {
                                b.a(optString);
                            } else {
                                if (optBoolean2) {
                                    if (optInt < com.bytedance.frameworks.plugin.pm.c.c(optString)) {
                                        b.a(optString);
                                    }
                                    if (optInt == 0) {
                                    }
                                }
                                com.bytedance.frameworks.plugin.a.a f2 = com.bytedance.frameworks.plugin.pm.c.f(optString);
                                if (f2 != null) {
                                    if (!a() || !f2.f2148d) {
                                        d.a().a(optString, optInt, optInt2, optInt3);
                                        com.ss.android.h.b.a a2 = com.ss.android.h.b.a.a(e.a());
                                        a.AnonymousClass1 r4 = new AbsDownloadListener(optString, optInt, optString3) {

                                            /* renamed from: a */
                                            final /* synthetic */ String f29113a;

                                            /* renamed from: b */
                                            final /* synthetic */ int f29114b;

                                            /* renamed from: c */
                                            final /* synthetic */ String f29115c;

                                            public final void onStart(
/*
Method generation error in method: com.ss.android.h.b.a.1.onStart(com.ss.android.socialbase.downloader.model.DownloadInfo):void, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.h.b.a.1.onStart(com.ss.android.socialbase.downloader.model.DownloadInfo):void, class status: UNLOADED
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                            public final void onFirstStart(
/*
Method generation error in method: com.ss.android.h.b.a.1.onFirstStart(com.ss.android.socialbase.downloader.model.DownloadInfo):void, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.h.b.a.1.onFirstStart(com.ss.android.socialbase.downloader.model.DownloadInfo):void, class status: UNLOADED
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                            public final void onSuccessed(
/*
Method generation error in method: com.ss.android.h.b.a.1.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.h.b.a.1.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void, class status: UNLOADED
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                            public final void onFailed(
/*
Method generation error in method: com.ss.android.h.b.a.1.onFailed(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException):void, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.h.b.a.1.onFailed(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException):void, class status: UNLOADED
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                                        a.AnonymousClass2 r8 = new s(optString, optInt) {

                                            /* renamed from: a */
                                            final /* synthetic */ String f29117a;

                                            /* renamed from: b */
                                            final /* synthetic */ int f29118b;

                                            public final boolean a(
/*
Method generation error in method: com.ss.android.h.b.a.2.a():boolean, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.h.b.a.2.a():boolean, class status: UNLOADED
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                                        a.AnonymousClass3 r6 = new IDownloadDepend() {
                                            public final void monitorLogSend(
/*
Method generation error in method: com.ss.android.h.b.a.3.monitorLogSend(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException, int):void, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.h.b.a.3.monitorLogSend(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException, int):void, class status: UNLOADED
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                                        DownloadTask url = Downloader.with(e.a()).url(optString2);
                                        Object[] objArr = new Object[1];
                                        try {
                                            objArr[0] = optString;
                                            url.name(String.format("%s.jar", objArr)).onlyWifi(optBoolean3).savePath(b.a()).retryCount(5).backUpUrls(linkedList).subThreadListener(r4).interceptor(r8).depend(r6).download();
                                        } catch (Exception unused) {
                                        }
                                        i3++;
                                        i2 = 0;
                                    }
                                }
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    i3++;
                    i2 = 0;
                }
            }
        }
    }
}
