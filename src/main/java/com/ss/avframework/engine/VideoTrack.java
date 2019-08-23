package com.ss.avframework.engine;

import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class VideoTrack extends MediaTrack {
    private VideoProcessor mVideoProcessor;

    private native void nativeSetVideoProcessor(VideoProcessor videoProcessor);

    public synchronized void release() {
        super.release();
        if (this.mVideoProcessor != null) {
            this.mVideoProcessor.release();
        }
    }

    public void addVideoSink(VideoSink videoSink) {
        super.addVideoSink(videoSink);
    }

    public void removeVideoSink(VideoSink videoSink) {
        super.removeVideoSink(videoSink);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        this.mVideoProcessor = videoProcessor;
        nativeSetVideoProcessor(videoProcessor);
    }

    public VideoTrack(long j, MediaSource mediaSource) {
        super(j, mediaSource);
    }
}
