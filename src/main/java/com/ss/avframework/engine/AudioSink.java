package com.ss.avframework.engine;

import com.ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
public abstract class AudioSink extends NativeObject {
    @CalledByNative
    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
    }

    @CalledByNative
    public abstract void onData(Buffer buffer, int i, int i2, int i3, long j);

    @CalledByNative
    public abstract void onNoData();
}
