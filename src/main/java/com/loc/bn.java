package com.loc;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

public final class bn implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    SensorManager f25548a;

    /* renamed from: b  reason: collision with root package name */
    Sensor f25549b;

    /* renamed from: c  reason: collision with root package name */
    Sensor f25550c;

    /* renamed from: d  reason: collision with root package name */
    Sensor f25551d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25552e;

    /* renamed from: f  reason: collision with root package name */
    public double f25553f;
    public float g;
    public float h;
    Handler i = new Handler() {
    };
    double j = 0.0d;
    double k = 0.0d;
    double l = 0.0d;
    public double m = 0.0d;
    double[] n = new double[3];
    volatile double o = 0.0d;
    long p = 0;
    long q = 0;
    final int r = 100;
    final int s = 30;
    private Context t;
    private float u = 1013.25f;

    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(1:4)|5|6|7|8|9|10|11) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)|5|6|7|8|9|10|11) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0053 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bn(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 1149063168(0x447d5000, float:1013.25)
            r3.u = r0
            com.loc.bn$1 r0 = new com.loc.bn$1
            r0.<init>()
            r3.i = r0
            r0 = 0
            r3.j = r0
            r3.k = r0
            r3.l = r0
            r3.m = r0
            r2 = 3
            double[] r2 = new double[r2]
            r3.n = r2
            r3.o = r0
            r0 = 0
            r3.p = r0
            r3.q = r0
            r0 = 100
            r3.r = r0
            r0 = 30
            r3.s = r0
            r3.t = r4     // Catch:{ Throwable -> 0x005d }
            android.hardware.SensorManager r4 = r3.f25548a     // Catch:{ Throwable -> 0x005d }
            if (r4 != 0) goto L_0x0040
            android.content.Context r4 = r3.t     // Catch:{ Throwable -> 0x005d }
            java.lang.String r0 = "sensor"
            java.lang.Object r4 = r4.getSystemService(r0)     // Catch:{ Throwable -> 0x005d }
            android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4     // Catch:{ Throwable -> 0x005d }
            r3.f25548a = r4     // Catch:{ Throwable -> 0x005d }
        L_0x0040:
            android.hardware.SensorManager r4 = r3.f25548a     // Catch:{ Throwable -> 0x0049 }
            r0 = 6
            android.hardware.Sensor r4 = r4.getDefaultSensor(r0)     // Catch:{ Throwable -> 0x0049 }
            r3.f25549b = r4     // Catch:{ Throwable -> 0x0049 }
        L_0x0049:
            android.hardware.SensorManager r4 = r3.f25548a     // Catch:{ Throwable -> 0x0053 }
            r0 = 11
            android.hardware.Sensor r4 = r4.getDefaultSensor(r0)     // Catch:{ Throwable -> 0x0053 }
            r3.f25550c = r4     // Catch:{ Throwable -> 0x0053 }
        L_0x0053:
            android.hardware.SensorManager r4 = r3.f25548a     // Catch:{ Throwable -> 0x005c }
            r0 = 1
            android.hardware.Sensor r4 = r4.getDefaultSensor(r0)     // Catch:{ Throwable -> 0x005c }
            r3.f25551d = r4     // Catch:{ Throwable -> 0x005c }
        L_0x005c:
            return
        L_0x005d:
            r4 = move-exception
            java.lang.String r0 = "AMapSensorManager"
            java.lang.String r1 = "<init>"
            com.loc.ce.a(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bn.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:4|5|6|(1:8)|9|10|(1:12)|13|14|(2:16|18)(1:22)) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[Catch:{ Throwable -> 0x0021 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025 A[Catch:{ Throwable -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r2 = this;
            android.hardware.SensorManager r0 = r2.f25548a
            if (r0 == 0) goto L_0x002c
            boolean r0 = r2.f25552e
            if (r0 == 0) goto L_0x002c
            r0 = 0
            r2.f25552e = r0
            android.hardware.Sensor r0 = r2.f25549b     // Catch:{ Throwable -> 0x0016 }
            if (r0 == 0) goto L_0x0016
            android.hardware.SensorManager r0 = r2.f25548a     // Catch:{ Throwable -> 0x0016 }
            android.hardware.Sensor r1 = r2.f25549b     // Catch:{ Throwable -> 0x0016 }
            r0.unregisterListener(r2, r1)     // Catch:{ Throwable -> 0x0016 }
        L_0x0016:
            android.hardware.Sensor r0 = r2.f25550c     // Catch:{ Throwable -> 0x0021 }
            if (r0 == 0) goto L_0x0021
            android.hardware.SensorManager r0 = r2.f25548a     // Catch:{ Throwable -> 0x0021 }
            android.hardware.Sensor r1 = r2.f25550c     // Catch:{ Throwable -> 0x0021 }
            r0.unregisterListener(r2, r1)     // Catch:{ Throwable -> 0x0021 }
        L_0x0021:
            android.hardware.Sensor r0 = r2.f25551d     // Catch:{ Throwable -> 0x002c }
            if (r0 == 0) goto L_0x002c
            android.hardware.SensorManager r0 = r2.f25548a     // Catch:{ Throwable -> 0x002c }
            android.hardware.Sensor r1 = r2.f25551d     // Catch:{ Throwable -> 0x002c }
            r0.unregisterListener(r2, r1)     // Catch:{ Throwable -> 0x002c }
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bn.a():void");
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            try {
                int type = sensorEvent.sensor.getType();
                if (type != 1) {
                    if (type == 6) {
                        try {
                            if (this.f25549b != null) {
                                float[] fArr = (float[]) sensorEvent.values.clone();
                                if (fArr != null) {
                                    this.g = fArr[0];
                                }
                                if (fArr != null) {
                                    this.f25553f = (double) cn.a(SensorManager.getAltitude(this.u, fArr[0]));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (type == 11) {
                        try {
                            if (this.f25550c != null) {
                                float[] fArr2 = (float[]) sensorEvent.values.clone();
                                if (fArr2 != null) {
                                    float[] fArr3 = new float[9];
                                    SensorManager.getRotationMatrixFromVector(fArr3, fArr2);
                                    float[] fArr4 = new float[3];
                                    SensorManager.getOrientation(fArr3, fArr4);
                                    this.h = (float) Math.toDegrees((double) fArr4[0]);
                                    this.h = (float) Math.floor((double) (this.h > 0.0f ? this.h : this.h + 360.0f));
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                } else if (this.f25551d != null) {
                    float[] fArr5 = (float[]) sensorEvent.values.clone();
                    double[] dArr = this.n;
                    double d2 = this.n[0] * 0.800000011920929d;
                    double d3 = (double) (fArr5[0] * 0.19999999f);
                    Double.isNaN(d3);
                    dArr[0] = d2 + d3;
                    double[] dArr2 = this.n;
                    double d4 = this.n[1] * 0.800000011920929d;
                    double d5 = (double) (fArr5[1] * 0.19999999f);
                    Double.isNaN(d5);
                    dArr2[1] = d4 + d5;
                    double[] dArr3 = this.n;
                    double d6 = this.n[2] * 0.800000011920929d;
                    double d7 = (double) (fArr5[2] * 0.19999999f);
                    Double.isNaN(d7);
                    dArr3[2] = d6 + d7;
                    double d8 = (double) fArr5[0];
                    double d9 = this.n[0];
                    Double.isNaN(d8);
                    this.j = d8 - d9;
                    double d10 = (double) fArr5[1];
                    double d11 = this.n[1];
                    Double.isNaN(d10);
                    this.k = d10 - d11;
                    double d12 = (double) fArr5[2];
                    double d13 = this.n[2];
                    Double.isNaN(d12);
                    this.l = d12 - d13;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.p >= 100) {
                        double sqrt = Math.sqrt((this.j * this.j) + (this.k * this.k) + (this.l * this.l));
                        this.q++;
                        this.p = currentTimeMillis;
                        this.o += sqrt;
                        if (this.q >= 30) {
                            double d14 = this.o;
                            double d15 = (double) this.q;
                            Double.isNaN(d15);
                            this.m = d14 / d15;
                            this.o = 0.0d;
                            this.q = 0;
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }
}
