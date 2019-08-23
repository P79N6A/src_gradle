package com.tt.miniapphost.process.bridge;

import android.content.Intent;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.core.IProcessCallControl;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.data.CrossProcessInformation;

public class ProcessCallControlBridge {
    private static IProcessCallControl sProcessCallControl;

    @AnyThread
    @AnyProcess
    private static boolean checkValid() {
        if (sProcessCallControl == null) {
            synchronized (ProcessCallControlBridge.class) {
                if (sProcessCallControl == null) {
                    try {
                        sProcessCallControl = (IProcessCallControl) Class.forName("com.tt.miniapp.process.core.ProcessCallControl").newInstance();
                    } catch (Throwable th) {
                        AppBrandLogger.eWithThrowable("ProcessCallControlBridge", "checkValidFail", th);
                        return false;
                    }
                }
            }
        }
        if (sProcessCallControl != null) {
            return true;
        }
        return false;
    }

    @WorkerThread
    @MiniAppProcess
    public static void handleMiniAppProcessReceivedAsyncCall(@Nullable Intent intent) {
        if (checkValid()) {
            sProcessCallControl.handleAsyncCall(intent);
        }
    }

    @Nullable
    @WorkerThread
    @HostProcess
    public static CrossProcessDataEntity handleSyncCall(@NonNull CrossProcessCallEntity crossProcessCallEntity) {
        if (!checkValid()) {
            return null;
        }
        return sProcessCallControl.handleSyncCall(crossProcessCallEntity);
    }

    @WorkerThread
    @HostProcess
    public static void handleAsyncCall(@NonNull CrossProcessCallEntity crossProcessCallEntity, int i) {
        if (checkValid()) {
            sProcessCallControl.handleAsyncCall(crossProcessCallEntity, i);
        }
    }

    @Nullable
    @WorkerThread
    @MiniAppProcess
    public static CrossProcessDataEntity callHostProcessSync(@NonNull String str, @Nullable CrossProcessDataEntity crossProcessDataEntity) {
        if (!checkValid()) {
            return null;
        }
        return sProcessCallControl.callProcessSync(new CrossProcessCallEntity("hostProcess", str, crossProcessDataEntity));
    }

    @AnyThread
    @AnyProcess
    public static void ipcCallback(@NonNull CrossProcessInformation.CallerProcess callerProcess, @Nullable CrossProcessDataEntity crossProcessDataEntity, boolean z) {
        if (checkValid()) {
            sProcessCallControl.callback(callerProcess, crossProcessDataEntity, z);
        }
    }

    @AnyThread
    @MiniAppProcess
    public static void callHostProcessAsync(@NonNull String str, @Nullable CrossProcessDataEntity crossProcessDataEntity, @Nullable IpcCallback ipcCallback) {
        if (checkValid()) {
            sProcessCallControl.callProcessAsync(new CrossProcessCallEntity("hostProcess", str, crossProcessDataEntity), ipcCallback);
        }
    }

    @AnyThread
    @HostProcess
    public static void callMiniAppProcessAsync(@NonNull String str, @NonNull String str2, @Nullable CrossProcessDataEntity crossProcessDataEntity, @Nullable IpcCallback ipcCallback) {
        if (checkValid()) {
            sProcessCallControl.callProcessAsync(new CrossProcessCallEntity(str, str2, crossProcessDataEntity), ipcCallback);
        }
    }
}
