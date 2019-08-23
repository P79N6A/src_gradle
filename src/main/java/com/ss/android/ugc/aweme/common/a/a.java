package com.ss.android.ugc.aweme.common.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40151a = null;

    /* renamed from: c  reason: collision with root package name */
    public static float f40152c = 6.0f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40153b = true;

    /* renamed from: d  reason: collision with root package name */
    b f40154d;

    /* renamed from: e  reason: collision with root package name */
    SensorManager f40155e;

    /* renamed from: f  reason: collision with root package name */
    Sensor f40156f;
    public boolean g;
    private float h;
    private float i;
    private float j;
    private long k;
    private long l;
    private C0520a m;

    /* renamed from: com.ss.android.ugc.aweme.common.a.a$a  reason: collision with other inner class name */
    public interface C0520a {
        void a();
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40157a;

        /* renamed from: b  reason: collision with root package name */
        int f40158b;

        /* renamed from: c  reason: collision with root package name */
        final float[] f40159c = new float[this.f40161e];

        /* renamed from: d  reason: collision with root package name */
        final long[] f40160d = new long[this.f40161e];

        /* renamed from: e  reason: collision with root package name */
        int f40161e = 20;

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f40158b = 0;
            for (int i = 0; i < this.f40161e; i++) {
                this.f40160d[i] = 0;
            }
        }

        b(int i) {
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40151a, false, 33410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40151a, false, 33410, new Class[0], Void.TYPE);
            return;
        }
        this.k = 0;
        this.f40154d.a();
        this.f40155e.registerListener(this, this.f40156f, 2);
        this.g = true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f40151a, false, 33411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40151a, false, 33411, new Class[0], Void.TYPE);
            return;
        }
        this.f40155e.unregisterListener(this);
        this.g = false;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z;
        SensorEvent sensorEvent2 = sensorEvent;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{sensorEvent2}, this, f40151a, false, 33412, new Class[]{SensorEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sensorEvent2}, this, f40151a, false, 33412, new Class[]{SensorEvent.class}, Void.TYPE);
        } else if (this.f40153b && sensorEvent2.sensor != null && sensorEvent2.sensor.getType() == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.k > 50) {
                this.k = currentTimeMillis;
                float f2 = sensorEvent2.values[0];
                float f3 = sensorEvent2.values[1];
                float f4 = sensorEvent2.values[2];
                this.j = this.i;
                this.i = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3) + (f4 * f4)));
                this.h = (this.h * 0.9f) + (this.i - this.j);
                b bVar = this.f40154d;
                bVar.f40159c[bVar.f40158b] = this.h;
                bVar.f40160d[bVar.f40158b] = currentTimeMillis;
                bVar.f40158b = (bVar.f40158b + 1) % bVar.f40161e;
                if (currentTimeMillis - this.l >= 2000 && Math.abs(this.h) > f40152c) {
                    b bVar2 = this.f40154d;
                    if (PatchProxy.isSupport(new Object[]{new Long(currentTimeMillis)}, bVar2, b.f40157a, false, 33413, new Class[]{Long.TYPE}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(currentTimeMillis)}, bVar2, b.f40157a, false, 33413, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
                    } else {
                        int i2 = bVar2.f40158b;
                        long j2 = 0;
                        long j3 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        boolean z3 = true;
                        while (true) {
                            if (i3 >= bVar2.f40161e) {
                                break;
                            }
                            i2--;
                            if (i2 < 0) {
                                i2 = bVar2.f40161e - 1;
                            }
                            long j4 = bVar2.f40160d[i2];
                            if (j4 <= 0 || currentTimeMillis - j4 > 2000 || ((j2 > 0 && j2 - j4 > 800) || (j3 > 0 && j3 - j4 > 500))) {
                                break;
                            }
                            float f5 = bVar2.f40159c[i2];
                            if (Math.abs(f5) >= f40152c) {
                                if (f5 > 0.0f) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (i4 == 0 || z != z3) {
                                    i4++;
                                    z3 = z;
                                    j2 = j4;
                                }
                                if (i4 >= 2) {
                                    break;
                                }
                                j3 = j4;
                            }
                            i3++;
                        }
                        z2 = false;
                    }
                    if (z2) {
                        this.f40154d.a();
                        this.l = currentTimeMillis;
                        if (this.m != null) {
                            this.m.a();
                        }
                    }
                }
            }
        }
    }

    public a(Context context, C0520a aVar) {
        if (this.f40153b) {
            this.m = aVar;
            this.f40155e = (SensorManager) context.getSystemService("sensor");
            this.f40156f = this.f40155e.getDefaultSensor(1);
            this.f40154d = new b(20);
        }
        f40152c = (float) com.ss.android.ugc.aweme.aj.b.b().b(context, "shake_threshold", 6);
    }
}
