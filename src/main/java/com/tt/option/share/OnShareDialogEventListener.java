package com.tt.option.share;

import com.tt.miniapphost.process.annotation.MiniAppProcess;

public interface OnShareDialogEventListener {
    @MiniAppProcess
    void onCancel();

    @MiniAppProcess
    void onItemClick(String str, boolean z);
}
