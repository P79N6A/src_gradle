package com.ss.android.socialbase.appdownloader;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;

public final class a extends com.ss.android.socialbase.downloader.notification.a {
    private Context g;
    private Resources h = this.g.getResources();
    private String i;
    private String j;
    private String k;

    /* JADX WARNING: Removed duplicated region for block: B:226:0x05c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.app.Notification b(com.ss.android.socialbase.downloader.exception.BaseException r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            com.ss.android.socialbase.appdownloader.AppDownloader r2 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            java.lang.String r2 = r2.getNotificationChannelId()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 >= r4) goto L_0x0018
            android.support.v4.app.NotificationCompat$Builder r2 = new android.support.v4.app.NotificationCompat$Builder
            android.content.Context r3 = r0.g
            r2.<init>(r3)
            goto L_0x004d
        L_0x0018:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0024
            android.content.Context r2 = r0.g
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.getNotificationChannelId(r2)
        L_0x0024:
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ NoSuchMethodError -> 0x0046 }
            com.ss.android.socialbase.appdownloader.depend.IDownloadNotificationBuilder r3 = r3.getAppDownloadNotificationBuilder()     // Catch:{ NoSuchMethodError -> 0x0046 }
            if (r3 == 0) goto L_0x003d
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ NoSuchMethodError -> 0x0046 }
            com.ss.android.socialbase.appdownloader.depend.IDownloadNotificationBuilder r3 = r3.getAppDownloadNotificationBuilder()     // Catch:{ NoSuchMethodError -> 0x0046 }
            android.content.Context r4 = r0.g     // Catch:{ NoSuchMethodError -> 0x0046 }
            android.support.v4.app.NotificationCompat$Builder r2 = r3.createNotification(r4, r2)     // Catch:{ NoSuchMethodError -> 0x0046 }
            goto L_0x004d
        L_0x003d:
            android.support.v4.app.NotificationCompat$Builder r3 = new android.support.v4.app.NotificationCompat$Builder     // Catch:{ NoSuchMethodError -> 0x0046 }
            android.content.Context r4 = r0.g     // Catch:{ NoSuchMethodError -> 0x0046 }
            r3.<init>(r4, r2)     // Catch:{ NoSuchMethodError -> 0x0046 }
            r2 = r3
            goto L_0x004d
        L_0x0046:
            android.support.v4.app.NotificationCompat$Builder r2 = new android.support.v4.app.NotificationCompat$Builder
            android.content.Context r3 = r0.g
            r2.<init>(r3)
        L_0x004d:
            long r3 = r0.f31099f
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x005b
            long r3 = java.lang.System.currentTimeMillis()
            r0.f31099f = r3
        L_0x005b:
            long r3 = r0.f31099f
            r2.setWhen(r3)
            int r3 = r0.f31098e
            int r4 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.getNotificationType(r3)
            r5 = 0
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            r6 = 3
            r7 = 2
            r8 = 4
            r9 = 1
            r10 = 0
            if (r4 == r9) goto L_0x00aa
            if (r4 != r8) goto L_0x0074
            goto L_0x00aa
        L_0x0074:
            if (r4 != r7) goto L_0x008e
            r11 = 17301642(0x108008a, float:2.4979642E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r12 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r12 = r12.useReflectParseRes()
            if (r12 == 0) goto L_0x00c1
            android.content.Context r11 = r0.g
            java.lang.String r12 = "stat_sys_warning"
            java.lang.String r13 = "android"
            int r11 = com.ss.android.socialbase.appdownloader.d.a(r11, r12, r13)
            goto L_0x00c1
        L_0x008e:
            if (r4 != r6) goto L_0x00a8
            r11 = 17301634(0x1080082, float:2.497962E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r12 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r12 = r12.useReflectParseRes()
            if (r12 == 0) goto L_0x00c1
            android.content.Context r11 = r0.g
            java.lang.String r12 = "stat_sys_download_done"
            java.lang.String r13 = "android"
            int r11 = com.ss.android.socialbase.appdownloader.d.a(r11, r12, r13)
            goto L_0x00c1
        L_0x00a8:
            r11 = 0
            goto L_0x00c1
        L_0x00aa:
            r11 = 17301633(0x1080081, float:2.4979616E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r12 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r12 = r12.useReflectParseRes()
            if (r12 == 0) goto L_0x00c1
            android.content.Context r11 = r0.g
            java.lang.String r12 = "stat_sys_download"
            java.lang.String r13 = "android"
            int r11 = com.ss.android.socialbase.appdownloader.d.a(r11, r12, r13)
        L_0x00c1:
            if (r11 != 0) goto L_0x00c4
            return r5
        L_0x00c4:
            r2.setSmallIcon(r11)
            r12 = -4
            r13 = -1
            r14 = 134217728(0x8000000, float:3.85186E-34)
            if (r4 == r9) goto L_0x012d
            if (r4 == r8) goto L_0x012d
            if (r4 != r7) goto L_0x00d2
            goto L_0x012d
        L_0x00d2:
            if (r4 != r6) goto L_0x0160
            r2.setOngoing(r10)
            r2.setAutoCancel(r9)
            if (r3 == r13) goto L_0x00e2
            if (r3 != r12) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            java.lang.String r3 = "android.ss.intent.action.DOWNLOAD_OPEN"
            goto L_0x00e4
        L_0x00e2:
            java.lang.String r3 = "android.ss.intent.action.DOWNLOAD_DELETE"
        L_0x00e4:
            android.content.Intent r15 = new android.content.Intent
            android.content.Context r5 = r0.g
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r12 = com.ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r15.<init>(r5, r12)
            r15.setAction(r3)
            java.lang.String r3 = "extra_click_download_ids"
            int r5 = r0.f31094a
            r15.putExtra(r3, r5)
            java.lang.String r3 = "extra_click_download_type"
            r15.putExtra(r3, r4)
            android.content.Context r3 = r0.g
            int r5 = r0.f31094a
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r3, r5, r15, r14)
            r2.setContentIntent(r3)
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r5 = r0.g
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r12 = com.ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r3.<init>(r5, r12)
            java.lang.String r5 = "android.ss.intent.action.DOWNLOAD_HIDE"
            r3.setAction(r5)
            java.lang.String r5 = "extra_click_download_ids"
            int r12 = r0.f31094a
            r3.putExtra(r5, r12)
            java.lang.String r5 = "extra_click_download_type"
            r3.putExtra(r5, r4)
            android.content.Context r5 = r0.g
            int r12 = r0.f31094a
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r5, r12, r3, r14)
            r2.setDeleteIntent(r3)
            goto L_0x0160
        L_0x012d:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r5 = r0.g
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r12 = com.ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r3.<init>(r5, r12)
            java.lang.String r5 = "android.ss.intent.action.DOWNLOAD_DELETE"
            r3.setAction(r5)
            java.lang.String r5 = "extra_click_download_ids"
            int r12 = r0.f31094a
            r3.putExtra(r5, r12)
            java.lang.String r5 = "extra_click_download_type"
            r3.putExtra(r5, r4)
            android.content.Context r5 = r0.g
            int r12 = r0.f31094a
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r5, r12, r3, r14)
            r2.setContentIntent(r3)
            if (r4 == r9) goto L_0x0159
            if (r4 != r8) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            r3 = 0
            goto L_0x015a
        L_0x0159:
            r3 = 1
        L_0x015a:
            r2.setOngoing(r3)
            r2.setAutoCancel(r10)
        L_0x0160:
            long r14 = r0.f31095b
            long r6 = r0.f31096c
            if (r4 == r9) goto L_0x016c
            if (r4 != r8) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            r3 = 0
            r5 = 0
            goto L_0x019b
        L_0x016c:
            r17 = 0
            int r3 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r3 <= 0) goto L_0x0169
            r17 = 100
            long r14 = r14 * r17
            long r14 = r14 / r6
            int r3 = (int) r14
            r5 = 2131558633(0x7f0d00e9, float:1.8742587E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r6 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r6 = r6.useReflectParseRes()
            if (r6 == 0) goto L_0x018d
            android.content.Context r5 = r0.g
            java.lang.String r6 = "appdownloader_download_percent"
            int r5 = com.ss.android.socialbase.appdownloader.d.b(r5, r6)
        L_0x018d:
            android.content.res.Resources r6 = r0.h
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r7[r10] = r12
            java.lang.String r5 = r6.getString(r5, r7)
        L_0x019b:
            java.lang.String r6 = r0.f31097d
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x01be
            r6 = 2131558635(0x7f0d00eb, float:1.8742591E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r7 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r7 = r7.useReflectParseRes()
            if (r7 == 0) goto L_0x01b8
            android.content.Context r6 = r0.g
            java.lang.String r7 = "appdownloader_download_unknown_title"
            int r6 = com.ss.android.socialbase.appdownloader.d.b(r6, r7)
        L_0x01b8:
            android.content.res.Resources r7 = r0.h
            java.lang.String r6 = r7.getString(r6)
        L_0x01be:
            int r7 = android.os.Build.VERSION.SDK_INT
            r14 = 8
            if (r7 > r14) goto L_0x0311
            r2.setContentTitle(r6)
            r2.setContentText(r5)
            if (r4 == r9) goto L_0x0306
            if (r4 != r8) goto L_0x01d0
            goto L_0x0306
        L_0x01d0:
            r5 = 2
            if (r4 != r5) goto L_0x01f3
            r1 = 2131558655(0x7f0d00ff, float:1.8742632E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes()
            if (r3 == 0) goto L_0x01e8
            android.content.Context r1 = r0.g
            java.lang.String r3 = "appdownloader_notification_paused_in_background"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r3)
        L_0x01e8:
            android.content.res.Resources r3 = r0.h
            java.lang.String r1 = r3.getString(r1)
            r2.setContentText(r1)
            goto L_0x0303
        L_0x01f3:
            r3 = 3
            if (r4 != r3) goto L_0x0303
            int r3 = r0.f31098e
            if (r3 == r13) goto L_0x02bc
            int r3 = r0.f31098e
            r4 = -4
            if (r3 != r4) goto L_0x0201
            goto L_0x02bc
        L_0x0201:
            int r1 = r0.f31098e
            r3 = -3
            if (r1 != r3) goto L_0x0303
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.b.q()
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r1)
            int r3 = r0.f31094a
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r1.getDownloadInfo(r3)
            if (r1 == 0) goto L_0x0279
            java.lang.String r3 = r1.getMimeType()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0279
            java.lang.String r1 = r1.getMimeType()
            java.lang.String r3 = "application/vnd.android.package-archive"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0279
            android.content.Context r1 = r0.g
            java.lang.String r3 = r0.j
            java.lang.String r4 = r0.i
            boolean r1 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.isApkInstalled(r1, r3, r4)
            if (r1 == 0) goto L_0x0259
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x024b
            android.content.Context r1 = r0.g
            java.lang.String r3 = "appdownloader_notification_download_complete_open"
            int r12 = com.ss.android.socialbase.appdownloader.d.b(r1, r3)
            goto L_0x024e
        L_0x024b:
            r12 = 2131558642(0x7f0d00f2, float:1.8742606E38)
        L_0x024e:
            android.content.res.Resources r1 = r0.h
            java.lang.String r1 = r1.getString(r12)
            r2.setContentText(r1)
            goto L_0x0303
        L_0x0259:
            r1 = 2131558643(0x7f0d00f3, float:1.8742608E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes()
            if (r3 == 0) goto L_0x026e
            android.content.Context r1 = r0.g
            java.lang.String r3 = "appdownloader_notification_download_complete_with_install"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r3)
        L_0x026e:
            android.content.res.Resources r3 = r0.h
            java.lang.String r1 = r3.getString(r1)
            r2.setContentText(r1)
            goto L_0x0303
        L_0x0279:
            r1 = 2131558644(0x7f0d00f4, float:1.874261E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes()
            if (r3 == 0) goto L_0x028e
            android.content.Context r1 = r0.g
            java.lang.String r3 = "appdownloader_notification_download_complete_without_install"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r3)
        L_0x028e:
            com.ss.android.socialbase.downloader.downloader.c r3 = com.ss.android.socialbase.downloader.downloader.c.a()
            int r4 = r0.f31094a
            com.ss.android.socialbase.downloader.depend.x r3 = r3.d(r4)
            if (r3 == 0) goto L_0x02b1
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x02ad
            android.content.Context r1 = r0.g
            java.lang.String r3 = "appdownloader_notification_download_complete_open"
            int r12 = com.ss.android.socialbase.appdownloader.d.b(r1, r3)
            goto L_0x02b2
        L_0x02ad:
            r12 = 2131558642(0x7f0d00f2, float:1.8742606E38)
            goto L_0x02b2
        L_0x02b1:
            r12 = r1
        L_0x02b2:
            android.content.res.Resources r1 = r0.h
            java.lang.String r1 = r1.getString(r12)
            r2.setContentText(r1)
            goto L_0x0303
        L_0x02bc:
            if (r20 == 0) goto L_0x02e5
            int r1 = r20.getErrorCode()
            r3 = 1006(0x3ee, float:1.41E-42)
            if (r1 != r3) goto L_0x02e5
            r1 = 2131558652(0x7f0d00fc, float:1.8742626E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes()
            if (r3 == 0) goto L_0x02db
            android.content.Context r1 = r0.g
            java.lang.String r3 = "appdownloader_notification_download_space_failed"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r3)
        L_0x02db:
            android.content.res.Resources r3 = r0.h
            java.lang.String r1 = r3.getString(r1)
            r2.setContentText(r1)
            goto L_0x0303
        L_0x02e5:
            r1 = 2131558646(0x7f0d00f6, float:1.8742614E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes()
            if (r3 == 0) goto L_0x02fa
            android.content.Context r1 = r0.g
            java.lang.String r3 = "appdownloader_notification_download_failed"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r3)
        L_0x02fa:
            android.content.res.Resources r3 = r0.h
            java.lang.String r1 = r3.getString(r1)
            r2.setContentText(r1)
        L_0x0303:
            r1 = 0
            goto L_0x0826
        L_0x0306:
            r1 = 0
            r2.setContentInfo(r1)
            r4 = 100
            r2.setProgress(r4, r3, r10)
            goto L_0x0826
        L_0x0311:
            r5 = 2131689687(0x7f0f00d7, float:1.9008396E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r7 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r7 = r7.useReflectParseRes()
            if (r7 == 0) goto L_0x0326
            android.content.Context r5 = r0.g
            java.lang.String r7 = "appdownloader_notification_layout"
            int r5 = com.ss.android.socialbase.appdownloader.d.a(r5, r7)
        L_0x0326:
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            android.content.Context r15 = r0.g
            java.lang.String r15 = r15.getPackageName()
            r7.<init>(r15, r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            r15 = 20
            if (r5 <= r15) goto L_0x037a
            android.content.Context r5 = r0.g     // Catch:{ Throwable -> 0x0379 }
            boolean r5 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.isMaterialNotification(r5)     // Catch:{ Throwable -> 0x0379 }
            if (r5 == 0) goto L_0x037a
            r5 = 2131165418(0x7f0700ea, float:1.7945053E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r15 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x0379 }
            boolean r15 = r15.useReflectParseRes()     // Catch:{ Throwable -> 0x0379 }
            if (r15 == 0) goto L_0x0354
            android.content.Context r5 = r0.g     // Catch:{ Throwable -> 0x0379 }
            java.lang.String r15 = "appdownloader_root"
            int r5 = com.ss.android.socialbase.appdownloader.d.d(r5, r15)     // Catch:{ Throwable -> 0x0379 }
        L_0x0354:
            r15 = 2131624005(0x7f0e0045, float:1.8875177E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r16 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x0379 }
            boolean r16 = r16.useReflectParseRes()     // Catch:{ Throwable -> 0x0379 }
            if (r16 == 0) goto L_0x0369
            android.content.Context r15 = r0.g     // Catch:{ Throwable -> 0x0379 }
            java.lang.String r12 = "appdownloader_notification_material_background_color"
            int r15 = com.ss.android.socialbase.appdownloader.d.e(r15, r12)     // Catch:{ Throwable -> 0x0379 }
        L_0x0369:
            java.lang.String r12 = "setBackgroundColor"
            android.content.Context r13 = r0.g     // Catch:{ Throwable -> 0x0379 }
            android.content.res.Resources r13 = r13.getResources()     // Catch:{ Throwable -> 0x0379 }
            int r13 = r13.getColor(r15)     // Catch:{ Throwable -> 0x0379 }
            r7.setInt(r5, r12, r13)     // Catch:{ Throwable -> 0x0379 }
            goto L_0x037a
        L_0x0379:
        L_0x037a:
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r12 = r0.g
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r13 = com.ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r5.<init>(r12, r13)
            java.lang.String r12 = "android.ss.intent.action.DOWNLOAD_CLICK"
            r5.setAction(r12)
            java.lang.String r12 = "notification_name"
            java.lang.String r13 = r0.f31097d
            r5.putExtra(r12, r13)
            java.lang.String r12 = "extra_click_download_ids"
            int r13 = r0.f31094a
            r5.putExtra(r12, r13)
            java.lang.String r12 = "extra_click_download_type"
            r5.putExtra(r12, r4)
            com.ss.android.socialbase.appdownloader.AppDownloader r12 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r12 = r12.useReflectParseRes()
            if (r12 == 0) goto L_0x03ae
            android.content.Context r12 = r0.g
            java.lang.String r15 = "appdownloader_action"
            int r12 = com.ss.android.socialbase.appdownloader.d.d(r12, r15)
            goto L_0x03b1
        L_0x03ae:
            r12 = 2131165408(0x7f0700e0, float:1.7945032E38)
        L_0x03b1:
            android.content.Context r15 = r0.g
            int r13 = r0.f31094a
            r10 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r5 = android.app.PendingIntent.getService(r15, r13, r5, r10)
            r7.setOnClickPendingIntent(r12, r5)
            r5 = 2131165409(0x7f0700e1, float:1.7945034E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r10 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r10 = r10.useReflectParseRes()
            if (r10 == 0) goto L_0x03d3
            android.content.Context r5 = r0.g
            java.lang.String r10 = "appdownloader_desc"
            int r5 = com.ss.android.socialbase.appdownloader.d.d(r5, r10)
        L_0x03d3:
            r7.setTextViewText(r5, r6)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r5 = r5.useReflectParseRes()
            r6 = 2131165410(0x7f0700e2, float:1.7945036E38)
            if (r5 == 0) goto L_0x03ec
            android.content.Context r5 = r0.g
            java.lang.String r10 = "appdownloader_download_progress"
            int r5 = com.ss.android.socialbase.appdownloader.d.d(r5, r10)
            goto L_0x03ef
        L_0x03ec:
            r5 = 2131165410(0x7f0700e2, float:1.7945036E38)
        L_0x03ef:
            r10 = 100
            r12 = r21
            r7.setProgressBar(r5, r10, r3, r12)
            r3 = 2131165417(0x7f0700e9, float:1.794505E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r5 = r5.useReflectParseRes()
            if (r5 == 0) goto L_0x040b
            android.content.Context r3 = r0.g
            java.lang.String r5 = "appdownloader_icon"
            int r3 = com.ss.android.socialbase.appdownloader.d.d(r3, r5)
        L_0x040b:
            r7.setImageViewResource(r3, r11)
            java.lang.String r3 = ""
            java.lang.String r5 = ""
            java.lang.String r10 = ""
            if (r4 == r9) goto L_0x06bf
            if (r4 != r8) goto L_0x041a
            goto L_0x06bf
        L_0x041a:
            r8 = 2
            if (r4 != r8) goto L_0x04f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r3 = r0.f31095b
            java.lang.String r3 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r3)
            r1.append(r3)
            java.lang.String r3 = "/"
            r1.append(r3)
            long r3 = r0.f31096c
            java.lang.String r3 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 2131558649(0x7f0d00f9, float:1.874262E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x0452
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_notification_download_pause"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r4)
        L_0x0452:
            android.content.Context r4 = r0.g
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r5 = r4.getString(r1)
            r1 = 2131558651(0x7f0d00fb, float:1.8742624E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x0471
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_notification_download_resume"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r4)
        L_0x0471:
            android.content.Context r4 = r0.g
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r10 = r4.getString(r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x048d
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_progress"
            int r6 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
        L_0x048d:
            r7.setViewVisibility(r6, r14)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x04a3
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_success"
            int r12 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
            goto L_0x04a6
        L_0x04a3:
            r12 = 2131165413(0x7f0700e5, float:1.7945042E38)
        L_0x04a6:
            r7.setViewVisibility(r12, r14)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x04bd
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_text"
            int r11 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
            r1 = 0
            goto L_0x04c1
        L_0x04bd:
            r1 = 0
            r11 = 2131165416(0x7f0700e8, float:1.7945048E38)
        L_0x04c1:
            r7.setViewVisibility(r11, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x04d7
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_action"
            int r13 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
            goto L_0x04da
        L_0x04d7:
            r13 = 2131165408(0x7f0700e0, float:1.7945032E38)
        L_0x04da:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 11
            if (r1 < r4) goto L_0x04ef
            java.lang.String r1 = r0.k
            boolean r1 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.isBindApp(r1)
            if (r1 == 0) goto L_0x04e9
            goto L_0x04ef
        L_0x04e9:
            r1 = 0
            r7.setViewVisibility(r13, r1)
            goto L_0x07ac
        L_0x04ef:
            r7.setViewVisibility(r13, r14)
            goto L_0x07ac
        L_0x04f4:
            r8 = 3
            if (r4 != r8) goto L_0x07ac
            int r4 = r0.f31098e
            r8 = -1
            if (r4 == r8) goto L_0x05d7
            int r4 = r0.f31098e
            r8 = -4
            if (r4 != r8) goto L_0x0503
            goto L_0x05d7
        L_0x0503:
            int r1 = r0.f31098e
            r4 = -3
            if (r1 != r4) goto L_0x065b
            long r3 = r0.f31096c
            java.lang.String r1 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r3)
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.b.q()
            com.ss.android.socialbase.downloader.downloader.Downloader r3 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r3)
            int r4 = r0.f31094a
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r3.getDownloadInfo(r4)
            if (r3 == 0) goto L_0x0572
            java.lang.String r4 = r3.getMimeType()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0572
            java.lang.String r3 = r3.getMimeType()
            java.lang.String r4 = "application/vnd.android.package-archive"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0572
            android.content.Context r3 = r0.g
            java.lang.String r4 = r0.j
            java.lang.String r5 = r0.i
            boolean r3 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.isApkInstalled(r3, r4, r5)
            if (r3 == 0) goto L_0x0553
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes()
            if (r3 == 0) goto L_0x05a6
            android.content.Context r3 = r0.g
            java.lang.String r4 = "appdownloader_notification_download_complete_open"
            int r3 = com.ss.android.socialbase.appdownloader.d.b(r3, r4)
            goto L_0x05a9
        L_0x0553:
            r3 = 2131558643(0x7f0d00f3, float:1.8742608E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x0568
            android.content.Context r3 = r0.g
            java.lang.String r4 = "appdownloader_notification_download_complete_with_install"
            int r3 = com.ss.android.socialbase.appdownloader.d.b(r3, r4)
        L_0x0568:
            android.content.res.Resources r4 = r0.h
            java.lang.String r4 = r4.getString(r3)
            r2.setContentText(r4)
            goto L_0x05a9
        L_0x0572:
            r3 = 2131558644(0x7f0d00f4, float:1.874261E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x0587
            android.content.Context r3 = r0.g
            java.lang.String r4 = "appdownloader_notification_download_complete_without_install"
            int r3 = com.ss.android.socialbase.appdownloader.d.b(r3, r4)
        L_0x0587:
            com.ss.android.socialbase.downloader.downloader.c r4 = com.ss.android.socialbase.downloader.downloader.c.a()
            int r5 = r0.f31094a
            com.ss.android.socialbase.downloader.depend.x r4 = r4.d(r5)
            if (r4 == 0) goto L_0x05a9
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes()
            if (r3 == 0) goto L_0x05a6
            android.content.Context r3 = r0.g
            java.lang.String r4 = "appdownloader_notification_download_complete_open"
            int r3 = com.ss.android.socialbase.appdownloader.d.b(r3, r4)
            goto L_0x05a9
        L_0x05a6:
            r3 = 2131558642(0x7f0d00f2, float:1.8742606E38)
        L_0x05a9:
            android.content.Context r4 = r0.g
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r3 = r4.getString(r3)
            r4 = 2131558647(0x7f0d00f7, float:1.8742616E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r5 = r5.useReflectParseRes()
            if (r5 == 0) goto L_0x05c8
            android.content.Context r4 = r0.g
            java.lang.String r5 = "appdownloader_notification_download_install"
            int r4 = com.ss.android.socialbase.appdownloader.d.b(r4, r5)
        L_0x05c8:
            android.content.Context r5 = r0.g
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r4 = r5.getString(r4)
            r5 = r3
            r10 = r4
            r3 = r1
            goto L_0x065b
        L_0x05d7:
            java.lang.String r3 = ""
            r4 = 2131165414(0x7f0700e6, float:1.7945044E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r5 = r5.useReflectParseRes()
            if (r5 == 0) goto L_0x05ee
            android.content.Context r4 = r0.g
            java.lang.String r5 = "appdownloader_download_success_size"
            int r4 = com.ss.android.socialbase.appdownloader.d.d(r4, r5)
        L_0x05ee:
            r7.setViewVisibility(r4, r14)
            if (r20 == 0) goto L_0x061b
            int r1 = r20.getErrorCode()
            r4 = 1006(0x3ee, float:1.41E-42)
            if (r1 != r4) goto L_0x061b
            r1 = 2131558652(0x7f0d00fc, float:1.8742626E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x0610
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_notification_download_space_failed"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r4)
        L_0x0610:
            android.content.Context r4 = r0.g
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = r4.getString(r1)
            goto L_0x063a
        L_0x061b:
            r1 = 2131558646(0x7f0d00f6, float:1.8742614E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x0630
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_notification_download_failed"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r4)
        L_0x0630:
            android.content.Context r4 = r0.g
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = r4.getString(r1)
        L_0x063a:
            r4 = 2131558650(0x7f0d00fa, float:1.8742622E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r5 = r5.useReflectParseRes()
            if (r5 == 0) goto L_0x064f
            android.content.Context r4 = r0.g
            java.lang.String r5 = "appdownloader_notification_download_restart"
            int r4 = com.ss.android.socialbase.appdownloader.d.b(r4, r5)
        L_0x064f:
            android.content.Context r5 = r0.g
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r4 = r5.getString(r4)
            r5 = r1
            r10 = r4
        L_0x065b:
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x066d
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_progress"
            int r6 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
        L_0x066d:
            r7.setViewVisibility(r6, r14)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x0684
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_success"
            int r12 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
            r1 = 0
            goto L_0x0688
        L_0x0684:
            r1 = 0
            r12 = 2131165413(0x7f0700e5, float:1.7945042E38)
        L_0x0688:
            r7.setViewVisibility(r12, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x069e
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_text"
            int r11 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
            goto L_0x06a1
        L_0x069e:
            r11 = 2131165416(0x7f0700e8, float:1.7945048E38)
        L_0x06a1:
            r7.setViewVisibility(r11, r14)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x06b7
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_action"
            int r13 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
            goto L_0x06ba
        L_0x06b7:
            r13 = 2131165408(0x7f0700e0, float:1.7945032E38)
        L_0x06ba:
            r7.setViewVisibility(r13, r14)
            goto L_0x07ac
        L_0x06bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r11 = r0.f31095b
            java.lang.String r3 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r11)
            r1.append(r3)
            java.lang.String r3 = "/"
            r1.append(r3)
            long r10 = r0.f31096c
            java.lang.String r3 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r10)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 2131558653(0x7f0d00fd, float:1.8742628E38)
            if (r4 != r9) goto L_0x06f7
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x070c
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_notification_downloading"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r4)
            goto L_0x070c
        L_0x06f7:
            r1 = 2131558656(0x7f0d0100, float:1.8742634E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x070c
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_notification_prepare"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r4)
        L_0x070c:
            android.content.Context r4 = r0.g
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r5 = r4.getString(r1)
            r1 = 2131558649(0x7f0d00f9, float:1.874262E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x072b
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_notification_download_pause"
            int r1 = com.ss.android.socialbase.appdownloader.d.b(r1, r4)
        L_0x072b:
            android.content.Context r4 = r0.g
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r10 = r4.getString(r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x0747
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_progress"
            int r6 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
        L_0x0747:
            r1 = 0
            r7.setViewVisibility(r6, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x075e
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_success"
            int r12 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
            goto L_0x0761
        L_0x075e:
            r12 = 2131165413(0x7f0700e5, float:1.7945042E38)
        L_0x0761:
            r7.setViewVisibility(r12, r14)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x0778
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_text"
            int r11 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
            r1 = 0
            goto L_0x077c
        L_0x0778:
            r1 = 0
            r11 = 2131165416(0x7f0700e8, float:1.7945048E38)
        L_0x077c:
            r7.setViewVisibility(r11, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x0792
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_action"
            int r13 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
            goto L_0x0795
        L_0x0792:
            r13 = 2131165408(0x7f0700e0, float:1.7945032E38)
        L_0x0795:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 11
            if (r1 < r4) goto L_0x07a9
            java.lang.String r1 = r0.k
            boolean r1 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.isBindApp(r1)
            if (r1 == 0) goto L_0x07a4
            goto L_0x07a9
        L_0x07a4:
            r1 = 0
            r7.setViewVisibility(r13, r1)
            goto L_0x07ac
        L_0x07a9:
            r7.setViewVisibility(r13, r14)
        L_0x07ac:
            r1 = 2131165411(0x7f0700e3, float:1.7945038E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x07c1
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_size"
            int r1 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
        L_0x07c1:
            r7.setTextViewText(r1, r3)
            r1 = 2131165412(0x7f0700e4, float:1.794504E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x07d9
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_status"
            int r1 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
        L_0x07d9:
            r7.setTextViewText(r1, r5)
            r1 = 2131165414(0x7f0700e6, float:1.7945044E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes()
            if (r4 == 0) goto L_0x07f1
            android.content.Context r1 = r0.g
            java.lang.String r4 = "appdownloader_download_success_size"
            int r1 = com.ss.android.socialbase.appdownloader.d.d(r1, r4)
        L_0x07f1:
            r7.setTextViewText(r1, r3)
            r1 = 2131165415(0x7f0700e7, float:1.7945046E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes()
            if (r3 == 0) goto L_0x0809
            android.content.Context r1 = r0.g
            java.lang.String r3 = "appdownloader_download_success_status"
            int r1 = com.ss.android.socialbase.appdownloader.d.d(r1, r3)
        L_0x0809:
            r7.setTextViewText(r1, r5)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes()
            if (r1 == 0) goto L_0x081f
            android.content.Context r1 = r0.g
            java.lang.String r3 = "appdownloader_action"
            int r13 = com.ss.android.socialbase.appdownloader.d.d(r1, r3)
            goto L_0x0822
        L_0x081f:
            r13 = 2131165408(0x7f0700e0, float:1.7945032E38)
        L_0x0822:
            r7.setTextViewText(r13, r10)
            r1 = r7
        L_0x0826:
            android.app.Notification r2 = r2.build()
            int r3 = r2.flags
            r4 = 2
            r3 = r3 | r4
            r2.flags = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 <= r14) goto L_0x0838
            if (r1 == 0) goto L_0x0838
            r2.contentView = r1
        L_0x0838:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.a.b(com.ss.android.socialbase.downloader.exception.BaseException, boolean):android.app.Notification");
    }

    public final void a(DownloadInfo downloadInfo) {
        super.a(downloadInfo);
        this.j = downloadInfo.getSavePath();
        this.i = downloadInfo.getName();
        this.k = downloadInfo.getExtra();
    }

    public final void a(BaseException baseException, boolean z) {
        if (this.g != null) {
            try {
                Notification b2 = b(baseException, z);
                if (this.f31094a != 0) {
                    if (b2 != null) {
                        DownloadNotificationManager.getInstance().notifyByService(this.f31094a, this.f31098e, b2);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public a(Context context, int i2, String str, String str2, String str3, String str4) {
        super(i2, str);
        this.j = str2;
        this.i = str3;
        this.k = str4;
        this.g = context.getApplicationContext();
    }
}
