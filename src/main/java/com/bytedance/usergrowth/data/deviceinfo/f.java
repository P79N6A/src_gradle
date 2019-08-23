package com.bytedance.usergrowth.data.deviceinfo;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final SensorManager f22859a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22860b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f22861c;

    /* renamed from: d  reason: collision with root package name */
    private Sensor f22862d;

    /* renamed from: e  reason: collision with root package name */
    private a f22863e;

    class a implements SensorEventListener {

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f22869b;

        /* renamed from: c  reason: collision with root package name */
        private final b f22870c;

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent != null && sensorEvent.sensor.getType() == f.this.f22860b && !this.f22869b.getAndSet(true)) {
                this.f22870c.a(sensorEvent);
                if (f.this.f22859a != null) {
                    try {
                        f.this.f22859a.unregisterListener(this);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        a(AtomicBoolean atomicBoolean, b bVar) {
            this.f22869b = atomicBoolean;
            this.f22870c = bVar;
        }
    }

    public interface b {
        void a();

        void a(SensorEvent sensorEvent);
    }

    public final boolean a(final b bVar, long j) {
        boolean z;
        AnonymousClass1 r5;
        boolean z2;
        if (this.f22862d == null || this.f22859a == null) {
            return false;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final a aVar = new a(atomicBoolean, bVar);
        if (this.f22863e != null) {
            try {
                this.f22859a.unregisterListener(this.f22863e);
            } catch (Throwable unused) {
            }
        }
        this.f22863e = aVar;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            r5 = new Runnable() {
                public final void run() {
                    if (!atomicBoolean.getAndSet(true)) {
                        try {
                            f.this.f22859a.unregisterListener(aVar);
                        } catch (Throwable unused) {
                        }
                        bVar.a();
                    }
                }
            };
            this.f22861c.postDelayed(r5, j);
        } else {
            r5 = null;
        }
        try {
            z2 = this.f22859a.registerListener(this.f22863e, this.f22862d, 3);
        } catch (Throwable unused2) {
            z2 = false;
        }
        if (!z2) {
            this.f22859a.unregisterListener(this.f22863e);
            this.f22863e = null;
        }
        if (!z2 && z) {
            this.f22861c.removeCallbacks(r5);
        }
        return z2;
    }

    f(Context context, Handler handler, int i) {
        this.f22861c = handler;
        this.f22860b = i;
        this.f22859a = (SensorManager) context.getSystemService("sensor");
        if (this.f22859a != null) {
            this.f22862d = this.f22859a.getDefaultSensor(i);
        }
    }
}
