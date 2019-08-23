package com.ss.avframework.buffer;

import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("jni")
public class WrapperNativeAudioBuffer {
    public int mChannel;
    private long mNativeBuffer;
    public int mSampleRateHz;
    public int mSamplesPerChannel;
    public long timestampUs;

    public static ByteBuffer getDirectBuffer(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
        return null;
    }

    @CalledByNative
    public synchronized long extract() {
        long j;
        j = this.mNativeBuffer;
        this.mNativeBuffer = 0;
        return j;
    }

    public WrapperNativeAudioBuffer(long j, int i, int i2, int i3, long j2) {
        this.mNativeBuffer = j;
        this.mSamplesPerChannel = i;
        this.mSampleRateHz = i2;
        this.mChannel = i3;
        this.timestampUs = j2;
    }
}
