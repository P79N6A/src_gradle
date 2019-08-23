package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.JsonElement;
import com.mapbox.mapboxsdk.style.a.a;
import com.mapbox.mapboxsdk.utils.f;

public abstract class Layer {
    @Keep
    private boolean invalidated;
    @Keep
    public long nativePtr;

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native JsonElement nativeGetFilter();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetId();

    /* access modifiers changed from: protected */
    @Keep
    public native float nativeGetMaxZoom();

    /* access modifiers changed from: protected */
    @Keep
    public native float nativeGetMinZoom();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetSourceId();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetSourceLayer();

    /* access modifiers changed from: protected */
    @Keep
    public native Object nativeGetVisibility();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetFilter(Object[] objArr);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetLayoutProperty(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetMaxZoom(float f2);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetMinZoom(float f2);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetPaintProperty(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetSourceLayer(String str);

    public Layer() {
        checkThread();
    }

    /* access modifiers changed from: protected */
    public void checkThread() {
        f.a("Layer");
    }

    public String getId() {
        checkThread();
        return nativeGetId();
    }

    public float getMaxZoom() {
        checkThread();
        return nativeGetMaxZoom();
    }

    public float getMinZoom() {
        checkThread();
        return nativeGetMinZoom();
    }

    public d<String> getVisibility() {
        checkThread();
        return new b("visibility", (String) nativeGetVisibility());
    }

    public void setMaxZoom(float f2) {
        checkThread();
        nativeSetMaxZoom(f2);
    }

    public void setMinZoom(float f2) {
        checkThread();
        nativeSetMinZoom(f2);
    }

    @Keep
    protected Layer(long j) {
        checkThread();
        this.nativePtr = j;
    }

    private Object convertValue(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return obj;
        }
        return ((a) obj).c();
    }

    public void setProperties(@NonNull d<?>... dVarArr) {
        checkThread();
        if (dVarArr.length != 0) {
            for (d<?> dVar : dVarArr) {
                Object convertValue = convertValue(dVar.f26800b);
                if (dVar instanceof b) {
                    nativeSetPaintProperty(dVar.f26799a, convertValue);
                } else {
                    nativeSetLayoutProperty(dVar.f26799a, convertValue);
                }
            }
        }
    }
}
