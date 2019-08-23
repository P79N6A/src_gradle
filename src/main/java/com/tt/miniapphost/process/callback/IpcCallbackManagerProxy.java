package com.tt.miniapphost.process.callback;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

@AnyProcess
public class IpcCallbackManagerProxy implements IIpcCallbackManager {
    private IIpcCallbackManager mIpcCallbackManager;

    static class Holder {
        public static IpcCallbackManagerProxy sInstance = new IpcCallbackManagerProxy();

        private Holder() {
        }
    }

    private IpcCallbackManagerProxy() {
    }

    public static IpcCallbackManagerProxy getInstance() {
        return Holder.sInstance;
    }

    @AnyProcess
    private boolean checkValid() {
        if (this.mIpcCallbackManager == null) {
            synchronized (IpcCallbackManagerProxy.class) {
                if (this.mIpcCallbackManager == null) {
                    try {
                        this.mIpcCallbackManager = (IIpcCallbackManager) Class.forName("com.tt.miniapp.process.callback.IpcCallbackManagerImpl").newInstance();
                    } catch (Throwable th) {
                        AppBrandLogger.eWithThrowable("IpcCallbackManagerProxy", "checkValid fail ", th);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void onCallProcessDead(@NonNull String str) {
        if (checkValid()) {
            this.mIpcCallbackManager.onCallProcessDead(str);
        }
    }

    @AnyProcess
    public void registerIpcCallback(@NonNull IpcCallback ipcCallback) {
        if (checkValid()) {
            this.mIpcCallbackManager.registerIpcCallback(ipcCallback);
        }
    }

    public void unregisterIpcCallback(int i) {
        if (checkValid()) {
            this.mIpcCallbackManager.unregisterIpcCallback(i);
        }
    }

    @AnyProcess
    public void unregisterIpcCallback(@NonNull IpcCallback ipcCallback) {
        if (checkValid()) {
            this.mIpcCallbackManager.unregisterIpcCallback(ipcCallback);
        }
    }

    public void handleIpcCallBack(int i, @Nullable CrossProcessDataEntity crossProcessDataEntity) {
        if (checkValid()) {
            this.mIpcCallbackManager.handleIpcCallBack(i, crossProcessDataEntity);
        }
    }
}
