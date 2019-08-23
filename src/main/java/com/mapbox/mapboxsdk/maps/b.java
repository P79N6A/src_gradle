package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.view.View;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.g;
import com.mapbox.mapboxsdk.annotations.i;
import com.mapbox.mapboxsdk.annotations.j;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final h f26612a;

    /* renamed from: b  reason: collision with root package name */
    public final i f26613b = new i();

    /* renamed from: c  reason: collision with root package name */
    public final j f26614c;

    /* renamed from: d  reason: collision with root package name */
    public final LongSparseArray<com.mapbox.mapboxsdk.annotations.a> f26615d;

    /* renamed from: e  reason: collision with root package name */
    public final List<Marker> f26616e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    o f26617f;
    public o.C0308o g;
    public o.q h;
    public o.r i;
    public c j;
    public r k;
    public u l;
    public w m;
    private final MapView n;
    private z o;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f26618a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Marker> f26619b;

        /* access modifiers changed from: package-private */
        public final float a() {
            return this.f26618a.centerX();
        }

        /* access modifiers changed from: package-private */
        public final float b() {
            return this.f26618a.centerY();
        }

        a(RectF rectF, List<Marker> list) {
            this.f26618a = rectF;
            this.f26619b = list;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.b$b  reason: collision with other inner class name */
    static class C0307b {

        /* renamed from: a  reason: collision with root package name */
        long f26620a = -1;

        /* renamed from: b  reason: collision with root package name */
        private final j f26621b;

        /* renamed from: c  reason: collision with root package name */
        private final x f26622c;

        /* renamed from: d  reason: collision with root package name */
        private final int f26623d;

        /* renamed from: e  reason: collision with root package name */
        private View f26624e;

        /* renamed from: f  reason: collision with root package name */
        private Bitmap f26625f;
        private int g;
        private int h;
        private PointF i;
        private Rect j = new Rect();
        private RectF k = new RectF();
        private RectF l = new RectF();

        private boolean a(RectF rectF) {
            if (rectF.width() * rectF.height() > this.l.width() * this.l.height()) {
                return true;
            }
            return false;
        }

        C0307b(@NonNull o oVar) {
            this.f26621b = oVar.i();
            this.f26622c = oVar.f26697c;
            this.f26623d = (int) (com.mapbox.mapboxsdk.d.b().getResources().getDisplayMetrics().density * 32.0f);
        }

        /* access modifiers changed from: package-private */
        public void a(a aVar) {
            for (Marker next : aVar.f26619b) {
                if (next instanceof i) {
                    a(aVar, (i) next);
                } else {
                    a(aVar, next);
                }
            }
        }

        private void a(a aVar, Marker marker) {
            this.i = this.f26622c.a(marker.position);
            this.f26625f = marker.c().a();
            this.h = this.f26625f.getHeight();
            if (this.h < this.f26623d) {
                this.h = this.f26623d;
            }
            this.g = this.f26625f.getWidth();
            if (this.g < this.f26623d) {
                this.g = this.f26623d;
            }
            this.k.set(0.0f, 0.0f, (float) this.g, (float) this.h);
            this.k.offsetTo(this.i.x - ((float) (this.g / 2)), this.i.y - ((float) (this.h / 2)));
            a(aVar, marker, this.k);
        }

        private void a(a aVar, i iVar) {
            this.f26624e = this.f26621b.a(iVar);
            if (this.f26624e != null) {
                this.f26624e.getHitRect(this.j);
                this.k = new RectF(this.j);
                a(aVar, iVar, this.k);
            }
        }

        private void a(a aVar, Marker marker, RectF rectF) {
            if (rectF.contains(aVar.a(), aVar.b())) {
                rectF.intersect(aVar.f26618a);
                if (a(rectF)) {
                    this.l = new RectF(rectF);
                    this.f26620a = marker.f26421a;
                }
            }
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f26626a;

        c(RectF rectF) {
            this.f26626a = rectF;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        z f26627a;

        d(z zVar) {
            this.f26627a = zVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.k.a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        j jVar = this.f26614c;
        if (jVar.f26457f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < jVar.g) {
                jVar.a();
            } else {
                jVar.b();
                jVar.g = elapsedRealtime + 250;
            }
        }
        i iVar = this.f26613b;
        if (!iVar.f26647a.isEmpty()) {
            for (g d2 : iVar.f26647a) {
                d2.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (!this.f26616e.isEmpty()) {
            for (Marker next : this.f26616e) {
                if (next != null) {
                    if (next.g) {
                        next.b();
                    }
                    if (next instanceof i) {
                        this.f26614c.a((i) next, false);
                    }
                }
            }
            this.f26616e.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final com.mapbox.mapboxsdk.annotations.a a(long j2) {
        return this.j.a(j2);
    }

    /* access modifiers changed from: package-private */
    public final List<i> a(@NonNull RectF rectF) {
        return this.k.b(rectF);
    }

    public static void c(com.mapbox.mapboxsdk.annotations.a aVar) {
        Logger.w("Mbgl-AnnotationManager", String.format("Attempting to update non-added %s with value %s", new Object[]{aVar.getClass().getCanonicalName(), aVar}));
    }

    /* access modifiers changed from: package-private */
    public final void a(Polyline polyline) {
        if (!b((com.mapbox.mapboxsdk.annotations.a) polyline)) {
            c(polyline);
        } else {
            this.m.a(polyline);
        }
    }

    public boolean b(com.mapbox.mapboxsdk.annotations.a aVar) {
        if (aVar == null || aVar.f26421a == -1 || this.f26615d.indexOfKey(aVar.f26421a) < 0) {
            return false;
        }
        return true;
    }

    public final void b(@NonNull Marker marker) {
        if (this.f26616e.contains(marker)) {
            if (marker.g) {
                marker.b();
            }
            if (marker instanceof i) {
                this.f26614c.a((i) marker, false);
            }
            this.f26616e.remove(marker);
        }
    }

    public final void a(@NonNull com.mapbox.mapboxsdk.annotations.a aVar) {
        if (aVar instanceof Marker) {
            Marker marker = (Marker) aVar;
            marker.b();
            if (this.f26616e.contains(marker)) {
                this.f26616e.remove(marker);
            }
            if (marker instanceof i) {
                this.f26614c.b((i) marker);
            } else {
                this.f26612a.d(marker.c());
            }
        }
        this.j.a(aVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(o oVar) {
        int size = this.f26615d.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.mapbox.mapboxsdk.annotations.a aVar = (com.mapbox.mapboxsdk.annotations.a) this.f26615d.get((long) i2);
            if (aVar instanceof Marker) {
                Marker marker = (Marker) aVar;
                marker.h = this.f26612a.a(marker.c());
            }
        }
        for (Marker next : this.f26616e) {
            if (next.g) {
                next.b();
                next.a(oVar, this.n);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(@NonNull Marker marker) {
        if (!this.f26616e.contains(marker)) {
            if (!this.f26613b.f26649c) {
                c();
            }
            boolean z = true;
            if (marker instanceof i) {
                j jVar = this.f26614c;
                i iVar = (i) marker;
                View view = jVar.f26454c.get(iVar);
                for (o.c cVar : jVar.f26455d) {
                    if (cVar.f26702b.equals(iVar.getClass()) && view != null) {
                        iVar.w = true;
                        view.bringToFront();
                    }
                }
                j jVar2 = this.f26614c;
                View view2 = null;
                if (!jVar2.f26454c.containsKey(iVar)) {
                    Iterator<o.c> it2 = jVar2.f26455d.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        o.c next = it2.next();
                        if (next.f26702b.equals(iVar.getClass())) {
                            view2 = next.a(iVar, (View) next.f26703c.acquire(), jVar2.f26452a);
                            break;
                        }
                    }
                } else {
                    view2 = jVar2.f26454c.get(iVar);
                }
                if (view2 != null) {
                    if (iVar.j == 0.0f) {
                        if (view2.getMeasuredWidth() == 0) {
                            view2.measure(0, 0);
                        }
                        iVar.j = (float) view2.getMeasuredWidth();
                        iVar.k = (float) view2.getMeasuredHeight();
                    }
                    if (iVar.n == -1.0f) {
                        iVar.a((float) ((int) (iVar.l * iVar.j)), (float) ((int) (iVar.m * iVar.k)));
                    }
                    iVar.h = (int) ((((float) view2.getMeasuredHeight()) * iVar.q) - iVar.o);
                    iVar.i = (int) ((((float) view2.getMeasuredWidth()) * iVar.p) - iVar.n);
                }
            }
            if (marker == null || (TextUtils.isEmpty(marker.f26419e) && TextUtils.isEmpty(marker.f26418d))) {
                z = false;
            }
            if (z || this.f26613b.f26648b != null) {
                i iVar2 = this.f26613b;
                iVar2.f26647a.add(marker.a(this.f26617f, this.n));
            }
            this.f26616e.add(marker);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.mapbox.mapboxsdk.annotations.a} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.graphics.PointF r8) {
        /*
            r7 = this;
            com.mapbox.mapboxsdk.maps.h r0 = r7.f26612a
            int r0 = r0.f26645c
            double r0 = (double) r0
            r2 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r2
            int r0 = (int) r0
            com.mapbox.mapboxsdk.maps.h r1 = r7.f26612a
            int r1 = r1.f26644b
            double r4 = (double) r1
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r2
            int r1 = (int) r4
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r8.x
            float r0 = (float) r0
            float r3 = r3 - r0
            float r4 = r8.y
            float r1 = (float) r1
            float r4 = r4 - r1
            float r5 = r8.x
            float r5 = r5 + r0
            float r0 = r8.y
            float r0 = r0 + r1
            r2.<init>(r3, r4, r5, r0)
            com.mapbox.mapboxsdk.maps.b$a r0 = new com.mapbox.mapboxsdk.maps.b$a
            com.mapbox.mapboxsdk.maps.r r1 = r7.k
            java.util.List r1 = r1.a(r2)
            r0.<init>(r2, r1)
            com.mapbox.mapboxsdk.maps.b$b r1 = new com.mapbox.mapboxsdk.maps.b$b
            com.mapbox.mapboxsdk.maps.o r2 = r7.f26617f
            r1.<init>(r2)
            r1.a((com.mapbox.mapboxsdk.maps.b.a) r0)
            long r0 = r1.f26620a
            r2 = 0
            r3 = 1
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x007d
            com.mapbox.mapboxsdk.annotations.a r8 = r7.a((long) r0)
            com.mapbox.mapboxsdk.annotations.Marker r8 = (com.mapbox.mapboxsdk.annotations.Marker) r8
            boolean r0 = r8 instanceof com.mapbox.mapboxsdk.annotations.i
            if (r0 == 0) goto L_0x005e
            com.mapbox.mapboxsdk.annotations.j r0 = r7.f26614c
            r1 = r8
            com.mapbox.mapboxsdk.annotations.i r1 = (com.mapbox.mapboxsdk.annotations.i) r1
            boolean r2 = r0.c(r1)
            goto L_0x006b
        L_0x005e:
            com.mapbox.mapboxsdk.maps.o$o r0 = r7.g
            if (r0 == 0) goto L_0x006b
            com.mapbox.mapboxsdk.maps.o$o r0 = r7.g
            boolean r0 = r0.a(r8)
            if (r0 == 0) goto L_0x006b
            r2 = 1
        L_0x006b:
            if (r2 != 0) goto L_0x007c
            java.util.List<com.mapbox.mapboxsdk.annotations.Marker> r0 = r7.f26616e
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0079
            r7.a((com.mapbox.mapboxsdk.annotations.Marker) r8)
            goto L_0x007c
        L_0x0079:
            r7.b((com.mapbox.mapboxsdk.annotations.Marker) r8)
        L_0x007c:
            return r3
        L_0x007d:
            android.content.Context r0 = com.mapbox.mapboxsdk.d.b()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131427657(0x7f0b0149, float:1.8476936E38)
            float r0 = r0.getDimension(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            float r4 = r8.x
            float r4 = r4 - r0
            float r5 = r8.y
            float r5 = r5 - r0
            float r6 = r8.x
            float r6 = r6 + r0
            float r8 = r8.y
            float r8 = r8 + r0
            r1.<init>(r4, r5, r6, r8)
            com.mapbox.mapboxsdk.maps.b$c r8 = new com.mapbox.mapboxsdk.maps.b$c
            r8.<init>(r1)
            com.mapbox.mapboxsdk.maps.b$d r0 = new com.mapbox.mapboxsdk.maps.b$d
            com.mapbox.mapboxsdk.maps.z r1 = r7.o
            r0.<init>(r1)
            r1 = 0
            com.mapbox.mapboxsdk.maps.z r0 = r0.f26627a
            android.graphics.RectF r8 = r8.f26626a
            java.util.List r8 = r0.a(r8)
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x00bf
            java.lang.Object r8 = r8.get(r2)
            r1 = r8
            com.mapbox.mapboxsdk.annotations.a r1 = (com.mapbox.mapboxsdk.annotations.a) r1
        L_0x00bf:
            if (r1 == 0) goto L_0x00d8
            boolean r8 = r1 instanceof com.mapbox.mapboxsdk.annotations.Polygon
            if (r8 == 0) goto L_0x00cb
            com.mapbox.mapboxsdk.maps.o$q r8 = r7.h
            if (r8 == 0) goto L_0x00cb
        L_0x00c9:
            r8 = 1
            goto L_0x00d5
        L_0x00cb:
            boolean r8 = r1 instanceof com.mapbox.mapboxsdk.annotations.Polyline
            if (r8 == 0) goto L_0x00d4
            com.mapbox.mapboxsdk.maps.o$r r8 = r7.i
            if (r8 == 0) goto L_0x00d4
            goto L_0x00c9
        L_0x00d4:
            r8 = 0
        L_0x00d5:
            if (r8 == 0) goto L_0x00d8
            return r3
        L_0x00d8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.b.a(android.graphics.PointF):boolean");
    }

    b(NativeMapView nativeMapView, MapView mapView, LongSparseArray<com.mapbox.mapboxsdk.annotations.a> longSparseArray, j jVar, h hVar, c cVar, r rVar, u uVar, w wVar, z zVar) {
        this.n = mapView;
        this.f26615d = longSparseArray;
        this.f26614c = jVar;
        this.f26612a = hVar;
        this.j = cVar;
        this.k = rVar;
        this.l = uVar;
        this.m = wVar;
        this.o = zVar;
        if (nativeMapView != null) {
            nativeMapView.a((MapView.l) jVar);
        }
    }
}
