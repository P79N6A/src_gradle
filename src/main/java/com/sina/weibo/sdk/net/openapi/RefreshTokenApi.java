package com.sina.weibo.sdk.net.openapi;

import android.content.Context;
import com.sina.weibo.sdk.net.AsyncWeiboRunner;
import com.sina.weibo.sdk.net.RequestListener;
import com.sina.weibo.sdk.net.WeiboParameters;

public class RefreshTokenApi {
    private Context mContext;

    public static RefreshTokenApi create(Context context) {
        return new RefreshTokenApi(context);
    }

    private RefreshTokenApi(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void refreshToken(String str, String str2, RequestListener requestListener) {
        WeiboParameters weiboParameters = new WeiboParameters(str);
        weiboParameters.put("client_id", str);
        weiboParameters.put("grant_type", "refresh_token");
        weiboParameters.put("refresh_token", str2);
        new AsyncWeiboRunner(this.mContext).requestAsync("https://api.weibo.com/oauth2/access_token", weiboParameters, "POST", requestListener);
    }
}
