package com.google.common.util.concurrent;

import com.google.common.a.m;
import com.google.common.a.u;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.j;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@GwtCompatible
public final class v {

    enum a implements Executor {
        INSTANCE;

        public final String toString() {
            return "MoreExecutors.directExecutor()";
        }

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    @GwtIncompatible
    static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f24898a;

        public final boolean isShutdown() {
            return this.f24898a.isShutdown();
        }

        public final boolean isTerminated() {
            return this.f24898a.isTerminated();
        }

        public final void shutdown() {
            this.f24898a.shutdown();
        }

        public final List<Runnable> shutdownNow() {
            return this.f24898a.shutdownNow();
        }

        public final void execute(Runnable runnable) {
            this.f24898a.execute(runnable);
        }

        b(ExecutorService executorService) {
            this.f24898a = (ExecutorService) m.a(executorService);
        }

        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f24898a.awaitTermination(j, timeUnit);
        }
    }

    @GwtIncompatible
    static final class c extends b implements u {

        /* renamed from: a  reason: collision with root package name */
        final ScheduledExecutorService f24899a;

        static final class a<V> extends j.a<V> implements s<V> {

            /* renamed from: a  reason: collision with root package name */
            private final ScheduledFuture<?> f24900a;

            public final long getDelay(TimeUnit timeUnit) {
                return this.f24900a.getDelay(timeUnit);
            }

            public final boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.f24900a.cancel(z);
                }
                return cancel;
            }

            public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
                return this.f24900a.compareTo((Delayed) obj);
            }

            public a(q<V> qVar, ScheduledFuture<?> scheduledFuture) {
                super(qVar);
                this.f24900a = scheduledFuture;
            }
        }

        @GwtIncompatible
        static final class b extends b<Void> implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private final Runnable f24901a;

            public final void run() {
                try {
                    this.f24901a.run();
                } catch (Throwable th) {
                    a(th);
                    u.a(th);
                    throw new RuntimeException(th);
                }
            }

            public b(Runnable runnable) {
                this.f24901a = (Runnable) m.a(runnable);
            }
        }

        c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f24899a = (ScheduledExecutorService) m.a(scheduledExecutorService);
        }

        public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            x a2 = x.a(callable);
            return new a(a2, this.f24899a.schedule(a2, j, timeUnit));
        }

        public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            x a2 = x.a(runnable, null);
            return new a(a2, this.f24899a.schedule(a2, j, timeUnit));
        }

        public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f24899a.scheduleAtFixedRate(bVar, j, j2, timeUnit));
        }

        public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f24899a.scheduleWithFixedDelay(bVar, j, j2, timeUnit));
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    @GwtIncompatible
    public static t a(ExecutorService executorService) {
        if (executorService instanceof t) {
            return (t) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new c((ScheduledExecutorService) executorService);
        }
        return new b(executorService);
    }

    public static Executor a(final Executor executor, final b<?> bVar) {
        m.a(executor);
        m.a(bVar);
        if (executor == a()) {
            return executor;
        }
        return new Executor() {

            /* renamed from: a  reason: collision with root package name */
            boolean f24893a = true;

            public final void execute(final Runnable runnable) {
                try {
                    executor.execute(new Runnable() {
                        public final void run() {
                            AnonymousClass1.this.f24893a = false;
                            runnable.run();
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    if (this.f24893a) {
                        bVar.a((Throwable) e2);
                    }
                }
            }
        };
    }
}
