package com.amap.api.mapcore2d;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import com.amap.api.maps2d.model.Marker;

public class bl implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private SensorManager f5757a;

    /* renamed from: b  reason: collision with root package name */
    private Sensor f5758b;

    /* renamed from: c  reason: collision with root package name */
    private long f5759c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5760d = 100;

    /* renamed from: e  reason: collision with root package name */
    private float f5761e;

    /* renamed from: f  reason: collision with root package name */
    private Context f5762f;
    private y g;
    private Marker h;
    private boolean i = true;

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public void b() {
        if (this.f5757a != null && this.f5758b != null) {
            this.f5757a.unregisterListener(this, this.f5758b);
        }
    }

    public void a() {
        if (this.f5757a != null && this.f5758b != null) {
            this.f5757a.registerListener(this, this.f5758b, 3);
        }
    }

    public void a(Marker marker) {
        this.h = marker;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public static int a(Context context) {
        switch (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 0:
                return 0;
            case 1:
                return 90;
            case 2:
                return 180;
            case 3:
                return -90;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r6) {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x008a }
            long r2 = r5.f5759c     // Catch:{ Throwable -> 0x008a }
            r4 = 0
            long r0 = r0 - r2
            r2 = 100
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x000f
            return
        L_0x000f:
            android.hardware.Sensor r0 = r6.sensor     // Catch:{ Throwable -> 0x008a }
            int r0 = r0.getType()     // Catch:{ Throwable -> 0x008a }
            r1 = 3
            if (r0 == r1) goto L_0x0019
            goto L_0x0089
        L_0x0019:
            float[] r6 = r6.values     // Catch:{ Throwable -> 0x008a }
            r0 = 0
            r6 = r6[r0]     // Catch:{ Throwable -> 0x008a }
            android.content.Context r0 = r5.f5762f     // Catch:{ Throwable -> 0x008a }
            int r0 = a((android.content.Context) r0)     // Catch:{ Throwable -> 0x008a }
            float r0 = (float) r0     // Catch:{ Throwable -> 0x008a }
            float r6 = r6 + r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 % r0
            r1 = 1127481344(0x43340000, float:180.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0031
            float r6 = r6 - r0
            goto L_0x0038
        L_0x0031:
            r1 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0038
            float r6 = r6 + r0
        L_0x0038:
            float r1 = r5.f5761e     // Catch:{ Throwable -> 0x008a }
            float r1 = r1 - r6
            float r1 = java.lang.Math.abs(r1)     // Catch:{ Throwable -> 0x008a }
            r2 = 1077936128(0x40400000, float:3.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            boolean r1 = java.lang.Float.isNaN(r6)     // Catch:{ Throwable -> 0x008a }
            if (r1 == 0) goto L_0x004c
            r6 = 0
        L_0x004c:
            r5.f5761e = r6     // Catch:{ Throwable -> 0x008a }
            com.amap.api.maps2d.model.Marker r6 = r5.h     // Catch:{ Throwable -> 0x008a }
            if (r6 == 0) goto L_0x0083
            boolean r6 = r5.i     // Catch:{ Throwable -> 0x0083 }
            if (r6 == 0) goto L_0x007b
            com.amap.api.mapcore2d.y r6 = r5.g     // Catch:{ Throwable -> 0x0083 }
            com.amap.api.maps2d.model.CameraPosition r6 = r6.getCameraPosition()     // Catch:{ Throwable -> 0x0083 }
            com.amap.api.maps2d.model.CameraPosition r0 = new com.amap.api.maps2d.model.CameraPosition     // Catch:{ Throwable -> 0x0083 }
            com.amap.api.maps2d.model.LatLng r1 = r6.target     // Catch:{ Throwable -> 0x0083 }
            float r2 = r6.zoom     // Catch:{ Throwable -> 0x0083 }
            float r6 = r6.tilt     // Catch:{ Throwable -> 0x0083 }
            float r3 = r5.f5761e     // Catch:{ Throwable -> 0x0083 }
            r0.<init>(r1, r2, r6, r3)     // Catch:{ Throwable -> 0x0083 }
            com.amap.api.mapcore2d.y r6 = r5.g     // Catch:{ Throwable -> 0x0083 }
            com.amap.api.maps2d.CameraUpdate r0 = com.amap.api.maps2d.CameraUpdateFactory.newCameraPosition(r0)     // Catch:{ Throwable -> 0x0083 }
            r6.moveCamera(r0)     // Catch:{ Throwable -> 0x0083 }
            com.amap.api.maps2d.model.Marker r6 = r5.h     // Catch:{ Throwable -> 0x0083 }
            float r0 = r5.f5761e     // Catch:{ Throwable -> 0x0083 }
            float r0 = -r0
            r6.setRotateAngle(r0)     // Catch:{ Throwable -> 0x0083 }
            goto L_0x0083
        L_0x007b:
            com.amap.api.maps2d.model.Marker r6 = r5.h     // Catch:{ Throwable -> 0x0083 }
            float r1 = r5.f5761e     // Catch:{ Throwable -> 0x0083 }
            float r0 = r0 - r1
            r6.setRotateAngle(r0)     // Catch:{ Throwable -> 0x0083 }
        L_0x0083:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x008a }
            r5.f5759c = r0     // Catch:{ Throwable -> 0x008a }
        L_0x0089:
            return
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.bl.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public bl(Context context, y yVar) {
        this.f5762f = context.getApplicationContext();
        this.g = yVar;
        try {
            this.f5757a = (SensorManager) context.getSystemService("sensor");
            this.f5758b = this.f5757a.getDefaultSensor(3);
        } catch (Throwable unused) {
        }
    }
}
