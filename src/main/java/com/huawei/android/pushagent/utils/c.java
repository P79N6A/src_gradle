package com.huawei.android.pushagent.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.huawei.android.pushagent.utils.a.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class c {
    private static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e.a("PlusReportHelper", "package not exist", (Throwable) e2);
        } catch (Exception e3) {
            e.c("PlusReportHelper", "getApkVersionName error", e3);
        }
        return "0.0";
    }

    public static void a(Context context, String str, String str2, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(PushConstants.CONTENT, str2);
        bundle.putLong("cycle", j);
        bundle.putInt("operType", 1);
        bundle.putInt("plusType", i);
        bundle.putString("token", str);
        bundle.putString("pkgName", context.getPackageName());
        bundle.putString("apkVersion", a(context));
        context.sendBroadcast(new Intent("com.huawei.android.push.PLUGIN").putExtra("plusReport", bundle).setPackage(context.getPackageName()));
    }
}
