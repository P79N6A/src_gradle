package com.ss.optimizer.live.sdk.dns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class DnsOptimizer$2 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f78422a;

    DnsOptimizer$2(a aVar) {
        this.f78422a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (!a.a(context)) {
            this.f78422a.f78423a.removeMessages(1024);
            return;
        }
        this.f78422a.f78423a.removeMessages(1024);
        this.f78422a.f78423a.sendEmptyMessageDelayed(1024, 2000);
    }
}
