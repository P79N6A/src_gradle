package com.ss.android.socialbase.appdownloader.depend;

import android.content.Context;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public class AbsAppDownloadEventListener implements IAppDownloadEventListener {
    public String getNotifyProcessName() {
        return null;
    }

    public boolean installIntercept(boolean z) {
        return false;
    }

    public void onAppDownloadCancel(DownloadInfo downloadInfo) {
    }

    public void onAppDownloadEvent(int i, String str, int i2, long j) {
    }

    public void onAppInstallError(int i, String str, String str2, String str3) {
    }

    public void onAppInstalled(Context context, String str) {
    }
}
