package com.bytedance.ad.symphony.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.common.utility.concurrent.SimpleThreadFactory;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f7636a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static final HandlerThread f7637b;

    /* renamed from: c  reason: collision with root package name */
    private static Handler f7638c = new Handler(f7637b.getLooper());

    /* renamed from: d  reason: collision with root package name */
    private static ExecutorService f7639d;

    public static Looper a() {
        return f7637b.getLooper();
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ad-symphony-single-thread");
        f7637b = handlerThread;
        handlerThread.start();
    }

    private static ExecutorService b() {
        if (f7639d == null) {
            synchronized (a.class) {
                if (f7639d == null) {
                    f7639d = h.a(m.a(p.FIXED).a(2).a((ThreadFactory) new SimpleThreadFactory("ad-symphony-thread-pool")).a());
                }
            }
        }
        return f7639d;
    }

    public static void a(Runnable runnable) {
        b().execute(runnable);
    }

    public static synchronized void a(ExecutorService executorService) {
        synchronized (a.class) {
            if (f7639d != null) {
                new StringBuilder("executor service not none:").append(f7639d);
            } else {
                f7639d = executorService;
            }
        }
    }
}
