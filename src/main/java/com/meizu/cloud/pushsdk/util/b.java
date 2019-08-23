package com.meizu.cloud.pushsdk.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.android.dexposed.ClassUtils;

public class b {
    public static String a(Context context, String str) {
        return a(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str + "_pushId");
    }

    public static String a(Context context, String str, String str2) {
        return k(context, str).getString(str2, "");
    }

    public static void a(Context context, int i, String str) {
        a(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str + "_pushId_expire_time", i);
    }

    public static void a(Context context, String str, int i) {
        a(context, "mz_push_preference", str + ".notification_id", i);
    }

    public static void a(Context context, String str, String str2, int i) {
        k(context, str).edit().putInt(str2, i).apply();
    }

    public static void a(Context context, String str, String str2, String str3) {
        k(context, str).edit().putString(str2, str3).apply();
    }

    public static void a(Context context, String str, String str2, boolean z) {
        k(context, str).edit().putBoolean(str2, z).apply();
    }

    public static void a(Context context, String str, boolean z) {
        a(context, "mz_push_preference", "switch_notification_message_" + str, z);
    }

    public static int b(Context context, String str) {
        return b(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str + "_pushId_expire_time");
    }

    public static int b(Context context, String str, String str2) {
        return k(context, str).getInt(str2, 0);
    }

    public static void b(Context context, String str, int i) {
        a(context, "mz_push_preference", str + ".notification_push_task_id", i);
    }

    public static void b(Context context, String str, String str2, int i) {
        a(context, "mz_push_preference", str + ClassUtils.PACKAGE_SEPARATOR + str2, i);
    }

    public static void b(Context context, String str, boolean z) {
        a(context, "mz_push_preference", "switch_through_message_" + str, z);
    }

    public static int c(Context context, String str) {
        SharedPreferences k = k(context, "mz_push_preference");
        return k.getInt(str + ".notification_id", 0);
    }

    public static void c(Context context, String str, int i) {
        a(context, "mz_push_preference", str + ".message_seq", i);
    }

    public static boolean c(Context context, String str, String str2) {
        return k(context, str).getBoolean(str2, true);
    }

    public static int d(Context context, String str) {
        SharedPreferences k = k(context, "mz_push_preference");
        return k.getInt(str + ".notification_push_task_id", 0);
    }

    public static boolean d(Context context, String str, String str2) {
        return k(context, str).edit().remove(str2).commit();
    }

    public static boolean e(Context context, String str) {
        return c(context, "mz_push_preference", "switch_notification_message_" + str);
    }

    public static boolean e(Context context, String str, String str2) {
        return k(context, str).contains(str2);
    }

    public static void f(Context context, String str, String str2) {
        a(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str2 + "_pushId", str);
    }

    public static boolean f(Context context, String str) {
        return e(context, "mz_push_preference", "switch_notification_message_" + str);
    }

    public static String g(Context context, String str) {
        return a(context, "mz_push_preference", "push_alias_" + str);
    }

    public static void g(Context context, String str, String str2) {
        a(context, "mz_push_preference", "push_alias_" + str, str2);
    }

    public static int h(Context context, String str, String str2) {
        return b(context, "mz_push_preference", str + ClassUtils.PACKAGE_SEPARATOR + str2);
    }

    public static boolean h(Context context, String str) {
        return c(context, "mz_push_preference", "switch_through_message_" + str);
    }

    public static boolean i(Context context, String str) {
        return e(context, "mz_push_preference", "switch_through_message_" + str);
    }

    public static boolean i(Context context, String str, String str2) {
        return d(context, "mz_push_preference", str + ClassUtils.PACKAGE_SEPARATOR + str2);
    }

    public static int j(Context context, String str) {
        int b2 = b(context, "mz_push_preference", str + ".message_seq") + 1;
        c(context, str, b2);
        DebugLogger.e("mz_push_preference", "current messageSeq " + b2);
        return b2;
    }

    private static SharedPreferences k(Context context, String str) {
        return c.a(context, str, 0);
    }
}
