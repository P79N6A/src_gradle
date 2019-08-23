package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;

@GwtCompatible
public abstract class cg<E> implements Iterator<E> {
    protected cg() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
