package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DefaultObserver;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class BlockingObservableMostRecent<T> implements Iterable<T> {
    final T initialValue;
    final ObservableSource<T> source;

    static final class MostRecentObserver<T> extends DefaultObserver<T> {
        volatile Object value;

        final class Iterator implements java.util.Iterator<T> {
            private Object buf;

            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }

            public final boolean hasNext() {
                this.buf = MostRecentObserver.this.value;
                if (!NotificationLite.isComplete(this.buf)) {
                    return true;
                }
                return false;
            }

            public final T next() {
                Object obj = null;
                try {
                    if (this.buf == null) {
                        obj = MostRecentObserver.this.value;
                    }
                    if (NotificationLite.isComplete(this.buf)) {
                        throw new NoSuchElementException();
                    } else if (!NotificationLite.isError(this.buf)) {
                        T value = NotificationLite.getValue(this.buf);
                        this.buf = obj;
                        return value;
                    } else {
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.buf));
                    }
                } finally {
                    this.buf = obj;
                }
            }

            Iterator() {
            }
        }

        public final Iterator getIterable() {
            return new Iterator<>();
        }

        public final void onComplete() {
            this.value = NotificationLite.complete();
        }

        public final void onError(Throwable th) {
            this.value = NotificationLite.error(th);
        }

        public final void onNext(T t) {
            this.value = NotificationLite.next(t);
        }

        MostRecentObserver(T t) {
            this.value = NotificationLite.next(t);
        }
    }

    public final Iterator<T> iterator() {
        MostRecentObserver mostRecentObserver = new MostRecentObserver(this.initialValue);
        this.source.subscribe(mostRecentObserver);
        return mostRecentObserver.getIterable();
    }

    public BlockingObservableMostRecent(ObservableSource<T> observableSource, T t) {
        this.source = observableSource;
        this.initialValue = t;
    }
}