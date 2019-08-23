package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible
public final class bu extends bn<Comparable> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final bu f24713a = new bu();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private bu() {
    }

    private Object readResolve() {
        return f24713a;
    }

    public final <S extends Comparable> bn<S> reverse() {
        return bn.natural();
    }

    public final <E extends Comparable> E max(Iterable<E> iterable) {
        return (Comparable) bi.f24673a.min(iterable);
    }

    public final <E extends Comparable> E min(Iterable<E> iterable) {
        return (Comparable) bi.f24673a.max(iterable);
    }

    public final <E extends Comparable> E max(Iterator<E> it2) {
        return (Comparable) bi.f24673a.min(it2);
    }

    public final <E extends Comparable> E min(Iterator<E> it2) {
        return (Comparable) bi.f24673a.max(it2);
    }

    public final int compare(Comparable comparable, Comparable comparable2) {
        m.a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final <E extends Comparable> E max(E e2, E e3) {
        return (Comparable) bi.f24673a.min(e2, e3);
    }

    public final <E extends Comparable> E min(E e2, E e3) {
        return (Comparable) bi.f24673a.max(e2, e3);
    }

    public final <E extends Comparable> E max(E e2, E e3, E e4, E... eArr) {
        return (Comparable) bi.f24673a.min(e2, e3, e4, eArr);
    }

    public final <E extends Comparable> E min(E e2, E e3, E e4, E... eArr) {
        return (Comparable) bi.f24673a.max(e2, e3, e4, eArr);
    }
}
