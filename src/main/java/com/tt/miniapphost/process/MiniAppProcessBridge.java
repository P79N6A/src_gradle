package com.tt.miniapphost.process;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.bridge.ProcessCallControlBridge;
import com.tt.miniapphost.process.callback.IpcCallback;

public class MiniAppProcessBridge {
    @AnyThread
    @HostProcess
    public static void getSnapshot(@NonNull String str, @Nullable IpcCallback ipcCallback) {
        ProcessCallControlBridge.callMiniAppProcessAsync(str, "getSnapshot", null, ipcCallback);
    }
}
