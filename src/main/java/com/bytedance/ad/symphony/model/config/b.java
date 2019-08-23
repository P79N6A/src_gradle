package com.bytedance.ad.symphony.model.config;

import org.json.JSONObject;

public final class b extends a {
    public String g;

    public b(JSONObject jSONObject) {
        super(jSONObject);
        this.g = jSONObject.optString("size", "");
    }
}
