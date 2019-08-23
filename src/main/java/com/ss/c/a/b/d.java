package com.ss.c.a.b;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f78301a;

    /* renamed from: b  reason: collision with root package name */
    public final String f78302b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f78303c;

    public final String a() {
        JSONObject jSONObject;
        try {
            if (this.f78303c != null) {
                jSONObject = new JSONObject(this.f78303c);
                if (jSONObject != null || !jSONObject.has("VCodec")) {
                    return null;
                }
                String optString = jSONObject.optString("VCodec");
                if (!TextUtils.isEmpty(optString)) {
                    return optString;
                }
                return null;
            }
        } catch (JSONException unused) {
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return null;
    }

    public d(String str, String str2, String str3) {
        this.f78301a = str;
        this.f78303c = str3;
    }
}
