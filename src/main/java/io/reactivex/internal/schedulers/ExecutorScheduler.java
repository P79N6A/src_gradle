package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ExecutorScheduler extends Scheduler {
    static final Scheduler HELPER = Schedulers.single();
    @NonNull
    final Executor executor;

    final class DelayedDispose implements Runnable {
        private final DelayedRunnable dr;

        public final void run() {
            this.dr.direct.replace(ExecutorScheduler.this.scheduleDirect(this.dr));
        }

        DelayedDispose(DelayedRunnable delayedRunnable) {
            this.dr = delayedRunnable;
        }
    }

    static final class DelayedRunnable extends AtomicReference<Runnable> implements Disposable, SchedulerRunnableIntrospection, Runnable {
        private static final long serialVersionUID = -4101336210206799084L;
        final SequentialDisposable direct = new SequentialDisposable();
        final SequentialDisposable timed = new SequentialDisposable();

        public final Runnable getWrappedRunnable() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                return runnable;
            }
            return Functions.EMPTY_RUNNABLE;
        }

        public final boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        public final void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }

        public final void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    this.direct.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }

        DelayedRunnable(Runnable runnable) {
            super(runnable);
        }
    }

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {
        volatile boolean disposed;
        final Executor executor;
        final MpscLinkedQueue<Runnable> queue;
        final CompositeDisposable tasks = new CompositeDisposable();
        final AtomicInteger wip = new AtomicInteger();

        static final class BooleanRunnable extends AtomicBoolean implements Disposable, Runnable {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            public final void dispose() {
                lazySet(true);
            }

            public final boolean isDisposed() {
                return get();
            }

            public final void run() {
                if (!get()) {
                    try {
                        this.actual.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }

            BooleanRunnable(Runnable runnable) {
                this.actual = runnable;
            }
        }

        final class SequentialDispose implements Runnable {
            private final Runnable decoratedRun;
            private final SequentialDisposable mar;

            public final void run() {
                this.mar.replace(ExecutorWorker.this.schedule(this.decoratedRun));
            }

            SequentialDispose(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.mar = sequentialDisposable;
                this.decoratedRun = runnable;
            }
        }

        public final boolean isDisposed() {
            return this.disposed;
        }

        public final void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.tasks.dispose();
                if (this.wip.getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            if (r3.disposed == false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r0.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            r1 = r3.wip.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> r0 = r3.queue
                r1 = 1
            L_0x0003:
                boolean r2 = r3.disposed
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 == 0) goto L_0x001e
                r2.run()
                boolean r2 = r3.disposed
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x001e:
                boolean r2 = r3.disposed
                if (r2 == 0) goto L_0x0026
                r0.clear()
                return
            L_0x0026:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.wip
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.run():void");
        }

        public ExecutorWorker(Executor executor2) {
            this.executor = executor2;
            this.queue = new MpscLinkedQueue<>();
        }

        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            BooleanRunnable booleanRunnable = new BooleanRunnable(RxJavaPlugins.onSchedule(runnable));
            this.queue.offer(booleanRunnable);
            if (this.wip.getAndIncrement() == 0) {
                try {
                    this.executor.execute(this);
                } catch (RejectedExecutionException e2) {
                    this.disposed = true;
                    this.queue.clear();
                    RxJavaPlugins.onError(e2);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return booleanRunnable;
        }

        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (j <= 0) {
                return schedule(runnable);
            }
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new SequentialDispose(sequentialDisposable2, RxJavaPlugins.onSchedule(runnable)), this.tasks);
            this.tasks.add(scheduledRunnable);
            if (this.executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((ScheduledExecutorService) this.executor).schedule(scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e2) {
                    this.disposed = true;
                    RxJavaPlugins.onError(e2);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new DisposeOnCancel(ExecutorScheduler.HELPER.scheduleDirect(scheduledRunnable, j, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }
    }

    @NonNull
    public final Scheduler.Worker createWorker() {
        return new ExecutorWorker(this.executor);
    }

    public ExecutorScheduler(@NonNull Executor executor2) {
        this.executor = executor2;
    }

    @NonNull
    public final Disposable scheduleDirect(@NonNull Runnable runnable) {
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        try {
            if (this.executor instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((ExecutorService) this.executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(onSchedule);
            this.executor.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @NonNull
    public final Disposable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (this.executor instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((ScheduledExecutorService) this.executor).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e2) {
                RxJavaPlugins.onError(e2);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            DelayedRunnable delayedRunnable = new DelayedRunnable(onSchedule);
            delayedRunnable.timed.replace(HELPER.scheduleDirect(new DelayedDispose(delayedRunnable), j, timeUnit));
            return delayedRunnable;
        }
    }

    @NonNull
    public final Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.executor instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(RxJavaPlugins.onSchedule(runnable));
            scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService) this.executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
