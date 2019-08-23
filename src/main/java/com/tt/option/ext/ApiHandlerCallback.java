package com.tt.option.ext;

import com.tt.miniapphost.process.annotation.MiniAppProcess;

@MiniAppProcess
public interface ApiHandlerCallback {
    @MiniAppProcess
    void callback(int i, String str);
}
