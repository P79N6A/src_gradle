package com.ss.android.socialbase.downloader.e;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.util.List;

public final class c {
    public static void a(int i, List<IDownloadListener> list, boolean z, DownloadInfo downloadInfo, BaseException baseException) {
        if (z && list != null) {
            try {
                synchronized (list) {
                    for (IDownloadListener next : list) {
                        if (next != null) {
                            switch (i) {
                                case -7:
                                    if (!(next instanceof AbsDownloadListener)) {
                                        break;
                                    } else {
                                        ((AbsDownloadListener) next).onIntercept(downloadInfo);
                                        break;
                                    }
                                case -6:
                                    next.onFirstSuccess(downloadInfo);
                                    break;
                                case -5:
                                case -2:
                                    next.onPause(downloadInfo);
                                    break;
                                case -4:
                                    next.onCanceled(downloadInfo);
                                    break;
                                case -3:
                                    next.onSuccessed(downloadInfo);
                                    break;
                                case -1:
                                    next.onFailed(downloadInfo, baseException);
                                    break;
                                case 1:
                                    next.onPrepare(downloadInfo);
                                    break;
                                case 2:
                                    next.onStart(downloadInfo);
                                    break;
                                case 4:
                                    next.onProgress(downloadInfo);
                                    break;
                                case 5:
                                    next.onRetry(downloadInfo, baseException);
                                    break;
                                case 6:
                                    next.onFirstStart(downloadInfo);
                                    break;
                                case e.l /*?: ONE_ARG  (7 int)*/:
                                    next.onRetryDelay(downloadInfo, baseException);
                                    break;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
