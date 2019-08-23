package com.xiaomi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.message.b.a;
import com.ss.android.message.b.f;
import com.ss.android.push.PushDependManager;
import java.util.Arrays;

public class ManifestChecker {
    ManifestChecker() {
    }

    private static boolean checkKeys(String str) {
        Pair<String, String> pushConfig = PushDependManager.inst().getPushConfig(1);
        if (pushConfig == null || TextUtils.isEmpty((CharSequence) pushConfig.first) || TextUtils.isEmpty((CharSequence) pushConfig.second)) {
            return false;
        }
        return true;
    }

    static boolean checkManifest(String str, Context context) throws PackageManager.NameNotFoundException {
        return checkComponents(context, str) & checkKeys(str) & checkPermission(context, str);
    }

    private static boolean checkPermission(Context context, String str) throws PackageManager.NameNotFoundException {
        return f.a(context, str, "MiPush", Arrays.asList(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.READ_PHONE_STATE", "android.permission.GET_TASKS", "android.permission.VIBRATE", context.getPackageName() + ".permission.MIPUSH_RECEIVE"}));
    }

    private static boolean checkComponents(Context context, String str) throws PackageManager.NameNotFoundException {
        a.C0361a d2 = a.C0361a.d("com.xiaomi.push.service.XMPushService");
        a.C0361a d3 = a.C0361a.d("com.xiaomi.push.service.XMJobService");
        boolean b2 = f.b(context, str, "MiPush 错误", Arrays.asList(new a[]{d2.a(context.getPackageName() + ":pushservice").f29961b, d3.a(context.getPackageName() + ":pushservice").b("android.permission.BIND_JOB_SERVICE").f29961b, a.C0361a.d("com.xiaomi.mipush.sdk.PushMessageHandler").a(context.getPackageName()).f29961b, a.C0361a.d("com.xiaomi.mipush.sdk.MessageHandleService").a(context.getPackageName()).f29961b}));
        a.C0361a d4 = a.C0361a.d("com.xiaomi.push.service.receivers.PingReceiver");
        if (!f.c(context, str, "MiPush 错误", Arrays.asList(new a[]{a.C0361a.d("com.xiaomi.push.service.receivers.NetworkStatusReceiver").a(context.getPackageName()).a(new a.b(Arrays.asList(new String[]{"android.net.conn.CONNECTIVITY_CHANGE"}), Arrays.asList(new String[]{"android.intent.category.DEFAULT"}))).f29961b, d4.a(context.getPackageName() + ":pushservice").a(new a.b(Arrays.asList(new String[]{"com.xiaomi.push.PING_TIMER"}))).f29961b, a.C0361a.d("com.xiaomi.push.service.receivers.MIPushMessageHandler").a(context.getPackageName()).a(new a.b(Arrays.asList(new String[]{"com.xiaomi.mipush.RECEIVE_MESSAGE"}))).a(new a.b(Arrays.asList(new String[]{"com.xiaomi.mipush.MESSAGE_ARRIVED"}))).a(new a.b(Arrays.asList(new String[]{"com.xiaomi.mipush.ERROR"}))).f29961b})) || !b2) {
            return false;
        }
        return true;
    }
}
