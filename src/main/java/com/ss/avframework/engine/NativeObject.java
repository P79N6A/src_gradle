package com.ss.avframework.engine;

import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class NativeObject {
    protected long mNativeObj;

    private native void nativeRelease(long j);

    @CalledByNative
    private long getNativeObj() {
        return this.mNativeObj;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.mNativeObj != 0) {
            release();
        }
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            nativeRelease(this.mNativeObj);
            this.mNativeObj = 0;
        }
    }

    /* access modifiers changed from: protected */
    @CalledByNative
    public void setNativeObj(long j) {
        this.mNativeObj = j;
    }
}
