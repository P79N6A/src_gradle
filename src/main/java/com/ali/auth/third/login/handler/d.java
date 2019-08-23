package com.ali.auth.third.login.handler;

import android.app.Activity;
import com.ali.auth.third.core.callback.LoginCallback;
import com.ali.auth.third.login.UTConstants;
import com.ali.auth.third.ui.context.CallbackContext;
import java.lang.ref.WeakReference;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeakReference f5023a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoginCallback f5024b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoginActivityResultHandler f5025c;

    d(LoginActivityResultHandler loginActivityResultHandler, WeakReference weakReference, LoginCallback loginCallback) {
        this.f5025c = loginActivityResultHandler;
        this.f5023a = weakReference;
        this.f5024b = loginCallback;
    }

    public void run() {
        CallbackContext.activity = this.f5023a;
        this.f5025c.a((Activity) this.f5023a.get(), UTConstants.E_H5_OPERATION_BIND_FAILURE, this.f5024b, 10003);
        CallbackContext.activity = null;
    }
}
