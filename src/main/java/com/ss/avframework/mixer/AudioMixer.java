package com.ss.avframework.mixer;

import com.ss.avframework.engine.AudioSink;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class AudioMixer extends NativeMixer {

    public static class AudioMixerDescription {
        public float volumeCoeff = 1.0f;

        @CalledByNative("AudioMixerDescription")
        public float getColumeCoeff() {
            return this.volumeCoeff;
        }
    }

    private native void nativeAddAudioSink(long j, AudioSink audioSink);

    private native void nativeAudioMixerRelease(long j);

    private native void nativeRemoveAudioSink(long j, AudioSink audioSink);

    public boolean isAudioMixer() {
        return true;
    }

    public void finalize() throws Throwable {
        release();
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            nativeAudioMixerRelease(this.mNativeObj);
        }
        this.mNativeObj = 0;
    }

    public AudioMixer(long j) {
        setNativeObj(j);
    }

    public void addAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            nativeAddAudioSink(this.mNativeObj, audioSink);
        }
    }

    public void removeAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            nativeRemoveAudioSink(this.mNativeObj, audioSink);
        }
    }
}
