package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

@Deprecated
public interface IDownloadDepend {
    void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i);
}
