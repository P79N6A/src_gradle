package com.umeng.message.proguard;

import android.content.Context;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static float f81296a = 1.0f;

    private static void a(Context context) {
        f81296a = context.getResources().getDisplayMetrics().density;
    }

    public static int a(Context context, float f2) {
        a(context);
        return (int) ((f2 * f81296a) + 0.5f);
    }

    public static int b(Context context, float f2) {
        a(context);
        return (int) ((f2 / f81296a) + 0.5f);
    }

    public static int c(Context context, float f2) {
        a(context);
        return (int) ((f2 * f81296a) + 0.5f);
    }

    public static int d(Context context, float f2) {
        a(context);
        return (int) ((f2 / f81296a) + 0.5f);
    }
}
