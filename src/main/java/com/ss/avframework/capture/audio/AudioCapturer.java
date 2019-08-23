package com.ss.avframework.capture.audio;

import com.ss.avframework.engine.AudioSource;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public abstract class AudioCapturer extends AudioSource {
    private boolean mMute;

    public interface AudioCaptureObserver {
        void onAudioCaptureError(int i, Exception exc);
    }

    public void pause() {
    }

    public void resume() {
    }

    public abstract void start();

    public abstract void stop();

    public abstract int updateChannel();

    public boolean isMute() {
        return this.mMute;
    }

    public synchronized void release() {
        super.release();
    }

    public void setAudioQuantizeGapPeriod(long j) {
        nativeSetAudioQuantizeGapPeriod(j);
    }

    public void setVolume(double d2) {
        nativeSetVolume(d2);
    }

    public void mute(boolean z) {
        double d2;
        this.mMute = z;
        if (z) {
            d2 = 0.0d;
        } else {
            d2 = 1.0d;
        }
        nativeSetVolume(d2);
    }

    public void setOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
    }
}
