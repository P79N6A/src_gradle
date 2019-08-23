package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.Keep;
import android.support.annotation.UiThread;

@UiThread
public class RasterDemSource extends Source {
    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, Object obj, int i);

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetUrl();

    @Keep
    RasterDemSource(long j) {
        super(j);
    }
}
