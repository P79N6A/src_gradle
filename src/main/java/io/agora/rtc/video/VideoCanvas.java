package io.agora.rtc.video;

import android.view.SurfaceView;

public class VideoCanvas {
    public int renderMode;
    public int uid;
    public SurfaceView view;

    public VideoCanvas(SurfaceView surfaceView) {
        this.view = surfaceView;
        this.renderMode = 1;
    }

    public VideoCanvas(SurfaceView surfaceView, int i, int i2) {
        this.view = surfaceView;
        this.renderMode = i;
        this.uid = i2;
    }
}
