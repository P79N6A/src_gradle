package com.tt.frontendapiinterface;

import com.tt.miniapphost.process.annotation.MiniAppProcess;

@MiniAppProcess
public interface IKeyboardObserver {
    @MiniAppProcess
    void onKeyboardHeightChanged(int i, int i2);
}
