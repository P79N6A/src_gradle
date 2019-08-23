package com.ss.android.ugc.aweme.miniapp;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp.d.c;
import com.ss.android.ugc.aweme.miniapp.d.d;
import com.ss.android.ugc.aweme.miniapp.d.e;
import com.ss.android.ugc.aweme.miniapp.d.f;
import com.ss.android.ugc.aweme.miniapp.d.g;
import com.ss.android.ugc.aweme.miniapp.d.h;
import com.ss.android.ugc.aweme.miniapp.d.i;
import com.ss.android.ugc.aweme.miniapp.d.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.storage.async.Action;
import com.storage.async.Observable;
import com.storage.async.Schedulers;
import com.tt.essential.HostEssentialDepend;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandHostConstants;
import com.tt.miniapphost.IAppbrandInitializer;
import com.tt.miniapphost.ParamManager;
import com.tt.option.HostOptionDependRegister;
import java.util.Map;

public class b implements IAppbrandInitializer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55477a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f55478b = "b";

    /* renamed from: c  reason: collision with root package name */
    public static a f55479c = new a();

    /* renamed from: e  reason: collision with root package name */
    private static volatile b f55480e;

    /* renamed from: d  reason: collision with root package name */
    private Application f55481d;

    public static class a implements IAccountService.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55484a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f55485b;

        a() {
        }

        public final void a(int i, boolean z, int i2, @Nullable User user) {
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), user}, this, f55484a, false, 58994, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2), user}, this, f55484a, false, 58994, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE);
                return;
            }
            IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
            if (userService != null) {
                z2 = userService.isLogin();
            }
            if (z && !z2) {
                try {
                    try {
                        Observable.create((Action) new Action() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f55487a;

                            public final void act() {
                                if (PatchProxy.isSupport(new Object[0], this, f55487a, false, 58996, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f55487a, false, 58996, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (AppbrandHostConstants.getProcessManager() != null) {
                                    AppbrandHostConstants.getProcessManager().killAllProcess();
                                }
                                AppbrandHostConstants.getStorageManager().cleanAllMiniAppStorage();
                            }
                        }).schudleOn(Schedulers.longIO()).subscribeSimple();
                    } catch (Exception e2) {
                        e = e2;
                        AppBrandLogger.stacktrace(6, b.f55478b, e.getStackTrace());
                    }
                } catch (Exception e3) {
                    e = e3;
                    AppBrandLogger.stacktrace(6, b.f55478b, e.getStackTrace());
                }
            }
        }
    }

    @NonNull
    public HostEssentialDepend createEssentialDepend() {
        if (!PatchProxy.isSupport(new Object[0], this, f55477a, false, 58989, new Class[0], HostEssentialDepend.class)) {
            return new c();
        }
        return (HostEssentialDepend) PatchProxy.accessDispatch(new Object[0], this, f55477a, false, 58989, new Class[0], HostEssentialDepend.class);
    }

    public boolean isDebug() {
        if (!PatchProxy.isSupport(new Object[0], this, f55477a, false, 58992, new Class[0], Boolean.TYPE)) {
            return Logger.debug();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f55477a, false, 58992, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @Nullable
    public HostOptionDependRegister createOptionDepend() {
        if (PatchProxy.isSupport(new Object[0], this, f55477a, false, 58990, new Class[0], HostOptionDependRegister.class)) {
            return (HostOptionDependRegister) PatchProxy.accessDispatch(new Object[0], this, f55477a, false, 58990, new Class[0], HostOptionDependRegister.class);
        }
        HostOptionDependRegister hostOptionDependRegister = new HostOptionDependRegister();
        hostOptionDependRegister.setNetDepend(new r(this.f55481d.getApplicationContext()));
        hostOptionDependRegister.setDataHandlerDepend(new c());
        hostOptionDependRegister.setNormalDepend(new g());
        hostOptionDependRegister.setMenuDepend(new e());
        hostOptionDependRegister.setMediaDepend(new d());
        hostOptionDependRegister.setRouterDepend(new h());
        hostOptionDependRegister.setApiDepend(new com.ss.android.ugc.aweme.miniapp.d.b());
        hostOptionDependRegister.setHostOptionLowPriorityDepend(new j());
        hostOptionDependRegister.setUiDepend(new i());
        hostOptionDependRegister.setModuleExtDepend(new f());
        hostOptionDependRegister.setSceneDepend(new com.ss.android.ugc.aweme.miniapp.d.a());
        return hostOptionDependRegister;
    }

    private b(Application application) {
        this.f55481d = application;
    }

    public static b a(Application application) {
        Application application2 = application;
        if (PatchProxy.isSupport(new Object[]{application2}, null, f55477a, true, 58987, new Class[]{Application.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{application2}, null, f55477a, true, 58987, new Class[]{Application.class}, b.class);
        }
        if (f55480e == null) {
            synchronized (b.class) {
                if (f55480e == null) {
                    f55480e = new b(application2);
                }
            }
        }
        return f55480e;
    }

    public void init(Application application, String str, boolean z) {
        Application application2 = application;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{application2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55477a, false, 58988, new Class[]{Application.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2, str2, Byte.valueOf(z)}, this, f55477a, false, 58988, new Class[]{Application.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).addLoginOrLogoutListener(f55479c);
        } else {
            if (str2.contains(":miniapp")) {
                q.a().m.a(application2);
                q.a().m.a(false);
                com.bytedance.crash.i.a((Context) application2, (com.bytedance.crash.f) new s(application2));
                final Map baseEventParam = ParamManager.getBaseEventParam(application);
                if (baseEventParam != null && !baseEventParam.isEmpty()) {
                    com.bytedance.crash.j.b().f19341b.putAll(baseEventParam);
                }
                com.bytedance.crash.i.a((com.bytedance.crash.a) new com.bytedance.crash.a() {
                    public final Map<String, String> a(com.bytedance.crash.d dVar) {
                        return baseEventParam;
                    }
                }, com.bytedance.crash.d.ALL);
            }
        }
    }
}
