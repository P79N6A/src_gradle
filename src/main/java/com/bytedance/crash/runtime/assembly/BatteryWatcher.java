package com.bytedance.crash.runtime.assembly;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class BatteryWatcher {

    /* renamed from: a  reason: collision with root package name */
    public int f19513a;

    class BatteryBroadcastReceiver extends BroadcastReceiver {
        private BatteryBroadcastReceiver() {
        }

        /* synthetic */ BatteryBroadcastReceiver(BatteryWatcher batteryWatcher, byte b2) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                BatteryWatcher.this.f19513a = (int) ((((float) intent.getIntExtra("level", 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100)));
            }
        }
    }

    BatteryWatcher(Context context) {
        context.registerReceiver(new BatteryBroadcastReceiver(this, (byte) 0), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }
}
