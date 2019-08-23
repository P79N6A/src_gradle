package com.mapbox.mapboxsdk.annotations;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.b;
import com.mapbox.mapboxsdk.maps.o;
import com.ss.android.ugc.aweme.C0906R;

public class Marker extends a {

    /* renamed from: d  reason: collision with root package name */
    public String f26418d;

    /* renamed from: e  reason: collision with root package name */
    public String f26419e;

    /* renamed from: f  reason: collision with root package name */
    public g f26420f;
    public boolean g;
    public int h;
    public int i;
    @Keep
    private String iconId;
    private e j;
    @Keep
    public LatLng position;

    Marker() {
    }

    public e c() {
        return this.j;
    }

    public final void b() {
        if (this.f26420f != null) {
            this.f26420f.b();
        }
        this.g = false;
    }

    public String toString() {
        return "Marker [position[" + this.position + "]]";
    }

    public void a(@Nullable e eVar) {
        String str;
        this.j = eVar;
        if (eVar != null) {
            str = eVar.f26435a;
        } else {
            str = null;
        }
        this.iconId = str;
        o oVar = this.f26422b;
        if (oVar != null) {
            b bVar = oVar.f26699e;
            if (!bVar.b((a) this)) {
                b.c(this);
                return;
            }
            bVar.k.a(this, oVar);
        }
    }

    private g a(g gVar, MapView mapView) {
        gVar.a(mapView, this, this.position, this.i, this.h);
        this.g = true;
        return gVar;
    }

    public final g a(@NonNull o oVar, @NonNull MapView mapView) {
        a(oVar);
        this.f26423c = mapView;
        o.b bVar = this.f26422b.f26699e.f26613b.f26648b;
        if (bVar != null) {
            View a2 = bVar.a();
            if (a2 != null) {
                this.f26420f = new g(a2, oVar);
                a(this.f26420f, mapView);
                return this.f26420f;
            }
        }
        if (this.f26420f == null && mapView.getContext() != null) {
            this.f26420f = new g(mapView, C0906R.layout.a_y, this.f26422b);
        }
        g gVar = this.f26420f;
        if (mapView.getContext() != null) {
            gVar.a(this, oVar, mapView);
        }
        return a(gVar, mapView);
    }

    Marker(LatLng latLng, e eVar, String str, String str2) {
        this.position = latLng;
        this.f26419e = str;
        this.f26418d = str2;
        a(eVar);
    }
}
