package com.sina.weibo.sdk.auth;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.utils.Utility;

public class AuthInfo {
    private String mAppKey = "";
    private String mKeyHash = "";
    private String mPackageName = "";
    private String mRedirectUrl = "";
    private String mScope = "";

    public String getAppKey() {
        return this.mAppKey;
    }

    public String getKeyHash() {
        return this.mKeyHash;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getRedirectUrl() {
        return this.mRedirectUrl;
    }

    public String getScope() {
        return this.mScope;
    }

    public Bundle getAuthBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("appKey", this.mAppKey);
        bundle.putString("redirectUri", this.mRedirectUrl);
        bundle.putString("scope", this.mScope);
        bundle.putString("packagename", this.mPackageName);
        bundle.putString("key_hash", this.mKeyHash);
        return bundle;
    }

    public static AuthInfo parseBundleData(Context context, Bundle bundle) {
        return new AuthInfo(context, bundle.getString("appKey"), bundle.getString("redirectUri"), bundle.getString("scope"));
    }

    public AuthInfo(Context context, String str, String str2, String str3) {
        this.mAppKey = str;
        this.mRedirectUrl = str2;
        this.mScope = str3;
        this.mPackageName = context.getPackageName();
        this.mKeyHash = Utility.getSign(context, this.mPackageName);
    }
}
