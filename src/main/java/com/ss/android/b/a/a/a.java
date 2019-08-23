package com.ss.android.b.a.a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

@Deprecated
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f2424a;

    /* renamed from: b  reason: collision with root package name */
    private static Handler f2425b;

    private static void a() {
        if (f2424a == null || f2424a.isTerminated()) {
            f2424a = (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
            f2425b = new Handler(Looper.getMainLooper());
        }
    }

    @Deprecated
    public static void a(Runnable runnable) {
        a();
        try {
            f2424a.execute(runnable);
        } catch (Exception unused) {
        }
    }

    @Deprecated
    public static void b(Runnable runnable) {
        a();
        if (f2425b != null) {
            f2425b.post(runnable);
        }
    }

    @Deprecated
    public static void c(Runnable runnable) {
        a();
        f2425b.removeCallbacks(runnable);
    }

    @Deprecated
    public static void a(Runnable runnable, int i) {
        a();
        f2425b.postDelayed(runnable, (long) i);
    }
}
