package com.bytedance.common.utility.collection;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class WeakValueMap<K, V> {
    private final HashMap<K, WeakValue<K, V>> mMap = new HashMap<>();
    private final ReferenceQueue<V> mRefrenceQueue = new ReferenceQueue<>();

    static final class WeakValue<K, V> extends WeakReference<V> {
        final K mKey;

        public WeakValue(K k, V v, ReferenceQueue<V> referenceQueue) {
            super(v, referenceQueue);
            this.mKey = k;
        }
    }

    public void clear() {
        this.mMap.clear();
        poll();
    }

    public boolean isEmpty() {
        poll();
        return this.mMap.isEmpty();
    }

    public int size() {
        poll();
        return this.mMap.size();
    }

    private void poll() {
        while (true) {
            WeakValue weakValue = (WeakValue) this.mRefrenceQueue.poll();
            if (weakValue == null) {
                return;
            }
            if (!this.mMap.isEmpty()) {
                this.mMap.remove(weakValue.mKey);
            }
        }
    }

    public void remove(K k) {
        poll();
        if (k != null) {
            this.mMap.remove(k);
        }
    }

    public V get(K k) {
        poll();
        if (k == null) {
            return null;
        }
        WeakValue weakValue = this.mMap.get(k);
        if (weakValue != null) {
            return weakValue.get();
        }
        return null;
    }

    public void put(K k, V v) {
        if (k != null && v != null) {
            this.mMap.remove(k);
            poll();
            this.mMap.put(k, new WeakValue(k, v, this.mRefrenceQueue));
        }
    }
}
