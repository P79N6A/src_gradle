package com.mapbox.mapboxsdk.style.sources;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.geometry.LatLngQuad;

@UiThread
public class ImageSource extends Source {
    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, LatLngQuad latLngQuad);

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetUrl();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetCoordinates(LatLngQuad latLngQuad);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetImage(Bitmap bitmap);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetUrl(String str);

    @Keep
    ImageSource(long j) {
        super(j);
    }
}
