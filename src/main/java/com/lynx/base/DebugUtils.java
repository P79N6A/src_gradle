package com.lynx.base;

public class DebugUtils {
    public static native void nativeCheckMemoryLeak();

    public static void checkMemoryLeak() {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException unused) {
                }
                DebugUtils.nativeCheckMemoryLeak();
            }
        }).start();
    }
}
