package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.WeiboAuthListener;

public class AuthRequestParam extends BrowserRequestParamBase {
    private AuthInfo mAuthInfo;
    private WeiboAuthListener mAuthListener;
    private String mAuthListenerKey;

    public AuthInfo getAuthInfo() {
        return this.mAuthInfo;
    }

    public WeiboAuthListener getAuthListener() {
        return this.mAuthListener;
    }

    public String getAuthListenerKey() {
        return this.mAuthListenerKey;
    }

    public void setAuthInfo(AuthInfo authInfo) {
        this.mAuthInfo = authInfo;
    }

    public void setAuthListener(WeiboAuthListener weiboAuthListener) {
        this.mAuthListener = weiboAuthListener;
    }

    public AuthRequestParam(Context context) {
        super(context);
        this.mLaucher = BrowserLauncher.AUTH;
    }

    public void onCreateRequestParamBundle(Bundle bundle) {
        if (this.mAuthInfo != null) {
            bundle.putBundle("key_authinfo", this.mAuthInfo.getAuthBundle());
        }
        if (this.mAuthListener != null) {
            WeiboCallbackManager instance = WeiboCallbackManager.getInstance(this.mContext);
            this.mAuthListenerKey = instance.genCallbackKey();
            instance.setWeiboAuthListener(this.mAuthListenerKey, this.mAuthListener);
            bundle.putString("key_listener", this.mAuthListenerKey);
        }
    }

    /* access modifiers changed from: protected */
    public void onSetupRequestParam(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("key_authinfo");
        if (bundle2 != null) {
            this.mAuthInfo = AuthInfo.parseBundleData(this.mContext, bundle2);
        }
        this.mAuthListenerKey = bundle.getString("key_listener");
        if (!TextUtils.isEmpty(this.mAuthListenerKey)) {
            this.mAuthListener = WeiboCallbackManager.getInstance(this.mContext).getWeiboAuthListener(this.mAuthListenerKey);
        }
    }

    public void execRequest(Activity activity, int i) {
        if (i == 3) {
            if (this.mAuthListener != null) {
                this.mAuthListener.onCancel();
            }
            WeiboSdkBrowser.closeBrowser(activity, this.mAuthListenerKey, null);
        }
    }
}
