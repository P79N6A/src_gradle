package com.ss.avframework.capture.audio;

import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class AudioCapturerOpensles extends AudioCapturer {
    private AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    private int mChannel;
    private int mStat;

    private native void nativeCreate(int i, int i2, int i3);

    private native void nativePause();

    private native boolean nativeRecording();

    private native void nativeResume();

    private native int nativeStart();

    private native void nativeStop();

    public void pause() {
        nativePause();
    }

    public void resume() {
        nativeResume();
    }

    public int status() {
        return this.mStat;
    }

    public int updateChannel() {
        return this.mChannel;
    }

    public synchronized void release() {
        stop();
        super.release();
    }

    public synchronized void stop() {
        if (this.mStat != 2) {
            pause();
            nativeStop();
            this.mStat = 2;
        }
    }

    public void start() {
        int nativeStart = nativeStart();
        if (nativeStart == 0) {
            this.mStat = 1;
            return;
        }
        throw new IllegalStateException("Start failure (" + nativeStart + ")");
    }

    @CalledByNative
    private void channelChange(int i) {
        this.mChannel = i;
    }

    public AudioCapturerOpensles(int i, int i2, int i3, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mChannel = i2;
        this.mAudioCaptureObserver = audioCaptureObserver;
        nativeCreate(i, i2, i3);
    }
}
