package com.meizu.cloud.pushsdk.a.a;

import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private int f26841a;

    /* renamed from: b  reason: collision with root package name */
    private String f26842b;

    public c(int i, String str) {
        this.f26841a = i;
        this.f26842b = str;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.f26841a);
            jSONObject.put("body", this.f26842b);
        } catch (JSONException unused) {
        }
        return "[NetResponse] " + jSONObject.toString();
    }
}
