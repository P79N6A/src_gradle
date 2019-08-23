package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import org.a.b;
import org.a.c;

public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends b<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    final b<T> source;

    public final void subscribeActual(c<? super R> cVar) {
        b<T> bVar = this.source;
        FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber concatMapEagerDelayErrorSubscriber = new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(cVar, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode);
        bVar.subscribe(concatMapEagerDelayErrorSubscriber);
    }

    public FlowableConcatMapEagerPublisher(b<T> bVar, Function<? super T, ? extends b<? extends R>> function, int i, int i2, ErrorMode errorMode2) {
        this.source = bVar;
        this.mapper = function;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode2;
    }
}
