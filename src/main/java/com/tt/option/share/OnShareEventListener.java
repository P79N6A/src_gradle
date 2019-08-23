package com.tt.option.share;

import com.tt.miniapphost.process.annotation.MiniAppProcess;

public interface OnShareEventListener {
    @MiniAppProcess
    void onCancel(String str);

    @MiniAppProcess
    void onFail(String str);

    @MiniAppProcess
    void onSuccess(String str);
}
