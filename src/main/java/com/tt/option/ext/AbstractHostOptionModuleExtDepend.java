package com.tt.option.ext;

import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.BaseAbstractHostDepend;
import java.util.List;

@AnyProcess
public class AbstractHostOptionModuleExtDepend extends BaseAbstractHostDepend<HostOptionModuleExtDepend> implements HostOptionModuleExtDepend {
    @AnyProcess
    public List<NativeModule> createNativeModules(AppbrandContext appbrandContext) {
        return null;
    }

    @AnyProcess
    public String getImplClassName() {
        return null;
    }
}
