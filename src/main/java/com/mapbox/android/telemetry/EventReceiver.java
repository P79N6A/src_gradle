package com.mapbox.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class EventReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private s f25962a;

    public void onReceive(Context context, Intent intent) {
        if ("onEvent".equals(intent.getStringExtra("event_received"))) {
            this.f25962a.onEventReceived((r) intent.getExtras().getParcelable("event"));
        }
    }
}
