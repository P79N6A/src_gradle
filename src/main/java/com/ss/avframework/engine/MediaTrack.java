package com.ss.avframework.engine;

import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import com.ss.avframework.utils.JniCommon;
import java.util.ArrayList;
import java.util.Iterator;

@JNINamespace("jni")
public abstract class MediaTrack implements StaticsReport.StaticReportInterface {
    private ArrayList<AudioSink> mAudioSinks = new ArrayList<>();
    private long mNativeObj;
    private MediaSource mSource;
    private ArrayList<VideoSink> mVideoSinks = new ArrayList<>();

    private native boolean nativeEnable(long j);

    private native String nativeId(long j);

    private native String nativeKind(long j);

    private native void nativeSetEnable(long j, boolean z);

    /* access modifiers changed from: protected */
    public native void nativeAddAudioSink(long j, AudioSink audioSink);

    /* access modifiers changed from: protected */
    public native void nativeAddVideoSink(long j, VideoSink videoSink);

    /* access modifiers changed from: protected */
    public native boolean nativeGetStaticsReport(long j, StaticsReport staticsReport);

    /* access modifiers changed from: protected */
    public native void nativeRemoveAudioSink(long j, AudioSink audioSink);

    /* access modifiers changed from: protected */
    public native void nativeRemoveVideoSink(long j, VideoSink videoSink);

    @CalledByNative
    private long getNativeObj() {
        return this.mNativeObj;
    }

    public boolean enable() {
        return nativeEnable(this.mNativeObj);
    }

    public String id() {
        return nativeId(this.mNativeObj);
    }

    public String kind() {
        return nativeKind(this.mNativeObj);
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            Iterator<VideoSink> it2 = this.mVideoSinks.iterator();
            while (it2.hasNext()) {
                VideoSink next = it2.next();
                nativeRemoveVideoSink(this.mNativeObj, next);
                next.release();
                it2.remove();
            }
            Iterator<AudioSink> it3 = this.mAudioSinks.iterator();
            while (it3.hasNext()) {
                AudioSink next2 = it3.next();
                nativeRemoveAudioSink(this.mNativeObj, next2);
                next2.release();
                it3.remove();
            }
            JniCommon.nativeReleaseRef(this.mNativeObj);
            this.mNativeObj = 0;
        }
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        return nativeGetStaticsReport(this.mNativeObj, staticsReport);
    }

    public void setEnable(boolean z) {
        nativeSetEnable(this.mNativeObj, z);
    }

    /* access modifiers changed from: protected */
    public void removeAudioSink(AudioSink audioSink) {
        if (this.mAudioSinks.remove(audioSink)) {
            nativeRemoveAudioSink(this.mNativeObj, audioSink);
        }
    }

    /* access modifiers changed from: protected */
    public void removeVideoSink(VideoSink videoSink) {
        if (this.mVideoSinks.remove(videoSink)) {
            nativeRemoveVideoSink(this.mNativeObj, videoSink);
        }
    }

    /* access modifiers changed from: protected */
    public void addAudioSink(AudioSink audioSink) {
        if (this.mAudioSinks.indexOf(audioSink) < 0) {
            this.mAudioSinks.add(audioSink);
            nativeAddAudioSink(this.mNativeObj, audioSink);
        }
    }

    /* access modifiers changed from: protected */
    public void addVideoSink(VideoSink videoSink) {
        if (this.mVideoSinks.indexOf(videoSink) < 0) {
            this.mVideoSinks.add(videoSink);
            nativeAddVideoSink(this.mNativeObj, videoSink);
        }
    }

    public MediaTrack(long j, MediaSource mediaSource) {
        this.mNativeObj = j;
        this.mSource = mediaSource;
    }
}
