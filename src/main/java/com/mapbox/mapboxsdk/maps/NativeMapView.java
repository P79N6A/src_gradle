package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.ProjectedMeters;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.o;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.style.layers.CannotAddLayerException;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.light.Light;
import com.mapbox.mapboxsdk.style.sources.CannotAddSourceException;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class NativeMapView {

    /* renamed from: a  reason: collision with root package name */
    final FileSource f26580a;

    /* renamed from: b  reason: collision with root package name */
    public final MapRenderer f26581b;

    /* renamed from: c  reason: collision with root package name */
    public final float f26582c;

    /* renamed from: d  reason: collision with root package name */
    private final Thread f26583d;

    /* renamed from: e  reason: collision with root package name */
    private b f26584e;

    /* renamed from: f  reason: collision with root package name */
    private a f26585f;
    private boolean g;
    private o.s h;
    private final CopyOnWriteArrayList<MapView.l> i = new CopyOnWriteArrayList<>();
    @Keep
    long nativePtr;

    public interface a {
        void a();

        void a(String str);

        void a(boolean z);

        void b();

        void b(String str);

        void b(boolean z);

        void c();

        void c(boolean z);

        void d();

        void d(boolean z);

        void e();

        void f();

        void g();
    }

    public interface b {
        int getHeight();

        Bitmap getViewContent();

        int getWidth();
    }

    @Keep
    private native void nativeAddAnnotationIcon(String str, int i2, int i3, float f2, byte[] bArr);

    @Keep
    private native void nativeAddImage(String str, Bitmap bitmap, float f2, boolean z);

    @Keep
    private native void nativeAddLayer(long j, String str) throws CannotAddLayerException;

    @Keep
    private native void nativeAddLayerAbove(long j, String str) throws CannotAddLayerException;

    @Keep
    private native void nativeAddLayerAt(long j, int i2) throws CannotAddLayerException;

    @Keep
    private native long[] nativeAddMarkers(Marker[] markerArr);

    @Keep
    private native long[] nativeAddPolygons(Polygon[] polygonArr);

    @Keep
    private native void nativeCancelTransitions();

    @Keep
    private native void nativeCycleDebugOptions();

    @Keep
    private native void nativeDestroy();

    @Keep
    private native void nativeEaseTo(double d2, double d3, double d4, long j, double d5, double d6, boolean z);

    @Keep
    private native double nativeGetBearing();

    @Keep
    private native CameraPosition nativeGetCameraForGeometry(Geometry geometry, double d2, double d3, double d4, double d5, double d6, double d7);

    @Keep
    private native CameraPosition nativeGetCameraPosition();

    @Keep
    private native boolean nativeGetDebug();

    @Keep
    private native Bitmap nativeGetImage(String str);

    @Keep
    private native LatLng nativeGetLatLng();

    @Keep
    private native Layer nativeGetLayer(String str);

    @Keep
    private native Layer[] nativeGetLayers();

    @Keep
    private native Light nativeGetLight();

    @Keep
    private native double nativeGetMaxZoom();

    @Keep
    private native double nativeGetMetersPerPixelAtLatitude(double d2, double d3);

    @Keep
    private native double nativeGetMinZoom();

    @Keep
    private native double nativeGetPitch();

    @Keep
    private native boolean nativeGetPrefetchesTiles();

    @Keep
    private native String nativeGetStyleJson();

    @Keep
    private native String nativeGetStyleUrl();

    @Keep
    private native double nativeGetTopOffsetPixelsForAnnotationSymbol(String str);

    @Keep
    private native long nativeGetTransitionDelay();

    @Keep
    private native long nativeGetTransitionDuration();

    @Keep
    private native double nativeGetZoom();

    @Keep
    private native void nativeInitialize(NativeMapView nativeMapView, FileSource fileSource, MapRenderer mapRenderer, float f2, boolean z);

    @Keep
    private native boolean nativeIsFullyLoaded();

    @Keep
    private native void nativeJumpTo(double d2, double d3, double d4, double d5, double d6);

    @Keep
    private native LatLng nativeLatLngForPixel(float f2, float f3);

    @Keep
    private native LatLng nativeLatLngForProjectedMeters(double d2, double d3);

    @Keep
    private native void nativeMoveBy(double d2, double d3, long j);

    @Keep
    private native void nativeOnLowMemory();

    @Keep
    private native PointF nativePixelForLatLng(double d2, double d3);

    @Keep
    private native ProjectedMeters nativeProjectedMetersForLatLng(double d2, double d3);

    @Keep
    private native long[] nativeQueryPointAnnotations(RectF rectF);

    @Keep
    private native Feature[] nativeQueryRenderedFeaturesForBox(float f2, float f3, float f4, float f5, String[] strArr, Object[] objArr);

    @Keep
    private native Feature[] nativeQueryRenderedFeaturesForPoint(float f2, float f3, String[] strArr, Object[] objArr);

    @Keep
    private native void nativeRemoveAnnotationIcon(String str);

    @Keep
    private native void nativeRemoveAnnotations(long[] jArr);

    @Keep
    private native void nativeRemoveImage(String str);

    @Keep
    private native void nativeRemoveLayer(long j);

    @Keep
    private native Layer nativeRemoveLayerAt(int i2);

    @Keep
    private native Layer nativeRemoveLayerById(String str);

    @Keep
    private native void nativeRemoveSource(Source source, long j);

    @Keep
    private native void nativeResetNorth();

    @Keep
    private native void nativeResetPosition();

    @Keep
    private native void nativeResetZoom();

    @Keep
    private native void nativeRotateBy(double d2, double d3, double d4, double d5, long j);

    @Keep
    private native void nativeSetBearing(double d2, long j);

    @Keep
    private native void nativeSetBearingXY(double d2, double d3, double d4, long j);

    @Keep
    private native void nativeSetContentPadding(double d2, double d3, double d4, double d5);

    @Keep
    private native void nativeSetDebug(boolean z);

    @Keep
    private native void nativeSetGestureInProgress(boolean z);

    @Keep
    private native void nativeSetLatLng(double d2, double d3, long j);

    @Keep
    private native void nativeSetLatLngBounds(LatLngBounds latLngBounds);

    @Keep
    private native void nativeSetMaxZoom(double d2);

    @Keep
    private native void nativeSetMinZoom(double d2);

    @Keep
    private native void nativeSetStyleUrl(String str);

    @Keep
    private native void nativeSetTransitionDelay(long j);

    @Keep
    private native void nativeSetTransitionDuration(long j);

    @Keep
    private native void nativeSetVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d2, long j);

    @Keep
    private native void nativeSetZoom(double d2, double d3, double d4, long j);

    @Keep
    private native void nativeTakeSnapshot();

    @Keep
    public final native void nativeAddImages(Image[] imageArr);

    /* access modifiers changed from: package-private */
    @Keep
    public native long[] nativeAddPolylines(Polyline[] polylineArr);

    @Keep
    public native void nativeAddSource(Source source, long j) throws CannotAddSourceException;

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeFlyTo(double d2, double d3, double d4, long j, double d5, double d6);

    @Keep
    public native CameraPosition nativeGetCameraForLatLngBounds(LatLngBounds latLngBounds, double d2, double d3, double d4, double d5, double d6, double d7);

    /* access modifiers changed from: package-private */
    @Keep
    public native Source nativeGetSource(String str);

    /* access modifiers changed from: package-private */
    @Keep
    public native Source[] nativeGetSources();

    /* access modifiers changed from: package-private */
    @Keep
    public native long[] nativeQueryShapeAnnotations(RectF rectF);

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeResizeView(int i2, int i3);

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeSetPitch(double d2, long j);

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeSetPrefetchesTiles(boolean z);

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeSetReachability(boolean z);

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeSetStyleJson(String str);

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeUpdateMarker(long j, double d2, double d3, String str);

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeUpdatePolygon(long j, Polygon polygon);

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeUpdatePolyline(long j, Polyline polyline);

    static {
        com.mapbox.mapboxsdk.a.a();
    }

    public final boolean a(String str) {
        if (this.f26583d == Thread.currentThread()) {
            if (this.g && !TextUtils.isEmpty(str)) {
                String format = String.format("You're calling `%s` after the `MapView` was destroyed, were you invoking it after `onDestroy()`?", new Object[]{str});
                Logger.e("Mbgl-NativeMapView", format);
                com.mapbox.mapboxsdk.b.a(format);
            }
            return this.g;
        }
        throw new com.mapbox.mapboxsdk.b.a(String.format("Map interactions should happen on the UI thread. Method invoked from wrong thread is %s.", new Object[]{str}));
    }

    public final void a(boolean z) {
        if (!a("setGestureInProgress")) {
            nativeSetGestureInProgress(z);
        }
    }

    public final void a(double d2, PointF pointF, long j) {
        if (!a("setZoom")) {
            nativeSetZoom(d2, (double) (pointF.x / this.f26582c), (double) (pointF.y / this.f26582c), j);
        }
    }

    public final void a(long j) {
        if (!a("removeAnnotation")) {
            a(new long[]{j});
        }
    }

    public final void a(long[] jArr) {
        if (!a("removeAnnotations")) {
            nativeRemoveAnnotations(jArr);
        }
    }

    public final long[] a(RectF rectF) {
        if (a("queryPointAnnotations")) {
            return new long[0];
        }
        return nativeQueryPointAnnotations(rectF);
    }

    public final void a(String str, int i2, int i3, float f2, byte[] bArr) {
        if (!a("addAnnotationIcon")) {
            nativeAddAnnotationIcon(str, i2, i3, f2, bArr);
        }
    }

    public final void a(double d2, LatLng latLng, double d3, double d4) {
        if (!a("jumpTo")) {
            nativeJumpTo(d2, latLng.a(), latLng.b(), d3, d4);
        }
    }

    public final void a(@NonNull Layer layer, @NonNull String str) {
        if (!a("addLayerBelow")) {
            nativeAddLayer(layer.nativePtr, str);
        }
    }

    public final void a(@NonNull String str, @NonNull Bitmap bitmap, boolean z) {
        if (!a("addImage")) {
            nativeAddImage(str, bitmap, ((float) bitmap.getDensity()) / 160.0f, z);
        }
    }

    @Keep
    private void onDidBecomeIdle() {
        this.f26585f.f();
    }

    @Keep
    private void onCameraIsChanging() {
        this.f26585f.a();
        onMapChanged(2);
    }

    @Keep
    private void onDidFinishLoadingMap() {
        this.f26585f.c();
        onMapChanged(6);
    }

    @Keep
    private void onDidFinishLoadingStyle() {
        this.f26585f.g();
        onMapChanged(14);
    }

    @Keep
    private void onWillStartLoadingMap() {
        this.f26585f.b();
        onMapChanged(5);
    }

    @Keep
    private void onWillStartRenderingFrame() {
        this.f26585f.d();
        onMapChanged(8);
    }

    @Keep
    private void onWillStartRenderingMap() {
        this.f26585f.e();
        onMapChanged(11);
    }

    public final void a() {
        this.g = true;
        this.i.clear();
        this.f26584e = null;
        nativeDestroy();
    }

    public final void b() {
        if (!a("update")) {
            this.f26581b.requestRender();
        }
    }

    public final String c() {
        if (a("getStyleUrl")) {
            return null;
        }
        return nativeGetStyleUrl();
    }

    public final double f() {
        if (a("getPitch")) {
            return 0.0d;
        }
        return nativeGetPitch();
    }

    public final double g() {
        if (a("getZoom")) {
            return 0.0d;
        }
        return nativeGetZoom();
    }

    public final double h() {
        if (a("getBearing")) {
            return 0.0d;
        }
        return nativeGetBearing();
    }

    public final void i() {
        if (!a("onLowMemory")) {
            nativeOnLowMemory();
        }
    }

    public final boolean j() {
        if (a("getDebug")) {
            return false;
        }
        return nativeGetDebug();
    }

    public final String d() {
        if (a("getStyleJson")) {
            return null;
        }
        return nativeGetStyleJson();
    }

    public final void e() {
        if (!a("cancelTransitions")) {
            nativeCancelTransitions();
        }
    }

    public final CameraPosition k() {
        if (a("getCameraValues")) {
            return new CameraPosition.a().a();
        }
        return nativeGetCameraPosition();
    }

    public final int l() {
        if (a("")) {
            return 0;
        }
        return this.f26584e.getWidth();
    }

    public final int m() {
        if (a("")) {
            return 0;
        }
        return this.f26584e.getHeight();
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void a(@NonNull MapView.l lVar) {
        this.i.add(lVar);
    }

    @Keep
    private void onCameraDidChange(boolean z) {
        int i2;
        this.f26585f.b(z);
        if (z) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        onMapChanged(i2);
    }

    @Keep
    private void onCameraWillChange(boolean z) {
        this.f26585f.a(z);
        onMapChanged(z ? 1 : 0);
    }

    @Keep
    private void onDidFailLoadingMap(String str) {
        this.f26585f.a(str);
        onMapChanged(7);
    }

    @Keep
    private void onDidFinishRenderingFrame(boolean z) {
        int i2;
        this.f26585f.c(z);
        if (z) {
            i2 = 10;
        } else {
            i2 = 9;
        }
        onMapChanged(i2);
    }

    @Keep
    private void onDidFinishRenderingMap(boolean z) {
        int i2;
        this.f26585f.d(z);
        if (z) {
            i2 = 13;
        } else {
            i2 = 12;
        }
        onMapChanged(i2);
    }

    @Keep
    private void onSourceChanged(String str) {
        this.f26585f.b(str);
        onMapChanged(15);
    }

    public final double d(String str) {
        if (a("getTopOffsetPixelsForAnnotationSymbol")) {
            return 0.0d;
        }
        return nativeGetTopOffsetPixelsForAnnotationSymbol(str);
    }

    public final Layer e(String str) {
        if (a("getLayer")) {
            return null;
        }
        return nativeGetLayer(str);
    }

    public final long a(Marker marker) {
        if (a("addMarker")) {
            return 0;
        }
        return nativeAddMarkers(new Marker[]{marker})[0];
    }

    /* access modifiers changed from: package-private */
    public final RectF b(RectF rectF) {
        return new RectF(rectF.left / this.f26582c, rectF.top / this.f26582c, rectF.right / this.f26582c, rectF.bottom / this.f26582c);
    }

    public final double c(double d2) {
        if (a("getMetersPerPixelAtLatitude")) {
            return 0.0d;
        }
        double nativeGetMetersPerPixelAtLatitude = nativeGetMetersPerPixelAtLatitude(d2, g());
        double d3 = (double) this.f26582c;
        Double.isNaN(d3);
        return nativeGetMetersPerPixelAtLatitude / d3;
    }

    public final PointF a(LatLng latLng) {
        if (a("pixelForLatLng")) {
            return new PointF();
        }
        PointF nativePixelForLatLng = nativePixelForLatLng(latLng.a(), latLng.b());
        nativePixelForLatLng.set(nativePixelForLatLng.x * this.f26582c, nativePixelForLatLng.y * this.f26582c);
        return nativePixelForLatLng;
    }

    public final void b(double d2) {
        if (!a("setMaxZoom")) {
            nativeSetMaxZoom(d2);
        }
    }

    public final void c(String str) {
        if (!a("removeAnnotationIcon")) {
            nativeRemoveAnnotationIcon(str);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public final void onMapChanged(int i2) {
        Iterator<MapView.l> it2 = this.i.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().a(i2);
            } catch (RuntimeException e2) {
                Logger.e("Mbgl-NativeMapView", "Exception in MapView.OnMapChangedListener", e2);
                com.mapbox.mapboxsdk.b.a((Exception) e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public final void onSnapshotReady(Bitmap bitmap) {
        if (!a("OnSnapshotReady")) {
            Bitmap viewContent = this.f26584e.getViewContent();
            if (!(this.h == null || bitmap == null || viewContent == null)) {
                Canvas canvas = new Canvas(Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
                canvas.drawBitmap(viewContent, 10.0f, 10.0f, null);
            }
        }
    }

    public final LatLng a(PointF pointF) {
        if (a("latLngForPixel")) {
            return new LatLng();
        }
        LatLng nativeLatLngForPixel = nativeLatLngForPixel(pointF.x / this.f26582c, pointF.y / this.f26582c);
        return new LatLng(nativeLatLngForPixel.latitude, LatLng.a(nativeLatLngForPixel.longitude, -180.0d, 180.0d));
    }

    /* access modifiers changed from: package-private */
    public final void b(@NonNull MapView.l lVar) {
        if (this.i.contains(lVar)) {
            this.i.remove(lVar);
        }
    }

    public final void b(String str) {
        if (!a("setStyleUrl")) {
            nativeSetStyleUrl(str);
        }
    }

    public final void a(double d2) {
        if (!a("setMinZoom")) {
            nativeSetMinZoom(d2);
        }
    }

    public final void b(boolean z) {
        if (!a("setDebug")) {
            nativeSetDebug(z);
        }
    }

    @NonNull
    public final List<Feature> a(@NonNull PointF pointF, @Nullable String[] strArr, @Nullable com.mapbox.mapboxsdk.style.a.a aVar) {
        if (a("queryRenderedFeatures")) {
            return new ArrayList();
        }
        Feature[] nativeQueryRenderedFeaturesForPoint = nativeQueryRenderedFeaturesForPoint(pointF.x / this.f26582c, pointF.y / this.f26582c, strArr, null);
        if (nativeQueryRenderedFeaturesForPoint != null) {
            return Arrays.asList(nativeQueryRenderedFeaturesForPoint);
        }
        return new ArrayList();
    }

    public final void a(double d2, double d3, long j) {
        if (!a("moveBy")) {
            double d4 = (double) this.f26582c;
            Double.isNaN(d4);
            double d5 = d2 / d4;
            double d6 = (double) this.f26582c;
            Double.isNaN(d6);
            nativeMoveBy(d5, d3 / d6, j);
        }
    }

    public final void a(double d2, double d3, double d4, long j) {
        if (!a("setBearing")) {
            double d5 = (double) this.f26582c;
            Double.isNaN(d5);
            double d6 = d3 / d5;
            double d7 = (double) this.f26582c;
            Double.isNaN(d7);
            nativeSetBearingXY(d2, d6, d4 / d7, j);
        }
    }

    public NativeMapView(Context context, float f2, boolean z, b bVar, a aVar, MapRenderer mapRenderer) {
        this.f26581b = mapRenderer;
        this.f26584e = bVar;
        this.f26580a = FileSource.a(context);
        this.f26582c = f2;
        this.f26583d = Thread.currentThread();
        this.f26585f = aVar;
        nativeInitialize(this, this.f26580a, mapRenderer, f2, z);
    }
}
