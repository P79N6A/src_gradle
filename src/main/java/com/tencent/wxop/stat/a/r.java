package com.tencent.wxop.stat.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ss.android.ugc.aweme.q.c;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f79825a;

    public static int a(Context context, String str, int i) {
        return a(context).getInt(n.a(context, "wxop_".concat(String.valueOf(str))), i);
    }

    public static long a(Context context, String str, long j) {
        return a(context).getLong(n.a(context, "wxop_".concat(String.valueOf(str))), 0);
    }

    private static synchronized SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (r.class) {
            SharedPreferences a2 = c.a(context, ".mta-wxop", 0);
            f79825a = a2;
            if (a2 == null) {
                f79825a = PreferenceManager.getDefaultSharedPreferences(context);
            }
            sharedPreferences = f79825a;
        }
        return sharedPreferences;
    }

    public static String a(Context context, String str, String str2) {
        return a(context).getString(n.a(context, "wxop_".concat(String.valueOf(str))), str2);
    }

    public static void b(Context context, String str, int i) {
        String a2 = n.a(context, "wxop_".concat(String.valueOf(str)));
        SharedPreferences.Editor edit = a(context).edit();
        edit.putInt(a2, i);
        edit.commit();
    }

    public static void b(Context context, String str, long j) {
        String a2 = n.a(context, "wxop_".concat(String.valueOf(str)));
        SharedPreferences.Editor edit = a(context).edit();
        edit.putLong(a2, j);
        edit.commit();
    }
}
