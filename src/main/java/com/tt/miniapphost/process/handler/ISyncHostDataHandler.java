package com.tt.miniapphost.process.handler;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

public interface ISyncHostDataHandler {
    @HostProcess
    CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity);

    @HostProcess
    @NonNull
    String getType();
}
