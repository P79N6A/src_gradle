package com.tt.miniapphost.process.helper;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.bridge.ProcessCallControlBridge;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.data.CrossProcessInformation;

public class AsyncIpcHandler {
    @Nullable
    private final CrossProcessInformation.CallerProcess mCallerProcess;

    @Nullable
    public CrossProcessInformation.CallerProcess getCallerProcess() {
        return this.mCallerProcess;
    }

    public AsyncIpcHandler(@Nullable CrossProcessInformation.CallerProcess callerProcess) {
        this.mCallerProcess = callerProcess;
    }

    @WorkerThread
    public void callback(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        callback(crossProcessDataEntity, false);
    }

    @WorkerThread
    public void callback(@Nullable CrossProcessDataEntity crossProcessDataEntity, boolean z) {
        if (this.mCallerProcess == null) {
            AppBrandLogger.e("AsyncIpcHandler", "mCallerProcess == null", crossProcessDataEntity);
            return;
        }
        ProcessCallControlBridge.ipcCallback(this.mCallerProcess, crossProcessDataEntity, z);
    }
}
