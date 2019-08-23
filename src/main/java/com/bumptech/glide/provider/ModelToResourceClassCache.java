package com.bumptech.glide.provider;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ModelToResourceClassCache {
    private final ArrayMap<MultiClassKey, List<Class<?>>> registeredResourceClassCache = new ArrayMap<>();
    private final AtomicReference<MultiClassKey> resourceClassKeyRef = new AtomicReference<>();

    public void clear() {
        synchronized (this.registeredResourceClassCache) {
            this.registeredResourceClassCache.clear();
        }
    }

    @Nullable
    public List<Class<?>> get(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        List<Class<?>> list;
        MultiClassKey andSet = this.resourceClassKeyRef.getAndSet(null);
        if (andSet == null) {
            andSet = new MultiClassKey(cls, cls2);
        } else {
            andSet.set(cls, cls2);
        }
        synchronized (this.registeredResourceClassCache) {
            list = (List) this.registeredResourceClassCache.get(andSet);
        }
        this.resourceClassKeyRef.set(andSet);
        return list;
    }

    public void put(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull List<Class<?>> list) {
        synchronized (this.registeredResourceClassCache) {
            this.registeredResourceClassCache.put(new MultiClassKey(cls, cls2), list);
        }
    }
}