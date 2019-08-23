package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class ax<T> implements al<T> {

    /* renamed from: a  reason: collision with root package name */
    private final al<T> f24108a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24109b;
    public final Executor mExecutor;
    @GuardedBy
    public int mNumCurrentRequests = 0;
    @GuardedBy
    public final ConcurrentLinkedQueue<Pair<Consumer<T>, am>> mPendingRequests = new ConcurrentLinkedQueue<>();

    class a extends m<T, T> {
        /* access modifiers changed from: protected */
        public final void onCancellationImpl() {
            this.mConsumer.onCancellation();
            a();
        }

        private void a() {
            final Pair poll;
            synchronized (ax.this) {
                poll = ax.this.mPendingRequests.poll();
                if (poll == null) {
                    ax axVar = ax.this;
                    axVar.mNumCurrentRequests--;
                }
            }
            if (poll != null) {
                ax.this.mExecutor.execute(new Runnable() {
                    public final void run() {
                        ax.this.a((Consumer) poll.first, (am) poll.second);
                    }
                });
            }
        }

        /* access modifiers changed from: protected */
        public final void onFailureImpl(Throwable th) {
            this.mConsumer.onFailure(th);
            a();
        }

        private a(Consumer<T> consumer) {
            super(consumer);
        }

        /* access modifiers changed from: protected */
        public final void onNewResultImpl(T t, int i) {
            this.mConsumer.onNewResult(t, i);
            if (isLast(i)) {
                a();
            }
        }

        /* synthetic */ a(ax axVar, Consumer consumer, byte b2) {
            this(consumer);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Consumer<T> consumer, am amVar) {
        amVar.getListener().onProducerFinishWithSuccess(amVar.getId(), "ThrottlingProducer", null);
        this.f24108a.produceResults(new a(this, consumer, (byte) 0), amVar);
    }

    public final void produceResults(Consumer<T> consumer, am amVar) {
        boolean z;
        amVar.getListener().onProducerStart(amVar.getId(), "ThrottlingProducer");
        synchronized (this) {
            z = true;
            if (this.mNumCurrentRequests >= this.f24109b) {
                this.mPendingRequests.add(Pair.create(consumer, amVar));
            } else {
                this.mNumCurrentRequests++;
                z = false;
            }
        }
        if (!z) {
            a(consumer, amVar);
        }
    }

    public ax(int i, Executor executor, al<T> alVar) {
        this.f24109b = i;
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.f24108a = (al) Preconditions.checkNotNull(alVar);
    }
}
