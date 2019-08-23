package com.ss.android.sdk.c.a;

import android.app.Activity;
import org.json.JSONException;
import org.json.JSONObject;

public interface a {
    String getJSSDKConfigUrl();

    String getPlayNameMobile();

    String getSSLocalScheme();

    boolean hasPlatformBinded();

    boolean isApiSuccess(JSONObject jSONObject) throws JSONException;

    boolean isPlatformBinded(String str);

    void startAdsAppActivity(Activity activity, String str);
}
