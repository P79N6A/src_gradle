package com.bytedance.jedi.model.guava.b;

import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import java.util.concurrent.ConcurrentMap;

@GwtCompatible
public interface a<K, V> {
    ConcurrentMap<K, V> asMap();

    V getIfPresent(K k);

    void invalidate(K k);

    void invalidateAll();

    void put(K k, V v);
}
