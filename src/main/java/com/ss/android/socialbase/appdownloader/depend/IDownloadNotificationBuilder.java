package com.ss.android.socialbase.appdownloader.depend;

import android.content.Context;
import android.support.v4.app.NotificationCompat;

public interface IDownloadNotificationBuilder {
    NotificationCompat.Builder createNotification(Context context, String str);
}
