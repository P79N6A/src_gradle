package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.bg;
import com.google.common.collect.bw;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class ao<K, V> extends g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b  reason: collision with root package name */
    final transient ak<K, ? extends ag<V>> f24563b;

    /* renamed from: c  reason: collision with root package name */
    final transient int f24564c;

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Map<K, Collection<V>> f24572a = n.create();
        @MonotonicNonNullDecl

        /* renamed from: b  reason: collision with root package name */
        Comparator<? super K> f24573b;
        @MonotonicNonNullDecl

        /* renamed from: c  reason: collision with root package name */
        Comparator<? super V> f24574c;

        /* access modifiers changed from: package-private */
        public Collection<V> c() {
            return new ArrayList();
        }

        public ao<K, V> b() {
            Collection entrySet = this.f24572a.entrySet();
            if (this.f24573b != null) {
                entrySet = bn.from(this.f24573b).a().immutableSortedCopy(entrySet);
            }
            return aj.a(entrySet, this.f24574c);
        }

        @CanIgnoreReturnValue
        public a<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
            return b(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        @Beta
        public a<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            for (Map.Entry a2 : iterable) {
                a(a2);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public a<K, V> b(K k, V v) {
            l.a((Object) k, (Object) v);
            Collection collection = this.f24572a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f24572a;
                Collection c2 = c();
                map.put(k, c2);
                collection = c2;
            }
            collection.add(v);
            return this;
        }
    }

    static class b<K, V> extends ag<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        @Weak
        final ao<K, V> multimap;

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return this.multimap.a();
        }

        public final cg<Map.Entry<K, V>> iterator() {
            return this.multimap.i();
        }

        public final int size() {
            return this.multimap.size();
        }

        b(ao<K, V> aoVar) {
            this.multimap = aoVar;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    @GwtIncompatible
    static class c {

        /* renamed from: a  reason: collision with root package name */
        static final bw.a<ao> f24575a = bw.a(ao.class, "map");

        /* renamed from: b  reason: collision with root package name */
        static final bw.a<ao> f24576b = bw.a(ao.class, "size");
    }

    class d extends ap<K> {
        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return true;
        }

        public final ar<K> elementSet() {
            return ao.this.keySet();
        }

        public final int size() {
            return ao.this.size();
        }

        /* access modifiers changed from: package-private */
        public final Object writeReplace() {
            return new e(ao.this);
        }

        d() {
        }

        public final boolean contains(@NullableDecl Object obj) {
            return ao.this.containsKey(obj);
        }

        public final int count(@NullableDecl Object obj) {
            Collection collection = (Collection) ao.this.f24563b.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        /* access modifiers changed from: package-private */
        public final bg.a<K> a(int i) {
            Map.Entry entry = (Map.Entry) ao.this.f24563b.entrySet().asList().get(i);
            return bh.a(entry.getKey(), ((Collection) entry.getValue()).size());
        }
    }

    static final class e implements Serializable {
        final ao<?, ?> multimap;

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.multimap.keys();
        }

        e(ao<?, ?> aoVar) {
            this.multimap = aoVar;
        }
    }

    static final class f<K, V> extends ag<V> {
        private static final long serialVersionUID = 0;
        @Weak

        /* renamed from: a  reason: collision with root package name */
        private final transient ao<K, V> f24577a;

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return true;
        }

        public final cg<V> iterator() {
            return this.f24577a.f();
        }

        public final int size() {
            return this.f24577a.size();
        }

        f(ao<K, V> aoVar) {
            this.f24577a = aoVar;
        }

        public final boolean contains(@NullableDecl Object obj) {
            return this.f24577a.containsValue(obj);
        }

        /* access modifiers changed from: package-private */
        @GwtIncompatible
        public final int a(Object[] objArr, int i) {
            cg it2 = this.f24577a.f24563b.values().iterator();
            while (it2.hasNext()) {
                i = ((ag) it2.next()).a(objArr, i);
            }
            return i;
        }
    }

    public abstract ag<V> get(K k);

    public abstract ao<V, K> inverse();

    public ak<K, Collection<V>> asMap() {
        return this.f24563b;
    }

    public int size() {
        return this.f24564c;
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> ao<K, V> of() {
        return aj.of();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.f24563b.d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final cg<Map.Entry<K, V>> i() {
        return new cg<Map.Entry<K, V>>() {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<? extends Map.Entry<K, ? extends ag<V>>> f24565a = ao.this.f24563b.entrySet().iterator();

            /* renamed from: b  reason: collision with root package name */
            K f24566b = null;

            /* renamed from: c  reason: collision with root package name */
            Iterator<V> f24567c = aw.a();

            public final boolean hasNext() {
                if (this.f24567c.hasNext() || this.f24565a.hasNext()) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object next() {
                if (!this.f24567c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f24565a.next();
                    this.f24566b = entry.getKey();
                    this.f24567c = ((ag) entry.getValue()).iterator();
                }
                return bc.a(this.f24566b, this.f24567c.next());
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final cg<V> f() {
        return new cg<V>() {

            /* renamed from: a  reason: collision with root package name */
            Iterator<? extends ag<V>> f24569a = ao.this.f24563b.values().iterator();

            /* renamed from: b  reason: collision with root package name */
            Iterator<V> f24570b = aw.a();

            public final boolean hasNext() {
                if (this.f24570b.hasNext() || this.f24569a.hasNext()) {
                    return true;
                }
                return false;
            }

            public final V next() {
                if (!this.f24570b.hasNext()) {
                    this.f24570b = ((ag) this.f24569a.next()).iterator();
                }
                return this.f24570b.next();
            }
        };
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final Set<K> d() {
        throw new AssertionError("unreachable");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Collection e() {
        return new f(this);
    }

    public ag<Map.Entry<K, V>> entries() {
        return (ag) super.entries();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ bg g() {
        return new d();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Collection h() {
        return new b(this);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> j() {
        throw new AssertionError("should never be called");
    }

    public ar<K> keySet() {
        return this.f24563b.keySet();
    }

    public ap<K> keys() {
        return (ap) super.keys();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public ag<V> values() {
        return (ag) super.values();
    }

    @Beta
    public static <K, V> ao<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return aj.copyOf(iterable);
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return this.f24563b.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean putAll(bd<? extends K, ? extends V> bdVar) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ag<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsValue(@NullableDecl Object obj) {
        if (obj == null || !super.containsValue(obj)) {
            return false;
        }
        return true;
    }

    public static <K, V> ao<K, V> copyOf(bd<? extends K, ? extends V> bdVar) {
        if (bdVar instanceof ao) {
            ao<K, V> aoVar = (ao) bdVar;
            if (!aoVar.a()) {
                return aoVar;
            }
        }
        return aj.copyOf(bdVar);
    }

    ao(ak<K, ? extends ag<V>> akVar, int i) {
        this.f24563b = akVar;
        this.f24564c = i;
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ag<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ao<K, V> of(K k, V v) {
        return aj.of(k, v);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ao<K, V> of(K k, V v, K k2, V v2) {
        return aj.of(k, v, k2, v2);
    }

    public static <K, V> ao<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        return aj.of(k, v, k2, v2, k3, v3);
    }

    public static <K, V> ao<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return aj.of(k, v, k2, v2, k3, v3, k4, v4);
    }

    public static <K, V> ao<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return aj.of(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }
}
