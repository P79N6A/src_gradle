package com.ali.auth.third.login.handler;

import android.app.Activity;
import com.ali.auth.third.login.UTConstants;
import com.ali.auth.third.ui.context.CallbackContext;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f5021a;

    b(a aVar) {
        this.f5021a = aVar;
    }

    public void run() {
        CallbackContext.activity = this.f5021a.f5018a;
        this.f5021a.f5020c.a((Activity) this.f5021a.f5018a.get(), UTConstants.E_IV_LOGIN_FAILURE, this.f5021a.f5019b, 10101);
        CallbackContext.activity = null;
    }
}
