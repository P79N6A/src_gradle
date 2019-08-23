package com.tt.option.menu;

import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.option.BaseAbstractHostDepend;
import java.util.List;

@MiniAppProcess
public class AbstractHostOptionMenuDepend extends BaseAbstractHostDepend<HostOptionMenuDepend> implements HostOptionMenuDepend {
    @MiniAppProcess
    public List<ITitleMenuItem> createTitleMenuItems() {
        return null;
    }

    @MiniAppProcess
    public String getImplClassName() {
        return null;
    }
}
