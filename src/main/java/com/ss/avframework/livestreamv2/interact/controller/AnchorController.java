package com.ss.avframework.livestreamv2.interact.controller;

import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.controller.BaseController;
import com.ss.avframework.livestreamv2.interact.engine.Engine;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.livestreamv2.interact.model.Region;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import java.util.List;

public class AnchorController extends BaseController {
    private boolean autoUpdateSei;
    public StreamMixer mStreamMixer;

    public interface StreamMixer {
        List<Region> mixStream(int i, int i2, int i3, List<Integer> list);
    }

    public void invalidateSei() {
        mixStream();
    }

    public synchronized void onStartSuccess() {
        super.onStartSuccess();
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    private synchronized void mixStream() {
        if (this.mState == BaseController.State.STARTED) {
            this.mMainThreadHandler.post(new Runnable() {
                public void run() {
                    List<Region> list;
                    Engine engine = AnchorController.this.mEngine;
                    if (AnchorController.this.mStreamMixer == null) {
                        list = null;
                    } else {
                        list = AnchorController.this.mStreamMixer.mixStream(AnchorController.this.mEngine.getOutputWidth(), AnchorController.this.mEngine.getOutputHeight(), AnchorController.this.mEngine.getAnchor(), AnchorController.this.mEngine.getGuestList());
                    }
                    engine.mixStream(list);
                }
            });
        }
    }

    public void setAutoUpdateSei(boolean z) {
        this.autoUpdateSei = z;
    }

    public synchronized void onUserJoined(int i) {
        super.onUserJoined(i);
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    public synchronized void onUserLeaved(int i) {
        super.onUserLeaved(i);
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    public AnchorController(Config config, VideoClientFactory videoClientFactory, StreamMixer streamMixer) {
        this(config, videoClientFactory, null, streamMixer);
    }

    public AnchorController(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, StreamMixer streamMixer) {
        super(config, videoClientFactory, audioClientFactory);
        this.autoUpdateSei = true;
        this.mStreamMixer = streamMixer;
    }
}
