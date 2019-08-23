package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class q<T> extends bn<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }

    q(Comparator<T> comparator2) {
        this.comparator = (Comparator) m.a(comparator2);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return this.comparator.equals(((q) obj).comparator);
        }
        return false;
    }

    public final int compare(T t, T t2) {
        return this.comparator.compare(t, t2);
    }
}
