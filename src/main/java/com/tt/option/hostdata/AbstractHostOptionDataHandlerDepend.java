package com.tt.option.hostdata;

import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import com.tt.option.BaseAbstractHostDepend;
import java.util.List;

@HostProcess
public class AbstractHostOptionDataHandlerDepend extends BaseAbstractHostDepend<HostOptionCallHandlerDepend> implements HostOptionCallHandlerDepend {
    @HostProcess
    public List<IAsyncHostDataHandler> createAsyncHostDataHandlerList() {
        return null;
    }

    @HostProcess
    public List<ISyncHostDataHandler> createSyncHostDataHandlerList() {
        return null;
    }

    @HostProcess
    public String getImplClassName() {
        return null;
    }
}
