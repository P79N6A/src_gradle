package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.i;
import com.facebook.common.references.CloseableReference;
import javax.annotation.Nullable;

public interface n<K, V> {
    @Nullable
    CloseableReference<V> cache(K k, CloseableReference<V> closeableReference);

    boolean contains(i<K> iVar);

    @Nullable
    CloseableReference<V> get(K k);

    int removeAll(i<K> iVar);
}
