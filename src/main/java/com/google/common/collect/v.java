package com.google.common.collect;

import com.google.common.a.i;
import com.google.common.a.m;
import com.google.common.a.n;
import com.google.common.a.o;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.bc;
import com.google.common.collect.bf;
import com.google.common.collect.bg;
import com.google.common.collect.bh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public class v<K, V> extends g<K, V> implements x<K, V> {

    /* renamed from: a  reason: collision with root package name */
    final bd<K, V> f24808a;

    /* renamed from: b  reason: collision with root package name */
    final n<? super Map.Entry<K, V>> f24809b;

    class a extends bc.e<K, Collection<V>> {

        /* renamed from: com.google.common.collect.v$a$a  reason: collision with other inner class name */
        class C0284a extends bc.b<K, Collection<V>> {
            /* access modifiers changed from: package-private */
            public final Map<K, Collection<V>> a() {
                return a.this;
            }

            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b<Map.Entry<K, Collection<V>>>() {

                    /* renamed from: a  reason: collision with root package name */
                    final Iterator<Map.Entry<K, Collection<V>>> f24812a = v.this.f24808a.asMap().entrySet().iterator();

                    /* access modifiers changed from: protected */
                    public final /* synthetic */ Object a() {
                        while (this.f24812a.hasNext()) {
                            Map.Entry next = this.f24812a.next();
                            Object key = next.getKey();
                            Collection a2 = v.a((Collection) next.getValue(), (n<? super E>) new c<Object>(key));
                            if (!a2.isEmpty()) {
                                return bc.a(key, a2);
                            }
                        }
                        b();
                        return null;
                    }
                };
            }

            public final int size() {
                Iterator it2 = iterator();
                long j = 0;
                while (it2.hasNext()) {
                    it2.next();
                    j++;
                }
                return com.google.common.f.a.a(j);
            }

            C0284a() {
            }

            public final boolean removeAll(Collection<?> collection) {
                return v.this.a(o.a(collection));
            }

            public final boolean retainAll(Collection<?> collection) {
                return v.this.a(o.a(o.a(collection)));
            }
        }

        class b extends bc.c<K, Collection<V>> {
            b() {
                super(a.this);
            }

            public final boolean remove(@NullableDecl Object obj) {
                if (a.this.remove(obj) != null) {
                    return true;
                }
                return false;
            }

            public final boolean removeAll(Collection<?> collection) {
                return v.this.a(bc.a(o.a(collection)));
            }

            public final boolean retainAll(Collection<?> collection) {
                return v.this.a(bc.a(o.a(o.a(collection))));
            }
        }

        class c extends bc.d<K, Collection<V>> {
            c() {
                super(a.this);
            }

            public final boolean removeAll(Collection<?> collection) {
                return v.this.a(bc.b(o.a(collection)));
            }

            public final boolean retainAll(Collection<?> collection) {
                return v.this.a(bc.b(o.a(o.a(collection))));
            }

            public final boolean remove(@NullableDecl Object obj) {
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    Iterator it2 = v.this.f24808a.asMap().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        Collection a2 = v.a((Collection) entry.getValue(), (n<? super E>) new c<Object>(entry.getKey()));
                        if (!a2.isEmpty() && collection.equals(a2)) {
                            if (a2.size() == ((Collection) entry.getValue()).size()) {
                                it2.remove();
                            } else {
                                a2.clear();
                            }
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public final Set<Map.Entry<K, Collection<V>>> a() {
            return new C0284a();
        }

        public final void clear() {
            v.this.clear();
        }

        /* access modifiers changed from: package-private */
        public final Set<K> e() {
            return new b();
        }

        /* access modifiers changed from: package-private */
        public final Collection<Collection<V>> l_() {
            return new c();
        }

        a() {
        }

        public final boolean containsKey(@NullableDecl Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Collection<V> get(@NullableDecl Object obj) {
            Collection collection = (Collection) v.this.f24808a.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> a2 = v.a(collection, (n<? super E>) new c<Object>(obj));
            if (a2.isEmpty()) {
                return null;
            }
            return a2;
        }

        /* renamed from: a */
        public final Collection<V> remove(@NullableDecl Object obj) {
            LinkedHashSet linkedHashSet;
            Collection collection = (Collection) v.this.f24808a.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList a2 = az.a();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (v.this.a(obj, next)) {
                    it2.remove();
                    a2.add(next);
                }
            }
            if (a2.isEmpty()) {
                return null;
            }
            if (!(v.this.f24808a instanceof bx)) {
                return Collections.unmodifiableList(a2);
            }
            boolean z = a2 instanceof Collection;
            if (z) {
                linkedHashSet = new LinkedHashSet(m.a(a2));
            } else {
                LinkedHashSet b2 = by.b();
                if (z) {
                    b2.addAll(m.a(a2));
                } else {
                    aw.a((Collection<T>) b2, ((Iterable) m.a(a2)).iterator());
                }
                linkedHashSet = b2;
            }
            return Collections.unmodifiableSet(linkedHashSet);
        }
    }

    class b extends bf.c<K, V> {
        public final Set<bg.a<K>> entrySet() {
            return new bh.c<K>() {
                /* access modifiers changed from: package-private */
                public final bg<K> a() {
                    return b.this;
                }

                public final Iterator<bg.a<K>> iterator() {
                    return b.this.b();
                }

                public final int size() {
                    return v.this.keySet().size();
                }

                private boolean a(final n<? super bg.a<K>> nVar) {
                    return v.this.a(new n<Map.Entry<K, Collection<V>>>() {
                        public final /* synthetic */ boolean apply(Object obj) {
                            Map.Entry entry = (Map.Entry) obj;
                            return nVar.apply(bh.a(entry.getKey(), ((Collection) entry.getValue()).size()));
                        }
                    });
                }

                public final boolean removeAll(Collection<?> collection) {
                    return a(o.a(collection));
                }

                public final boolean retainAll(Collection<?> collection) {
                    return a(o.a(o.a(collection)));
                }
            };
        }

        b() {
            super(v.this);
        }

        public final int remove(@NullableDecl Object obj, int i) {
            l.a(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) v.this.f24808a.asMap().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (v.this.a(obj, it2.next())) {
                    i2++;
                    if (i2 <= i) {
                        it2.remove();
                    }
                }
            }
            return i2;
        }
    }

    final class c implements n<V> {

        /* renamed from: b  reason: collision with root package name */
        private final K f24821b;

        public final boolean apply(@NullableDecl V v) {
            return v.this.a(this.f24821b, v);
        }

        c(K k) {
            this.f24821b = k;
        }
    }

    public bd<K, V> a() {
        return this.f24808a;
    }

    public final n<? super Map.Entry<K, V>> b() {
        return this.f24809b;
    }

    public void clear() {
        entries().clear();
    }

    /* access modifiers changed from: package-private */
    public final Collection<V> e() {
        return new y(this);
    }

    /* access modifiers changed from: package-private */
    public final bg<K> g() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<K, V>> i() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> j() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public final Set<K> d() {
        return asMap().keySet();
    }

    /* access modifiers changed from: package-private */
    public Collection<Map.Entry<K, V>> h() {
        return a(this.f24808a.entries(), this.f24809b);
    }

    public int size() {
        return entries().size();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        if (asMap().get(obj) != null) {
            return true;
        }
        return false;
    }

    public Collection<V> get(K k) {
        return a(this.f24808a.get(k), (n<? super E>) new c<Object>(k));
    }

    public Collection<V> removeAll(@NullableDecl Object obj) {
        Object obj2;
        Object remove = asMap().remove(obj);
        if (this.f24808a instanceof bx) {
            obj2 = Collections.emptySet();
        } else {
            obj2 = Collections.emptyList();
        }
        return (Collection) i.a(remove, obj2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(n<? super Map.Entry<K, Collection<V>>> nVar) {
        Iterator it2 = this.f24808a.asMap().entrySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Collection a2 = a((Collection) entry.getValue(), (n<? super E>) new c<Object>(key));
            if (!a2.isEmpty() && nVar.apply(bc.a(key, a2))) {
                if (a2.size() == ((Collection) entry.getValue()).size()) {
                    it2.remove();
                } else {
                    a2.clear();
                }
                z = true;
            }
        }
        return z;
    }

    static <E> Collection<E> a(Collection<E> collection, n<? super E> nVar) {
        if (collection instanceof Set) {
            return by.a((Set) collection, nVar);
        }
        return m.a(collection, nVar);
    }

    v(bd<K, V> bdVar, n<? super Map.Entry<K, V>> nVar) {
        this.f24808a = (bd) m.a(bdVar);
        this.f24809b = (n) m.a(nVar);
    }

    public final boolean a(K k, V v) {
        return this.f24809b.apply(bc.a(k, v));
    }
}
