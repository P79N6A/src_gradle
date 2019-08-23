package com.ss.c.a.b;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private String f78299a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f78300b;

    public c(JSONObject jSONObject) {
        this.f78299a = jSONObject.optString("Stream");
        try {
            this.f78300b = jSONObject.getJSONObject("PlayUrl");
        } catch (JSONException unused) {
        }
    }

    public final boolean a(String str) {
        JSONArray jSONArray;
        try {
            jSONArray = this.f78300b.getJSONArray("Main");
        } catch (JSONException unused) {
            jSONArray = null;
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (((JSONObject) jSONArray.opt(i)).optString("Size").equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private String a(String str, String str2, String str3) {
        JSONArray jSONArray;
        if (!a(str)) {
            return null;
        }
        try {
            jSONArray = this.f78300b.getJSONArray(str3);
        } catch (JSONException unused) {
            jSONArray = null;
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                if (jSONObject.optString("Size").equals(str)) {
                    return jSONObject.optJSONObject("Url").optString(str2);
                }
            }
        }
        return null;
    }

    public final String a(int i, String str, String str2) {
        switch (i) {
            case 0:
                return a("origin", str, str2);
            case 1:
                return a("hd", str, str2);
            case 2:
                return a("sd", str, str2);
            case 3:
                return a("ld", str, str2);
            default:
                return null;
        }
    }
}
