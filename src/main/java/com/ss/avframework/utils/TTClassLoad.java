package com.ss.avframework.utils;

@JNINamespace("jni")
public class TTClassLoad {
    @CalledByNative
    static Object getClassLoader() {
        return TTClassLoad.class.getClassLoader();
    }
}
