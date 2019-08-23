package com.bytedance.ad.symphony.g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e<K, V> extends ConcurrentHashMap<K, V> {
    public e() {
    }

    public e(int i) {
        super(i);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        try {
            super.putAll(map);
        } catch (Exception unused) {
        }
    }

    public e(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public e(int i, float f2) {
        super(i, f2);
    }

    public final V put(K k, V v) {
        if (k == null || v == null) {
            return null;
        }
        return super.put(k, v);
    }

    public e(int i, float f2, int i2) {
        super(i, f2, i2);
    }
}
