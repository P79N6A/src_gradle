package com.tt.frontendapiinterface;

import com.tt.miniapphost.process.annotation.MiniAppProcess;

@MiniAppProcess
public interface IBackPressedListener {
    @MiniAppProcess
    boolean onBackPressed();
}
