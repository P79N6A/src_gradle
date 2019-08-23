package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class ah<K, V> extends f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    @NullableDecl
    final K key;
    @NullableDecl
    final V value;

    @NullableDecl
    public final K getKey() {
        return this.key;
    }

    @NullableDecl
    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    ah(@NullableDecl K k, @NullableDecl V v) {
        this.key = k;
        this.value = v;
    }
}
