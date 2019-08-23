package com.ali.auth.third.login;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ali.auth.third.core.WebViewProxy;
import com.ali.auth.third.core.callback.LoginCallback;
import com.ali.auth.third.core.callback.RefreshCookieCallback;
import com.ali.auth.third.core.config.ConfigManager;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.cookies.CookieManagerWrapper;
import com.ali.auth.third.core.model.Session;
import com.ali.auth.third.core.service.UserTrackerService;
import com.ali.auth.third.core.service.impl.CredentialManager;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.CommonUtils;
import com.ali.auth.third.core.util.ResourceUtils;
import com.ali.auth.third.login.callback.LogoutCallback;
import com.ali.auth.third.login.task.LoginByReTokenTask;
import com.ali.auth.third.login.task.LogoutTask;
import com.ali.auth.third.login.util.LoginStatus;
import com.ali.auth.third.ui.LoginActivity;
import com.ali.auth.third.ui.context.CallbackContext;
import java.util.HashMap;
import java.util.regex.Pattern;

public class LoginServiceImpl implements LoginService {

    /* renamed from: a  reason: collision with root package name */
    private transient Pattern[] f5004a;

    /* renamed from: b  reason: collision with root package name */
    private transient Pattern[] f5005b;

    class a extends AsyncTask<Object, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        RefreshCookieCallback f5006a;

        a(RefreshCookieCallback refreshCookieCallback) {
            this.f5006a = refreshCookieCallback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Object... objArr) {
            CookieManagerWrapper.INSTANCE.refreshCookie();
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            this.f5006a.onSuccess();
        }
    }

    public void auth(Activity activity, LoginCallback loginCallback) {
        SDKLogger.d("login", "auth start");
        auth(loginCallback);
    }

    public void auth(LoginCallback loginCallback) {
        if (!KernelContext.checkServiceValid()) {
            SDKLogger.d("login", "auth static field is null");
            if (loginCallback != null) {
                loginCallback.onFailure(10098, "NullPointException");
            }
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("withNoActivity", "true");
            ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send("auth".toUpperCase(), hashMap);
        } catch (Exception unused) {
        }
        if (LoginStatus.compareAndSetLogining(false, true)) {
            if (!CommonUtils.isNetworkAvailable()) {
                SDKLogger.d("login", "auth network not available");
                loginCallback.onFailure(10099, ResourceUtils.getString("com_taobao_tae_sdk_network_not_available_message"));
                LoginStatus.resetLoginFlag();
            } else if (TextUtils.isEmpty(CredentialManager.INSTANCE.getInternalSession().autoLoginToken) || CredentialManager.INSTANCE.getInternalSession().user == null || TextUtils.isEmpty(CredentialManager.INSTANCE.getInternalSession().user.userId)) {
                goLogin(loginCallback);
            } else {
                SDKLogger.d("login", "auth auto login");
                new LoginByReTokenTask(null, new b(this, loginCallback)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        }
    }

    public boolean checkSessionValid() {
        return com.ali.auth.third.login.a.a.f5012b.isSessionValid();
    }

    public Session getSession() {
        return com.ali.auth.third.login.a.a.f5012b.getSession();
    }

    public void goLogin(LoginCallback loginCallback) {
        SDKLogger.d("login", "auth goLogin");
        CallbackContext.loginCallback = loginCallback;
        Intent intent = new Intent();
        intent.setClass(KernelContext.getApplicationContext(), LoginActivity.class);
        intent.setFlags(268435456);
        KernelContext.getApplicationContext().startActivity(intent);
    }

    public boolean isLoginUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f5004a == null && !TextUtils.isEmpty(ConfigManager.LOGIN_URLS)) {
            String[] split = ConfigManager.LOGIN_URLS.split("[,]");
            this.f5004a = new Pattern[split.length];
            int length = this.f5004a.length;
            for (int i = 0; i < length; i++) {
                this.f5004a[i] = Pattern.compile(split[i]);
            }
        }
        for (Pattern matcher : this.f5004a) {
            if (matcher.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public boolean isLogoutUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f5005b == null && !TextUtils.isEmpty(ConfigManager.LOGOUT_URLS)) {
            String[] split = ConfigManager.LOGOUT_URLS.split("[,]");
            this.f5005b = new Pattern[split.length];
            int length = this.f5005b.length;
            for (int i = 0; i < length; i++) {
                this.f5005b[i] = Pattern.compile(split[i]);
            }
        }
        for (Pattern matcher : this.f5005b) {
            if (matcher.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public void logout(Activity activity, LogoutCallback logoutCallback) {
        ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send("logout".toUpperCase(), null);
        new LogoutTask(activity, logoutCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void logout(LogoutCallback logoutCallback) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("withNoActivity", "true");
            ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send("logout".toUpperCase(), hashMap);
        } catch (Exception unused) {
        }
        logout(null, logoutCallback);
    }

    public void refreshCookie(RefreshCookieCallback refreshCookieCallback) {
        new a(refreshCookieCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }

    public void setLoginCallback(LoginCallback loginCallback) {
        CallbackContext.mGlobalLoginCallback = loginCallback;
    }

    public void setWebViewProxy(WebViewProxy webViewProxy) {
        KernelContext.mWebViewProxy = webViewProxy;
    }
}
