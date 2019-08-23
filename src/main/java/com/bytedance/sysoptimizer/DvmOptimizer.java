package com.bytedance.sysoptimizer;

import android.os.Build;

public class DvmOptimizer {
    private static boolean mIsNativeLibLoaded = true;

    private static native void optLinearAllocBuffer();

    private static native void startHookDvmFunc();

    private DvmOptimizer() {
    }

    static {
        try {
            System.loadLibrary("sysoptimizer");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static void hookDvmLinearAllocFunc() {
        if (Build.VERSION.SDK_INT <= 19 && mIsNativeLibLoaded) {
            startHookDvmFunc();
        }
    }

    public static void optDvmLinearAllocBuffer() {
        if (Build.VERSION.SDK_INT <= 19 && mIsNativeLibLoaded) {
            optLinearAllocBuffer();
        }
    }
}
