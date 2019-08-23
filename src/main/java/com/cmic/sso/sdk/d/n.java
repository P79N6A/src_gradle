package com.cmic.sso.sdk.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;

public class n {
    public static void a(Context context, String str) {
        SharedPreferences a2 = c.a(context, "ssoconfigs", 0);
        a2.edit().remove(g.a(str)).apply();
    }

    public static int b(Context context, String str, int i) {
        return c.a(context, "ssoconfigs", 0).getInt(g.a(str), i);
    }

    public static long b(Context context, String str, long j) {
        return c.a(context, "ssoconfigs", 0).getLong(g.a(str), j);
    }

    public static void a(Context context, String str, int i) {
        SharedPreferences a2 = c.a(context, "ssoconfigs", 0);
        a2.edit().putInt(g.a(str), i).apply();
    }

    public static String b(Context context, String str, String str2) {
        return c.a(context, "ssoconfigs", 0).getString(g.a(str), str2);
    }

    public static void a(Context context, String str, long j) {
        SharedPreferences a2 = c.a(context, "ssoconfigs", 0);
        a2.edit().putLong(g.a(str), j).apply();
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences a2 = c.a(context, "ssoconfigs", 0);
        a2.edit().putString(g.a(str), str2).apply();
    }
}
