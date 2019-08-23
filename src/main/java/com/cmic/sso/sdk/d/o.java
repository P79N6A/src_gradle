package com.cmic.sso.sdk.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class o {
    public static byte[] a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (context.getPackageName().equalsIgnoreCase(str)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                if (packageInfo.packageName.equals(str)) {
                    return packageInfo.signatures[0].toByteArray();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        for (PackageInfo next : packageManager.getInstalledPackages(64)) {
            if (next.packageName.equals(str)) {
                return next.signatures[0].toByteArray();
            }
        }
        return null;
    }
}
