package com.sina.weibo.sdk.auth.sso;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.WbAppInstallActivator;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.component.AuthRequestParam;
import com.sina.weibo.sdk.component.WeiboSdkBrowser;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.sina.weibo.sdk.utils.NetworkHelper;
import com.sina.weibo.sdk.utils.UIUtils;
import com.sina.weibo.sdk.utils.Utility;

public class WebAuthHandler {
    private static final String TAG = "com.sina.weibo.sdk.auth.sso.WebAuthHandler";
    private AuthInfo mAuthInfo;
    private Context mContext;

    public AuthInfo getAuthInfo() {
        return this.mAuthInfo;
    }

    public void anthorize(WeiboAuthListener weiboAuthListener) {
        authorize(weiboAuthListener, 1);
    }

    public WebAuthHandler(Context context, AuthInfo authInfo) {
        this.mContext = context;
        this.mAuthInfo = authInfo;
    }

    public void authorize(WeiboAuthListener weiboAuthListener, int i) {
        startDialog(weiboAuthListener, i);
        WbAppInstallActivator.getInstance(this.mContext, this.mAuthInfo.getAppKey()).activateWeiboInstall();
    }

    private void startDialog(WeiboAuthListener weiboAuthListener, int i) {
        if (weiboAuthListener != null) {
            WeiboParameters weiboParameters = new WeiboParameters(this.mAuthInfo.getAppKey());
            weiboParameters.put("client_id", this.mAuthInfo.getAppKey());
            weiboParameters.put("redirect_uri", this.mAuthInfo.getRedirectUrl());
            weiboParameters.put("scope", this.mAuthInfo.getScope());
            weiboParameters.put("response_type", "code");
            weiboParameters.put("version", "0030105000");
            String aid = Utility.getAid(this.mContext, this.mAuthInfo.getAppKey());
            if (!TextUtils.isEmpty(aid)) {
                weiboParameters.put("aid", aid);
            }
            if (1 == i) {
                weiboParameters.put("packagename", this.mAuthInfo.getPackageName());
                weiboParameters.put("key_hash", this.mAuthInfo.getKeyHash());
            }
            String str = "https://open.weibo.cn/oauth2/authorize?" + weiboParameters.encodeUrl();
            if (!NetworkHelper.hasInternetPermission(this.mContext)) {
                UIUtils.showAlert(this.mContext, "Error", "Application requires permission to access the Internet");
                return;
            }
            AuthRequestParam authRequestParam = new AuthRequestParam(this.mContext);
            authRequestParam.setAuthInfo(this.mAuthInfo);
            authRequestParam.setAuthListener(weiboAuthListener);
            authRequestParam.setUrl(str);
            authRequestParam.setSpecifyTitle("微博登录");
            Bundle createRequestParamBundle = authRequestParam.createRequestParamBundle();
            Intent intent = new Intent(this.mContext, WeiboSdkBrowser.class);
            intent.putExtras(createRequestParamBundle);
            this.mContext.startActivity(intent);
        }
    }
}
