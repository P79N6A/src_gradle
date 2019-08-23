package com.meizu.cloud.pushsdk.notification.a;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.a;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;

public class c extends a {
    public c(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    public void b(Notification.Builder builder, MessageV3 messageV3) {
        AppIconSetting appIconSetting = messageV3.getmAppIconSetting();
        if (appIconSetting != null) {
            if (appIconSetting.isDefaultLargeIcon()) {
                builder.setLargeIcon((this.f27228b == null || this.f27228b.getmLargIcon() == 0) ? a(this.f27227a, messageV3.getUploadDataPackageName()) : BitmapFactory.decodeResource(this.f27227a.getResources(), this.f27228b.getmLargIcon()));
            } else if (Thread.currentThread() != this.f27227a.getMainLooper().getThread()) {
                Bitmap a2 = a(appIconSetting.getLargeIconUrl());
                if (a2 != null) {
                    DebugLogger.i("AbstractPushNotification", "On other Thread down load largeIcon image success");
                    builder.setLargeIcon(a2);
                    return;
                }
                builder.setLargeIcon(a(this.f27227a, messageV3.getUploadDataPackageName()));
            }
        }
    }
}
