package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class l<T> extends d<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;
    final d<? super T> elementEquivalence;

    public final int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public final String toString() {
        return this.elementEquivalence + ".pairwise()";
    }

    l(d<? super T> dVar) {
        this.elementEquivalence = (d) m.a(dVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ int a(Object obj) {
        int i = 78721;
        for (Object hash : (Iterable) obj) {
            i = (i * 24943) + this.elementEquivalence.hash(hash);
        }
        return i;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof l) {
            return this.elementEquivalence.equals(((l) obj).elementEquivalence);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean a(Object obj, Object obj2) {
        Iterator it2 = ((Iterable) obj).iterator();
        Iterator it3 = ((Iterable) obj2).iterator();
        while (true) {
            if (it2.hasNext() && it3.hasNext()) {
                if (!this.elementEquivalence.equivalent(it2.next(), it3.next())) {
                    break;
                }
            }
        }
        if (it2.hasNext() || it3.hasNext()) {
            return false;
        }
        return true;
    }
}
