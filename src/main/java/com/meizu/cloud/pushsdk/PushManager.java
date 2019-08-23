package com.meizu.cloud.pushsdk;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.a.b;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

public class PushManager {
    static final String KEY_PUSH_ID = "pushId";
    static final String PUSH_ID_PREFERENCE_NAME = "com.meizu.flyme.push";
    public static final String TAG = "3.7.3-SNAPSHOT";

    public static void checkNotificationMessage(Context context) {
        String appVersionName = MzSystemUtils.getAppVersionName(context, "com.meizu.cloud");
        DebugLogger.i(TAG, context.getPackageName() + " checkNotificationMessage cloudVersion_name " + appVersionName);
        if (!TextUtils.isEmpty(appVersionName) && appVersionName.startsWith("6")) {
            Intent intent = new Intent(PushConstants.MZ_PUSH_ON_GET_NOTIFICATION_MESSAGE);
            intent.putExtra(PushConstants.EXTRA_GET_NOTIFICATION_PACKAGE_NAME, context.getPackageName());
            intent.setClassName("com.meizu.cloud", "com.meizu.cloud.pushsdk.pushservice.MzPushService");
            context.startService(intent);
        }
    }

    public static void checkPush(Context context, String str, String str2, String str3) {
        b.a(context).a(str, str2, context.getPackageName(), str3);
    }

    public static void checkSubScribeAlias(Context context, String str, String str2, String str3) {
        b.a(context).d(str, str2, context.getPackageName(), str3);
    }

    public static void checkSubScribeTags(Context context, String str, String str2, String str3) {
        b.a(context).c(str, str2, context.getPackageName(), str3);
    }

    public static void clearNotification(Context context) {
        b.a(context).a(context.getPackageName());
    }

    public static void clearNotification(Context context, int... iArr) {
        b.a(context).a(context.getPackageName(), iArr);
    }

    public static void enableCacheRequest(Context context, boolean z) {
        b.a(context).a(z);
    }

    public static String getPushId(Context context) {
        int b2 = com.meizu.cloud.pushsdk.util.b.b(context, context.getPackageName());
        if (b2 == 0 || System.currentTimeMillis() / 1000 <= ((long) b2)) {
            return com.meizu.cloud.pushsdk.util.b.a(context, context.getPackageName());
        }
        return null;
    }

    @Deprecated
    public static void register(Context context) {
        String packageName;
        DebugLogger.initDebugLogger(context);
        String appVersionName = MzSystemUtils.getAppVersionName(context, "com.meizu.cloud");
        DebugLogger.i(TAG, context.getPackageName() + " start register cloudVersion_name " + appVersionName);
        Intent intent = new Intent(PushConstants.MZ_PUSH_ON_START_PUSH_REGISTER);
        if ("com.meizu.cloud".equals(MzSystemUtils.getMzPushServicePackageName(context))) {
            packageName = "com.meizu.cloud";
        } else if (!TextUtils.isEmpty(appVersionName) && MzSystemUtils.compareVersion(appVersionName, "4.5.7")) {
            DebugLogger.e(TAG, "flyme 4.x start register cloud versionName " + appVersionName);
            intent.setPackage("com.meizu.cloud");
            intent.putExtra("sender", context.getPackageName());
            context.startService(intent);
        } else if (TextUtils.isEmpty(appVersionName) || !appVersionName.startsWith("3")) {
            DebugLogger.e(TAG, context.getPackageName() + " start register ");
            packageName = context.getPackageName();
        } else {
            DebugLogger.e(TAG, "flyme 3.x start register cloud versionName " + appVersionName);
            intent.setAction(PushConstants.REQUEST_REGISTRATION_INTENT);
            intent.setPackage("com.meizu.cloud");
            intent.putExtra(PushConstants.EXTRA_APPLICATION_PENDING_INTENT, PendingIntent.getBroadcast(context, 0, new Intent(), 0));
            intent.putExtra("sender", context.getPackageName());
            context.startService(intent);
        }
        intent.setClassName(packageName, "com.meizu.cloud.pushsdk.pushservice.MzPushService");
        intent.putExtra("sender", context.getPackageName());
        context.startService(intent);
    }

    public static void register(Context context, String str, String str2) {
        DebugLogger.initDebugLogger(context);
        b.a(context).a(str, str2, context.getPackageName());
    }

    public static void subScribeAlias(Context context, String str, String str2, String str3, String str4) {
        b.a(context).c(str, str2, context.getPackageName(), str3, str4);
    }

    public static void subScribeTags(Context context, String str, String str2, String str3, String str4) {
        b.a(context).a(str, str2, context.getPackageName(), str3, str4);
    }

    public static void switchPush(Context context, String str, String str2, String str3, int i, boolean z) {
        b.a(context).a(str, str2, context.getPackageName(), str3, i, z);
    }

    public static void switchPush(Context context, String str, String str2, String str3, boolean z) {
        b.a(context).a(str, str2, context.getPackageName(), str3, z);
    }

    @Deprecated
    public static void unRegister(Context context) {
        String packageName;
        String appVersionName = MzSystemUtils.getAppVersionName(context, "com.meizu.cloud");
        DebugLogger.e(TAG, context.getPackageName() + " start unRegister cloud versionName " + appVersionName);
        Intent intent = new Intent(PushConstants.MZ_PUSH_ON_STOP_PUSH_REGISTER);
        if ("com.meizu.cloud".equals(MzSystemUtils.getMzPushServicePackageName(context))) {
            packageName = "com.meizu.cloud";
        } else if (!TextUtils.isEmpty(appVersionName) && MzSystemUtils.compareVersion(appVersionName, "4.5.7")) {
            intent.setPackage("com.meizu.cloud");
            intent.putExtra("sender", context.getPackageName());
            context.startService(intent);
        } else if (TextUtils.isEmpty(appVersionName) || !appVersionName.startsWith("3")) {
            DebugLogger.e(TAG, context.getPackageName() + " start unRegister ");
            packageName = context.getPackageName();
        } else {
            intent.setAction(PushConstants.REQUEST_UNREGISTRATION_INTENT);
            intent.setPackage("com.meizu.cloud");
            intent.putExtra(PushConstants.EXTRA_APPLICATION_PENDING_INTENT, PendingIntent.getBroadcast(context, 0, new Intent(), 0));
            intent.putExtra("sender", context.getPackageName());
            context.startService(intent);
        }
        intent.setClassName(packageName, "com.meizu.cloud.pushsdk.pushservice.MzPushService");
        intent.putExtra("sender", context.getPackageName());
        context.startService(intent);
    }

    public static void unRegister(Context context, String str, String str2) {
        b.a(context).b(str, str2, context.getPackageName());
    }

    public static void unSubScribeAlias(Context context, String str, String str2, String str3, String str4) {
        b.a(context).d(str, str2, context.getPackageName(), str3, str4);
    }

    public static void unSubScribeAllTags(Context context, String str, String str2, String str3) {
        b.a(context).b(str, str2, context.getPackageName(), str3);
    }

    public static void unSubScribeTags(Context context, String str, String str2, String str3, String str4) {
        b.a(context).b(str, str2, context.getPackageName(), str3, str4);
    }
}
