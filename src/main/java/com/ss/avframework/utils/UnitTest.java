package com.ss.avframework.utils;

import com.ss.avframework.engine.MediaEngineFactory;

@JNINamespace("jni")
public class UnitTest {
    private static native int nativeUnitTest(String str, TEBundle tEBundle);

    public static void run(String str, TEBundle tEBundle) {
    }

    public static void init() {
        MediaEngineFactory.getVersion();
    }
}
