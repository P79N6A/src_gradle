package com.google.common.collect;

import com.google.common.a.j;
import com.google.common.a.m;
import com.google.common.a.n;
import com.google.common.a.o;
import com.google.common.annotations.GwtCompatible;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class y<K, V> extends AbstractCollection<V> {
    @Weak

    /* renamed from: a  reason: collision with root package name */
    private final x<K, V> f24822a;

    public final void clear() {
        this.f24822a.clear();
    }

    public final int size() {
        return this.f24822a.size();
    }

    public final Iterator<V> iterator() {
        return bc.b(this.f24822a.entries().iterator());
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f24822a.containsValue(obj);
    }

    y(x<K, V> xVar) {
        this.f24822a = (x) m.a(xVar);
    }

    public final boolean remove(@NullableDecl Object obj) {
        n<? super Map.Entry<K, V>> b2 = this.f24822a.b();
        Iterator it2 = this.f24822a.a().entries().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (b2.apply(entry) && j.a(entry.getValue(), obj)) {
                it2.remove();
                return true;
            }
        }
        return false;
    }

    public final boolean removeAll(Collection<?> collection) {
        return av.a((Iterable<T>) this.f24822a.a().entries(), o.a(this.f24822a.b(), bc.b(o.a(collection))));
    }

    public final boolean retainAll(Collection<?> collection) {
        return av.a((Iterable<T>) this.f24822a.a().entries(), o.a(this.f24822a.b(), bc.b(o.a(o.a(collection)))));
    }
}
