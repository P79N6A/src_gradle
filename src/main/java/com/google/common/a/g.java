package com.google.common.a;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
@Beta
public final class g<F, T> extends d<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final f<F, ? extends T> function;
    private final d<T> resultEquivalence;

    public final int hashCode() {
        return j.a(this.function, this.resultEquivalence);
    }

    public final String toString() {
        return this.resultEquivalence + ".onResultOf(" + this.function + ")";
    }

    /* access modifiers changed from: protected */
    public final int a(F f2) {
        return this.resultEquivalence.hash(this.function.apply(f2));
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.function.equals(gVar.function) || !this.resultEquivalence.equals(gVar.resultEquivalence)) {
            return false;
        }
        return true;
    }

    g(f<F, ? extends T> fVar, d<T> dVar) {
        this.function = (f) m.a(fVar);
        this.resultEquivalence = (d) m.a(dVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(F f2, F f3) {
        return this.resultEquivalence.equivalent(this.function.apply(f2), this.function.apply(f3));
    }
}
