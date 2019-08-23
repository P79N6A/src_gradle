package com.tt.miniapphost;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.essential.HostEssentialDepend;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.HostOptionDependRegister;

public interface IAppbrandInitializer {
    @AnyProcess
    @NonNull
    HostEssentialDepend createEssentialDepend();

    @Nullable
    @AnyProcess
    HostOptionDependRegister createOptionDepend();

    @AnyProcess
    void init(Application application, String str, boolean z);

    @AnyProcess
    boolean isDebug();
}
