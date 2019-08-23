package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.image.CloseableImage;

public final class f extends h {
    /* access modifiers changed from: protected */
    public final Consumer<CloseableReference<CloseableImage>> a(Consumer<CloseableReference<CloseableImage>> consumer, CacheKey cacheKey, boolean z) {
        return consumer;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "BitmapMemoryCacheGetProducer";
    }

    public f(n<CacheKey, CloseableImage> nVar, CacheKeyFactory cacheKeyFactory, al<CloseableReference<CloseableImage>> alVar) {
        super(nVar, cacheKeyFactory, alVar);
    }
}
