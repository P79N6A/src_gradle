package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.util.Pools;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.geojson.Feature;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.util.List;

@UiThread
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final NativeMapView f26695a;

    /* renamed from: b  reason: collision with root package name */
    public final ac f26696b;

    /* renamed from: c  reason: collision with root package name */
    public final x f26697c;

    /* renamed from: d  reason: collision with root package name */
    public final ab f26698d;

    /* renamed from: e  reason: collision with root package name */
    public final b f26699e;

    /* renamed from: f  reason: collision with root package name */
    public final j f26700f;
    public com.mapbox.mapboxsdk.location.o g;
    private final f h;

    public interface a {
    }

    public interface b {
        @Nullable
        View a();
    }

    @Deprecated
    public static abstract class c<U extends com.mapbox.mapboxsdk.annotations.i> {

        /* renamed from: a  reason: collision with root package name */
        public Context f26701a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<U> f26702b;

        /* renamed from: c  reason: collision with root package name */
        public final Pools.SimplePool<View> f26703c = new Pools.SimplePool<>(10000);

        @Nullable
        public abstract View a(@NonNull U u, @Nullable View view, @NonNull ViewGroup viewGroup);

        public final void a(View view) {
            view.setVisibility(8);
            this.f26703c.release(view);
        }

        public c(Context context, Class<U> cls) {
            this.f26701a = context;
            this.f26702b = cls;
        }
    }

    public interface d {
        void a();
    }

    public interface e {
        void b();
    }

    public interface f {
        void m_();
    }

    public interface g {
        void a(int i);
    }

    public interface h {
        void a();

        void b();
    }

    public interface i {
    }

    public interface j {
        void a(AndroidGesturesManager androidGesturesManager, boolean z, boolean z2);

        void a(m mVar);
    }

    public interface k {
        boolean a();
    }

    public interface l {
    }

    public interface m {
        void a(@NonNull LatLng latLng);
    }

    public interface n {
        void a(@NonNull LatLng latLng);
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.o$o  reason: collision with other inner class name */
    public interface C0308o {
        boolean a(@NonNull Marker marker);
    }

    public interface p {
        boolean a();
    }

    public interface q {
    }

    public interface r {
    }

    public interface s {
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        j();
    }

    public final void a(@NonNull Layer layer, @NonNull String str) {
        this.f26695a.a(layer, str);
    }

    public final void a(@NonNull String str, @NonNull Bitmap bitmap) {
        a(str, bitmap, false);
    }

    public final void a(@NonNull com.mapbox.mapboxsdk.camera.a aVar) {
        a(aVar, (a) null);
    }

    public final void a(@NonNull Polyline polyline) {
        this.f26699e.a(polyline);
    }

    public final void a(@Nullable C0308o oVar) {
        this.f26699e.g = oVar;
    }

    public final void a(@NonNull Marker marker) {
        if (marker == null) {
            Logger.w("Mbgl-MapboxMap", "marker was null, so just returning");
        } else {
            this.f26699e.a(marker);
        }
    }

    public final void a(@NonNull d dVar) {
        this.h.a(dVar);
    }

    public final void a(@NonNull f fVar) {
        this.h.a(fVar);
    }

    public final void a(@NonNull AndroidGesturesManager androidGesturesManager, boolean z, boolean z2) {
        this.f26700f.a(androidGesturesManager, true, true);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.g.b();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.g.c();
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.f26699e.a();
    }

    @NonNull
    public final CameraPosition g() {
        return this.f26698d.a();
    }

    @NonNull
    public final List<Marker> h() {
        return this.f26699e.f26616e;
    }

    @NonNull
    public final com.mapbox.mapboxsdk.annotations.j i() {
        return this.f26699e.f26614c;
    }

    private void j() {
        CameraPosition b2 = this.f26698d.b();
        if (b2 != null) {
            this.f26698d.a(b2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        j();
        this.f26699e.b();
        this.f26699e.a(this);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f26695a.b();
        if (TextUtils.isEmpty(this.f26695a.c()) && TextUtils.isEmpty(this.f26695a.d())) {
            this.f26695a.b("mapbox://styles/mapbox/streets-v10");
        }
        this.g.a();
    }

    public final void b(@NonNull d dVar) {
        this.h.b(dVar);
    }

    @NonNull
    public final Marker a(@NonNull com.mapbox.mapboxsdk.annotations.h hVar) {
        return this.f26699e.k.a((com.mapbox.mapboxsdk.annotations.c) hVar, this);
    }

    public final void b(@NonNull f fVar) {
        this.h.b(fVar);
    }

    @Nullable
    public final Layer a(@NonNull String str) {
        return this.f26695a.e(str);
    }

    @Nullable
    public final <T extends Source> T b(@NonNull String str) {
        try {
            NativeMapView nativeMapView = this.f26695a;
            if (nativeMapView.a("getSource")) {
                return null;
            }
            return nativeMapView.nativeGetSource(str);
        } catch (ClassCastException e2) {
            String format = String.format("Source: %s is a different type: ", new Object[]{str});
            Logger.e("Mbgl-MapboxMap", format, e2);
            com.mapbox.mapboxsdk.b.a(format, e2);
            return null;
        }
    }

    public final void b(@NonNull com.mapbox.mapboxsdk.camera.a aVar) {
        ab abVar = this.f26698d;
        CameraPosition a2 = aVar.a(this);
        if (abVar.b(a2)) {
            abVar.c();
            abVar.f26595d.a(3);
            abVar.f26592a.a((MapView.l) abVar);
            NativeMapView nativeMapView = abVar.f26592a;
            double d2 = a2.bearing;
            LatLng latLng = a2.target;
            long j2 = (long) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
            double d3 = a2.tilt;
            double d4 = a2.zoom;
            if (!nativeMapView.a("flyTo")) {
                nativeMapView.nativeFlyTo(d2, latLng.a(), latLng.b(), j2, d3, d4);
            }
        }
    }

    @Deprecated
    @NonNull
    public final List<com.mapbox.mapboxsdk.annotations.i> a(@NonNull RectF rectF) {
        return this.f26699e.a(rectF);
    }

    /* access modifiers changed from: package-private */
    public final void a(@NonNull Bundle bundle) {
        bundle.putParcelable("mapbox_cameraPosition", this.f26698d.a());
        bundle.putBoolean("mapbox_debugActive", this.f26695a.j());
        bundle.putString("mapbox_styleUrl", this.f26695a.c());
        this.f26696b.a(bundle);
    }

    private void a(@NonNull com.mapbox.mapboxsdk.camera.a aVar, @Nullable a aVar2) {
        this.f26698d.a(this, aVar, (a) null);
    }

    @NonNull
    public final List<Feature> a(@NonNull PointF pointF, @Nullable String... strArr) {
        return this.f26695a.a(pointF, strArr, (com.mapbox.mapboxsdk.style.a.a) null);
    }

    private void a(@NonNull String str, @NonNull Bitmap bitmap, boolean z) {
        this.f26695a.a(str, bitmap, false);
    }

    public final void a(double d2, float f2, float f3, long j2) {
        this.f26698d.a(0.0d, f2, f3, 150);
    }

    o(NativeMapView nativeMapView, ab abVar, ac acVar, x xVar, j jVar, b bVar, f fVar) {
        this.f26695a = nativeMapView;
        this.f26696b = acVar;
        this.f26697c = xVar;
        bVar.f26617f = this;
        bVar.f26614c.f26456e = this;
        this.f26699e = bVar;
        this.f26698d = abVar;
        this.f26700f = jVar;
        this.h = fVar;
    }
}
