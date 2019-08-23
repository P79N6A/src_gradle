package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;
import org.a.b;
import org.a.c;

public final class FlowableTakePublisher<T> extends Flowable<T> {
    final long limit;
    final b<T> source;

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(cVar, this.limit));
    }

    public FlowableTakePublisher(b<T> bVar, long j) {
        this.source = bVar;
        this.limit = j;
    }
}
