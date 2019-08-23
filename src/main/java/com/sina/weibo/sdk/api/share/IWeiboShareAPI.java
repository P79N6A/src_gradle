package com.sina.weibo.sdk.api.share;

import android.app.Activity;
import android.content.Intent;
import com.sina.weibo.sdk.api.share.IWeiboHandler;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.WeiboAuthListener;

public interface IWeiboShareAPI {
    int getWeiboAppSupportAPI();

    boolean handleWeiboRequest(Intent intent, IWeiboHandler.Request request);

    boolean handleWeiboResponse(Intent intent, IWeiboHandler.Response response);

    boolean isSupportWeiboPay();

    boolean isWeiboAppInstalled();

    boolean isWeiboAppSupportAPI();

    boolean launchWeibo(Activity activity);

    boolean launchWeiboPay(Activity activity, String str);

    boolean registerApp();

    boolean sendRequest(Activity activity, BaseRequest baseRequest);

    boolean sendRequest(Activity activity, BaseRequest baseRequest, AuthInfo authInfo, String str, WeiboAuthListener weiboAuthListener);

    boolean sendResponse(BaseResponse baseResponse);
}