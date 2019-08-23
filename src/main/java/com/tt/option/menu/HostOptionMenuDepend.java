package com.tt.option.menu;

import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.util.List;

@MiniAppProcess
public interface HostOptionMenuDepend {
    @MiniAppProcess
    List<ITitleMenuItem> createTitleMenuItems();
}
