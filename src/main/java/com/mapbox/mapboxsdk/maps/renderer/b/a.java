package com.mapbox.mapboxsdk.maps.renderer.b;

import android.content.Context;
import android.opengl.GLSurfaceView;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class a extends MapRenderer implements GLSurfaceView.Renderer {

    /* renamed from: a  reason: collision with root package name */
    private final GLSurfaceView f26722a;

    public void onStart() {
        this.f26722a.onResume();
    }

    public void onStop() {
        this.f26722a.onPause();
    }

    public void requestRender() {
        this.f26722a.requestRender();
    }

    public void onDrawFrame(GL10 gl10) {
        super.onDrawFrame(gl10);
    }

    public void queueEvent(Runnable runnable) {
        this.f26722a.queueEvent(runnable);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        super.onSurfaceChanged(gl10, i, i2);
    }

    public a(Context context, GLSurfaceView gLSurfaceView, String str) {
        super(context, str);
        this.f26722a = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLConfigChooser(new com.mapbox.mapboxsdk.maps.renderer.a.a());
        gLSurfaceView.setRenderer(this);
        gLSurfaceView.setRenderMode(0);
        gLSurfaceView.setPreserveEGLContextOnPause(true);
    }
}
