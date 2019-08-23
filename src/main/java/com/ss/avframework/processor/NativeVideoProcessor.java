package com.ss.avframework.processor;

import android.util.AndroidRuntimeException;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoProcessor;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class NativeVideoProcessor extends VideoProcessor {
    @CalledByNative
    private static boolean isNativeVideoProcessor(VideoProcessor videoProcessor) {
        return videoProcessor instanceof NativeVideoProcessor;
    }

    public VideoFrame process(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
