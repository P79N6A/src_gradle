package com.bytedance.crash.i;

public final class o {
    public static Thread a(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.start();
        return thread;
    }
}
