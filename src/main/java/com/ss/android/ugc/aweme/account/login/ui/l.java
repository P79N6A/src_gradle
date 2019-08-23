package com.ss.android.ugc.aweme.account.login.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32633a;

    /* renamed from: b  reason: collision with root package name */
    private final LoginOrRegisterFragment f32634b;

    l(LoginOrRegisterFragment loginOrRegisterFragment) {
        this.f32634b = loginOrRegisterFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f32633a, false, 20614, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32633a, false, 20614, new Class[0], Void.TYPE);
            return;
        }
        LoginOrRegisterFragment loginOrRegisterFragment = this.f32634b;
        loginOrRegisterFragment.b(loginOrRegisterFragment.u);
    }
}
