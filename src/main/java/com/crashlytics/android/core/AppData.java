package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.b.s;

public class AppData {
    public final String apiKey;
    public final String buildId;
    public final String installerPackageName;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    public static AppData create(Context context, s sVar, String str, String str2) throws PackageManager.NameNotFoundException {
        String str3;
        String packageName2 = context.getPackageName();
        String f2 = sVar.f();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
        String num = Integer.toString(packageInfo.versionCode);
        if (packageInfo.versionName == null) {
            str3 = "0.0";
        } else {
            str3 = packageInfo.versionName;
        }
        AppData appData = new AppData(str, str2, f2, packageName2, num, str3);
        return appData;
    }

    AppData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.apiKey = str;
        this.buildId = str2;
        this.installerPackageName = str3;
        this.packageName = str4;
        this.versionCode = str5;
        this.versionName = str6;
    }
}
