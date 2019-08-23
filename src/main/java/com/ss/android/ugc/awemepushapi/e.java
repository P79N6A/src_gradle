package com.ss.android.ugc.awemepushapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

public interface e {
    boolean filterAppNotify(String str);

    String filterUrl(Context context, String str);

    boolean forbidShowPushNotification();

    boolean getAllowNetwork();

    Intent getAppNotifyIntent(Context context, int i, int i2, JSONObject jSONObject, boolean z);

    String getBaseHost();

    String getDefaultUninstallQuestionUrl();

    Intent getProfileAddFriendIntent(Context context);

    Intent getProfileFanFriendIntent(Context context);

    int getPushDelayDuration();

    int getScreenOnPushMaxSize();

    int getScreenOnPushWaitTime();

    String getSessionKey();

    Intent getUserProfileIntent(Context context, long j, String str, String str2, String str3);

    void interceptAppNotifyUrl(String str, boolean z);

    boolean isAppBackground();

    boolean isAppNotActive();

    boolean isLowPushWhenActive();

    boolean isSelfScheme(String str);

    boolean isSplashActivity(Activity activity);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);

    void reportReceiveOpenUrl(String str);

    void setMainObserver(f fVar);

    String tryConvertScheme(String str);

    boolean tryShowNotifyDialog(String str, String str2, String str3, Intent intent, int i);
}
