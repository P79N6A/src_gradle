package com.monitor.cloudmessage.e;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    public static String a(HashMap<String, String> hashMap) {
        JSONObject jSONObject = new JSONObject();
        if (hashMap != null) {
            try {
                for (String next : hashMap.keySet()) {
                    jSONObject.put(next, hashMap.get(next));
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject.toString();
    }

    public static JSONObject a(Map<String, List<String>> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getKey() == null) {
                        jSONObject.put("Response", next.getValue());
                    } else {
                        jSONObject.put(next.getKey().toString(), next.getValue());
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }
}
