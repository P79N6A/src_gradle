package com.ss.android.socialbase.appdownloader.depend;

import android.content.Context;

public class AbsAppDownloadDepend implements IAppDownloadDepend {
    public boolean getAllowBootReceiver() {
        return true;
    }

    public boolean getAllowNetwork(Context context) {
        return true;
    }

    public IDownloadAlertDialogBuilder getThemedAlertDlgBuilder(Context context) {
        return null;
    }

    public boolean isForbiddenInstallForInvalidatePackageName() {
        return false;
    }

    public boolean needClearWhenTaskReset() {
        return true;
    }
}
