package com.tt.option.hostdata;

import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import java.util.List;

@HostProcess
public interface HostOptionCallHandlerDepend {
    @HostProcess
    List<IAsyncHostDataHandler> createAsyncHostDataHandlerList();

    @HostProcess
    List<ISyncHostDataHandler> createSyncHostDataHandlerList();
}
