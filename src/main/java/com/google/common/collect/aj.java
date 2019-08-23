package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ai;
import com.google.common.collect.ak;
import com.google.common.collect.ao;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public class aj<K, V> extends ao<K, V> implements ay<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    @RetainedWith
    @LazyInit

    /* renamed from: a  reason: collision with root package name */
    private transient aj<V, K> f24545a;

    public static final class a<K, V> extends ao.a<K, V> {
        /* renamed from: a */
        public final aj<K, V> b() {
            return (aj) super.b();
        }

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: a */
        public final a<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.b(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        public final /* bridge */ /* synthetic */ ao.a a(Map.Entry entry) {
            super.a(entry);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final a<K, V> b(K k, V v) {
            super.b(k, v);
            return this;
        }
    }

    public static <K, V> aj<K, V> of() {
        return s.f24806a;
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public aj<V, K> inverse() {
        aj<V, K> ajVar = this.f24545a;
        if (ajVar != null) {
            return ajVar;
        }
        a builder = builder();
        cg it2 = entries().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            builder.b(entry.getValue(), entry.getKey());
        }
        aj<V, K> a2 = builder.b();
        a2.f24545a = this;
        this.f24545a = a2;
        return a2;
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        bw.a((bd<K, V>) this, objectOutputStream);
    }

    @Beta
    public static <K, V> aj<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().b(iterable).b();
    }

    public ai<V> get(@NullableDecl K k) {
        ai<V> aiVar = (ai) this.f24563b.get(k);
        if (aiVar == null) {
            return ai.of();
        }
        return aiVar;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ai<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> aj<K, V> copyOf(bd<? extends K, ? extends V> bdVar) {
        if (bdVar.isEmpty()) {
            return of();
        }
        if (bdVar instanceof aj) {
            aj<K, V> ajVar = (aj) bdVar;
            if (!ajVar.a()) {
                return ajVar;
            }
        }
        return a(bdVar.asMap().entrySet(), null);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ak.a builder = ak.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ai.a builder2 = ai.builder();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        builder2.b(objectInputStream.readObject());
                    }
                    builder.a(readObject, builder2.a());
                    i2 += readInt2;
                    i++;
                } else {
                    throw new InvalidObjectException("Invalid value count " + readInt2);
                }
            }
            try {
                ao.c.f24575a.a(this, (Object) builder.a());
                ao.c.f24576b.a(this, i2);
            } catch (IllegalArgumentException e2) {
                throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
            }
        } else {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
    }

    aj(ak<K, ai<V>> akVar, int i) {
        super(akVar, i);
    }

    public static <K, V> aj<K, V> of(K k, V v) {
        a builder = builder();
        builder.b(k, v);
        return builder.b();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ai<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    static <K, V> aj<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        ai<E> aiVar;
        if (collection.isEmpty()) {
            return of();
        }
        ak.a aVar = new ak.a(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                aiVar = ai.copyOf(collection2);
            } else {
                aiVar = ai.sortedCopyOf(comparator, collection2);
            }
            if (!aiVar.isEmpty()) {
                aVar.a(key, aiVar);
                i += aiVar.size();
            }
        }
        return new aj<>(aVar.a(), i);
    }

    public static <K, V> aj<K, V> of(K k, V v, K k2, V v2) {
        a builder = builder();
        builder.b(k, v);
        builder.b(k2, v2);
        return builder.b();
    }

    public static <K, V> aj<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        a builder = builder();
        builder.b(k, v);
        builder.b(k2, v2);
        builder.b(k3, v3);
        return builder.b();
    }

    public static <K, V> aj<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        a builder = builder();
        builder.b(k, v);
        builder.b(k2, v2);
        builder.b(k3, v3);
        builder.b(k4, v4);
        return builder.b();
    }

    public static <K, V> aj<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        a builder = builder();
        builder.b(k, v);
        builder.b(k2, v2);
        builder.b(k3, v3);
        builder.b(k4, v4);
        builder.b(k5, v5);
        return builder.b();
    }
}
