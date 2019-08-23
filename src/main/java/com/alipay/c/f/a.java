package com.alipay.c.f;

import android.content.Context;
import org.json.JSONObject;

public final class a {
    public static synchronized b a() {
        synchronized (a.class) {
            String a2 = com.alipay.c.h.a.a("wxcasxx_v3", "wxcasxx");
            if (com.alipay.d.a.a.a.a.a(a2)) {
                return null;
            }
            b a3 = a(a2);
            return a3;
        }
    }

    private static b a(String str) {
        try {
            if (com.alipay.d.a.a.a.a.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
        } catch (Exception e2) {
            com.alipay.c.c.a.a((Throwable) e2);
            return null;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            com.alipay.c.h.a.a(context, "vkeyid_profiles_v3", "deviceid", "");
            com.alipay.c.h.a.a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    public static synchronized void a(Context context, b bVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.f5319a);
                jSONObject.put("deviceInfoHash", bVar.f5320b);
                jSONObject.put("timestamp", bVar.f5321c);
                String jSONObject2 = jSONObject.toString();
                com.alipay.c.h.a.a(context, "vkeyid_profiles_v3", "deviceid", jSONObject2);
                com.alipay.c.h.a.a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Exception e2) {
                com.alipay.c.c.a.a((Throwable) e2);
            }
        }
    }

    public static synchronized b b(Context context) {
        b a2;
        synchronized (a.class) {
            String a3 = com.alipay.c.h.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (com.alipay.d.a.a.a.a.a(a3)) {
                a3 = com.alipay.c.h.a.a("wxcasxx_v3", "wxcasxx");
            }
            a2 = a(a3);
        }
        return a2;
    }

    public static synchronized b c(Context context) {
        synchronized (a.class) {
            String a2 = com.alipay.c.h.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (com.alipay.d.a.a.a.a.a(a2)) {
                return null;
            }
            b a3 = a(a2);
            return a3;
        }
    }
}
