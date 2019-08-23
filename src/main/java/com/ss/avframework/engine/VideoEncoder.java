package com.ss.avframework.engine;

import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import com.ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

@JNINamespace("jni")
public abstract class VideoEncoder extends NativeObject {
    @CalledByNative
    public abstract int Encode(VideoFrame videoFrame);

    @CalledByNative
    public abstract boolean InitEncoder(TEBundle tEBundle);

    @CalledByNative
    public abstract void SetBitrate(int i);

    /* access modifiers changed from: protected */
    public native void nativeEncoded(ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2);

    public void release() {
    }
}
