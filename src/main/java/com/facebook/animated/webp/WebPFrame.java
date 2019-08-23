package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.imagepipeline.animated.a.f;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class WebPFrame implements f {
    @DoNotStrip
    private long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    /* access modifiers changed from: package-private */
    public native boolean nativeIsBlendWithPreviousFrame();

    /* access modifiers changed from: package-private */
    public native boolean nativeShouldDisposeToBackgroundColor();

    public void dispose() {
        nativeDispose();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public int getXOffset() {
        return nativeGetXOffset();
    }

    public int getYOffset() {
        return nativeGetYOffset();
    }

    @DoNotStrip
    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
