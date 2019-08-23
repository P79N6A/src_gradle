package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.Keep;
import android.support.annotation.UiThread;

@UiThread
public class HillshadeLayer extends Layer {
    @Keep
    private native Object nativeGetHillshadeAccentColor();

    @Keep
    private native TransitionOptions nativeGetHillshadeAccentColorTransition();

    @Keep
    private native Object nativeGetHillshadeExaggeration();

    @Keep
    private native TransitionOptions nativeGetHillshadeExaggerationTransition();

    @Keep
    private native Object nativeGetHillshadeHighlightColor();

    @Keep
    private native TransitionOptions nativeGetHillshadeHighlightColorTransition();

    @Keep
    private native Object nativeGetHillshadeIlluminationAnchor();

    @Keep
    private native Object nativeGetHillshadeIlluminationDirection();

    @Keep
    private native Object nativeGetHillshadeShadowColor();

    @Keep
    private native TransitionOptions nativeGetHillshadeShadowColorTransition();

    @Keep
    private native void nativeSetHillshadeAccentColorTransition(long j, long j2);

    @Keep
    private native void nativeSetHillshadeExaggerationTransition(long j, long j2);

    @Keep
    private native void nativeSetHillshadeHighlightColorTransition(long j, long j2);

    @Keep
    private native void nativeSetHillshadeShadowColorTransition(long j, long j2);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, String str2);

    @Keep
    HillshadeLayer(long j) {
        super(j);
    }
}
