package com.meizu.cloud.pushsdk.notification.a;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;

public class a extends c {
    public a(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    public void a(Notification.Builder builder, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            if (messageV3.getmNotificationStyle() != null && !a() && !TextUtils.isEmpty(messageV3.getmNotificationStyle().getExpandableImageUrl())) {
                Bitmap a2 = a(messageV3.getmNotificationStyle().getExpandableImageUrl());
                if (a2 != null) {
                    bigPictureStyle.setBigContentTitle(messageV3.getTitle());
                    bigPictureStyle.bigPicture(a2);
                    builder.setStyle(bigPictureStyle);
                }
            }
        }
    }
}
