package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {
    final Function<? super TLeft, ? extends b<TLeftEnd>> leftEnd;
    final b<? extends TRight> other;
    final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> resultSelector;
    final Function<? super TRight, ? extends b<TRightEnd>> rightEnd;

    static final class GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements JoinSupport, d {
        static final Integer LEFT_CLOSE = 3;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_CLOSE = 4;
        static final Integer RIGHT_VALUE = 2;
        private static final long serialVersionUID = -6071216598687999801L;
        final AtomicInteger active;
        volatile boolean cancelled;
        final CompositeDisposable disposables = new CompositeDisposable();
        final c<? super R> downstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final Function<? super TLeft, ? extends b<TLeftEnd>> leftEnd;
        int leftIndex;
        final Map<Integer, UnicastProcessor<TRight>> lefts = new LinkedHashMap();
        final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        final AtomicLong requested = new AtomicLong();
        final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> resultSelector;
        final Function<? super TRight, ? extends b<TRightEnd>> rightEnd;
        int rightIndex;
        final Map<Integer, TRight> rights = new LinkedHashMap();

        /* access modifiers changed from: package-private */
        public final void cancelAll() {
            this.disposables.dispose();
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                c<? super R> cVar = this.downstream;
                int i = 1;
                while (!this.cancelled) {
                    if (this.error.get() != null) {
                        spscLinkedArrayQueue.clear();
                        cancelAll();
                        errorAll(cVar);
                        return;
                    }
                    if (this.active.get() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer num = (Integer) spscLinkedArrayQueue.poll();
                    if (num == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z && z2) {
                        for (UnicastProcessor<TRight> onComplete : this.lefts.values()) {
                            onComplete.onComplete();
                        }
                        this.lefts.clear();
                        this.rights.clear();
                        this.disposables.dispose();
                        cVar.onComplete();
                        return;
                    } else if (!z2) {
                        Object poll = spscLinkedArrayQueue.poll();
                        if (num == LEFT_VALUE) {
                            UnicastProcessor create = UnicastProcessor.create();
                            int i2 = this.leftIndex;
                            this.leftIndex = i2 + 1;
                            this.lefts.put(Integer.valueOf(i2), create);
                            try {
                                b bVar = (b) ObjectHelper.requireNonNull(this.leftEnd.apply(poll), "The leftEnd returned a null Publisher");
                                LeftRightEndSubscriber leftRightEndSubscriber = new LeftRightEndSubscriber(this, true, i2);
                                this.disposables.add(leftRightEndSubscriber);
                                bVar.subscribe(leftRightEndSubscriber);
                                if (this.error.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    cancelAll();
                                    errorAll(cVar);
                                    return;
                                }
                                try {
                                    Object requireNonNull = ObjectHelper.requireNonNull(this.resultSelector.apply(poll, create), "The resultSelector returned a null value");
                                    if (this.requested.get() != 0) {
                                        cVar.onNext(requireNonNull);
                                        BackpressureHelper.produced(this.requested, 1);
                                        for (TRight onNext : this.rights.values()) {
                                            create.onNext(onNext);
                                        }
                                    } else {
                                        fail(new MissingBackpressureException("Could not emit value due to lack of requests"), cVar, spscLinkedArrayQueue);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    fail(th, cVar, spscLinkedArrayQueue);
                                    return;
                                }
                            } catch (Throwable th2) {
                                fail(th2, cVar, spscLinkedArrayQueue);
                                return;
                            }
                        } else if (num == RIGHT_VALUE) {
                            int i3 = this.rightIndex;
                            this.rightIndex = i3 + 1;
                            this.rights.put(Integer.valueOf(i3), poll);
                            try {
                                b bVar2 = (b) ObjectHelper.requireNonNull(this.rightEnd.apply(poll), "The rightEnd returned a null Publisher");
                                LeftRightEndSubscriber leftRightEndSubscriber2 = new LeftRightEndSubscriber(this, false, i3);
                                this.disposables.add(leftRightEndSubscriber2);
                                bVar2.subscribe(leftRightEndSubscriber2);
                                if (this.error.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    cancelAll();
                                    errorAll(cVar);
                                    return;
                                }
                                for (UnicastProcessor<TRight> onNext2 : this.lefts.values()) {
                                    onNext2.onNext(poll);
                                }
                            } catch (Throwable th3) {
                                fail(th3, cVar, spscLinkedArrayQueue);
                                return;
                            }
                        } else if (num == LEFT_CLOSE) {
                            LeftRightEndSubscriber leftRightEndSubscriber3 = (LeftRightEndSubscriber) poll;
                            UnicastProcessor remove = this.lefts.remove(Integer.valueOf(leftRightEndSubscriber3.index));
                            this.disposables.remove(leftRightEndSubscriber3);
                            if (remove != null) {
                                remove.onComplete();
                            }
                        } else if (num == RIGHT_CLOSE) {
                            LeftRightEndSubscriber leftRightEndSubscriber4 = (LeftRightEndSubscriber) poll;
                            this.rights.remove(Integer.valueOf(leftRightEndSubscriber4.index));
                            this.disposables.remove(leftRightEndSubscriber4);
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
            }
        }

        public final void innerCloseError(Throwable th) {
            if (ExceptionHelper.addThrowable(this.error, th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public final void innerComplete(LeftRightSubscriber leftRightSubscriber) {
            this.disposables.delete(leftRightSubscriber);
            this.active.decrementAndGet();
            drain();
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
            }
        }

        public final void innerError(Throwable th) {
            if (ExceptionHelper.addThrowable(this.error, th)) {
                this.active.decrementAndGet();
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public final void errorAll(c<?> cVar) {
            Throwable terminate = ExceptionHelper.terminate(this.error);
            for (UnicastProcessor<TRight> onError : this.lefts.values()) {
                onError.onError(terminate);
            }
            this.lefts.clear();
            this.rights.clear();
            cVar.onError(terminate);
        }

        public final void innerClose(boolean z, LeftRightEndSubscriber leftRightEndSubscriber) {
            Integer num;
            synchronized (this) {
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                if (z) {
                    num = LEFT_CLOSE;
                } else {
                    num = RIGHT_CLOSE;
                }
                spscLinkedArrayQueue.offer(num, leftRightEndSubscriber);
            }
            drain();
        }

        public final void innerValue(boolean z, Object obj) {
            Integer num;
            synchronized (this) {
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                if (z) {
                    num = LEFT_VALUE;
                } else {
                    num = RIGHT_VALUE;
                }
                spscLinkedArrayQueue.offer(num, obj);
            }
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void fail(Throwable th, c<?> cVar, SimpleQueue<?> simpleQueue) {
            Exceptions.throwIfFatal(th);
            ExceptionHelper.addThrowable(this.error, th);
            simpleQueue.clear();
            cancelAll();
            errorAll(cVar);
        }

        GroupJoinSubscription(c<? super R> cVar, Function<? super TLeft, ? extends b<TLeftEnd>> function, Function<? super TRight, ? extends b<TRightEnd>> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
            this.downstream = cVar;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
            this.active = new AtomicInteger(2);
        }
    }

    interface JoinSupport {
        void innerClose(boolean z, LeftRightEndSubscriber leftRightEndSubscriber);

        void innerCloseError(Throwable th);

        void innerComplete(LeftRightSubscriber leftRightSubscriber);

        void innerError(Throwable th);

        void innerValue(boolean z, Object obj);
    }

    static final class LeftRightEndSubscriber extends AtomicReference<d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final JoinSupport parent;

        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public final void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }

        public final boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onError(Throwable th) {
            this.parent.innerCloseError(th);
        }

        public final void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }

        LeftRightEndSubscriber(JoinSupport joinSupport, boolean z, int i) {
            this.parent = joinSupport;
            this.isLeft = z;
            this.index = i;
        }
    }

    static final class LeftRightSubscriber extends AtomicReference<d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final JoinSupport parent;

        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public final void onComplete() {
            this.parent.innerComplete(this);
        }

        public final boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onError(Throwable th) {
            this.parent.innerError(th);
        }

        public final void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }

        LeftRightSubscriber(JoinSupport joinSupport, boolean z) {
            this.parent = joinSupport;
            this.isLeft = z;
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        GroupJoinSubscription groupJoinSubscription = new GroupJoinSubscription(cVar, this.leftEnd, this.rightEnd, this.resultSelector);
        cVar.onSubscribe(groupJoinSubscription);
        LeftRightSubscriber leftRightSubscriber = new LeftRightSubscriber(groupJoinSubscription, true);
        groupJoinSubscription.disposables.add(leftRightSubscriber);
        LeftRightSubscriber leftRightSubscriber2 = new LeftRightSubscriber(groupJoinSubscription, false);
        groupJoinSubscription.disposables.add(leftRightSubscriber2);
        this.source.subscribe((FlowableSubscriber<? super T>) leftRightSubscriber);
        this.other.subscribe(leftRightSubscriber2);
    }

    public FlowableGroupJoin(Flowable<TLeft> flowable, b<? extends TRight> bVar, Function<? super TLeft, ? extends b<TLeftEnd>> function, Function<? super TRight, ? extends b<TRightEnd>> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
        super(flowable);
        this.other = bVar;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }
}
