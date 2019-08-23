package com.xiaomi.push.mpcd.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.push.eq;

public class BroadcastActionsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private eq f82443a;

    public BroadcastActionsReceiver(eq eqVar) {
        this.f82443a = eqVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f82443a != null) {
            this.f82443a.a(context, intent);
        }
    }
}
