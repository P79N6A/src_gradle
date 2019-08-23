package com.bytedance.ies.d.a;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f20246a = new ScheduledThreadPoolExecutor(4);

    /* renamed from: b  reason: collision with root package name */
    public static b f20247b;

    /* renamed from: c  reason: collision with root package name */
    public static Handler f20248c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20249d;

    /* renamed from: e  reason: collision with root package name */
    public Executor f20250e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Executor f20254a;
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f20247b == null) {
                f20247b = new b();
            }
            bVar = f20247b;
        }
        return bVar;
    }

    private static void a(b bVar) {
        if (!bVar.f20249d) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    private static Runnable b(final Handler handler, final Callable callable, final int i) {
        return new Runnable() {
            public final void run() {
                if (handler == null) {
                    try {
                        callable.call();
                    } catch (Exception unused) {
                    }
                } else {
                    Message obtainMessage = handler.obtainMessage(i);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e2) {
                        obtainMessage.obj = e2;
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        };
    }

    public final void a(Handler handler, Callable callable, int i) {
        a(this);
        this.f20250e.execute(b(handler, callable, i));
    }
}
