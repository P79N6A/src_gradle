package com.meizu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Pair;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.message.b.a;
import com.ss.android.message.b.f;
import com.ss.android.push.PushDependManager;
import java.util.Arrays;

public class ManifestChecker {
    ManifestChecker() {
    }

    private static boolean checkKeys(String str) {
        Pair<String, String> pushConfig = PushDependManager.inst().getPushConfig(8);
        if (pushConfig == null || TextUtils.isEmpty((CharSequence) pushConfig.first) || TextUtils.isEmpty((CharSequence) pushConfig.second)) {
            return false;
        }
        return true;
    }

    static boolean checkManifest(String str, Context context) throws PackageManager.NameNotFoundException {
        return checkComponents(context, str) & checkKeys(str) & checkPermission(context, str);
    }

    private static boolean checkPermission(Context context, String str) throws PackageManager.NameNotFoundException {
        return f.a(context, str, "MZPush", Arrays.asList(new String[]{"com.meizu.flyme.push.permission.RECEIVE", context.getPackageName() + ".push.permission.MESSAGE", "com.meizu.c2dm.permission.RECEIVE", context.getPackageName() + ".permission.C2D_MESSAGE"}));
    }

    private static boolean checkComponents(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean b2 = f.b(context, str, "MZPushPush 错误", Arrays.asList(new a[]{a.C0361a.d("com.meizu.cloud.pushsdk.NotificationService").a(context.getPackageName()).f29961b}));
        if (!f.c(context, str, "MZPushPush 错误", Arrays.asList(new a[]{a.C0361a.d("com.meizu.cloud.pushsdk.SystemReceiver").a(context.getPackageName()).a(new a.b(Arrays.asList(new String[]{"com.meizu.cloud.pushservice.action.PUSH_SERVICE_START"}), Arrays.asList(new String[]{"android.intent.category.DEFAULT"}))).f29961b, a.C0361a.d("com.meizu.message.MzMessageReceiver").a(context.getPackageName()).a(new a.b(Arrays.asList(new String[]{PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, PushConstants.MZ_PUSH_ON_REGISTER_ACTION, PushConstants.MZ_PUSH_ON_UNREGISTER_ACTION, PushConstants.REGISTRATION_CALLBACK_INTENT, PushConstants.C2DM_INTENT}), Arrays.asList(new String[]{context.getPackageName()}))).f29961b})) || !b2) {
            return false;
        }
        return true;
    }
}
