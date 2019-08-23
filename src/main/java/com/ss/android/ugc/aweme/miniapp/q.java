package com.ss.android.ugc.aweme.miniapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.i;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.miniapp.api.MicroAppApi;
import com.ss.android.ugc.aweme.miniapp.l.d;
import com.ss.android.ugc.aweme.miniapp.l.k;
import com.ss.android.ugc.aweme.miniapp.l.l;
import com.ss.android.ugc.aweme.miniapp.views.MiniAppListH5Activity;
import com.ss.android.ugc.aweme.miniapp_api.a.b;
import com.ss.android.ugc.aweme.miniapp_api.a.c;
import com.ss.android.ugc.aweme.miniapp_api.a.d;
import com.ss.android.ugc.aweme.miniapp_api.a.e;
import com.ss.android.ugc.aweme.miniapp_api.a.f;
import com.ss.android.ugc.aweme.miniapp_api.a.g;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.utils.y;
import com.storage.async.AsyncSchedulerInit;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.AppbrandHostConstants;
import com.tt.miniapphost.hostmethod.HostMethodManager;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class q implements IMiniAppService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55894a;

    /* renamed from: b  reason: collision with root package name */
    public String f55895b;

    /* renamed from: c  reason: collision with root package name */
    public String f55896c;

    /* renamed from: d  reason: collision with root package name */
    public String f55897d;

    /* renamed from: e  reason: collision with root package name */
    public String f55898e;

    /* renamed from: f  reason: collision with root package name */
    public String f55899f;
    public Application g;
    public c h;
    public f i;
    public e j;
    public d k;
    public com.ss.android.ugc.aweme.miniapp_api.a.a l;
    public b m;
    public g n;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final q f55900a = new q((byte) 0);
    }

    public final void deferredInstallDynamicModule() {
        if (PatchProxy.isSupport(new Object[0], this, f55894a, false, 59061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55894a, false, 59061, new Class[0], Void.TYPE);
        }
    }

    public final com.bytedance.morpheus.core.a getDynamicFeatureStateListener() {
        if (!PatchProxy.isSupport(new Object[0], this, f55894a, false, 59043, new Class[0], com.bytedance.morpheus.core.a.class)) {
            return null;
        }
        return (com.bytedance.morpheus.core.a) PatchProxy.accessDispatch(new Object[0], this, f55894a, false, 59043, new Class[0], com.bytedance.morpheus.core.a.class);
    }

    public final void testOpenMiNi(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f55894a, false, 59060, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f55894a, false, 59060, new Class[]{Context.class}, Void.TYPE);
        }
    }

    private q() {
    }

    public static q a() {
        return a.f55900a;
    }

    public final String getJsSdkVersion() {
        if (!PatchProxy.isSupport(new Object[0], this, f55894a, false, 59048, new Class[0], String.class)) {
            return k.a((Context) this.g);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f55894a, false, 59048, new Class[0], String.class);
    }

    public final void tryLoadMiniAppPlugin() {
        if (PatchProxy.isSupport(new Object[0], this, f55894a, false, 59051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55894a, false, 59051, new Class[0], Void.TYPE);
            return;
        }
        Application application = this.g;
        if (PatchProxy.isSupport(new Object[]{application}, null, k.f55844a, true, 59557, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application}, null, k.f55844a, true, 59557, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (k.f55845b) {
            if (com.bytedance.frameworks.plugin.pm.c.b("com.ss.android.ugc.aweme.miniappplugin")) {
                k.a();
            }
            k.f55845b = false;
        }
        if (!com.ss.android.ugc.aweme.plugin.g.b.a("com.ss.android.ugc.aweme.miniappplugin") && !com.ss.android.g.a.a() && application != null) {
            com.ss.android.ugc.aweme.miniapp.l.d.a().a(application, "start_mini_app", false, new d.a() {

                /* renamed from: a */
                public static ChangeQuickRedirect f55847a;

                public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.miniapp.l.k.1.a():void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.miniapp.l.k.1.a():void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
        }
        l lVar = new l(application);
        if (PatchProxy.isSupport(new Object[]{lVar}, null, y.f75971a, true, 88033, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar}, null, y.f75971a, true, 88033, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        y.a(lVar, "BoltsUtils");
    }

    /* synthetic */ q(byte b2) {
        this();
    }

    public final String getAppId(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f55894a, false, 59053, new Class[]{String.class}, String.class)) {
            return k.c(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f55894a, false, 59053, new Class[]{String.class}, String.class);
    }

    public final boolean isAppBrandSchema(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f55894a, false, 59045, new Class[]{String.class}, Boolean.TYPE)) {
            return k.a(str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f55894a, false, 59045, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean isMicroAppSchema(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f55894a, false, 59054, new Class[]{String.class}, Boolean.TYPE)) {
            return k.d(str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f55894a, false, 59054, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean isMicroGameSchema(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f55894a, false, 59055, new Class[]{String.class}, Boolean.TYPE)) {
            return k.b(str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f55894a, false, 59055, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final String buildSchema(com.ss.android.ugc.aweme.miniapp_api.model.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f55894a, false, 59046, new Class[]{com.ss.android.ugc.aweme.miniapp_api.model.f.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{fVar}, this, f55894a, false, 59046, new Class[]{com.ss.android.ugc.aweme.miniapp_api.model.f.class}, String.class);
        }
        if (PatchProxy.isSupport(new Object[]{fVar}, null, k.f55844a, true, 59574, new Class[]{com.ss.android.ugc.aweme.miniapp_api.model.f.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{fVar}, null, k.f55844a, true, 59574, new Class[]{com.ss.android.ugc.aweme.miniapp_api.model.f.class}, String.class);
        } else if (fVar == null) {
            return "";
        } else {
            return fVar.getSchema();
        }
    }

    public final boolean checkMiniAppEnable(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f55894a, false, 59056, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f55894a, false, 59056, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{context2}, null, k.f55844a, true, 59580, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, k.f55844a, true, 59580, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (AppbrandHostConstants.getBundleManager().checkMiniAppDisableState(context2, 0) == null) {
            return true;
        } else {
            return false;
        }
    }

    public final void preloadMiniApp(String str) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{str}, this, f55894a, false, 59063, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f55894a, false, 59063, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str}, null, k.f55844a, true, 59560, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, k.f55844a, true, 59560, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (k.a(str)) {
            String c2 = k.c(str);
            if (k.b(str)) {
                i2 = 2;
            }
            k.a(c2, i2);
        }
    }

    public final void openMircoAppList(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f55894a, false, 59044, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f55894a, false, 59044, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity2}, null, k.f55844a, true, 59556, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, k.f55844a, true, 59556, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.g.a.a()) {
            if (PatchProxy.isSupport(new Object[]{activity2}, null, MiniAppListH5Activity.f55939a, true, 59623, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, null, MiniAppListH5Activity.f55939a, true, 59623, new Class[]{Context.class}, Void.TYPE);
            } else if (activity2 != null) {
                activity2.startActivity(new Intent(activity2, MiniAppListH5Activity.class));
            }
        }
    }

    public final com.ss.android.ugc.aweme.miniapp_api.model.e getFollowRelation(String str, long j2) throws Exception {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{str, new Long(j3)}, this, f55894a, false, 59059, new Class[]{String.class, Long.TYPE}, com.ss.android.ugc.aweme.miniapp_api.model.e.class)) {
            return MicroAppApi.a(str, j2);
        }
        return (com.ss.android.ugc.aweme.miniapp_api.model.e) PatchProxy.accessDispatch(new Object[]{str, new Long(j3)}, this, f55894a, false, 59059, new Class[]{String.class, Long.TYPE}, com.ss.android.ugc.aweme.miniapp_api.model.e.class);
    }

    public final boolean isMinAppAvailable(Context context, String str) {
        if (!PatchProxy.isSupport(new Object[]{context, str}, this, f55894a, false, 59057, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return k.a(context, str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, this, f55894a, false, 59057, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void preloadMiniApp(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f55894a, false, 59062, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f55894a, false, 59062, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        k.a(str, i2);
    }

    public final void initialize(Application application, IMiniAppService.a aVar) {
        Application application2 = application;
        IMiniAppService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{application2, aVar2}, this, f55894a, false, 59041, new Class[]{Application.class, IMiniAppService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2, aVar2}, this, f55894a, false, 59041, new Class[]{Application.class, IMiniAppService.a.class}, Void.TYPE);
            return;
        }
        this.g = application2;
        this.f55895b = aVar2.f3606a;
        this.f55896c = aVar2.f3607b;
        this.f55897d = aVar2.f3608c;
        this.f55898e = aVar2.f3609d;
        this.f55899f = aVar2.f3610e;
        this.i = aVar2.f3611f;
        this.h = aVar2.g;
        this.j = aVar2.h;
        this.k = aVar2.i;
        this.l = aVar2.j;
        this.m = aVar2.k;
        this.n = aVar2.l;
        if (PatchProxy.isSupport(new Object[]{application2}, null, k.f55808a, true, 59026, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2}, null, k.f55808a, true, 59026, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (PatchProxy.isSupport(new Object[0], null, k.f55808a, true, 59027, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, k.f55808a, true, 59027, new Class[0], Void.TYPE);
            } else {
                AsyncSchedulerInit.setDBSchedulerHandler(l.f55814b);
                AsyncSchedulerInit.setNetSchedulerHandler(m.f55858b);
            }
            if (com.ss.android.g.a.a()) {
                if (PatchProxy.isSupport(new Object[]{application2}, null, k.f55808a, true, 59033, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{application2}, null, k.f55808a, true, 59033, new Class[]{Context.class}, Void.TYPE);
                } else if (!com.bytedance.frameworks.baselib.network.http.util.g.a(application)) {
                    try {
                        System.loadLibrary("c++_shared");
                        System.loadLibrary("v8_libbase.cr");
                        System.loadLibrary("v8_libplatform.cr");
                        System.loadLibrary("v8.cr");
                        System.loadLibrary("jsbinding");
                        System.loadLibrary("aurum");
                        System.loadLibrary("helium");
                        System.loadLibrary("effect");
                        System.loadLibrary("helium-game");
                        AppBrandLogger.d(k.f55809b, "load so ok");
                    } catch (Throwable th) {
                        AppBrandLogger.eWithThrowable(k.f55809b, "loading error", th);
                    }
                }
            }
            AppbrandContext.init(application2, b.a(application));
            if (PatchProxy.isSupport(new Object[]{application2}, null, k.f55808a, true, 59028, new Class[]{Application.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{application2}, null, k.f55808a, true, 59028, new Class[]{Application.class}, Void.TYPE);
            } else if (ToolUtils.getCurProcessName(application).contains("miniapp")) {
                if (PatchProxy.isSupport(new Object[]{application2}, null, k.f55808a, true, 59032, new Class[]{Application.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{application2}, null, k.f55808a, true, 59032, new Class[]{Application.class}, Void.TYPE);
                } else {
                    f fVar = a().i;
                    if (fVar != null) {
                        fVar.c();
                    }
                }
                if (PatchProxy.isSupport(new Object[0], null, k.f55808a, true, 59030, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, k.f55808a, true, 59030, new Class[0], Void.TYPE);
                } else {
                    m.a().a(new m.a().a(h.c()));
                }
                if (PatchProxy.isSupport(new Object[]{application2}, null, k.f55808a, true, 59031, new Class[]{Application.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{application2}, null, k.f55808a, true, 59031, new Class[]{Application.class}, Void.TYPE);
                } else {
                    i.a((Context) application2, (com.bytedance.crash.f) new s(application2));
                }
                k.a(application);
                HostMethodManager.getInstance().registerHostMethod("aweme_addFriend", new com.ss.android.ugc.aweme.miniapp.i.a());
                HostMethodManager.getInstance().registerHostMethod("aweme_showVideo", new com.ss.android.ugc.aweme.miniapp.i.d());
                HostMethodManager.getInstance().registerHostMethod("aweme_showVideoDetailList", new com.ss.android.ugc.aweme.miniapp.i.c());
            }
        }
    }

    public final com.ss.android.ugc.aweme.miniapp_api.model.g getMicroAppList(int i2, int i3, int i4) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f55894a, false, 59058, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, com.ss.android.ugc.aweme.miniapp_api.model.g.class)) {
            return MicroAppApi.a(i2, i3, i4);
        }
        return (com.ss.android.ugc.aweme.miniapp_api.model.g) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f55894a, false, 59058, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, com.ss.android.ugc.aweme.miniapp_api.model.g.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRequestPermissionsResult(android.app.Activity r22, @android.support.annotation.NonNull java.lang.String[] r23, @android.support.annotation.NonNull int[] r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f55894a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r9[r11] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r12] = r5
            java.lang.Class<int[]> r5 = int[].class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r7 = 0
            r8 = 59052(0xe6ac, float:8.275E-41)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0057
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f55894a
            r17 = 0
            r18 = 59052(0xe6ac, float:8.275E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r21
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0057:
            com.ss.android.ugc.aweme.miniapp.b.a.k r3 = com.ss.android.ugc.aweme.miniapp.b.a.k.a()
            r3.a((android.app.Activity) r0, (java.lang.String[]) r1, (int[]) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.q.onRequestPermissionsResult(android.app.Activity, java.lang.String[], int[]):void");
    }

    public final boolean openMiniApp(Context context, String str, com.ss.android.ugc.aweme.miniapp_api.model.b bVar) {
        if (!PatchProxy.isSupport(new Object[]{context, str, bVar}, this, f55894a, false, 59042, new Class[]{Context.class, String.class, com.ss.android.ugc.aweme.miniapp_api.model.b.class}, Boolean.TYPE)) {
            return k.a(context, str, bVar);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str, bVar}, this, f55894a, false, 59042, new Class[]{Context.class, String.class, com.ss.android.ugc.aweme.miniapp_api.model.b.class}, Boolean.TYPE)).booleanValue();
    }

    public final String buildSchema(String str, String str2, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55894a, false, 59047, new Class[]{String.class, String.class, Boolean.TYPE}, String.class)) {
            return k.a(str, str2, z);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str, str2, Byte.valueOf(z)}, this, f55894a, false, 59047, new Class[]{String.class, String.class, Boolean.TYPE}, String.class);
    }

    public final void logExcitingVideoAd(Context context, String str, long j2, String str2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, new Long(j3), str2}, this, f55894a, false, 59050, new Class[]{Context.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {context, str, new Long(j3), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f55894a, false, 59050, new Class[]{Context.class, String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.miniapp.a.g.a(context, str, j2, str2);
    }

    public final void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
        String str5;
        Context context2 = context;
        String str6 = str3;
        String str7 = str4;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2, Byte.valueOf(z ? (byte) 1 : 0), str6, str7}, this, f55894a, false, 59049, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str, str2, Byte.valueOf(z), str6, str7};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f55894a, false, 59049, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        Object[] objArr3 = {context2, str, str2, Byte.valueOf(z), str6, str7};
        if (PatchProxy.isSupport(objArr3, null, k.f55844a, true, 59576, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr4 = {context2, str, str2, Byte.valueOf(z), str6, str7};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, null, k.f55844a, true, 59576, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            com.ss.android.ugc.aweme.miniapp_api.model.k kVar = (com.ss.android.ugc.aweme.miniapp_api.model.k) new Gson().fromJson(str7, com.ss.android.ugc.aweme.miniapp_api.model.k.class);
            if (TextUtils.equals(kVar.f56037a, "awe_friend")) {
                com.ss.android.ugc.aweme.miniapp_api.a.a().f55977b = kVar;
                com.ss.android.ugc.aweme.miniapp_api.a.a().f55979d = str6;
            }
        }
        String a2 = k.a(str, str2, z);
        if (!TextUtils.isEmpty(a2)) {
            try {
                str5 = URLDecoder.decode(a2, "UTF-8");
                try {
                    if (TextUtils.isEmpty(str5)) {
                        return;
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            } catch (UnsupportedEncodingException unused2) {
                str5 = a2;
            }
            k.a(context2, str5, new b.a().b("chat").a("share_chat").c("024001").a());
        }
    }
}
