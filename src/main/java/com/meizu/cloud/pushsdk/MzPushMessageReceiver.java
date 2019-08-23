package com.meizu.cloud.pushsdk;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.base.IntentReceiver;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.util.c;

public abstract class MzPushMessageReceiver extends IntentReceiver {
    public static final String TAG = "MzPushMessageReceiver";

    public void onHandleIntent(Context context, Intent intent) {
        a.a(context).a(TAG, new a() {
            public void a(Context context, Intent intent) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onMessage Flyme3 " + intent);
                MzPushMessageReceiver.this.onMessage(context, intent);
            }

            public void a(Context context, MzPushMessage mzPushMessage) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onNotificationClicked title " + mzPushMessage.getTitle() + "content " + mzPushMessage.getContent() + " selfDefineContentString " + mzPushMessage.getSelfDefineContentString());
                MzPushMessageReceiver.this.onNotificationClicked(context, mzPushMessage);
            }

            public void a(Context context, PushSwitchStatus pushSwitchStatus) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onPushStatus " + pushSwitchStatus);
                MzPushMessageReceiver.this.onPushStatus(context, pushSwitchStatus);
            }

            public void a(Context context, RegisterStatus registerStatus) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onRegisterStatus " + registerStatus);
                MzPushMessageReceiver.this.onRegisterStatus(context, registerStatus);
            }

            public void a(Context context, SubAliasStatus subAliasStatus) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onSubAliasStatus " + subAliasStatus);
                MzPushMessageReceiver.this.onSubAliasStatus(context, subAliasStatus);
            }

            public void a(Context context, SubTagsStatus subTagsStatus) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onSubTagsStatus " + subTagsStatus);
                MzPushMessageReceiver.this.onSubTagsStatus(context, subTagsStatus);
            }

            public void a(Context context, UnRegisterStatus unRegisterStatus) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onUnRegisterStatus " + unRegisterStatus);
                MzPushMessageReceiver.this.onUnRegisterStatus(context, unRegisterStatus);
            }

            public void a(Context context, String str) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onRegister " + str);
                MzPushMessageReceiver.this.onRegister(context, str);
            }

            public void a(Context context, String str, String str2) {
                MzPushMessageReceiver.this.onMessage(context, str, str2);
                DebugLogger.i(MzPushMessageReceiver.TAG, "receive message " + str + " platformExtra " + str2);
            }

            public void a(Context context, boolean z) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onUnRegister " + z);
                MzPushMessageReceiver.this.onUnRegister(context, z);
            }

            public void a(PushNotificationBuilder pushNotificationBuilder) {
                MzPushMessageReceiver.this.onUpdateNotificationBuilder(pushNotificationBuilder);
            }

            public void b(Context context, MzPushMessage mzPushMessage) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onNotificationArrived title " + mzPushMessage.getTitle() + "content " + mzPushMessage.getContent() + " selfDefineContentString " + mzPushMessage.getSelfDefineContentString());
                MzPushMessageReceiver.this.onNotificationArrived(context, mzPushMessage);
            }

            public void b(Context context, String str) {
                MzPushMessageReceiver.this.onMessage(context, str);
                DebugLogger.i(MzPushMessageReceiver.TAG, "receive message " + str);
            }

            public void c(Context context, MzPushMessage mzPushMessage) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onNotificationDeleted title " + mzPushMessage.getTitle() + "content " + mzPushMessage.getContent() + " selfDefineContentString " + mzPushMessage.getSelfDefineContentString());
                MzPushMessageReceiver.this.onNotificationDeleted(context, mzPushMessage);
            }

            public void c(Context context, String str) {
                DebugLogger.i(MzPushMessageReceiver.TAG, "onNotifyMessageArrived " + str);
                MzPushMessageReceiver.this.onNotifyMessageArrived(context, str);
            }
        }).a(intent);
    }

    public void onMessage(Context context, Intent intent) {
    }

    public void onMessage(Context context, String str) {
    }

    public void onMessage(Context context, String str, String str2) {
    }

    public void onNotificationArrived(Context context, MzPushMessage mzPushMessage) {
    }

    public void onNotificationClicked(Context context, MzPushMessage mzPushMessage) {
    }

    public void onNotificationDeleted(Context context, MzPushMessage mzPushMessage) {
    }

    public void onNotifyMessageArrived(Context context, String str) {
    }

    public abstract void onPushStatus(Context context, PushSwitchStatus pushSwitchStatus);

    public void onReceive(Context context, Intent intent) {
        try {
            super.onReceive(context, intent);
        } catch (Exception e2) {
            DebugLogger.e(TAG, "Event core error " + e2.getMessage());
            String packageName = context.getPackageName();
            c.a(context, packageName, null, null, PushManager.TAG, "MzPushMessageReceiver " + e2.getMessage(), PushConstants.WORK_RECEIVER_EVENTCORE_ERROR);
        }
    }

    @Deprecated
    public abstract void onRegister(Context context, String str);

    public abstract void onRegisterStatus(Context context, RegisterStatus registerStatus);

    public abstract void onSubAliasStatus(Context context, SubAliasStatus subAliasStatus);

    public abstract void onSubTagsStatus(Context context, SubTagsStatus subTagsStatus);

    @Deprecated
    public abstract void onUnRegister(Context context, boolean z);

    public abstract void onUnRegisterStatus(Context context, UnRegisterStatus unRegisterStatus);

    public void onUpdateNotificationBuilder(PushNotificationBuilder pushNotificationBuilder) {
    }
}
