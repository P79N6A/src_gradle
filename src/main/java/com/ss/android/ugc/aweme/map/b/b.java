package com.ss.android.ugc.aweme.map.b;

import android.content.Context;
import com.mapbox.api.directions.v5.a;
import com.mapbox.api.directions.v5.a.al;
import com.mapbox.api.directions.v5.a.am;
import com.mapbox.api.directions.v5.b;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.map.g;
import com.ss.android.ugc.aweme.map.h;
import java.util.List;
import retrofit2.d;
import retrofit2.m;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55055a;

    /* renamed from: b  reason: collision with root package name */
    public d f55056b;

    /* renamed from: c  reason: collision with root package name */
    public List<Point> f55057c;

    /* renamed from: d  reason: collision with root package name */
    public List<Point> f55058d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f55059e;

    /* renamed from: f  reason: collision with root package name */
    private String f55060f;
    private d<al> g = new d<al>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55061a;

        public final void a(retrofit2.b<al> bVar, Throwable th) {
            if (PatchProxy.isSupport(new Object[]{bVar, th}, this, f55061a, false, 58412, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, th}, this, f55061a, false, 58412, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE);
                return;
            }
            if (b.this.f55056b != null) {
                b.this.f55056b.a(g.RouteDrive, -1);
            }
        }

        public final void a(retrofit2.b<al> bVar, m<al> mVar) {
            if (PatchProxy.isSupport(new Object[]{bVar, mVar}, this, f55061a, false, 58411, new Class[]{retrofit2.b.class, m.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, mVar}, this, f55061a, false, 58411, new Class[]{retrofit2.b.class, m.class}, Void.TYPE);
                return;
            }
            al alVar = (al) mVar.f84319b;
            if (alVar != null) {
                am amVar = alVar.routes().get(0);
                if (amVar != null && amVar.geometry() != null) {
                    int intValue = amVar.duration().intValue();
                    LineString fromPolyline = LineString.fromPolyline(amVar.geometry(), 6);
                    b.this.f55057c = fromPolyline.coordinates();
                    if (b.this.f55056b != null) {
                        b.this.f55056b.a(b.this.f55057c, g.RouteDrive, intValue);
                    }
                }
            }
        }
    };
    private d<al> h = new d<al>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55063a;

        public final void a(retrofit2.b<al> bVar, Throwable th) {
            if (PatchProxy.isSupport(new Object[]{bVar, th}, this, f55063a, false, 58414, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, th}, this, f55063a, false, 58414, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE);
                return;
            }
            if (b.this.f55056b != null) {
                b.this.f55056b.a(g.RouteWalking, -1);
            }
        }

        public final void a(retrofit2.b<al> bVar, m<al> mVar) {
            if (PatchProxy.isSupport(new Object[]{bVar, mVar}, this, f55063a, false, 58413, new Class[]{retrofit2.b.class, m.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, mVar}, this, f55063a, false, 58413, new Class[]{retrofit2.b.class, m.class}, Void.TYPE);
                return;
            }
            al alVar = (al) mVar.f84319b;
            if (alVar != null) {
                am amVar = alVar.routes().get(0);
                if (amVar != null && amVar.geometry() != null) {
                    int intValue = amVar.duration().intValue();
                    LineString fromPolyline = LineString.fromPolyline(amVar.geometry(), 6);
                    b.this.f55058d = fromPolyline.coordinates();
                    if (b.this.f55056b != null) {
                        b.this.f55056b.a(b.this.f55058d, g.RouteWalking, intValue);
                    }
                }
            }
        }
    };

    public b(d dVar, boolean z, Context context) {
        this.f55056b = dVar;
        this.f55059e = z;
        this.f55060f = context.getResources().getString(C0906R.string.b__);
    }

    public final void a(h hVar, h hVar2, String str) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        if (PatchProxy.isSupport(new Object[]{hVar3, hVar4, str}, this, f55055a, false, 58410, new Class[]{h.class, h.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar3, hVar4, str}, this, f55055a, false, 58410, new Class[]{h.class, h.class, String.class}, Void.TYPE);
            return;
        }
        Point fromLngLat = Point.fromLngLat(hVar3.f55067b, hVar3.f55066a);
        Point fromLngLat2 = Point.fromLngLat(hVar4.f55067b, hVar4.f55066a);
        b.a d2 = new a.C0297a().c("https://api.mapbox.com").b("driving").a("mapbox").e("polyline6").d(this.f55060f);
        d2.f26293b = fromLngLat;
        d2.f26292a = fromLngLat2;
        if (this.f55059e) {
            d2.c("https://api-global.mapbox.cn");
        } else {
            d2.c("https://api.mapbox.com");
        }
        d2.b("driving");
        d2.b().a(this.g);
        d2.b("walking");
        d2.b().a(this.h);
    }
}
