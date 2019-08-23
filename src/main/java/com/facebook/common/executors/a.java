package com.facebook.common.executors;

import com.facebook.common.logging.FLog;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class a extends AbstractExecutorService {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f23511a = a.class;

    /* renamed from: b  reason: collision with root package name */
    public final String f23512b;

    /* renamed from: c  reason: collision with root package name */
    public final BlockingQueue<Runnable> f23513c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f23514d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f23515e;

    /* renamed from: f  reason: collision with root package name */
    private volatile int f23516f = 1;
    private final C0256a g;
    private final AtomicInteger h;

    /* renamed from: com.facebook.common.executors.a$a  reason: collision with other inner class name */
    class C0256a implements Runnable {
        public final void run() {
            AtomicInteger atomicInteger;
            boolean isEmpty;
            try {
                Runnable runnable = (Runnable) a.this.f23513c.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    FLog.v(a.f23511a, "%s: Worker has nothing to run", (Object) a.this.f23512b);
                }
                if (isEmpty) {
                    FLog.v(a.f23511a, "%s: worker finished; %d workers left", (Object) a.this.f23512b, (Object) Integer.valueOf(atomicInteger.decrementAndGet()));
                }
            } finally {
                int decrementAndGet = a.this.f23514d.decrementAndGet();
                if (!a.this.f23513c.isEmpty()) {
                    a.this.a();
                } else {
                    FLog.v(a.f23511a, "%s: worker finished; %d workers left", (Object) a.this.f23512b, (Object) Integer.valueOf(decrementAndGet));
                }
            }
        }

        private C0256a() {
        }

        /* synthetic */ C0256a(a aVar, byte b2) {
            this();
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final void a() {
        int i = this.f23514d.get();
        while (i < this.f23516f) {
            int i2 = i + 1;
            if (this.f23514d.compareAndSet(i, i2)) {
                FLog.v(f23511a, "%s: starting worker %d of %d", (Object) this.f23512b, (Object) Integer.valueOf(i2), (Object) Integer.valueOf(this.f23516f));
                this.f23515e.execute(this.g);
                return;
            }
            FLog.v(f23511a, "%s: race in startWorkerIfNeeded; retrying", (Object) this.f23512b);
            i = this.f23514d.get();
        }
    }

    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        } else if (this.f23513c.offer(runnable)) {
            int size = this.f23513c.size();
            int i = this.h.get();
            if (size > i && this.h.compareAndSet(i, size)) {
                FLog.v(f23511a, "%s: max pending work in queue = %d", (Object) this.f23512b, (Object) Integer.valueOf(size));
            }
            a();
        } else {
            throw new RejectedExecutionException(this.f23512b + " queue is full, size=" + this.f23513c.size());
        }
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public a(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        this.f23512b = str;
        this.f23515e = executor;
        this.f23513c = blockingQueue;
        this.g = new C0256a(this, (byte) 0);
        this.f23514d = new AtomicInteger(0);
        this.h = new AtomicInteger(0);
    }
}
