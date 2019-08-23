package com.ss.android.vesdk.b;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.b;

public final class b extends a {

    /* renamed from: f  reason: collision with root package name */
    public int f77928f;
    public SurfaceTexture g;

    public final boolean a() {
        if (!super.a() || this.f77928f == 0 || this.g == null) {
            return false;
        }
        return true;
    }

    public b(ac acVar, b.a aVar, boolean z, int i, SurfaceTexture surfaceTexture) {
        super(e.b.PIXEL_FORMAT_OpenGL_OES, acVar, aVar, true);
        this.f77928f = i;
        this.g = surfaceTexture;
    }
}
