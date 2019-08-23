package com.ss.avframework.engine;

import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public abstract class VideoSource extends MediaSource {
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    /* access modifiers changed from: protected */
    @CalledByNative
    public abstract boolean isScreenCast();

    /* access modifiers changed from: protected */
    public native void nativeAdaptedOutputFormat(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public native int nativeOnFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j);

    public void adaptOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
    }
}
