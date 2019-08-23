package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@GwtCompatible
public final class r<T> extends bn<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T>[] comparators;

    public final int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public final String toString() {
        return "Ordering.compound(" + Arrays.toString(this.comparators) + ")";
    }

    r(Iterable<? extends Comparator<? super T>> iterable) {
        this.comparators = (Comparator[]) av.a(iterable, (T[]) new Comparator[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return Arrays.equals(this.comparators, ((r) obj).comparators);
        }
        return false;
    }

    r(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.comparators = (Comparator[]) new Comparator[]{comparator, comparator2};
    }

    public final int compare(T t, T t2) {
        for (Comparator<? super T> compare : this.comparators) {
            int compare2 = compare.compare(t, t2);
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }
}
