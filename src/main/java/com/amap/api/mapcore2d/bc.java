package com.amap.api.mapcore2d;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.Circle;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MyLocationStyle;

public class bc {

    /* renamed from: a  reason: collision with root package name */
    a f5723a;

    /* renamed from: b  reason: collision with root package name */
    ValueAnimator f5724b;

    /* renamed from: c  reason: collision with root package name */
    Animator.AnimatorListener f5725c = new Animator.AnimatorListener() {
        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            bc.this.c();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    ValueAnimator.AnimatorUpdateListener f5726d = new ValueAnimator.AnimatorUpdateListener() {
        @TargetApi(11)
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            try {
                if (bc.this.g != null) {
                    LatLng latLng = (LatLng) valueAnimator.getAnimatedValue();
                    bc.this.g.setCenter(latLng);
                    bc.this.f5728f.setPosition(latLng);
                }
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private y f5727e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Marker f5728f;
    /* access modifiers changed from: private */
    public Circle g;
    private MyLocationStyle h;
    private LatLng i;
    private double j;
    private Context k;
    private bl l;
    private int m = 1;
    private boolean n;
    private final String o = "location_map_gps_locked.png";
    private final String p = "location_map_gps_3d.png";
    private BitmapDescriptor q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;

    @TargetApi(11)
    public class a implements TypeEvaluator {
        public a() {
        }

        public Object evaluate(float f2, Object obj, Object obj2) {
            LatLng latLng = (LatLng) obj;
            LatLng latLng2 = (LatLng) obj2;
            double d2 = latLng.latitude;
            double d3 = (double) f2;
            Double.isNaN(d3);
            double d4 = d2 + ((latLng2.latitude - latLng.latitude) * d3);
            double d5 = latLng.longitude;
            Double.isNaN(d3);
            return new LatLng(d4, d5 + (d3 * (latLng2.longitude - latLng.longitude)));
        }
    }

    private void b() {
        this.l.b();
    }

    public void a() throws RemoteException {
        e();
        if (this.l != null) {
            b();
            this.l = null;
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        if (this.r) {
            if (!this.s || !this.n) {
                this.n = true;
                try {
                    this.f5727e.animateCamera(CameraUpdateFactory.changeLatLng(this.i));
                } catch (Throwable th) {
                    dg.b(th, "MyLocationOverlay", "moveMapToLocation");
                }
            }
        }
    }

    private void d() {
        if (this.h == null) {
            this.h = new MyLocationStyle();
            this.h.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        } else if (this.h.getMyLocationIcon() == null || this.h.getMyLocationIcon().getBitmap() == null) {
            this.h.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        }
        f();
    }

    private void e() {
        if (this.g != null) {
            try {
                this.f5727e.removeGLOverlay(this.g.getId());
            } catch (Throwable th) {
                dg.b(th, "MyLocationOverlay", "locationIconRemove");
            }
            this.g = null;
        }
        if (this.f5728f != null) {
            this.f5728f.remove();
            this.f5728f.destroy();
            this.f5728f = null;
            this.l.a((Marker) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fb A[Catch:{ Throwable -> 0x0112 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r5 = this;
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            if (r0 != 0) goto L_0x0017
            com.amap.api.mapcore2d.y r0 = r5.f5727e     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.CircleOptions r1 = new com.amap.api.maps2d.model.CircleOptions     // Catch:{ Throwable -> 0x0112 }
            r1.<init>()     // Catch:{ Throwable -> 0x0112 }
            r2 = 1065353216(0x3f800000, float:1.0)
            com.amap.api.maps2d.model.CircleOptions r1 = r1.zIndex(r2)     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.Circle r0 = r0.addCircle(r1)     // Catch:{ Throwable -> 0x0112 }
            r5.g = r0     // Catch:{ Throwable -> 0x0112 }
        L_0x0017:
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            r1 = 1
            if (r0 == 0) goto L_0x0080
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            float r0 = r0.getStrokeWidth()     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r2 = r5.h     // Catch:{ Throwable -> 0x0112 }
            float r2 = r2.getStrokeWidth()     // Catch:{ Throwable -> 0x0112 }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0037
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r2 = r5.h     // Catch:{ Throwable -> 0x0112 }
            float r2 = r2.getStrokeWidth()     // Catch:{ Throwable -> 0x0112 }
            r0.setStrokeWidth(r2)     // Catch:{ Throwable -> 0x0112 }
        L_0x0037:
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            int r0 = r0.getFillColor()     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r2 = r5.h     // Catch:{ Throwable -> 0x0112 }
            int r2 = r2.getRadiusFillColor()     // Catch:{ Throwable -> 0x0112 }
            if (r0 == r2) goto L_0x0050
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r2 = r5.h     // Catch:{ Throwable -> 0x0112 }
            int r2 = r2.getRadiusFillColor()     // Catch:{ Throwable -> 0x0112 }
            r0.setFillColor(r2)     // Catch:{ Throwable -> 0x0112 }
        L_0x0050:
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            int r0 = r0.getStrokeColor()     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r2 = r5.h     // Catch:{ Throwable -> 0x0112 }
            int r2 = r2.getStrokeColor()     // Catch:{ Throwable -> 0x0112 }
            if (r0 == r2) goto L_0x0069
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r2 = r5.h     // Catch:{ Throwable -> 0x0112 }
            int r2 = r2.getStrokeColor()     // Catch:{ Throwable -> 0x0112 }
            r0.setStrokeColor(r2)     // Catch:{ Throwable -> 0x0112 }
        L_0x0069:
            com.amap.api.maps2d.model.LatLng r0 = r5.i     // Catch:{ Throwable -> 0x0112 }
            if (r0 == 0) goto L_0x0074
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.LatLng r2 = r5.i     // Catch:{ Throwable -> 0x0112 }
            r0.setCenter(r2)     // Catch:{ Throwable -> 0x0112 }
        L_0x0074:
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            double r2 = r5.j     // Catch:{ Throwable -> 0x0112 }
            r0.setRadius(r2)     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.Circle r0 = r5.g     // Catch:{ Throwable -> 0x0112 }
            r0.setVisible(r1)     // Catch:{ Throwable -> 0x0112 }
        L_0x0080:
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            r2 = 0
            if (r0 != 0) goto L_0x0096
            com.amap.api.mapcore2d.y r0 = r5.f5727e     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MarkerOptions r3 = new com.amap.api.maps2d.model.MarkerOptions     // Catch:{ Throwable -> 0x0112 }
            r3.<init>()     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MarkerOptions r3 = r3.visible(r2)     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.Marker r0 = r0.addMarker(r3)     // Catch:{ Throwable -> 0x0112 }
            r5.f5728f = r0     // Catch:{ Throwable -> 0x0112 }
        L_0x0096:
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            if (r0 == 0) goto L_0x0107
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r3 = r5.h     // Catch:{ Throwable -> 0x0112 }
            float r3 = r3.getAnchorU()     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r4 = r5.h     // Catch:{ Throwable -> 0x0112 }
            float r4 = r4.getAnchorV()     // Catch:{ Throwable -> 0x0112 }
            r0.setAnchor(r3, r4)     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            java.util.ArrayList r0 = r0.getIcons()     // Catch:{ Throwable -> 0x0112 }
            if (r0 == 0) goto L_0x00ec
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            java.util.ArrayList r0 = r0.getIcons()     // Catch:{ Throwable -> 0x0112 }
            int r0 = r0.size()     // Catch:{ Throwable -> 0x0112 }
            if (r0 != 0) goto L_0x00c0
            goto L_0x00ec
        L_0x00c0:
            com.amap.api.maps2d.model.MyLocationStyle r0 = r5.h     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.BitmapDescriptor r0 = r0.getMyLocationIcon()     // Catch:{ Throwable -> 0x0112 }
            if (r0 == 0) goto L_0x00f7
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            java.util.ArrayList r0 = r0.getIcons()     // Catch:{ Throwable -> 0x0112 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.BitmapDescriptor r0 = (com.amap.api.maps2d.model.BitmapDescriptor) r0     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r2 = r5.h     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.BitmapDescriptor r2 = r2.getMyLocationIcon()     // Catch:{ Throwable -> 0x0112 }
            boolean r0 = r0.equals(r2)     // Catch:{ Throwable -> 0x0112 }
            if (r0 != 0) goto L_0x00f7
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r2 = r5.h     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.BitmapDescriptor r2 = r2.getMyLocationIcon()     // Catch:{ Throwable -> 0x0112 }
            r0.setIcon(r2)     // Catch:{ Throwable -> 0x0112 }
            goto L_0x00f7
        L_0x00ec:
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.MyLocationStyle r2 = r5.h     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.BitmapDescriptor r2 = r2.getMyLocationIcon()     // Catch:{ Throwable -> 0x0112 }
            r0.setIcon(r2)     // Catch:{ Throwable -> 0x0112 }
        L_0x00f7:
            com.amap.api.maps2d.model.LatLng r0 = r5.i     // Catch:{ Throwable -> 0x0112 }
            if (r0 == 0) goto L_0x0107
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.LatLng r2 = r5.i     // Catch:{ Throwable -> 0x0112 }
            r0.setPosition(r2)     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.Marker r0 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            r0.setVisible(r1)     // Catch:{ Throwable -> 0x0112 }
        L_0x0107:
            r5.c()     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.mapcore2d.bl r0 = r5.l     // Catch:{ Throwable -> 0x0112 }
            com.amap.api.maps2d.model.Marker r1 = r5.f5728f     // Catch:{ Throwable -> 0x0112 }
            r0.a((com.amap.api.maps2d.model.Marker) r1)     // Catch:{ Throwable -> 0x0112 }
            return
        L_0x0112:
            r0 = move-exception
            java.lang.String r1 = "MyLocationOverlay"
            java.lang.String r2 = "myLocStyle"
            com.amap.api.mapcore2d.dg.b((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.bc.f():void");
    }

    public void a(int i2) {
        a(i2, false);
    }

    public void a(float f2) {
        if (this.f5728f != null) {
            this.f5728f.setRotateAngle(f2);
        }
    }

    private void b(float f2) {
        if (this.t) {
            float f3 = f2 % 360.0f;
            if (f3 > 180.0f) {
                f3 -= 360.0f;
            } else if (f3 < -180.0f) {
                f3 += 360.0f;
            }
            if (this.f5728f != null) {
                this.f5728f.setRotateAngle(-f3);
            }
        }
    }

    public void a(boolean z) {
        if (!(this.g == null || this.g.isVisible() == z)) {
            this.g.setVisible(z);
        }
        if (this.f5728f != null && this.f5728f.isVisible() != z) {
            this.f5728f.setVisible(z);
        }
    }

    @TargetApi(11)
    private void a(LatLng latLng) {
        LatLng position = this.f5728f.getPosition();
        if (position == null) {
            position = new LatLng(0.0d, 0.0d);
        }
        if (this.f5723a == null) {
            this.f5723a = new a();
        }
        if (this.f5724b == null) {
            this.f5724b = ValueAnimator.ofObject(new a(), new Object[]{position, latLng});
            this.f5724b.addListener(this.f5725c);
            this.f5724b.addUpdateListener(this.f5726d);
            this.f5724b.setDuration(1000);
        } else {
            this.f5724b.setObjectValues(new Object[]{position, latLng});
            this.f5724b.setEvaluator(this.f5723a);
        }
        if (position.latitude == 0.0d && position.longitude == 0.0d) {
            this.f5724b.setDuration(1);
        } else {
            this.f5724b.setDuration(1000);
        }
        this.f5724b.start();
    }

    public void a(Location location) {
        if (location != null) {
            a(this.h.isMyLocationShowing());
            if (this.h.isMyLocationShowing()) {
                this.i = new LatLng(location.getLatitude(), location.getLongitude());
                this.j = (double) location.getAccuracy();
                if (this.f5728f == null && this.g == null) {
                    d();
                }
                if (this.g != null) {
                    try {
                        if (this.j != -1.0d) {
                            this.g.setRadius(this.j);
                        }
                    } catch (Throwable th) {
                        dg.b(th, "MyLocationOverlay", "setCentAndRadius");
                    }
                }
                b(location.getBearing());
                if (!this.i.equals(this.f5728f.getPosition())) {
                    a(this.i);
                } else {
                    c();
                }
            }
        }
    }

    public void a(MyLocationStyle myLocationStyle) {
        try {
            this.h = myLocationStyle;
            a(this.h.isMyLocationShowing());
            if (!this.h.isMyLocationShowing()) {
                this.l.a(false);
                this.m = this.h.getMyLocationType();
            } else if (this.f5728f != null || this.g != null) {
                this.l.a(this.f5728f);
                d();
                a(this.h.getMyLocationType());
            }
        } catch (Throwable th) {
            dg.b(th, "MyLocationOverlay", "setMyLocationStyle");
        }
    }

    public bc(y yVar, Context context) {
        this.k = context.getApplicationContext();
        this.f5727e = yVar;
        this.l = new bl(this.k, yVar);
        a(1, true);
    }

    private void a(int i2, boolean z) {
        this.m = i2;
        this.n = false;
        this.r = false;
        this.u = false;
        this.v = false;
        switch (this.m) {
            case 1:
                this.r = true;
                this.s = true;
                this.t = true;
                break;
            case 2:
                this.r = true;
                this.s = false;
                this.t = true;
                break;
        }
        if (this.u || this.v) {
            if (this.v) {
                this.l.a(true);
                if (!z) {
                    try {
                        this.f5727e.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                this.l.a(false);
            }
            this.l.a();
            return;
        }
        b();
    }
}
