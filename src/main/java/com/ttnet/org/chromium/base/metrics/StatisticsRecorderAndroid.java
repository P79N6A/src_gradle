package com.ttnet.org.chromium.base.metrics;

import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public final class StatisticsRecorderAndroid {
    private static native String nativeToJson();

    private StatisticsRecorderAndroid() {
    }

    public static String toJson() {
        return nativeToJson();
    }
}
