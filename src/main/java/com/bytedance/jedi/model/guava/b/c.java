package com.bytedance.jedi.model.guava.b;

import android.support.annotation.GuardedBy;
import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import com.bytedance.jedi.model.guava.annotations.GwtIncompatible;
import com.bytedance.jedi.model.guava.annotations.MonotonicNonNullDecl;
import com.bytedance.jedi.model.guava.annotations.NullableDecl;
import com.bytedance.jedi.model.guava.annotations.VisibleForTesting;
import com.bytedance.jedi.model.guava.annotations.Weak;
import com.bytedance.jedi.model.guava.b.b;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
public class c<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f21637a = Logger.getLogger(c.class.getName());
    static final u<Object, Object> s = new u<Object, Object>() {
        public final int a() {
            return 0;
        }

        public final u<Object, Object> a(ReferenceQueue<Object> referenceQueue, @NullableDecl Object obj, d<Object, Object> dVar) {
            return this;
        }

        public final d<Object, Object> b() {
            return null;
        }

        public final boolean c() {
            return false;
        }

        public final Object get() {
            return null;
        }
    };
    static final Queue<?> t = new AbstractQueue<Object>() {
        public final boolean offer(Object obj) {
            return true;
        }

        public final Object peek() {
            return null;
        }

        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }

        public final Iterator<Object> iterator() {
            return new HashSet().iterator();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    final int f21638b;

    /* renamed from: c  reason: collision with root package name */
    final int f21639c;

    /* renamed from: d  reason: collision with root package name */
    final l<K, V>[] f21640d;

    /* renamed from: e  reason: collision with root package name */
    final int f21641e;

    /* renamed from: f  reason: collision with root package name */
    final com.bytedance.jedi.model.guava.a.a<Object> f21642f;
    final com.bytedance.jedi.model.guava.a.a<Object> g;
    final n h;
    final n i;
    final long j;
    final h<K, V> k;
    final long l;
    final long m;
    final long n;
    final Queue<g<K, V>> o;
    final f<K, V> p;
    final com.bytedance.jedi.model.guava.a.f q;
    final d r;
    @MonotonicNonNullDecl
    Set<K> u;
    @MonotonicNonNullDecl
    Collection<V> v;
    @MonotonicNonNullDecl
    Set<Map.Entry<K, V>> w;

    abstract class a<T> extends AbstractSet<T> {
        @Weak

        /* renamed from: a  reason: collision with root package name */
        final ConcurrentMap<?, ?> f21643a;

        public void clear() {
            this.f21643a.clear();
        }

        public boolean isEmpty() {
            return this.f21643a.isEmpty();
        }

        public int size() {
            return this.f21643a.size();
        }

        public Object[] toArray() {
            return c.a((Collection<E>) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return c.a((Collection<E>) this).toArray(eArr);
        }

        a(ConcurrentMap<?, ?> concurrentMap) {
            this.f21643a = concurrentMap;
        }
    }

    static final class aa<K, V> extends y<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f21645a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f21646b = c.j();

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f21647c = c.j();

        public final d<K, V> getNextInWriteQueue() {
            return this.f21646b;
        }

        public final d<K, V> getPreviousInWriteQueue() {
            return this.f21647c;
        }

        public final long getWriteTime() {
            return this.f21645a;
        }

        public final void setNextInWriteQueue(d<K, V> dVar) {
            this.f21646b = dVar;
        }

        public final void setPreviousInWriteQueue(d<K, V> dVar) {
            this.f21647c = dVar;
        }

        public final void setWriteTime(long j) {
            this.f21645a = j;
        }

        aa(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    static final class ab<K, V> extends m<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final int f21648b;

        public final int a() {
            return this.f21648b;
        }

        public final u<K, V> a(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            return new ab(referenceQueue, v, dVar, this.f21648b);
        }

        ab(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar, int i) {
            super(referenceQueue, v, dVar);
            this.f21648b = i;
        }
    }

    static final class ac<K, V> extends r<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final int f21649b;

        public final int a() {
            return this.f21649b;
        }

        ac(V v, int i) {
            super(v);
            this.f21649b = i;
        }
    }

    static final class ad<K, V> extends z<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final int f21650b;

        public final int a() {
            return this.f21650b;
        }

        public final u<K, V> a(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            return new ad(referenceQueue, v, dVar, this.f21650b);
        }

        ad(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar, int i) {
            super(referenceQueue, v, dVar);
            this.f21650b = i;
        }
    }

    static final class ae<K, V> extends AbstractQueue<d<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final d<K, V> f21651a = new b<K, V>() {

            /* renamed from: a  reason: collision with root package name */
            d<K, V> f21652a = this;

            /* renamed from: b  reason: collision with root package name */
            d<K, V> f21653b = this;

            public final long getWriteTime() {
                return Long.MAX_VALUE;
            }

            public final void setWriteTime(long j) {
            }

            public final d<K, V> getNextInWriteQueue() {
                return this.f21652a;
            }

            public final d<K, V> getPreviousInWriteQueue() {
                return this.f21653b;
            }

            public final void setNextInWriteQueue(d<K, V> dVar) {
                this.f21652a = dVar;
            }

            public final void setPreviousInWriteQueue(d<K, V> dVar) {
                this.f21653b = dVar;
            }
        };

        ae() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public d<K, V> peek() {
            d<K, V> nextInWriteQueue = this.f21651a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f21651a) {
                return null;
            }
            return nextInWriteQueue;
        }

        public final boolean isEmpty() {
            if (this.f21651a.getNextInWriteQueue() == this.f21651a) {
                return true;
            }
            return false;
        }

        public final Iterator<d<K, V>> iterator() {
            return new com.bytedance.jedi.model.guava.c.a<d<K, V>>(peek()) {
                public final /* synthetic */ Object a(Object obj) {
                    d<K, V> nextInWriteQueue = ((d) obj).getNextInWriteQueue();
                    if (nextInWriteQueue == ae.this.f21651a) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            d<K, V> nextInWriteQueue = this.f21651a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f21651a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        public final int size() {
            int i = 0;
            for (d<K, V> nextInWriteQueue = this.f21651a.getNextInWriteQueue(); nextInWriteQueue != this.f21651a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            d<K, V> nextInWriteQueue = this.f21651a.getNextInWriteQueue();
            while (nextInWriteQueue != this.f21651a) {
                d<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                c.c(nextInWriteQueue);
                nextInWriteQueue = nextInWriteQueue2;
            }
            this.f21651a.setNextInWriteQueue(this.f21651a);
            this.f21651a.setPreviousInWriteQueue(this.f21651a);
        }

        public final boolean contains(Object obj) {
            if (((d) obj).getNextInWriteQueue() != k.INSTANCE) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ boolean offer(Object obj) {
            d dVar = (d) obj;
            c.b(dVar.getPreviousInWriteQueue(), dVar.getNextInWriteQueue());
            c.b(this.f21651a.getPreviousInWriteQueue(), dVar);
            c.b(dVar, this.f21651a);
            return true;
        }

        public final boolean remove(Object obj) {
            d dVar = (d) obj;
            d previousInWriteQueue = dVar.getPreviousInWriteQueue();
            d nextInWriteQueue = dVar.getNextInWriteQueue();
            c.b(previousInWriteQueue, nextInWriteQueue);
            c.c(dVar);
            if (nextInWriteQueue != k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    final class af implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f21656a;

        /* renamed from: b  reason: collision with root package name */
        V f21657b;

        public final K getKey() {
            return this.f21656a;
        }

        public final V getValue() {
            return this.f21657b;
        }

        public final int hashCode() {
            return this.f21656a.hashCode() ^ this.f21657b.hashCode();
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        public final V setValue(V v) {
            V put = c.this.put(this.f21656a, v);
            this.f21657b = v;
            return put;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f21656a.equals(entry.getKey()) || !this.f21657b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        af(K k, V v) {
            this.f21656a = k;
            this.f21657b = v;
        }
    }

    static abstract class b<K, V> implements d<K, V> {
        b() {
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public int getHash() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            throw new UnsupportedOperationException();
        }

        public d<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        public d<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public d<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public d<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public d<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public u<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(u<K, V> uVar) {
            throw new UnsupportedOperationException();
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.b.c$c  reason: collision with other inner class name */
    static final class C0220c<K, V> extends AbstractQueue<d<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final d<K, V> f21659a = new b<K, V>() {

            /* renamed from: a  reason: collision with root package name */
            d<K, V> f21660a = this;

            /* renamed from: b  reason: collision with root package name */
            d<K, V> f21661b = this;

            public final long getAccessTime() {
                return Long.MAX_VALUE;
            }

            public final void setAccessTime(long j) {
            }

            public final d<K, V> getNextInAccessQueue() {
                return this.f21660a;
            }

            public final d<K, V> getPreviousInAccessQueue() {
                return this.f21661b;
            }

            public final void setNextInAccessQueue(d<K, V> dVar) {
                this.f21660a = dVar;
            }

            public final void setPreviousInAccessQueue(d<K, V> dVar) {
                this.f21661b = dVar;
            }
        };

        C0220c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public d<K, V> peek() {
            d<K, V> nextInAccessQueue = this.f21659a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f21659a) {
                return null;
            }
            return nextInAccessQueue;
        }

        public final boolean isEmpty() {
            if (this.f21659a.getNextInAccessQueue() == this.f21659a) {
                return true;
            }
            return false;
        }

        public final Iterator<d<K, V>> iterator() {
            return new com.bytedance.jedi.model.guava.c.a<d<K, V>>(peek()) {
                public final /* synthetic */ Object a(Object obj) {
                    d<K, V> nextInAccessQueue = ((d) obj).getNextInAccessQueue();
                    if (nextInAccessQueue == C0220c.this.f21659a) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            d<K, V> nextInAccessQueue = this.f21659a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f21659a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        public final int size() {
            int i = 0;
            for (d<K, V> nextInAccessQueue = this.f21659a.getNextInAccessQueue(); nextInAccessQueue != this.f21659a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            d<K, V> nextInAccessQueue = this.f21659a.getNextInAccessQueue();
            while (nextInAccessQueue != this.f21659a) {
                d<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                c.b(nextInAccessQueue);
                nextInAccessQueue = nextInAccessQueue2;
            }
            this.f21659a.setNextInAccessQueue(this.f21659a);
            this.f21659a.setPreviousInAccessQueue(this.f21659a);
        }

        public final boolean contains(Object obj) {
            if (((d) obj).getNextInAccessQueue() != k.INSTANCE) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ boolean offer(Object obj) {
            d dVar = (d) obj;
            c.a(dVar.getPreviousInAccessQueue(), dVar.getNextInAccessQueue());
            c.a(this.f21659a.getPreviousInAccessQueue(), dVar);
            c.a(dVar, this.f21659a);
            return true;
        }

        public final boolean remove(Object obj) {
            d dVar = (d) obj;
            d previousInAccessQueue = dVar.getPreviousInAccessQueue();
            d nextInAccessQueue = dVar.getNextInAccessQueue();
            c.a(previousInAccessQueue, nextInAccessQueue);
            c.b(dVar);
            if (nextInAccessQueue != k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    enum d {
        STRONG {
            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> newEntry(l<K, V> lVar, K k, int i, @NullableDecl d<K, V> dVar) {
                return new q(k, i, dVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> copyEntry(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> copyEntry = super.copyEntry(lVar, dVar, dVar2);
                copyAccessEntry(dVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> newEntry(l<K, V> lVar, K k, int i, @NullableDecl d<K, V> dVar) {
                return new o(k, i, dVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> copyEntry(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> copyEntry = super.copyEntry(lVar, dVar, dVar2);
                copyWriteEntry(dVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> newEntry(l<K, V> lVar, K k, int i, @NullableDecl d<K, V> dVar) {
                return new s(k, i, dVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> copyEntry(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> copyEntry = super.copyEntry(lVar, dVar, dVar2);
                copyAccessEntry(dVar, copyEntry);
                copyWriteEntry(dVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> newEntry(l<K, V> lVar, K k, int i, @NullableDecl d<K, V> dVar) {
                return new p(k, i, dVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> newEntry(l<K, V> lVar, K k, int i, @NullableDecl d<K, V> dVar) {
                return new y(lVar.keyReferenceQueue, k, i, dVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> copyEntry(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> copyEntry = super.copyEntry(lVar, dVar, dVar2);
                copyAccessEntry(dVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> newEntry(l<K, V> lVar, K k, int i, @NullableDecl d<K, V> dVar) {
                return new w(lVar.keyReferenceQueue, k, i, dVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> copyEntry(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> copyEntry = super.copyEntry(lVar, dVar, dVar2);
                copyWriteEntry(dVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> newEntry(l<K, V> lVar, K k, int i, @NullableDecl d<K, V> dVar) {
                return new aa(lVar.keyReferenceQueue, k, i, dVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> copyEntry(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> copyEntry = super.copyEntry(lVar, dVar, dVar2);
                copyAccessEntry(dVar, copyEntry);
                copyWriteEntry(dVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> d<K, V> newEntry(l<K, V> lVar, K k, int i, @NullableDecl d<K, V> dVar) {
                return new x(lVar.keyReferenceQueue, k, i, dVar);
            }
        };
        
        static final d[] factories = null;

        /* access modifiers changed from: package-private */
        public abstract <K, V> d<K, V> newEntry(l<K, V> lVar, K k, int i, @NullableDecl d<K, V> dVar);

        static {
            factories = new d[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        /* access modifiers changed from: package-private */
        public <K, V> void copyAccessEntry(d<K, V> dVar, d<K, V> dVar2) {
            dVar2.setAccessTime(dVar.getAccessTime());
            c.a(dVar.getPreviousInAccessQueue(), dVar2);
            c.a(dVar2, dVar.getNextInAccessQueue());
            c.b(dVar);
        }

        /* access modifiers changed from: package-private */
        public <K, V> void copyWriteEntry(d<K, V> dVar, d<K, V> dVar2) {
            dVar2.setWriteTime(dVar.getWriteTime());
            c.b(dVar.getPreviousInWriteQueue(), dVar2);
            c.b(dVar2, dVar.getNextInWriteQueue());
            c.c(dVar);
        }

        /* access modifiers changed from: package-private */
        public <K, V> d<K, V> copyEntry(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
            return newEntry(lVar, dVar.getKey(), dVar.getHash(), dVar2);
        }

        static d getFactory(n nVar, boolean z, boolean z2) {
            char c2;
            char c3 = 0;
            if (nVar == n.WEAK) {
                c2 = 4;
            } else {
                c2 = 0;
            }
            boolean z3 = c2 | z;
            if (z2) {
                c3 = 2;
            }
            return factories[z3 | c3];
        }
    }

    final class e extends g<Map.Entry<K, V>> {
        public final /* synthetic */ Object next() {
            return a();
        }

        e() {
            super();
        }
    }

    final class f extends a<Map.Entry<K, V>> {
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (key == null || !c.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            Object obj2 = c.this.get(key);
            if (obj2 == null || !c.this.g.equivalent(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    abstract class g<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        int f21666b;

        /* renamed from: c  reason: collision with root package name */
        int f21667c = -1;
        @MonotonicNonNullDecl

        /* renamed from: d  reason: collision with root package name */
        l<K, V> f21668d;
        @MonotonicNonNullDecl

        /* renamed from: e  reason: collision with root package name */
        AtomicReferenceArray<d<K, V>> f21669e;
        @NullableDecl

        /* renamed from: f  reason: collision with root package name */
        d<K, V> f21670f;
        @NullableDecl
        af g;
        @NullableDecl
        af h;

        public boolean hasNext() {
            if (this.g != null) {
                return true;
            }
            return false;
        }

        private boolean c() {
            if (this.f21670f != null) {
                do {
                    this.f21670f = this.f21670f.getNext();
                    if (this.f21670f != null) {
                    }
                } while (!a(this.f21670f));
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final af a() {
            if (this.g != null) {
                this.h = this.g;
                b();
                return this.h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            if (this.h != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c.this.remove(this.h.getKey());
                this.h = null;
                return;
            }
            throw new IllegalStateException();
        }

        private boolean d() {
            while (this.f21667c >= 0) {
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.f21669e;
                int i2 = this.f21667c;
                this.f21667c = i2 - 1;
                d<K, V> dVar = atomicReferenceArray.get(i2);
                this.f21670f = dVar;
                if (dVar != null && (a(this.f21670f) || c())) {
                    return true;
                }
            }
            return false;
        }

        private void b() {
            this.g = null;
            if (!c() && !d()) {
                while (this.f21666b >= 0) {
                    l<K, V>[] lVarArr = c.this.f21640d;
                    int i2 = this.f21666b;
                    this.f21666b = i2 - 1;
                    this.f21668d = lVarArr[i2];
                    if (this.f21668d.count != 0) {
                        this.f21669e = this.f21668d.table;
                        this.f21667c = this.f21669e.length() - 1;
                        if (d()) {
                            return;
                        }
                    }
                }
            }
        }

        g() {
            this.f21666b = r1.f21640d.length - 1;
            b();
        }

        /* JADX INFO: finally extract failed */
        private boolean a(d<K, V> dVar) {
            try {
                long a2 = c.this.q.a();
                Object key = dVar.getKey();
                c cVar = c.this;
                Object obj = null;
                if (dVar.getKey() != null) {
                    Object obj2 = dVar.getValueReference().get();
                    if (obj2 != null) {
                        if (!cVar.a(dVar, a2)) {
                            obj = obj2;
                        }
                    }
                }
                if (obj != null) {
                    this.g = new af<>(key, obj);
                    this.f21668d.b();
                    return true;
                }
                this.f21668d.b();
                return false;
            } catch (Throwable th) {
                this.f21668d.b();
                throw th;
            }
        }
    }

    final class h extends g<K> {
        public final K next() {
            return a().getKey();
        }

        h() {
            super();
        }
    }

    final class i extends a<K> {
        public final Iterator<K> iterator() {
            return new h();
        }

        public final boolean contains(Object obj) {
            return this.f21643a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f21643a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    static class j<K, V> implements a<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final c<K, V> localCache;

        public final ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        public final void invalidateAll() {
            this.localCache.clear();
        }

        public final long size() {
            return this.localCache.m();
        }

        public final void cleanUp() {
            for (l<K, V> d2 : this.localCache.f21640d) {
                d2.d();
            }
        }

        private j(c<K, V> cVar) {
            this.localCache = cVar;
        }

        public final void putAll(Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        j(b<? super K, ? super V> bVar) {
            this(new c<>(bVar));
        }

        public final void invalidate(Object obj) {
            com.bytedance.jedi.model.guava.a.c.a(obj);
            this.localCache.remove(obj);
        }

        @NullableDecl
        public final V getIfPresent(Object obj) {
            c<K, V> cVar = this.localCache;
            int a2 = cVar.a(com.bytedance.jedi.model.guava.a.c.a(obj));
            return cVar.a(a2).a(obj, a2);
        }

        public final void invalidateAll(Iterable<?> iterable) {
            c<K, V> cVar = this.localCache;
            for (Object remove : iterable) {
                cVar.remove(remove);
            }
        }

        public final void put(K k, V v) {
            this.localCache.put(k, v);
        }
    }

    enum k implements d<Object, Object> {
        INSTANCE;

        public final long getAccessTime() {
            return 0;
        }

        public final int getHash() {
            return 0;
        }

        public final Object getKey() {
            return null;
        }

        public final d<Object, Object> getNext() {
            return null;
        }

        public final d<Object, Object> getNextInAccessQueue() {
            return this;
        }

        public final d<Object, Object> getNextInWriteQueue() {
            return this;
        }

        public final d<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        public final d<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        public final u<Object, Object> getValueReference() {
            return null;
        }

        public final long getWriteTime() {
            return 0;
        }

        public final void setAccessTime(long j) {
        }

        public final void setNextInAccessQueue(d<Object, Object> dVar) {
        }

        public final void setNextInWriteQueue(d<Object, Object> dVar) {
        }

        public final void setPreviousInAccessQueue(d<Object, Object> dVar) {
        }

        public final void setPreviousInWriteQueue(d<Object, Object> dVar) {
        }

        public final void setValueReference(u<Object, Object> uVar) {
        }

        public final void setWriteTime(long j) {
        }
    }

    static class l<K, V> extends ReentrantLock {
        @GuardedBy("this")
        final Queue<d<K, V>> accessQueue;
        volatile int count;
        @NullableDecl
        final ReferenceQueue<K> keyReferenceQueue;
        @Weak
        final c<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<d<K, V>> recencyQueue;
        @MonotonicNonNullDecl
        volatile AtomicReferenceArray<d<K, V>> table;
        int threshold;
        @GuardedBy("this")
        long totalWeight;
        @NullableDecl
        final ReferenceQueue<V> valueReferenceQueue;
        @GuardedBy("this")
        final Queue<d<K, V>> writeQueue;

        /* access modifiers changed from: package-private */
        public final void c() {
            j();
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final V a(Object obj, int i) {
            try {
                if (this.count != 0) {
                    long a2 = this.map.q.a();
                    d a3 = a(obj, i, a2);
                    if (a3 == null) {
                        return null;
                    }
                    V v = a3.getValueReference().get();
                    if (v != null) {
                        if (this.map.f()) {
                            a3.setAccessTime(a2);
                        }
                        this.recencyQueue.add(a3);
                        b();
                        return v;
                    }
                    a();
                }
                b();
                return null;
            } finally {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (tryLock()) {
                try {
                    e();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(long j) {
            if (tryLock()) {
                try {
                    c(j);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy("this")
        public final void a(@NullableDecl K k, @NullableDecl V v, int i, e eVar) {
            this.totalWeight -= (long) i;
            if (this.map.o != c.t) {
                this.map.o.offer(g.create(k, v, eVar));
            }
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final V a(K k, int i, V v, boolean z) {
            int i2;
            K k2 = k;
            int i3 = i;
            lock();
            try {
                long a2 = this.map.q.a();
                b(a2);
                if (this.count + 1 > this.threshold) {
                    AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    if (length < 1073741824) {
                        int i4 = this.count;
                        AtomicReferenceArray<d<K, V>> a3 = a(length << 1);
                        this.threshold = (a3.length() * 3) / 4;
                        int length2 = a3.length() - 1;
                        for (int i5 = 0; i5 < length; i5++) {
                            d dVar = atomicReferenceArray.get(i5);
                            if (dVar != null) {
                                d next = dVar.getNext();
                                int hash = dVar.getHash() & length2;
                                if (next == null) {
                                    a3.set(hash, dVar);
                                } else {
                                    d dVar2 = dVar;
                                    while (next != null) {
                                        int hash2 = next.getHash() & length2;
                                        if (hash2 != hash) {
                                            dVar2 = next;
                                            hash = hash2;
                                        }
                                        next = next.getNext();
                                    }
                                    a3.set(hash, dVar2);
                                    while (dVar != dVar2) {
                                        int hash3 = dVar.getHash() & length2;
                                        d a4 = a(dVar, a3.get(hash3));
                                        if (a4 != null) {
                                            a3.set(hash3, a4);
                                        } else {
                                            b(dVar);
                                            i4--;
                                        }
                                        dVar = dVar.getNext();
                                    }
                                }
                            }
                        }
                        this.table = a3;
                        this.count = i4;
                    }
                    int i6 = this.count;
                }
                AtomicReferenceArray<d<K, V>> atomicReferenceArray2 = this.table;
                int length3 = i3 & (atomicReferenceArray2.length() - 1);
                d dVar3 = atomicReferenceArray2.get(length3);
                d dVar4 = dVar3;
                while (dVar4 != null) {
                    Object key = dVar4.getKey();
                    if (dVar4.getHash() != i3 || key == null || !this.map.f21642f.equivalent(k2, key)) {
                        dVar4 = dVar4.getNext();
                    } else {
                        u valueReference = dVar4.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 == null) {
                            this.modCount++;
                            if (valueReference.c()) {
                                a(k2, v2, valueReference.a(), e.COLLECTED);
                                a(dVar4, k, v, a2);
                                i2 = this.count;
                            } else {
                                a(dVar4, k, v, a2);
                                i2 = this.count + 1;
                            }
                            this.count = i2;
                            a(dVar4);
                            return null;
                        } else if (z) {
                            a(dVar4, a2);
                            unlock();
                            c();
                            return v2;
                        } else {
                            this.modCount++;
                            a(k2, v2, valueReference.a(), e.REPLACED);
                            a(dVar4, k, v, a2);
                            a(dVar4);
                            unlock();
                            c();
                            return v2;
                        }
                    }
                }
                this.modCount++;
                d newEntry = this.map.r.newEntry(this, com.bytedance.jedi.model.guava.a.c.a(k), i3, dVar3);
                a(newEntry, k, v, a2);
                atomicReferenceArray2.set(length3, newEntry);
                this.count++;
                a(newEntry);
                unlock();
                c();
                return null;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(K k, int i, V v, V v2) {
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a2 = this.map.q.a();
                b(a2);
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                d dVar = atomicReferenceArray.get(length);
                d dVar2 = dVar;
                while (dVar2 != null) {
                    Object key = dVar2.getKey();
                    if (dVar2.getHash() != i2 || key == null || !this.map.f21642f.equivalent(k2, key)) {
                        V v3 = v;
                        dVar2 = dVar2.getNext();
                    } else {
                        u valueReference = dVar2.getValueReference();
                        Object obj = valueReference.get();
                        if (obj == null) {
                            if (valueReference.c()) {
                                int i3 = this.count;
                                this.modCount++;
                                atomicReferenceArray.set(length, a(dVar, dVar2, key, i, obj, valueReference, e.COLLECTED));
                                this.count--;
                            }
                            return false;
                        } else if (this.map.g.equivalent(v, obj)) {
                            this.modCount++;
                            a(k2, (V) obj, valueReference.a(), e.REPLACED);
                            a(dVar2, k, v2, a2);
                            a(dVar2);
                            unlock();
                            c();
                            return true;
                        } else {
                            a(dVar2, a2);
                            unlock();
                            c();
                            return false;
                        }
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final V a(K k, int i, V v) {
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a2 = this.map.q.a();
                b(a2);
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                d dVar = atomicReferenceArray.get(length);
                d dVar2 = dVar;
                while (dVar2 != null) {
                    Object key = dVar2.getKey();
                    if (dVar2.getHash() != i2 || key == null || !this.map.f21642f.equivalent(k2, key)) {
                        dVar2 = dVar2.getNext();
                    } else {
                        u valueReference = dVar2.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 == null) {
                            if (valueReference.c()) {
                                int i3 = this.count;
                                this.modCount++;
                                atomicReferenceArray.set(length, a(dVar, dVar2, key, i, v2, valueReference, e.COLLECTED));
                                this.count--;
                            }
                            return null;
                        }
                        this.modCount++;
                        a(k2, v2, valueReference.a(), e.REPLACED);
                        a(dVar2, k, v, a2);
                        a(dVar2);
                        unlock();
                        c();
                        return v2;
                    }
                }
                unlock();
                c();
                return null;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(d<K, V> dVar, int i) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                d<K, V> dVar2 = atomicReferenceArray.get(length);
                for (d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.getNext()) {
                    if (dVar3 == dVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, a(dVar2, dVar3, dVar3.getKey(), i, dVar3.getValueReference().get(), dVar3.getValueReference(), e.COLLECTED));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(K k, int i, u<K, V> uVar) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                d dVar = atomicReferenceArray.get(length);
                d dVar2 = dVar;
                while (dVar2 != null) {
                    Object key = dVar2.getKey();
                    if (dVar2.getHash() != i || key == null || !this.map.f21642f.equivalent(k, key)) {
                        dVar2 = dVar2.getNext();
                    } else if (dVar2.getValueReference() == uVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, a(dVar, dVar2, key, i, uVar.get(), uVar, e.COLLECTED));
                        this.count--;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            c();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    c();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    c();
                }
            }
        }

        private void j() {
            if (!isHeldByCurrentThread()) {
                this.map.l();
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                d();
            }
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            d(this.map.q.a());
            j();
        }

        @GuardedBy("this")
        private void e() {
            if (this.map.g()) {
                f();
            }
            if (this.map.h()) {
                g();
            }
        }

        @GuardedBy("this")
        private void f() {
            int i = 0;
            do {
                Reference<? extends T> poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((d) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        private void g() {
            int i = 0;
            do {
                Reference<? extends T> poll = this.valueReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((u) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        private void h() {
            while (true) {
                d poll = this.recencyQueue.poll();
                if (poll == null) {
                    return;
                }
                if (this.accessQueue.contains(poll)) {
                    this.accessQueue.add(poll);
                }
            }
        }

        @GuardedBy("this")
        private d<K, V> i() {
            for (d<K, V> dVar : this.accessQueue) {
                if (dVar.getValueReference().a() > 0) {
                    return dVar;
                }
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        @GuardedBy("this")
        public final void b(long j) {
            d(j);
        }

        private static AtomicReferenceArray<d<K, V>> a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        private void d(long j) {
            if (tryLock()) {
                try {
                    e();
                    c(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        @GuardedBy("this")
        private void b(d<K, V> dVar) {
            Object key = dVar.getKey();
            dVar.getHash();
            a((K) key, (V) dVar.getValueReference().get(), dVar.getValueReference().a(), e.COLLECTED);
            this.writeQueue.remove(dVar);
            this.accessQueue.remove(dVar);
        }

        @GuardedBy("this")
        private void c(long j) {
            d peek;
            d peek2;
            h();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.a(peek, j)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.a(peek2, j)) {
                            return;
                        }
                    } while (a(peek2, peek2.getHash(), e.EXPIRED));
                    throw new AssertionError();
                }
            } while (a(peek, peek.getHash(), e.EXPIRED));
            throw new AssertionError();
        }

        @GuardedBy("this")
        private void a(d<K, V> dVar) {
            if (this.map.a()) {
                h();
                if (((long) dVar.getValueReference().a()) <= this.maxSegmentWeight || a(dVar, dVar.getHash(), e.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        d i = i();
                        if (!a(i, i.getHash(), e.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        @NullableDecl
        @GuardedBy("this")
        private d<K, V> b(d<K, V> dVar, d<K, V> dVar2) {
            int i = this.count;
            d<K, V> next = dVar2.getNext();
            while (dVar != dVar2) {
                d<K, V> a2 = a(dVar, next);
                if (a2 != null) {
                    next = a2;
                } else {
                    b(dVar);
                    i--;
                }
                dVar = dVar.getNext();
            }
            this.count = i;
            return next;
        }

        @GuardedBy("this")
        private d<K, V> a(d<K, V> dVar, d<K, V> dVar2) {
            if (dVar.getKey() == null) {
                return null;
            }
            u valueReference = dVar.getValueReference();
            Object obj = valueReference.get();
            if (obj == null && valueReference.c()) {
                return null;
            }
            d<K, V> copyEntry = this.map.r.copyEntry(this, dVar, dVar2);
            copyEntry.setValueReference(valueReference.a(this.valueReferenceQueue, obj, copyEntry));
            return copyEntry;
        }

        @NullableDecl
        private d<K, V> d(Object obj, int i) {
            AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
            for (d<K, V> dVar = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); dVar != null; dVar = dVar.getNext()) {
                if (dVar.getHash() == i) {
                    Object key = dVar.getKey();
                    if (key == null) {
                        a();
                    } else if (this.map.f21642f.equivalent(obj, key)) {
                        return dVar;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    d a2 = a(obj, i, this.map.q.a());
                    if (a2 == null) {
                        return false;
                    }
                    if (a2.getValueReference().get() != null) {
                        z = true;
                    }
                    b();
                    return z;
                }
                b();
                return false;
            } finally {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final V c(Object obj, int i) {
            e eVar;
            lock();
            try {
                b(this.map.q.a());
                int i2 = this.count;
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                d dVar = atomicReferenceArray.get(length);
                d dVar2 = dVar;
                while (dVar2 != null) {
                    Object key = dVar2.getKey();
                    if (dVar2.getHash() != i || key == null || !this.map.f21642f.equivalent(obj, key)) {
                        dVar2 = dVar2.getNext();
                    } else {
                        u valueReference = dVar2.getValueReference();
                        V v = valueReference.get();
                        if (v != null) {
                            eVar = e.EXPLICIT;
                        } else if (valueReference.c()) {
                            eVar = e.COLLECTED;
                        } else {
                            unlock();
                            c();
                            return null;
                        }
                        e eVar2 = eVar;
                        this.modCount++;
                        atomicReferenceArray.set(length, a(dVar, dVar2, key, i, v, valueReference, eVar2));
                        this.count--;
                        return v;
                    }
                }
                unlock();
                c();
                return null;
            } finally {
                unlock();
                c();
            }
        }

        @GuardedBy("this")
        private void a(d<K, V> dVar, long j) {
            if (this.map.f()) {
                dVar.setAccessTime(j);
            }
            this.accessQueue.add(dVar);
        }

        @NullableDecl
        private d<K, V> a(Object obj, int i, long j) {
            d<K, V> d2 = d(obj, i);
            if (d2 == null) {
                return null;
            }
            if (!this.map.a(d2, j)) {
                return d2;
            }
            a(j);
            return null;
        }

        l(c<K, V> cVar, int i, long j) {
            ReferenceQueue<K> referenceQueue;
            Queue<d<K, V>> queue;
            Queue<d<K, V>> queue2;
            Queue<d<K, V>> queue3;
            this.map = cVar;
            this.maxSegmentWeight = j;
            AtomicReferenceArray<d<K, V>> a2 = a(i);
            this.threshold = (a2.length() * 3) / 4;
            if (!this.map.b() && ((long) this.threshold) == this.maxSegmentWeight) {
                this.threshold++;
            }
            this.table = a2;
            ReferenceQueue<V> referenceQueue2 = null;
            if (cVar.g()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.keyReferenceQueue = referenceQueue;
            this.valueReferenceQueue = cVar.h() ? new ReferenceQueue<>() : referenceQueue2;
            if (cVar.c()) {
                queue = new ConcurrentLinkedQueue<>();
            } else {
                queue = c.k();
            }
            this.recencyQueue = queue;
            if (cVar.d()) {
                queue2 = new ae<>();
            } else {
                queue2 = c.k();
            }
            this.writeQueue = queue2;
            if (cVar.c()) {
                queue3 = new C0220c<>();
            } else {
                queue3 = c.k();
            }
            this.accessQueue = queue3;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Object obj, int i, Object obj2) {
            e eVar;
            lock();
            try {
                b(this.map.q.a());
                int i2 = this.count;
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                d dVar = atomicReferenceArray.get(length);
                d dVar2 = dVar;
                while (dVar2 != null) {
                    Object key = dVar2.getKey();
                    if (dVar2.getHash() != i || key == null || !this.map.f21642f.equivalent(obj, key)) {
                        dVar2 = dVar2.getNext();
                    } else {
                        u valueReference = dVar2.getValueReference();
                        Object obj3 = valueReference.get();
                        if (this.map.g.equivalent(obj2, obj3)) {
                            eVar = e.EXPLICIT;
                        } else if (obj3 != null || !valueReference.c()) {
                            unlock();
                            c();
                            return false;
                        } else {
                            eVar = e.COLLECTED;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, a(dVar, dVar2, key, i, obj3, valueReference, eVar));
                        this.count--;
                        if (eVar != e.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        @VisibleForTesting
        @GuardedBy("this")
        private boolean a(d<K, V> dVar, int i, e eVar) {
            int i2 = this.count;
            AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            d<K, V> dVar2 = atomicReferenceArray.get(length);
            for (d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.getNext()) {
                if (dVar3 == dVar) {
                    this.modCount++;
                    atomicReferenceArray.set(length, a(dVar2, dVar3, dVar3.getKey(), i, dVar3.getValueReference().get(), dVar3.getValueReference(), eVar));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        @GuardedBy("this")
        private void a(d<K, V> dVar, K k, V v, long j) {
            boolean z;
            dVar.getValueReference();
            int weigh = this.map.k.weigh(k, v);
            if (weigh >= 0) {
                z = true;
            } else {
                z = false;
            }
            com.bytedance.jedi.model.guava.a.c.a(z, "Weights must be non-negative");
            dVar.setValueReference(this.map.i.referenceValue(this, dVar, v, weigh));
            h();
            this.totalWeight += (long) weigh;
            if (this.map.f()) {
                dVar.setAccessTime(j);
            }
            if (this.map.e()) {
                dVar.setWriteTime(j);
            }
            this.accessQueue.add(dVar);
            this.writeQueue.add(dVar);
        }

        @NullableDecl
        @GuardedBy("this")
        private d<K, V> a(d<K, V> dVar, d<K, V> dVar2, @NullableDecl K k, int i, V v, u<K, V> uVar, e eVar) {
            a(k, v, uVar.a(), eVar);
            this.writeQueue.remove(dVar2);
            this.accessQueue.remove(dVar2);
            return b(dVar, dVar2);
        }
    }

    static class m<K, V> extends SoftReference<V> implements u<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final d<K, V> f21673a;

        public int a() {
            return 1;
        }

        public final boolean c() {
            return true;
        }

        public final d<K, V> b() {
            return this.f21673a;
        }

        m(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            super(v, referenceQueue);
            this.f21673a = dVar;
        }

        public u<K, V> a(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            return new m(referenceQueue, v, dVar);
        }
    }

    enum n {
        STRONG {
            /* access modifiers changed from: package-private */
            public final com.bytedance.jedi.model.guava.a.a<Object> defaultEquivalence() {
                return com.bytedance.jedi.model.guava.a.a.equals();
            }

            /* access modifiers changed from: package-private */
            public final <K, V> u<K, V> referenceValue(l<K, V> lVar, d<K, V> dVar, V v, int i) {
                if (i == 1) {
                    return new r(v);
                }
                return new ac(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            public final com.bytedance.jedi.model.guava.a.a<Object> defaultEquivalence() {
                return com.bytedance.jedi.model.guava.a.a.identity();
            }

            /* access modifiers changed from: package-private */
            public final <K, V> u<K, V> referenceValue(l<K, V> lVar, d<K, V> dVar, V v, int i) {
                if (i == 1) {
                    return new m(lVar.valueReferenceQueue, v, dVar);
                }
                return new ab(lVar.valueReferenceQueue, v, dVar, i);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public final com.bytedance.jedi.model.guava.a.a<Object> defaultEquivalence() {
                return com.bytedance.jedi.model.guava.a.a.identity();
            }

            /* access modifiers changed from: package-private */
            public final <K, V> u<K, V> referenceValue(l<K, V> lVar, d<K, V> dVar, V v, int i) {
                if (i == 1) {
                    return new z(lVar.valueReferenceQueue, v, dVar);
                }
                return new ad(lVar.valueReferenceQueue, v, dVar, i);
            }
        };

        /* access modifiers changed from: package-private */
        public abstract com.bytedance.jedi.model.guava.a.a<Object> defaultEquivalence();

        /* access modifiers changed from: package-private */
        public abstract <K, V> u<K, V> referenceValue(l<K, V> lVar, d<K, V> dVar, V v, int i);
    }

    static final class o<K, V> extends q<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f21674a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f21675b = c.j();

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f21676c = c.j();

        public final long getAccessTime() {
            return this.f21674a;
        }

        public final d<K, V> getNextInAccessQueue() {
            return this.f21675b;
        }

        public final d<K, V> getPreviousInAccessQueue() {
            return this.f21676c;
        }

        public final void setAccessTime(long j) {
            this.f21674a = j;
        }

        public final void setNextInAccessQueue(d<K, V> dVar) {
            this.f21675b = dVar;
        }

        public final void setPreviousInAccessQueue(d<K, V> dVar) {
            this.f21676c = dVar;
        }

        o(K k, int i, @NullableDecl d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    static final class p<K, V> extends q<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f21677a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f21678b = c.j();

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f21679c = c.j();

        /* renamed from: d  reason: collision with root package name */
        volatile long f21680d = Long.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        d<K, V> f21681e = c.j();

        /* renamed from: f  reason: collision with root package name */
        d<K, V> f21682f = c.j();

        public final long getAccessTime() {
            return this.f21677a;
        }

        public final d<K, V> getNextInAccessQueue() {
            return this.f21678b;
        }

        public final d<K, V> getNextInWriteQueue() {
            return this.f21681e;
        }

        public final d<K, V> getPreviousInAccessQueue() {
            return this.f21679c;
        }

        public final d<K, V> getPreviousInWriteQueue() {
            return this.f21682f;
        }

        public final long getWriteTime() {
            return this.f21680d;
        }

        public final void setAccessTime(long j) {
            this.f21677a = j;
        }

        public final void setNextInAccessQueue(d<K, V> dVar) {
            this.f21678b = dVar;
        }

        public final void setNextInWriteQueue(d<K, V> dVar) {
            this.f21681e = dVar;
        }

        public final void setPreviousInAccessQueue(d<K, V> dVar) {
            this.f21679c = dVar;
        }

        public final void setPreviousInWriteQueue(d<K, V> dVar) {
            this.f21682f = dVar;
        }

        public final void setWriteTime(long j) {
            this.f21680d = j;
        }

        p(K k, int i, @NullableDecl d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    static class q<K, V> extends b<K, V> {
        final K g;
        final int h;
        @NullableDecl
        final d<K, V> i;
        volatile u<K, V> j = c.i();

        public int getHash() {
            return this.h;
        }

        public K getKey() {
            return this.g;
        }

        public d<K, V> getNext() {
            return this.i;
        }

        public u<K, V> getValueReference() {
            return this.j;
        }

        public void setValueReference(u<K, V> uVar) {
            this.j = uVar;
        }

        q(K k, int i2, @NullableDecl d<K, V> dVar) {
            this.g = k;
            this.h = i2;
            this.i = dVar;
        }
    }

    static class r<K, V> implements u<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final V f21683a;

        public int a() {
            return 1;
        }

        public final u<K, V> a(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            return this;
        }

        public final d<K, V> b() {
            return null;
        }

        public final boolean c() {
            return true;
        }

        public V get() {
            return this.f21683a;
        }

        r(V v) {
            this.f21683a = v;
        }
    }

    static final class s<K, V> extends q<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f21684a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f21685b = c.j();

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f21686c = c.j();

        public final d<K, V> getNextInWriteQueue() {
            return this.f21685b;
        }

        public final d<K, V> getPreviousInWriteQueue() {
            return this.f21686c;
        }

        public final long getWriteTime() {
            return this.f21684a;
        }

        public final void setNextInWriteQueue(d<K, V> dVar) {
            this.f21685b = dVar;
        }

        public final void setPreviousInWriteQueue(d<K, V> dVar) {
            this.f21686c = dVar;
        }

        public final void setWriteTime(long j) {
            this.f21684a = j;
        }

        s(K k, int i, @NullableDecl d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    final class t extends g<V> {
        public final V next() {
            return a().getValue();
        }

        t() {
            super();
        }
    }

    interface u<K, V> {
        int a();

        u<K, V> a(ReferenceQueue<V> referenceQueue, @NullableDecl V v, d<K, V> dVar);

        @NullableDecl
        d<K, V> b();

        boolean c();

        @NullableDecl
        V get();
    }

    final class v extends AbstractCollection<V> {

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<?, ?> f21689b;

        public final void clear() {
            this.f21689b.clear();
        }

        public final boolean isEmpty() {
            return this.f21689b.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new t();
        }

        public final int size() {
            return this.f21689b.size();
        }

        public final Object[] toArray() {
            return c.a((Collection<E>) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f21689b.containsValue(obj);
        }

        public final <E> E[] toArray(E[] eArr) {
            return c.a((Collection<E>) this).toArray(eArr);
        }

        v(ConcurrentMap<?, ?> concurrentMap) {
            this.f21689b = concurrentMap;
        }
    }

    static final class w<K, V> extends y<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f21690a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f21691b = c.j();

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f21692c = c.j();

        public final long getAccessTime() {
            return this.f21690a;
        }

        public final d<K, V> getNextInAccessQueue() {
            return this.f21691b;
        }

        public final d<K, V> getPreviousInAccessQueue() {
            return this.f21692c;
        }

        public final void setAccessTime(long j) {
            this.f21690a = j;
        }

        public final void setNextInAccessQueue(d<K, V> dVar) {
            this.f21691b = dVar;
        }

        public final void setPreviousInAccessQueue(d<K, V> dVar) {
            this.f21692c = dVar;
        }

        w(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    static final class x<K, V> extends y<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f21693a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f21694b = c.j();

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f21695c = c.j();

        /* renamed from: d  reason: collision with root package name */
        volatile long f21696d = Long.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        d<K, V> f21697e = c.j();

        /* renamed from: f  reason: collision with root package name */
        d<K, V> f21698f = c.j();

        public final long getAccessTime() {
            return this.f21693a;
        }

        public final d<K, V> getNextInAccessQueue() {
            return this.f21694b;
        }

        public final d<K, V> getNextInWriteQueue() {
            return this.f21697e;
        }

        public final d<K, V> getPreviousInAccessQueue() {
            return this.f21695c;
        }

        public final d<K, V> getPreviousInWriteQueue() {
            return this.f21698f;
        }

        public final long getWriteTime() {
            return this.f21696d;
        }

        public final void setAccessTime(long j) {
            this.f21693a = j;
        }

        public final void setNextInAccessQueue(d<K, V> dVar) {
            this.f21694b = dVar;
        }

        public final void setNextInWriteQueue(d<K, V> dVar) {
            this.f21697e = dVar;
        }

        public final void setPreviousInAccessQueue(d<K, V> dVar) {
            this.f21695c = dVar;
        }

        public final void setPreviousInWriteQueue(d<K, V> dVar) {
            this.f21698f = dVar;
        }

        public final void setWriteTime(long j) {
            this.f21696d = j;
        }

        x(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    static class y<K, V> extends WeakReference<K> implements d<K, V> {
        final int g;
        @NullableDecl
        final d<K, V> h;
        volatile u<K, V> i = c.i();

        public int getHash() {
            return this.g;
        }

        public d<K, V> getNext() {
            return this.h;
        }

        public u<K, V> getValueReference() {
            return this.i;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            return get();
        }

        public d<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public d<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public d<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public d<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(u<K, V> uVar) {
            this.i = uVar;
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }

        y(ReferenceQueue<K> referenceQueue, K k, int i2, @NullableDecl d<K, V> dVar) {
            super(k, referenceQueue);
            this.g = i2;
            this.h = dVar;
        }
    }

    static class z<K, V> extends WeakReference<V> implements u<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final d<K, V> f21699a;

        public int a() {
            return 1;
        }

        public final boolean c() {
            return true;
        }

        public final d<K, V> b() {
            return this.f21699a;
        }

        z(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            super(v, referenceQueue);
            this.f21699a = dVar;
        }

        public u<K, V> a(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            return new z(referenceQueue, v, dVar);
        }
    }

    static <K, V> u<K, V> i() {
        return s;
    }

    static <K, V> d<K, V> j() {
        return k.INSTANCE;
    }

    static <E> Queue<E> k() {
        return t;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return n();
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return o();
    }

    private boolean n() {
        if (this.m > 0) {
            return true;
        }
        return false;
    }

    private boolean o() {
        if (this.l > 0) {
            return true;
        }
        return false;
    }

    private boolean p() {
        if (this.n > 0) {
            return true;
        }
        return false;
    }

    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.w;
        if (set != null) {
            return set;
        }
        f fVar = new f(this);
        this.w = fVar;
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        if (this.h != n.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        if (this.i != n.STRONG) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.u;
        if (set != null) {
            return set;
        }
        i iVar = new i(this);
        this.u = iVar;
        return iVar;
    }

    public Collection<V> values() {
        Collection<V> collection = this.v;
        if (collection != null) {
            return collection;
        }
        v vVar = new v(this);
        this.v = vVar;
        return vVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.k != b.C0219b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (o() || a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (n() || p()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        while (true) {
            g poll = this.o.poll();
            if (poll != null) {
                try {
                    this.p.onRemoval(poll);
                } catch (Throwable th) {
                    f21637a.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final long m() {
        l<K, V>[] lVarArr = this.f21640d;
        long j2 = 0;
        for (l<K, V> lVar : lVarArr) {
            j2 += (long) Math.max(0, lVar.count);
        }
        return j2;
    }

    public int size() {
        long m2 = m();
        if (m2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (m2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) m2;
    }

    public boolean isEmpty() {
        l<K, V>[] lVarArr = this.f21640d;
        long j2 = 0;
        for (int i2 = 0; i2 < lVarArr.length; i2++) {
            if (lVarArr[i2].count != 0) {
                return false;
            }
            j2 += (long) lVarArr[i2].modCount;
        }
        if (j2 != 0) {
            for (int i3 = 0; i3 < lVarArr.length; i3++) {
                if (lVarArr[i3].count != 0) {
                    return false;
                }
                j2 -= (long) lVarArr[i3].modCount;
            }
            if (j2 != 0) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        e eVar;
        l<K, V>[] lVarArr = this.f21640d;
        int length = lVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            l<K, V> lVar = lVarArr[i2];
            if (lVar.count != 0) {
                lVar.lock();
                try {
                    lVar.b(lVar.map.q.a());
                    AtomicReferenceArray<d<K, V>> atomicReferenceArray = lVar.table;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (d dVar = atomicReferenceArray.get(i3); dVar != null; dVar = dVar.getNext()) {
                            if (dVar.getValueReference().c()) {
                                Object key = dVar.getKey();
                                Object obj = dVar.getValueReference().get();
                                if (key != null) {
                                    if (obj != null) {
                                        eVar = e.EXPLICIT;
                                        dVar.getHash();
                                        lVar.a(key, obj, dVar.getValueReference().a(), eVar);
                                    }
                                }
                                eVar = e.COLLECTED;
                                dVar.getHash();
                                lVar.a(key, obj, dVar.getValueReference().a(), eVar);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (lVar.map.g()) {
                        do {
                        } while (lVar.keyReferenceQueue.poll() != null);
                    }
                    if (lVar.map.h()) {
                        do {
                        } while (lVar.valueReferenceQueue.poll() != null);
                    }
                    lVar.writeQueue.clear();
                    lVar.accessQueue.clear();
                    lVar.readCount.set(0);
                    lVar.modCount++;
                    lVar.count = 0;
                } finally {
                    lVar.unlock();
                    lVar.c();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.j >= 0) {
            return true;
        }
        return false;
    }

    static <K, V> void b(d<K, V> dVar) {
        d j2 = j();
        dVar.setNextInAccessQueue(j2);
        dVar.setPreviousInAccessQueue(j2);
    }

    static <K, V> void c(d<K, V> dVar) {
        d j2 = j();
        dVar.setNextInWriteQueue(j2);
        dVar.setPreviousInWriteQueue(j2);
    }

    public static <E> ArrayList<E> a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        com.bytedance.jedi.model.guava.c.b.a(arrayList, collection.iterator());
        return arrayList;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        return a(a2).b(obj, a2);
    }

    @NullableDecl
    public V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return a(a2).a(obj, a2);
    }

    public V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return a(a2).c(obj, a2);
    }

    /* access modifiers changed from: package-private */
    public final int a(@NullableDecl Object obj) {
        int hash = this.f21642f.hash(obj);
        int i2 = hash + ((hash << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final l<K, V> a(int i2) {
        return this.f21640d[(i2 >>> this.f21639c) & this.f21638b];
    }

    /* access modifiers changed from: package-private */
    public final void a(u<K, V> uVar) {
        d b2 = uVar.b();
        int hash = b2.getHash();
        a(hash).a(b2.getKey(), hash, uVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsValue(@com.bytedance.jedi.model.guava.annotations.NullableDecl java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            com.bytedance.jedi.model.guava.a.f r3 = r0.q
            long r3 = r3.a()
            com.bytedance.jedi.model.guava.b.c$l<K, V>[] r5 = r0.f21640d
            r6 = -1
            r7 = r6
            r6 = 0
        L_0x0014:
            r9 = 3
            if (r6 >= r9) goto L_0x00a1
            r9 = 0
            int r11 = r5.length
            r12 = r9
            r9 = 0
        L_0x001c:
            if (r9 >= r11) goto L_0x008f
            r10 = r5[r9]
            int r14 = r10.count
            java.util.concurrent.atomic.AtomicReferenceArray<com.bytedance.jedi.model.guava.b.d<K, V>> r14 = r10.table
            r15 = 0
        L_0x0025:
            int r2 = r14.length()
            if (r15 >= r2) goto L_0x0081
            java.lang.Object r2 = r14.get(r15)
            com.bytedance.jedi.model.guava.b.d r2 = (com.bytedance.jedi.model.guava.b.d) r2
        L_0x0031:
            if (r2 == 0) goto L_0x007a
            java.lang.Object r16 = r2.getKey()
            r17 = 0
            if (r16 != 0) goto L_0x0043
            r10.a()
        L_0x003e:
            r18 = r5
        L_0x0040:
            r5 = r17
            goto L_0x0061
        L_0x0043:
            com.bytedance.jedi.model.guava.b.c$u r16 = r2.getValueReference()
            java.lang.Object r16 = r16.get()
            if (r16 != 0) goto L_0x0051
            r10.a()
            goto L_0x003e
        L_0x0051:
            r18 = r5
            com.bytedance.jedi.model.guava.b.c<K, V> r5 = r10.map
            boolean r5 = r5.a((com.bytedance.jedi.model.guava.b.d<K, V>) r2, (long) r3)
            if (r5 == 0) goto L_0x005f
            r10.a((long) r3)
            goto L_0x0040
        L_0x005f:
            r5 = r16
        L_0x0061:
            if (r5 == 0) goto L_0x006f
            r19 = r3
            com.bytedance.jedi.model.guava.a.a<java.lang.Object> r3 = r0.g
            boolean r3 = r3.equivalent(r1, r5)
            if (r3 == 0) goto L_0x0071
            r1 = 1
            return r1
        L_0x006f:
            r19 = r3
        L_0x0071:
            com.bytedance.jedi.model.guava.b.d r2 = r2.getNext()
            r5 = r18
            r3 = r19
            goto L_0x0031
        L_0x007a:
            r19 = r3
            r18 = r5
            int r15 = r15 + 1
            goto L_0x0025
        L_0x0081:
            r19 = r3
            r18 = r5
            int r2 = r10.modCount
            long r2 = (long) r2
            long r12 = r12 + r2
            int r9 = r9 + 1
            r3 = r19
            r2 = 0
            goto L_0x001c
        L_0x008f:
            r19 = r3
            r18 = r5
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00a1
            int r6 = r6 + 1
            r7 = r12
            r5 = r18
            r3 = r19
            r2 = 0
            goto L_0x0014
        L_0x00a1:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.guava.b.c.containsValue(java.lang.Object):boolean");
    }

    c(b<? super K, ? super V> bVar) {
        int i2;
        long j2;
        long j3;
        long j4;
        Queue<g<K, V>> queue;
        boolean z2;
        com.bytedance.jedi.model.guava.a.f fVar;
        boolean z3;
        boolean z4;
        int i3;
        if (bVar.f21634d == -1) {
            i2 = 4;
        } else {
            i2 = bVar.f21634d;
        }
        this.f21641e = Math.min(i2, 65536);
        this.h = bVar.b();
        this.i = bVar.c();
        this.f21642f = (com.bytedance.jedi.model.guava.a.a) com.bytedance.jedi.model.guava.a.b.a(bVar.m, bVar.b().defaultEquivalence());
        this.g = (com.bytedance.jedi.model.guava.a.a) com.bytedance.jedi.model.guava.a.b.a(bVar.n, bVar.c().defaultEquivalence());
        long j5 = 0;
        if (bVar.j == 0 || bVar.k == 0) {
            j2 = 0;
        } else if (bVar.g == null) {
            j2 = bVar.f21635e;
        } else {
            j2 = bVar.f21636f;
        }
        this.j = j2;
        this.k = (h) com.bytedance.jedi.model.guava.a.b.a(bVar.g, b.C0219b.INSTANCE);
        if (bVar.k == -1) {
            j3 = 0;
        } else {
            j3 = bVar.k;
        }
        this.l = j3;
        if (bVar.j == -1) {
            j4 = 0;
        } else {
            j4 = bVar.j;
        }
        this.m = j4;
        this.n = bVar.l != -1 ? bVar.l : j5;
        this.p = (f) com.bytedance.jedi.model.guava.a.b.a(bVar.o, b.a.INSTANCE);
        if (this.p == b.a.INSTANCE) {
            queue = k();
        } else {
            queue = new ConcurrentLinkedQueue<>();
        }
        this.o = queue;
        int i4 = 0;
        int i5 = 1;
        if (e() || f()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar.p != null) {
            fVar = bVar.p;
        } else if (z2) {
            fVar = com.bytedance.jedi.model.guava.a.f.f21630a;
        } else {
            fVar = b.f21631a;
        }
        this.q = fVar;
        n nVar = this.h;
        if (c() || f()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (d() || e()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.r = d.getFactory(nVar, z3, z4);
        if (bVar.f21633c == -1) {
            i3 = 16;
        } else {
            i3 = bVar.f21633c;
        }
        int min = Math.min(i3, 1073741824);
        if (a() && !b()) {
            min = (int) Math.min((long) min, this.j);
        }
        int i6 = 1;
        int i7 = 0;
        while (i6 < this.f21641e && (!a() || ((long) (i6 * 20)) <= this.j)) {
            i7++;
            i6 <<= 1;
        }
        this.f21639c = 32 - i7;
        this.f21638b = i6 - 1;
        this.f21640d = new l[i6];
        int i8 = min / i6;
        while (i5 < (i8 * i6 < min ? i8 + 1 : i8)) {
            i5 <<= 1;
        }
        if (a()) {
            long j6 = (long) i6;
            long j7 = (this.j / j6) + 1;
            long j8 = this.j % j6;
            while (i4 < this.f21640d.length) {
                if (((long) i4) == j8) {
                    j7--;
                }
                this.f21640d[i4] = a(i5, j7);
                i4++;
            }
            return;
        }
        while (i4 < this.f21640d.length) {
            this.f21640d[i4] = a(i5, -1);
            i4++;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(d<K, V> dVar) {
        int hash = dVar.getHash();
        a(hash).a(dVar, hash);
    }

    private l<K, V> a(int i2, long j2) {
        return new l<>(this, i2, j2);
    }

    static <K, V> void b(d<K, V> dVar, d<K, V> dVar2) {
        dVar.setNextInWriteQueue(dVar2);
        dVar2.setPreviousInWriteQueue(dVar);
    }

    @NullableDecl
    public V getOrDefault(@NullableDecl Object obj, @NullableDecl V v2) {
        V v3 = get(obj);
        if (v3 != null) {
            return v3;
        }
        return v2;
    }

    static <K, V> void a(d<K, V> dVar, d<K, V> dVar2) {
        dVar.setNextInAccessQueue(dVar2);
        dVar2.setPreviousInAccessQueue(dVar);
    }

    public V put(K k2, V v2) {
        com.bytedance.jedi.model.guava.a.c.a(k2);
        com.bytedance.jedi.model.guava.a.c.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, false);
    }

    public V putIfAbsent(K k2, V v2) {
        com.bytedance.jedi.model.guava.a.c.a(k2);
        com.bytedance.jedi.model.guava.a.c.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, true);
    }

    public V replace(K k2, V v2) {
        com.bytedance.jedi.model.guava.a.c.a(k2);
        com.bytedance.jedi.model.guava.a.c.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2);
    }

    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        return a(a2).b(obj, a2, obj2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(d<K, V> dVar, long j2) {
        com.bytedance.jedi.model.guava.a.c.a(dVar);
        if (o() && j2 - dVar.getAccessTime() >= this.l) {
            return true;
        }
        if (!n() || j2 - dVar.getWriteTime() < this.m) {
            return false;
        }
        return true;
    }

    public boolean replace(K k2, @NullableDecl V v2, V v3) {
        com.bytedance.jedi.model.guava.a.c.a(k2);
        com.bytedance.jedi.model.guava.a.c.a(v3);
        if (v2 == null) {
            return false;
        }
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, v3);
    }
}
