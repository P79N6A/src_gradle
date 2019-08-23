package com.ss.android.download.a;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public final class g<K, T, E, V, R> extends a<K, T, E, V, R, Set<V>, f<K, T, E, V, R>> {
    private final WeakReference<a<K, T, E, V, R>> g;
    private final Collection<V> h = new ArrayList();

    public interface a<K, T, E, V, R> {
        R a(K k, T t, E e2);

        void a(K k, T t, E e2, Collection<V> collection, R r);
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ b a() {
        return new f();
    }

    public final void b() {
        super.b();
        this.g.clear();
    }

    public final /* bridge */ /* synthetic */ void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public g(int i, int i2, a<K, T, E, V, R> aVar) {
        super(i, i2, aVar.getClass().getName());
        this.g = new WeakReference<>(aVar);
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

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Set set = (Set) obj4;
        a aVar = (a) this.g.get();
        if (aVar != null) {
            this.h.clear();
            for (Object next : set) {
                if (next != null) {
                    this.h.add(next);
                }
            }
            aVar.a(obj, obj2, obj3, this.h, obj5);
            this.h.clear();
        }
    }
}
