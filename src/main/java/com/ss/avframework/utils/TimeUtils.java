package com.ss.avframework.utils;

import com.ss.avframework.engine.MediaEngineFactory;

@JNINamespace("jni")
public class TimeUtils {
    private static native long nativeNanoTime();

    private static native long nativeTimeUTCMicros();

    static {
        MediaEngineFactory.getVersion();
    }

    public static long nanoTime() {
        return nativeNanoTime();
    }

    public static long timeUTCMicros() {
        return nativeTimeUTCMicros();
    }
}
