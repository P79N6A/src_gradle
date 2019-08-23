package com.tt.option.share;

import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.MiniAppProcess;

public interface HostOptionShareDepend {

    @MiniAppProcess
    public interface ObtainShareInfoCallback {
        @MiniAppProcess
        void onFail();

        @MiniAppProcess
        void onSuccess(String str, OnShareEventListener onShareEventListener);
    }

    @MiniAppProcess
    void getShareBaseInfo(String str, OnGetShareBaseInfoListener onGetShareBaseInfoListener);

    @MiniAppProcess
    void getShareToken(ShareInfoModel shareInfoModel, OnGetShareTokenInfoListener onGetShareTokenInfoListener);

    @Nullable
    @MiniAppProcess
    ObtainShareInfoCallback obtainShareInfoCallback();
}
