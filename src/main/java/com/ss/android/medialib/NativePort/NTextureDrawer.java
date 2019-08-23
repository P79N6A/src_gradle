package com.ss.android.medialib.NativePort;

import com.ss.android.ttve.nativePort.b;

public class NTextureDrawer {

    /* renamed from: a  reason: collision with root package name */
    private static final String f29323a = "NTextureDrawer";

    private native long nativeCreateHandler();

    private native void nativeDrawTexture(long j, int i);

    private native void nativeRelease(long j);

    private native void nativeSetDebug(long j, boolean z);

    private native void nativeSetFlipScale(long j, float f2, float f3);

    private native void nativeSetRotation(long j, float f2);

    private native void nativeSetWidthHeight(long j, int i, int i2);

    static {
        b.a();
    }
}
