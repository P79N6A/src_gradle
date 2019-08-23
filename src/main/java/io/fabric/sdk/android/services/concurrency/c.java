package io.fabric.sdk.android.services.concurrency;

import io.fabric.sdk.android.services.concurrency.b;
import io.fabric.sdk.android.services.concurrency.h;
import io.fabric.sdk.android.services.concurrency.k;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public final class c<E extends b & k & h> extends PriorityBlockingQueue<E> {
    final Queue<E> blockedQueue = new LinkedList();
    private final ReentrantLock lock = new ReentrantLock();

    public final E peek() {
        try {
            return b(1, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final E poll() {
        try {
            return b(2, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final E take() throws InterruptedException {
        return b(0, null, null);
    }

    public final void clear() {
        try {
            this.lock.lock();
            this.blockedQueue.clear();
            super.clear();
        } finally {
            this.lock.unlock();
        }
    }

    public final int size() {
        try {
            this.lock.lock();
            return this.blockedQueue.size() + super.size();
        } finally {
            this.lock.unlock();
        }
    }

    public final Object[] toArray() {
        try {
            this.lock.lock();
            return a((T[]) super.toArray(), (T[]) this.blockedQueue.toArray());
        } finally {
            this.lock.unlock();
        }
    }

    public final void recycleBlockedQueue() {
        try {
            this.lock.lock();
            Iterator it2 = this.blockedQueue.iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (a(bVar)) {
                    super.offer(bVar);
                    it2.remove();
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    private static boolean a(E e2) {
        return e2.areDependenciesMet();
    }

    public final boolean removeAll(Collection<?> collection) {
        try {
            this.lock.lock();
            return this.blockedQueue.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.lock.unlock();
        }
    }

    public final boolean contains(Object obj) {
        boolean z;
        try {
            this.lock.lock();
            if (super.contains(obj) || this.blockedQueue.contains(obj)) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.lock.unlock();
        }
    }

    public final int drainTo(Collection<? super E> collection) {
        try {
            this.lock.lock();
            int drainTo = super.drainTo(collection) + this.blockedQueue.size();
            while (!this.blockedQueue.isEmpty()) {
                collection.add(this.blockedQueue.poll());
            }
            return drainTo;
        } finally {
            this.lock.unlock();
        }
    }

    public final boolean remove(Object obj) {
        boolean z;
        try {
            this.lock.lock();
            if (super.remove(obj) || this.blockedQueue.remove(obj)) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.lock.unlock();
        }
    }

    public final <T> T[] toArray(T[] tArr) {
        try {
            this.lock.lock();
            return a((T[]) super.toArray(tArr), (T[]) this.blockedQueue.toArray(tArr));
        } finally {
            this.lock.unlock();
        }
    }

    public final E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return b(3, Long.valueOf(j), timeUnit);
    }

    private boolean a(int i, E e2) {
        try {
            this.lock.lock();
            if (i == 1) {
                super.remove(e2);
            }
            boolean offer = this.blockedQueue.offer(e2);
            return offer;
        } finally {
            this.lock.unlock();
        }
    }

    private static <T> T[] a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public final int drainTo(Collection<? super E> collection, int i) {
        try {
            this.lock.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.blockedQueue.isEmpty() && drainTo <= i) {
                collection.add(this.blockedQueue.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.lock.unlock();
        }
    }

    private E b(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        E a2;
        while (true) {
            a2 = a(i, l, timeUnit);
            if (a2 == null || a(a2)) {
                return a2;
            }
            a(i, a2);
        }
        return a2;
    }

    private E a(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        E e2;
        switch (i) {
            case 0:
                e2 = (b) super.take();
                break;
            case 1:
                e2 = (b) super.peek();
                break;
            case 2:
                e2 = (b) super.poll();
                break;
            case 3:
                e2 = (b) super.poll(l.longValue(), timeUnit);
                break;
            default:
                return null;
        }
        return e2;
    }
}
