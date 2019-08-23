package com.ss.android.ugc.aweme.map.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DrivePath;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.WalkPath;
import com.amap.api.services.route.WalkRouteResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.map.a;
import com.ss.android.ugc.aweme.map.c;
import com.ss.android.ugc.aweme.map.d;
import com.ss.android.ugc.aweme.map.e;
import com.ss.android.ugc.aweme.map.f;
import com.ss.android.ugc.aweme.map.g;
import com.ss.android.ugc.aweme.map.h;
import java.util.Locale;

public final class b extends a implements RouteSearch.OnRouteSearchListener {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f55034e;

    /* renamed from: f  reason: collision with root package name */
    private Context f55035f;
    private AMap g;
    private MapView h = new MapView(this.f55035f);
    private DrivePath i;
    private WalkPath j;
    private com.ss.android.ugc.aweme.map.a.a.a.b k;
    private LatLonPoint l;
    private LatLonPoint m;
    private Marker n;

    public final void c() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void onBusRouteSearched(BusRouteResult busRouteResult, int i2) {
    }

    public final void onRideRouteSearched(RideRouteResult rideRouteResult, int i2) {
    }

    public final void a(final a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f55034e, false, 58342, new Class[]{a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f55034e, false, 58342, new Class[]{a.b.class}, Void.TYPE);
            return;
        }
        this.g.getMapScreenShot(new AMap.OnMapScreenShotListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55036a;

            public final void onMapScreenShot(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f55036a, false, 58362, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f55036a, false, 58362, new Class[]{Bitmap.class}, Void.TYPE);
                    return;
                }
                bVar.a(bitmap2);
            }
        });
    }

    public final void a(Bundle bundle, boolean z, Locale locale, d dVar) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2, Byte.valueOf(z ? (byte) 1 : 0), locale, dVar}, this, f55034e, false, 58343, new Class[]{Bundle.class, Boolean.TYPE, Locale.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2, Byte.valueOf(z), locale, dVar}, this, f55034e, false, 58343, new Class[]{Bundle.class, Boolean.TYPE, Locale.class, d.class}, Void.TYPE);
            return;
        }
        this.h.onCreate(bundle2);
        dVar.a();
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f55034e, false, 58348, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f55034e, false, 58348, new Class[]{c.class}, Void.TYPE);
            return;
        }
        super.a(cVar);
        this.g.setOnMapClickListener(new AMap.OnMapClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55039a;

            public final void onMapClick(LatLng latLng) {
                if (PatchProxy.isSupport(new Object[]{latLng}, this, f55039a, false, 58363, new Class[]{LatLng.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{latLng}, this, f55039a, false, 58363, new Class[]{LatLng.class}, Void.TYPE);
                    return;
                }
                if (b.this.f55010a != null) {
                    b.this.f55010a.a(latLng.latitude, latLng.longitude);
                }
            }
        });
    }

    public final void a(h hVar, h hVar2, g gVar, String str, f fVar) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        g gVar2 = gVar;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{hVar3, hVar4, gVar2, str, fVar2}, this, f55034e, false, 58351, new Class[]{h.class, h.class, g.class, String.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar3, hVar4, gVar2, str, fVar2}, this, f55034e, false, 58351, new Class[]{h.class, h.class, g.class, String.class, f.class}, Void.TYPE);
            return;
        }
        this.f55011b = fVar2;
        this.f55012c = gVar2;
        this.l = new LatLonPoint(hVar3.f55066a, hVar3.f55067b);
        this.m = new LatLonPoint(hVar4.f55066a, hVar4.f55067b);
        RouteSearch.FromAndTo fromAndTo = new RouteSearch.FromAndTo(this.l, this.m);
        RouteSearch routeSearch = new RouteSearch(this.h.getContext());
        routeSearch.setRouteSearchListener(this);
        RouteSearch.DriveRouteQuery driveRouteQuery = new RouteSearch.DriveRouteQuery(fromAndTo, 0, null, null, "");
        routeSearch.calculateDriveRouteAsyn(driveRouteQuery);
        routeSearch.calculateWalkRouteAsyn(new RouteSearch.WalkRouteQuery(fromAndTo, 0));
    }

    public final void a(View view, h hVar, Bitmap bitmap, a.C0634a aVar) {
        final View view2 = view;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{view2, hVar2, bitmap, aVar}, this, f55034e, false, 58354, new Class[]{View.class, h.class, Bitmap.class, a.C0634a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, hVar2, bitmap, aVar}, this, f55034e, false, 58354, new Class[]{View.class, h.class, Bitmap.class, a.C0634a.class}, Void.TYPE);
            return;
        }
        this.g.setInfoWindowAdapter(new AMap.InfoWindowAdapter() {
            public final View getInfoContents(Marker marker) {
                return view2;
            }

            public final View getInfoWindow(Marker marker) {
                return view2;
            }
        });
        if (this.n != null) {
            this.n.remove();
            this.n.destroy();
        }
        this.n = this.g.addMarker(new MarkerOptions().position(new LatLng(hVar2.f55066a, hVar2.f55067b)).title("").icon(BitmapDescriptorFactory.fromBitmap(bitmap)).draggable(false));
        this.n.showInfoWindow();
    }

    public final void a(g gVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{gVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55034e, false, 58356, new Class[]{g.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar, Byte.valueOf(z)}, this, f55034e, false, 58356, new Class[]{g.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f55012c = gVar;
        switch (gVar) {
            case RouteTransit:
                return;
            case RouteDrive:
                if (this.i != null) {
                    b(gVar, z);
                    return;
                }
                break;
            case RouteWalking:
                if (this.j != null) {
                    b(gVar, z);
                    break;
                }
                break;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55034e, false, 58345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55034e, false, 58345, new Class[0], Void.TYPE);
            return;
        }
        this.h.onResume();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f55034e, false, 58346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55034e, false, 58346, new Class[0], Void.TYPE);
            return;
        }
        this.h.onPause();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f55034e, false, 58358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55034e, false, 58358, new Class[0], Void.TYPE);
            return;
        }
        this.h.getMap().clear();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f55034e, false, 58347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55034e, false, 58347, new Class[0], Void.TYPE);
            return;
        }
        this.g.setInfoWindowAdapter(null);
        this.g.setOnMapClickListener(null);
        this.g.setOnMarkerClickListener(null);
        this.f55010a = null;
        this.g.clear();
        this.h.onDestroy();
    }

    public b(FrameLayout frameLayout) {
        this.f55035f = frameLayout.getContext();
        frameLayout.addView(this.h, new FrameLayout.LayoutParams(-1, -1));
        this.g = this.h.getMap();
        this.g.getUiSettings().setMyLocationButtonEnabled(false);
        this.g.getUiSettings().setZoomControlsEnabled(false);
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f55034e, false, 58344, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f55034e, false, 58344, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.h.onSaveInstanceState(bundle2);
    }

    public final void onDriveRouteSearched(DriveRouteResult driveRouteResult, int i2) {
        if (PatchProxy.isSupport(new Object[]{driveRouteResult, Integer.valueOf(i2)}, this, f55034e, false, 58359, new Class[]{DriveRouteResult.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{driveRouteResult, Integer.valueOf(i2)}, this, f55034e, false, 58359, new Class[]{DriveRouteResult.class, Integer.TYPE}, Void.TYPE);
        } else if (i2 != 1000 || driveRouteResult == null || driveRouteResult.getPaths() == null || driveRouteResult.getPaths().size() <= 0) {
            if (this.f55011b != null) {
                this.f55011b.a(g.RouteDrive, -1);
            }
        } else {
            this.i = driveRouteResult.getPaths().get(0);
            int duration = (int) this.i.getDuration();
            if (this.f55013d) {
                b(g.RouteDrive, true);
            }
            if (this.f55011b != null) {
                this.f55011b.a(g.RouteDrive, duration);
            }
        }
    }

    public final void onWalkRouteSearched(WalkRouteResult walkRouteResult, int i2) {
        if (PatchProxy.isSupport(new Object[]{walkRouteResult, Integer.valueOf(i2)}, this, f55034e, false, 58360, new Class[]{WalkRouteResult.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{walkRouteResult, Integer.valueOf(i2)}, this, f55034e, false, 58360, new Class[]{WalkRouteResult.class, Integer.TYPE}, Void.TYPE);
        } else if (i2 != 1000 || walkRouteResult == null || walkRouteResult.getPaths() == null || walkRouteResult.getPaths().size() <= 0) {
            if (this.f55011b != null) {
                this.f55011b.a(g.RouteWalking, -1);
            }
        } else {
            this.j = walkRouteResult.getPaths().get(0);
            int duration = (int) this.j.getDuration();
            if (this.f55013d) {
                b(g.RouteWalking, true);
            }
            if (this.f55011b != null) {
                this.f55011b.a(g.RouteWalking, duration);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0103, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void b(com.ss.android.ugc.aweme.map.g r16, boolean r17) {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            monitor-enter(r15)
            r9 = 2
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0104 }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x0104 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r17)     // Catch:{ all -> 0x0104 }
            r11 = 1
            r1[r11] = r2     // Catch:{ all -> 0x0104 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55034e     // Catch:{ all -> 0x0104 }
            r4 = 0
            r5 = 58357(0xe3f5, float:8.1776E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x0104 }
            java.lang.Class<com.ss.android.ugc.aweme.map.g> r2 = com.ss.android.ugc.aweme.map.g.class
            r6[r10] = r2     // Catch:{ all -> 0x0104 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0104 }
            r6[r11] = r2     // Catch:{ all -> 0x0104 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0104 }
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x004c
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0104 }
            r1[r10] = r0     // Catch:{ all -> 0x0104 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r17)     // Catch:{ all -> 0x0104 }
            r1[r11] = r0     // Catch:{ all -> 0x0104 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55034e     // Catch:{ all -> 0x0104 }
            r4 = 0
            r5 = 58357(0xe3f5, float:8.1776E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x0104 }
            java.lang.Class<com.ss.android.ugc.aweme.map.g> r0 = com.ss.android.ugc.aweme.map.g.class
            r6[r10] = r0     // Catch:{ all -> 0x0104 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0104 }
            r6[r11] = r0     // Catch:{ all -> 0x0104 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0104 }
            r2 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0104 }
            monitor-exit(r15)
            return
        L_0x004c:
            com.ss.android.ugc.aweme.map.g r1 = r8.f55012c     // Catch:{ all -> 0x0104 }
            if (r1 != 0) goto L_0x0053
            r8.f55012c = r0     // Catch:{ all -> 0x0104 }
            goto L_0x0059
        L_0x0053:
            com.ss.android.ugc.aweme.map.g r1 = r8.f55012c     // Catch:{ all -> 0x0104 }
            if (r1 == r0) goto L_0x0059
            monitor-exit(r15)
            return
        L_0x0059:
            com.ss.android.ugc.aweme.map.a.a.a.b r1 = r8.k     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.map.a.a.a.b r1 = r8.k     // Catch:{ all -> 0x0104 }
            r1.c()     // Catch:{ all -> 0x0104 }
        L_0x0062:
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0104 }
            r12 = 4617315517961601024(0x4014000000000000, double:5.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x0104 }
            r1[r10] = r2     // Catch:{ all -> 0x0104 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55034e     // Catch:{ all -> 0x0104 }
            r4 = 0
            r5 = 58361(0xe3f9, float:8.1781E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0104 }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x0104 }
            r6[r10] = r2     // Catch:{ all -> 0x0104 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0104 }
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x00a3
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0104 }
            java.lang.Double r2 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x0104 }
            r1[r10] = r2     // Catch:{ all -> 0x0104 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55034e     // Catch:{ all -> 0x0104 }
            r4 = 0
            r5 = 58361(0xe3f9, float:8.1781E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0104 }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x0104 }
            r6[r10] = r2     // Catch:{ all -> 0x0104 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0104 }
            r2 = r15
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0104 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0104 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0104 }
            goto L_0x00b9
        L_0x00a3:
            android.content.Context r1 = r8.f55035f     // Catch:{ all -> 0x0104 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x0104 }
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch:{ all -> 0x0104 }
            float r1 = r1.density     // Catch:{ all -> 0x0104 }
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r12
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r1 = r1 + r3
            int r1 = (int) r1
        L_0x00b9:
            int[] r2 = com.ss.android.ugc.aweme.map.a.b.AnonymousClass5.f55046a     // Catch:{ all -> 0x0104 }
            int r0 = r16.ordinal()     // Catch:{ all -> 0x0104 }
            r0 = r2[r0]     // Catch:{ all -> 0x0104 }
            switch(r0) {
                case 1: goto L_0x0100;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00c5;
                default: goto L_0x00c4;
            }     // Catch:{ all -> 0x0104 }
        L_0x00c4:
            goto L_0x0102
        L_0x00c5:
            com.ss.android.ugc.aweme.map.a.a.a.c r0 = new com.ss.android.ugc.aweme.map.a.a.a.c     // Catch:{ all -> 0x0104 }
            android.content.Context r3 = r8.f55035f     // Catch:{ all -> 0x0104 }
            com.amap.api.maps2d.AMap r4 = r8.g     // Catch:{ all -> 0x0104 }
            com.amap.api.services.route.WalkPath r5 = r8.j     // Catch:{ all -> 0x0104 }
            com.amap.api.services.core.LatLonPoint r6 = r8.l     // Catch:{ all -> 0x0104 }
            com.amap.api.services.core.LatLonPoint r7 = r8.m     // Catch:{ all -> 0x0104 }
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0104 }
            r8.k = r0     // Catch:{ all -> 0x0104 }
            r0.f55029c = r1     // Catch:{ all -> 0x0104 }
            r0.a()     // Catch:{ all -> 0x0104 }
            if (r17 == 0) goto L_0x0102
            r0.d()     // Catch:{ all -> 0x0104 }
            goto L_0x0102
        L_0x00e2:
            com.ss.android.ugc.aweme.map.a.a.a.a r0 = new com.ss.android.ugc.aweme.map.a.a.a.a     // Catch:{ all -> 0x0104 }
            android.content.Context r10 = r8.f55035f     // Catch:{ all -> 0x0104 }
            com.amap.api.maps2d.AMap r11 = r8.g     // Catch:{ all -> 0x0104 }
            com.amap.api.services.route.DrivePath r12 = r8.i     // Catch:{ all -> 0x0104 }
            com.amap.api.services.core.LatLonPoint r13 = r8.l     // Catch:{ all -> 0x0104 }
            com.amap.api.services.core.LatLonPoint r14 = r8.m     // Catch:{ all -> 0x0104 }
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0104 }
            r8.k = r0     // Catch:{ all -> 0x0104 }
            r0.f55029c = r1     // Catch:{ all -> 0x0104 }
            r0.a()     // Catch:{ all -> 0x0104 }
            if (r17 == 0) goto L_0x0102
            r0.d()     // Catch:{ all -> 0x0104 }
            monitor-exit(r15)
            return
        L_0x0100:
            monitor-exit(r15)
            return
        L_0x0102:
            monitor-exit(r15)
            return
        L_0x0104:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.map.a.b.b(com.ss.android.ugc.aweme.map.g, boolean):void");
    }

    public final void a(Bitmap bitmap, double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3)}, this, f55034e, false, 58352, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3)}, this, f55034e, false, 58352, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        a(bitmap, d2, d3, 1, (e) null);
    }

    public final void a(double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, f55034e, false, 58350, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, f55034e, false, 58350, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        LatLngBounds.Builder builder = LatLngBounds.builder();
        double d6 = d2;
        builder.include(new LatLng(d2, d3));
        builder.include(new LatLng(d4, d5));
        this.g.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), (int) TypedValue.applyDimension(1, 100.0f, this.f55035f.getResources().getDisplayMetrics())));
    }

    private Marker a(Bitmap bitmap, double d2, double d3, int i2, e eVar) {
        final e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i2), eVar2}, this, f55034e, false, 58353, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Integer.TYPE, e.class}, Marker.class)) {
            return (Marker) PatchProxy.accessDispatch(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i2), eVar2}, this, f55034e, false, 58353, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Integer.TYPE, e.class}, Marker.class);
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmap));
        markerOptions.position(new LatLng(d2, d3));
        markerOptions.zIndex((float) i2);
        Marker addMarker = this.g.addMarker(markerOptions);
        if (eVar2 != null) {
            this.g.setOnMarkerClickListener(new AMap.OnMarkerClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55041a;

                public final boolean onMarkerClick(Marker marker) {
                    if (PatchProxy.isSupport(new Object[]{marker}, this, f55041a, false, 58364, new Class[]{Marker.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{marker}, this, f55041a, false, 58364, new Class[]{Marker.class}, Boolean.TYPE)).booleanValue();
                    }
                    if (marker.getZIndex() == 0.0f && eVar2 != null) {
                        eVar2.a();
                    }
                    return false;
                }
            });
        }
        return addMarker;
    }

    public final void a(Bitmap bitmap, double d2, double d3, float f2, e eVar) {
        if (PatchProxy.isSupport(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Float.valueOf(f2), eVar}, this, f55034e, false, 58349, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Float.TYPE, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Float.valueOf(f2), eVar}, this, f55034e, false, 58349, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Float.TYPE, e.class}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.destroy();
        }
        this.n = a(bitmap, d2, d3, 0, eVar);
        this.g.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d2, d3), f2));
    }
}
