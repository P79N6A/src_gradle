package com.bytedance.ttnet.hostmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConnectivityReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        try {
            f.b("HostMonitor", "onReceive");
            if (HostMonitor.a(context) == a.NONE) {
                str = "connection unavailable";
            } else {
                str = "connection available via " + r3;
            }
            f.b("HostMonitor", str);
        } catch (Throwable unused) {
        }
    }
}
