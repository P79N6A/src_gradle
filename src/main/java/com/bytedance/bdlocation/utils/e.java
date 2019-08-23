package com.bytedance.bdlocation.utils;

import android.os.HandlerThread;
import android.os.Looper;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static HandlerThread f19329a;

    /* renamed from: b  reason: collision with root package name */
    private static HandlerThread f19330b;

    public static Looper a() {
        if (f19330b == null) {
            HandlerThread handlerThread = new HandlerThread("LocationScheduleWorker");
            f19330b = handlerThread;
            handlerThread.start();
        }
        return f19330b.getLooper();
    }
}
