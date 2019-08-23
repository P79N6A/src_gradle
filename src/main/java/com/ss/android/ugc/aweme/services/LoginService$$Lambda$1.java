package com.ss.android.ugc.aweme.services;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;

public final /* synthetic */ class LoginService$$Lambda$1 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LoginService arg$1;
    private final IAccountService.c arg$2;

    LoginService$$Lambda$1(LoginService loginService, IAccountService.c cVar) {
        this.arg$1 = loginService;
        this.arg$2 = cVar;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 71409, new Class[]{i.class}, Object.class)) {
            return this.arg$1.lambda$showLoginAndRegisterView$1$LoginService(this.arg$2, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 71409, new Class[]{i.class}, Object.class);
    }
}
