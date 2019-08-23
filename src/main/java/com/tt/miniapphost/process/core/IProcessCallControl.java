package com.tt.miniapphost.process.core;

import android.content.Intent;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.data.CrossProcessInformation;

public interface IProcessCallControl {
    @AnyThread
    void callProcessAsync(@NonNull CrossProcessCallEntity crossProcessCallEntity, @Nullable IpcCallback ipcCallback);

    @Nullable
    @WorkerThread
    CrossProcessDataEntity callProcessSync(@NonNull CrossProcessCallEntity crossProcessCallEntity);

    @AnyThread
    void callback(@NonNull CrossProcessInformation.CallerProcess callerProcess, @Nullable CrossProcessDataEntity crossProcessDataEntity, boolean z);

    @WorkerThread
    @AnyProcess
    void handleAsyncCall(@Nullable Intent intent);

    @WorkerThread
    @AnyProcess
    void handleAsyncCall(@NonNull CrossProcessCallEntity crossProcessCallEntity, int i);

    @Nullable
    @WorkerThread
    @AnyProcess
    CrossProcessDataEntity handleSyncCall(@NonNull CrossProcessCallEntity crossProcessCallEntity);
}
