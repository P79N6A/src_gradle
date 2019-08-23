package com.ss.android.ugc.aweme.map.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.mapbox.geojson.Point;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.f;
import com.mapbox.mapboxsdk.annotations.i;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.maps.o;
import com.mapbox.mapboxsdk.maps.x;
import com.mapbox.mapboxsdk.snapshotter.MapSnapshot;
import com.mapbox.mapboxsdk.snapshotter.MapSnapshotter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.map.a;
import com.ss.android.ugc.aweme.map.b.b;
import com.ss.android.ugc.aweme.map.b.c;
import com.ss.android.ugc.aweme.map.b.d;
import com.ss.android.ugc.aweme.map.e;
import com.ss.android.ugc.aweme.map.g;
import com.ss.android.ugc.aweme.map.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class a extends com.ss.android.ugc.aweme.map.a implements d {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f55014e;

    /* renamed from: f  reason: collision with root package name */
    protected Context f55015f;
    protected FrameLayout g;
    protected com.mapbox.mapboxsdk.plugins.china.maps.a h;
    protected o i;
    protected Marker j;
    protected Marker k;
    protected String l;
    protected String m;
    protected boolean n;
    protected String o;
    protected com.ss.android.ugc.aweme.map.d p;
    private h q;
    private h r;
    private c s;
    private List<Point> t;
    private List<Point> u;
    private Polyline v;
    private MapSnapshotter w;

    public void a(Bundle bundle, boolean z, Locale locale, com.ss.android.ugc.aweme.map.d dVar) {
    }

    public void b(Bitmap bitmap, double d2, double d3, float f2, e eVar) {
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f55014e, false, 58321, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f55014e, false, 58321, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.h.b(bundle2);
    }

    public final void a(View view, h hVar, Bitmap bitmap, a.C0634a aVar) {
        final View view2 = view;
        h hVar2 = hVar;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{view2, hVar2, bitmap2, aVar}, this, f55014e, false, 58328, new Class[]{View.class, h.class, Bitmap.class, a.C0634a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, hVar2, bitmap2, aVar}, this, f55014e, false, 58328, new Class[]{View.class, h.class, Bitmap.class, a.C0634a.class}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.f26699e.f26613b.f26648b = new o.b() {
                @Nullable
                public final View a() {
                    return view2;
                }
            };
            LatLng latLng = new LatLng(hVar2.f55066a, hVar2.f55067b);
            com.mapbox.mapboxsdk.annotations.h hVar3 = (com.mapbox.mapboxsdk.annotations.h) ((com.mapbox.mapboxsdk.annotations.h) new com.mapbox.mapboxsdk.annotations.h().a(latLng)).a(f.a(this.f55015f).a(bitmap2));
            if (this.k != null) {
                this.k.a();
                this.k = null;
            }
            this.k = this.i.a(hVar3);
            this.i.a(this.k);
        }
    }

    public final void a(h hVar, h hVar2, g gVar, String str, com.ss.android.ugc.aweme.map.f fVar) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        g gVar2 = gVar;
        String str2 = str;
        com.ss.android.ugc.aweme.map.f fVar2 = fVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{hVar3, hVar4, gVar2, str2, fVar2}, this, f55014e, false, 58330, new Class[]{h.class, h.class, g.class, String.class, com.ss.android.ugc.aweme.map.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar3, hVar4, gVar2, str2, fVar2}, this, f55014e, false, 58330, new Class[]{h.class, h.class, g.class, String.class, com.ss.android.ugc.aweme.map.f.class}, Void.TYPE);
            return;
        }
        this.f55011b = fVar2;
        this.f55012c = gVar2;
        this.q = hVar3;
        this.r = hVar4;
        if (com.ss.android.ugc.aweme.map.c.a.a(hVar3.f55066a, hVar3.f55067b) && com.ss.android.ugc.aweme.map.c.a.a(hVar4.f55066a, hVar4.f55067b)) {
            z = true;
        }
        if (z) {
            this.s = new b(this, this.n, this.f55015f);
        } else {
            this.s = new com.ss.android.ugc.aweme.map.b.a(this.f55015f, this);
        }
        this.s.a(hVar3, hVar4, str2);
    }

    public final void a(g gVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{gVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55014e, false, 58331, new Class[]{g.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar, Byte.valueOf(z)}, this, f55014e, false, 58331, new Class[]{g.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f55012c = gVar;
        switch (gVar) {
            case RouteDrive:
                a(this.t);
                return;
            case RouteWalking:
                a(this.u);
                break;
            case RouteTransit:
                return;
        }
    }

    public final void a(com.ss.android.ugc.aweme.map.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f55014e, false, 58333, new Class[]{com.ss.android.ugc.aweme.map.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f55014e, false, 58333, new Class[]{com.ss.android.ugc.aweme.map.c.class}, Void.TYPE);
            return;
        }
        super.a(cVar);
        if (this.i != null) {
            o oVar = this.i;
            oVar.f26700f.a(new o.m() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55021a;

                public final void a(@NonNull LatLng latLng) {
                    if (PatchProxy.isSupport(new Object[]{latLng}, this, f55021a, false, 58340, new Class[]{LatLng.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{latLng}, this, f55021a, false, 58340, new Class[]{LatLng.class}, Void.TYPE);
                        return;
                    }
                    if (a.this.f55010a != null) {
                        a.this.f55010a.a(latLng.a(), latLng.b());
                    }
                }
            });
        }
    }

    public final void a(a.b bVar) {
        MapSnapshotter.c cVar;
        a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f55014e, false, 58334, new Class[]{a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f55014e, false, 58334, new Class[]{a.b.class}, Void.TYPE);
        } else if (this.i != null) {
            if (this.w == null) {
                int width = this.h.getWidth() / 2;
                int height = this.h.getHeight() / 2;
                if (width <= 0) {
                    width = 500;
                }
                if (height <= 0) {
                    height = 500;
                }
                new MapSnapshotter.c(width, height);
                x xVar = this.i.f26697c;
                float l2 = (float) xVar.f26747a.l();
                float m2 = (float) xVar.f26747a.m();
                LatLng a2 = xVar.a(new PointF(((l2 - 0.0f) / 2.0f) + 0.0f, ((m2 - 0.0f) / 2.0f) + 0.0f));
                LatLng a3 = xVar.a(new PointF(0.0f, 0.0f));
                LatLng a4 = xVar.a(new PointF(l2, 0.0f));
                LatLng a5 = xVar.a(new PointF(l2, m2));
                LatLng a6 = xVar.a(new PointF(0.0f, m2));
                ArrayList<LatLng> arrayList = new ArrayList<>();
                arrayList.add(a4);
                arrayList.add(a5);
                arrayList.add(a6);
                arrayList.add(a3);
                double d2 = -90.0d;
                double d3 = 90.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                double d6 = 0.0d;
                double d7 = 0.0d;
                for (LatLng latLng : arrayList) {
                    double b2 = x.b(a2.b());
                    double b3 = x.b(latLng.b());
                    double b4 = x.b(a2.a());
                    double b5 = x.b(latLng.a());
                    double d8 = b3 - b2;
                    MapSnapshotter.c cVar2 = cVar;
                    if (((Math.atan2(Math.sin(d8) * Math.cos(b5), (Math.cos(b4) * Math.sin(b5)) - ((Math.sin(b4) * Math.cos(b5)) * Math.cos(d8))) % 6.283185307179586d) * 180.0d) / 3.141592653589793d >= 0.0d) {
                        double a7 = x.a(latLng.b(), a2.b());
                        if (a7 > d4) {
                            d6 = latLng.b();
                        } else {
                            a7 = d4;
                        }
                        d4 = a7;
                    } else {
                        double a8 = x.a(a2.b(), latLng.b());
                        if (a8 > d5) {
                            d5 = a8;
                            d7 = latLng.b();
                        }
                    }
                    if (d2 < latLng.a()) {
                        d2 = latLng.a();
                    }
                    if (d3 > latLng.a()) {
                        d3 = latLng.a();
                    }
                    cVar = cVar2;
                    a.b bVar3 = bVar;
                }
                com.mapbox.mapboxsdk.geometry.b bVar4 = new com.mapbox.mapboxsdk.geometry.b(a3, a4, a6, a5, LatLngBounds.a(d2, d6, d3, d7));
                MapSnapshotter.c cVar3 = cVar;
                cVar3.f26786f = bVar4.f26495e;
                cVar3.f26784d = this.i.f26695a.c();
                this.w = new MapSnapshotter(this.f55015f, cVar3);
            }
            try {
                final a.b bVar5 = bVar;
                this.w.a(new MapSnapshotter.d() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55023a;

                    public final void a(MapSnapshot mapSnapshot) {
                        if (PatchProxy.isSupport(new Object[]{mapSnapshot}, this, f55023a, false, 58341, new Class[]{MapSnapshot.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{mapSnapshot}, this, f55023a, false, 58341, new Class[]{MapSnapshot.class}, Void.TYPE);
                            return;
                        }
                        Bitmap bitmap = mapSnapshot.f26769a;
                        if (bVar5 != null) {
                            bVar5.a(bitmap);
                        }
                    }
                });
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final void a(List<Point> list, g gVar, int i2) {
        List<Point> list2 = list;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{list2, gVar2, Integer.valueOf(i2)}, this, f55014e, false, 58337, new Class[]{List.class, g.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, gVar2, Integer.valueOf(i2)}, this, f55014e, false, 58337, new Class[]{List.class, g.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (gVar) {
            case RouteDrive:
                this.t = list2;
                break;
            case RouteWalking:
                this.u = list2;
                break;
        }
        if (this.f55013d) {
            a(list);
        }
        if (this.f55011b != null) {
            this.f55011b.a(gVar2, i2);
        }
    }

    public final void a(g gVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{gVar, -1}, this, f55014e, false, 58338, new Class[]{g.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar, -1}, this, f55014e, false, 58338, new Class[]{g.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f55011b != null) {
            this.f55011b.a(gVar, -1);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55014e, false, 58317, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55014e, false, 58317, new Class[0], Void.TYPE);
            return;
        }
        this.h.d();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f55014e, false, 58318, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55014e, false, 58318, new Class[0], Void.TYPE);
            return;
        }
        this.h.e();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f55014e, false, 58319, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55014e, false, 58319, new Class[0], Void.TYPE);
            return;
        }
        this.h.f();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f55014e, false, 58320, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55014e, false, 58320, new Class[0], Void.TYPE);
            return;
        }
        this.h.g();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f55014e, false, 58322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55014e, false, 58322, new Class[0], Void.TYPE);
            return;
        }
        this.h.c();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f55014e, false, 58323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55014e, false, 58323, new Class[0], Void.TYPE);
            return;
        }
        this.h.h();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f55014e, false, 58332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55014e, false, 58332, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            com.mapbox.mapboxsdk.maps.b bVar = this.i.f26699e;
            int size = bVar.f26615d.size();
            long[] jArr = new long[size];
            bVar.f26616e.clear();
            for (int i2 = 0; i2 < size; i2++) {
                jArr[i2] = bVar.f26615d.keyAt(i2);
                com.mapbox.mapboxsdk.annotations.a aVar = (com.mapbox.mapboxsdk.annotations.a) bVar.f26615d.get(jArr[i2]);
                if (aVar instanceof Marker) {
                    Marker marker = (Marker) aVar;
                    marker.b();
                    if (marker instanceof i) {
                        bVar.f26614c.b((i) marker);
                    } else {
                        bVar.f26612a.d(marker.c());
                    }
                }
            }
            bVar.j.a();
        }
    }

    public a(FrameLayout frameLayout) {
        this.g = frameLayout;
        this.f55015f = frameLayout.getContext();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0170, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(java.util.List<com.mapbox.geojson.Point> r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0171 }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x0171 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55014e     // Catch:{ all -> 0x0171 }
            r4 = 0
            r5 = 58335(0xe3df, float:8.1745E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0171 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r6[r9] = r2     // Catch:{ all -> 0x0171 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0171 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0171 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0171 }
            r1[r9] = r11     // Catch:{ all -> 0x0171 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55014e     // Catch:{ all -> 0x0171 }
            r4 = 0
            r5 = 58335(0xe3df, float:8.1745E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0171 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r6[r9] = r0     // Catch:{ all -> 0x0171 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0171 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0171 }
            monitor-exit(r10)
            return
        L_0x0034:
            if (r11 == 0) goto L_0x016f
            int r1 = r11.size()     // Catch:{ all -> 0x0171 }
            if (r1 != 0) goto L_0x003e
            goto L_0x016f
        L_0x003e:
            int r1 = r11.size()     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.geometry.LatLng[] r1 = new com.mapbox.mapboxsdk.geometry.LatLng[r1]     // Catch:{ all -> 0x0171 }
            r2 = 0
        L_0x0045:
            int r3 = r11.size()     // Catch:{ all -> 0x0171 }
            if (r2 >= r3) goto L_0x0069
            com.mapbox.mapboxsdk.geometry.LatLng r3 = new com.mapbox.mapboxsdk.geometry.LatLng     // Catch:{ all -> 0x0171 }
            java.lang.Object r4 = r11.get(r2)     // Catch:{ all -> 0x0171 }
            com.mapbox.geojson.Point r4 = (com.mapbox.geojson.Point) r4     // Catch:{ all -> 0x0171 }
            double r4 = r4.latitude()     // Catch:{ all -> 0x0171 }
            java.lang.Object r6 = r11.get(r2)     // Catch:{ all -> 0x0171 }
            com.mapbox.geojson.Point r6 = (com.mapbox.geojson.Point) r6     // Catch:{ all -> 0x0171 }
            double r6 = r6.longitude()     // Catch:{ all -> 0x0171 }
            r3.<init>(r4, r6)     // Catch:{ all -> 0x0171 }
            r1[r2] = r3     // Catch:{ all -> 0x0171 }
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0069:
            com.mapbox.mapboxsdk.annotations.Polyline r0 = r10.v     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x0076
            com.mapbox.mapboxsdk.maps.o r0 = r10.i     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.annotations.Polyline r2 = r10.v     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.maps.b r0 = r0.f26699e     // Catch:{ all -> 0x0171 }
            r0.a((com.mapbox.mapboxsdk.annotations.a) r2)     // Catch:{ all -> 0x0171 }
        L_0x0076:
            com.mapbox.mapboxsdk.maps.o r0 = r10.i     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.annotations.k r2 = new com.mapbox.mapboxsdk.annotations.k     // Catch:{ all -> 0x0171 }
            r2.<init>()     // Catch:{ all -> 0x0171 }
            int r3 = r1.length     // Catch:{ all -> 0x0171 }
            r4 = 0
        L_0x007f:
            if (r4 >= r3) goto L_0x0089
            r5 = r1[r4]     // Catch:{ all -> 0x0171 }
            r2.a((com.mapbox.mapboxsdk.geometry.LatLng) r5)     // Catch:{ all -> 0x0171 }
            int r4 = r4 + 1
            goto L_0x007f
        L_0x0089:
            java.lang.String r1 = "#3887be"
            int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.annotations.k r1 = r2.a((int) r1)     // Catch:{ all -> 0x0171 }
            r2 = 1084227584(0x40a00000, float:5.0)
            com.mapbox.mapboxsdk.annotations.k r1 = r1.a((float) r2)     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.maps.b r2 = r0.f26699e     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.maps.w r2 = r2.m     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.annotations.Polyline r0 = r2.a(r1, r0)     // Catch:{ all -> 0x0171 }
            r10.v = r0     // Catch:{ all -> 0x0171 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0171 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55014e     // Catch:{ all -> 0x0171 }
            r4 = 0
            r5 = 58336(0xe3e0, float:8.1746E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x0171 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0171 }
            r2 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x00c8
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0171 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55014e     // Catch:{ all -> 0x0171 }
            r4 = 0
            r5 = 58336(0xe3e0, float:8.1746E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x0171 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0171 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0171 }
            monitor-exit(r10)
            return
        L_0x00c8:
            com.ss.android.ugc.aweme.map.h r0 = r10.q     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x016d
            com.ss.android.ugc.aweme.map.h r0 = r10.r     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x016d
            com.mapbox.mapboxsdk.maps.o r0 = r10.i     // Catch:{ all -> 0x0171 }
            if (r0 != 0) goto L_0x00d6
            goto L_0x016d
        L_0x00d6:
            com.mapbox.mapboxsdk.geometry.LatLngBounds$a r0 = new com.mapbox.mapboxsdk.geometry.LatLngBounds$a     // Catch:{ all -> 0x0171 }
            r0.<init>()     // Catch:{ all -> 0x0171 }
            int[] r1 = com.ss.android.ugc.aweme.map.a.a.AnonymousClass5.f55026a     // Catch:{ all -> 0x0171 }
            com.ss.android.ugc.aweme.map.g r2 = r10.f55012c     // Catch:{ all -> 0x0171 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0171 }
            r1 = r1[r2]     // Catch:{ all -> 0x0171 }
            switch(r1) {
                case 1: goto L_0x011b;
                case 2: goto L_0x00e9;
                default: goto L_0x00e8;
            }     // Catch:{ all -> 0x0171 }
        L_0x00e8:
            goto L_0x014d
        L_0x00e9:
            java.util.List<com.mapbox.geojson.Point> r1 = r10.u     // Catch:{ all -> 0x0171 }
            if (r1 == 0) goto L_0x0119
            java.util.List<com.mapbox.geojson.Point> r1 = r10.u     // Catch:{ all -> 0x0171 }
            int r1 = r1.size()     // Catch:{ all -> 0x0171 }
            if (r1 != 0) goto L_0x00f6
            goto L_0x0119
        L_0x00f6:
            java.util.List<com.mapbox.geojson.Point> r1 = r10.u     // Catch:{ all -> 0x0171 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0171 }
        L_0x00fc:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0171 }
            if (r2 == 0) goto L_0x014d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0171 }
            com.mapbox.geojson.Point r2 = (com.mapbox.geojson.Point) r2     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.geometry.LatLng r3 = new com.mapbox.mapboxsdk.geometry.LatLng     // Catch:{ all -> 0x0171 }
            double r4 = r2.latitude()     // Catch:{ all -> 0x0171 }
            double r6 = r2.longitude()     // Catch:{ all -> 0x0171 }
            r3.<init>(r4, r6)     // Catch:{ all -> 0x0171 }
            r0.a(r3)     // Catch:{ all -> 0x0171 }
            goto L_0x00fc
        L_0x0119:
            monitor-exit(r10)
            return
        L_0x011b:
            java.util.List<com.mapbox.geojson.Point> r1 = r10.t     // Catch:{ all -> 0x0171 }
            if (r1 == 0) goto L_0x014b
            java.util.List<com.mapbox.geojson.Point> r1 = r10.t     // Catch:{ all -> 0x0171 }
            int r1 = r1.size()     // Catch:{ all -> 0x0171 }
            if (r1 != 0) goto L_0x0128
            goto L_0x014b
        L_0x0128:
            java.util.List<com.mapbox.geojson.Point> r1 = r10.t     // Catch:{ all -> 0x0171 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0171 }
        L_0x012e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0171 }
            if (r2 == 0) goto L_0x014d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0171 }
            com.mapbox.geojson.Point r2 = (com.mapbox.geojson.Point) r2     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.geometry.LatLng r3 = new com.mapbox.mapboxsdk.geometry.LatLng     // Catch:{ all -> 0x0171 }
            double r4 = r2.latitude()     // Catch:{ all -> 0x0171 }
            double r6 = r2.longitude()     // Catch:{ all -> 0x0171 }
            r3.<init>(r4, r6)     // Catch:{ all -> 0x0171 }
            r0.a(r3)     // Catch:{ all -> 0x0171 }
            goto L_0x012e
        L_0x014b:
            monitor-exit(r10)
            return
        L_0x014d:
            r1 = 1125515264(0x43160000, float:150.0)
            android.content.Context r2 = r10.f55015f     // Catch:{ all -> 0x0171 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x0171 }
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch:{ all -> 0x0171 }
            float r1 = android.util.TypedValue.applyDimension(r8, r1, r2)     // Catch:{ all -> 0x0171 }
            int r1 = (int) r1     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.maps.o r2 = r10.i     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.geometry.LatLngBounds r0 = r0.a()     // Catch:{ all -> 0x0171 }
            com.mapbox.mapboxsdk.camera.a r0 = com.mapbox.mapboxsdk.camera.b.a(r0, r1)     // Catch:{ all -> 0x0171 }
            r2.b((com.mapbox.mapboxsdk.camera.a) r0)     // Catch:{ all -> 0x0171 }
            monitor-exit(r10)
            return
        L_0x016d:
            monitor-exit(r10)
            return
        L_0x016f:
            monitor-exit(r10)
            return
        L_0x0171:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.map.a.a.a(java.util.List):void");
    }

    public final void a(Bitmap bitmap, double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3)}, this, f55014e, false, 58326, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3)}, this, f55014e, false, 58326, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            if (this.j != null) {
                this.j.a();
                this.j = null;
            }
            this.j = a(bitmap, d2, d3, (e) null);
        }
    }

    public final Marker a(Bitmap bitmap, double d2, double d3, e eVar) {
        Bitmap bitmap2 = bitmap;
        final e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{bitmap2, Double.valueOf(d2), Double.valueOf(d3), eVar2}, this, f55014e, false, 58327, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, e.class}, Marker.class)) {
            return (Marker) PatchProxy.accessDispatch(new Object[]{bitmap2, Double.valueOf(d2), Double.valueOf(d3), eVar2}, this, f55014e, false, 58327, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, e.class}, Marker.class);
        }
        com.mapbox.mapboxsdk.annotations.h hVar = new com.mapbox.mapboxsdk.annotations.h();
        hVar.a(f.a(this.f55015f).a(bitmap2));
        hVar.a(new LatLng(d2, d3));
        Marker a2 = this.i.a(hVar);
        if (eVar2 != null) {
            this.i.a((o.C0308o) new o.C0308o() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55016a;

                public final boolean a(@NonNull Marker marker) {
                    if (PatchProxy.isSupport(new Object[]{marker}, this, f55016a, false, 58339, new Class[]{Marker.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{marker}, this, f55016a, false, 58339, new Class[]{Marker.class}, Boolean.TYPE)).booleanValue();
                    }
                    if (eVar2 != null) {
                        eVar2.a();
                    }
                    return true;
                }
            });
        }
        return a2;
    }

    public final void a(double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, f55014e, false, 58325, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, f55014e, false, 58325, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            LatLngBounds.a aVar = new LatLngBounds.a();
            switch (this.f55012c) {
                case RouteDrive:
                    for (Point next : this.t) {
                        aVar.a(new LatLng(next.latitude(), next.longitude()));
                    }
                    break;
                case RouteWalking:
                    for (Point next2 : this.u) {
                        aVar.a(new LatLng(next2.latitude(), next2.longitude()));
                    }
                    break;
            }
            this.i.b(com.mapbox.mapboxsdk.camera.b.a(aVar.a(), (int) TypedValue.applyDimension(1, 50.0f, this.f55015f.getResources().getDisplayMetrics())));
        }
    }

    public final void a(Bitmap bitmap, double d2, double d3, float f2, e eVar) {
        if (PatchProxy.isSupport(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Float.valueOf(f2), eVar}, this, f55014e, false, 58324, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Float.TYPE, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Float.valueOf(f2), eVar}, this, f55014e, false, 58324, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Float.TYPE, e.class}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            b(bitmap, d2, d3, f2, eVar);
        }
    }
}
