package com.google.common.a;

import com.google.common.a.b;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class k<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract Set<T> asSet();

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract k<T> or(k<? extends T> kVar);

    @Beta
    public abstract T or(s<? extends T> sVar);

    public abstract T or(T t);

    @NullableDecl
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> k<V> transform(f<? super T, V> fVar);

    k() {
    }

    public static <T> k<T> absent() {
        return a.f24398a;
    }

    public static <T> k<T> fromNullable(@NullableDecl T t) {
        if (t == null) {
            return absent();
        }
        return new p(t);
    }

    public static <T> k<T> of(T t) {
        return new p(m.a(t));
    }

    @Beta
    public static <T> Iterable<T> presentInstances(final Iterable<? extends k<? extends T>> iterable) {
        m.a(iterable);
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return new b<T>() {

                    /* renamed from: c  reason: collision with root package name */
                    private final Iterator<? extends k<? extends T>> f24414c = ((Iterator) m.a(iterable.iterator()));

                    /* access modifiers changed from: protected */
                    public final T a() {
                        while (this.f24414c.hasNext()) {
                            k kVar = (k) this.f24414c.next();
                            if (kVar.isPresent()) {
                                return kVar.get();
                            }
                        }
                        this.f24399a = b.a.DONE;
                        return null;
                    }
                };
            }
        };
    }
}
