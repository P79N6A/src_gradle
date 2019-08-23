package com.bytedance.android.live.core.a;

import java.util.List;

public interface b<K, V> {

    public static class a<V> {

        /* renamed from: a  reason: collision with root package name */
        public int f7785a;

        /* renamed from: b  reason: collision with root package name */
        public int f7786b;

        /* renamed from: c  reason: collision with root package name */
        public List<V> f7787c;

        a(int i, int i2, List<V> list) {
            this.f7785a = i;
            this.f7786b = i2;
            this.f7787c = list;
        }
    }

    V a(K k, n<V> nVar);

    List<V> a(K k);

    List<V> a(K k, List<V> list);

    void a(K k, V v);

    int b(K k, V v);

    void b(K k);
}
