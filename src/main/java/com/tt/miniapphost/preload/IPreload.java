package com.tt.miniapphost.preload;

import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.io.File;

@MiniAppProcess
public interface IPreload {

    public interface PreloadState {
        @MiniAppProcess
        void onPreloadSuccess(int i);
    }

    @MiniAppProcess
    void clean();

    @MiniAppProcess
    void preload(File file, PreloadState preloadState);

    void preloadWebViewOnProcessInit();
}
