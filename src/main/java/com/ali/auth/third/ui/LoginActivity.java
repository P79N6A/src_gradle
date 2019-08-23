package com.ali.auth.third.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.ResourceUtils;
import com.ali.auth.third.login.LoginComponent;
import com.ali.auth.third.login.util.LoginStatus;
import com.ali.auth.third.ui.context.CallbackContext;

public class LoginActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f5047a;

    /* access modifiers changed from: protected */
    public void auth() {
        LoginComponent.INSTANCE.showLogin(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        SDKLogger.d("login.LoginActivity", "onActivityResult requestCode = " + i + " resultCode=" + i2);
        if (!KernelContext.checkServiceValid()) {
            finish();
            return;
        }
        this.f5047a.setClickable(true);
        this.f5047a.setLongClickable(true);
        super.onActivityResult(i, i2, intent);
        if (CallbackContext.activity == null) {
            CallbackContext.setActivity(this);
        }
        CallbackContext.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((LinearLayout) getLayoutInflater().inflate(ResourceUtils.getRLayout(this, "login_hidden"), null));
        KernelContext.context = getApplicationContext();
        this.f5047a = (LinearLayout) findViewById(ResourceUtils.getIdentifier(this, "id", "login_layout"));
        this.f5047a.setOnClickListener(new a(this));
        this.f5047a.setClickable(false);
        this.f5047a.setLongClickable(false);
        if (!KernelContext.checkServiceValid()) {
            SDKLogger.d("login.LoginActivity", "static field null");
            LoginStatus.resetLoginFlag();
            finish();
            return;
        }
        CallbackContext.setActivity(this);
        SDKLogger.e("login.LoginActivity", "before mtop call showLogin");
        auth();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!KernelContext.checkServiceValid()) {
            finish();
        }
    }
}
