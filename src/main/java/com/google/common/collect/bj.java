package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bj<T> extends bn<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final bn<? super T> ordering;

    public final <S extends T> bn<S> nullsFirst() {
        return this;
    }

    public final <S extends T> bn<S> nullsLast() {
        return this.ordering.nullsLast();
    }

    public final int hashCode() {
        return this.ordering.hashCode() ^ 957692532;
    }

    public final <S extends T> bn<S> reverse() {
        return this.ordering.reverse().nullsLast();
    }

    public final String toString() {
        return this.ordering + ".nullsFirst()";
    }

    bj(bn<? super T> bnVar) {
        this.ordering = bnVar;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bj) {
            return this.ordering.equals(((bj) obj).ordering);
        }
        return false;
    }

    public final int compare(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.ordering.compare(t, t2);
    }
}
