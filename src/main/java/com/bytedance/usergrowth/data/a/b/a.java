package com.bytedance.usergrowth.data.a.b;

import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static JSONObject a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, str2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
