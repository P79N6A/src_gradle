package com.alipay.c.f;

import android.content.Context;
import com.alipay.c.h.a;
import org.json.JSONObject;

public final class e {
    public static f a(Context context) {
        if (context == null) {
            return null;
        }
        String a2 = a.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (com.alipay.d.a.a.a.a.a(a2)) {
            a2 = a.a("device_feature_file_name", "device_feature_file_key");
        }
        if (com.alipay.d.a.a.a.a.a(a2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2);
            f fVar = new f();
            fVar.f5327a = jSONObject.getString("imei");
            fVar.f5328b = jSONObject.getString("imsi");
            fVar.f5329c = jSONObject.getString("mac");
            fVar.f5330d = jSONObject.getString("bluetoothmac");
            fVar.f5331e = jSONObject.getString("gsi");
            return fVar;
        } catch (Exception e2) {
            com.alipay.c.c.a.a((Throwable) e2);
            return null;
        }
    }
}
