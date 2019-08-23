package com.ss.android.excitingvideo.video;

public interface IVideoController {
    int getCurrentPosition();

    int getDuration();

    boolean isVideoComplete();

    boolean isVideoPause();

    boolean isVideoPlaying();

    boolean isVideoRelease();

    void pause();

    void play(String str, boolean z);

    void release();

    void resume();

    void setMute(boolean z);

    void setVideoStatusListener(VideoStatusListener videoStatusListener);
}
