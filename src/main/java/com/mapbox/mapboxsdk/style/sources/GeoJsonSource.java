package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.Keep;
import android.support.annotation.UiThread;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;

@UiThread
public class GeoJsonSource extends Source {
    @Keep
    private native void nativeSetFeature(Feature feature);

    @Keep
    private native void nativeSetFeatureCollection(FeatureCollection featureCollection);

    @Keep
    private native void nativeSetGeoJsonString(String str);

    @Keep
    private native void nativeSetGeometry(Geometry geometry);

    @Keep
    private native Feature[] querySourceFeatures(Object[] objArr);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetUrl();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetUrl(String str);

    @Keep
    GeoJsonSource(long j) {
        super(j);
    }

    public final void a(Feature feature) {
        checkThread();
        nativeSetFeature(feature);
    }

    public GeoJsonSource(String str, Feature feature, a aVar) {
        initialize(str, aVar);
        a(feature);
    }
}
