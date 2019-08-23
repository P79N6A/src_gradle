package com.ali.auth.third.login.handler;

import com.ali.auth.third.core.callback.LoginCallback;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.model.Session;
import java.lang.ref.WeakReference;

public class a implements LoginCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeakReference f5018a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoginCallback f5019b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoginActivityResultHandler f5020c;

    a(LoginActivityResultHandler loginActivityResultHandler, WeakReference weakReference, LoginCallback loginCallback) {
        this.f5020c = loginActivityResultHandler;
        this.f5018a = weakReference;
        this.f5019b = loginCallback;
    }

    public void onFailure(int i, String str) {
        KernelContext.executorService.postUITask(new b(this));
    }

    public void onSuccess(Session session) {
        KernelContext.executorService.postUITask(new c(this));
    }
}
