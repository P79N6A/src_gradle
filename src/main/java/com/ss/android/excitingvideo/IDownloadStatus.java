package com.ss.android.excitingvideo;

public interface IDownloadStatus {
    void onDownloadStart();

    void onDownloading(int i);

    void onFail();

    void onFinish();

    void onIdle();

    void onInstalled();

    void onPause(int i);
}
