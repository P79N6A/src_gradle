package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class cm extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ch f81906a;

    cm(ch chVar) {
        this.f81906a = chVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            if (this.f81906a.f227a.hasMessages(1)) {
                this.f81906a.f227a.removeMessages(1);
            }
            this.f81906a.f227a.sendMessageDelayed(this.f81906a.f227a.obtainMessage(1), 10000);
        }
    }
}
