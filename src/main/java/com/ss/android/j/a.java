package com.ss.android.j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29273a;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(launchIntentForPackage.getComponent(), 0);
            if (activityInfo.targetActivity == null || activityInfo.name.equals(activityInfo.targetActivity)) {
                return true;
            }
            packageManager.setComponentEnabledSetting(new ComponentName(context, activityInfo.name), 2, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(context, activityInfo.targetActivity), 1, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
