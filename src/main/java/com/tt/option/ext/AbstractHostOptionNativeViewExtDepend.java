package com.tt.option.ext;

import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.option.BaseAbstractHostDepend;
import com.tt.option.ext.HostOptionNativeViewExtDepend;

@MiniAppProcess
public class AbstractHostOptionNativeViewExtDepend extends BaseAbstractHostDepend<HostOptionNativeViewExtDepend> implements HostOptionNativeViewExtDepend {
    @MiniAppProcess
    public HostOptionNativeViewExtDepend.ExtNativeViewCreator createNativeView() {
        return null;
    }

    @MiniAppProcess
    public String getImplClassName() {
        return null;
    }
}
