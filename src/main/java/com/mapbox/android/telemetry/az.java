package com.mapbox.android.telemetry;

import android.content.Context;
import android.os.Handler;
import com.mapbox.android.core.b.a;

public final class az implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26046a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f26047b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private final u f26048c = new u();

    /* renamed from: d  reason: collision with root package name */
    private MapboxTelemetry f26049d;

    public final void run() {
        if (a.a(this.f26046a)) {
            this.f26049d.c();
            return;
        }
        u uVar = this.f26048c;
        int i = uVar.f26128a;
        double d2 = (double) uVar.f26131d;
        double d3 = uVar.f26130c;
        Double.isNaN(d2);
        if (((double) uVar.f26128a) >= d2 / d3) {
            uVar.f26128a = uVar.f26131d;
        } else {
            double d4 = (double) uVar.f26128a;
            double d5 = uVar.f26130c;
            Double.isNaN(d4);
            uVar.f26128a = (int) (d4 * d5);
        }
        this.f26047b.postDelayed(this, (long) i);
    }

    az(Context context, MapboxTelemetry mapboxTelemetry) {
        this.f26046a = context;
        this.f26049d = mapboxTelemetry;
    }
}
