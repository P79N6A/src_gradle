package com.ss.android.socialbase.downloader.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;

public class DownloadReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f30891a = "DownloadReceiver";

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    try {
                        Intent intent2 = new Intent(context, DownloadNotificationService.class);
                        intent2.setAction(action);
                        context.startService(intent2);
                    } catch (Throwable unused) {
                    }
                } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    try {
                        Intent intent3 = new Intent(context, DownloadNotificationService.class);
                        intent3.setAction(action);
                        context.startService(intent3);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }
}
