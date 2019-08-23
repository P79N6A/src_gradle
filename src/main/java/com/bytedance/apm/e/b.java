package com.bytedance.apm.e;

import android.text.TextUtils;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.j.b;
import com.bytedance.apm.k.t;
import com.bytedance.frameworks.core.b.c;
import com.bytedance.framwork.core.monitor.b;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b implements b.C0006b {

    /* renamed from: a  reason: collision with root package name */
    public static String f18972a = "https://log.snssdk.com/monitor/collect/c/exception";

    /* renamed from: d  reason: collision with root package name */
    public static final Object f18973d = new Object();
    private static volatile b i;
    private static volatile a j;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f18974b;

    /* renamed from: c  reason: collision with root package name */
    public volatile JSONObject f18975c;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedList<c> f18976e = new LinkedList<>();

    /* renamed from: f  reason: collision with root package name */
    private volatile long f18977f;
    private volatile boolean g;
    private volatile long h;
    private volatile a k;

    public interface a {
    }

    private b() {
        com.bytedance.apm.j.b.a().a((b.C0006b) this);
        this.k = new a();
    }

    public static b a() {
        if (i == null) {
            synchronized (f18973d) {
                if (i == null) {
                    i = new b();
                }
            }
        }
        return i;
    }

    private void b() {
        this.f18977f = System.currentTimeMillis();
        com.bytedance.frameworks.core.b.a.a();
        com.bytedance.frameworks.core.b.a.a(new c() {
            public final void run() {
                try {
                    LinkedList linkedList = new LinkedList();
                    synchronized (b.f18973d) {
                        linkedList.addAll(b.this.f18976e);
                        b.this.f18976e.clear();
                        b.this.f18974b = 0;
                    }
                    if (!linkedList.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        while (!linkedList.isEmpty()) {
                            c cVar = (c) linkedList.poll();
                            if (cVar != null) {
                                jSONArray.put(new JSONObject(cVar.f18980b));
                            }
                        }
                        jSONObject.put("data", jSONArray);
                        if (b.this.f18975c == null) {
                            b.this.f18975c = com.bytedance.apm.c.f();
                        }
                        jSONObject.put("header", b.this.f18975c);
                        b.this.a(b.f18972a, jSONObject.toString());
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public final void a(long j2) {
        try {
            if (this.k != null) {
                a aVar = this.k;
                if (!aVar.f18970b) {
                    if (ApmDelegate.getInstance().isConfigReady()) {
                        aVar.f18970b = true;
                    }
                    com.bytedance.frameworks.core.b.a.a();
                    com.bytedance.frameworks.core.b.a.a(new c() {
                        public final void run(
/*
Method generation error in method: com.bytedance.apm.e.a.1.run():void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.apm.e.a.1.run():void, class status: UNLOADED
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
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - this.f18977f > 1200000 && this.f18974b > 0) || this.f18974b > 20) {
                b();
            }
            if (this.g && currentTimeMillis - this.h > 1800000) {
                this.g = false;
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(String str, String str2) {
        try {
            if (ApmDelegate.getInstance().isConfigReady()) {
                com.bytedance.framwork.core.monitor.b.a(t.a(str, com.bytedance.apm.c.e()), str2.getBytes(), b.a.GZIP, "application/json; charset=utf-8", true);
            }
        } catch (Throwable th) {
            int i2 = -1;
            if (th instanceof com.bytedance.apm.net.a) {
                i2 = ((com.bytedance.apm.net.a) th).getStatusCode();
            }
            if (i2 >= 500 && i2 <= 600) {
                this.h = System.currentTimeMillis();
                this.g = true;
            }
        }
    }

    public final void a(String str, String str2, String str3, boolean z) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    boolean z2 = false;
                    if (z) {
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.put("log_type", "log_exception");
                        if (str3 != null) {
                            if (str3.length() > 10240) {
                                jSONObject.put("extraMessage", str3.substring(0, 10240));
                            } else {
                                jSONObject.put("extraMessage", str3);
                            }
                        }
                        a aVar = j;
                    }
                    if (!ApmDelegate.getInstance().isConfigReady()) {
                        if (this.k != null) {
                            this.k.a(str, str2);
                        }
                        return;
                    }
                    boolean logTypeSwitch = ApmDelegate.getInstance().getLogTypeSwitch(str);
                    boolean serviceNameSwitch = ApmDelegate.getInstance().getServiceNameSwitch(str3);
                    if ((logTypeSwitch || serviceNameSwitch) && !this.g) {
                        synchronized (f18973d) {
                            int size = this.f18976e.size();
                            if (size >= 20) {
                                z2 = true;
                            }
                            this.f18976e.add(new c(str, str2));
                            this.f18974b = size + 1;
                        }
                        if (z2) {
                            b();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
