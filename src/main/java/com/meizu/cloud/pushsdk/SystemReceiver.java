package com.meizu.cloud.pushsdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.base.IntentReceiver;
import com.meizu.cloud.pushsdk.c.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.util.c;

public class SystemReceiver extends IntentReceiver {
    public void a(Context context) {
        String str;
        String appVersionName = MzSystemUtils.getAppVersionName(context, "com.meizu.cloud");
        DebugLogger.i("SystemReceiver", context.getPackageName() + " start register cloudVersion_name " + appVersionName);
        Intent intent = new Intent();
        if ("com.meizu.cloud".equals(MzSystemUtils.getMzPushServicePackageName(context))) {
            DebugLogger.e("SystemReceiver", "cloud pushService start");
            intent.setAction("com.meizu.pushservice.action.START");
            intent.setClassName("com.meizu.cloud", "com.meizu.cloud.pushsdk.pushservice.MzPushService");
        } else {
            if (!TextUtils.isEmpty(appVersionName) && MzSystemUtils.compareVersion(appVersionName, "4.5.7")) {
                DebugLogger.e("SystemReceiver", "flyme 4.x start register cloud versionName " + appVersionName);
                intent.setPackage("com.meizu.cloud");
                str = PushConstants.MZ_PUSH_ON_START_PUSH_REGISTER;
            } else if (TextUtils.isEmpty(appVersionName) || !appVersionName.startsWith("3")) {
                DebugLogger.e("SystemReceiver", context.getPackageName() + " start register ");
                intent.setClassName(context.getPackageName(), "com.meizu.cloud.pushsdk.pushservice.MzPushService");
                str = "com.meizu.pushservice.action.START";
            } else {
                DebugLogger.e("SystemReceiver", "flyme 3.x start register cloud versionName " + appVersionName);
                intent.setAction(PushConstants.REQUEST_REGISTRATION_INTENT);
                intent.setPackage("com.meizu.cloud");
            }
            intent.setAction(str);
        }
        a(context, intent);
    }

    public void a(Context context, Intent intent) {
        try {
            context.startService(intent);
        } catch (SecurityException e2) {
            DebugLogger.e("SystemReceiver", "start service error " + e2.getMessage());
        }
    }

    public void onHandleIntent(Context context, Intent intent) {
        if (intent != null) {
            try {
                if ("com.meizu.cloud.pushservice.action.PUSH_SERVICE_START".equals(intent.getAction())) {
                    a(context);
                    a.a(context, false).a();
                }
            } catch (Exception e2) {
                DebugLogger.e("SystemReceiver", "onHandleIntent Exception " + e2.getMessage());
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        try {
            super.onReceive(context, intent);
        } catch (Exception e2) {
            DebugLogger.e("SystemReceiver", "Event core error " + e2.getMessage());
            String packageName = context.getPackageName();
            c.a(context, packageName, null, null, PushManager.TAG, "SystemReceiver " + e2.getMessage(), PushConstants.WORK_RECEIVER_EVENTCORE_ERROR);
        }
    }
}
