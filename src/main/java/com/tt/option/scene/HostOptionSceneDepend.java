package com.tt.option.scene;

import com.tt.miniapphost.process.annotation.MiniAppProcess;

public interface HostOptionSceneDepend {
    @MiniAppProcess
    String getScene(String str);
}
