package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.b.a;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public abstract class AbsDownloadListener implements IDownloadListener {
    private static final String TAG = "AbsDownloadListener";

    public void onCanceled(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            new StringBuilder(" onCanceled -- ").append(downloadInfo.getName());
        }
    }

    public void onFirstStart(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            new StringBuilder(" onFirstStart -- ").append(downloadInfo.getName());
        }
    }

    public void onFirstSuccess(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            new StringBuilder(" onFirstSuccess -- ").append(downloadInfo.getName());
        }
    }

    public void onIntercept(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            new StringBuilder(" onIntercept -- ").append(downloadInfo.getName());
        }
    }

    public void onPause(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            new StringBuilder(" onPause -- ").append(downloadInfo.getName());
        }
    }

    public void onPrepare(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            new StringBuilder(" onPrepare -- ").append(downloadInfo.getName());
        }
    }

    public void onStart(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            new StringBuilder(" onStart -- ").append(downloadInfo.getName());
        }
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            new StringBuilder(" onSuccessed -- ").append(downloadInfo.getName());
        }
    }

    public void onProgress(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(downloadInfo.getName());
            sb.append(" onProgress -- %");
            sb.append((int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f));
        }
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (a.a() && downloadInfo != null) {
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            String.format("onFailed on %s because of : %s", objArr);
        }
    }

    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (a.a() && downloadInfo != null) {
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            String.format("onRetry on %s because of : %s", objArr);
        }
    }

    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (a.a() && downloadInfo != null) {
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            String.format("onRetryDelay on %s because of : %s", objArr);
        }
    }
}
