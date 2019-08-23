package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.a.c;

public final class FlowableRangeLong extends Flowable<Long> {
    final long end;
    final long start;

    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final long end;
        long index;

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
        public final Long poll() {
            long j = this.index;
            if (j == this.end) {
                return null;
            }
            this.index = 1 + j;
            return Long.valueOf(j);
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

        BaseRangeSubscription(long j, long j2) {
            this.index = j;
            this.end = j2;
        }
    }

    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Long> downstream;

        /* access modifiers changed from: package-private */
        public final void fastPath() {
            long j = this.end;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            long j2 = this.index;
            while (j2 != j) {
                if (!this.cancelled) {
                    conditionalSubscriber.tryOnNext(Long.valueOf(j2));
                    j2++;
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
            long j2 = this.end;
            long j3 = this.index;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            long j4 = j3;
            long j5 = j;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 == j5 || j4 == j2) {
                        if (j4 == j2) {
                            if (!this.cancelled) {
                                conditionalSubscriber.onComplete();
                            }
                            return;
                        }
                        j5 = get();
                        if (j6 == j5) {
                            this.index = j4;
                            j5 = addAndGet(-j6);
                        }
                    } else if (!this.cancelled) {
                        if (conditionalSubscriber.tryOnNext(Long.valueOf(j4))) {
                            j6++;
                        }
                        j4++;
                    } else {
                        return;
                    }
                }
            } while (j5 != 0);
        }

        RangeConditionalSubscription(ConditionalSubscriber<? super Long> conditionalSubscriber, long j, long j2) {
            super(j, j2);
            this.downstream = conditionalSubscriber;
        }
    }

    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final c<? super Long> downstream;

        /* access modifiers changed from: package-private */
        public final void fastPath() {
            long j = this.end;
            c<? super Long> cVar = this.downstream;
            long j2 = this.index;
            while (j2 != j) {
                if (!this.cancelled) {
                    cVar.onNext(Long.valueOf(j2));
                    j2++;
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
            long j2 = this.end;
            long j3 = this.index;
            c<? super Long> cVar = this.downstream;
            long j4 = j3;
            long j5 = j;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 == j5 || j4 == j2) {
                        if (j4 == j2) {
                            if (!this.cancelled) {
                                cVar.onComplete();
                            }
                            return;
                        }
                        j5 = get();
                        if (j6 == j5) {
                            this.index = j4;
                            j5 = addAndGet(-j6);
                        }
                    } else if (!this.cancelled) {
                        cVar.onNext(Long.valueOf(j4));
                        j6++;
                        j4++;
                    } else {
                        return;
                    }
                }
            } while (j5 != 0);
        }

        RangeSubscription(c<? super Long> cVar, long j, long j2) {
            super(j, j2);
            this.downstream = cVar;
        }
    }

    public final void subscribeActual(c<? super Long> cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            RangeConditionalSubscription rangeConditionalSubscription = new RangeConditionalSubscription((ConditionalSubscriber) cVar, this.start, this.end);
            cVar.onSubscribe(rangeConditionalSubscription);
            return;
        }
        RangeSubscription rangeSubscription = new RangeSubscription(cVar, this.start, this.end);
        cVar.onSubscribe(rangeSubscription);
    }

    public FlowableRangeLong(long j, long j2) {
        this.start = j;
        this.end = j + j2;
    }
}
