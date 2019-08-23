package com.coloros;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.message.b.a;
import com.ss.android.message.b.f;
import com.ss.android.push.PushDependManager;
import java.util.Arrays;
import java.util.Collections;

public class ManifestChecker {
    ManifestChecker() {
    }

    private static boolean checkKeys(String str) {
        Pair<String, String> pushConfig = PushDependManager.inst().getPushConfig(10);
        if (pushConfig == null || TextUtils.isEmpty((CharSequence) pushConfig.first) || TextUtils.isEmpty((CharSequence) pushConfig.second)) {
            return false;
        }
        return true;
    }

    static boolean checkManifest(String str, Context context) throws PackageManager.NameNotFoundException {
        return checkComponents(context, str) & checkKeys(str) & checkPermission(context, str);
    }

    private static boolean checkPermission(Context context, String str) throws PackageManager.NameNotFoundException {
        return f.a(context, str, "OPPOPush 错误,", Arrays.asList(new String[]{"com.coloros.mcs.permission.RECIEVE_MCS_MESSAGE"}));
    }

    private static boolean checkComponents(Context context, String str) throws PackageManager.NameNotFoundException {
        return f.b(context, str, "OPPOPush", Collections.singletonList(a.C0361a.d("com.coloros.mcssdk.PushService").a(context.getPackageName()).b("com.coloros.mcs.permission.SEND_MCS_MESSAGE").f29961b));
    }
}
