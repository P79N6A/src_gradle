package com.ss.avframework.codec;

import android.util.AndroidRuntimeException;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoEncoder;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import com.ss.avframework.utils.TEBundle;

@JNINamespace("jni")
public class NativeVideoEncoder extends VideoEncoder {
    @CalledByNative
    private static boolean isNativeVideoEncoderInstence(Object obj) {
        return obj instanceof NativeVideoEncoder;
    }

    @CalledByNative
    private NativeVideoEncoder(long j) {
        this.mNativeObj = j;
    }

    public int Encode(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    public boolean InitEncoder(TEBundle tEBundle) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    public void SetBitrate(int i) {
        throw new AndroidRuntimeException("SetBitrate");
    }
}
