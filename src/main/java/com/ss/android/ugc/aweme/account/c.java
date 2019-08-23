package com.ss.android.ugc.aweme.account;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.m;
import com.ss.android.ugc.aweme.p;
import com.ss.android.ugc.aweme.s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31815a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile IAccountService f31816b;

    public static IAccountService a() {
        if (PatchProxy.isSupport(new Object[0], null, f31815a, true, 19533, new Class[0], IAccountService.class)) {
            return (IAccountService) PatchProxy.accessDispatch(new Object[0], null, f31815a, true, 19533, new Class[0], IAccountService.class);
        }
        f();
        return f31816b;
    }

    public static p b() {
        if (PatchProxy.isSupport(new Object[0], null, f31815a, true, 19534, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], null, f31815a, true, 19534, new Class[0], p.class);
        }
        f();
        return f31816b.loginService();
    }

    public static m c() {
        if (PatchProxy.isSupport(new Object[0], null, f31815a, true, 19536, new Class[0], m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[0], null, f31815a, true, 19536, new Class[0], m.class);
        }
        f();
        return f31816b.bindService();
    }

    public static IAccountUserService d() {
        if (PatchProxy.isSupport(new Object[0], null, f31815a, true, 19538, new Class[0], IAccountUserService.class)) {
            return (IAccountUserService) PatchProxy.accessDispatch(new Object[0], null, f31815a, true, 19538, new Class[0], IAccountUserService.class);
        }
        f();
        return f31816b.userService();
    }

    public static s e() {
        if (PatchProxy.isSupport(new Object[0], null, f31815a, true, 19539, new Class[0], s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[0], null, f31815a, true, 19539, new Class[0], s.class);
        }
        f();
        return f31816b.rnAndH5Service();
    }

    private static void f() {
        if (PatchProxy.isSupport(new Object[0], null, f31815a, true, 19532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f31815a, true, 19532, new Class[0], Void.TYPE);
            return;
        }
        if (f31816b == null) {
            f31816b = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        }
    }
}
