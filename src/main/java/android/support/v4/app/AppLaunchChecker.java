package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.q.c;

public class AppLaunchChecker {
    public static boolean hasStartedFromLauncher(@NonNull Context context) {
        return c.a(context, "android.support.AppLaunchChecker", 0).getBoolean("startedFromLauncher", false);
    }

    public static void onActivityCreate(@NonNull Activity activity) {
        SharedPreferences a2 = c.a(activity, "android.support.AppLaunchChecker", 0);
        if (!a2.getBoolean("startedFromLauncher", false)) {
            Intent intent = activity.getIntent();
            if (intent != null && "android.intent.action.MAIN".equals(intent.getAction()) && (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory("android.intent.category.LEANBACK_LAUNCHER"))) {
                a2.edit().putBoolean("startedFromLauncher", true).apply();
            }
        }
    }
}
