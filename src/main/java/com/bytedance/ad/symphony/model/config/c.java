package com.bytedance.ad.symphony.model.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f7666a = new HashMap();

    public final String a(String str) {
        return this.f7666a.get(str);
    }

    public static c a(JSONArray jSONArray) {
        c cVar = new c();
        if (jSONArray == null) {
            return cVar;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    cVar.f7666a.put(optJSONObject.optString("placement_type"), optJSONObject.optString("fill_strategy"));
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return cVar;
    }
}
