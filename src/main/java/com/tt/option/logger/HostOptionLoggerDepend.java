package com.tt.option.logger;

import android.support.annotation.Nullable;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public interface HostOptionLoggerDepend {
    @Nullable
    @AnyProcess
    AppBrandLogger.ILogger createLogger();
}
