package com.alimama.tunion.sdk.service;

import android.app.Activity;
import android.content.Intent;
import com.alimama.tunion.sdk.login.TUnionLoginAuthCallback;
import com.alimama.tunion.sdk.login.TUnionLoginCallback;
import com.alimama.tunion.trade.base.ITUnionWebView;

public interface ITUnionLoginService extends ITUnionService {
    String getAvatarUrl();

    String getNick();

    boolean isLogin();

    boolean isLoginUrl(String str);

    boolean isLogoutUrl(String str);

    void logout(Activity activity, TUnionLoginCallback tUnionLoginCallback);

    boolean onActivityResult(int i, int i2, Intent intent);

    boolean shouldOverrideUrlLoading(Activity activity, ITUnionWebView iTUnionWebView, String str);

    void showLogin(Activity activity, TUnionLoginAuthCallback tUnionLoginAuthCallback);
}
