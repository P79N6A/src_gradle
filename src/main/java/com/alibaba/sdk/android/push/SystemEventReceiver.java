package com.alibaba.sdk.android.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.push.PushDependManager;

@Deprecated
public class SystemEventReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            PushDependManager.inst().tryHookInit(context);
        } catch (Throwable unused) {
        }
    }
}
