package com.ss.android.excitingvideo.video;

import android.graphics.SurfaceTexture;

public interface IVideoViewCallback {
    void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2);

    boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture);
}
