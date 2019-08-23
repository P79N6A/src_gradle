package com.mapbox.mapboxsdk.style.light;

import android.support.annotation.Keep;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.style.layers.TransitionOptions;
import com.mapbox.mapboxsdk.utils.f;

@UiThread
public class Light {
    @Keep
    private long nativePtr;

    @Keep
    private native String nativeGetAnchor();

    @Keep
    private native String nativeGetColor();

    @Keep
    private native TransitionOptions nativeGetColorTransition();

    @Keep
    private native float nativeGetIntensity();

    @Keep
    private native TransitionOptions nativeGetIntensityTransition();

    @Keep
    private native Position nativeGetPosition();

    @Keep
    private native TransitionOptions nativeGetPositionTransition();

    @Keep
    private native void nativeSetAnchor(String str);

    @Keep
    private native void nativeSetColor(String str);

    @Keep
    private native void nativeSetColorTransition(long j, long j2);

    @Keep
    private native void nativeSetIntensity(float f2);

    @Keep
    private native void nativeSetIntensityTransition(long j, long j2);

    @Keep
    private native void nativeSetPosition(Position position);

    @Keep
    private native void nativeSetPositionTransition(long j, long j2);

    @Keep
    Light(long j) {
        f.a("Light");
        this.nativePtr = j;
    }
}
