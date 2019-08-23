package com.ss.android.excitingvideo.video;

public interface VideoStatusListener {
    void onComplete();

    void onError(int i, String str);

    void onPause();

    void onPlay();

    void onPlayProgress(int i, int i2);
}
