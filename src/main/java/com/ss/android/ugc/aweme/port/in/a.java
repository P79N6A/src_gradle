package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.common.a.m;
import com.google.common.a.n;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.VideoSdkCore;
import com.ss.android.medialib.log.Log2ClientInvoker;
import com.ss.android.ttve.log.TELog2ClientInvoker;
import com.ss.android.ttve.log.a;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.b;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatform.h;
import com.ss.android.ugc.aweme.filter.aa;
import com.ss.android.ugc.aweme.filter.an;
import com.ss.android.ugc.aweme.filter.u;
import com.ss.android.ugc.aweme.port.in.ar;
import com.ss.android.ugc.aweme.port.internal.j;
import com.ss.android.ugc.aweme.port.internal.l;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.d;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.privacysetting.IAVPrivacySettingService;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.effectmanager.b;
import com.ss.android.ugc.effectmanager.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import com.ss.android.vesdk.ah;
import com.ss.android.vesdk.i;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.bd;
import kotlinx.coroutines.bk;
import kotlinx.coroutines.g;
import org.json.JSONObject;

public final class a {
    public static u A = H.u();
    public static s B = H.v();
    public static ag C = H.w();
    public static ab D = H.x();
    public static j E = H.y();
    public static o F = H.z();
    public static IAVPrivacySettingService G = H.A();
    public static k H;
    public static ai I = H.B();
    public static ap J = H.C();
    public static ac K = H.D();
    public static e L;
    public static com.ss.android.ugc.aweme.property.a M;
    public static d N = new d();
    private static ActivityMonitor O;
    private static volatile an P;
    private static volatile boolean Q;
    private static volatile C0675a R = g.f61137b;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61118a;

    /* renamed from: b  reason: collision with root package name */
    public static Application f61119b;

    /* renamed from: c  reason: collision with root package name */
    public static Gson f61120c = new GsonBuilder().registerTypeAdapter(Integer.TYPE, new com.ss.android.ugc.aweme.shortvideo.p.a()).create();

    /* renamed from: d  reason: collision with root package name */
    public static m f61121d = H.a();

    /* renamed from: e  reason: collision with root package name */
    public static q f61122e = H.b();

    /* renamed from: f  reason: collision with root package name */
    public static al f61123f = H.c();
    public static p g = ((p) m.a(H.d()));
    public static y h = H.e();
    public static com.ss.android.ugc.aweme.ao.a i = H.f();
    public static i j = H.i();
    public static t k = H.j();
    public static am l = H.k();
    public static ae m = H.l();
    public static r n = H.m();
    public static ah o = H.n();
    public static aq p = new l();
    public static IVideoConfigService q = new j();
    public static IVideoConfigService r = new com.ss.android.ugc.aweme.port.internal.d();
    public static ao s = H.g();
    public static af t = H.h();
    public static w u = H.o();
    public static n v = H.p();
    public static an w = H.q();
    public static f x = H.r();
    public static aj y = H.s();
    public static ak z = H.t();

    /* renamed from: com.ss.android.ugc.aweme.port.in.a$a  reason: collision with other inner class name */
    public interface C0675a {
        i a();
    }

    public static boolean c() {
        return O.f61111b;
    }

    static final /* synthetic */ Void h() throws Exception {
        if (!Q) {
            a(R.a());
        }
        return null;
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f61118a, true, 67117, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f61118a, true, 67117, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        O.a((n<Activity>) new c<Activity>(sb));
        return sb.toString();
    }

    public static String g() {
        if (PatchProxy.isSupport(new Object[0], null, f61118a, true, 67127, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f61118a, true, 67127, new Class[0], String.class);
        }
        if (!com.ss.android.ugc.aweme.g.a.a() || !M.a(a.C0682a.UseEffectCam)) {
            return "142710f02c3a11e8b42429f14557854a";
        }
        return "68d32050064f11e891efe7cc07299bc5";
    }

    private static b.C0809b i() {
        if (PatchProxy.isSupport(new Object[0], null, f61118a, true, 67123, new Class[0], b.C0809b.class)) {
            return (b.C0809b) PatchProxy.accessDispatch(new Object[0], null, f61118a, true, 67123, new Class[0], b.C0809b.class);
        }
        if (!com.ss.android.ugc.aweme.g.a.a() || !L.a(e.a.ModelFileTestEnv)) {
            return b.C0809b.ONLINE;
        }
        return b.C0809b.TEST;
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f61118a, true, 67116, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f61118a, true, 67116, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return O.a(b.f61127b);
    }

