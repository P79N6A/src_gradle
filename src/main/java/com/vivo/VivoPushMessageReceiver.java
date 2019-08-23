package com.vivo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.push.PushDependManager;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import org.json.JSONObject;

public class VivoPushMessageReceiver extends OpenClientPushMessageReceiver {
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public void onReceiveRegId(final Context context, final String str) {
        this.mHandler.post(new Runnable() {
            public final void run() {
                PushDependManager inst = PushDependManager.inst();
                inst.loggerD("VivoPushMessageReceiver", "onReceiveRegId token = " + str);
                VivoPushAdapter.sendToken(context, str);
            }
        });
    }

    public void onNotificationMessageClicked(Context context, UPSNotificationMessage uPSNotificationMessage) {
        if (context != null && uPSNotificationMessage != null) {
            try {
                String skipContent = uPSNotificationMessage.getSkipContent();
                if (!TextUtils.isEmpty(skipContent)) {
                    JSONObject message = PushDependManager.inst().getMessage(skipContent.getBytes(), true);
                    if (message != null) {
                        message.put("pass_through", 0);
                        PushDependManager.inst().onClickNotPassThroughNotification(context, 1, message.toString(), 11, null);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
