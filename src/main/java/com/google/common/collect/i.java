package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class i<T> extends cg<T> {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    private T f24770a;

    /* access modifiers changed from: protected */
    public abstract T a(T t);

    public final boolean hasNext() {
        if (this.f24770a != null) {
            return true;
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.f24770a;
            } finally {
                this.f24770a = a(this.f24770a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    protected i(@NullableDecl T t) {
        this.f24770a = t;
    }
}
