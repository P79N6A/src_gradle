package com.mapbox.android.telemetry;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;

public class MapboxTelemetry_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    final MapboxTelemetry f25968a;

    MapboxTelemetry_LifecycleAdapter(MapboxTelemetry mapboxTelemetry) {
        this.f25968a = mapboxTelemetry;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2;
        if (methodCallsLogger != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && event == Lifecycle.Event.ON_START) {
            if (!z2 || methodCallsLogger.approveCall("onEnterForeground", 1)) {
                this.f25968a.onEnterForeground();
            }
        }
    }
}
