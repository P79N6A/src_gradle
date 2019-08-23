package com.tt.frontendapiinterface;

import com.tt.miniapphost.process.annotation.MiniAppProcess;

@MiniAppProcess
public interface IJsBridge {
    @MiniAppProcess
    String invoke(String str, String str2, int i);

    @MiniAppProcess
    void invokeApi(int i, String str);

    @MiniAppProcess
    void invokeTimer(String str, int i);

    @MiniAppProcess
    void onAppLaunch();

    @MiniAppProcess
    void onHide();

    @MiniAppProcess
    void onShow();

    @MiniAppProcess
    void release();

    @MiniAppProcess
    void sendMsgToJsCore(String str, String str2);

    @MiniAppProcess
    void sendMsgToJsCore(String str, String str2, int i);
}
