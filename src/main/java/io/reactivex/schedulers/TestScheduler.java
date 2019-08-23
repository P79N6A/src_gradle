package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class TestScheduler extends Scheduler {
    long counter;
    final Queue<TimedRunnable> queue = new PriorityBlockingQueue(11);
    volatile long time;

    final class TestWorker extends Scheduler.Worker {
        volatile boolean disposed;

        final class QueueRemove implements Runnable {
            final TimedRunnable timedAction;

            public final void run() {
                TestScheduler.this.queue.remove(this.timedAction);
            }

            QueueRemove(TimedRunnable timedRunnable) {
                this.timedAction = timedRunnable;
            }
        }

        public final void dispose() {
            this.disposed = true;
        }

        public final boolean isDisposed() {
            return this.disposed;
        }

        TestWorker() {
        }

        public final long now(@NonNull TimeUnit timeUnit) {
            return TestScheduler.this.now(timeUnit);
        }

        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j = testScheduler.counter;
            testScheduler.counter = 1 + j;
            TimedRunnable timedRunnable = new TimedRunnable(this, 0, runnable, j);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposables.fromRunnable(new QueueRemove(timedRunnable));
        }

        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = TestScheduler.this.time + timeUnit.toNanos(j);
            TestScheduler testScheduler = TestScheduler.this;
            long j2 = testScheduler.counter;
            testScheduler.counter = 1 + j2;
            TimedRunnable timedRunnable = new TimedRunnable(this, nanos, runnable, j2);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposables.fromRunnable(new QueueRemove(timedRunnable));
        }
    }

    static final class TimedRunnable implements Comparable<TimedRunnable> {
        final long count;
        final Runnable run;
        final TestWorker scheduler;
        final long time;

        public final String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", new Object[]{Long.valueOf(this.time), this.run.toString()});
        }

        public final int compareTo(TimedRunnable timedRunnable) {
            if (this.time == timedRunnable.time) {
                return ObjectHelper.compare(this.count, timedRunnable.count);
            }
            return ObjectHelper.compare(this.time, timedRunnable.time);
        }

        TimedRunnable(TestWorker testWorker, long j, Runnable runnable, long j2) {
            this.time = j;
            this.run = runnable;
            this.scheduler = testWorker;
            this.count = j2;
        }
    }

    @NonNull
    public final Scheduler.Worker createWorker() {
        return new TestWorker();
    }

    public final void triggerActions() {
        triggerActions(this.time);
    }

    public TestScheduler() {
    }

    public final long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.time, TimeUnit.NANOSECONDS);
    }

    private void triggerActions(long j) {
        long j2;
        while (true) {
            TimedRunnable peek = this.queue.peek();
            if (peek == null || peek.time > j) {
                this.time = j;
            } else {
                if (peek.time == 0) {
                    j2 = this.time;
                } else {
                    j2 = peek.time;
                }
                this.time = j2;
                this.queue.remove(peek);
                if (!peek.scheduler.disposed) {
                    peek.run.run();
                }
            }
        }
        this.time = j;
    }

    public final void advanceTimeTo(long j, TimeUnit timeUnit) {
        triggerActions(timeUnit.toNanos(j));
    }

    public final void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.time + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public TestScheduler(long j, TimeUnit timeUnit) {
        this.time = timeUnit.toNanos(j);
    }
}
