package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bv<T> extends bn<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final bn<? super T> forwardOrder;

    public final <S extends T> bn<S> reverse() {
        return this.forwardOrder;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final String toString() {
        return this.forwardOrder + ".reverse()";
    }

    public final <E extends T> E max(Iterable<E> iterable) {
        return this.forwardOrder.min(iterable);
    }

    public final <E extends T> E min(Iterable<E> iterable) {
        return this.forwardOrder.max(iterable);
    }

    bv(bn<? super T> bnVar) {
        this.forwardOrder = (bn) m.a(bnVar);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bv) {
            return this.forwardOrder.equals(((bv) obj).forwardOrder);
        }
        return false;
    }

    public final <E extends T> E max(Iterator<E> it2) {
        return this.forwardOrder.min(it2);
    }

    public final <E extends T> E min(Iterator<E> it2) {
        return this.forwardOrder.max(it2);
    }

    public final int compare(T t, T t2) {
        return this.forwardOrder.compare(t2, t);
    }

    public final <E extends T> E max(E e2, E e3) {
        return this.forwardOrder.min(e2, e3);
    }

    public final <E extends T> E min(E e2, E e3) {
        return this.forwardOrder.max(e2, e3);
    }

    public final <E extends T> E max(E e2, E e3, E e4, E... eArr) {
        return this.forwardOrder.min(e2, e3, e4, eArr);
    }

    public final <E extends T> E min(E e2, E e3, E e4, E... eArr) {
        return this.forwardOrder.max(e2, e3, e4, eArr);
    }
}
