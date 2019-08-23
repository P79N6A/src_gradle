package com.ss.android.download.api.d;

import org.json.JSONObject;

public final class a {
    public static long a(JSONObject jSONObject, String str) {
        long j;
        if (jSONObject == null) {
            return 0;
        }
        try {
            j = Long.valueOf(jSONObject.optString(str)).longValue();
        } catch (NumberFormatException unused) {
            j = 0;
        }
        return j;
    }
}
