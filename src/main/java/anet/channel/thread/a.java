package anet.channel.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class a extends ThreadPoolExecutor {

    /* renamed from: anet.channel.thread.a$a  reason: collision with other inner class name */
    class C0001a<V> extends FutureTask<V> implements Comparable<C0001a<V>> {

        /* renamed from: b  reason: collision with root package name */
        private Object f1432b;

        /* renamed from: a */
        public int compareTo(C0001a<V> aVar) {
            if (this == aVar) {
                return 0;
            }
            if (aVar == null) {
                return -1;
            }
            if (this.f1432b == null || aVar.f1432b == null || !this.f1432b.getClass().equals(aVar.f1432b.getClass()) || !(this.f1432b instanceof Comparable)) {
                return 0;
            }
            return ((Comparable) this.f1432b).compareTo(aVar.f1432b);
        }

        public C0001a(Callable<V> callable) {
            super(callable);
            this.f1432b = callable;
        }

        public C0001a(Runnable runnable, V v) {
            super(runnable, v);
            this.f1432b = runnable;
        }
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C0001a(callable);
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C0001a(runnable, t);
    }

    public a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }
}
