package com.ss.avframework.opengl;

import android.view.Surface;
import com.ss.avframework.engine.NativeObject;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class GLSurface extends NativeObject {
    public native boolean nativeDoneCurrent();

    public native boolean nativeMakeCurrent();

    public native boolean nativeMakeDefaultCurrent();

    public native boolean nativeSurfaceChanged(int i, int i2, int i3);

    public native boolean nativeSurfaceCreate(int i, int i2, Surface surface);

    public native boolean nativeSurfaceDestroy();

    public native void nativeSwapBuffers();
}
