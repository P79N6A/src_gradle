package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.w;
import java.lang.reflect.Method;
import org.json.JSONObject;

public class bd {

    /* renamed from: f  reason: collision with root package name */
    private static String f80426f;
    private static Context g;

    /* renamed from: d  reason: collision with root package name */
    private final String f80427d = "a_start_time";

    /* renamed from: e  reason: collision with root package name */
    private final String f80428e = "a_end_time";

    public static String a() {
        return g(g);
    }

    private void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("session_start_time");
        edit.remove("session_end_time");
        edit.remove("a_start_time");
        edit.remove("a_end_time");
        edit.commit();
    }

    public static String g(Context context) {
        if (f80426f == null) {
            f80426f = ba.a(context).getString("session_id", null);
        }
        return f80426f;
    }

    public String b(Context context) {
        String c2 = bv.c(context);
        String appkey = AnalyticsConfig.getAppkey(context);
        long currentTimeMillis = System.currentTimeMillis();
        if (appkey != null) {
            String a2 = bw.a(currentTimeMillis + appkey + c2);
            f80426f = a2;
            return a2;
        }
        throw new RuntimeException("Appkey is null or empty, Please check AndroidManifest.xml");
    }

    public void d(Context context) {
        SharedPreferences a2 = ba.a(context);
        if (a2 != null) {
            if (a2.getLong("a_start_time", 0) != 0 || !AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = a2.edit();
                edit.putLong("a_start_time", 0);
                edit.putLong("a_end_time", currentTimeMillis);
                edit.putLong("session_end_time", currentTimeMillis);
                edit.commit();
                return;
            }
            by.e("onPause called before onResume");
        }
    }

    private boolean b(SharedPreferences sharedPreferences) {
        long j = sharedPreferences.getLong("a_start_time", 0);
        long j2 = sharedPreferences.getLong("a_end_time", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (j != 0 && currentTimeMillis - j < AnalyticsConfig.kContinueSessionMillis) {
            by.e("onResume called before onPause");
            return false;
        } else if (currentTimeMillis - j2 <= AnalyticsConfig.kContinueSessionMillis) {
            return false;
        } else {
            String a2 = a();
            if (!TextUtils.isEmpty(a2)) {
                long j3 = sharedPreferences.getLong("session_end_time", 0);
                if (j3 == 0) {
                    j3 = System.currentTimeMillis();
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("__f", j3);
                    w.a(g).a(a2, jSONObject, w.a.END);
                } catch (Throwable unused) {
                }
            }
            return true;
        }
    }

    public boolean e(Context context) {
        SharedPreferences a2 = ba.a(context);
        boolean z = false;
        if (a2 == null || a2.getString("session_id", null) == null) {
            return false;
        }
        long j = a2.getLong("a_start_time", 0);
        long j2 = a2.getLong("a_end_time", 0);
        if (j > 0 && j2 == 0) {
            z = true;
            d(context);
        }
        long j3 = a2.getLong("session_end_time", 0);
        try {
            JSONObject jSONObject = new JSONObject();
            if (j3 == 0) {
                j3 = System.currentTimeMillis();
            }
            jSONObject.put("__f", j3);
            w.a(g).a(a(), jSONObject, w.a.END);
        } catch (Throwable unused) {
        }
        a(context);
        return z;
    }

    public void f(Context context) {
        SharedPreferences a2 = ba.a(context);
        if (a2 != null) {
            String b2 = b(context);
            SharedPreferences.Editor edit = a2.edit();
            long currentTimeMillis = System.currentTimeMillis();
            edit.putString("session_id", b2);
            edit.putLong("session_start_time", System.currentTimeMillis());
            edit.putLong("session_end_time", 0);
            edit.putLong("a_start_time", currentTimeMillis);
            edit.putLong("a_end_time", 0);
            edit.putInt("versioncode", Integer.parseInt(bv.a(context)));
            edit.putString("versionname", bv.b(context));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("__e", currentTimeMillis);
                w.a(g).a(b2, jSONObject, w.a.BEGIN);
            } catch (Throwable unused) {
            }
            edit.commit();
        }
    }

    public boolean a(Context context) {
        SharedPreferences a2 = ba.a(context);
        String string = a2.getString("session_id", null);
        if (string == null) {
            return false;
        }
        long j = a2.getLong("session_start_time", 0);
        long j2 = a2.getLong("session_end_time", 0);
        if (j2 != 0) {
            Math.abs(j2 - j);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", string);
            jSONObject.put("__e", j);
            jSONObject.put("__f", j2);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lat", location[0]);
                jSONObject2.put("lng", location[1]);
                jSONObject2.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                jSONObject.put("__d", jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Method method = cls.getMethod("getUidRxBytes", new Class[]{Integer.TYPE});
            Method method2 = cls.getMethod("getUidTxBytes", new Class[]{Integer.TYPE});
            int i = context.getApplicationInfo().uid;
            if (i == -1) {
                return false;
            }
            long longValue = ((Long) method.invoke(null, new Object[]{Integer.valueOf(i)})).longValue();
            long longValue2 = ((Long) method2.invoke(null, new Object[]{Integer.valueOf(i)})).longValue();
            if (longValue > 0 && longValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("download_traffic", longValue);
                jSONObject3.put("upload_traffic", longValue2);
                jSONObject.put("__c", jSONObject3);
            }
            w.a(context).a(string, jSONObject, w.a.NEWSESSION);
            bf.a(g);
            ap.b(g);
            a(a2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void c(Context context) {
        g = context;
        SharedPreferences a2 = ba.a(context);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            int i = a2.getInt("versioncode", 0);
            int parseInt = Integer.parseInt(bv.a(g));
            if (i != 0 && parseInt != i) {
                try {
                    edit.putInt("vers_code", i);
                    edit.putString("vers_name", a2.getString("versionname", ""));
                    edit.commit();
                } catch (Throwable unused) {
                }
                if (g(context) == null) {
                    a(context, a2);
                }
                e(g);
                ar.b(g).b();
                f(g);
                ar.b(g).a();
            } else if (b(a2)) {
                String a3 = a(context, a2);
                by.c("Start new session: " + a3);
            } else {
                String string = a2.getString("session_id", null);
                edit.putLong("a_start_time", System.currentTimeMillis());
                edit.putLong("a_end_time", 0);
                edit.commit();
                by.c("Extend current session: " + string);
            }
        }
    }

    private String a(Context context, SharedPreferences sharedPreferences) {
        ar b2 = ar.b(context);
        String b3 = b(context);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", currentTimeMillis);
            w.a(g).a(b3, jSONObject, w.a.BEGIN);
        } catch (Throwable unused) {
        }
        a(context);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("session_id", b3);
        edit.putLong("session_start_time", System.currentTimeMillis());
        edit.putLong("session_end_time", 0);
        edit.putLong("a_start_time", currentTimeMillis);
        edit.putLong("a_end_time", 0);
        edit.putInt("versioncode", Integer.parseInt(bv.a(context)));
        edit.putString("versionname", bv.b(context));
        edit.commit();
        b2.a((Object) Boolean.TRUE);
        return b3;
    }
}
