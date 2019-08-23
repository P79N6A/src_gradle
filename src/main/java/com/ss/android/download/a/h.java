package com.ss.android.download.a;

import java.lang.ref.WeakReference;

public final class h<K, T, E, V, R> extends b<K, T, E, V, R, V, h<K, T, E, V, R>> {
    WeakReference<V> g;

    /* access modifiers changed from: package-private */
    public final void a() {
        this.g = null;
    }

    h() {
    }

    /* access modifiers changed from: package-private */
    public final V b() {
        if (this.g != null) {
            return this.g.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(V v) {
        if (v != null) {
            this.g = new WeakReference<>(v);
        } else {
            this.g = null;
        }
    }
}
