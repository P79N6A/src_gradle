package com.umeng.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.entity.UNotificationItem;
import org.json.JSONObject;

public class NotificationProxyBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81068a = "com.umeng.message.NotificationProxyBroadcastReceiver";

    /* renamed from: b  reason: collision with root package name */
    private UHandler f81069b;

    private void a(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            String str = f81068a;
            UMLog.mutlInfo(str, 0, "找不到应用: " + context.getPackageName());
            return;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(268435456);
        context.startActivity(launchIntentForPackage);
        String str2 = f81068a;
        UMLog.mutlInfo(str2, 2, "打开应用: " + context.getPackageName());
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("MSG");
        try {
            int intExtra = intent.getIntExtra("ACTION", -1);
            UMLog.mutlInfo(f81068a, 2, String.format("onReceive[msg=%s, action=%d]", new Object[]{stringExtra, Integer.valueOf(intExtra)}));
            if (intExtra == 12) {
                a(context);
                return;
            }
            UMessage uMessage = new UMessage(new JSONObject(stringExtra));
            int intExtra2 = intent.getIntExtra("NOTIFICATION_ID", -1);
            uMessage.message_id = intent.getStringExtra("MESSAGE_ID");
            uMessage.task_id = intent.getStringExtra("TASK_ID");
            switch (intExtra) {
                case 10:
                    UMLog.mutlInfo(f81068a, 2, "点击通知");
                    UTrack.getInstance(context).setClearPrevMessage(true);
                    UTrack.getInstance(context).trackMsgClick(uMessage);
                    this.f81069b = PushAgent.getInstance(context).getNotificationClickHandler();
                    if (this.f81069b != null) {
                        uMessage.clickOrDismiss = true;
                        this.f81069b.handleMessage(context, uMessage);
                        break;
                    }
                    break;
                case 11:
                    UMLog.mutlInfo(f81068a, 2, "忽略通知");
                    UTrack.getInstance(context).setClearPrevMessage(true);
                    UTrack.getInstance(context).trackMsgDismissed(uMessage);
                    this.f81069b = PushAgent.getInstance(context).getNotificationClickHandler();
                    if (this.f81069b != null) {
                        uMessage.clickOrDismiss = false;
                        this.f81069b.handleMessage(context, uMessage);
                        break;
                    }
                    break;
            }
            MessageNotificationQueue.getInstance().remove(new UNotificationItem(intExtra2, uMessage));
        } catch (Exception unused) {
        }
    }
}
