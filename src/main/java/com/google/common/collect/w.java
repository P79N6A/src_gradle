package com.google.common.collect;

import com.google.common.a.n;
import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
public final class w<K, V> extends v<K, V> implements z<K, V> {
    /* renamed from: c */
    public final bx<K, V> a() {
        return (bx) this.f24808a;
    }

    public final Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Collection h() {
        return by.a(a().entries(), b());
    }

    public final /* bridge */ /* synthetic */ Collection get(Object obj) {
        return (Set) super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Collection removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    w(bx<K, V> bxVar, n<? super Map.Entry<K, V>> nVar) {
        super(bxVar, nVar);
    }

    public final /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }
}
