package com.tt.option.ext;

import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.BaseAbstractHostDepend;
import com.tt.option.ext.HostOptionApiDepend;

public class AbstractHostOptionApiDepend extends BaseAbstractHostDepend<HostOptionApiDepend> implements HostOptionApiDepend {
    @AnyProcess
    public String getImplClassName() {
        return null;
    }

    @AnyProcess
    public HostOptionApiDepend.ExtApiHandlerCreator createExtHandler() {
        if (inject()) {
            return ((HostOptionApiDepend) this.defaultOptionDepend).createExtHandler();
        }
        return null;
    }
}
