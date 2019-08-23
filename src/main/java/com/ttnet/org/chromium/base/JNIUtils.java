package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.MainDex;

@MainDex
public class JNIUtils {
    @CalledByNative
    public static Object getClassLoader() {
        return JNIUtils.class.getClassLoader();
    }
}
