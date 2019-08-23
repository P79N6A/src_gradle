package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.f;
import com.facebook.cache.disk.c;
import java.io.IOException;

public interface FileCache {
    void clearAll();

    long clearOldEntries(long j);

    long getCount();

    c.a getDumpInfo() throws IOException;

    BinaryResource getResource(CacheKey cacheKey);

    long getSize();

    boolean hasKey(CacheKey cacheKey);

    boolean hasKeySync(CacheKey cacheKey);

    BinaryResource insert(CacheKey cacheKey, f fVar) throws IOException;

    boolean isEnabled();

    boolean probe(CacheKey cacheKey);

    void remove(CacheKey cacheKey);
}
