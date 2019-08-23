package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.utils.f;

public abstract class Source {
    @Keep
    public long nativePtr;

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetAttribution();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetId();

    public Source() {
        checkThread();
    }

    /* access modifiers changed from: protected */
    public void checkThread() {
        f.a("Source");
    }

    public String getAttribution() {
        checkThread();
        return nativeGetAttribution();
    }

    public String getId() {
        checkThread();
        return nativeGetId();
    }

    @Keep
    protected Source(long j) {
        checkThread();
        this.nativePtr = j;
    }
}
