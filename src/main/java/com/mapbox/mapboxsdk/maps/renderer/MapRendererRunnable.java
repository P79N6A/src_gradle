package com.mapbox.mapboxsdk.maps.renderer;

import android.support.annotation.Keep;

@Keep
public class MapRendererRunnable implements Runnable {
    private final long nativePtr;

    private native void nativeInitialize();

    /* access modifiers changed from: protected */
    public native void finalize() throws Throwable;

    public native void run();

    MapRendererRunnable(long j) {
        this.nativePtr = j;
    }
}
