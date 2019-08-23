package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.e;

public final class k {
    public static m<CacheKey, e> get(g<CacheKey, e> gVar, final l lVar) {
        lVar.registerEncodedMemoryCache(gVar);
        return new m<>(gVar, new o<CacheKey>() {
            public final void onCacheMiss() {
                lVar.onMemoryCacheMiss();
            }

            public final void onCachePut() {
                lVar.onMemoryCachePut();
            }

            public final void onCacheHit(CacheKey cacheKey) {
                lVar.onMemoryCacheHit(cacheKey);
            }
        });
    }
}
