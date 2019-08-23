package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

@GwtCompatible
public abstract class ch<E> extends cg<E> implements ListIterator<E> {
    protected ch() {
    }

    @Deprecated
    public final void add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(E e2) {
        throw new UnsupportedOperationException();
    }
}
