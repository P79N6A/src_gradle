package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class b<T> extends cg<T> {

    /* renamed from: a  reason: collision with root package name */
    private a f24611a = a.NOT_READY;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    private T f24612b;

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

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    public final T b() {
        this.f24611a = a.DONE;
        return null;
    }

    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f24611a = a.NOT_READY;
            T t = this.f24612b;
            this.f24612b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    public final boolean hasNext() {
        boolean z;
        if (this.f24611a != a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        m.b(z);
        switch (this.f24611a) {
            case DONE:
                return false;
            case READY:
                return true;
            default:
                this.f24611a = a.FAILED;
                this.f24612b = a();
                if (this.f24611a == a.DONE) {
                    return false;
                }
                this.f24611a = a.READY;
                return true;
        }
    }
}
