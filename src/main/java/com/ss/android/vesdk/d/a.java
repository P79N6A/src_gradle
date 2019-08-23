package com.ss.android.vesdk.d;

import android.view.SurfaceHolder;
import android.view.SurfaceView;

public final class a extends c implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public SurfaceView f77931a;

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        b(surfaceHolder.getSurface());
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f77931a != null) {
            this.f77935c = this.f77931a.getWidth();
            this.f77936d = this.f77931a.getHeight();
        }
        a(surfaceHolder.getSurface());
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        a(surfaceHolder.getSurface(), i, i2, i3);
    }
}
