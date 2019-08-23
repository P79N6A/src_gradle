package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class j extends bn<Object> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final j f24771a = new j();
    private static final long serialVersionUID = 0;

    public final int compare(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return 0;
    }

    public final <S> bn<S> reverse() {
        return this;
    }

    public final String toString() {
        return "Ordering.allEqual()";
    }

    j() {
    }

    private Object readResolve() {
        return f24771a;
    }

    public final <E> ai<E> immutableSortedCopy(Iterable<E> iterable) {
        return ai.copyOf(iterable);
    }

    public final <E> List<E> sortedCopy(Iterable<E> iterable) {
        return az.a(iterable);
    }
}
