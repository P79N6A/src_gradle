package com.ss.android.ugc.aweme.app.accountsdk;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.c;
import com.ss.android.ugc.aweme.t;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/accountsdk/AccountInitializer;", "", "()V", "getAuthorize", "Lcom/ss/android/ugc/aweme/IThirdAuthorize;", "getChangeListener", "Lcom/ss/android/ugc/aweme/IAccountUserService$IAccountUserChangeListener;", "getConfig", "Lcom/ss/android/TTAccountConfig;", "getServiceProvider", "Lcom/ss/android/ugc/aweme/AccountServiceProvider;", "getUserOperate", "Lcom/ss/android/ugc/aweme/IAccountService$IUserOperateCallback;", "init", "", "appContext", "Landroid/app/Application;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2622a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f2623b = new a();

    private a() {
    }

    private final b a() {
        if (!PatchProxy.isSupport(new Object[0], this, f2622a, false, 22969, new Class[0], b.class)) {
            return new AccountConfigImpl();
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, f2622a, false, 22969, new Class[0], b.class);
    }

    private final IAccountService.b b() {
        if (!PatchProxy.isSupport(new Object[0], this, f2622a, false, 22970, new Class[0], IAccountService.b.class)) {
            return new com.ss.android.ugc.aweme.app.application.a.b();
        }
        return (IAccountService.b) PatchProxy.accessDispatch(new Object[0], this, f2622a, false, 22970, new Class[0], IAccountService.b.class);
    }

    private final t c() {
        if (!PatchProxy.isSupport(new Object[0], this, f2622a, false, 22971, new Class[0], t.class)) {
            return new com.ss.android.ugc.aweme.app.application.a.a();
        }
        return (t) PatchProxy.accessDispatch(new Object[0], this, f2622a, false, 22971, new Class[0], t.class);
    }

    private final IAccountUserService.a d() {
        if (!PatchProxy.isSupport(new Object[0], this, f2622a, false, 22972, new Class[0], IAccountUserService.a.class)) {
            return new c();
        }
        return (IAccountUserService.a) PatchProxy.accessDispatch(new Object[0], this, f2622a, false, 22972, new Class[0], IAccountUserService.a.class);
    }

    private final c e() {
        if (!PatchProxy.isSupport(new Object[0], this, f2622a, false, 22973, new Class[0], c.class)) {
            return new b();
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f2622a, false, 22973, new Class[0], c.class);
    }

    @JvmStatic
    public static final void a(@NotNull Application application) {
        Application application2 = application;
        if (PatchProxy.isSupport(new Object[]{application2}, null, f2622a, true, 22968, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2}, null, f2622a, true, 22968, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(application2, "appContext");
        com.ss.android.ugc.aweme.b.a(application, f2623b.a(), f2623b.b(), f2623b.c(), f2623b.d(), f2623b.e());
    }
}
