package com.mapbox.mapboxsdk.location;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.r;
import com.mapbox.mapboxsdk.maps.o;
import com.mapbox.mapboxsdk.style.a.a;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.SymbolLayer;
import com.mapbox.mapboxsdk.style.layers.c;
import com.mapbox.mapboxsdk.style.layers.d;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;
import java.util.List;

public final class q implements r.b {

    /* renamed from: a  reason: collision with root package name */
    public int f26535a;

    /* renamed from: b  reason: collision with root package name */
    final o f26536b;

    /* renamed from: c  reason: collision with root package name */
    final h f26537c;

    /* renamed from: d  reason: collision with root package name */
    p f26538d;

    /* renamed from: e  reason: collision with root package name */
    Feature f26539e;

    /* renamed from: f  reason: collision with root package name */
    GeoJsonSource f26540f;
    public boolean g;
    private final List<String> h;

    private static String b(@Nullable String str, @NonNull String str2) {
        return str != null ? str : str2;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(LatLng latLng) {
        return !this.f26536b.a(this.f26536b.f26697c.a(latLng), "mapbox-location-stroke-layer", "mapbox-location-layer", "mapbox-location-bearing-layer").isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.g = false;
        a(this.f26535a);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.g = true;
        for (String a2 : this.h) {
            a(a2, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (this.f26535a == 4) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (((GeoJsonSource) this.f26536b.b("mapbox-location-source")) != null) {
            this.f26540f.a(this.f26539e);
        }
    }

    public final void b(float f2) {
        if (this.f26535a == 8) {
            a("mapbox-property-gps-bearing", f2);
        }
    }

    public final void c(float f2) {
        if (this.f26535a == 4) {
            a("mapbox-property-compass-bearing", f2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        if (this.f26535a != 8) {
            a("mapbox-property-gps-bearing", f2);
        }
    }

    public final void b(LatLng latLng) {
        Point fromLngLat = Point.fromLngLat(latLng.b(), latLng.a());
        JsonObject properties = this.f26539e.properties();
        if (properties != null) {
            this.f26539e = Feature.fromGeometry((Geometry) fromLngLat, properties);
            d();
        }
    }

    public final void d(float f2) {
        if (this.f26535a == 4 || this.f26535a == 18) {
            this.f26539e.addNumberProperty("mapbox-property-accuracy-radius", Float.valueOf(f2));
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(double d2) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) Float.valueOf(0.0f));
        jsonArray.add((Number) Float.valueOf((float) (-0.05d * d2)));
        this.f26539e.addProperty("mapbox-property-foreground-icon-offset", jsonArray);
        JsonArray jsonArray2 = new JsonArray();
        jsonArray2.add((Number) Float.valueOf(0.0f));
        jsonArray2.add((Number) Float.valueOf((float) (d2 * 0.05d)));
        this.f26539e.addProperty("mapbox-property-shadow-icon-offset", jsonArray2);
        d();
    }

    /* access modifiers changed from: package-private */
    public void b(p pVar) {
        for (String a2 : this.h) {
            Layer a3 = this.f26536b.a(a2);
            if (a3 != null && (a3 instanceof SymbolLayer)) {
                a3.setProperties(c.a(a.a(a.b(), a.a(), a.a((Object) Double.valueOf(pVar.y), (Object) Float.valueOf(pVar.A)), a.a((Object) Double.valueOf(pVar.x), (Object) Float.valueOf(pVar.z)))));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(p pVar) {
        String str;
        if (this.f26535a == 8) {
            str = pVar.h;
        } else {
            str = pVar.j;
        }
        String b2 = b(str, "mapbox-location-icon");
        String b3 = b(pVar.f26534f, "mapbox-location-stale-icon");
        String b4 = b(pVar.l, "mapbox-location-stroke-icon");
        String b5 = b(pVar.f26532d, "mapbox-location-background-stale-icon");
        String b6 = b(pVar.n, "mapbox-location-bearing-icon");
        this.f26539e.addStringProperty("mapbox-property-foreground-icon", b2);
        this.f26539e.addStringProperty("mapbox-property-background-icon", b4);
        this.f26539e.addStringProperty("mapbox-property-foreground-stale-icon", b3);
        this.f26539e.addStringProperty("mapbox-property-background-stale-icon", b5);
        this.f26539e.addStringProperty("mapbox-property-shadow-icon", b6);
        d();
    }

    private void a(int i) {
        this.f26535a = i;
        if (!this.g) {
            boolean booleanValue = this.f26539e.getBooleanProperty("mapbox-property-location-stale").booleanValue();
            if (i == 4) {
                a(this.f26538d);
                a("mapbox-location-shadow", true);
                a("mapbox-location-layer", true);
                a("mapbox-location-stroke-layer", true);
                a("mapbox-location-accuracy-layer", !booleanValue);
                a("mapbox-location-bearing-layer", true);
            } else if (i == 8) {
                a(this.f26538d);
                a("mapbox-location-shadow", false);
                a("mapbox-location-layer", true);
                a("mapbox-location-stroke-layer", true);
                a("mapbox-location-accuracy-layer", false);
                a("mapbox-location-bearing-layer", false);
            } else if (i == 18) {
                a(this.f26538d);
                a("mapbox-location-shadow", true);
                a("mapbox-location-layer", true);
                a("mapbox-location-stroke-layer", true);
                a("mapbox-location-accuracy-layer", !booleanValue);
                a("mapbox-location-bearing-layer", false);
            }
            c(this.f26538d);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(p pVar) {
        Bitmap a2 = this.f26537c.a(pVar.i, pVar.p);
        Bitmap a3 = this.f26537c.a(pVar.f26533e, pVar.r);
        if (this.f26535a == 8) {
            a2 = this.f26537c.a(pVar.g, pVar.p);
            a3 = this.f26537c.a(pVar.g, pVar.r);
        }
        this.f26536b.a("mapbox-location-icon", a2);
        this.f26536b.a("mapbox-location-stale-icon", a3);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        a(l.a(str), str2);
    }

    private void a(String str, float f2) {
        this.f26539e.addNumberProperty(str, Float.valueOf(f2));
        d();
    }

    /* access modifiers changed from: package-private */
    public void a(Layer layer, @NonNull String str) {
        this.f26536b.a(layer, str);
        this.h.add(layer.getId());
    }

    /* access modifiers changed from: package-private */
    public void a(String str, boolean z) {
        String str2;
        String str3;
        Layer a2 = this.f26536b.a(str);
        if (a2 != null) {
            if (z) {
                str2 = "visible";
            } else {
                str2 = "none";
            }
            if (!((String) a2.getVisibility().f26800b).equals(str2)) {
                d[] dVarArr = new d[1];
                if (z) {
                    str3 = "visible";
                } else {
                    str3 = "none";
                }
                dVarArr[0] = c.a(str3);
                a2.setProperties(dVarArr);
            }
        }
    }
}
