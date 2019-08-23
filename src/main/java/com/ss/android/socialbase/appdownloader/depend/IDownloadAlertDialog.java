package com.ss.android.socialbase.appdownloader.depend;

import android.support.annotation.Nullable;
import android.widget.Button;

public interface IDownloadAlertDialog {
    void dismiss();

    @Nullable
    Button getButton(int i);

    boolean isShowing();

    void show();
}
