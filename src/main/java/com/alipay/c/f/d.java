package com.alipay.c.f;

import android.content.Context;
import com.alipay.c.h.a;
import org.json.JSONObject;

public final class d {
    public static synchronized c a() {
        synchronized (d.class) {
            String a2 = a.a("wxcasxx_v4", "key_wxcasxx_v4");
            if (com.alipay.d.a.a.a.a.a(a2)) {
                return null;
            }
            c a3 = a(a2);
            return a3;
        }
    }

    private static c a(String str) {
        try {
            if (com.alipay.d.a.a.a.a.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            c cVar = new c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString("utdid"));
            return cVar;
        } catch (Exception e2) {
            com.alipay.c.c.a.a((Throwable) e2);
            return null;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (d.class) {
            a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            a.a("wxcasxx_v4", "key_wxcasxx_v4", "");
        }
    }

    public static synchronized void a(Context context, c cVar) {
        synchronized (d.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", cVar.f5322a);
                jSONObject.put("deviceInfoHash", cVar.f5323b);
                jSONObject.put("timestamp", cVar.f5324c);
                jSONObject.put("tid", cVar.f5325d);
                jSONObject.put("utdid", cVar.f5326e);
                String jSONObject2 = jSONObject.toString();
                a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject2);
                a.a("wxcasxx_v4", "key_wxcasxx_v4", jSONObject2);
            } catch (Exception e2) {
                com.alipay.c.c.a.a((Throwable) e2);
            }
        }
    }

    public static synchronized c b(Context context) {
        c a2;
        synchronized (d.class) {
            String a3 = a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (com.alipay.d.a.a.a.a.a(a3)) {
                a3 = a.a("wxcasxx_v4", "key_wxcasxx_v4");
            }
            a2 = a(a3);
        }
        return a2;
    }

    public static synchronized c c(Context context) {
        synchronized (d.class) {
            String a2 = a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (com.alipay.d.a.a.a.a.a(a2)) {
                return null;
            }
            c a3 = a(a2);
            return a3;
        }
    }
}
