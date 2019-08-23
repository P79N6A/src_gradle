package com.tt.option.share;

import com.tt.miniapphost.process.annotation.MiniAppProcess;

public interface OnGetShareTokenInfoListener {
    @MiniAppProcess
    void onFail();

    @MiniAppProcess
    void onSuccess(ShareInfoModel shareInfoModel);
}
