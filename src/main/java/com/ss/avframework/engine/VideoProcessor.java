package com.ss.avframework.engine;

import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public abstract class VideoProcessor extends NativeObject {
    /* access modifiers changed from: protected */
    @CalledByNative
    public abstract VideoFrame process(VideoFrame videoFrame);
}
