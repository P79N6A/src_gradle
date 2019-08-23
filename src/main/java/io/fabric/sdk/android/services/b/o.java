package io.fabric.sdk.android.services.b;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class o {
    public static final ThreadFactory a(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1);
        return new ThreadFactory() {
            public final Thread newThread(final Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(new h() {
                    public final void onRun() {
                        runnable.run();
                    }
                });
                newThread.setName(str + atomicLong.getAndIncrement());
                return newThread;
            }
        };
    }

    public static final void a(String str, ExecutorService executorService) {
        a(str, executorService, 2, TimeUnit.SECONDS);
    }

    private static void a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        final String str2 = str;
        final ExecutorService executorService2 = executorService;
        final TimeUnit timeUnit2 = timeUnit;
        AnonymousClass2 r0 = new h(2) {
            public final void onRun() {
                try {
                    new StringBuilder("Executing shutdown hook for ").append(str2);
                    executorService2.shutdown();
                    if (!executorService2.awaitTermination(2, timeUnit2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                        executorService2.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str2});
                    executorService2.shutdownNow();
                }
            }
        };
        runtime.addShutdownHook(new Thread(r0, "Crashlytics Shutdown Hook for " + str));
    }
}
