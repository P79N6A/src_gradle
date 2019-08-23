package com.huawei.android.pushagent.plugin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.android.pushagent.utils.a.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class PushPluginsBroadcastMgr {

    /* renamed from: a  reason: collision with root package name */
    private static String f25115a = "PushLogSC2815";

    public static void handleEvent(Context context, Intent intent) {
        try {
            if ("com.huawei.android.push.PLUGIN".equals(intent.getAction()) && intent.hasExtra("plusReport")) {
                Bundle bundleExtra = intent.getBundleExtra("plusReport");
                if (bundleExtra == null) {
                    e.b(f25115a, "plusReport not found in intent");
                    return;
                }
                int i = bundleExtra.getInt("plusType");
                int i2 = bundleExtra.getInt("operType");
                String string = bundleExtra.getString("pkgName");
                String string2 = bundleExtra.getString("token");
                String string3 = bundleExtra.getString("apkVersion");
                String str = f25115a;
                e.a(str, "receive plugin broadcast, plusType:" + i + ",operType:" + i2 + ",pkgName:" + string + ",token:" + string2 + ",apkVersion:" + string3);
                if (1 == i2) {
                    long j = bundleExtra.getLong("cycle");
                    new PushPlugins(context, string).reportPlus(i, bundleExtra.getString(PushConstants.CONTENT), j, string2, string3);
                }
            }
        } catch (Exception e2) {
            e.c(f25115a, e2.getMessage(), e2);
        }
    }

    public static int syncReport(Context context, Intent intent) {
        int i = 907122002;
        try {
            if ("com.huawei.android.push.PLUGIN".equals(intent.getAction()) && intent.hasExtra("plusReport")) {
                Bundle bundleExtra = intent.getBundleExtra("plusReport");
                if (bundleExtra == null) {
                    e.b(f25115a, "plusReport not found in intent");
                    return 907122003;
                }
                int i2 = bundleExtra.getInt("plusType");
                int i3 = bundleExtra.getInt("operType");
                String string = bundleExtra.getString("pkgName");
                String string2 = bundleExtra.getString("token");
                String string3 = bundleExtra.getString("apkVersion");
                String str = f25115a;
                e.a(str, "receive sync report event, plusType:" + i2 + ",operType:" + i3 + ",pkgName:" + string + ",token:" + string2 + ",apkVersion:" + string3);
                if (1 == i3) {
                    long j = bundleExtra.getLong("cycle");
                    i = new PushPlugins(context, string).syncReportPlus(i2, bundleExtra.getString(PushConstants.CONTENT), j, string2, string3);
                }
            }
        } catch (Exception e2) {
            e.c(f25115a, e2.getMessage(), e2);
        }
        return i;
    }
}
