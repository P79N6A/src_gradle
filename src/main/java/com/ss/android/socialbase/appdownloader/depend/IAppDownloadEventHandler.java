package com.ss.android.socialbase.appdownloader.depend;

import android.content.Context;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface IAppDownloadEventHandler {
    void handleAppInstallError(int i, int i2, String str, String str2, String str3);

    void handleAppInstalled(Context context, String str);

    void handleDownloadCancel(DownloadInfo downloadInfo);

    void handleDownloadEvent(int i, int i2, String str, int i3, long j);

    boolean installIntercept(int i, boolean z);

    boolean isForbidInvalidatePackageInstall();
}
