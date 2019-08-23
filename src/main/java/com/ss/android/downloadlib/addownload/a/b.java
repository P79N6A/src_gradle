package com.ss.android.downloadlib.addownload.a;

import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.d.a;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.ugc.aweme.q.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b {
    b() {
    }

    static Map<Long, a> a(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String string = c.a(k.a(), str, 0).getString(str2, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject != null) {
                        linkedHashMap.put(Long.valueOf(next), a.a(optJSONObject));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return linkedHashMap;
    }

    public static void a(String str, String str2, Map<Long, a> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : map.entrySet()) {
                if (next != null) {
                    jSONObject.put(String.valueOf(next.getKey()), ((a) next.getValue()).a());
                }
            }
        } catch (Exception unused) {
        }
        c.a(k.a(), str, 0).edit().putString(str2, jSONObject.toString()).apply();
    }
}
