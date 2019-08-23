package com.mapbox.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class JobSchedulerFlusher$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ad f25963a;

    JobSchedulerFlusher$1(ad adVar) {
        this.f25963a = adVar;
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("start_job");
        intent.getStringExtra("stop_job");
        if (stringExtra != null) {
            this.f25963a.f25984a.a();
        }
    }
}
