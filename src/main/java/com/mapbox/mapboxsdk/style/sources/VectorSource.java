package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.Keep;
import android.support.annotation.UiThread;
import com.mapbox.geojson.Feature;

@UiThread
public class VectorSource extends Source {
    @Keep
    private native Feature[] querySourceFeatures(String[] strArr, Object[] objArr);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetUrl();

    @Keep
    VectorSource(long j) {
        super(j);
    }
}
