package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class p<T> extends k<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    public final boolean isPresent() {
        return true;
    }

    public final T get() {
        return this.reference;
    }

    public final T orNull() {
        return this.reference;
    }

    public final Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.reference + ")";
    }

    public final k<T> or(k<? extends T> kVar) {
        m.a(kVar);
        return this;
    }

    p(T t) {
        this.reference = t;
    }

    public final T or(s<? extends T> sVar) {
        m.a(sVar);
        return this.reference;
    }

    public final T or(T t) {
        m.a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof p) {
            return this.reference.equals(((p) obj).reference);
        }
        return false;
    }

    public final <V> k<V> transform(f<? super T, V> fVar) {
        return new p(m.a(fVar.apply(this.reference), (Object) "the Function passed to Optional.transform() must not return null."));
    }
}
