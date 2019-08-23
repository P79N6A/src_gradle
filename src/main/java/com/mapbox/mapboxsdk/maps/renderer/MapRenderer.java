package com.mapbox.mapboxsdk.maps.renderer;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.maps.o;
import com.mapbox.mapboxsdk.storage.FileSource;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@Keep
public abstract class MapRenderer implements MapRendererScheduler {
    private long frames;
    private long nativePtr;
    private o.i onFpsChangedListener;
    private long timeElapsed;

    private native void nativeInitialize(MapRenderer mapRenderer, FileSource fileSource, float f2, String str, String str2);

    private native void nativeOnSurfaceChanged(int i, int i2);

    private native void nativeOnSurfaceCreated();

    private native void nativeRender();

    /* access modifiers changed from: protected */
    @CallSuper
    public native void finalize() throws Throwable;

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    private void updateFps() {
        this.frames++;
        long nanoTime = System.nanoTime();
        if (nanoTime - this.timeElapsed >= 1) {
            this.timeElapsed = nanoTime;
            this.frames = 0;
        }
    }

    /* access modifiers changed from: package-private */
    @CallSuper
    public void queueEvent(MapRendererRunnable mapRendererRunnable) {
        queueEvent(mapRendererRunnable);
    }

    public void setOnFpsChangedListener(o.i iVar) {
        this.onFpsChangedListener = iVar;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onDrawFrame(GL10 gl10) {
        nativeRender();
        if (this.onFpsChangedListener != null) {
            updateFps();
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        nativeOnSurfaceCreated();
    }

    public MapRenderer(Context context, String str) {
        nativeInitialize(this, FileSource.a(context), context.getResources().getDisplayMetrics().density, FileSource.c(context), str);
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        gl10.glViewport(0, 0, i, i2);
        nativeOnSurfaceChanged(i, i2);
    }
}