    public static synchronized an d() {
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[0], null, f61118a, true, 67120, new Class[0], an.class)) {
                an anVar = (an) PatchProxy.accessDispatch(new Object[0], null, f61118a, true, 67120, new Class[0], an.class);
                return anVar;
            }
            if (P == null) {
                P = new an();
                P.f47501b = aa.a();
            }
            an anVar2 = P;
            return anVar2;
        }
    }

    public static void f() {
        if (PatchProxy.isSupport(new Object[0], null, f61118a, true, 67124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f61118a, true, 67124, new Class[0], Void.TYPE);
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                a.i.a(f.f61135b, a.i.f1052b).g();
            } catch (InterruptedException unused) {
            }
        } else if (!Q) {
            a(R.a());
        }
    }

    @MeasureFunction
    public static void e() {
        com.ss.android.ugc.effectmanager.common.d.b bVar;
        if (PatchProxy.isSupport(new Object[0], null, f61118a, true, 67122, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f61118a, true, 67122, new Class[0], Void.TYPE);
            return;
        }
        if (!c.a()) {
            b.a a2 = new b.a().a(f61119b.getAssets()).a((com.ss.android.ugc.effectmanager.common.d.c) new h()).a((com.ss.android.ugc.effectmanager.common.d.d) new com.ss.android.ttve.utils.b()).d(EffectPlatform.b()).e("142710f02c3a11e8b42429f14557854a").b(Build.MODEL).a(EffectPlatform.a()).c("4.9.0").f(M.e(a.C0682a.EffectExclusionPattern)).a(new File(f61119b.getFilesDir(), "effectmodel").getPath());
            if (M.a(a.C0682a.EffectPlatformUseTTNet)) {
                bVar = new com.ss.android.ugc.aweme.effectplatform.m();
            } else {
                bVar = new com.ss.android.ugc.aweme.effectplatform.b(D.getOKHttpClient());
            }
            c.a(a2.a(bVar).a((Executor) com.ss.android.ugc.aweme.thread.h.c()).a((c.a) new c.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61124a;

                public final void a(Effect effect, Exception exc) {
                    if (PatchProxy.isSupport(new Object[]{null, exc}, this, f61124a, false, 67136, new Class[]{Effect.class, Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{null, exc}, this, f61124a, false, 67136, new Class[]{Effect.class, Exception.class}, Void.TYPE);
                        return;
                    }
                    ai.b("onModelNotFound" + Log.getStackTraceString(exc));
                    com.ss.android.ugc.aweme.base.n.a("model_not_found_rate", 1, bi.a().a("errorDesc", Log.getStackTraceString(exc)).b());
                }

                public final void a(Effect effect, ModelInfo modelInfo, long j) {
                    Effect effect2 = effect;
                    long j2 = j;
                    if (PatchProxy.isSupport(new Object[]{effect2, modelInfo, new Long(j2)}, this, f61124a, false, 67134, new Class[]{Effect.class, ModelInfo.class, Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect2, modelInfo, new Long(j2)}, this, f61124a, false, 67134, new Class[]{Effect.class, ModelInfo.class, Long.TYPE}, Void.TYPE);
                        return;
                    }
                    ai.a("onModelDownloadSuccess " + effect2.name + " requirements " + modelInfo.getName());
                    com.ss.android.ugc.aweme.base.n.a("model_download_time", 0, bi.a().a("duration", Long.valueOf(j)).b());
                    com.ss.android.ugc.aweme.base.n.a("service_model_download_error_rate", 0, (JSONObject) null);
                }

                public final void a(Effect effect, ModelInfo modelInfo, Exception exc) {
                    Effect effect2 = effect;
                    if (PatchProxy.isSupport(new Object[]{effect2, modelInfo, exc}, this, f61124a, false, 67135, new Class[]{Effect.class, ModelInfo.class, Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect2, modelInfo, exc}, this, f61124a, false, 67135, new Class[]{Effect.class, ModelInfo.class, Exception.class}, Void.TYPE);
                        return;
                    }
                    ai.b("onModelDownloadError " + effect2.name + " requirements " + modelInfo.getName());
                    com.ss.android.ugc.aweme.base.n.a("service_model_download_error_rate", 1, bi.a().a("errorDesc", Log.getStackTraceString(exc)).b());
                }
            }).a(i()).a());
        }
    }

    static {
        Application application = l.f61142b;
        k kVar = l.f61143c;
        if (PatchProxy.isSupport(new Object[]{application, kVar}, null, f61118a, true, 67119, new Class[]{Application.class, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application, kVar}, null, f61118a, true, 67119, new Class[]{Application.class, k.class}, Void.TYPE);
        } else {
            f61119b = application;
            H = kVar;
            O = new ActivityMonitor(application);
            L = new e(application, 7);
            M = new com.ss.android.ugc.aweme.property.a(application);
            if (M.a(a.C0682a.LoadLibraryFromExternal)) {
                com.ss.android.ttve.nativePort.b.a((b.c) new dmt.av.video.c(application, new b.a()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Class<?>... r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f61118a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Class[]> r3 = java.lang.Class[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 67118(0x1062e, float:9.4052E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f61118a
            r13 = 1
            r14 = 67118(0x1062e, float:9.4052E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            com.ss.android.ugc.aweme.port.in.ActivityMonitor r1 = O
            com.ss.android.ugc.aweme.port.in.d r2 = new com.ss.android.ugc.aweme.port.in.d
            r2.<init>(r0)
            r1.a((com.google.common.a.n<android.app.Activity>) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.port.in.a.a(java.lang.Class[]):void");
    }

    @MeasureFunction
    public static void a(i iVar) {
        int i2;
        int i3;
        String str;
        boolean z2;
        boolean z3;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, null, f61118a, true, 67121, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, null, f61118a, true, 67121, new Class[]{i.class}, Void.TYPE);
            return;
        }
        ai.d("AVEnv initVESDK start");
        if (!Q) {
            VERuntime.a().h = true;
            if (com.ss.android.ugc.aweme.i18n.c.a()) {
                b.a.a.a.f.a("1357", new ArrayList(Arrays.asList(new String[]{"https://mon.byteoversea.com/monitor/appmonitor/v2/settings", "https://mon.isnssdk.com/monitor/appmonitor/v2/settings", "https://mon.snssdk.com/monitor/appmonitor/v2/settings"})));
                b.a.a.a.f.b("1357", new ArrayList(Arrays.asList(new String[]{"http://mon.byteoversea.com/monitor/collect/", "http://mon.sgsnssdk.com/monitor/collect/"})));
            }
            Application application = f61119b;
            if (PatchProxy.isSupport(new Object[]{application}, null, ar.f61125a, true, 67160, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{application}, null, ar.f61125a, true, 67160, new Class[]{Context.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(application, "context");
                File filesDir = application.getFilesDir();
                Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.filesDir");
                File resolve = FilesKt.resolve(FilesKt.resolve(filesDir, "vesdk"), "models");
                if (resolve.exists()) {
                    bk unused = g.a(bd.f83876a, null, null, new ar.a(resolve, null), 3);
                }
            }
            e();
            com.ss.android.vesdk.ai.a(c.b().d());
            if (!com.ss.android.ugc.aweme.i18n.c.a()) {
                if (M.b(a.C0682a.EnableOpenGl3) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                VERuntime.a().f78084f = z3;
                VideoSdkCore.enableGLES3(z3);
            }
            com.ss.android.ttve.monitor.d.f31249e = M.a(a.C0682a.OpenCameraFrameOptimizeSDK);
            Application application2 = f61119b;
            String path = new File(f61119b.getFilesDir(), "vesdk").getPath();
            VERuntime a2 = VERuntime.a();
            if (!a2.i) {
                a2.i = true;
                a2.f78079a = application2;
                com.ss.android.ttve.nativePort.b.a((Context) application2);
                a2.f78083e = new com.ss.android.vesdk.runtime.c();
                a2.f78083e.f78102a = path;
                a2.g = new com.ss.android.vesdk.g();
                a2.f78082d = new com.ss.android.vesdk.runtime.e();
                a2.l = com.ss.android.vesdk.runtime.a.a.a();
                a2.l.a(application2);
                Context context = a2.f78079a;
                String str2 = (String) a2.l.b("KEY_DEVICEID", "");
                TEMonitorInvoker.nativeInit();
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ttve.monitor.d.f31245a) {
                    if (!com.ss.android.ttve.monitor.d.f31249e) {
                        com.ss.android.ttve.monitor.c.a(applicationContext, str2, null, null);
                        com.ss.android.ttve.monitor.d.f31247c = true;
                    } else if (!com.ss.android.ttve.monitor.d.f31247c && com.ss.android.ttve.monitor.d.f31246b == null) {
                        Thread thread = new Thread(new Runnable(applicationContext, str2, null, null) {

                            /* renamed from: a */
                            final /* synthetic */ Context f31250a;

                            /* renamed from: b */
                            final /* synthetic */ String f31251b;

                            /* renamed from: c */
                            final /* synthetic */ String f31252c;

                            /* renamed from: d */
                            final /* synthetic */ String f31253d;

                            public final void run(
/*
Method generation error in method: com.ss.android.ttve.monitor.d.1.run():void, dex: classes4.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ttve.monitor.d.1.run():void, class status: UNLOADED
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
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:623)
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
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                        });
                        com.ss.android.ttve.monitor.d.f31246b = thread;
                        thread.start();
                    }
                }
                VideoSdkCore.init(application2);
                a2.b();
            }
            com.ss.android.vesdk.runtime.a.a().a(path);
            int b2 = M.b(a.C0682a.VEConfigOptLevel) | L.b(e.a.EnableVESingleGL);
            if (b2 > 0) {
                if ((b2 & 8) == 8) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ah.f77888a = z2;
                TEInterface.setEnableOpt(b2);
            }
            ai.a("enable veeditor opt,with level:" + b2);
            boolean q2 = com.ss.android.ugc.aweme.property.f.q();
            int r2 = com.ss.android.ugc.aweme.property.f.r();
            VERuntime a3 = VERuntime.a();
            if (!a3.i) {
                y.d("VERuntime", "runtime not init");
                i2 = -108;
            } else {
                if (r2 <= 720) {
                    r2 = 730;
                }
                a3.nativeEnableHDH264HWDecoder(q2, r2);
                i2 = 0;
            }
            if (i2 != -108) {
                boolean a4 = M.a(a.C0682a.EnableTT265Decoder);
                VERuntime a5 = VERuntime.a();
                if (!a5.i) {
                    y.d("VERuntime", "runtime not init");
                    i3 = -108;
                } else {
                    a5.nativeEnableTT265Decoder(a4);
                    i3 = 0;
                }
                if (i3 != -108) {
                    if (PatchProxy.isSupport(new Object[0], null, u.f47653a, true, 44187, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], null, u.f47653a, true, 44187, new Class[0], String.class);
                    } else {
                        str = u.f47655c + File.separator;
                    }
                    VERuntime.a();
                    VideoSdkCore.setAmazingShareDir(str);
                    VEEffectConfig.setShareDir(str);
                    if (PatchProxy.isSupport(new Object[]{iVar2}, null, f61118a, true, 67125, new Class[]{i.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{iVar2}, null, f61118a, true, 67125, new Class[]{i.class}, Void.TYPE);
                    } else {
                        p.a(iVar2);
                    }
                    if (M.a(a.C0682a.EnableFeedbackLog)) {
                        com.ss.android.ttve.log.a.f31190a = e.f61133b;
                        TELog2ClientInvoker.nativeInit();
                        a.AnonymousClass1 r0 = new com.ss.android.medialib.log.b() {
                            public final void a(
/*
Method generation error in method: com.ss.android.ttve.log.a.1.a(int, java.lang.String):void, dex: classes4.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ttve.log.a.1.a(int, java.lang.String):void, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                        if (PatchProxy.isSupport(new Object[]{r0}, null, com.ss.android.medialib.log.c.f29690a, true, 17464, new Class[]{com.ss.android.medialib.log.b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{r0}, null, com.ss.android.medialib.log.c.f29690a, true, 17464, new Class[]{com.ss.android.medialib.log.b.class}, Void.TYPE);
                        } else {
                            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.medialib.log.c.f29690a, true, 17465, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.medialib.log.c.f29690a, true, 17465, new Class[0], Void.TYPE);
                            } else {
                                Log2ClientInvoker.nativeInit();
                            }
                            com.ss.android.medialib.log.c.f29691b = r0;
                        }
                        TELog2ClientInvoker.nativeSetLog2ClientSwitch(true);
                        Log2ClientInvoker.nativeSetLog2ClientSwitch(true);
                    }
                    Q = true;
                } else {
                    throw new r(i3, "please set VEEnv or VEEnv#init");
                }
            } else {
                throw new r(i2, "please set VEEnv or VEEnv#init");
            }
        }
        ai.d("AVEnv initVESDK end");
    }

    static final /* synthetic */ void a(int i2, String str) {
        int i3 = 3;
        switch (i2) {
            case 0:
                i3 = 2;
                break;
            case 2:
                i3 = 4;
                break;
            case 3:
                i3 = 5;
                break;
            case 4:
                i3 = 6;
                break;
        }
        com.ss.android.ugc.aweme.framework.a.a.a(i3, "Tools-SDK", str);
    }
}
