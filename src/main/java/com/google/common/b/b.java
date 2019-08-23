package com.google.common.b;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ak;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public interface b<K, V> {
    ConcurrentMap<K, V> asMap();

    void cleanUp();

    V get(K k, Callable<? extends V> callable) throws ExecutionException;

    ak<K, V> getAllPresent(Iterable<?> iterable);

    @NullableDecl
    V getIfPresent(@CompatibleWith Object obj);

    void invalidate(@CompatibleWith Object obj);

    void invalidateAll();

    void invalidateAll(Iterable<?> iterable);

    void put(K k, V v);

    void putAll(Map<? extends K, ? extends V> map);

    long size();

    e stats();
}
