package com.mapbox.mapboxsdk.net;

import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.a;

public class NativeConnectivityListener implements a {
    @Keep
    private boolean invalidated;
    @Keep
    private long nativePtr;

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeOnConnectivityStateChanged(boolean z);

    static {
        a.a();
    }

    NativeConnectivityListener() {
        initialize();
    }

    public final void a(boolean z) {
        nativeOnConnectivityStateChanged(z);
    }

    @Keep
    NativeConnectivityListener(long j) {
        this.nativePtr = j;
    }
}
