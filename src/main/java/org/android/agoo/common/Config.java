package org.android.agoo.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.ALog;

public class Config {

    /* renamed from: a  reason: collision with root package name */
    public static String f83987a;

    /* renamed from: b  reason: collision with root package name */
    private static String f83988b;

    /* renamed from: c  reason: collision with root package name */
    private static String f83989c;

    public static String b(Context context) {
        if (TextUtils.isEmpty(f83987a)) {
            return ACCSManager.getDefaultConfig(context);
        }
        return f83987a;
    }

    public static boolean c(Context context) {
        try {
            if (c.a(context, "Agoo_AppStore", 4).getInt("agoo_UnReport_times", 0) > 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void d(Context context) {
        try {
            SharedPreferences.Editor edit = c.a(context, "Agoo_AppStore", 4).edit();
            edit.putInt("agoo_UnReport_times", 0);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static int e(Context context) {
        try {
            return c.a(context, "Agoo_AppStore", 4).getInt("agoo_UnReport_times", 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean f(Context context) {
        try {
            return c.a(context, "Agoo_AppStore", 4).getBoolean("agoo_enable_daemonserver", true);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String h(Context context) {
        try {
            return c.a(context, "Agoo_AppStore", 4).getString("app_push_user_token", "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Context context) {
        String str;
        String str2 = f83988b;
        try {
            str = c.a(context, "Agoo_AppStore", 4).getString("agoo_app_key", f83988b);
        } catch (Throwable th) {
            ALog.e("Config", "getAgooAppKey", th, new Object[0]);
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            ALog.e("Config", "getAgooAppKey null!!", new Object[0]);
        }
        ALog.d("Config", "getAgooAppKey", "appkey", str);
        return str;
    }

    public static String g(Context context) {
        String str;
        String str2 = f83989c;
        try {
            str = c.a(context, "Agoo_AppStore", 4).getString("deviceId", f83989c);
        } catch (Throwable th) {
            ALog.e("Config", "getDeviceToken", th, new Object[0]);
            str = str2;
        }
        ALog.i("Config", "getDeviceToken", "token", str);
        return str;
    }

    public static void a(Context context, int i) {
        try {
            SharedPreferences a2 = c.a(context, "Agoo_AppStore", 4);
            SharedPreferences.Editor edit = a2.edit();
            edit.putInt("agoo_UnReport_times", a2.getInt("agoo_UnReport_times", 0) + i);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, String str) {
        try {
            SharedPreferences.Editor edit = c.a(context, "Agoo_AppStore", 4).edit();
            if (!TextUtils.isEmpty(str)) {
                edit.putString("app_push_user_token", str);
            }
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, long j) {
        try {
            SharedPreferences.Editor edit = c.a(context, "Agoo_AppStore", 4).edit();
            edit.putLong("agoo_clear_time", j);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static boolean b(Context context, long j) {
        boolean z;
        try {
            long j2 = c.a(context, "Agoo_AppStore", 4).getLong("agoo_clear_time", 0);
            StringBuilder sb = new StringBuilder("now=");
            sb.append(j);
            sb.append(",now - lastTime=");
            long j3 = j - j2;
            sb.append(j3);
            sb.append(",istrue=");
            if (j3 > 86400000) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            ALog.d("isClearTime", sb.toString(), new Object[0]);
            if (j == 0 || j3 <= 86400000) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void setAgooAppKey(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                ALog.e("Config", "setAgooAppKey appkey null", new Object[0]);
                return;
            }
            f83988b = str;
            SharedPreferences.Editor edit = c.a(context, "Agoo_AppStore", 4).edit();
            edit.putString("agoo_app_key", str);
            edit.apply();
            ALog.d("Config", "setAgooAppKey", "appkey", str);
        } catch (Throwable th) {
            ALog.e("Config", "setAgooAppKey", th, new Object[0]);
        }
    }

    public static void a(Context context, String str) {
        ALog.i("Config", "setDeviceToken", "token", str);
        if (!TextUtils.isEmpty(str)) {
            f83989c = str;
            try {
                SharedPreferences.Editor edit = c.a(context, "Agoo_AppStore", 4).edit();
                edit.putString("deviceId", str);
                edit.apply();
            } catch (Throwable th) {
                ALog.e("Config", "setDeviceToken", th, new Object[0]);
            }
        }
    }

    public static void a(Context context, boolean z) {
        try {
            SharedPreferences.Editor edit = c.a(context, "Agoo_AppStore", 4).edit();
            edit.putBoolean("agoo_enable_daemonserver", z);
            edit.apply();
        } catch (Throwable unused) {
        }
    }
}
