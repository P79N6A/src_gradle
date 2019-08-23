package com.tt.option.scene;

import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.option.BaseAbstractHostDepend;

public class AbstractHostOptionSceneDepend extends BaseAbstractHostDepend<HostOptionSceneDepend> implements HostOptionSceneDepend {
    @MiniAppProcess
    public String getImplClassName() {
        return "HostOptionSceneDependImpl";
    }

    @MiniAppProcess
    public String getScene(String str) {
        if (inject()) {
            return ((HostOptionSceneDepend) this.defaultOptionDepend).getScene(str);
        }
        return "";
    }
}
