package com.ss.avframework.engine;

import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public abstract class VideoEncoderFactory extends NativeObject {
    @CalledByNative
    public abstract VideoEncoder CreateVideoEncoder(String str, boolean z);

    @CalledByNative
    public abstract String GetSupportedFormats();
}
