package com.bytedance.article.common.monitor.a;

import android.text.TextUtils;
import org.json.JSONObject;

public final class b {
    public static String a(JSONObject jSONObject) {
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject.optString("update_version_code"))) {
            return jSONObject.optString("update_version_code");
        }
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("app_version"))) {
            return "";
        }
        return jSONObject.optString("app_version");
    }

    public static boolean a(long j, long j2) {
        if (j >= j2 || ((j2 - j) / 1000) / 3600 <= 1) {
            return false;
        }
        return true;
    }
}
