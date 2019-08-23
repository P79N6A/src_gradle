package com.ss.android.socialbase.appdownloader.depend;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface IAppDownloadMonitorListener {
    void onAppDownloadMonitorSend(DownloadInfo downloadInfo, BaseException baseException, int i);
}
