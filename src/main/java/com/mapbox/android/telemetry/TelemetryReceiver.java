package com.mapbox.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

public class TelemetryReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final bi f25969a;

    TelemetryReceiver(@NonNull bi biVar) {
        this.f25969a = biVar;
    }

    public void onReceive(Context context, Intent intent) {
        if ("onBackground".equals(intent.getStringExtra("background_received"))) {
            this.f25969a.b();
        }
        if ("onForeground".equals(intent.getStringExtra("foreground_received"))) {
            this.f25969a.c();
        }
    }
}
