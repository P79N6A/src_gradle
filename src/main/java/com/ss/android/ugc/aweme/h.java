package com.ss.android.ugc.aweme;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.account.c;
import com.ss.android.b;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.e;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.InterceptorService;
import com.ss.android.ugc.aweme.services.LoginService;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.services.ProAccountService;
import com.ss.android.ugc.aweme.services.RnAndH5Service;

public abstract class h implements IAccountService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AccountUserService mAccountUserService;
    private e mAgeGateService;
    private BindService mBindService;
    private volatile boolean mHasInitialized;
    private InterceptorService mInterceptorService;
    private LoginService mLoginService;
    private v mModuleContext;
    private PasswordService mPasswordService;
    private ProAccountService mProAccountService;
    private RnAndH5Service mRnAndH5Service;

    private void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19441, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19441, new Class[0], Void.TYPE);
            return;
        }
        if (!this.mHasInitialized) {
            this.mHasInitialized = true;
            init();
        }
    }

    public IAgeGateService ageGateService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19427, new Class[0], IAgeGateService.class)) {
            return (IAgeGateService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19427, new Class[0], IAgeGateService.class);
        }
        tryInit();
        if (this.mAgeGateService == null) {
            this.mAgeGateService = new e();
        }
        return this.mAgeGateService;
    }

    public m bindService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19431, new Class[0], m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19431, new Class[0], m.class);
        }
        tryInit();
        if (this.mBindService == null) {
            this.mBindService = new BindService();
        }
        return this.mBindService;
    }

    public v getModuleContext() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19440, new Class[0], v.class)) {
            return (v) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19440, new Class[0], v.class);
        }
        if (this.mModuleContext == null) {
            this.mModuleContext = new v();
        }
        return this.mModuleContext;
    }

    public void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19424, new Class[0], Void.TYPE);
            return;
        }
        w.f50728c = this;
        b bVar = b.f34451c;
        if (bVar != null) {
            c.f2421a = bVar;
        }
        c.f2422b = i.f49998b;
    }

    public o interceptorService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19434, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19434, new Class[0], o.class);
        }
        tryInit();
        if (this.mInterceptorService == null) {
            this.mInterceptorService = new InterceptorService();
        }
        return this.mInterceptorService;
    }

    public p loginService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19430, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19430, new Class[0], p.class);
        }
        tryInit();
        if (this.mLoginService == null) {
            this.mLoginService = new LoginService();
        }
        return this.mLoginService;
    }

    public q passwordService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19432, new Class[0], q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19432, new Class[0], q.class);
        }
        tryInit();
        if (this.mPasswordService == null) {
            this.mPasswordService = new PasswordService();
        }
        return this.mPasswordService;
    }

    public r proAccountService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19433, new Class[0], r.class)) {
            return (r) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19433, new Class[0], r.class);
        }
        tryInit();
        if (this.mProAccountService == null) {
            this.mProAccountService = new ProAccountService();
        }
        return this.mProAccountService;
    }

    public s rnAndH5Service() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19429, new Class[0], s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19429, new Class[0], s.class);
        }
        tryInit();
        if (this.mRnAndH5Service == null) {
            this.mRnAndH5Service = new RnAndH5Service();
        }
        return this.mRnAndH5Service;
    }

    public IAccountUserService userService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19428, new Class[0], IAccountUserService.class)) {
            return (IAccountUserService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19428, new Class[0], IAccountUserService.class);
        }
        tryInit();
        if (this.mAccountUserService == null) {
            this.mAccountUserService = new AccountUserService();
        }
        return this.mAccountUserService;
    }

    public void login(@NonNull IAccountService.c cVar) {
        IAccountService.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 19425, new Class[]{IAccountService.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 19425, new Class[]{IAccountService.c.class}, Void.TYPE);
            return;
        }
        tryInit();
        loginService().showLoginAndRegisterView(cVar2);
    }

    public void setLoginMob(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 19426, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 19426, new Class[]{String.class}, Void.TYPE);
            return;
        }
        i.a(str2, "", null, 0);
    }

    public void addLoginOrLogoutListener(@NonNull IAccountService.a aVar) {
        IAccountService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 19435, new Class[]{IAccountService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 19435, new Class[]{IAccountService.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, w.f50726a, true, 19493, new Class[]{IAccountService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, w.f50726a, true, 19493, new Class[]{IAccountService.a.class}, Void.TYPE);
            return;
        }
        synchronized (w.class) {
            if (!w.f50727b.contains(aVar2)) {
                w.f50727b.add(aVar2);
            }
        }
    }

    public void removeLoginOrLogoutListener(@NonNull IAccountService.a aVar) {
        IAccountService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 19436, new Class[]{IAccountService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 19436, new Class[]{IAccountService.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, w.f50726a, true, 19494, new Class[]{IAccountService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, w.f50726a, true, 19494, new Class[]{IAccountService.a.class}, Void.TYPE);
            return;
        }
        synchronized (w.class) {
            w.f50727b.remove(aVar2);
        }
    }

    public boolean needIntercept(@IAccountService.ActionType int i, @Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj}, this, changeQuickRedirect, false, 19438, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj}, this, changeQuickRedirect, false, 19438, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this.mLoginService == null || !this.mLoginService.needIntercept(i, obj)) {
            return false;
        } else {
            return true;
        }
    }

    public void notifyProgress(@IAccountService.ViewPage int i, @IAccountService.ActionProgress int i2, @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 19439, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 19439, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.mLoginService != null) {
            int i3 = i;
            int i4 = i2;
            this.mLoginService.notifyProgress(i, i2, str2);
        }
    }

    public void returnResult(@IAccountService.ActionType int i, @IAccountService.ActionResult int i2, @Nullable Object obj) {
        int i3 = i;
        int i4 = i2;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 19437, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 19437, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (!a.a(i)) {
            if (this.mBindService != null) {
                this.mBindService.returnResult(i3, i4, obj2);
            }
            if (this.mPasswordService != null) {
                this.mPasswordService.returnResult(i3, i4, obj2);
            }
            if (this.mProAccountService != null) {
                this.mProAccountService.returnResult(i3, i4, obj2);
            }
        } else if (this.mLoginService != null) {
            this.mLoginService.returnResult(i3, i4, obj2);
        }
    }
}
