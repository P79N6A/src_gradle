package com.bytedance.jedi.model.guava.b;

import com.bytedance.jedi.model.guava.a.c;
import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import com.bytedance.jedi.model.guava.annotations.NullableDecl;
import java.util.AbstractMap;

@GwtCompatible
public final class g<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final e cause;

    public final e getCause() {
        return this.cause;
    }

    public final boolean wasEvicted() {
        return this.cause.wasEvicted();
    }

    public static <K, V> g<K, V> create(K k, V v, e eVar) {
        return new g<>(k, v, eVar);
    }

    private g(@NullableDecl K k, @NullableDecl V v, e eVar) {
        super(k, v);
        this.cause = (e) c.a(eVar);
    }
}
