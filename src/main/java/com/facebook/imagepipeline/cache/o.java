package com.facebook.imagepipeline.cache;

public interface o<K> {
    void onCacheHit(K k);

    void onCacheMiss();

    void onCachePut();
}
