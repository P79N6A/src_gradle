package com.mapbox.android.core.b;

import android.content.Context;
import android.support.v4.content.ContextCompat;

public final class a {
    private static boolean b(Context context) {
        return a(context, "android.permission.ACCESS_COARSE_LOCATION");
    }

    private static boolean c(Context context) {
        return a(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    public static boolean a(Context context) {
        if (b(context) || c(context)) {
            return true;
        }
        return false;
    }

    private static boolean a(Context context, String str) {
        if (ContextCompat.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }
}
