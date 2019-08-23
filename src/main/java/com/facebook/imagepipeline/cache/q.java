package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;

public final class q implements l {

    /* renamed from: a  reason: collision with root package name */
    private static q f23884a;

    public final void onBitmapCacheHit(CacheKey cacheKey) {
    }

    public final void onBitmapCacheMiss() {
    }

    public final void onBitmapCachePut() {
    }

    public final void onDiskCacheGetFail() {
    }

    public final void onDiskCacheHit(CacheKey cacheKey) {
    }

    public final void onDiskCacheMiss() {
    }

    public final void onMemoryCacheHit(CacheKey cacheKey) {
    }

    public final void onMemoryCacheMiss() {
    }

    public final void onMemoryCachePut() {
    }

    public final void onStagingAreaHit(CacheKey cacheKey) {
    }

    public final void onStagingAreaMiss() {
    }

    public final void registerBitmapMemoryCache(g<?, ?> gVar) {
    }

    public final void registerEncodedMemoryCache(g<?, ?> gVar) {
    }

    private q() {
    }

    public static synchronized q getInstance() {
        q qVar;
        synchronized (q.class) {
            if (f23884a == null) {
                f23884a = new q();
            }
            qVar = f23884a;
        }
        return qVar;
    }
}
