package com.google.common.collect;

import com.google.common.a.i;
import com.google.common.a.m;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ak;
import com.google.common.collect.ao;
import com.google.common.collect.ar;
import com.google.common.collect.at;
import com.google.common.collect.bw;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public class as<K, V> extends ao<K, V> implements bx<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    private final transient ar<V> f24590a;
    @RetainedWith
    @MonotonicNonNullDecl
    @LazyInit

    /* renamed from: d  reason: collision with root package name */
    private transient as<V, K> f24591d;
    @MonotonicNonNullDecl

    /* renamed from: e  reason: collision with root package name */
    private transient ar<Map.Entry<K, V>> f24592e;

    public static final class a<K, V> extends ao.a<K, V> {
        /* access modifiers changed from: package-private */
        public final Collection<V> c() {
            return o.create();
        }

        /* renamed from: a */
        public final as<K, V> b() {
            Collection entrySet = this.f24572a.entrySet();
            if (this.f24573b != null) {
                entrySet = bn.from(this.f24573b).a().immutableSortedCopy(entrySet);
            }
            return as.a(entrySet, this.f24574c);
        }

        @CanIgnoreReturnValue
        public final /* bridge */ /* synthetic */ ao.a a(Map.Entry entry) {
            super.a(entry);
            return this;
        }

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: a */
        public final a<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.b(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final a<K, V> b(K k, V v) {
            super.b(k, v);
            return this;
        }
    }

    static final class b<K, V> extends ar<Map.Entry<K, V>> {
        @Weak

        /* renamed from: a  reason: collision with root package name */
        private final transient as<K, V> f24593a;

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return false;
        }

        public final cg<Map.Entry<K, V>> iterator() {
            return this.f24593a.i();
        }

        public final int size() {
            return this.f24593a.size();
        }

        b(as<K, V> asVar) {
            this.f24593a = asVar;
        }

        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f24593a.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    @GwtIncompatible
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final bw.a<as> f24594a = bw.a(as.class, "emptySet");
    }

    public static <K, V> as<K, V> of() {
        return t.f24807a;
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public ar<Map.Entry<K, V>> entries() {
        ar<Map.Entry<K, V>> arVar = this.f24592e;
        if (arVar != null) {
            return arVar;
        }
        b bVar = new b(this);
        this.f24592e = bVar;
        return bVar;
    }

    public as<V, K> inverse() {
        as<V, K> asVar = this.f24591d;
        if (asVar != null) {
            return asVar;
        }
        a builder = builder();
        cg it2 = entries().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            builder.b(entry.getValue(), entry.getKey());
        }
        as<V, K> a2 = builder.b();
        a2.f24591d = this;
        this.f24591d = a2;
        return a2;
    }

    private static <V> ar<V> a(@NullableDecl Comparator<? super V> comparator) {
        if (comparator == null) {
            return ar.of();
        }
        return at.a(comparator);
    }

    @Beta
    public static <K, V> as<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().b(iterable).b();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ar<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        if (this.f24590a instanceof at) {
            comparator = ((at) this.f24590a).comparator();
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        bw.a((bd<K, V>) this, objectOutputStream);
    }

    public ar<V> get(@NullableDecl K k) {
        return (ar) i.a((ar) this.f24563b.get(k), this.f24590a);
    }

    public static <K, V> as<K, V> copyOf(bd<? extends K, ? extends V> bdVar) {
        m.a(bdVar);
        if (bdVar.isEmpty()) {
            return of();
        }
        if (bdVar instanceof as) {
            as<K, V> asVar = (as) bdVar;
            if (!asVar.a()) {
                return asVar;
            }
        }
        return a((Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>>) bdVar.asMap().entrySet(), (Comparator<? super V>) null);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ar.a aVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ak.a builder = ak.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        aVar = new ar.a();
                    } else {
                        aVar = new at.a(comparator);
                    }
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        aVar.b(objectInputStream.readObject());
                    }
                    ar a2 = aVar.a();
                    if (a2.size() == readInt2) {
                        builder.a(readObject, a2);
                        i2 += readInt2;
                        i++;
                    } else {
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key " + readObject);
                    }
                } else {
                    throw new InvalidObjectException("Invalid value count " + readInt2);
                }
            }
            try {
                ao.c.f24575a.a(this, (Object) builder.a());
                ao.c.f24576b.a(this, i2);
                c.f24594a.a(this, (Object) a(comparator));
            } catch (IllegalArgumentException e2) {
                throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
            }
        } else {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
    }

    public static <K, V> as<K, V> of(K k, V v) {
        a builder = builder();
        builder.b(k, v);
        return builder.b();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ar<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    private static <V> ar<V> a(@NullableDecl Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return ar.copyOf(collection);
        }
        return at.copyOf(comparator, collection);
    }

    static <K, V> as<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ak.a aVar = new ak.a(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            ar<V> a2 = a(comparator, (Collection) entry.getValue());
            if (!a2.isEmpty()) {
                aVar.a(key, a2);
                i += a2.size();
            }
        }
        return new as<>(aVar.a(), i, comparator);
    }

    as(ak<K, ar<V>> akVar, int i, @NullableDecl Comparator<? super V> comparator) {
        super(akVar, i);
        this.f24590a = a(comparator);
    }

    public static <K, V> as<K, V> of(K k, V v, K k2, V v2) {
        a builder = builder();
        builder.b(k, v);
        builder.b(k2, v2);
        return builder.b();
    }

    public static <K, V> as<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        a builder = builder();
        builder.b(k, v);
        builder.b(k2, v2);
        builder.b(k3, v3);
        return builder.b();
    }

    public static <K, V> as<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        a builder = builder();
        builder.b(k, v);
        builder.b(k2, v2);
        builder.b(k3, v3);
        builder.b(k4, v4);
        return builder.b();
    }

    public static <K, V> as<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        a builder = builder();
        builder.b(k, v);
        builder.b(k2, v2);
        builder.b(k3, v3);
        builder.b(k4, v4);
        builder.b(k5, v5);
        return builder.b();
    }
}
