package com.ss.avframework.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class WrapperNativeTextureBuffer extends TextureBufferImpl implements VideoFrame.TextureBuffer {
    private long mNativeObj;

    private native void nativeRelease(long j);

    private native void nativeRetain(long j);

    private native VideoFrame.I420Buffer nativeToI420(long j);

    public void retain() {
        nativeRetain(this.mNativeObj);
    }

    public VideoFrame.I420Buffer toI420() {
        return nativeToI420(this.mNativeObj);
    }

    public synchronized void release() {
        nativeRelease(this.mNativeObj);
    }

    @CalledByNative
    private static long isWrapperNativeFrame(VideoFrame videoFrame) {
        if (!(videoFrame.getBuffer() instanceof WrapperNativeTextureBuffer)) {
            return 0;
        }
        WrapperNativeTextureBuffer wrapperNativeTextureBuffer = (WrapperNativeTextureBuffer) videoFrame.getBuffer();
        if (wrapperNativeTextureBuffer.mNativeObj != 0) {
            return wrapperNativeTextureBuffer.mNativeObj;
        }
        throw new AndroidRuntimeException("Wrapper texture buffer is null!, What happen!");
    }

    @CalledByNative
    public WrapperNativeTextureBuffer(int i, int i2, int i3, long j) {
        this(i, i2, i3, new Matrix(), j);
        this.mNativeObj = j;
    }

    @CalledByNative
    public WrapperNativeTextureBuffer(int i, int i2, int i3, Matrix matrix, long j) {
        super(i, i2, VideoFrame.TextureBuffer.Type.RGB, i3, matrix, (TextureBufferImpl.ToI420Interface) null, (Runnable) null);
        this.mNativeObj = j;
    }

    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        throw new AndroidRuntimeException("Please support matrix transcat and see construct method");
    }
}
