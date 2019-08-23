package com.tt.miniapphost.process.callback;

import android.support.annotation.Nullable;
import com.tt.miniapphost.IDCreator;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

@AnyProcess
public abstract class IpcCallback {
    private String mCallProcessIdentify;
    private final int mCallbackId = IDCreator.create();

    @AnyProcess
    public void onCallProcessDead() {
    }

    @AnyProcess
    public abstract void onIpcCallback(@Nullable CrossProcessDataEntity crossProcessDataEntity);

    @Nullable
    public String getCallProcessIdentify() {
        return this.mCallProcessIdentify;
    }

    public int getCallbackId() {
        return this.mCallbackId;
    }

    public IpcCallback() {
    }

    @AnyProcess
    public void finishListenIpcCallback() {
        IpcCallbackManagerProxy.getInstance().unregisterIpcCallback(this.mCallbackId);
    }

    public void setCallProcessIdentify(@Nullable String str) {
        this.mCallProcessIdentify = str;
    }

    public IpcCallback(String str) {
        this.mCallProcessIdentify = str;
    }
}
