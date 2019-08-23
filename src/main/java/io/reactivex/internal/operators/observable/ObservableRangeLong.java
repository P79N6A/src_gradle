package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

public final class ObservableRangeLong extends Observable<Long> {
    private final long count;
    private final long start;

    static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final Observer<? super Long> downstream;
        final long end;
        boolean fused;
        long index;

        public final void dispose() {
            set(1);
        }

        public final void clear() {
            this.index = this.end;
            lazySet(1);
        }

        public final boolean isDisposed() {
            if (get() != 0) {
                return true;
            }
            return false;
        }

        public final boolean isEmpty() {
            if (this.index == this.end) {
                return true;
            }
            return false;
        }

        @Nullable
        public final Long poll() throws Exception {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }

        /* access modifiers changed from: package-private */
        public final void run() {
            if (!this.fused) {
                Observer<? super Long> observer = this.downstream;
                long j = this.end;
                for (long j2 = this.index; j2 != j && get() == 0; j2++) {
                    observer.onNext(Long.valueOf(j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    observer.onComplete();
                }
            }
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        RangeDisposable(Observer<? super Long> observer, long j, long j2) {
            this.downstream = observer;
            this.index = j;
            this.end = j2;
        }
    }

    public final void subscribeActual(Observer<? super Long> observer) {
        Observer<? super Long> observer2 = observer;
        RangeDisposable rangeDisposable = new RangeDisposable(observer2, this.start, this.count + this.start);
        observer.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }

    public ObservableRangeLong(long j, long j2) {
        this.start = j;
        this.count = j2;
    }
}
