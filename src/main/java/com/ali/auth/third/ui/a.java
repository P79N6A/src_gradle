package com.ali.auth.third.ui;

import android.view.View;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.login.util.LoginStatus;

public class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LoginActivity f5049a;

    a(LoginActivity loginActivity) {
        this.f5049a = loginActivity;
    }

    public void onClick(View view) {
        SDKLogger.e("login.LoginActivity", "click to destroy");
        this.f5049a.finish();
        LoginStatus.resetLoginFlag();
    }
}
