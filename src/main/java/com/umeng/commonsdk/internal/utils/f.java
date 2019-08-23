package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.q.c;
import com.umeng.commonsdk.internal.utils.a;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONArray;
import org.json.JSONObject;

public class f {
    public static JSONObject a(Context context) {
        SharedPreferences a2 = c.a(context.getApplicationContext(), "info", 0);
        if (a2 == null) {
            return null;
        }
        try {
            String string = a2.getString("blueinfo", null);
            if (string != null) {
                return new JSONObject(string);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void c(Context context) {
        SharedPreferences a2 = c.a(context.getApplicationContext(), "info", 0);
        if (a2 != null) {
            a2.edit().remove("wifiinfo").commit();
        }
    }

    public static String d(Context context) {
        SharedPreferences a2 = c.a(context.getApplicationContext(), "info", 0);
        if (a2 != null) {
            return a2.getString("ua", null);
        }
        return null;
    }

    public static JSONArray b(Context context) {
        try {
            SharedPreferences a2 = c.a(context.getApplicationContext(), "info", 0);
            if (a2 == null) {
                return null;
            }
            String string = a2.getString("wifiinfo", null);
            if (string != null) {
                return new JSONArray(string);
            }
            return null;
        } catch (Exception e2) {
            ULog.e(e2.getMessage());
            return null;
        }
    }

    public static void a(Context context, String str) {
        SharedPreferences a2 = c.a(context.getApplicationContext(), "info", 0);
        if (a2 != null) {
            a2.edit().putString("ua", str).commit();
        }
    }

    public static void a(Context context, Object obj) {
        if (obj != null) {
            try {
                a.b bVar = (a.b) obj;
                SharedPreferences a2 = c.a(context.getApplicationContext(), "info", 0);
                String str = null;
                if (a2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("a_na", bVar.f80753c);
                    jSONObject.put("a_st", bVar.f80752b);
                    jSONObject.put("a_ad", bVar.f80751a);
                    jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                    str = jSONObject.toString();
                }
                if (str != null) {
                    a2.edit().putString("blueinfo", str).commit();
                }
            } catch (Exception e2) {
                ULog.e("saveBluetoothInfo:" + e2.getMessage());
            }
        }
    }

    public static void a(Context context, a.c cVar) {
        JSONArray jSONArray;
        try {
            SharedPreferences a2 = c.a(context.getApplicationContext(), "info", 0);
            String str = null;
            if (a2 != null) {
                String string = a2.getString("wifiinfo", null);
                if (string == null) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(string);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("a_dc", cVar.f80754a);
                jSONObject.put("bssid", cVar.f80755b);
                jSONObject.put("ssid", cVar.f80756c);
                jSONObject.put("a_fcy", cVar.f80757d);
                jSONObject.put("a_hssid", cVar.f80758e);
                jSONObject.put("a_ip", cVar.f80759f);
                jSONObject.put("a_ls", cVar.g);
                jSONObject.put("a_mac", cVar.h);
                jSONObject.put("a_nid", cVar.i);
                jSONObject.put("rssi", cVar.j);
                jSONObject.put("sta", cVar.k);
                jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, cVar.l);
                jSONArray.put(jSONObject);
                str = jSONArray.toString();
            }
            if (str != null) {
                a2.edit().putString("wifiinfo", str).commit();
            }
        } catch (Exception e2) {
            ULog.e(e2.getMessage());
        }
    }
}
