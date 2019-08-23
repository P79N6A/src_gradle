package com.mapbox.android.telemetry;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class a implements bb {

    /* renamed from: a  reason: collision with root package name */
    public PendingIntent f25977a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f25978b;

    /* renamed from: c  reason: collision with root package name */
    private final AlarmManager f25979c;

    /* renamed from: d  reason: collision with root package name */
    private final AlarmReceiver f25980d;

    public final void b() {
        this.f25979c.cancel(this.f25977a);
        try {
            this.f25978b.unregisterReceiver(this.f25980d);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void a() {
        this.f25977a = PendingIntent.getBroadcast(this.f25978b, 0, new Intent("com.mapbox.scheduler_flusher"), 0);
        this.f25978b.registerReceiver(this.f25980d, new IntentFilter("com.mapbox.scheduler_flusher"));
    }

    public final void a(long j) {
        this.f25979c.setInexactRepeating(3, j + bc.f26053a, bc.f26053a, this.f25977a);
    }

    a(Context context, AlarmManager alarmManager, AlarmReceiver alarmReceiver) {
        this.f25978b = context;
        this.f25979c = alarmManager;
        this.f25980d = alarmReceiver;
    }
}
