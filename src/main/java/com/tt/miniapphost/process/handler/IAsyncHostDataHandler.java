package com.tt.miniapphost.process.handler;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.helper.AsyncIpcHandler;

public interface IAsyncHostDataHandler {
    @HostProcess
    void action(@Nullable CrossProcessDataEntity crossProcessDataEntity, @NonNull AsyncIpcHandler asyncIpcHandler);

    @HostProcess
    @NonNull
    String getType();
}
