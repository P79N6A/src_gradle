package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ReplaySubject<T> extends Subject<T> {
    static final ReplayDisposable[] EMPTY = new ReplayDisposable[0];
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final ReplayDisposable[] TERMINATED = new ReplayDisposable[0];
    final ReplayBuffer<T> buffer;
    boolean done;
    final AtomicReference<ReplayDisposable<T>[]> observers = new AtomicReference<>(EMPTY);

    static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T t) {
            this.value = t;
        }
    }

    interface ReplayBuffer<T> {
        void add(T t);

        void addFinal(Object obj);

        boolean compareAndSet(Object obj, Object obj2);

        Object get();

        @Nullable
        T getValue();

        T[] getValues(T[] tArr);

        void replay(ReplayDisposable<T> replayDisposable);

        int size();

        void trimHead();
    }

    static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final Observer<? super T> downstream;
        Object index;
        final ReplaySubject<T> state;

        public final boolean isDisposed() {
            return this.cancelled;
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.remove(this);
            }
        }

        ReplayDisposable(Observer<? super T> observer, ReplaySubject<T> replaySubject) {
            this.downstream = observer;
            this.state = replaySubject;
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile boolean done;
        volatile TimedNode<Object> head;
        final long maxAge;
        final int maxSize;
        final Scheduler scheduler;
        int size;
        TimedNode<Object> tail;
        final TimeUnit unit;

        public final int size() {
            return size(getHead());
        }

        public final void trimHead() {
            TimedNode<Object> timedNode = this.head;
            if (timedNode.value != null) {
                TimedNode<Object> timedNode2 = new TimedNode<>(null, 0);
                timedNode2.lazySet(timedNode.get());
                this.head = timedNode2;
            }
        }

        /* access modifiers changed from: package-private */
        public final TimedNode<Object> getHead() {
            TimedNode<Object> timedNode;
            TimedNode<Object> timedNode2 = this.head;
            long now = this.scheduler.now(this.unit) - this.maxAge;
            Object obj = timedNode2.get();
            while (true) {
                TimedNode<Object> timedNode3 = (TimedNode) obj;
                timedNode = timedNode2;
                timedNode2 = timedNode3;
                if (timedNode2 == null || timedNode2.time > now) {
                    return timedNode;
                }
                obj = timedNode2.get();
            }
            return timedNode;
        }

        @Nullable
        public final T getValue() {
            TimedNode<Object> timedNode = this.head;
            TimedNode<Object> timedNode2 = null;
            while (true) {
                TimedNode<Object> timedNode3 = (TimedNode) timedNode.get();
                if (timedNode3 == null) {
                    break;
                }
                timedNode2 = timedNode;
                timedNode = timedNode3;
            }
            if (timedNode.time < this.scheduler.now(this.unit) - this.maxAge) {
                return null;
            }
            T t = timedNode.value;
            if (t == null) {
                return null;
            }
            if (NotificationLite.isComplete(t) || NotificationLite.isError(t)) {
                return timedNode2.value;
            }
            return t;
        }

        /* access modifiers changed from: package-private */
        public final void trim() {
            if (this.size > this.maxSize) {
                this.size--;
                this.head = (TimedNode) this.head.get();
            }
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<Object> timedNode = this.head;
            while (true) {
                TimedNode<Object> timedNode2 = (TimedNode) timedNode.get();
                if (timedNode2 == null) {
                    this.head = timedNode;
                    return;
                } else if (timedNode2.time > now) {
                    this.head = timedNode;
                    return;
                } else {
                    timedNode = timedNode2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void trimFinal() {
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<Object> timedNode = this.head;
            while (true) {
                TimedNode<Object> timedNode2 = (TimedNode) timedNode.get();
                if (timedNode2.get() == null) {
                    if (timedNode.value != null) {
                        TimedNode<Object> timedNode3 = new TimedNode<>(null, 0);
                        timedNode3.lazySet(timedNode.get());
                        this.head = timedNode3;
                        return;
                    }
                    this.head = timedNode;
                    return;
                } else if (timedNode2.time <= now) {
                    timedNode = timedNode2;
                } else if (timedNode.value != null) {
                    TimedNode<Object> timedNode4 = new TimedNode<>(null, 0);
                    timedNode4.lazySet(timedNode.get());
                    this.head = timedNode4;
                    return;
                } else {
                    this.head = timedNode;
                    return;
                }
            }
        }

        public final void add(T t) {
            TimedNode<Object> timedNode = new TimedNode<>(t, this.scheduler.now(this.unit));
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        public final void addFinal(Object obj) {
            TimedNode<Object> timedNode = new TimedNode<>(obj, Long.MAX_VALUE);
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.lazySet(timedNode);
            trimFinal();
            this.done = true;
        }

        public final T[] getValues(T[] tArr) {
            TimedNode<Object> head2 = getHead();
            int size2 = size(head2);
            if (size2 != 0) {
                if (tArr.length < size2) {
                    tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size2);
                }
                for (int i = 0; i != size2; i++) {
                    head2 = (TimedNode) head2.get();
                    tArr[i] = head2.value;
                }
                if (tArr.length > size2) {
                    tArr[size2] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        /* access modifiers changed from: package-private */
        public final int size(TimedNode<Object> timedNode) {
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                TimedNode<Object> timedNode2 = (TimedNode) timedNode.get();
                if (timedNode2 == null) {
                    T t = timedNode.value;
                    if (NotificationLite.isComplete(t) || NotificationLite.isError(t)) {
                        return i - 1;
                    }
                    return i;
                }
                i++;
                timedNode = timedNode2;
            }
            return i;
        }

        public final void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                Observer<? super T> observer = replayDisposable.downstream;
                TimedNode<Object> timedNode = (TimedNode) replayDisposable.index;
                if (timedNode == null) {
                    timedNode = getHead();
                }
                int i = 1;
                while (!replayDisposable.cancelled) {
                    while (!replayDisposable.cancelled) {
                        TimedNode<Object> timedNode2 = (TimedNode) timedNode.get();
                        if (timedNode2 != null) {
                            T t = timedNode2.value;
                            if (!this.done || timedNode2.get() != null) {
                                observer.onNext(t);
                                timedNode = timedNode2;
                            } else {
                                if (NotificationLite.isComplete(t)) {
                                    observer.onComplete();
                                } else {
                                    observer.onError(NotificationLite.getError(t));
                                }
                                replayDisposable.index = null;
                                replayDisposable.cancelled = true;
                                return;
                            }
                        } else if (timedNode.get() == null) {
                            replayDisposable.index = timedNode;
                            i = replayDisposable.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    }
                    replayDisposable.index = null;
                    return;
                }
                replayDisposable.index = null;
            }
        }

        SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, Scheduler scheduler2) {
            this.maxSize = ObjectHelper.verifyPositive(i, "maxSize");
            this.maxAge = ObjectHelper.verifyPositive(j, "maxAge");
            this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.scheduler = (Scheduler) ObjectHelper.requireNonNull(scheduler2, "scheduler is null");
            TimedNode<Object> timedNode = new TimedNode<>(null, 0);
            this.tail = timedNode;
            this.head = timedNode;
        }
    }

    static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean done;
        volatile Node<Object> head;
        final int maxSize;
        int size;
        Node<Object> tail;

        /* access modifiers changed from: package-private */
        public final void trim() {
            if (this.size > this.maxSize) {
                this.size--;
                this.head = (Node) this.head.get();
            }
        }

        public final void trimHead() {
            Node<Object> node = this.head;
            if (node.value != null) {
                Node<Object> node2 = new Node<>(null);
                node2.lazySet(node.get());
                this.head = node2;
            }
        }

        @Nullable
        public final T getValue() {
            Node<Object> node = this.head;
            Node<Object> node2 = null;
            while (true) {
                Node<Object> node3 = (Node) node.get();
                if (node3 == null) {
                    break;
                }
                node2 = node;
                node = node3;
            }
            T t = node.value;
            if (t == null) {
                return null;
            }
            if (NotificationLite.isComplete(t) || NotificationLite.isError(t)) {
                return node2.value;
            }
            return t;
        }

        public final int size() {
            Node<Object> node = this.head;
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                Node<Object> node2 = (Node) node.get();
                if (node2 == null) {
                    T t = node.value;
                    if (NotificationLite.isComplete(t) || NotificationLite.isError(t)) {
                        return i - 1;
                    }
                    return i;
                }
                i++;
                node = node2;
            }
            return i;
        }

        SizeBoundReplayBuffer(int i) {
            this.maxSize = ObjectHelper.verifyPositive(i, "maxSize");
            Node<Object> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        public final void add(T t) {
            Node<Object> node = new Node<>(t);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        public final void addFinal(Object obj) {
            Node<Object> node = new Node<>(obj);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.lazySet(node);
            trimHead();
            this.done = true;
        }

        public final T[] getValues(T[] tArr) {
            Node<Object> node = this.head;
            int size2 = size();
            if (size2 != 0) {
                if (tArr.length < size2) {
                    tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size2);
                }
                for (int i = 0; i != size2; i++) {
                    node = (Node) node.get();
                    tArr[i] = node.value;
                }
                if (tArr.length > size2) {
                    tArr[size2] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        public final void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                Observer<? super T> observer = replayDisposable.downstream;
                Node<Object> node = (Node) replayDisposable.index;
                if (node == null) {
                    node = this.head;
                }
                int i = 1;
                while (!replayDisposable.cancelled) {
                    Node<Object> node2 = (Node) node.get();
                    if (node2 != null) {
                        T t = node2.value;
                        if (!this.done || node2.get() != null) {
                            observer.onNext(t);
                            node = node2;
                        } else {
                            if (NotificationLite.isComplete(t)) {
                                observer.onComplete();
                            } else {
                                observer.onError(NotificationLite.getError(t));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                    } else if (node.get() == null) {
                        replayDisposable.index = node;
                        i = replayDisposable.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                replayDisposable.index = null;
            }
        }
    }

    static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final List<Object> buffer;
        volatile boolean done;
        volatile int size;

        public final void trimHead() {
        }

        public final int size() {
            int i = this.size;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            Object obj = this.buffer.get(i2);
            if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
                return i2;
            }
            return i;
        }

        @Nullable
        public final T getValue() {
            int i = this.size;
            if (i == 0) {
                return null;
            }
            List<Object> list = this.buffer;
            T t = list.get(i - 1);
            if (!NotificationLite.isComplete(t) && !NotificationLite.isError(t)) {
                return t;
            }
            if (i == 1) {
                return null;
            }
            return list.get(i - 2);
        }

        public final void add(T t) {
            this.buffer.add(t);
            this.size++;
        }

        UnboundedReplayBuffer(int i) {
            this.buffer = new ArrayList(ObjectHelper.verifyPositive(i, "capacityHint"));
        }

        public final void addFinal(Object obj) {
            this.buffer.add(obj);
            trimHead();
            this.size++;
            this.done = true;
        }

        public final T[] getValues(T[] tArr) {
            int i = this.size;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List list = this.buffer;
            Object obj = list.get(i - 1);
            if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
                i--;
                if (i == 0) {
                    if (tArr.length != 0) {
                        tArr[0] = null;
                    }
                    return tArr;
                }
            }
            if (tArr.length < i) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        public final void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                List<Object> list = this.buffer;
                Observer<? super T> observer = replayDisposable.downstream;
                Integer num = (Integer) replayDisposable.index;
                int i = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    replayDisposable.index = 0;
                }
                int i2 = 1;
                while (!replayDisposable.cancelled) {
                    int i3 = this.size;
                    while (i3 != i) {
                        if (replayDisposable.cancelled) {
                            replayDisposable.index = null;
                            return;
                        }
                        Object obj = list.get(i);
                        if (this.done) {
                            int i4 = i + 1;
                            if (i4 == i3) {
                                i3 = this.size;
                                if (i4 == i3) {
                                    if (NotificationLite.isComplete(obj)) {
                                        observer.onComplete();
                                    } else {
                                        observer.onError(NotificationLite.getError(obj));
                                    }
                                    replayDisposable.index = null;
                                    replayDisposable.cancelled = true;
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                        observer.onNext(obj);
                        i++;
                    }
                    if (i == this.size) {
                        replayDisposable.index = Integer.valueOf(i);
                        i2 = replayDisposable.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }
    }

    public final void cleanupBuffer() {
        this.buffer.trimHead();
    }

    @Nullable
    public final T getValue() {
        return this.buffer.getValue();
    }

    /* access modifiers changed from: package-private */
    public final int size() {
        return this.buffer.size();
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> create() {
        return new ReplaySubject<>(new UnboundedReplayBuffer(16));
    }

    static <T> ReplaySubject<T> createUnbounded() {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    public final boolean hasComplete() {
        return NotificationLite.isComplete(this.buffer.get());
    }

    public final boolean hasObservers() {
        if (((ReplayDisposable[]) this.observers.get()).length != 0) {
            return true;
        }
        return false;
    }

    public final boolean hasThrowable() {
        return NotificationLite.isError(this.buffer.get());
    }

    public final boolean hasValue() {
        if (this.buffer.size() != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int observerCount() {
        return ((ReplayDisposable[]) this.observers.get()).length;
    }

    @Nullable
    public final Throwable getThrowable() {
        Object obj = this.buffer.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    public final Object[] getValues() {
        Object[] values = getValues(EMPTY_ARRAY);
        if (values == EMPTY_ARRAY) {
            return new Object[0];
        }
        return values;
    }

    public final void onComplete() {
        if (!this.done) {
            this.done = true;
            Object complete = NotificationLite.complete();
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.addFinal(complete);
            for (ReplayDisposable replay : terminate(complete)) {
                replayBuffer.replay(replay);
            }
        }
    }

    public final T[] getValues(T[] tArr) {
        return this.buffer.getValues(tArr);
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.done) {
            disposable.dispose();
        }
    }

    ReplaySubject(ReplayBuffer<T> replayBuffer) {
        this.buffer = replayBuffer;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithSize(int i) {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(i));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> create(int i) {
        return new ReplaySubject<>(new UnboundedReplayBuffer(i));
    }

    public final void subscribeActual(Observer<? super T> observer) {
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this);
        observer.onSubscribe(replayDisposable);
        if (!replayDisposable.cancelled) {
            if (!add(replayDisposable) || !replayDisposable.cancelled) {
                this.buffer.replay(replayDisposable);
            } else {
                remove(replayDisposable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final ReplayDisposable<T>[] terminate(Object obj) {
        if (this.buffer.compareAndSet(null, obj)) {
            return (ReplayDisposable[]) this.observers.getAndSet(TERMINATED);
        }
        return TERMINATED;
    }

    /* access modifiers changed from: package-private */
    public final boolean add(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = (ReplayDisposable[]) this.observers.get();
            if (replayDisposableArr == TERMINATED) {
                return false;
            }
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new ReplayDisposable[(length + 1)];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
        } while (!this.observers.compareAndSet(replayDisposableArr, replayDisposableArr2));
        return true;
    }

    public final void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        Object error = NotificationLite.error(th);
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.addFinal(error);
        for (ReplayDisposable replay : terminate(error)) {
            replayBuffer.replay(replay);
        }
    }

    public final void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done) {
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.add(t);
            for (ReplayDisposable replay : (ReplayDisposable[]) this.observers.get()) {
                replayBuffer.replay(replay);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void remove(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = (ReplayDisposable[]) this.observers.get();
            if (replayDisposableArr != TERMINATED && replayDisposableArr != EMPTY) {
                int length = replayDisposableArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (replayDisposableArr[i2] == replayDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        replayDisposableArr2 = EMPTY;
                    } else {
                        ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[(length - 1)];
                        System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i);
                        System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr3, i, (length - i) - 1);
                        replayDisposableArr2 = replayDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.observers.compareAndSet(replayDisposableArr, replayDisposableArr2));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        SizeAndTimeBoundReplayBuffer sizeAndTimeBoundReplayBuffer = new SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j, timeUnit, scheduler);
        return new ReplaySubject<>(sizeAndTimeBoundReplayBuffer);
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithTimeAndSize(long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
        SizeAndTimeBoundReplayBuffer sizeAndTimeBoundReplayBuffer = new SizeAndTimeBoundReplayBuffer(i, j, timeUnit, scheduler);
        return new ReplaySubject<>(sizeAndTimeBoundReplayBuffer);
    }
}
