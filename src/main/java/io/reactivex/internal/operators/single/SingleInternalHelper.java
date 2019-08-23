package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import org.a.b;

public final class SingleInternalHelper {

    enum NoSuchElementCallable implements Callable<NoSuchElementException> {
        INSTANCE;

        public final NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    enum ToFlowable implements Function<SingleSource, b> {
        INSTANCE;

        public final b apply(SingleSource singleSource) {
            return new SingleToFlowable(singleSource);
        }
    }

    static final class ToFlowableIterable<T> implements Iterable<Flowable<T>> {
        private final Iterable<? extends SingleSource<? extends T>> sources;

        public final Iterator<Flowable<T>> iterator() {
            return new ToFlowableIterator(this.sources.iterator());
        }

        ToFlowableIterable(Iterable<? extends SingleSource<? extends T>> iterable) {
            this.sources = iterable;
        }
    }

    static final class ToFlowableIterator<T> implements Iterator<Flowable<T>> {
        private final Iterator<? extends SingleSource<? extends T>> sit;

        public final boolean hasNext() {
            return this.sit.hasNext();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final Flowable<T> next() {
            return new SingleToFlowable((SingleSource) this.sit.next());
        }

        ToFlowableIterator(Iterator<? extends SingleSource<? extends T>> it2) {
            this.sit = it2;
        }
    }

    enum ToObservable implements Function<SingleSource, Observable> {
        INSTANCE;

        public final Observable apply(SingleSource singleSource) {
            return new SingleToObservable(singleSource);
        }
    }

    public static <T> Callable<NoSuchElementException> emptyThrower() {
        return NoSuchElementCallable.INSTANCE;
    }

    public static <T> Function<SingleSource<? extends T>, b<? extends T>> toFlowable() {
        return ToFlowable.INSTANCE;
    }

    public static <T> Function<SingleSource<? extends T>, Observable<? extends T>> toObservable() {
        return ToObservable.INSTANCE;
    }

    private SingleInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<? extends Flowable<T>> iterableToFlowable(Iterable<? extends SingleSource<? extends T>> iterable) {
        return new ToFlowableIterable(iterable);
    }
}
