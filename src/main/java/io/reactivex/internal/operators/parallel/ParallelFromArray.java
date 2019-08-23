package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import org.a.b;
import org.a.c;

public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    final b<T>[] sources;

    public final int parallelism() {
        return this.sources.length;
    }

    public ParallelFromArray(b<T>[] bVarArr) {
        this.sources = bVarArr;
    }

    public final void subscribe(c<? super T>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            for (int i = 0; i < length; i++) {
                this.sources[i].subscribe(cVarArr[i]);
            }
        }
    }
}
