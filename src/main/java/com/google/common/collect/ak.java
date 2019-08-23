package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ag;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class ak<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f24546a = new Map.Entry[0];
    @LazyInit

    /* renamed from: b  reason: collision with root package name */
    private transient ar<Map.Entry<K, V>> f24547b;
    @LazyInit

    /* renamed from: c  reason: collision with root package name */
    private transient ar<K> f24548c;
    @LazyInit

    /* renamed from: d  reason: collision with root package name */
    private transient ag<V> f24549d;
    @LazyInit

    /* renamed from: e  reason: collision with root package name */
    private transient as<K, V> f24550e;

    public static class a<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f24553a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f24554b;

        /* renamed from: c  reason: collision with root package name */
        int f24555c;

        /* renamed from: d  reason: collision with root package name */
        boolean f24556d;

        public a() {
            this(4);
        }

        public final ak<K, V> a() {
            b();
            this.f24556d = true;
            return bq.a(this.f24555c, this.f24554b);
        }

        private void b() {
            if (this.f24553a != null) {
                if (this.f24556d) {
                    this.f24554b = Arrays.copyOf(this.f24554b, this.f24555c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f24555c];
                for (int i = 0; i < this.f24555c; i++) {
                    int i2 = i * 2;
                    entryArr[i] = new AbstractMap.SimpleImmutableEntry(this.f24554b[i2], this.f24554b[i2 + 1]);
                }
                Arrays.sort(entryArr, 0, this.f24555c, bn.from(this.f24553a).onResultOf(bc.b()));
                for (int i3 = 0; i3 < this.f24555c; i3++) {
                    int i4 = i3 * 2;
                    this.f24554b[i4] = entryArr[i3].getKey();
                    this.f24554b[i4 + 1] = entryArr[i3].getValue();
                }
            }
        }

        a(int i) {
            this.f24554b = new Object[(i * 2)];
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            int i2 = i * 2;
            if (i2 > this.f24554b.length) {
                this.f24554b = Arrays.copyOf(this.f24554b, ag.b.a(this.f24554b.length, i2));
                this.f24556d = false;
            }
        }

        @CanIgnoreReturnValue
        public final a<K, V> a(K k, V v) {
            a(this.f24555c + 1);
            l.a((Object) k, (Object) v);
            this.f24554b[this.f24555c * 2] = k;
            this.f24554b[(this.f24555c * 2) + 1] = v;
            this.f24555c++;
            return this;
        }
    }

    static abstract class b<K, V> extends ak<K, V> {

        class a extends al<K, V> {
            /* access modifiers changed from: package-private */
            public final ak<K, V> a() {
                return b.this;
            }

            public final cg<Map.Entry<K, V>> iterator() {
                return b.this.f();
            }

            a() {
            }
        }

        /* access modifiers changed from: package-private */
        public abstract cg<Map.Entry<K, V>> f();

        b() {
        }

        /* access modifiers changed from: package-private */
        public final ar<Map.Entry<K, V>> a() {
            return new a();
        }

        /* access modifiers changed from: package-private */
        public ar<K> b() {
            return new am(this);
        }

        /* access modifiers changed from: package-private */
        public final ag<V> c() {
            return new an(this);
        }

        public /* bridge */ /* synthetic */ Set entrySet() {
            return ak.super.entrySet();
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return ak.super.keySet();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return ak.super.values();
        }
    }

    final class c extends b<K, ar<V>> {
        /* access modifiers changed from: package-private */
        public final ar<K> b() {
            return ak.this.keySet();
        }

        /* access modifiers changed from: package-private */
        public final boolean d() {
            return ak.this.d();
        }

        /* access modifiers changed from: package-private */
        public final boolean e() {
            return ak.this.e();
        }

        public final int hashCode() {
            return ak.this.hashCode();
        }

        public final int size() {
            return ak.this.size();
        }

        /* access modifiers changed from: package-private */
        public final cg<Map.Entry<K, ar<V>>> f() {
            final cg it2 = ak.this.entrySet().iterator();
            return new cg<Map.Entry<K, ar<V>>>() {
                public final boolean hasNext() {
                    return it2.hasNext();
                }

                public final /* synthetic */ Object next() {
                    final Map.Entry entry = (Map.Entry) it2.next();
                    return new f<K, ar<V>>() {
                        public final K getKey() {
                            return entry.getKey();
                        }

                        public final /* synthetic */ Object getValue() {
                            return ar.of(entry.getValue());
                        }
                    };
                }
            };
        }

        private c() {
        }

        public final boolean containsKey(@NullableDecl Object obj) {
            return ak.this.containsKey(obj);
        }

        public final ar<V> get(@NullableDecl Object obj) {
            Object obj2 = ak.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ar.of(obj2);
        }

        /* synthetic */ c(ak akVar, byte b2) {
            this();
        }
    }

    static class d implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] keys;
        private final Object[] values;

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            a aVar = new a(this.keys.length);
            for (int i = 0; i < this.keys.length; i++) {
                aVar.a(this.keys[i], this.values[i]);
            }
            return aVar.a();
        }

        d(ak<?, ?> akVar) {
            this.keys = new Object[akVar.size()];
            this.values = new Object[akVar.size()];
            cg it2 = akVar.entrySet().iterator();
            int i = 0;
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                this.keys[i] = entry.getKey();
                this.values[i] = entry.getValue();
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract ar<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract ar<K> b();

    /* access modifiers changed from: package-private */
    public abstract ag<V> c();

    /* access modifiers changed from: package-private */
    public abstract boolean d();

    /* access modifiers changed from: package-private */
    public boolean e() {
        return false;
    }

    public abstract V get(@NullableDecl Object obj);

    ak() {
    }

    public static <K, V> ak<K, V> of() {
        return bq.f24691b;
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new d(this);
    }

    public ar<Map.Entry<K, V>> entrySet() {
        ar<Map.Entry<K, V>> arVar = this.f24547b;
        if (arVar != null) {
            return arVar;
        }
        ar<Map.Entry<K, V>> a2 = a();
        this.f24547b = a2;
        return a2;
    }

    public int hashCode() {
        return by.a(entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public ar<K> keySet() {
        ar<K> arVar = this.f24548c;
        if (arVar != null) {
            return arVar;
        }
        ar<K> b2 = b();
        this.f24548c = b2;
        return b2;
    }

    public ag<V> values() {
        ag<V> agVar = this.f24549d;
        if (agVar != null) {
            return agVar;
        }
        ag<V> c2 = c();
        this.f24549d = c2;
        return c2;
    }

    public as<K, V> asMultimap() {
        if (isEmpty()) {
            return as.of();
        }
        as<K, V> asVar = this.f24550e;
        if (asVar != null) {
            return asVar;
        }
        as<K, V> asVar2 = new as<>(new c(this, (byte) 0), size(), null);
        this.f24550e = asVar2;
        return asVar2;
    }

    public String toString() {
        int size = size();
        l.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Beta
    public static <K, V> a<K, V> builderWithExpectedSize(int i) {
        l.a(i, "expectedSize");
        return new a<>(i);
    }

    public boolean containsKey(@NullableDecl Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public static <K, V> ak<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ak) && !(map instanceof SortedMap)) {
            ak<K, V> akVar = (ak) map;
            if (!akVar.d()) {
                return akVar;
            }
        }
        return copyOf((Iterable<? extends Map.Entry<? extends K, ? extends V>>) map.entrySet());
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Beta
    public static <K, V> ak<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int i;
        boolean z = iterable instanceof Collection;
        if (z) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        a aVar = new a(i);
        if (z) {
            aVar.a(aVar.f24555c + ((Collection) iterable).size());
        }
        for (Map.Entry entry : iterable) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ak<K, V> of(K k, V v) {
        l.a((Object) k, (Object) v);
        return bq.a(1, new Object[]{k, v});
    }

    public static <K, V> ak<K, V> of(K k, V v, K k2, V v2) {
        l.a((Object) k, (Object) v);
        l.a((Object) k2, (Object) v2);
        return bq.a(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> ak<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        l.a((Object) k, (Object) v);
        l.a((Object) k2, (Object) v2);
        l.a((Object) k3, (Object) v3);
        return bq.a(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> ak<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        l.a((Object) k, (Object) v);
        l.a((Object) k2, (Object) v2);
        l.a((Object) k3, (Object) v3);
        l.a((Object) k4, (Object) v4);
        return bq.a(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> ak<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        l.a((Object) k, (Object) v);
        l.a((Object) k2, (Object) v2);
        l.a((Object) k3, (Object) v3);
        l.a((Object) k4, (Object) v4);
        l.a((Object) k5, (Object) v5);
        return bq.a(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }
}
