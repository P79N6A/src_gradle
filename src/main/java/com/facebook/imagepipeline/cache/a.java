package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.b;
import com.facebook.imagepipeline.cache.g;
import com.facebook.imagepipeline.image.CloseableImage;

public final class a {
    public static g<CacheKey, CloseableImage> get(Supplier<MemoryCacheParams> supplier, b bVar, g.a aVar) {
        g<CacheKey, CloseableImage> gVar = new g<>(new s<CloseableImage>() {
            public final int getSizeInBytes(CloseableImage closeableImage) {
                return closeableImage.getSizeInBytes();
            }
        }, aVar, supplier);
        bVar.registerMemoryTrimmable(gVar);
        return gVar;
    }
}
