package com.google.common.b;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ae;
import com.google.common.collect.ak;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
public abstract class f<K, V> extends ae implements b<K, V> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract b<K, V> delegate();

    protected f() {
    }

    public void cleanUp() {
        delegate().cleanUp();
    }

    public void invalidateAll() {
        delegate().invalidateAll();
    }

    public ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    public long size() {
        return delegate().size();
    }

    public e stats() {
        return delegate().stats();
    }

    public void invalidate(Object obj) {
        delegate().invalidate(obj);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public ak<K, V> getAllPresent(Iterable<?> iterable) {
        return delegate().getAllPresent(iterable);
    }

    @NullableDecl
    public V getIfPresent(Object obj) {
        return delegate().getIfPresent(obj);
    }

    public void invalidateAll(Iterable<?> iterable) {
        delegate().invalidateAll(iterable);
    }

    public void put(K k, V v) {
        delegate().put(k, v);
    }

    public V get(K k, Callable<? extends V> callable) throws ExecutionException {
        return delegate().get(k, callable);
    }
}
