package com.mapbox.mapboxsdk.location;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.animation.LinearInterpolator;
import com.mapbox.android.core.a.f;
import com.mapbox.android.core.a.g;
import com.mapbox.geojson.Feature;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.NativeMapView;
import com.mapbox.mapboxsdk.maps.o;
import com.mapbox.mapboxsdk.style.layers.CircleLayer;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.b;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;
import com.mapbox.mapboxsdk.style.sources.a;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public final class o {
    private e A = new e() {
    };
    private g B = new g() {
        public final void a() {
            if (o.this.f26517d && o.this.h && o.this.g) {
                o.this.f26515b.e();
            }
        }

        public final void a(Location location) {
            o.this.a(location, false);
        }
    };
    private w C = new w() {
        public final void a() {
            Iterator<w> it2 = o.this.l.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }

        public final void a(int i) {
            o.this.f26519f.a(7);
            o.this.f26519f.a(8);
            Iterator<w> it2 = o.this.l.iterator();
            while (it2.hasNext()) {
                it2.next().a(i);
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public p f26514a;

    /* renamed from: b  reason: collision with root package name */
    public f f26515b;

    /* renamed from: c  reason: collision with root package name */
    public d f26516c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26517d;

    /* renamed from: e  reason: collision with root package name */
    public q f26518e;

    /* renamed from: f  reason: collision with root package name */
    public m f26519f;
    public boolean g;
    public boolean h;
    public final CopyOnWriteArrayList<x> i = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<Object> j = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<Object> k = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<w> l = new CopyOnWriteArrayList<>();
    public o.f m = new o.f() {
        public final void m_() {
            o.this.a(false);
        }
    };
    private final com.mapbox.mapboxsdk.maps.o n;
    private n o;
    private Location p;
    private CameraPosition q;
    private boolean r;
    private boolean s;
    private boolean t;
    private y u;
    private o.d v = new o.d() {
        public final void a() {
            o.this.a(false);
        }
    };
    private o.m w = new o.m() {
        public final void a(@NonNull LatLng latLng) {
            if (!o.this.j.isEmpty() && o.this.f26518e.a(latLng)) {
                Iterator<Object> it2 = o.this.j.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
    };
    private o.n x = new o.n() {
        public final void a(@NonNull LatLng latLng) {
            if (!o.this.k.isEmpty() && o.this.f26518e.a(latLng)) {
                Iterator<Object> it2 = o.this.k.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
    };
    private x y = new x() {
        public final void a(boolean z) {
            q qVar = o.this.f26518e;
            qVar.f26539e.addBooleanProperty("mapbox-property-location-stale", Boolean.valueOf(z));
            qVar.d();
            if (qVar.f26535a != 8) {
                qVar.a("mapbox-location-accuracy-layer", !z);
            }
            Iterator<x> it2 = o.this.i.iterator();
            while (it2.hasNext()) {
                it2.next().a(z);
            }
        }
    };
    private v z = new v() {
        public final void a() {
            o.this.m.m_();
        }
    };

    public final void b() {
        e();
        this.s = false;
    }

    @SuppressLint({"MissingPermission"})
    private void h() {
        a(f(), true);
    }

    private void i() {
        float f2;
        if (this.f26516c != null) {
            f2 = this.f26516c.a();
        } else {
            f2 = 0.0f;
        }
        a(f2);
    }

    public final void a() {
        this.s = true;
        g();
    }

    public final void c() {
        if (this.f26515b != null && this.f26517d) {
            this.f26515b.b();
        }
    }

    @Nullable
    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    private Location f() {
        Location location;
        if (this.f26515b != null) {
            location = this.f26515b.d();
        } else {
            location = null;
        }
        if (location == null) {
            return this.p;
        }
        return location;
    }

    @SuppressLint({"MissingPermission"})
    private void g() {
        if (this.r && this.s) {
            if (!this.h) {
                this.h = true;
                this.n.a(this.m);
                this.n.a(this.v);
                if (this.f26514a.u) {
                    this.u.a();
                }
            }
            if (this.g) {
                if (this.f26515b != null) {
                    this.f26515b.a(this.B);
                    if (this.f26515b.c() && this.f26517d) {
                        this.f26515b.e();
                    }
                }
                a(this.o.f26508a);
                h();
                b(true);
                i();
            }
        }
    }

    public void e() {
        if (this.r && this.h && this.s) {
            this.h = false;
            this.f26518e.b();
            this.u.b();
            if (this.f26516c != null) {
                b(false);
            }
            this.f26519f.a();
            if (this.f26515b != null) {
                if (this.f26517d) {
                    this.f26515b.f();
                }
                this.f26515b.b(this.B);
            }
            this.n.b(this.m);
            this.n.b(this.v);
        }
    }

    public final void d() {
        if (this.r) {
            q qVar = this.f26518e;
            p pVar = this.f26514a;
            qVar.f26540f = new GeoJsonSource("mapbox-location-source", qVar.f26539e, new a().withMaxZoom(16));
            com.mapbox.mapboxsdk.maps.o oVar = qVar.f26536b;
            GeoJsonSource geoJsonSource = qVar.f26540f;
            NativeMapView nativeMapView = oVar.f26695a;
            if (!nativeMapView.a("addSource")) {
                nativeMapView.nativeAddSource(geoJsonSource, geoJsonSource.nativePtr);
            }
            qVar.a("mapbox-location-bearing-layer", pVar.E);
            qVar.a("mapbox-location-layer", "mapbox-location-bearing-layer");
            qVar.a("mapbox-location-stroke-layer", "mapbox-location-layer");
            qVar.a("mapbox-location-shadow", "mapbox-location-stroke-layer");
            CircleLayer circleLayer = new CircleLayer("mapbox-location-accuracy-layer", "mapbox-location-source");
            circleLayer.setProperties(new b("circle-radius", com.mapbox.mapboxsdk.style.a.a.b("mapbox-property-accuracy-radius")), new b("circle-color", com.mapbox.mapboxsdk.style.a.a.b("mapbox-property-accuracy-color")), new b("circle-opacity", com.mapbox.mapboxsdk.style.a.a.b("mapbox-property-accuracy-alpha")), new b("circle-stroke-color", com.mapbox.mapboxsdk.style.a.a.b("mapbox-property-accuracy-color")), new b("circle-pitch-alignment", "map"));
            qVar.a((Layer) circleLayer, "mapbox-location-stroke-layer");
            qVar.f26538d = pVar;
            if (pVar.t > 0.0f) {
                com.mapbox.mapboxsdk.maps.o oVar2 = qVar.f26536b;
                Drawable drawable = ContextCompat.getDrawable(qVar.f26537c.f26501a, 2130840271);
                float f2 = pVar.t;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                oVar2.a("mapbox-location-shadow-icon", Bitmap.createScaledBitmap(createBitmap, z.a(((float) intrinsicWidth) + f2), z.a(((float) intrinsicHeight) + f2), false));
            }
            qVar.a(pVar);
            Bitmap a2 = qVar.f26537c.a(pVar.k, pVar.q);
            Bitmap a3 = qVar.f26537c.a(pVar.f26531c, pVar.s);
            qVar.f26536b.a("mapbox-location-stroke-icon", a2);
            qVar.f26536b.a("mapbox-location-background-stale-icon", a3);
            qVar.f26536b.a("mapbox-location-bearing-icon", qVar.f26537c.a(pVar.m, pVar.o));
            float f3 = pVar.f26529a;
            int i2 = pVar.f26530b;
            qVar.f26539e.addNumberProperty("mapbox-property-accuracy-alpha", Float.valueOf(f3));
            Feature feature = qVar.f26539e;
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
            decimalFormat.applyPattern("#.###");
            String format = decimalFormat.format((double) (((float) ((i2 >> 24) & 255)) / 255.0f));
            feature.addStringProperty("mapbox-property-accuracy-color", String.format(Locale.US, "rgba(%d, %d, %d, %s)", new Object[]{Integer.valueOf((i2 >> 16) & 255), Integer.valueOf((i2 >> 8) & 255), Integer.valueOf(i2 & 255), format}));
            qVar.d();
            qVar.b(pVar);
            qVar.c(pVar);
            if (qVar.g) {
                qVar.b();
            } else {
                qVar.a();
            }
            n nVar = this.o;
            p pVar2 = this.f26514a;
            nVar.f26511d = pVar2;
            if (pVar2.B) {
                nVar.f26509b.a(nVar.f26513f, true, true);
                nVar.a();
            } else {
                nVar.f26509b.a(nVar.f26512e, true, true);
            }
        }
        g();
    }

    private void a(@NonNull d dVar) {
        if (this.t) {
            this.t = false;
        }
    }

    private void b(boolean z2) {
        if (this.f26516c != null) {
            if (!z2) {
                a(this.f26516c);
            } else if (this.r && this.s && this.g) {
                if (!this.o.b() && !this.f26518e.c()) {
                    a(this.f26516c);
                } else if (!this.t) {
                    this.t = true;
                }
            }
        }
    }

    public o(@NonNull com.mapbox.mapboxsdk.maps.o oVar) {
        this.n = oVar;
    }

    @SuppressLint({"MissingPermission"})
    public final void a(boolean z2) {
        CameraPosition g2 = this.n.g();
        if (this.q == null) {
            this.q = g2;
            this.f26518e.a((float) g2.bearing);
            this.f26518e.a(g2.tilt);
            b(f(), true);
            return;
        }
        if (g2.bearing != this.q.bearing) {
            this.f26518e.a((float) g2.bearing);
        }
        if (g2.tilt != this.q.tilt) {
            this.f26518e.a(g2.tilt);
        }
        if (g2.zoom != this.q.zoom) {
            b(f(), true);
        }
        this.q = g2;
    }

    private void a(float f2) {
        float f3;
        long j2;
        m mVar = this.f26519f;
        CameraPosition g2 = this.n.g();
        if (mVar.f26507f < 0.0f) {
            mVar.f26507f = f2;
        }
        i iVar = (i) mVar.f26502a.get(3);
        if (iVar != null) {
            f3 = ((Float) iVar.getAnimatedValue()).floatValue();
        } else {
            f3 = mVar.f26507f;
        }
        float f4 = (float) g2.bearing;
        mVar.a(3, (r) new i(Float.valueOf(f3), Float.valueOf(z.a(f2, f3)), mVar.f26503b));
        mVar.a(5, (r) new a(Float.valueOf(f4), Float.valueOf(z.a(f2, f4)), mVar.f26504c));
        if (mVar.i) {
            j2 = 500;
        } else {
            j2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(mVar.f26502a.get(3));
        arrayList.add(mVar.f26502a.get(5));
        s.a(arrayList, new LinearInterpolator(), j2);
        mVar.f26507f = f2;
    }

    private void a(int i2) {
        boolean z2;
        long j2;
        n nVar = this.o;
        boolean c2 = nVar.c();
        nVar.f26508a = i2;
        nVar.f26509b.f26698d.c();
        nVar.a();
        nVar.f26510c.a(nVar.f26508a);
        if (c2 && !nVar.c()) {
            nVar.f26509b.f26696b.a((PointF) null);
            nVar.f26510c.a();
        }
        boolean z3 = false;
        if (i2 == 36) {
            z2 = true;
        } else {
            z2 = false;
        }
        m mVar = this.f26519f;
        CameraPosition g2 = this.n.g();
        a aVar = (a) mVar.f26502a.get(5);
        if (aVar != null) {
            float floatValue = ((Float) aVar.f26543c).floatValue();
            float f2 = (float) g2.bearing;
            mVar.a(5, (r) new a(Float.valueOf(f2), Float.valueOf(z.a(floatValue, f2)), mVar.f26504c));
        }
        b bVar = (b) mVar.f26502a.get(4);
        if (bVar != null) {
            float a2 = m.a(z2, ((Float) bVar.f26543c).floatValue());
            float f3 = (float) g2.bearing;
            mVar.a(4, (r) new b(Float.valueOf(f3), Float.valueOf(z.a(a2, f3)), mVar.f26504c));
        }
        c cVar = (c) mVar.f26502a.get(1);
        if (cVar != null) {
            LatLng latLng = (LatLng) cVar.f26543c;
            LatLng latLng2 = g2.target;
            mVar.a(1, (r) new c(latLng2, latLng, mVar.f26504c));
            z3 = z.a(mVar.f26505d, latLng2, latLng);
        }
        if (z3) {
            j2 = 0;
        } else {
            j2 = 750;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(mVar.f26502a.get(1));
        arrayList.add(mVar.f26502a.get(4));
        s.a(arrayList, new FastOutSlowInInterpolator(), j2);
        b(true);
    }

    private void b(Location location, boolean z2) {
        this.f26519f.a(z.a(this.n, location), z2);
    }

    public final void a(Location location, boolean z2) {
        boolean z3;
        LatLng latLng;
        float f2;
        boolean z4;
        if (location != null) {
            if (!this.h) {
                this.p = location;
                return;
            }
            boolean z5 = this.f26518e.g;
            if (this.g && this.s && z5) {
                this.f26518e.a();
            }
            if (!z2) {
                y yVar = this.u;
                if (yVar.f26546c) {
                    yVar.f26546c = false;
                    if (yVar.f26544a) {
                        yVar.f26545b.a(false);
                    }
                }
                yVar.c();
            }
            CameraPosition g2 = this.n.g();
            if (this.o.f26508a == 36) {
                z3 = true;
            } else {
                z3 = false;
            }
            m mVar = this.f26519f;
            if (mVar.f26506e == null) {
                mVar.f26506e = location;
                mVar.g = SystemClock.elapsedRealtime() - 750;
            }
            r rVar = mVar.f26502a.get(0);
            if (rVar != null) {
                latLng = (LatLng) rVar.getAnimatedValue();
            } else {
                latLng = new LatLng(mVar.f26506e);
            }
            j jVar = (j) mVar.f26502a.get(2);
            if (jVar != null) {
                f2 = ((Float) jVar.getAnimatedValue()).floatValue();
            } else {
                f2 = mVar.f26506e.getBearing();
            }
            LatLng latLng2 = g2.target;
            float f3 = (float) g2.bearing;
            LatLng latLng3 = new LatLng(location);
            float bearing = location.getBearing();
            float a2 = m.a(z3, location.getBearing());
            mVar.a(0, (r) new k(latLng, latLng3, mVar.f26503b));
            mVar.a(2, (r) new j(Float.valueOf(f2), Float.valueOf(z.a(bearing, f2)), mVar.f26503b));
            mVar.a(1, (r) new c(latLng2, latLng3, mVar.f26504c));
            mVar.a(4, (r) new b(Float.valueOf(f3), Float.valueOf(z.a(a2, f3)), mVar.f26504c));
            if (z.a(mVar.f26505d, latLng2, latLng3) || z.a(mVar.f26505d, latLng, latLng3)) {
                z4 = true;
            } else {
                z4 = false;
            }
            long j2 = 0;
            if (!z4) {
                long j3 = mVar.g;
                mVar.g = SystemClock.elapsedRealtime();
                if (j3 != 0) {
                    j2 = (long) (((float) (mVar.g - j3)) * mVar.h);
                }
                j2 = Math.min(j2, 2000);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(mVar.f26502a.get(0));
            arrayList.add(mVar.f26502a.get(2));
            arrayList.add(mVar.f26502a.get(1));
            arrayList.add(mVar.f26502a.get(4));
            s.a(arrayList, new LinearInterpolator(), j2);
            mVar.f26506e = location;
            b(location, false);
            this.p = location;
        }
    }
}
