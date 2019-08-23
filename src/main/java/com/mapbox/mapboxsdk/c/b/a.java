package com.mapbox.mapboxsdk.c.b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.mapbox.android.telemetry.MapboxTelemetry;
import com.mapbox.android.telemetry.ak;
import com.mapbox.android.telemetry.al;
import com.mapbox.android.telemetry.am;
import com.mapbox.android.telemetry.b;
import com.mapbox.android.telemetry.bn;
import com.mapbox.android.telemetry.bo;
import com.mapbox.android.telemetry.bp;
import com.mapbox.android.telemetry.r;
import com.mapbox.mapboxsdk.d;
import com.mapbox.mapboxsdk.maps.aa;

public final class a implements aa {

    /* renamed from: a  reason: collision with root package name */
    private static a f26467a;

    /* renamed from: b  reason: collision with root package name */
    private MapboxTelemetry f26468b = new MapboxTelemetry(d.b(), d.a(), "mapbox-maps-android/6.8.2");

    @Deprecated
    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (f26467a == null) {
                f26467a = new a();
            }
            aVar = f26467a;
        }
        return aVar;
    }

    private a() {
        if (bn.a.ENABLED.equals(bn.a())) {
            this.f26468b.b();
        }
    }

    public final void a() {
        this.f26468b.a((r) new b("mapbox-maps-android", "6.8.2"));
        ak akVar = new ak();
        MapboxTelemetry mapboxTelemetry = this.f26468b;
        if (r.a.MAP_LOAD == r.a.MAP_LOAD) {
            al alVar = new al(bp.c());
            Context context = MapboxTelemetry.g;
            alVar.g = Integer.valueOf(bp.a(context));
            alVar.h = Boolean.valueOf(bp.b(context));
            alVar.j = bp.c(context);
            alVar.f26003f = ak.a(MapboxTelemetry.g);
            alVar.f26002e = Float.valueOf(MapboxTelemetry.g.getResources().getConfiguration().fontScale);
            alVar.i = ak.b(MapboxTelemetry.g);
            Context context2 = MapboxTelemetry.g;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context2.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            alVar.f26001a = Float.valueOf(displayMetrics.density);
            alVar.k = Boolean.valueOf(akVar.c(MapboxTelemetry.g).booleanValue());
            mapboxTelemetry.a((r) alVar);
            return;
        }
        throw new IllegalArgumentException("Type must be a load map event.");
    }

    public final void a(boolean z) {
        if (z) {
            bn.a(bn.a.ENABLED);
            this.f26468b.b();
            return;
        }
        MapboxTelemetry mapboxTelemetry = this.f26468b;
        if (bn.a(MapboxTelemetry.g)) {
            if (bn.a.ENABLED.equals(mapboxTelemetry.f2363c.b())) {
                mapboxTelemetry.e();
                mapboxTelemetry.f();
                bo.a a2 = mapboxTelemetry.f2364d.a(MapboxTelemetry.g);
                if (mapboxTelemetry.f2366f && mapboxTelemetry.f2362b != null) {
                    mapboxTelemetry.f2362b.d();
                    mapboxTelemetry.f2362b.f25972c.remove(mapboxTelemetry);
                    if (mapboxTelemetry.f2362b.e() != 0 || !bo.a.ENABLED.equals(a2)) {
                        mapboxTelemetry.h();
                        mapboxTelemetry.f2366f = false;
                    } else {
                        mapboxTelemetry.h();
                        mapboxTelemetry.f2366f = false;
                        mapboxTelemetry.g();
                        mapboxTelemetry.f2365e = false;
                    }
                }
                boolean z2 = mapboxTelemetry.f2365e;
            }
        }
        bn.a(bn.a.DISABLED);
    }

    public final void a(String str, double d2, double d3, double d4) {
        ak akVar = new ak();
        am amVar = new am(d2, d3, d4);
        amVar.f26007d = str;
        MapboxTelemetry mapboxTelemetry = this.f26468b;
        r.a aVar = r.a.MAP_CLICK;
        if (r.f26122b.contains(aVar)) {
            mapboxTelemetry.a(akVar.f25998a.get(aVar).a(amVar));
            return;
        }
        throw new IllegalArgumentException("Type must be a gesture map event.");
    }
}
