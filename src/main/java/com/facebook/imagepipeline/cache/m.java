package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.i;
import com.facebook.common.references.CloseableReference;

public final class m<K, V> implements n<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final n<K, V> f23881a;

    /* renamed from: b  reason: collision with root package name */
    private final o f23882b;

    public final boolean contains(i<K> iVar) {
        return this.f23881a.contains(iVar);
    }

    public final int removeAll(i<K> iVar) {
        return this.f23881a.removeAll(iVar);
    }

    public final CloseableReference<V> get(K k) {
        CloseableReference<V> closeableReference = this.f23881a.get(k);
        if (closeableReference == null) {
            this.f23882b.onCacheMiss();
        } else {
            this.f23882b.onCacheHit(k);
        }
        return closeableReference;
    }

    public m(n<K, V> nVar, o oVar) {
        this.f23881a = nVar;
        this.f23882b = oVar;
    }

    public final CloseableReference<V> cache(K k, CloseableReference<V> closeableReference) {
        this.f23882b.onCachePut();
        return this.f23881a.cache(k, closeableReference);
    }
}
