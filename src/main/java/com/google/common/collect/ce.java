package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

@GwtCompatible
public abstract class ce<F, T> extends cd<F, T> implements ListIterator<T> {
    private ListIterator<? extends F> a() {
        return (ListIterator) this.f24722b;
    }

    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    public final int nextIndex() {
        return a().nextIndex();
    }

    public final T previous() {
        return a(a().previous());
    }

    public final int previousIndex() {
        return a().previousIndex();
    }

    ce(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
