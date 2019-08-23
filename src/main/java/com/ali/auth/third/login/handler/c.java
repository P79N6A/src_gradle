package com.ali.auth.third.login.handler;

import android.app.Activity;
import com.ali.auth.third.login.UTConstants;
import com.ali.auth.third.ui.context.CallbackContext;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f5022a;

    c(a aVar) {
        this.f5022a = aVar;
    }

    public void run() {
        CallbackContext.activity = this.f5022a.f5018a;
        this.f5022a.f5020c.a((Activity) this.f5022a.f5018a.get(), UTConstants.E_H5_LOGIN_SUCCESS, this.f5022a.f5019b);
        CallbackContext.activity = null;
    }
}
