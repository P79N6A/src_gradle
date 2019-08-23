package com.sina.weibo.sdk.auth.sso;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sina.a.a;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.exception.WeiboDialogException;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.utils.AidTask;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.SecurityHelper;
import com.sina.weibo.sdk.utils.Utility;

public class SsoHandler {
    public Activity mAuthActivity;
    private AuthInfo mAuthInfo;
    public WeiboAuthListener mAuthListener;
    public ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
            SsoHandler.this.mWebAuthHandler.anthorize(SsoHandler.this.mAuthListener);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a aVar;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.sina.sso.RemoteSSO");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                    aVar = new a.C0317a.C0318a(iBinder);
                } else {
                    aVar = (a) queryLocalInterface;
                }
            }
            try {
                String a2 = aVar.a();
                String b2 = aVar.b();
                SsoHandler.this.mAuthActivity.getApplicationContext().unbindService(SsoHandler.this.mConnection);
                if (!SsoHandler.this.startSingleSignOn(a2, b2)) {
                    SsoHandler.this.mWebAuthHandler.anthorize(SsoHandler.this.mAuthListener);
                }
            } catch (RemoteException unused) {
            }
        }
    };
    private int mSSOAuthRequestCode;
    public WebAuthHandler mWebAuthHandler;
    private WeiboAppManager.WeiboInfo mWeiboInfo;

    enum AuthType {
        ALL,
        SsoOnly,
        WebOnly
    }

    public boolean isWeiboAppInstalled() {
        if (this.mWeiboInfo == null || !this.mWeiboInfo.isLegal()) {
            return false;
        }
        return true;
    }

    public void authorize(WeiboAuthListener weiboAuthListener) {
        authorize(32973, weiboAuthListener, AuthType.ALL);
    }

    public void authorizeClientSso(WeiboAuthListener weiboAuthListener) {
        authorize(32973, weiboAuthListener, AuthType.SsoOnly);
    }

    public void authorizeWeb(WeiboAuthListener weiboAuthListener) {
        authorize(32973, weiboAuthListener, AuthType.WebOnly);
    }

    private boolean bindRemoteSSOService(Context context) {
        if (!isWeiboAppInstalled()) {
            return false;
        }
        String packageName = this.mWeiboInfo.getPackageName();
        Intent intent = new Intent("com.sina.weibo.remotessoservice");
        intent.setPackage(packageName);
        return context.bindService(intent, this.mConnection, 1);
    }

    public SsoHandler(Activity activity, AuthInfo authInfo) {
        this.mAuthActivity = activity;
        this.mAuthInfo = authInfo;
        this.mWebAuthHandler = new WebAuthHandler(activity, authInfo);
        this.mWeiboInfo = WeiboAppManager.getInstance(activity).getWeiboInfo();
        AidTask.getInstance(this.mAuthActivity).aidTaskInit(authInfo.getAppKey());
    }

    public static ComponentName isServiceExisted(Context context, String str) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningServices(Integer.MAX_VALUE)) {
            ComponentName componentName = runningServiceInfo.service;
            if (componentName.getPackageName().equals(str)) {
                String className = componentName.getClassName();
                if (className.equals(String.valueOf(str) + ".business.RemoteSSOService")) {
                    return componentName;
                }
            }
        }
        return null;
    }

    public boolean startSingleSignOn(String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(str, str2);
        intent.putExtras(this.mWebAuthHandler.getAuthInfo().getAuthBundle());
        intent.putExtra("_weibo_command_type", 3);
        intent.putExtra("_weibo_transaction", String.valueOf(System.currentTimeMillis()));
        intent.putExtra("aid", Utility.getAid(this.mAuthActivity, this.mAuthInfo.getAppKey()));
        boolean z = false;
        if (!SecurityHelper.validateAppSignatureForIntent(this.mAuthActivity, intent)) {
            return false;
        }
        String aid = Utility.getAid(this.mAuthActivity, this.mAuthInfo.getAppKey());
        if (!TextUtils.isEmpty(aid)) {
            intent.putExtra("aid", aid);
        }
        try {
            this.mAuthActivity.startActivityForResult(intent, this.mSSOAuthRequestCode);
            z = true;
        } catch (ActivityNotFoundException unused) {
        }
        return z;
    }

    private void authorize(int i, WeiboAuthListener weiboAuthListener, AuthType authType) {
        boolean z;
        this.mSSOAuthRequestCode = i;
        this.mAuthListener = weiboAuthListener;
        if (authType == AuthType.SsoOnly) {
            z = true;
        } else {
            z = false;
        }
        if (authType == AuthType.WebOnly) {
            if (weiboAuthListener != null) {
                this.mWebAuthHandler.anthorize(weiboAuthListener);
            }
            return;
        }
        if (!bindRemoteSSOService(this.mAuthActivity.getApplicationContext())) {
            if (!z) {
                this.mWebAuthHandler.anthorize(this.mAuthListener);
            } else if (this.mAuthListener != null) {
                this.mAuthListener.onWeiboException(new WeiboException("not install weibo client!!!!!"));
            }
        }
    }

    public void authorizeCallBack(int i, int i2, Intent intent) {
        LogUtil.d("Weibo_SSO_login", "requestCode: " + i + ", resultCode: " + i2 + ", data: " + intent);
        if (i == this.mSSOAuthRequestCode) {
            if (i2 == -1) {
                if (SecurityHelper.checkResponseAppLegal(this.mAuthActivity, this.mWeiboInfo, intent)) {
                    String stringExtra = intent.getStringExtra("error");
                    if (stringExtra == null) {
                        stringExtra = intent.getStringExtra("error_type");
                    }
                    if (stringExtra == null) {
                        Bundle extras = intent.getExtras();
                        Oauth2AccessToken parseAccessToken = Oauth2AccessToken.parseAccessToken(extras);
                        if (parseAccessToken == null || !parseAccessToken.isSessionValid()) {
                            LogUtil.d("Weibo_SSO_login", "Failed to receive access token by SSO");
                            this.mWebAuthHandler.anthorize(this.mAuthListener);
                            return;
                        }
                        LogUtil.d("Weibo_SSO_login", "Login Success! " + parseAccessToken.toString());
                        this.mAuthListener.onComplete(extras);
                    } else if (stringExtra.equals("access_denied") || stringExtra.equals("OAuthAccessDeniedException")) {
                        LogUtil.d("Weibo_SSO_login", "Login canceled by user.");
                        this.mAuthListener.onCancel();
                    } else {
                        String stringExtra2 = intent.getStringExtra("error_description");
                        if (stringExtra2 != null) {
                            stringExtra = String.valueOf(stringExtra) + ":" + stringExtra2;
                        }
                        LogUtil.d("Weibo_SSO_login", "Login failed: ".concat(String.valueOf(stringExtra)));
                        this.mAuthListener.onWeiboException(new WeiboDialogException(stringExtra, i2, stringExtra2));
                    }
                }
            } else if (i2 == 0) {
                if (intent != null) {
                    LogUtil.d("Weibo_SSO_login", "Login failed: " + intent.getStringExtra("error"));
                    this.mAuthListener.onWeiboException(new WeiboDialogException(intent.getStringExtra("error"), intent.getIntExtra("error_code", -1), intent.getStringExtra("failing_url")));
                    return;
                }
                LogUtil.d("Weibo_SSO_login", "Login canceled by user.");
                this.mAuthListener.onCancel();
            }
        }
    }
}
