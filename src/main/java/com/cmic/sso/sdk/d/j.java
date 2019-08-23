package com.cmic.sso.sdk.d;

import android.content.Context;

public class j {
    public static boolean a(Context context, String str) {
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }
}
