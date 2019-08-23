package com.ss.avframework.livestreamv2.interact.video;

public interface VideoClient {
    void prepare(VideoCallback videoCallback);

    void release();

    void start();

    void stop();
}
