package com.alibaba.sdk.android.httpdns;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class p {
    private boolean enabled = true;

    /* renamed from: f  reason: collision with root package name */
    private String[] f5122f;

    p(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            g.e("Schedule center response:" + jSONObject.toString());
            if (jSONObject.has("service_status")) {
                this.enabled = !jSONObject.getString("service_status").equals("disable");
            }
            if (jSONObject.has("service_ip")) {
                JSONArray jSONArray = jSONObject.getJSONArray("service_ip");
                this.f5122f = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f5122f[i] = (String) jSONArray.get(i);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public String[] c() {
        return this.f5122f;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
