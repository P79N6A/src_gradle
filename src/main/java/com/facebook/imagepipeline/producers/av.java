package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;

public final class av<T> implements al<T> {
    public final al<T> mInputProducer;
    public final aw mThreadHandoffProducerQueue;

    public av(al<T> alVar, aw awVar) {
        this.mInputProducer = (al) Preconditions.checkNotNull(alVar);
        this.mThreadHandoffProducerQueue = awVar;
    }

    public final void produceResults(Consumer<T> consumer, am amVar) {
        final ao listener = amVar.getListener();
        final String id = amVar.getId();
        final Consumer<T> consumer2 = consumer;
        final am amVar2 = amVar;
        final AnonymousClass1 r0 = new at<T>(consumer, listener, "BackgroundThreadHandoffProducer", id) {
            public final void disposeResult(T t) {
            }

            public final T getResult() throws Exception {
                return null;
            }

            public final void onSuccess(T t) {
                listener.onProducerFinishWithSuccess(id, "BackgroundThreadHandoffProducer", null);
                av.this.mInputProducer.produceResults(consumer2, amVar2);
            }
        };
        amVar.addCallbacks(new e() {
            public final void onCancellationRequested() {
                r0.cancel();
                av.this.mThreadHandoffProducerQueue.remove(r0);
            }
        });
        this.mThreadHandoffProducerQueue.addToQueueOrExecute(r0);
    }
}
