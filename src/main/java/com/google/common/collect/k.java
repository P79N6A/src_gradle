package com.google.common.collect;

import com.google.common.a.f;
import com.google.common.a.j;
import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class k<F, T> extends bn<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final f<F, ? extends T> function;
    final bn<T> ordering;

    public final int hashCode() {
        return j.a(this.function, this.ordering);
    }

    public final String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.function.equals(kVar.function) || !this.ordering.equals(kVar.ordering)) {
            return false;
        }
        return true;
    }

    k(f<F, ? extends T> fVar, bn<T> bnVar) {
        this.function = (f) m.a(fVar);
        this.ordering = (bn) m.a(bnVar);
    }

    public final int compare(F f2, F f3) {
        return this.ordering.compare(this.function.apply(f2), this.function.apply(f3));
    }
}
