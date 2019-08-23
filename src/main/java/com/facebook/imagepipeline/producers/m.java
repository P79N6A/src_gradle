package com.facebook.imagepipeline.producers;

public abstract class m<I, O> extends b<I> {
    public final Consumer<O> mConsumer;

    /* access modifiers changed from: protected */
    public void onCancellationImpl() {
        this.mConsumer.onCancellation();
    }

    public m(Consumer<O> consumer) {
        this.mConsumer = consumer;
    }

    /* access modifiers changed from: protected */
    public void onFailureImpl(Throwable th) {
        this.mConsumer.onFailure(th);
    }

    /* access modifiers changed from: protected */
    public void onProgressUpdateImpl(float f2) {
        this.mConsumer.onProgressUpdate(f2);
    }
}
