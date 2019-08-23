package com.coloros.mcssdk.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class e {
    public static int a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e2) {
                d.b("parseInt--NumberFormatException" + e2.getMessage());
            }
        }
        return -1;
    }

    public static boolean a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            d.b("isExistPackage NameNotFoundException:" + e2.getMessage());
            return false;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, SearchJediMixFeedAdapter.f42517f);
        } catch (PackageManager.NameNotFoundException e2) {
            d.b("isSupportPush NameNotFoundException:" + e2.getMessage());
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            return applicationInfo.metaData.getBoolean(str2, false);
        }
        return false;
    }

    public static int b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            d.a("getVersionCode--Exception:" + e2.getMessage());
            return 0;
        }
    }

    public static String c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e2) {
            d.a("getVersionName--Exception:" + e2.getMessage());
            return null;
        }
    }
}
