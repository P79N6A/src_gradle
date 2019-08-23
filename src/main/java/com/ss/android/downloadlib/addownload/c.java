package com.ss.android.downloadlib.addownload;

import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c {
    c() {
    }

    static Map<String, b.a> a(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String string = com.ss.android.ugc.aweme.q.c.a(k.a(), str, 0).getString(str2, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject != null) {
                        linkedHashMap.put(next, b.a.a(optJSONObject));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return linkedHashMap;
    }

    public static void a(String str, String str2, Map<String, b.a> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : map.entrySet()) {
                if (next != null) {
                    jSONObject.put((String) next.getKey(), ((b.a) next.getValue()).a());
                }
            }
        } catch (Exception unused) {
        }
        com.ss.android.ugc.aweme.q.c.a(k.a(), str, 0).edit().putString(str2, jSONObject.toString()).apply();
    }
}
