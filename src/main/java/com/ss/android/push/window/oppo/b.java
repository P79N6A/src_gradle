package com.ss.android.push.window.oppo;

import java.util.LinkedHashMap;
import java.util.Map;

public final class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f30435a;

    /* renamed from: b  reason: collision with root package name */
    private int f30436b;

    /* renamed from: c  reason: collision with root package name */
    private int f30437c;

    /* renamed from: d  reason: collision with root package name */
    private int f30438d;

    /* renamed from: e  reason: collision with root package name */
    private int f30439e;

    /* renamed from: f  reason: collision with root package name */
    private int f30440f;
    private int g;

    private int b(K k, V v) {
        return 1;
    }

    public final synchronized void a() {
        a(-1);
    }

    public final synchronized Map<K, V> b() {
        return new LinkedHashMap(this.f30435a);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f30440f + this.g;
        if (i2 != 0) {
            i = (this.f30440f * 100) / i2;
        } else {
            i = 0;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f30437c), Integer.valueOf(this.f30440f), Integer.valueOf(this.g), Integer.valueOf(i)});
    }

    public b(int i) {
        if (i > 0) {
            this.f30437c = i;
            this.f30435a = new LinkedHashMap<>(0, 0.75f, false);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized V a(K k) {
        V remove;
        if (k != null) {
            remove = this.f30435a.remove(k);
            if (remove != null) {
                this.f30436b -= b(k, remove);
            }
        } else {
            throw new NullPointerException("key == null");
        }
        return remove;
    }

    private void a(int i) {
        while (this.f30436b > i && !this.f30435a.isEmpty()) {
            Map.Entry next = this.f30435a.entrySet().iterator().next();
            if (next == null) {
                break;
            }
            Object key = next.getKey();
            Object value = next.getValue();
            this.f30435a.remove(key);
            this.f30436b -= b(key, value);
            this.f30439e++;
        }
        if (this.f30436b < 0 || (this.f30435a.isEmpty() && this.f30436b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    public final synchronized V a(K k, V v) {
        V put;
        if (k != null) {
            this.f30438d++;
            this.f30436b += b(k, v);
            put = this.f30435a.put(k, v);
            if (put != null) {
                this.f30436b -= b(k, put);
            }
            a(this.f30437c);
        } else {
            throw new NullPointerException("key == null || value == null");
        }
        return put;
    }
}
