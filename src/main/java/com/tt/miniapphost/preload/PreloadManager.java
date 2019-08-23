package com.tt.miniapphost.preload;

import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.preload.IPreload;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.io.File;

@MiniAppProcess
public class PreloadManager implements IPreload {
    IPreload mPreloadImpl;

    static class Holder {
        static PreloadManager inst = new PreloadManager();

        Holder() {
        }
    }

    public void clean() {
    }

    private PreloadManager() {
    }

    public static PreloadManager getInst() {
        return Holder.inst;
    }

    @MiniAppProcess
    public void preloadWebViewOnProcessInit() {
        if (this.mPreloadImpl == null) {
            initPreload();
        }
        if (this.mPreloadImpl != null) {
            this.mPreloadImpl.preloadWebViewOnProcessInit();
        }
    }

    /* access modifiers changed from: package-private */
    @MiniAppProcess
    public void initPreload() {
        try {
            Class<?> cls = Class.forName("com.tt.miniapp.preload.PreloadManager");
            Object invoke = cls.getMethod("getInst", new Class[0]).invoke(cls, new Object[0]);
            if (invoke != null) {
                this.mPreloadImpl = (IPreload) invoke;
            }
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "PreloadManager", e2.getStackTrace());
        }
    }

    @MiniAppProcess
    public void preload(File file, IPreload.PreloadState preloadState) {
        if (this.mPreloadImpl == null) {
            initPreload();
        }
        if (this.mPreloadImpl != null) {
            this.mPreloadImpl.preload(file, preloadState);
        }
    }
}
