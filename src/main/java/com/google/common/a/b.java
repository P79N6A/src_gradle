package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class b<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    a f24399a = a.NOT_READY;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    private T f24400b;

    enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    protected b() {
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final T next() {
        if (hasNext()) {
            this.f24399a = a.NOT_READY;
            T t = this.f24400b;
            this.f24400b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f24399a != a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        m.b(z);
        switch (this.f24399a) {
            case READY:
                return true;
            case DONE:
                return false;
            default:
                this.f24399a = a.FAILED;
                this.f24400b = a();
                if (this.f24399a == a.DONE) {
                    return false;
                }
                this.f24399a = a.READY;
                return true;
        }
    }
}
