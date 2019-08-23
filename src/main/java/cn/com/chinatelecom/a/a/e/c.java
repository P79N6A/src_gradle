package cn.com.chinatelecom.a.a.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public final class c {
    private static SharedPreferences a(Context context) {
        return com.ss.android.ugc.aweme.q.c.a(context, context.getPackageName() + "_sdk", 0);
    }

    public static long b(Context context, String str, long j) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return a(context).getLong(str, 0);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static void a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                a(context).edit().putString(str, str2).commit();
            } catch (Exception unused) {
            }
        }
    }

    public static String b(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return a(context).getString(str, str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public static boolean a(Context context, String str, long j) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return a(context).edit().putLong(str, j).commit();
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
