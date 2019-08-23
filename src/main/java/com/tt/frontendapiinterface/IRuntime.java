package com.tt.frontendapiinterface;

import com.tt.miniapphost.process.annotation.MiniAppProcess;

@MiniAppProcess
public interface IRuntime {
    @MiniAppProcess
    void executeScript(String str);
}
