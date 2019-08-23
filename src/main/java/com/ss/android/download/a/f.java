package com.ss.android.download.a;

import com.bytedance.common.utility.collection.SetFromMap;
import java.util.Set;
import java.util.WeakHashMap;

public final class f<K, T, E, V, R> extends b<K, T, E, V, R, Set<V>, f<K, T, E, V, R>> {
    public Set<V> g = new SetFromMap(new WeakHashMap());

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object b() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.g.clear();
    }

    f() {
    }

    /* access modifiers changed from: package-private */
    public final void a(V v) {
        if (v != null) {
            this.g.add(v);
        }
    }
}
