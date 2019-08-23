package com.ss.android.ugc.aweme.map.a;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.camera.b;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.o;
import com.mapbox.mapboxsdk.maps.p;
import com.mapbox.mapboxsdk.maps.s;
import com.mapbox.mapboxsdk.plugins.china.maps.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.map.d;
import com.ss.android.ugc.aweme.map.e;
import java.util.Locale;

public final class c extends a {
    public static ChangeQuickRedirect q;

    public c(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public final void a(Bundle bundle, boolean z, Locale locale, d dVar) {
        Bundle bundle2 = bundle;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{bundle2, Byte.valueOf(z ? (byte) 1 : 0), locale, dVar2}, this, q, false, 58365, new Class[]{Bundle.class, Boolean.TYPE, Locale.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2, Byte.valueOf(z), locale, dVar2}, this, q, false, 58365, new Class[]{Bundle.class, Boolean.TYPE, Locale.class, d.class}, Void.TYPE);
            return;
        }
        this.n = z;
        this.p = dVar2;
        this.l = "https://api.mapbox.cn";
        this.m = this.f55015f.getResources().getString(C0906R.string.b_9);
        this.o = "mapbox://styles/mapbox/streets-zh-v1";
        com.mapbox.mapboxsdk.d.a(this.f55015f.getApplicationContext(), this.m);
        p pVar = new p();
        pVar.a(this.l);
        pVar.b(this.o);
        pVar.c("sans-serif");
        this.h = new a(this.f55015f, pVar);
        this.g.addView(this.h, new FrameLayout.LayoutParams(-1, -1));
        this.h.a(bundle2);
        this.h.a((s) new s() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55047a;

            public final void a(o oVar) {
                if (PatchProxy.isSupport(new Object[]{oVar}, this, f55047a, false, 58367, new Class[]{o.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{oVar}, this, f55047a, false, 58367, new Class[]{o.class}, Void.TYPE);
                    return;
                }
                c.this.i = oVar;
                if (c.this.f55010a != null) {
                    c.this.a(c.this.f55010a);
                }
                if (c.this.p != null) {
                    c.this.p.a();
                }
            }
        });
    }

    public final void b(Bitmap bitmap, double d2, double d3, float f2, e eVar) {
        if (PatchProxy.isSupport(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Float.valueOf(f2), eVar}, this, q, false, 58366, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Float.TYPE, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Float.valueOf(f2), eVar}, this, q, false, 58366, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Float.TYPE, e.class}, Void.TYPE);
            return;
        }
        this.i.f26696b.f26610e = false;
        this.i.f26696b.a(false);
        this.i.f26696b.d(false);
        this.i.f26696b.p = false;
        if (this.k != null) {
            this.k.a();
            this.k = null;
        }
        this.k = a(bitmap, d2, d3, eVar);
        LatLng latLng = new LatLng(d2, d3);
        o oVar = this.i;
        b.C0306b bVar = new b.C0306b(-1.0d, latLng, -1.0d, (double) f2);
        oVar.b((com.mapbox.mapboxsdk.camera.a) bVar);
    }
}
