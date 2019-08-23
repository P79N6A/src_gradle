package com.ss.android.ad.splash.core.video;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

public final class h implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<SurfaceHolder.Callback> f27793a;

    public h(SurfaceHolder.Callback callback) {
        this.f27793a = new WeakReference<>(callback);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f27793a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f27793a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f27793a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }
}
