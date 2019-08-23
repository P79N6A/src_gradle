package com.facebook.common.memory;

import com.facebook.common.references.b;

public interface c<V> extends MemoryTrimmable, b<V> {
    V get(int i);

    void release(V v);
}
