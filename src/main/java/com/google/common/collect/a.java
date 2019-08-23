package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;

@GwtCompatible
public abstract class a<E> extends ch<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f24534a;

    /* renamed from: b  reason: collision with root package name */
    private int f24535b;

    /* access modifiers changed from: protected */
    public abstract E a(int i);

    public final int nextIndex() {
        return this.f24535b;
    }

    public final boolean hasPrevious() {
        if (this.f24535b > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.f24535b - 1;
    }

    public final boolean hasNext() {
        if (this.f24535b < this.f24534a) {
            return true;
        }
        return false;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f24535b;
            this.f24535b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f24535b - 1;
            this.f24535b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    protected a(int i, int i2) {
        m.b(i2, i);
        this.f24534a = i;
        this.f24535b = i2;
    }
}
