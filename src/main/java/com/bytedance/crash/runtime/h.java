package com.bytedance.crash.runtime;

import android.os.Handler;
import android.os.HandlerThread;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static volatile HandlerThread f19552a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Handler f19553b;

    public static Handler b() {
        if (f19553b == null) {
            a();
        }
        return f19553b;
    }

    public static HandlerThread a() {
        if (f19552a == null) {
            synchronized (h.class) {
                if (f19552a == null) {
                    HandlerThread handlerThread = new HandlerThread("default_npth_thread");
                    f19552a = handlerThread;
                    handlerThread.start();
                    f19553b = new Handler(f19552a.getLooper());
                }
            }
        }
        return f19552a;
    }
}
