package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bk<T> extends bn<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final bn<? super T> ordering;

    public final <S extends T> bn<S> nullsLast() {
        return this;
    }

    public final <S extends T> bn<S> nullsFirst() {
        return this.ordering.nullsFirst();
    }

    public final int hashCode() {
        return this.ordering.hashCode() ^ -921210296;
    }

    public final <S extends T> bn<S> reverse() {
        return this.ordering.reverse().nullsFirst();
    }

    public final String toString() {
        return this.ordering + ".nullsLast()";
    }

    bk(bn<? super T> bnVar) {
        this.ordering = bnVar;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bk) {
            return this.ordering.equals(((bk) obj).ordering);
        }
        return false;
    }

    public final int compare(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return this.ordering.compare(t, t2);
    }
}
