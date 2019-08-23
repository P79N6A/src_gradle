package com.google.common.collect;

import com.google.common.a.f;
import com.google.common.a.j;
import com.google.common.a.m;
import com.google.common.a.n;
import com.google.common.a.o;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ak;
import com.google.common.collect.by;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bc {

    enum a implements f<Map.Entry<?, ?>, Object> {
        KEY {
            @NullableDecl
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            @NullableDecl
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    static abstract class b<K, V> extends by.c<Map.Entry<K, V>> {
        /* access modifiers changed from: package-private */
        public abstract Map<K, V> a();

        b() {
        }

        public void clear() {
            a().clear();
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public int size() {
            return a().size();
        }

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) m.a(collection));
            } catch (UnsupportedOperationException unused) {
                return by.a((Set<?>) this, collection.iterator());
            }
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object a2 = bc.a(a(), key);
            if (!j.a(a2, entry.getValue()) || (a2 == null && !a().containsKey(key))) {
                return false;
            }
            return true;
        }

        public boolean retainAll(Collection<?> collection) {
            int i;
            try {
                return super.retainAll((Collection) m.a(collection));
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    l.a(size, "expectedSize");
                    i = size + 1;
                } else if (size < 1073741824) {
                    i = (int) ((((float) size) / 0.75f) + 1.0f);
                } else {
                    i = Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i);
                for (Object next : collection) {
                    if (contains(next)) {
                        hashSet.add(((Map.Entry) next).getKey());
                    }
                }
                return a().keySet().retainAll(hashSet);
            }
        }
    }

    static class c<K, V> extends by.c<K> {
        @Weak

        /* renamed from: d  reason: collision with root package name */
        final Map<K, V> f24654d;

        /* access modifiers changed from: package-private */
        public final Map<K, V> b() {
            return this.f24654d;
        }

        public void clear() {
            b().clear();
        }

        public boolean isEmpty() {
            return b().isEmpty();
        }

        public int size() {
            return b().size();
        }

        public Iterator<K> iterator() {
            return bc.a(b().entrySet().iterator());
        }

        c(Map<K, V> map) {
            this.f24654d = (Map) m.a(map);
        }

        public boolean contains(Object obj) {
            return b().containsKey(obj);
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            b().remove(obj);
            return true;
        }
    }

    static class d<K, V> extends AbstractCollection<V> {
        @Weak

        /* renamed from: b  reason: collision with root package name */
        public final Map<K, V> f24655b;

        public void clear() {
            this.f24655b.clear();
        }

        public boolean isEmpty() {
            return this.f24655b.isEmpty();
        }

        public int size() {
            return this.f24655b.size();
        }

        public Iterator<V> iterator() {
            return bc.b(this.f24655b.entrySet().iterator());
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f24655b.containsValue(obj);
        }

        d(Map<K, V> map) {
            this.f24655b = (Map) m.a(map);
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry next : this.f24655b.entrySet()) {
                    if (j.a(obj, next.getValue())) {
                        this.f24655b.remove(next.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) m.a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a2 = by.a();
                for (Map.Entry next : this.f24655b.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        a2.add(next.getKey());
                    }
                }
                return this.f24655b.keySet().removeAll(a2);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) m.a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a2 = by.a();
                for (Map.Entry next : this.f24655b.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        a2.add(next.getKey());
                    }
                }
                return this.f24655b.keySet().retainAll(a2);
            }
        }
    }

    @GwtCompatible
    static abstract class e<K, V> extends AbstractMap<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a  reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f24656a;
        @MonotonicNonNullDecl

        /* renamed from: b  reason: collision with root package name */
        private transient Set<K> f24657b;
        @MonotonicNonNullDecl

        /* renamed from: c  reason: collision with root package name */
        private transient Collection<V> f24658c;

        /* access modifiers changed from: package-private */
        public abstract Set<Map.Entry<K, V>> a();

        e() {
        }

        /* access modifiers changed from: package-private */
        public Set<K> e() {
            return new c(this);
        }

        /* access modifiers changed from: package-private */
        public Collection<V> l_() {
            return new d(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f24656a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a2 = a();
            this.f24656a = a2;
            return a2;
        }

        public Set<K> keySet() {
            Set<K> set = this.f24657b;
            if (set != null) {
                return set;
            }
            Set<K> e2 = e();
            this.f24657b = e2;
            return e2;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f24658c;
            if (collection != null) {
                return collection;
            }
            Collection<V> l_ = l_();
            this.f24658c = l_;
            return l_;
        }
    }

    static <K> f<Map.Entry<K, ?>, K> a() {
        return a.KEY;
    }

    static <V> f<Map.Entry<?, V>, V> b() {
        return a.VALUE;
    }

    static <K, V> Iterator<K> a(Iterator<Map.Entry<K, V>> it2) {
        return new cd<Map.Entry<K, V>, K>(it2) {
            /* access modifiers changed from: package-private */
            public final /* synthetic */ Object a(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        };
    }

    static <K, V> Iterator<V> b(Iterator<Map.Entry<K, V>> it2) {
        return new cd<Map.Entry<K, V>, V>(it2) {
            /* access modifiers changed from: package-private */
            public final /* synthetic */ Object a(Object obj) {
                return ((Map.Entry) obj).getValue();
            }
        };
    }

    static <K> n<Map.Entry<K, ?>> a(n<? super K> nVar) {
        return o.a(nVar, a());
    }

    static <V> n<Map.Entry<?, V>> b(n<? super V> nVar) {
        return o.a(nVar, b());
    }

    static <E> ak<E, Integer> a(Collection<E> collection) {
        ak.a aVar = new ak.a(collection.size());
        int i = 0;
        for (E a2 : collection) {
            aVar.a(a2, Integer.valueOf(i));
            i++;
        }
        return aVar.a();
    }

    static <V> V c(Map<?, V> map, Object obj) {
        m.a(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V a(Map<?, V> map, @NullableDecl Object obj) {
        m.a(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean b(Map<?, ?> map, Object obj) {
        m.a(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @GwtCompatible
    public static <K, V> Map.Entry<K, V> a(@NullableDecl K k, @NullableDecl V v) {
        return new ah(k, v);
    }
}
