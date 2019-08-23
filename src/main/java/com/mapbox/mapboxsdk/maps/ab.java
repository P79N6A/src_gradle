package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.annotations.j;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.a;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.o;

public final class ab implements MapView.l {

    /* renamed from: a  reason: collision with root package name */
    public final NativeMapView f26592a;

    /* renamed from: b  reason: collision with root package name */
    final j f26593b;

    /* renamed from: c  reason: collision with root package name */
    public o.a f26594c;

    /* renamed from: d  reason: collision with root package name */
    public f f26595d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f26596e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private CameraPosition f26597f;

    /* access modifiers changed from: package-private */
    @UiThread
    public final void a(o oVar, a aVar, final o.a aVar2) {
        CameraPosition a2 = aVar.a(oVar);
        if (b(a2)) {
            c();
            this.f26595d.a(3);
            this.f26592a.a(a2.bearing, a2.target, a2.tilt, a2.zoom);
            this.f26595d.a();
            b();
            this.f26596e.post(new Runnable() {
                public final void run() {
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.f26592a.a(z);
        if (!z) {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public final double d() {
        return this.f26592a.g();
    }

    public final double e() {
        return this.f26592a.h();
    }

    public final double f() {
        return this.f26592a.f();
    }

    @UiThread
    public final CameraPosition a() {
        if (this.f26597f == null) {
            this.f26597f = b();
        }
        return this.f26597f;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @UiThread
    public final CameraPosition b() {
        if (this.f26592a != null) {
            CameraPosition k = this.f26592a.k();
            if (this.f26597f != null && !this.f26597f.equals(k)) {
                this.f26595d.m_();
            }
            if (c(k)) {
                a(k);
            }
            this.f26597f = k;
        }
        return this.f26597f;
    }

    public final void c() {
        this.f26595d.b();
        if (this.f26594c != null) {
            final o.a aVar = this.f26594c;
            this.f26595d.a();
            this.f26596e.post(new Runnable() {
                public final void run() {
                }
            });
            this.f26594c = null;
        }
        this.f26592a.e();
        this.f26595d.a();
    }

    private boolean c(@NonNull CameraPosition cameraPosition) {
        if (this.f26597f == null || (this.f26597f.tilt == cameraPosition.tilt && this.f26597f.bearing == cameraPosition.bearing)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean b(@Nullable CameraPosition cameraPosition) {
        if (cameraPosition == null || cameraPosition.equals(this.f26597f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(double d2) {
        if (d2 < 0.0d || d2 > 25.5d) {
            Logger.e("Mbgl-Transform", String.format("Not setting minZoomPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d2)}));
            return;
        }
        this.f26592a.a(d2);
    }

    /* access modifiers changed from: package-private */
    public final void b(double d2) {
        if (d2 < 0.0d || d2 > 25.5d) {
            Logger.e("Mbgl-Transform", String.format("Not setting maxZoomPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d2)}));
            return;
        }
        this.f26592a.b(d2);
    }

    public final void a(int i) {
        if (i == 4) {
            a(b());
            if (this.f26594c != null) {
                this.f26596e.post(new Runnable() {
                    public final void run() {
                        if (ab.this.f26594c != null) {
                            ab.this.f26594c = null;
                        }
                    }
                });
            }
            this.f26595d.a();
            this.f26592a.b((MapView.l) this);
        }
    }

    /* access modifiers changed from: package-private */
    @UiThread
    public final void a(@NonNull CameraPosition cameraPosition) {
        this.f26593b.a((float) cameraPosition.tilt);
    }

    /* access modifiers changed from: package-private */
    public final void b(double d2, @NonNull PointF pointF) {
        a(d2, pointF, 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(double d2, @NonNull PointF pointF) {
        b(this.f26592a.g() + d2, pointF);
    }

    ab(NativeMapView nativeMapView, j jVar, f fVar) {
        this.f26592a = nativeMapView;
        this.f26593b = jVar;
        this.f26595d = fVar;
    }

    private void a(double d2, @NonNull PointF pointF, long j) {
        if (this.f26592a != null) {
            this.f26592a.a((MapView.l) new MapView.l(0) {
                public final void a(int i) {
                    if (i == 4) {
                        if (0 > 0) {
                            ab.this.f26595d.a();
                        }
                        ab.this.f26592a.b((MapView.l) this);
                    }
                }
            });
            this.f26592a.a(d2, pointF, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(double d2, double d3, long j) {
        if (j > 0) {
            this.f26592a.a((MapView.l) new MapView.l() {
                public final void a(int i) {
                    if (i == 4) {
                        ab.this.f26592a.b((MapView.l) this);
                        ab.this.f26595d.a();
                    }
                }
            });
        }
        this.f26592a.a(d2, d3, j);
    }

    /* access modifiers changed from: package-private */
    public final void a(double d2, float f2, float f3, long j) {
        this.f26592a.a(d2, (double) f2, (double) f3, j);
    }
}
