package com.amap.api.mapcore2d;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps2d.CoordinateConverter;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;

public final class fk {

    /* renamed from: a  reason: collision with root package name */
    Context f6137a;

    /* renamed from: b  reason: collision with root package name */
    LocationManager f6138b;

    /* renamed from: c  reason: collision with root package name */
    volatile long f6139c;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f6140d;

    /* renamed from: e  reason: collision with root package name */
    boolean f6141e;

    /* renamed from: f  reason: collision with root package name */
    volatile Inner_3dMap_location f6142f;
    Object g;
    boolean h;
    LocationListener i = new LocationListener() {
        public final void onLocationChanged(Location location) {
            if (location != null) {
                try {
                    Inner_3dMap_location inner_3dMap_location = new Inner_3dMap_location(location);
                    inner_3dMap_location.setLocationType(1);
                    Bundle extras = location.getExtras();
                    int i = 0;
                    if (extras != null) {
                        i = extras.getInt("satellites");
                    }
                    inner_3dMap_location.setSatellites(i);
                    fk.this.f6142f = inner_3dMap_location;
                    fk.this.f6139c = gf.b();
                    fk.this.f6140d = true;
                } catch (Throwable th) {
                    gc.a(th, "MAPGPSLocation", "onLocationChanged");
                }
            }
        }

        public final void onProviderDisabled(String str) {
            try {
                if ("gps".equals(str)) {
                    fk.this.f6140d = false;
                }
            } catch (Throwable th) {
                gc.a(th, "MAPGPSLocation", "onProviderDisabled");
            }
        }

        public final void onProviderEnabled(String str) {
        }

        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    public fk(Context context) {
        if (context != null) {
            this.f6137a = context;
            e();
            try {
                if (this.g == null) {
                    if (this.h) {
                        this.g = new CoordinateConverter(context);
                    } else {
                        this.g = new com.amap.api.maps2d.CoordinateConverter();
                    }
                }
            } catch (Throwable unused) {
            }
            if (this.f6138b == null) {
                this.f6138b = (LocationManager) this.f6137a.getSystemService("location");
            }
        }
    }

    private void e() {
        try {
            if (Class.forName("com.amap.api.maps.CoordinateConverter") != null) {
                this.h = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        com.amap.api.mapcore2d.gc.a(r0, "MAPGPSLocation", "requestLocationUpdates");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[ExcHandler: SecurityException (unused java.lang.SecurityException), SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r8 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ SecurityException -> 0x0030, Throwable -> 0x0028 }
            if (r0 != 0) goto L_0x000c
            android.content.Context r0 = r8.f6137a     // Catch:{ SecurityException -> 0x0030, Throwable -> 0x0028 }
            android.os.Looper r0 = r0.getMainLooper()     // Catch:{ SecurityException -> 0x0030, Throwable -> 0x0028 }
        L_0x000c:
            r7 = r0
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ SecurityException -> 0x0030, Throwable -> 0x0028 }
            r0.<init>()     // Catch:{ SecurityException -> 0x0030, Throwable -> 0x0028 }
            android.location.LocationManager r1 = r8.f6138b     // Catch:{ Throwable -> 0x001b, SecurityException -> 0x0030 }
            java.lang.String r2 = "gps"
            java.lang.String r3 = "force_xtra_injection"
            r1.sendExtraCommand(r2, r3, r0)     // Catch:{ Throwable -> 0x001b, SecurityException -> 0x0030 }
        L_0x001b:
            android.location.LocationManager r1 = r8.f6138b     // Catch:{ SecurityException -> 0x0030, Throwable -> 0x0028 }
            java.lang.String r2 = "gps"
            r3 = 800(0x320, double:3.953E-321)
            r5 = 0
            android.location.LocationListener r6 = r8.i     // Catch:{ SecurityException -> 0x0030, Throwable -> 0x0028 }
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)     // Catch:{ SecurityException -> 0x0030, Throwable -> 0x0028 }
            return
        L_0x0028:
            r0 = move-exception
            java.lang.String r1 = "MAPGPSLocation"
            java.lang.String r2 = "requestLocationUpdates"
            com.amap.api.mapcore2d.gc.a(r0, r1, r2)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fk.f():void");
    }

    private void g() {
        this.f6140d = false;
        this.f6139c = 0;
        this.f6142f = null;
    }

    public final void a() {
        if (!this.f6141e) {
            f();
            this.f6141e = true;
        }
    }

    public final void b() {
        this.f6141e = false;
        g();
        if (!(this.f6138b == null || this.i == null)) {
            this.f6138b.removeUpdates(this.i);
        }
    }

    public final boolean c() {
        if (this.f6140d) {
            if (gf.b() - this.f6139c <= 10000) {
                return true;
            }
            this.f6142f = null;
        }
        return false;
    }

    public final Inner_3dMap_location d() {
        double d2;
        Inner_3dMap_location inner_3dMap_location = this.f6142f;
        if (this.f6142f != null && this.f6142f.getErrorCode() == 0) {
            try {
                if (this.g != null && gc.a(this.f6142f.getLatitude(), this.f6142f.getLongitude())) {
                    if (this.h) {
                        LatLng convert = ((CoordinateConverter) this.g).coord(new LatLng(this.f6142f.getLatitude(), this.f6142f.getLongitude())).from(CoordinateConverter.CoordType.GPS).convert();
                        inner_3dMap_location.setLatitude(convert.latitude);
                        d2 = convert.longitude;
                    } else {
                        com.amap.api.maps2d.model.LatLng convert2 = ((com.amap.api.maps2d.CoordinateConverter) this.g).coord(new com.amap.api.maps2d.model.LatLng(this.f6142f.getLatitude(), this.f6142f.getLongitude())).from(CoordinateConverter.CoordType.GPS).convert();
                        inner_3dMap_location.setLatitude(convert2.latitude);
                        d2 = convert2.longitude;
                    }
                    inner_3dMap_location.setLongitude(d2);
                }
            } catch (Throwable unused) {
            }
        }
        return inner_3dMap_location;
    }
}
