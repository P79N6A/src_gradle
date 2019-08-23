package com.bytedance.jedi.model.guava.c;

import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import com.bytedance.jedi.model.guava.annotations.NullableDecl;
import java.util.Iterator;
import java.util.NoSuchElementException;

@GwtCompatible
public abstract class a<T> implements Iterator<T> {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    private T f21700a;

    /* access modifiers changed from: protected */
    @NullableDecl
    public abstract T a(T t);

    public final boolean hasNext() {
        if (this.f21700a != null) {
            return true;
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.f21700a;
            } finally {
                this.f21700a = a(this.f21700a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    protected a(@NullableDecl T t) {
        this.f21700a = t;
    }
}
