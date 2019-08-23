package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;

@GwtCompatible
public abstract class cd<F, T> implements Iterator<T> {

    /* renamed from: b  reason: collision with root package name */
    final Iterator<? extends F> f24722b;

    /* access modifiers changed from: package-private */
    public abstract T a(F f2);

    public final boolean hasNext() {
        return this.f24722b.hasNext();
    }

    public final void remove() {
        this.f24722b.remove();
    }

    public final T next() {
        return a(this.f24722b.next());
    }

    cd(Iterator<? extends F> it2) {
        this.f24722b = (Iterator) m.a(it2);
    }
}
