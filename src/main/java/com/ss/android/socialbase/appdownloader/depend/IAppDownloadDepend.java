package com.ss.android.socialbase.appdownloader.depend;

import android.content.Context;

public interface IAppDownloadDepend {
    boolean getAllowBootReceiver();

    boolean getAllowNetwork(Context context);

    IDownloadAlertDialogBuilder getThemedAlertDlgBuilder(Context context);
}
