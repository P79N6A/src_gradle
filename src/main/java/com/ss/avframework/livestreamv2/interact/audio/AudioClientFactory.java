package com.ss.avframework.livestreamv2.interact.audio;

public interface AudioClientFactory {
    AudioClient create();

    void destroy(AudioClient audioClient);
}
