package com.ss.android.vesdk.d;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

public final class b extends c implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public TextureView f77932a;

    /* renamed from: b  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f77933b;

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f77933b != null) {
            this.f77933b.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z;
        if (this.f77933b != null) {
            z = this.f77933b.onSurfaceTextureDestroyed(surfaceTexture);
        } else {
            z = false;
        }
        if (this.f77937e != null) {
            this.f77937e.release();
            this.f77937e = null;
        }
        return z;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f77933b != null) {
            this.f77933b.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
        a(this.f77937e, 0, i, i2);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f77933b != null) {
            this.f77933b.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        this.f77935c = i;
        this.f77936d = i2;
        a(new Surface(surfaceTexture));
    }
}
