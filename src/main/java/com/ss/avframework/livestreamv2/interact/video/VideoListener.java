package com.ss.avframework.livestreamv2.interact.video;

public interface VideoListener {
    void onLocalVideoFrameAvailable();

    void onRemoteVideoFrameAvailable();
}
