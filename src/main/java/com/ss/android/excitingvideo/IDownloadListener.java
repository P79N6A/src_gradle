package com.ss.android.excitingvideo;

import android.app.Activity;
import com.ss.android.excitingvideo.model.BaseAd;

public interface IDownloadListener {
    void bind(Activity activity, long j, String str, IDownloadStatus iDownloadStatus, BaseAd baseAd);

    void download(Activity activity, String str, BaseAd baseAd);

    boolean isDownloaded(Activity activity, String str);

    void unbind(Activity activity, String str, BaseAd baseAd);
}
