package com.mapbox.mapboxsdk.http;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.b;

public final class a {
    public static String a(@NonNull Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return String.format("%s/%s (%s)", new Object[]{context.getPackageName(), packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
        } catch (Exception e2) {
            b.a(e2);
            return "";
        }
    }
}
