package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public final class InnerQueuedSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final InnerQueuedSubscriberSupport<T> parent;
    final int prefetch;
    long produced;
    volatile SimpleQueue<T> queue;

    public final void setDone() {
        this.done = true;
    }

    public final void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public final boolean isDone() {
        return this.done;
    }

    public final SimpleQueue<T> queue() {
        return this.queue;
    }

    public final void onComplete() {
        this.parent.innerComplete(this);
    }

    public final void requestOne() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j == ((long) this.limit)) {
                this.produced = 0;
                ((d) get()).request(j);
                return;
            }
            this.produced = j;
        }
    }

    public final void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    public final void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    public final void request(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 >= ((long) this.limit)) {
                this.produced = 0;
                ((d) get()).request(j2);
                return;
            }
            this.produced = j2;
        }
    }

    public final void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            if (dVar instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) dVar;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    QueueDrainHelper.request(dVar, this.prefetch);
                    return;
                }
            }
            this.queue = QueueDrainHelper.createQueue(this.prefetch);
            QueueDrainHelper.request(dVar, this.prefetch);
        }
    }

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i) {
        this.parent = innerQueuedSubscriberSupport;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }
}
