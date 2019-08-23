package cn.com.chinatelecom.account.api.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public final class c {
    private static SharedPreferences a(Context context) {
        return com.ss.android.ugc.aweme.q.c.a(context, b(context), 0);
    }

    public static void a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                a(context).edit().putInt(str, i).commit();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                a(context).edit().putString(str, str2).commit();
            } catch (Exception unused) {
            }
        }
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

    public static int b(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return a(context).getInt(str, i);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static long b(Context context, String str, long j) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return a(context).getLong(str, j);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    private static String b(Context context) {
        return "ct_account_api_sdk";
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
}
