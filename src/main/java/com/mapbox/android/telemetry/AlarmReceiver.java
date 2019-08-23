package com.mapbox.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

public class AlarmReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final ba f25961a;

    AlarmReceiver(@NonNull ba baVar) {
        this.f25961a = baVar;
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.mapbox.scheduler_flusher".equals(intent.getAction())) {
            this.f25961a.a();
        }
    }
}
