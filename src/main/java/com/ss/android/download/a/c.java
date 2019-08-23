package com.ss.android.download.a;

import android.os.Message;
import java.lang.ref.WeakReference;

public final class c<K, T, E, V, R> extends a<K, T, E, V, R, V, h<K, T, E, V, R>> {
    private final WeakReference<a<K, T, E, V, R>> g;

    public interface a<K, T, E, V, R> {
        R a(K k, T t, E e2);

        void a(K k, T t, E e2, V v, R r);
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ b a() {
        return new h();
    }

    public final void b() {
        super.b();
        this.g.clear();
    }

    public final /* bridge */ /* synthetic */ void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public c(a<K, T, E, V, R> aVar) {
        this(20, 3, aVar);
    }

    public c(int i, int i2, a<K, T, E, V, R> aVar) {
        this(i, i2, aVar, false);
    }

    /* access modifiers changed from: protected */
    public final R a(K k, T t, E e2) {
        a aVar = (a) this.g.get();
        if (aVar != null) {
            return aVar.a(k, t, e2);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2, Object obj3, Object obj4) {
        super.a(obj, obj2, obj3, obj4);
    }

    private c(int i, int i2, a<K, T, E, V, R> aVar, boolean z) {
        super(i, i2, aVar.getClass().getName(), false);
        this.g = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    public final void a(K k, T t, E e2, V v, R r) {
        a aVar = (a) this.g.get();
        if (aVar != null) {
            aVar.a(k, t, e2, v, r);
        }
    }
}
