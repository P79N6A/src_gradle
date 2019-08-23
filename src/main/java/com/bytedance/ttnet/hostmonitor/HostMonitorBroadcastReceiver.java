package com.bytedance.ttnet.hostmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.ttnet.hostmonitor.f;

public class HostMonitorBroadcastReceiver extends BroadcastReceiver {
    public final void a(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(new d(context).c());
            context.registerReceiver(this, intentFilter);
        } catch (Throwable unused) {
        }
    }

    public void a(e eVar) {
        "host status changed: " + eVar;
        f.c.f22653a.f22651a.compareTo(f.a.INFO);
    }

    public void onReceive(Context context, Intent intent) {
        try {
            String c2 = new d(context).c();
            if (!(intent == null || c2 == null)) {
                if (intent.getAction().equals(c2)) {
                    a((e) intent.getParcelableExtra("HostStatus"));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
