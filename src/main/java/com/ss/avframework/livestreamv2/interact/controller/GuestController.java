package com.ss.avframework.livestreamv2.interact.controller;

import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;

public class GuestController extends BaseController {
    public GuestController(Config config, VideoClientFactory videoClientFactory) {
        this(config, videoClientFactory, null);
    }

    public GuestController(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory) {
        super(config, videoClientFactory, audioClientFactory);
    }
}
