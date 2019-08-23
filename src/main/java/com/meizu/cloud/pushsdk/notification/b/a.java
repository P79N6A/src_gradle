package com.meizu.cloud.pushsdk.notification.b;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.c.c;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;

public class a extends c {
    public a(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    private void b(RemoteViews remoteViews, MessageV3 messageV3) {
        if (messageV3.getmNotificationStyle() != null && !a()) {
            if (!TextUtils.isEmpty(messageV3.getmNotificationStyle().getExpandableImageUrl())) {
                Bitmap a2 = a(messageV3.getmNotificationStyle().getExpandableImageUrl());
                if (a2 != null) {
                    remoteViews.setViewVisibility(c.g(this.f27227a), 0);
                    remoteViews.setImageViewBitmap(c.g(this.f27227a), a2);
                } else {
                    remoteViews.setViewVisibility(c.g(this.f27227a), 8);
                }
            } else {
                remoteViews.setViewVisibility(c.g(this.f27227a), 8);
            }
        }
    }

    public void b(Notification notification, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.f27227a.getPackageName(), c.a(this.f27227a));
            remoteViews.setTextViewText(c.d(this.f27227a), messageV3.getTitle());
            remoteViews.setTextViewText(c.e(this.f27227a), messageV3.getContent());
            remoteViews.setLong(c.f(this.f27227a), "setTime", System.currentTimeMillis());
            a(remoteViews, messageV3);
            b(remoteViews, messageV3);
            notification.bigContentView = remoteViews;
        }
    }
}
