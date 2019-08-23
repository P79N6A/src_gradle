package com.ss.avframework.livestreamv2.core;

import com.ss.avframework.livestreamv2.IInputAudioStream;
import com.ss.avframework.livestreamv2.IInputVideoStream;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.controller.AnchorController;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;

public class Anchor extends Client {
    private AnchorController mAnchorController;

    public boolean isGuest() {
        return false;
    }

    public synchronized void dispose() {
        if (this.mAnchorController != null) {
            this.mAnchorController = null;
        }
        super.dispose();
    }

    public void start() {
        if (this.mAnchorController != null) {
            this.mAnchorController.start();
        }
        super.start();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.mAnchorController != null) {
            this.mAnchorController.end();
            this.mAnchorController = null;
        }
        super.stop();
        super.dispose();
        super.finalize();
    }

    public synchronized void stop() {
        if (this.mAnchorController != null) {
            this.mAnchorController.end();
        }
        super.stop();
    }

    public Anchor(LiveCore.InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, AnchorController.StreamMixer streamMixer, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
        super(interactConfig, videoClientFactory, audioClientFactory, iInputAudioStream, iInputVideoStream);
        this.mAnchorController = new AnchorController(interactConfig, videoClientFactory, audioClientFactory, streamMixer);
        this.mAnchorController.addDataCallback(this);
        this.mAnchorController.addQualityCallback(this);
        this.mAnchorController.addStateCallback(this);
        this.mAnchorController.addUserCallback(this);
    }
}
