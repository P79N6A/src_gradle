package com.ss.android.ugc.aweme.account.login.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32628a;

    /* renamed from: b  reason: collision with root package name */
    private final LoginButton f32629b;

    j(LoginButton loginButton) {
        this.f32629b = loginButton;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f32628a, false, 20581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32628a, false, 20581, new Class[0], Void.TYPE);
            return;
        }
        LoginButton loginButton = this.f32629b;
        if (loginButton.f32457d) {
            loginButton.c();
            return;
        }
        loginButton.animate().cancel();
        loginButton.animate().rotation(0.0f).rotationXBy(0.0f).rotationYBy(0.0f).setDuration(1).start();
        loginButton.setBackgroundResource(loginButton.f32456c);
    }
}
