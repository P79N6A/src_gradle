package com.ss.android.download.api.b.a;

import android.support.annotation.NonNull;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface a {
    void a(@NonNull DownloadInfo downloadInfo);

    void a(@NonNull DownloadInfo downloadInfo, BaseException baseException, String str);

    void a(@NonNull DownloadInfo downloadInfo, String str);
}
