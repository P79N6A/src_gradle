package com.bytedance.im.core.b.d;

import com.bytedance.im.core.a.c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f21178a;

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f21179b;

    /* renamed from: c  reason: collision with root package name */
    private static ExecutorService f21180c;

    /* renamed from: d  reason: collision with root package name */
    private static ThreadFactory f21181d = new ThreadFactory() {
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            return thread;
        }
    };

    public static Executor c() {
        return b();
    }

    public static Executor b() {
        if (f21178a == null) {
            f21178a = b.a(f21181d);
        }
        return f21178a;
    }

    public static Executor a() {
        if (f21180c == null) {
            ExecutorService executorService = c.a().b().G;
            if (executorService != null) {
                f21180c = executorService;
            } else {
                f21180c = b.a(Runtime.getRuntime().availableProcessors(), f21181d);
            }
        }
        return f21180c;
    }
}
