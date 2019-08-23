package com.bytedance.apm.k;

import android.os.Looper;

public final class q {
    public static boolean a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
