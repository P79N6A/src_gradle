package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;

public class bg {

    /* renamed from: a  reason: collision with root package name */
    private static bg f5744a;

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f5745b;

    private bg() {
    }

    public static bg a() {
        if (f5744a == null) {
            f5744a = new bg();
        }
        return f5744a;
    }

    public static String a(String str) {
        return f5745b.getString(str, null);
    }

    public static void a(Context context) {
        f5744a = new bg();
        f5745b = c.a(context, "amap_preferences", 0);
    }

    public void b(String str, int i) {
        SharedPreferences.Editor edit = f5745b.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    public static String a(String str, String str2) {
        return f5745b.getString(str, str2);
    }

    public static void b(String str, boolean z) {
        if (f5745b != null) {
            f5745b.edit().putBoolean(str, z).commit();
        }
    }

    public void b(String str, String str2) {
        SharedPreferences.Editor edit = f5745b.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static boolean a(String str, boolean z) {
        return f5745b.getBoolean(str, z);
    }

    public int a(String str, int i) {
        return f5745b.getInt(str, i);
    }
}
