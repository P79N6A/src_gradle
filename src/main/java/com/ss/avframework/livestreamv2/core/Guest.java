package com.ss.avframework.livestreamv2.core;

import com.ss.avframework.livestreamv2.IInputAudioStream;
import com.ss.avframework.livestreamv2.IInputVideoStream;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.interact.controller.GuestController;
import com.ss.avframework.livestreamv2.interact.video.VideoClientFactory;

public class Guest extends Client {
    private GuestController mGuestController;

    public boolean isGuest() {
        return true;
    }

    public synchronized void dispose() {
        if (this.mGuestController != null) {
            this.mGuestController = null;
        }
        super.dispose();
    }

    public void start() {
        if (this.mGuestController != null) {
            this.mGuestController.start();
        }
        super.start();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.mGuestController != null) {
            this.mGuestController.end();
            this.mGuestController = null;
        }
        super.stop();
        super.dispose();
        super.finalize();
    }

    public synchronized void stop() {
        if (this.mGuestController != null) {
            this.mGuestController.end();
        }
        super.stop();
    }

    public Guest(LiveCore.InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
        super(interactConfig, videoClientFactory, audioClientFactory, iInputAudioStream, iInputVideoStream);
        this.mGuestController = new GuestController(interactConfig, videoClientFactory, audioClientFactory);
        this.mGuestController.addDataCallback(this);
        this.mGuestController.addQualityCallback(this);
        this.mGuestController.addStateCallback(this);
        this.mGuestController.addUserCallback(this);
    }
}
