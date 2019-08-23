package com.google.common.b;

import com.google.common.a.f;
import com.google.common.a.m;
import com.google.common.a.s;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.r;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@GwtCompatible
public abstract class d<K, V> {

    static final class a<K, V> extends d<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final f<K, V> computingFunction;

        public a(f<K, V> fVar) {
            this.computingFunction = (f) m.a(fVar);
        }

        public final V load(K k) {
            return this.computingFunction.apply(m.a(k));
        }
    }

    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    static final class c<V> extends d<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final s<V> computingSupplier;

        public c(s<V> sVar) {
            this.computingSupplier = (s) m.a(sVar);
        }

        public final V load(Object obj) {
            m.a(obj);
            return this.computingSupplier.get();
        }
    }

    /* renamed from: com.google.common.b.d$d  reason: collision with other inner class name */
    public static final class C0280d extends UnsupportedOperationException {
        C0280d() {
        }
    }

    public abstract V load(K k) throws Exception;

    protected d() {
    }

    public static <K, V> d<K, V> from(f<K, V> fVar) {
        return new a(fVar);
    }

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new C0280d();
    }

    public static <V> d<Object, V> from(s<V> sVar) {
        return new c(sVar);
    }

    @GwtIncompatible
    public static <K, V> d<K, V> asyncReloading(d<K, V> dVar, final Executor executor) {
        m.a(dVar);
        m.a(executor);
        return new d<K, V>(dVar) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f24438a;

            public final V load(K k) throws Exception {
                return this.f24438a.load(k);
            }

            public final Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
                return this.f24438a.loadAll(iterable);
            }

            {
                this.f24438a = r1;
            }

            public final q<V> reload(final K k, final V v) throws Exception {
                r rVar = new r(new Callable<V>() {
                    public final V call() throws Exception {
                        return AnonymousClass1.this.f24438a.reload(k, v).get();
                    }
                });
                executor.execute(rVar);
                return rVar;
            }
        };
    }

    @GwtIncompatible
    public q<V> reload(K k, V v) throws Exception {
        m.a(k);
        m.a(v);
        return l.a(load(k));
    }
}
