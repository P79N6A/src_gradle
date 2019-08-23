package com.tt.miniapphost.process.callback;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

@AnyProcess
public interface IIpcCallbackManager {
    @AnyProcess
    void handleIpcCallBack(int i, @Nullable CrossProcessDataEntity crossProcessDataEntity);

    @AnyProcess
    void onCallProcessDead(@NonNull String str);

    @AnyProcess
    void registerIpcCallback(@NonNull IpcCallback ipcCallback);

    @AnyProcess
    void unregisterIpcCallback(int i);

    @AnyProcess
    void unregisterIpcCallback(@NonNull IpcCallback ipcCallback);
}
