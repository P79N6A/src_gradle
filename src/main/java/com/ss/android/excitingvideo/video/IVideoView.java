package com.ss.android.excitingvideo.video;

import android.content.Context;
import android.view.Surface;

public interface IVideoView {
    void dismissLoading();

    Context getApplicationContext();

    Surface getSurface();

    void releaseSurface(boolean z);

    void setSize(int i, int i2);

    void setSurfaceViewVisibility(int i);

    void setVideoViewCallback(IVideoViewCallback iVideoViewCallback);

    void showLoading();
}
