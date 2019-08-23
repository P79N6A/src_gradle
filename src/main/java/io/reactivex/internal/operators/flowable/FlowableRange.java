package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.a.c;

public final class FlowableRange extends Flowable<Integer> {
    final int end;
    final int start;

    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        public final void cancel() {
            this.cancelled = true;
        }

        /* access modifiers changed from: package-private */
        public abstract void fastPath();

        public final int requestFusion(int i) {
            return i & 1;
        }

        /* access modifiers changed from: package-private */
        public abstract void slowPath(long j);

        public final void clear() {
            this.index = this.end;
        }

        public final boolean isEmpty() {
            if (this.index == this.end) {
                return true;
            }
            return false;
        }

        @Nullable
        public final Integer poll() {
            int i = this.index;
            if (i == this.end) {
                return null;
            }
            this.index = i + 1;
            return Integer.valueOf(i);
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    fastPath();
                    return;
                }
                slowPath(j);
            }
        }

        BaseRangeSubscription(int i, int i2) {
            this.index = i;
            this.end = i2;
        }
    }

    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Integer> downstream;

        /* access modifiers changed from: package-private */
        public final void fastPath() {
            int i = this.end;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            int i2 = this.index;
            while (i2 != i) {
                if (!this.cancelled) {
                    conditionalSubscriber.tryOnNext(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                conditionalSubscriber.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void slowPath(long j) {
            int i = this.end;
            int i2 = this.index;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.cancelled) {
                                conditionalSubscriber.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.index = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        if (conditionalSubscriber.tryOnNext(Integer.valueOf(i2))) {
                            j3++;
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }

        RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i, int i2) {
            super(i, i2);
            this.downstream = conditionalSubscriber;
        }
    }

    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final c<? super Integer> downstream;

        /* access modifiers changed from: package-private */
        public final void fastPath() {
            int i = this.end;
            c<? super Integer> cVar = this.downstream;
            int i2 = this.index;
            while (i2 != i) {
                if (!this.cancelled) {
                    cVar.onNext(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                cVar.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void slowPath(long j) {
            int i = this.end;
            int i2 = this.index;
            c<? super Integer> cVar = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.cancelled) {
                                cVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.index = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        cVar.onNext(Integer.valueOf(i2));
                        j3++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }

        RangeSubscription(c<? super Integer> cVar, int i, int i2) {
            super(i, i2);
            this.downstream = cVar;
        }
    }

    public final void subscribeActual(c<? super Integer> cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            cVar.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) cVar, this.start, this.end));
        } else {
            cVar.onSubscribe(new RangeSubscription(cVar, this.start, this.end));
        }
    }

    public FlowableRange(int i, int i2) {
        this.start = i;
        this.end = i + i2;
    }
}
