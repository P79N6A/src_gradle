package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.ss.android.socialbase.appdownloader.view.DownloadSizeLimitActivity;
import com.ss.android.socialbase.downloader.depend.b;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.a;
import java.io.File;

public class DownloadNotificationListener extends b {
    public Context context;
    private String extra;
    private int id;
    private a notificationItem;
    private String targetFileName;
    private String targetSavePath;
    private String title;

    public a createNotificationItem() {
        if (this.notificationItem != null || this.context == null) {
            return this.notificationItem;
        }
        a aVar = new a(this.context, this.id, this.title, this.targetSavePath, this.targetFileName, this.extra);
        return aVar;
    }

    public DownloadNotificationListener(a aVar) {
        this.context = com.ss.android.socialbase.downloader.downloader.b.q();
        this.notificationItem = aVar;
    }

    public void onPause(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onPause(downloadInfo);
        }
    }

    public void onPrepare(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onPrepare(downloadInfo);
        }
    }

    public void onProgress(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onProgress(downloadInfo);
        }
    }

    public void onStart(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onStart(downloadInfo);
        }
    }

    public void onSuccessed(final DownloadInfo downloadInfo) {
        if (downloadInfo != null && this.context != null) {
            if (downloadInfo.canShowNotification() && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
                super.onSuccessed(downloadInfo);
            }
            if ((!downloadInfo.isAutoResumed() || downloadInfo.isShowNotificationForNetworkResumed()) && !AppDownloadUtils.canNotAutoInstall(downloadInfo.getExtra()) && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals("application/vnd.android.package-archive")) {
                final int startViewIntent = AppDownloadUtils.startViewIntent(this.context, downloadInfo.getId(), false);
                com.ss.android.socialbase.downloader.downloader.b.f().execute(new Runnable() {
                    public final void run() {
                        IAppDownloadEventHandler appDownloadEventHandler = AppDownloader.getInstance().getAppDownloadEventHandler();
                        u downloadNotificationEventListener = Downloader.getInstance(DownloadNotificationListener.this.context).getDownloadNotificationEventListener(downloadInfo.getId());
                        if (!(appDownloadEventHandler == null && downloadNotificationEventListener == null)) {
                            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                            if (file.exists()) {
                                try {
                                    PackageInfo packageArchiveInfo = DownloadNotificationListener.this.context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), AppDownloadUtils.getPackageInfoFlag());
                                    if (packageArchiveInfo != null) {
                                        String str = packageArchiveInfo.packageName;
                                        if (startViewIntent != 1 && !TextUtils.isEmpty(downloadInfo.getPackageName())) {
                                            str = downloadInfo.getPackageName();
                                        }
                                        String str2 = str;
                                        if (appDownloadEventHandler != null) {
                                            appDownloadEventHandler.handleDownloadEvent(downloadInfo.getId(), 1, str2, -3, downloadInfo.getDownloadTime());
                                        }
                                        if (downloadNotificationEventListener != null) {
                                            downloadNotificationEventListener.a(1, downloadInfo, str2, "");
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public DownloadNotificationListener(Context context2, DownloadInfo downloadInfo) {
        if (context2 != null) {
            this.context = context2.getApplicationContext();
        } else {
            this.context = com.ss.android.socialbase.downloader.downloader.b.q();
        }
        if (downloadInfo != null) {
            this.id = downloadInfo.getId();
            this.title = downloadInfo.getTitle();
            this.targetSavePath = downloadInfo.getSavePath();
            this.targetFileName = downloadInfo.getName();
            this.extra = downloadInfo.getExtra();
        }
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (downloadInfo != null && this.context != null && downloadInfo.canShowNotification() && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onFailed(downloadInfo, baseException);
            if (baseException != null && (baseException.getErrorCode() == 1013 || baseException.getErrorCode() == 1024)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.putExtra("extra_click_download_ids", downloadInfo.getId());
                intent.setClassName(this.context.getPackageName(), DownloadSizeLimitActivity.class.getName());
                intent.setFlags(268435456);
                this.context.startActivity(intent);
            }
        }
    }

    public DownloadNotificationListener(Context context2, int i, String str, String str2, String str3, String str4) {
        if (context2 != null) {
            this.context = context2.getApplicationContext();
        } else {
            this.context = com.ss.android.socialbase.downloader.downloader.b.q();
        }
        this.id = i;
        this.title = str;
        this.targetSavePath = str2;
        this.targetFileName = str3;
        this.extra = str4;
    }
}
