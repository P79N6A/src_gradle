package com.bytedance.ttnet.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public final class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f22666a = new LinkedHashMap<>(0, 0.75f, false);

    /* renamed from: b  reason: collision with root package name */
    private int f22667b;

    /* renamed from: c  reason: collision with root package name */
    private int f22668c = 10;

    /* renamed from: d  reason: collision with root package name */
    private int f22669d;

    /* renamed from: e  reason: collision with root package name */
    private int f22670e;

    /* renamed from: f  reason: collision with root package name */
    private int f22671f;
    private int g;

    private int b(K k, V v) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f22671f + this.g;
        if (i2 != 0) {
            i = (this.f22671f * 100) / i2;
        } else {
            i = 0;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f22668c), Integer.valueOf(this.f22671f), Integer.valueOf(this.g), Integer.valueOf(i)});
    }

    public c(int i) {
    }

    public final synchronized V a(K k) {
        if (k != null) {
            V v = this.f22666a.get(k);
            if (v != null) {
                this.f22671f++;
                return v;
            }
            this.g++;
            return null;
        }
        throw new NullPointerException("key == null");
    }

    private void a(int i) {
        while (this.f22667b > i && !this.f22666a.isEmpty()) {
            Map.Entry next = this.f22666a.entrySet().iterator().next();
            if (next == null) {
                break;
            }
            Object key = next.getKey();
            Object value = next.getValue();
            this.f22666a.remove(key);
            this.f22667b -= b(key, value);
            this.f22670e++;
        }
        if (this.f22667b < 0 || (this.f22666a.isEmpty() && this.f22667b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    public final synchronized V a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.f22669d++;
        this.f22667b += b(k, v);
        put = this.f22666a.put(k, v);
        if (put != null) {
            this.f22667b -= b(k, put);
        }
        a(this.f22668c);
        return put;
    }
}
