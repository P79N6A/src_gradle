package com.tt.option.logger;

import android.support.annotation.Nullable;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.BaseAbstractHostDepend;

@AnyProcess
public class AbstractHostOptionLoggerDepend extends BaseAbstractHostDepend<HostOptionLoggerDepend> implements HostOptionLoggerDepend {
    @AnyProcess
    public String getImplClassName() {
        return "HostOptionLoggerDependImpl";
    }

    @Nullable
    @AnyProcess
    public AppBrandLogger.ILogger createLogger() {
        if (inject()) {
            return ((HostOptionLoggerDepend) this.defaultOptionDepend).createLogger();
        }
        return null;
    }
}
