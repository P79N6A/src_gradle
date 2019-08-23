package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<T, Y> {
    private final Map<T, Y> cache = new LinkedHashMap(100, 0.75f, true);
    private long currentSize;
    private final long initialMaxSize;
    private long maxSize;

    /* access modifiers changed from: protected */
    public int getSize(@Nullable Y y) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void onItemEvicted(@NonNull T t, @Nullable Y y) {
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    public void clearMemory() {
        trimToSize(0);
    }

    public synchronized long getCurrentSize() {
        return this.currentSize;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    /* access modifiers changed from: protected */
    public synchronized int getCount() {
        return this.cache.size();
    }

    public synchronized boolean contains(@NonNull T t) {
        return this.cache.containsKey(t);
    }

    @Nullable
    public synchronized Y get(@NonNull T t) {
        return this.cache.get(t);
    }

    public LruCache(long j) {
        this.initialMaxSize = j;
        this.maxSize = j;
    }

    @Nullable
    public synchronized Y remove(@NonNull T t) {
        Y remove;
        remove = this.cache.remove(t);
        if (remove != null) {
            this.currentSize -= (long) getSize(remove);
        }
        return remove;
    }

    public synchronized void setSizeMultiplier(float f2) {
        if (f2 >= 0.0f) {
            this.maxSize = (long) Math.round(((float) this.initialMaxSize) * f2);
            evict();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void trimToSize(long j) {
        while (this.currentSize > j) {
            Iterator<Map.Entry<T, Y>> it2 = this.cache.entrySet().iterator();
            Map.Entry next = it2.next();
            Object value = next.getValue();
            this.currentSize -= (long) getSize(value);
            Object key = next.getKey();
            it2.remove();
            onItemEvicted(key, value);
        }
    }

    @Nullable
    public synchronized Y put(@NonNull T t, @Nullable Y y) {
        long size = (long) getSize(y);
        if (size >= this.maxSize) {
            onItemEvicted(t, y);
            return null;
        }
        if (y != null) {
            this.currentSize += size;
        }
        Y put = this.cache.put(t, y);
        if (put != null) {
            this.currentSize -= (long) getSize(put);
            if (!put.equals(y)) {
                onItemEvicted(t, put);
            }
        }
        evict();
        return put;
    }
}