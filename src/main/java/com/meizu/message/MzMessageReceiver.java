package com.meizu.message;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.ss.android.message.b.h;
import com.ss.android.push.PushDependManager;
import com.ss.android.pushmanager.a.d;
import java.util.zip.DataFormatException;
import org.json.JSONObject;

public class MzMessageReceiver extends MzPushMessageReceiver {
    public void onUpdateNotificationBuilder(PushNotificationBuilder pushNotificationBuilder) {
        pushNotificationBuilder.setmStatusbarIcon(2130839438);
    }

    public static void printLog(String str) {
        if (!TextUtils.isEmpty(str) && PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("MzPush", str);
        }
    }

    public void onHandleIntent(Context context, Intent intent) {
        try {
            super.onHandleIntent(context, intent);
            printLog("onHandleIntent " + intent.toUri(0));
        } catch (Throwable unused) {
        }
    }

    public void onPushStatus(Context context, PushSwitchStatus pushSwitchStatus) {
        if (pushSwitchStatus != null) {
            printLog("pushStatus " + pushSwitchStatus.toString());
        }
    }

    public void onRegister(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            printLog("register " + str);
            handleMessage(context, 0, str, 8);
        }
    }

    public void onSubTagsStatus(Context context, SubTagsStatus subTagsStatus) {
        if (subTagsStatus != null) {
            printLog("subTagsStatus " + subTagsStatus.toString());
        }
    }

    public void onUnRegister(Context context, boolean z) {
        printLog("onUnRegister: " + z);
    }

    public void onUnRegisterStatus(Context context, UnRegisterStatus unRegisterStatus) {
        if (unRegisterStatus != null) {
            printLog("unRegisterStatus " + unRegisterStatus.toString());
        }
    }

    public void onNotificationDeleted(Context context, MzPushMessage mzPushMessage) {
        PushDependManager inst = PushDependManager.inst();
        inst.loggerD(MzPushMessageReceiver.TAG, "onNotificationDeleted title " + mzPushMessage.getTitle() + "content " + mzPushMessage.getContent() + " selfDefineContentString " + mzPushMessage.getSelfDefineContentString() + " notifyId " + mzPushMessage.getNotifyId());
    }

    public void onSubAliasStatus(Context context, SubAliasStatus subAliasStatus) {
        if (subAliasStatus != null) {
            if (TextUtils.equals(BasicPushStatus.SUCCESS_CODE, subAliasStatus.code)) {
                d.b(8);
            } else {
                d.a(8, 105, subAliasStatus.getCode(), subAliasStatus.getMessage());
            }
            printLog("subAliasStatus " + subAliasStatus.toString());
        }
    }

    public void onMessage(Context context, Intent intent) {
        try {
            JSONObject jSONObject = new JSONObject();
            Bundle extras = intent.getExtras();
            if (extras != null && !extras.isEmpty()) {
                for (String str : extras.keySet()) {
                    try {
                        jSONObject.put(str, extras.get(str));
                    } catch (Throwable unused) {
                    }
                }
            }
            String jSONObject2 = jSONObject.toString();
            printLog("flyme3 onMessage " + jSONObject2);
            onMessage(context, jSONObject2);
        } catch (Throwable unused2) {
        }
    }

    public void onRegisterStatus(Context context, RegisterStatus registerStatus) {
        if (registerStatus != null) {
            if (BasicPushStatus.SUCCESS_CODE.equals(registerStatus.getCode())) {
                handleMessage(context, 0, registerStatus.getPushId(), 8);
            } else {
                handleMessage(context, 2, "code = " + registerStatus.getCode() + " message = " + registerStatus.getMessage(), 8);
                d.a(8, 104, registerStatus.getCode(), registerStatus.getMessage());
            }
            printLog("registerStatus " + registerStatus.toString());
        }
    }

    public void onMessage(Context context, String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            printLog("message " + str);
            try {
                char charAt = str.charAt(0);
                if (!(charAt == 'a' || charAt == 'c')) {
                    str = "a" + str;
                }
                jSONObject = PushDependManager.inst().getMessage(str.getBytes(), true);
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                handleMessage(context, 1, jSONObject.toString(), 8);
            }
        }
    }

    public void onNotificationArrived(Context context, MzPushMessage mzPushMessage) {
        PushDependManager.inst().loggerD(MzPushMessageReceiver.TAG, "onNotificationArrived title " + mzPushMessage.getTitle() + "content " + mzPushMessage.getContent() + " selfDefineContentString " + mzPushMessage.getSelfDefineContentString() + " notifyId " + mzPushMessage.getNotifyId());
        String title = mzPushMessage.getTitle();
        String content = mzPushMessage.getContent();
        String selfDefineContentString = mzPushMessage.getSelfDefineContentString();
        if (context != null && !TextUtils.isEmpty(selfDefineContentString)) {
            printLog("onNotificationArrived " + title + " " + content + " " + selfDefineContentString);
            try {
                char charAt = selfDefineContentString.charAt(0);
                if (!(charAt == 'a' || charAt == 'c')) {
                    selfDefineContentString = "a" + selfDefineContentString;
                }
                JSONObject message = PushDependManager.inst().getMessage(selfDefineContentString.getBytes(), true);
                if (message != null) {
                    PushDependManager.inst().onNotificationArrived(context, message);
                }
            } catch (DataFormatException unused) {
            } catch (Throwable unused2) {
            }
        }
    }

    public void onNotificationClicked(Context context, MzPushMessage mzPushMessage) {
        JSONObject jSONObject;
        PushDependManager.inst().loggerD(MzPushMessageReceiver.TAG, "onNotificationClicked title " + mzPushMessage.getTitle() + "content " + mzPushMessage.getContent() + " selfDefineContentString " + mzPushMessage.getSelfDefineContentString() + " notifyId " + mzPushMessage.getNotifyId());
        String title = mzPushMessage.getTitle();
        String content = mzPushMessage.getContent();
        String selfDefineContentString = mzPushMessage.getSelfDefineContentString();
        if (context != null && !TextUtils.isEmpty(selfDefineContentString)) {
            printLog("onNotificationClicked " + title + " " + content + " " + selfDefineContentString);
            try {
                char charAt = selfDefineContentString.charAt(0);
                if (!(charAt == 'a' || charAt == 'c')) {
                    selfDefineContentString = "a" + selfDefineContentString;
                }
                jSONObject = PushDependManager.inst().getMessage(selfDefineContentString.getBytes(), true);
                try {
                    jSONObject.put("pass_through", 0);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                PushDependManager.inst().onClickNotPassThroughNotification(context, 1, jSONObject.toString(), 8, null);
            }
        }
    }

    private void handleMessage(Context context, int i, String str, int i2) {
        try {
            Intent intent = new Intent("com.ss.android.mz.message");
            intent.setPackage(context.getPackageName());
            intent.putExtra("message_type", i);
            intent.putExtra("message_obj", str);
            intent.putExtra("message_from", i2);
            h.a(context, intent);
        } catch (Exception unused) {
        }
    }
}
