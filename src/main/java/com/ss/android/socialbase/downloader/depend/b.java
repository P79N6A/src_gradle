package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.notification.a;

public abstract class b extends AbsDownloadListener {
    /* access modifiers changed from: protected */
    public abstract a createNotificationItem();

    public void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        updateNotificationProgress(downloadInfo);
    }

    public void onPause(DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        updateNotification(-2, downloadInfo, null, false);
    }

    public void onPrepare(DownloadInfo downloadInfo) {
        super.onPrepare(downloadInfo);
        addNotificationItem(downloadInfo);
        updateNotification(1, downloadInfo, null, true);
    }

    public void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        updateNotification(2, downloadInfo, null, false);
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        updateNotification(-3, downloadInfo, null, false);
    }

    private void addNotificationItem(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.canShowNotification()) {
            a notificationItem = DownloadNotificationManager.getInstance().getNotificationItem(downloadInfo.getId());
            if (notificationItem == null) {
                DownloadNotificationManager.getInstance().addNotification(createNotificationItem());
                return;
            }
            notificationItem.a(downloadInfo);
        }
    }

    private void updateNotificationProgress(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.canShowNotification() && downloadInfo.getStatus() == 4) {
            a notificationItem = DownloadNotificationManager.getInstance().getNotificationItem(downloadInfo.getId());
            if (notificationItem == null) {
                notificationItem = createNotificationItem();
            }
            notificationItem.a(downloadInfo.getCurBytes(), downloadInfo.getTotalBytes());
        }
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        updateNotification(-1, downloadInfo, baseException, false);
    }

    private void updateNotification(int i, DownloadInfo downloadInfo, BaseException baseException, boolean z) {
        if (downloadInfo != null && downloadInfo.canShowNotification() && i != 4) {
            a notificationItem = DownloadNotificationManager.getInstance().getNotificationItem(downloadInfo.getId());
            if (notificationItem == null) {
                notificationItem = createNotificationItem();
            }
            notificationItem.f31096c = downloadInfo.getTotalBytes();
            if (i == -3) {
                notificationItem.f31095b = downloadInfo.getTotalBytes();
            } else {
                notificationItem.f31095b = downloadInfo.getCurBytes();
            }
            notificationItem.a(i, baseException, z);
        }
    }
}
