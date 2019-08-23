package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class GlideExecutor implements ExecutorService {
    private static final long KEEP_ALIVE_TIME_MS = TimeUnit.SECONDS.toMillis(10);
    private static volatile int bestThreadCount;
    private final ExecutorService delegate;

    static final class DefaultThreadFactory implements ThreadFactory {
        private final String name;
        final boolean preventNetworkOperations;
        private int threadNum;
        final UncaughtThrowableStrategy uncaughtThrowableStrategy;

        public final synchronized Thread newThread(@NonNull Runnable runnable) {
            AnonymousClass1 r0;
            r0 = new Thread(runnable, "glide-" + this.name + "-thread-" + this.threadNum) {
                public void run() {
                    Process.setThreadPriority(9);
                    if (DefaultThreadFactory.this.preventNetworkOperations) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (Throwable th) {
                        DefaultThreadFactory.this.uncaughtThrowableStrategy.handle(th);
                    }
                }
            };
            this.threadNum = this.threadNum + 1;
            return r0;
        }

        DefaultThreadFactory(String str, UncaughtThrowableStrategy uncaughtThrowableStrategy2, boolean z) {
            this.name = str;
            this.uncaughtThrowableStrategy = uncaughtThrowableStrategy2;
            this.preventNetworkOperations = z;
        }
    }

    public interface UncaughtThrowableStrategy {
        public static final UncaughtThrowableStrategy DEFAULT = LOG;
        public static final UncaughtThrowableStrategy IGNORE = new UncaughtThrowableStrategy() {
            public void handle(Throwable th) {
            }
        };
        public static final UncaughtThrowableStrategy LOG = new UncaughtThrowableStrategy() {
            public void handle(Throwable th) {
            }
        };
        public static final UncaughtThrowableStrategy THROW = new UncaughtThrowableStrategy() {
            public void handle(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        };

        void handle(Throwable th);
    }

    public final boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    public final boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    public final void shutdown() {
        this.delegate.shutdown();
    }

    @NonNull
    public final List<Runnable> shutdownNow() {
        return this.delegate.shutdownNow();
    }

    public final String toString() {
        return this.delegate.toString();
    }

    public static GlideExecutor newDiskCacheExecutor() {
        return newDiskCacheExecutor(1, "disk-cache", UncaughtThrowableStrategy.DEFAULT);
    }

    public static GlideExecutor newSourceExecutor() {
        return newSourceExecutor(calculateBestThreadCount(), "source", UncaughtThrowableStrategy.DEFAULT);
    }

    public static int calculateBestThreadCount() {
        if (bestThreadCount == 0) {
            bestThreadCount = Math.min(4, RuntimeCompat.availableProcessors());
        }
        return bestThreadCount;
    }

    public static GlideExecutor newAnimationExecutor() {
        int i;
        if (calculateBestThreadCount() >= 4) {
            i = 2;
        } else {
            i = 1;
        }
        return newAnimationExecutor(i, UncaughtThrowableStrategy.DEFAULT);
    }

    public static GlideExecutor newUnlimitedSourceExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, KEEP_ALIVE_TIME_MS, TimeUnit.MILLISECONDS, new SynchronousQueue(), new DefaultThreadFactory("source-unlimited", UncaughtThrowableStrategy.DEFAULT, false));
        return new GlideExecutor(threadPoolExecutor);
    }

    @VisibleForTesting
    GlideExecutor(ExecutorService executorService) {
        this.delegate = executorService;
    }

    public static GlideExecutor newDiskCacheExecutor(UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newDiskCacheExecutor(1, "disk-cache", uncaughtThrowableStrategy);
    }

    public final void execute(@NonNull Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @NonNull
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.delegate.invokeAny(collection);
    }

    @NonNull
    public final Future<?> submit(@NonNull Runnable runnable) {
        return this.delegate.submit(runnable);
    }

    public final <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.delegate.submit(callable);
    }

    public static GlideExecutor newSourceExecutor(UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newSourceExecutor(calculateBestThreadCount(), "source", uncaughtThrowableStrategy);
    }

    public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @NonNull
    public final <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.delegate.submit(runnable, t);
    }

    public static GlideExecutor newAnimationExecutor(int i, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i, KEEP_ALIVE_TIME_MS, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new DefaultThreadFactory("animation", uncaughtThrowableStrategy, true));
        return new GlideExecutor(threadPoolExecutor);
    }

    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.delegate.invokeAny(collection, j, timeUnit);
    }

    public static GlideExecutor newDiskCacheExecutor(int i, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new DefaultThreadFactory(str, uncaughtThrowableStrategy, true));
        return new GlideExecutor(threadPoolExecutor);
    }

    public static GlideExecutor newSourceExecutor(int i, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new DefaultThreadFactory(str, uncaughtThrowableStrategy, false));
        return new GlideExecutor(threadPoolExecutor);
    }
}
