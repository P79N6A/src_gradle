package com.facebook.imagepipeline.producers;

public final class au<T> implements al<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final al<T> f24096a;

    public au(al<T> alVar) {
        this.f24096a = alVar;
    }

    public final void produceResults(Consumer<Void> consumer, am amVar) {
        this.f24096a.produceResults(new m<T, Void>(consumer) {
            /* access modifiers changed from: protected */
            public final void onNewResultImpl(T t, int i) {
                if (isLast(i)) {
                    this.mConsumer.onNewResult(null, i);
                }
            }
        }, amVar);
    }
}
