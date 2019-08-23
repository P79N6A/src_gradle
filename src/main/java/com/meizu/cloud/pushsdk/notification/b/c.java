package com.meizu.cloud.pushsdk.notification.b;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.a;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;

public class c extends a {
    public c(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    public void a(Notification notification, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.f27227a.getPackageName(), com.meizu.cloud.pushsdk.notification.c.c.a(this.f27227a));
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.d(this.f27227a), messageV3.getTitle());
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.e(this.f27227a), messageV3.getContent());
            remoteViews.setLong(com.meizu.cloud.pushsdk.notification.c.c.f(this.f27227a), "setTime", System.currentTimeMillis());
            a(remoteViews, messageV3);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.g(this.f27227a), 8);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.h(this.f27227a), 8);
            notification.contentView = remoteViews;
        }
    }

    /* access modifiers changed from: protected */
    public void a(RemoteViews remoteViews, MessageV3 messageV3) {
        if (messageV3.getmAppIconSetting() == null || a()) {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.k(this.f27227a), a(this.f27227a, messageV3.getUploadDataPackageName()));
        } else {
            if (!messageV3.getmAppIconSetting().isDefaultLargeIcon()) {
                Bitmap a2 = a(messageV3.getmAppIconSetting().getLargeIconUrl());
                if (a2 != null) {
                    remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.k(this.f27227a), a2);
                }
            }
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.k(this.f27227a), a(this.f27227a, messageV3.getUploadDataPackageName()));
        }
    }
}
