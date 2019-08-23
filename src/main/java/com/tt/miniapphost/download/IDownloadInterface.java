package com.tt.miniapphost.download;

import android.support.annotation.NonNull;
import com.tt.miniapphost.process.annotation.MiniAppProcess;

@MiniAppProcess
public interface IDownloadInterface {
    @MiniAppProcess
    void bindDl(@NonNull String str, @NonNull IDownloadStatus iDownloadStatus, @NonNull String str2, @NonNull String str3, @NonNull String str4);

    @MiniAppProcess
    void cancel(@NonNull String str);

    @MiniAppProcess
    void unbind(@NonNull String str);
}
