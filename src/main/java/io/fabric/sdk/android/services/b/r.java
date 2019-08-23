package io.fabric.sdk.android.services.b;

import android.content.Context;
import android.text.TextUtils;

public final class r {
    private static boolean c(Context context) {
        int a2 = i.a(context, "google_app_id", "string");
        if (a2 != 0 && !TextUtils.isEmpty(context.getResources().getString(a2))) {
            return true;
        }
        return false;
    }

    public final boolean a(Context context) {
        if (i.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        if (!c(context) || b(context)) {
            return false;
        }
        return true;
    }

    private static boolean b(Context context) {
        new g();
        if (!TextUtils.isEmpty(g.b(context))) {
            return true;
        }
        new g();
        if (!TextUtils.isEmpty(g.c(context))) {
            return true;
        }
        return false;
    }
}
