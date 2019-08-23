package com.tt.miniapphost.process.base;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;

public class HostCrossProcessCallService extends Service {
    @Nullable
    public IBinder onBind(Intent intent) {
        String processCommunicationPermission = AppbrandContext.getInst().getProcessCommunicationPermission();
        if (TextUtils.isEmpty(processCommunicationPermission) || checkCallingOrSelfPermission(processCommunicationPermission) != -1) {
            return new CrossProcessCallStub().asBinder();
        }
        AppBrandLogger.e("HostCrossProcessCallService", "do not have processCommunicationPermission");
        return null;
    }
}
