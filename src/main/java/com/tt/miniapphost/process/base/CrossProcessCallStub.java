package com.tt.miniapphost.process.base;

import com.tt.miniapphost.process.base.ICrossProcessCall;
import com.tt.miniapphost.process.bridge.ProcessCallControlBridge;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

public class CrossProcessCallStub extends ICrossProcessCall.Stub {
    public CrossProcessDataEntity syncCall(CrossProcessCallEntity crossProcessCallEntity) {
        return ProcessCallControlBridge.handleSyncCall(crossProcessCallEntity);
    }

    public void asyncCall(CrossProcessCallEntity crossProcessCallEntity, int i) {
        ProcessCallControlBridge.handleAsyncCall(crossProcessCallEntity, i);
    }
}
