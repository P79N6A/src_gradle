package com.mapbox.android.telemetry;

import android.content.Context;

public final class bc {

    /* renamed from: a  reason: collision with root package name */
    static long f26053a = 180000;

    /* renamed from: b  reason: collision with root package name */
    final Context f26054b;

    /* renamed from: c  reason: collision with root package name */
    final AlarmReceiver f26055c;

    bc(Context context, AlarmReceiver alarmReceiver) {
        this.f26054b = context;
        this.f26055c = alarmReceiver;
        if (bp.e(context)) {
            f26053a = 600000;
        }
    }
}
