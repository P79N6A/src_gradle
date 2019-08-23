package com.tt.option.ext;

import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.util.List;

public interface HostOptionModuleExtDepend {
    @AnyProcess
    List<NativeModule> createNativeModules(AppbrandContext appbrandContext);
}
