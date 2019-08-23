package com.bumptech.glide.util;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.SimpleArrayMap;

public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {
    private int hashCode;

    public final void clear() {
        this.hashCode = 0;
        super.clear();
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = super.hashCode();
        }
        return this.hashCode;
    }

    public final void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.hashCode = 0;
        super.putAll(simpleArrayMap);
    }

    public final V removeAt(int i) {
        this.hashCode = 0;
        return super.removeAt(i);
    }

    public final V put(K k, V v) {
        this.hashCode = 0;
        return super.put(k, v);
    }

    public final V setValueAt(int i, V v) {
        this.hashCode = 0;
        return super.setValueAt(i, v);
    }
}
