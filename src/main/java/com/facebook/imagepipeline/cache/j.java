package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.b;
import com.facebook.common.memory.e;

public final class j {
    public static g<CacheKey, e> get(Supplier<MemoryCacheParams> supplier, b bVar) {
        g<CacheKey, e> gVar = new g<>(new s<e>() {
            public final int getSizeInBytes(e eVar) {
                return eVar.size();
            }
        }, new p(), supplier);
        bVar.registerMemoryTrimmable(gVar);
        return gVar;
    }
}
