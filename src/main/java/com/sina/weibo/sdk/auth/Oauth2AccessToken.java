package com.sina.weibo.sdk.auth;

import android.os.Bundle;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class Oauth2AccessToken {
    private String mAccessToken = "";
    private long mExpiresTime;
    private String mRefreshToken = "";
    private String mUid = "";

    public long getExpiresTime() {
        return this.mExpiresTime;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getToken() {
        return this.mAccessToken;
    }

    public String getUid() {
        return this.mUid;
    }

    public Oauth2AccessToken() {
    }

    public boolean isSessionValid() {
        if (TextUtils.isEmpty(this.mAccessToken)) {
            return false;
        }
        return true;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("uid", this.mUid);
        bundle.putString("access_token", this.mAccessToken);
        bundle.putString("refresh_token", this.mRefreshToken);
        bundle.putString("expires_in", Long.toString(this.mExpiresTime));
        return bundle;
    }

    public String toString() {
        return "uid: " + this.mUid + ", access_token" + ": " + this.mAccessToken + ", refresh_token" + ": " + this.mRefreshToken + ", expires_in" + ": " + Long.toString(this.mExpiresTime);
    }

    public void setExpiresTime(long j) {
        this.mExpiresTime = j;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public void setToken(String str) {
        this.mAccessToken = str;
    }

    public void setUid(String str) {
        this.mUid = str;
    }

    public void setExpiresIn(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(PushConstants.PUSH_TYPE_NOTIFY)) {
            setExpiresTime(System.currentTimeMillis() + (Long.parseLong(str) * 1000));
        }
    }

    public static Oauth2AccessToken parseAccessToken(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
        oauth2AccessToken.setUid(getString(bundle, "uid", ""));
        oauth2AccessToken.setToken(getString(bundle, "access_token", ""));
        oauth2AccessToken.setExpiresIn(getString(bundle, "expires_in", ""));
        oauth2AccessToken.setRefreshToken(getString(bundle, "refresh_token", ""));
        return oauth2AccessToken;
    }

    @Deprecated
    public Oauth2AccessToken(String str) {
        if (str != null && str.indexOf("{") >= 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                setUid(jSONObject.optString("uid"));
                setToken(jSONObject.optString("access_token"));
                setExpiresIn(jSONObject.optString("expires_in"));
                setRefreshToken(jSONObject.optString("refresh_token"));
            } catch (JSONException unused) {
            }
        }
    }

    public static Oauth2AccessToken parseAccessToken(String str) {
        if (!TextUtils.isEmpty(str) && str.indexOf("{") >= 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
                oauth2AccessToken.setUid(jSONObject.optString("uid"));
                oauth2AccessToken.setToken(jSONObject.optString("access_token"));
                oauth2AccessToken.setExpiresIn(jSONObject.optString("expires_in"));
                oauth2AccessToken.setRefreshToken(jSONObject.optString("refresh_token"));
                return oauth2AccessToken;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public Oauth2AccessToken(String str, String str2) {
        this.mAccessToken = str;
        this.mExpiresTime = System.currentTimeMillis();
        if (str2 != null) {
            this.mExpiresTime += Long.parseLong(str2) * 1000;
        }
    }

    private static String getString(Bundle bundle, String str, String str2) {
        if (bundle == null) {
            return str2;
        }
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        return str2;
    }
}
