package com.bytedance.apm.agent.b;

import com.bytedance.apm.b;
import org.json.JSONObject;

public final class a {
    public static void a(String str, String str2, JSONObject jSONObject) {
        b.a(str, str2, jSONObject);
    }

    public static void a(final String str, final String str2, final long j) {
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str2, j);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", str);
                    try {
                        b.a("page_load", "page_load", jSONObject, jSONObject2, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b.b(str, jSONObject, jSONObject2, jSONObject3);
    }
}
