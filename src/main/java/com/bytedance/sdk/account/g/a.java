package com.bytedance.sdk.account.g;

import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.ss.android.common.lib.AppLogNewUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static void a(String str, String str2, String str3, BaseApiResponse baseApiResponse, WeakReference<? extends com.bytedance.sdk.account.api.call.a> weakReference) {
        weakReference.get();
        a(str, str2, str3, baseApiResponse, (JSONObject) null);
    }

    private static void a(String str, String str2, String str3, BaseApiResponse baseApiResponse, JSONObject jSONObject) {
        if (baseApiResponse != null) {
            a(str, str2, str3, baseApiResponse.success, baseApiResponse.error, jSONObject);
            return;
        }
        a(str, str2, str3, false, -1, jSONObject);
    }

    private static void a(String str, String str2, String str3, boolean z, int i, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("platform", str2);
            jSONObject2.put("scene", str3);
            if (z) {
                jSONObject2.put("result", "success");
            } else {
                jSONObject2.put("result", "fail");
                jSONObject2.put("error", i);
            }
            jSONObject2.put("account_sdk_version", 362);
            jSONObject2.put("raw", jSONObject);
            AppLogNewUtils.onEventV3(str, jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
