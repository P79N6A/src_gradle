package com.meizu.cloud.pushsdk.notification;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.b.c;
import com.meizu.cloud.pushsdk.notification.model.styleenum.InnerStyleLayout;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;

public class b extends c {
    public b(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    /* access modifiers changed from: protected */
    public void b(Notification notification, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            Bitmap a2 = a(messageV3.getmNotificationStyle().getBannerImageUrl());
            if (!a() && a2 != null) {
                RemoteViews remoteViews = new RemoteViews(this.f27227a.getPackageName(), com.meizu.cloud.pushsdk.notification.c.c.c(this.f27227a));
                remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.i(this.f27227a), a2);
                remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.j(this.f27227a), 8);
                remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.i(this.f27227a), 0);
                notification.contentView = remoteViews;
                if (messageV3.getmNotificationStyle().getInnerStyle() == InnerStyleLayout.EXPANDABLE_PIC.getCode()) {
                    Bitmap a3 = a(messageV3.getmNotificationStyle().getExpandableImageUrl());
                    if (!a() && a3 != null) {
                        RemoteViews remoteViews2 = new RemoteViews(this.f27227a.getPackageName(), com.meizu.cloud.pushsdk.notification.c.c.c(this.f27227a));
                        remoteViews2.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.j(this.f27227a), a3);
                        remoteViews2.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.j(this.f27227a), 0);
                        remoteViews2.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.i(this.f27227a), 8);
                        notification.bigContentView = remoteViews2;
                    }
                }
            }
        }
    }
}
