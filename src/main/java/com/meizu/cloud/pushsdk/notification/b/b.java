package com.meizu.cloud.pushsdk.notification.b;

import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.c.c;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;

public class b extends c {
    public b(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    public void b(Notification notification, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.f27227a.getPackageName(), c.b(this.f27227a));
            remoteViews.setTextViewText(c.d(this.f27227a), messageV3.getTitle());
            remoteViews.setLong(c.f(this.f27227a), "setTime", System.currentTimeMillis());
            a(remoteViews, messageV3);
            if (messageV3.getmNotificationStyle() != null && !TextUtils.isEmpty(messageV3.getmNotificationStyle().getExpandableText())) {
                remoteViews.setViewVisibility(c.h(this.f27227a), 0);
                remoteViews.setTextViewText(c.h(this.f27227a), messageV3.getmNotificationStyle().getExpandableText());
            }
            notification.bigContentView = remoteViews;
        }
    }
}
