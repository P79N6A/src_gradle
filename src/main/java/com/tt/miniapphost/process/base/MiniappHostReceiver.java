package com.tt.miniapphost.process.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.bridge.ProcessCallControlBridge;

public class MiniappHostReceiver extends BroadcastReceiver {
    @MiniAppProcess
    public void onReceive(Context context, Intent intent) {
        ProcessCallControlBridge.handleMiniAppProcessReceivedAsyncCall(intent);
    }
}
