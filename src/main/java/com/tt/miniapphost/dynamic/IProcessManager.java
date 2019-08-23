package com.tt.miniapphost.dynamic;

import android.content.Context;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.HostProcess;

public interface IProcessManager {
    @HostProcess
    void killAllProcess();

    @AnyProcess
    void preloadEmptyProcess(@Nullable Context context, boolean z);
}
