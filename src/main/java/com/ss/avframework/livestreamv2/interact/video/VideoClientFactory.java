package com.ss.avframework.livestreamv2.interact.video;

public interface VideoClientFactory {
    VideoClient create();

    void destroy(VideoClient videoClient);
}
