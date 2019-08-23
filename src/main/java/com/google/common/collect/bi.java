package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtCompatible
public final class bi extends bn<Comparable> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final bi f24673a = new bi();
    private static final long serialVersionUID = 0;
    @MonotonicNonNullDecl

    /* renamed from: b  reason: collision with root package name */
    private transient bn<Comparable> f24674b;
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    private transient bn<Comparable> f24675c;

    public final String toString() {
        return "Ordering.natural()";
    }

    private bi() {
    }

    private Object readResolve() {
        return f24673a;
    }

    public final <S extends Comparable> bn<S> reverse() {
        return bu.f24713a;
    }

    public final <S extends Comparable> bn<S> nullsFirst() {
        bn<Comparable> bnVar = this.f24674b;
        if (bnVar != null) {
            return bnVar;
        }
        bn<Comparable> nullsFirst = super.nullsFirst();
        this.f24674b = nullsFirst;
        return nullsFirst;
    }

    public final <S extends Comparable> bn<S> nullsLast() {
        bn<Comparable> bnVar = this.f24675c;
        if (bnVar != null) {
            return bnVar;
        }
        bn<Comparable> nullsLast = super.nullsLast();
        this.f24675c = nullsLast;
        return nullsLast;
    }

    public final int compare(Comparable comparable, Comparable comparable2) {
        m.a(comparable);
        m.a(comparable2);
        return comparable.compareTo(comparable2);
    }
}
