package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class a<T> extends k<T> {

    /* renamed from: a  reason: collision with root package name */
    static final a<Object> f24398a = new a<>();
    private static final long serialVersionUID = 0;

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final boolean isPresent() {
        return false;
    }

    @NullableDecl
    public final T orNull() {
        return null;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    private a() {
    }

    private Object readResolve() {
        return f24398a;
    }

    public final Set<T> asSet() {
        return Collections.emptySet();
    }

    public final T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final k<T> or(k<? extends T> kVar) {
        return (k) m.a(kVar);
    }

    public final <V> k<V> transform(f<? super T, V> fVar) {
        m.a(fVar);
        return k.absent();
    }

    public final T or(s<? extends T> sVar) {
        return m.a(sVar.get(), (Object) "use Optional.orNull() instead of a Supplier that returns null");
    }

    public final T or(T t) {
        return m.a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }
}
