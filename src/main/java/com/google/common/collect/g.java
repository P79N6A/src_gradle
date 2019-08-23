package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.bf;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class g<K, V> implements bd<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: a  reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f24758a;
    @MonotonicNonNullDecl

    /* renamed from: b  reason: collision with root package name */
    private transient Set<K> f24759b;
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    private transient bg<K> f24760c;
    @MonotonicNonNullDecl

    /* renamed from: d  reason: collision with root package name */
    private transient Collection<V> f24761d;
    @MonotonicNonNullDecl

    /* renamed from: e  reason: collision with root package name */
    private transient Map<K, Collection<V>> f24762e;

    class a extends bf.b<K, V> {
        /* access modifiers changed from: package-private */
        public final bd<K, V> a() {
            return g.this;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return g.this.i();
        }

        a() {
        }
    }

    class b extends a implements Set<Map.Entry<K, V>> {
        public final int hashCode() {
            return by.a(this);
        }

        b() {
            super();
        }

        public final boolean equals(@NullableDecl Object obj) {
            return by.a((Set<?>) this, obj);
        }
    }

    class c extends AbstractCollection<V> {
        public final void clear() {
            g.this.clear();
        }

        public final Iterator<V> iterator() {
            return g.this.f();
        }

        public final int size() {
            return g.this.size();
        }

        c() {
        }

        public final boolean contains(@NullableDecl Object obj) {
            return g.this.containsValue(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Set<K> d();

    /* access modifiers changed from: package-private */
    public abstract Collection<V> e();

    /* access modifiers changed from: package-private */
    public abstract bg<K> g();

    /* access modifiers changed from: package-private */
    public abstract Collection<Map.Entry<K, V>> h();

    /* access modifiers changed from: package-private */
    public abstract Iterator<Map.Entry<K, V>> i();

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> j();

    g() {
    }

    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f24762e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> j = j();
        this.f24762e = j;
        return j;
    }

    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f24758a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> h = h();
        this.f24758a = h;
        return h;
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> f() {
        return bc.b(entries().iterator());
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.f24759b;
        if (set != null) {
            return set;
        }
        Set<K> d2 = d();
        this.f24759b = d2;
        return d2;
    }

    public bg<K> keys() {
        bg<K> bgVar = this.f24760c;
        if (bgVar != null) {
            return bgVar;
        }
        bg<K> g = g();
        this.f24760c = g;
        return g;
    }

    public String toString() {
        return asMap().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f24761d;
        if (collection != null) {
            return collection;
        }
        Collection<V> e2 = e();
        this.f24761d = e2;
        return e2;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bd) {
            return asMap().equals(((bd) obj).asMap());
        }
        return false;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (Collection contains : asMap().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public boolean putAll(bd<? extends K, ? extends V> bdVar) {
        boolean z = false;
        for (Map.Entry entry : bdVar.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        return get(k).add(v);
    }

    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        m.a(iterable);
        Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }

    public boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.contains(obj2)) {
            return false;
        }
        return true;
    }

    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }

    @CanIgnoreReturnValue
    public boolean putAll(@NullableDecl K k, Iterable<? extends V> iterable) {
        m.a(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator<? extends V> it2 = iterable.iterator();
        if (!it2.hasNext() || !aw.a(get(k), it2)) {
            return false;
        }
        return true;
    }
}
