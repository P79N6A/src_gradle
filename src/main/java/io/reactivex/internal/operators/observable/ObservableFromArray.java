package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

public final class ObservableFromArray<T> extends Observable<T> {
    final T[] array;

    static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {
        final T[] array;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        boolean fusionMode;
        int index;

        public final void dispose() {
            this.disposed = true;
        }

        public final boolean isDisposed() {
            return this.disposed;
        }

        public final void clear() {
            this.index = this.array.length;
        }

        public final boolean isEmpty() {
            if (this.index == this.array.length) {
                return true;
            }
            return false;
        }

        @Nullable
        public final T poll() {
            int i = this.index;
            T[] tArr = this.array;
            if (i == tArr.length) {
                return null;
            }
            this.index = i + 1;
            return ObjectHelper.requireNonNull(tArr[i], "The array element is null");
        }

        /* access modifiers changed from: package-private */
        public final void run() {
            T[] tArr = this.array;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    Observer<? super T> observer = this.downstream;
                    observer.onError(new NullPointerException("The " + i + "th element is null"));
                    return;
                }
                this.downstream.onNext(t);
            }
            if (!isDisposed()) {
                this.downstream.onComplete();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fusionMode = true;
            return 1;
        }

        FromArrayDisposable(Observer<? super T> observer, T[] tArr) {
            this.downstream = observer;
            this.array = tArr;
        }
    }

    public ObservableFromArray(T[] tArr) {
        this.array = tArr;
    }

    public final void subscribeActual(Observer<? super T> observer) {
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, this.array);
        observer.onSubscribe(fromArrayDisposable);
        if (!fromArrayDisposable.fusionMode) {
            fromArrayDisposable.run();
        }
    }
}
