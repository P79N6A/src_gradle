package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;

public class by extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bw f81878a;

    private by(bw bwVar) {
        this.f81878a = bwVar;
    }

    public void onReceive(Context context, Intent intent) {
        Handler a2;
        int i;
        if (intent != null) {
            String action = intent.getAction();
            if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                if (networkInfo != null) {
                    if (networkInfo.isConnected()) {
                        a2 = bw.a(this.f81878a);
                        i = 200;
                    } else if (networkInfo.getState() == NetworkInfo.State.DISCONNECTED) {
                        a2 = bw.a(this.f81878a);
                        i = 201;
                    }
                    a2.obtainMessage(i, networkInfo).sendToTarget();
                }
            }
        }
    }
}
