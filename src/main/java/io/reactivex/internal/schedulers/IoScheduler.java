package io.reactivex.internal.schedulers;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class IoScheduler extends Scheduler {
    static final RxThreadFactory EVICTOR_THREAD_FACTORY;
    private static final long KEEP_ALIVE_TIME = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    private static final TimeUnit KEEP_ALIVE_UNIT = TimeUnit.SECONDS;
    static final CachedWorkerPool NONE;
    static final ThreadWorker SHUTDOWN_THREAD_WORKER;
    static final RxThreadFactory WORKER_THREAD_FACTORY;
    final AtomicReference<CachedWorkerPool> pool;
    final ThreadFactory threadFactory;

    static final class CachedWorkerPool implements Runnable {
        final CompositeDisposable allWorkers;
        private final ScheduledExecutorService evictorService;
        private final Future<?> evictorTask;
        private final ConcurrentLinkedQueue<ThreadWorker> expiringWorkerQueue;
        private final long keepAliveTime;
        private final ThreadFactory threadFactory;

        public class _lancet {
            private _lancet() {
            }

            @TargetClass
            @Proxy
            static ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(int i, ThreadFactory threadFactory) {
                return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(i).a(threadFactory).a());
            }
        }

        public final void run() {
            evictExpiredWorkers();
        }

        /* access modifiers changed from: package-private */
        public final long now() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        public final void shutdown() {
            this.allWorkers.dispose();
            if (this.evictorTask != null) {
                this.evictorTask.cancel(true);
            }
            if (this.evictorService != null) {
                this.evictorService.shutdownNow();
            }
        }

        /* access modifiers changed from: package-private */
        public final void evictExpiredWorkers() {
            if (!this.expiringWorkerQueue.isEmpty()) {
                long now = now();
                Iterator<ThreadWorker> it2 = this.expiringWorkerQueue.iterator();
                while (it2.hasNext()) {
                    ThreadWorker next = it2.next();
                    if (next.getExpirationTime() > now) {
                        return;
                    }
                    if (this.expiringWorkerQueue.remove(next)) {
                        this.allWorkers.remove(next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final ThreadWorker get() {
            if (this.allWorkers.isDisposed()) {
                return IoScheduler.SHUTDOWN_THREAD_WORKER;
            }
            while (!this.expiringWorkerQueue.isEmpty()) {
                ThreadWorker poll = this.expiringWorkerQueue.poll();
                if (poll != null) {
                    return poll;
                }
            }
            ThreadWorker threadWorker = new ThreadWorker(this.threadFactory);
            this.allWorkers.add(threadWorker);
            return threadWorker;
        }

        /* access modifiers changed from: package-private */
        public final void release(ThreadWorker threadWorker) {
            threadWorker.setExpirationTime(now() + this.keepAliveTime);
            this.expiringWorkerQueue.offer(threadWorker);
        }

        CachedWorkerPool(long j, TimeUnit timeUnit, ThreadFactory threadFactory2) {
            long j2;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            this.keepAliveTime = j2;
            this.expiringWorkerQueue = new ConcurrentLinkedQueue<>();
            this.allWorkers = new CompositeDisposable();
            this.threadFactory = threadFactory2;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(1, IoScheduler.EVICTOR_THREAD_FACTORY);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, this.keepAliveTime, this.keepAliveTime, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.evictorService = scheduledExecutorService;
            this.evictorTask = scheduledFuture;
        }
    }

    static final class EventLoopWorker extends Scheduler.Worker {
        final AtomicBoolean once = new AtomicBoolean();
        private final CachedWorkerPool pool;
        private final CompositeDisposable tasks;
        private final ThreadWorker threadWorker;

        public final boolean isDisposed() {
            return this.once.get();
        }

        public final void dispose() {
            if (this.once.compareAndSet(false, true)) {
                this.tasks.dispose();
                this.pool.release(this.threadWorker);
            }
        }

        EventLoopWorker(CachedWorkerPool cachedWorkerPool) {
            this.pool = cachedWorkerPool;
            this.tasks = new CompositeDisposable();
            this.threadWorker = cachedWorkerPool.get();
        }

        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (this.tasks.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.threadWorker.scheduleActual(runnable, j, timeUnit, this.tasks);
        }
    }

    static final class ThreadWorker extends NewThreadWorker {
        private long expirationTime;

        public final long getExpirationTime() {
            return this.expirationTime;
        }

        ThreadWorker(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        public final void setExpirationTime(long j) {
            this.expirationTime = j;
        }
    }

    public IoScheduler() {
        this(WORKER_THREAD_FACTORY);
    }

    @NonNull
    public final Scheduler.Worker createWorker() {
        return new EventLoopWorker(this.pool.get());
    }

    public final int size() {
        return this.pool.get().allWorkers.size();
    }

    public final void shutdown() {
        CachedWorkerPool cachedWorkerPool;
        do {
            cachedWorkerPool = this.pool.get();
            if (cachedWorkerPool == NONE) {
                return;
            }
        } while (!this.pool.compareAndSet(cachedWorkerPool, NONE));
        cachedWorkerPool.shutdown();
    }

    public final void start() {
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(KEEP_ALIVE_TIME, KEEP_ALIVE_UNIT, this.threadFactory);
        if (!this.pool.compareAndSet(NONE, cachedWorkerPool)) {
            cachedWorkerPool.shutdown();
        }
    }

    static {
        ThreadWorker threadWorker = new ThreadWorker(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        SHUTDOWN_THREAD_WORKER = threadWorker;
        threadWorker.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        WORKER_THREAD_FACTORY = new RxThreadFactory("RxCachedThreadScheduler", max);
        EVICTOR_THREAD_FACTORY = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(0, null, WORKER_THREAD_FACTORY);
        NONE = cachedWorkerPool;
        cachedWorkerPool.shutdown();
    }

    public IoScheduler(ThreadFactory threadFactory2) {
        this.threadFactory = threadFactory2;
        this.pool = new AtomicReference<>(NONE);
        start();
    }
}
