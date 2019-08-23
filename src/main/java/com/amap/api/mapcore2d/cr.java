package com.amap.api.mapcore2d;

import android.content.Context;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class cr {

    /* renamed from: a  reason: collision with root package name */
    public static int f5877a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static String f5878b = "";

    /* renamed from: c  reason: collision with root package name */
    private static cy f5879c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f5880d = "http://apiinit.amap.com/v3/log/init";

    /* renamed from: e  reason: collision with root package name */
    private static String f5881e;

    private static String a() {
        return f5880d;
    }

    public static void a(String str) {
        cp.a(str);
    }

    private static Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("resType", "json");
            hashMap.put("encode", "UTF-8");
            String a2 = cs.a();
            hashMap.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, a2);
            hashMap.put("key", cp.f(context));
            hashMap.put("scode", cs.a(context, a2, cz.d("resType=json&encode=UTF-8&key=" + cp.f(context))));
        } catch (Throwable th) {
            dd.a(th, "Auth", "gParams");
        }
        return hashMap;
    }

    private static boolean a(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(cz.a(bArr));
            if (jSONObject.has("status")) {
                int i = jSONObject.getInt("status");
                if (i == 1) {
                    f5877a = 1;
                } else if (i == 0) {
                    f5877a = 0;
                }
            }
            if (jSONObject.has("info")) {
                f5878b = jSONObject.getString("info");
            }
            if (f5877a == 1) {
                return true;
            }
            return false;
        } catch (JSONException e2) {
            dd.a((Throwable) e2, "Auth", "lData");
            return false;
        } catch (Throwable th) {
            dd.a(th, "Auth", "lData");
            return false;
        }
    }

    @Deprecated
    public static synchronized boolean a(Context context, cy cyVar) {
        boolean a2;
        synchronized (cr.class) {
            a2 = a(context, cyVar, false);
        }
        return a2;
    }

    private static boolean a(Context context, cy cyVar, boolean z) {
        f5879c = cyVar;
        try {
            String a2 = a();
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
            hashMap.put("Accept-Encoding", "gzip");
            hashMap.put("Connection", "Keep-Alive");
            hashMap.put("User-Agent", f5879c.d());
            hashMap.put("X-INFO", cs.a(context, f5879c, null, z));
            hashMap.put("logversion", "2.1");
            hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", new Object[]{f5879c.b(), f5879c.a()}));
            ep a3 = ep.a();
            da daVar = new da();
            daVar.a(cw.a(context));
            daVar.a((Map<String, String>) hashMap);
            daVar.b(a(context));
            daVar.a(a2);
            return a(a3.a(daVar));
        } catch (Throwable th) {
            dd.a(th, "Auth", "getAuth");
            return true;
        }
    }
}
