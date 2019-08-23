package com.google.common.b;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.util.AbstractMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class n<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final l cause;

    public final l getCause() {
        return this.cause;
    }

    public final boolean wasEvicted() {
        return this.cause.wasEvicted();
    }

    public static <K, V> n<K, V> create(@NullableDecl K k, @NullableDecl V v, l lVar) {
        return new n<>(k, v, lVar);
    }

    private n(@NullableDecl K k, @NullableDecl V v, l lVar) {
        super(k, v);
        this.cause = (l) m.a(lVar);
    }
}
