package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class ThreadScopeSupport {
    private static native void runStdFunctionImpl(long j);

    @DoNotStrip
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
