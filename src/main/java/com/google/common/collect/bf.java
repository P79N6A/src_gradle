package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.a.n;
import com.google.common.a.o;
import com.google.common.a.s;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.bg;
import com.google.common.collect.bh;
import com.google.common.collect.d;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bf {

    static class a<K, V> extends c<K, V> {
        @GwtIncompatible
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        transient s<? extends List<V>> f24662a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final List<V> b() {
            return (List) this.f24662a.get();
        }

        /* access modifiers changed from: package-private */
        public final Set<K> d() {
            if (this.map instanceof NavigableMap) {
                return new d.e((NavigableMap) this.map);
            }
            if (this.map instanceof SortedMap) {
                return new d.h((SortedMap) this.map);
            }
            return new d.c(this.map);
        }

        /* access modifiers changed from: package-private */
        public final Map<K, Collection<V>> j() {
            if (this.map instanceof NavigableMap) {
                return new d.C0283d((NavigableMap) this.map);
            }
            if (this.map instanceof SortedMap) {
                return new d.g((SortedMap) this.map);
            }
            return new d.a(this.map);
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f24662a);
            objectOutputStream.writeObject(this.map);
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f24662a = (s) objectInputStream.readObject();
            Map<K, Collection<V>> map = (Map) objectInputStream.readObject();
            this.map = map;
            this.totalSize = 0;
            for (Collection isEmpty : map.values()) {
                m.a(!isEmpty.isEmpty());
                this.totalSize += isEmpty.size();
            }
        }

        a(Map<K, Collection<V>> map, s<? extends List<V>> sVar) {
            super(map);
            this.f24662a = (s) m.a(sVar);
        }
    }

    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* access modifiers changed from: package-private */
        public abstract bd<K, V> a();

        b() {
        }

        public void clear() {
            a().clear();
        }

        public int size() {
            return a().size();
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }
    }

    static class c<K, V> extends h<K> {
        @Weak

        /* renamed from: b  reason: collision with root package name */
        final bd<K, V> f24663b;

        /* access modifiers changed from: package-private */
        public final Iterator<K> a() {
            throw new AssertionError("should never be called");
        }

        public void clear() {
            this.f24663b.clear();
        }

        public Set<K> elementSet() {
            return this.f24663b.keySet();
        }

        public int size() {
            return this.f24663b.size();
        }

        /* access modifiers changed from: package-private */
        public final int c() {
            return this.f24663b.asMap().size();
        }

        public Iterator<K> iterator() {
            return bc.a(this.f24663b.entries().iterator());
        }

        /* access modifiers changed from: package-private */
        public final Iterator<bg.a<K>> b() {
            return new cd<Map.Entry<K, Collection<V>>, bg.a<K>>(this.f24663b.asMap().entrySet().iterator()) {
                /* access modifiers changed from: package-private */
                public final /* synthetic */ Object a(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new bh.a<K>() {
                        public final K getElement() {
                            return entry.getKey();
                        }

                        public final int getCount() {
                            return ((Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        c(bd<K, V> bdVar) {
            this.f24663b = bdVar;
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f24663b.containsKey(obj);
        }

        public int count(@NullableDecl Object obj) {
            Collection collection = (Collection) bc.a(this.f24663b.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public int remove(@NullableDecl Object obj, int i) {
            l.a(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) bc.a(this.f24663b.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it2 = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it2.next();
                    it2.remove();
                }
            }
            return size;
        }
    }

    public static <K, V> bd<K, V> a(bd<K, V> bdVar, n<? super Map.Entry<K, V>> nVar) {
        m.a(nVar);
        if (bdVar instanceof bx) {
            bx bxVar = (bx) bdVar;
            m.a(nVar);
            if (!(bxVar instanceof z)) {
                return new w((bx) m.a(bxVar), nVar);
            }
            z zVar = (z) bxVar;
            return new w(zVar.c(), o.a(zVar.b(), nVar));
        } else if (!(bdVar instanceof x)) {
            return new v((bd) m.a(bdVar), nVar);
        } else {
            x xVar = (x) bdVar;
            return new v(xVar.a(), o.a(xVar.b(), nVar));
        }
    }
}
