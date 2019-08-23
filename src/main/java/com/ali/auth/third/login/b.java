package com.ali.auth.third.login;

import com.ali.auth.third.core.broadcast.LoginAction;
import com.ali.auth.third.core.callback.LoginCallback;
import com.ali.auth.third.core.model.Session;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.CommonUtils;
import com.ali.auth.third.ui.context.CallbackContext;

public class b implements LoginCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LoginCallback f5016a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoginServiceImpl f5017b;

    b(LoginServiceImpl loginServiceImpl, LoginCallback loginCallback) {
        this.f5017b = loginServiceImpl;
        this.f5016a = loginCallback;
    }

    public void onFailure(int i, String str) {
        SDKLogger.d("login", "auth auto login success");
        this.f5017b.goLogin(this.f5016a);
    }

    public void onSuccess(Session session) {
        SDKLogger.d("login", "auth auto login success");
        if (this.f5016a != null) {
            this.f5016a.onSuccess(this.f5017b.getSession());
        }
        if (CallbackContext.mGlobalLoginCallback != null) {
            CallbackContext.mGlobalLoginCallback.onSuccess(this.f5017b.getSession());
        }
        CommonUtils.sendBroadcast(LoginAction.NOTIFY_LOGIN_SUCCESS);
    }
}
