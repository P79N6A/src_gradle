package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;

public final class h extends d {

    /* renamed from: b  reason: collision with root package name */
    private static h f23522b;

    private h() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static h a() {
        if (f23522b == null) {
            f23522b = new h();
        }
        return f23522b;
    }

    public final void execute(Runnable runnable) {
        boolean z;
        if (Thread.currentThread() == this.f23518a.getLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
