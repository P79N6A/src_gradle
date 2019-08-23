package com.ss.avframework.livestreamv2.core;

import android.os.Handler;
import android.view.SurfaceView;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.engine.VsyncModule;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.mixer.AudioMixer;
import com.ss.avframework.mixer.VideoMixer;
import org.jetbrains.annotations.Nullable;

public abstract class LiveCore implements ILiveStream {
    protected ILiveCoreWarningListener mWarningListener;

    public static class Builder extends LiveStreamBuilder {
        private boolean usingEffectCamera = true;
        private boolean usingLiveStreamMixer = true;

        public boolean isUsingEffectCamera() {
            return this.usingEffectCamera;
        }

        public boolean isUsingLiveStreamMixer() {
            return this.usingLiveStreamMixer;
        }

        public LiveCore create() {
            return new LiveCoreImpl(this);
        }

        public Builder setUsingEffectCamera(boolean z) {
            this.usingEffectCamera = z;
            return this;
        }

        public Builder setUsingLiveStreamMixer(boolean z) {
            this.usingLiveStreamMixer = z;
            return this;
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2) {
            return super.create(handler, handler2);
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
            return super.create(handler, handler2, audioDeviceModule);
        }
    }

    public interface ILiveCoreWarningListener {
        void onWarning(int i, int i2, Exception exc);
    }

    public static class InteractConfig extends Config {
        private AudioMixer.AudioMixerDescription mAudioMixerDescription;
        private VideoMixer.VideoMixerDescription mVideoMixerDescription;

        public AudioMixer.AudioMixerDescription getAudioMixerDescription() {
            return this.mAudioMixerDescription;
        }

        public VideoMixer.VideoMixerDescription getVideoMixerDescription() {
            return this.mVideoMixerDescription;
        }

        public InteractConfig setAudioMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
            this.mAudioMixerDescription = audioMixerDescription;
            return this;
        }

        public InteractConfig setVideoMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
            this.mVideoMixerDescription = videoMixerDescription;
            return this;
        }
    }

    public abstract Client create(InteractConfig interactConfig, boolean z);

    public abstract AudioDeviceModule getADM();

    /* access modifiers changed from: protected */
    public abstract Builder getInternalBuilder();

    public abstract VsyncModule getVsyncModule();

    public abstract void setDisplay(SurfaceView surfaceView);

    public void setRenderSink(@Nullable VideoSink videoSink) {
    }

    public abstract int startAudioPlayer();

    public abstract int stopAudioPlayer();

    public final Builder getBuilder() {
        return getInternalBuilder();
    }

    public void setWarningListener(ILiveCoreWarningListener iLiveCoreWarningListener) {
        this.mWarningListener = iLiveCoreWarningListener;
    }

    /* access modifiers changed from: protected */
    public void onWarning(int i, int i2, Exception exc) {
        if (this.mWarningListener != null) {
            this.mWarningListener.onWarning(i, i2, exc);
        }
    }
}
