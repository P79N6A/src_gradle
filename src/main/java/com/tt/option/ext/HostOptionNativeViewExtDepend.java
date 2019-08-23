package com.tt.option.ext;

import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapphost.process.annotation.MiniAppProcess;

@MiniAppProcess
public interface HostOptionNativeViewExtDepend {

    public interface ExtNativeViewCreator {
        @MiniAppProcess
        WebBaseEventHandler create(String str, IBaseRender iBaseRender, String str2, int i);
    }

    @MiniAppProcess
    ExtNativeViewCreator createNativeView();
}
