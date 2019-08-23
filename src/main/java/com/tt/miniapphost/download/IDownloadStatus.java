package com.tt.miniapphost.download;

public interface IDownloadStatus {
    void onCancel();

    void onDownloadStart();

    void onDownloading(int i);

    void onFail();

    void onFinish();

    void onIdle();

    void onInstalled();

    void onPause(int i);
}
