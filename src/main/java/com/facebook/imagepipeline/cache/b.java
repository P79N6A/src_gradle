package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.image.CloseableImage;

public final class b {
    public static m<CacheKey, CloseableImage> get(g<CacheKey, CloseableImage> gVar, final l lVar) {
        lVar.registerBitmapMemoryCache(gVar);
        return new m<>(gVar, new o<CacheKey>() {
            public final void onCacheMiss() {
                lVar.onBitmapCacheMiss();
            }

            public final void onCachePut() {
                lVar.onBitmapCachePut();
            }

            public final void onCacheHit(CacheKey cacheKey) {
                lVar.onBitmapCacheHit(cacheKey);
            }
        });
    }
}
