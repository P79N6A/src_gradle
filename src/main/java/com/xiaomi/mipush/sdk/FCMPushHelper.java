package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

public class FCMPushHelper {
    public static void clearToken(Context context) {
        j.a(context, f.ASSEMBLE_PUSH_FCM);
    }

    public static void convertMessage(Intent intent) {
        j.a(intent);
    }

    public static boolean isFCMSwitchOpen(Context context) {
        return j.a(context, f.ASSEMBLE_PUSH_FCM) != null && MiPushClient.getOpenFCMPush(context);
    }

    public static void notifyFCMNotificationCome(Context context, Map<String, String> map) {
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str)) {
            PushMessageReceiver a2 = j.a(context);
            if (a2 != null) {
                a2.onNotificationMessageArrived(context, j.a(str));
            }
        }
    }

    public static void notifyFCMPassThoughMessageCome(Context context, Map<String, String> map) {
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str)) {
            PushMessageReceiver a2 = j.a(context);
            if (a2 != null) {
                a2.onReceivePassThroughMessage(context, j.a(str));
            }
        }
    }

    public static void reportFCMMessageDelete() {
        MiTinyDataClient.upload(j.b(f.ASSEMBLE_PUSH_FCM), "fcm", 1, "some fcm messages was deleted ");
    }

    public static void uploadToken(Context context, String str) {
        j.a(context, f.ASSEMBLE_PUSH_FCM, str);
    }
}
