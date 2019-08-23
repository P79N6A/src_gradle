package com.ss.avframework.engine;

import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class AudioTrack extends MediaTrack {
    private AudioProcessor mAudioProcessor;

    private native void nativeSetAudioProcessor(AudioProcessor audioProcessor);

    public synchronized void release() {
        super.release();
        if (this.mAudioProcessor != null) {
            this.mAudioProcessor.release();
            this.mAudioProcessor = null;
        }
    }

    public void addAudioSink(AudioSink audioSink) {
        super.addAudioSink(audioSink);
    }

    public void removeAudioSink(AudioSink audioSink) {
        super.removeAudioSink(audioSink);
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        this.mAudioProcessor = audioProcessor;
        nativeSetAudioProcessor(audioProcessor);
    }

    public AudioTrack(long j, MediaSource mediaSource) {
        super(j, mediaSource);
    }
}
