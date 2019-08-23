package com.bytedance.common.utility;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {
    public static void optPut(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && !StringUtils.isEmpty(str)) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }

    public static boolean queryBoolean(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || StringUtils.isEmpty(str) || !jSONObject.has(str)) {
            return z;
        }
        return jSONObject.optBoolean(str, z);
    }

    public static int queryInt(JSONObject jSONObject, String str, int i) {
        if (jSONObject == null || StringUtils.isEmpty(str) || !jSONObject.has(str)) {
            return i;
        }
        return jSONObject.optInt(str, i);
    }

    public static long queryLong(JSONObject jSONObject, String str, long j) {
        if (jSONObject == null || StringUtils.isEmpty(str) || !jSONObject.has(str)) {
            return j;
        }
        return jSONObject.optLong(str, j);
    }

    public static String queryString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || StringUtils.isEmpty(str) || !jSONObject.has(str)) {
            return str2;
        }
        return jSONObject.optString(str, str2);
    }
}
