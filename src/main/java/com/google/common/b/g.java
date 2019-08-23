package com.google.common.b;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.b.a;
import com.google.common.b.c;
import com.google.common.b.d;
import com.google.common.collect.ak;
import com.google.common.collect.ar;
import com.google.common.collect.aw;
import com.google.common.util.concurrent.d;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public class g<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f24449a = Logger.getLogger(g.class.getName());
    static final w<Object, Object> u = new w<Object, Object>() {
        public final int a() {
            return 0;
        }

        public final w<Object, Object> a(ReferenceQueue<Object> referenceQueue, @NullableDecl Object obj, k<Object, Object> kVar) {
            return this;
        }

        public final void a(Object obj) {
        }

        public final k<Object, Object> b() {
            return null;
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return false;
        }

        public final Object e() {
            return null;
        }

        public final Object get() {
            return null;
        }
    };
    static final Queue<?> v = new AbstractQueue<Object>() {
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
            return ar.of().iterator();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    final int f24450b;

    /* renamed from: c  reason: collision with root package name */
    final int f24451c;

    /* renamed from: d  reason: collision with root package name */
    final n<K, V>[] f24452d;

    /* renamed from: e  reason: collision with root package name */
    final int f24453e;

    /* renamed from: f  reason: collision with root package name */
    final com.google.common.a.d<Object> f24454f;
    final com.google.common.a.d<Object> g;
    final p h;
    final p i;
    final long j;
    final p<K, V> k;
    final long l;
    final long m;
    final long n;
    final Queue<n<K, V>> o;
    final m<K, V> p;
    final com.google.common.a.v q;
    final d r;
    final a.b s;
    @NullableDecl
    final d<? super K, V> t;
    @MonotonicNonNullDecl
    Set<K> w;
    @MonotonicNonNullDecl
    Collection<V> x;
    @MonotonicNonNullDecl
    Set<Map.Entry<K, V>> y;

    abstract class a<T> extends AbstractSet<T> {
        @Weak

        /* renamed from: a  reason: collision with root package name */
        final ConcurrentMap<?, ?> f24455a;

        public void clear() {
            this.f24455a.clear();
        }

        public boolean isEmpty() {
            return this.f24455a.isEmpty();
        }

        public int size() {
            return this.f24455a.size();
        }

        public Object[] toArray() {
            return g.a((Collection<E>) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return g.a((Collection<E>) this).toArray(eArr);
        }

        a(ConcurrentMap<?, ?> concurrentMap) {
            this.f24455a = concurrentMap;
        }
    }

    static class aa<K, V> extends WeakReference<K> implements k<K, V> {
        final int g;
        @NullableDecl
        final k<K, V> h;
        volatile w<K, V> i = g.j();

        public int getHash() {
            return this.g;
        }

        public k<K, V> getNext() {
            return this.h;
        }

        public w<K, V> getValueReference() {
            return this.i;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            return get();
        }

        public k<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public k<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public k<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public k<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(w<K, V> wVar) {
            this.i = wVar;
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }

        aa(ReferenceQueue<K> referenceQueue, K k, int i2, @NullableDecl k<K, V> kVar) {
            super(k, referenceQueue);
            this.g = i2;
            this.h = kVar;
        }
    }

    static class ab<K, V> extends WeakReference<V> implements w<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final k<K, V> f24457a;

        public int a() {
            return 1;
        }

        public final void a(V v) {
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return true;
        }

        public final k<K, V> b() {
            return this.f24457a;
        }

        public final V e() {
            return get();
        }

        ab(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            super(v, referenceQueue);
            this.f24457a = kVar;
        }

        public w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            return new ab(referenceQueue, v, kVar);
        }
    }

    static final class ac<K, V> extends aa<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f24458a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f24459b = g.k();

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f24460c = g.k();

        public final k<K, V> getNextInWriteQueue() {
            return this.f24459b;
        }

        public final k<K, V> getPreviousInWriteQueue() {
            return this.f24460c;
        }

        public final long getWriteTime() {
            return this.f24458a;
        }

        public final void setNextInWriteQueue(k<K, V> kVar) {
            this.f24459b = kVar;
        }

        public final void setPreviousInWriteQueue(k<K, V> kVar) {
            this.f24460c = kVar;
        }

        public final void setWriteTime(long j) {
            this.f24458a = j;
        }

        ac(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl k<K, V> kVar) {
            super(referenceQueue, k, i, kVar);
        }
    }

    static final class ad<K, V> extends o<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final int f24461b;

        public final int a() {
            return this.f24461b;
        }

        public final w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            return new ad(referenceQueue, v, kVar, this.f24461b);
        }

        ad(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar, int i) {
            super(referenceQueue, v, kVar);
            this.f24461b = i;
        }
    }

    static final class ae<K, V> extends t<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final int f24462b;

        public final int a() {
            return this.f24462b;
        }

        ae(V v, int i) {
            super(v);
            this.f24462b = i;
        }
    }

    static final class af<K, V> extends ab<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final int f24463b;

        public final int a() {
            return this.f24463b;
        }

        public final w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            return new af(referenceQueue, v, kVar, this.f24463b);
        }

        af(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar, int i) {
            super(referenceQueue, v, kVar);
            this.f24463b = i;
        }
    }

    static final class ag<K, V> extends AbstractQueue<k<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final k<K, V> f24464a = new b<K, V>() {

            /* renamed from: a  reason: collision with root package name */
            k<K, V> f24465a = this;

            /* renamed from: b  reason: collision with root package name */
            k<K, V> f24466b = this;

            public final long getWriteTime() {
                return Long.MAX_VALUE;
            }

            public final void setWriteTime(long j) {
            }

            public final k<K, V> getNextInWriteQueue() {
                return this.f24465a;
            }

            public final k<K, V> getPreviousInWriteQueue() {
                return this.f24466b;
            }

            public final void setNextInWriteQueue(k<K, V> kVar) {
                this.f24465a = kVar;
            }

            public final void setPreviousInWriteQueue(k<K, V> kVar) {
                this.f24466b = kVar;
            }
        };

        ag() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public k<K, V> peek() {
            k<K, V> nextInWriteQueue = this.f24464a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f24464a) {
                return null;
            }
            return nextInWriteQueue;
        }

        public final boolean isEmpty() {
            if (this.f24464a.getNextInWriteQueue() == this.f24464a) {
                return true;
            }
            return false;
        }

        public final Iterator<k<K, V>> iterator() {
            return new com.google.common.collect.i<k<K, V>>(peek()) {
                public final /* synthetic */ Object a(Object obj) {
                    k<K, V> nextInWriteQueue = ((k) obj).getNextInWriteQueue();
                    if (nextInWriteQueue == ag.this.f24464a) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            k<K, V> nextInWriteQueue = this.f24464a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f24464a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        public final int size() {
            int i = 0;
            for (k<K, V> nextInWriteQueue = this.f24464a.getNextInWriteQueue(); nextInWriteQueue != this.f24464a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            k<K, V> nextInWriteQueue = this.f24464a.getNextInWriteQueue();
            while (nextInWriteQueue != this.f24464a) {
                k<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                g.c(nextInWriteQueue);
                nextInWriteQueue = nextInWriteQueue2;
            }
            this.f24464a.setNextInWriteQueue(this.f24464a);
            this.f24464a.setPreviousInWriteQueue(this.f24464a);
        }

        public final boolean contains(Object obj) {
            if (((k) obj).getNextInWriteQueue() != m.INSTANCE) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ boolean offer(Object obj) {
            k kVar = (k) obj;
            g.b(kVar.getPreviousInWriteQueue(), kVar.getNextInWriteQueue());
            g.b(this.f24464a.getPreviousInWriteQueue(), kVar);
            g.b(kVar, this.f24464a);
            return true;
        }

        public final boolean remove(Object obj) {
            k kVar = (k) obj;
            k previousInWriteQueue = kVar.getPreviousInWriteQueue();
            k nextInWriteQueue = kVar.getNextInWriteQueue();
            g.b(previousInWriteQueue, nextInWriteQueue);
            g.c(kVar);
            if (nextInWriteQueue != m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    final class ah implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f24469a;

        /* renamed from: b  reason: collision with root package name */
        V f24470b;

        public final K getKey() {
            return this.f24469a;
        }

        public final V getValue() {
            return this.f24470b;
        }

        public final int hashCode() {
            return this.f24469a.hashCode() ^ this.f24470b.hashCode();
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        public final V setValue(V v) {
            V put = g.this.put(this.f24469a, v);
            this.f24470b = v;
            return put;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f24469a.equals(entry.getKey()) || !this.f24470b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        ah(K k, V v) {
            this.f24469a = k;
            this.f24470b = v;
        }
    }

    static abstract class b<K, V> implements k<K, V> {
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

        public k<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        public k<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public k<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public k<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public k<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public w<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(w<K, V> wVar) {
            throw new UnsupportedOperationException();
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    static final class c<K, V> extends AbstractQueue<k<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final k<K, V> f24472a = new b<K, V>() {

            /* renamed from: a  reason: collision with root package name */
            k<K, V> f24473a = this;

            /* renamed from: b  reason: collision with root package name */
            k<K, V> f24474b = this;

            public final long getAccessTime() {
                return Long.MAX_VALUE;
            }

            public final void setAccessTime(long j) {
            }

            public final k<K, V> getNextInAccessQueue() {
                return this.f24473a;
            }

            public final k<K, V> getPreviousInAccessQueue() {
                return this.f24474b;
            }

            public final void setNextInAccessQueue(k<K, V> kVar) {
                this.f24473a = kVar;
            }

            public final void setPreviousInAccessQueue(k<K, V> kVar) {
                this.f24474b = kVar;
            }
        };

        c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public k<K, V> peek() {
            k<K, V> nextInAccessQueue = this.f24472a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f24472a) {
                return null;
            }
            return nextInAccessQueue;
        }

        public final boolean isEmpty() {
            if (this.f24472a.getNextInAccessQueue() == this.f24472a) {
                return true;
            }
            return false;
        }

        public final Iterator<k<K, V>> iterator() {
            return new com.google.common.collect.i<k<K, V>>(peek()) {
                public final /* synthetic */ Object a(Object obj) {
                    k<K, V> nextInAccessQueue = ((k) obj).getNextInAccessQueue();
                    if (nextInAccessQueue == c.this.f24472a) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            k<K, V> nextInAccessQueue = this.f24472a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f24472a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        public final int size() {
            int i = 0;
            for (k<K, V> nextInAccessQueue = this.f24472a.getNextInAccessQueue(); nextInAccessQueue != this.f24472a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            k<K, V> nextInAccessQueue = this.f24472a.getNextInAccessQueue();
            while (nextInAccessQueue != this.f24472a) {
                k<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                g.b(nextInAccessQueue);
                nextInAccessQueue = nextInAccessQueue2;
            }
            this.f24472a.setNextInAccessQueue(this.f24472a);
            this.f24472a.setPreviousInAccessQueue(this.f24472a);
        }

        public final boolean contains(Object obj) {
            if (((k) obj).getNextInAccessQueue() != m.INSTANCE) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ boolean offer(Object obj) {
            k kVar = (k) obj;
            g.a(kVar.getPreviousInAccessQueue(), kVar.getNextInAccessQueue());
            g.a(this.f24472a.getPreviousInAccessQueue(), kVar);
            g.a(kVar, this.f24472a);
            return true;
        }

        public final boolean remove(Object obj) {
            k kVar = (k) obj;
            k previousInAccessQueue = kVar.getPreviousInAccessQueue();
            k nextInAccessQueue = kVar.getNextInAccessQueue();
            g.a(previousInAccessQueue, nextInAccessQueue);
            g.b(kVar);
            if (nextInAccessQueue != m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    enum d {
        STRONG {
            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> newEntry(n<K, V> nVar, K k, int i, @NullableDecl k<K, V> kVar) {
                return new s(k, i, kVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> copyEntry(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> copyEntry = super.copyEntry(nVar, kVar, kVar2);
                copyAccessEntry(kVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> newEntry(n<K, V> nVar, K k, int i, @NullableDecl k<K, V> kVar) {
                return new q(k, i, kVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> copyEntry(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> copyEntry = super.copyEntry(nVar, kVar, kVar2);
                copyWriteEntry(kVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> newEntry(n<K, V> nVar, K k, int i, @NullableDecl k<K, V> kVar) {
                return new u(k, i, kVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> copyEntry(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> copyEntry = super.copyEntry(nVar, kVar, kVar2);
                copyAccessEntry(kVar, copyEntry);
                copyWriteEntry(kVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> newEntry(n<K, V> nVar, K k, int i, @NullableDecl k<K, V> kVar) {
                return new r(k, i, kVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> newEntry(n<K, V> nVar, K k, int i, @NullableDecl k<K, V> kVar) {
                return new aa(nVar.keyReferenceQueue, k, i, kVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> copyEntry(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> copyEntry = super.copyEntry(nVar, kVar, kVar2);
                copyAccessEntry(kVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> newEntry(n<K, V> nVar, K k, int i, @NullableDecl k<K, V> kVar) {
                return new y(nVar.keyReferenceQueue, k, i, kVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> copyEntry(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> copyEntry = super.copyEntry(nVar, kVar, kVar2);
                copyWriteEntry(kVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> newEntry(n<K, V> nVar, K k, int i, @NullableDecl k<K, V> kVar) {
                return new ac(nVar.keyReferenceQueue, k, i, kVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> copyEntry(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> copyEntry = super.copyEntry(nVar, kVar, kVar2);
                copyAccessEntry(kVar, copyEntry);
                copyWriteEntry(kVar, copyEntry);
                return copyEntry;
            }

            /* access modifiers changed from: package-private */
            public final <K, V> k<K, V> newEntry(n<K, V> nVar, K k, int i, @NullableDecl k<K, V> kVar) {
                return new z(nVar.keyReferenceQueue, k, i, kVar);
            }
        };
        
        static final d[] factories = null;

        /* access modifiers changed from: package-private */
        public abstract <K, V> k<K, V> newEntry(n<K, V> nVar, K k, int i, @NullableDecl k<K, V> kVar);

        static {
            factories = new d[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        /* access modifiers changed from: package-private */
        public <K, V> void copyAccessEntry(k<K, V> kVar, k<K, V> kVar2) {
            kVar2.setAccessTime(kVar.getAccessTime());
            g.a(kVar.getPreviousInAccessQueue(), kVar2);
            g.a(kVar2, kVar.getNextInAccessQueue());
            g.b(kVar);
        }

        /* access modifiers changed from: package-private */
        public <K, V> void copyWriteEntry(k<K, V> kVar, k<K, V> kVar2) {
            kVar2.setWriteTime(kVar.getWriteTime());
            g.b(kVar.getPreviousInWriteQueue(), kVar2);
            g.b(kVar2, kVar.getNextInWriteQueue());
            g.c(kVar);
        }

        /* access modifiers changed from: package-private */
        public <K, V> k<K, V> copyEntry(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
            return newEntry(nVar, kVar.getKey(), kVar.getHash(), kVar2);
        }

        static d getFactory(p pVar, boolean z, boolean z2) {
            char c2;
            char c3 = 0;
            if (pVar == p.WEAK) {
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

    final class e extends C0281g<Map.Entry<K, V>> {
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
            if (key == null || !g.this.remove(key, entry.getValue())) {
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
            Object obj2 = g.this.get(key);
            if (obj2 == null || !g.this.g.equivalent(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.google.common.b.g$g  reason: collision with other inner class name */
    abstract class C0281g<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        int f24479b;

        /* renamed from: c  reason: collision with root package name */
        int f24480c = -1;
        @MonotonicNonNullDecl

        /* renamed from: d  reason: collision with root package name */
        n<K, V> f24481d;
        @MonotonicNonNullDecl

        /* renamed from: e  reason: collision with root package name */
        AtomicReferenceArray<k<K, V>> f24482e;
        @NullableDecl

        /* renamed from: f  reason: collision with root package name */
        k<K, V> f24483f;
        @NullableDecl
        ah g;
        @NullableDecl
        ah h;

        public boolean hasNext() {
            if (this.g != null) {
                return true;
            }
            return false;
        }

        private boolean c() {
            if (this.f24483f != null) {
                do {
                    this.f24483f = this.f24483f.getNext();
                    if (this.f24483f != null) {
                    }
                } while (!a(this.f24483f));
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final ah a() {
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
            com.google.common.a.m.b(z);
            g.this.remove(this.h.getKey());
            this.h = null;
        }

        private boolean d() {
            while (this.f24480c >= 0) {
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.f24482e;
                int i2 = this.f24480c;
                this.f24480c = i2 - 1;
                k<K, V> kVar = atomicReferenceArray.get(i2);
                this.f24483f = kVar;
                if (kVar != null && (a(this.f24483f) || c())) {
                    return true;
                }
            }
            return false;
        }

        private void b() {
            this.g = null;
            if (!c() && !d()) {
                while (this.f24479b >= 0) {
                    n<K, V>[] nVarArr = g.this.f24452d;
                    int i2 = this.f24479b;
                    this.f24479b = i2 - 1;
                    this.f24481d = nVarArr[i2];
                    if (this.f24481d.count != 0) {
                        this.f24482e = this.f24481d.table;
                        this.f24480c = this.f24482e.length() - 1;
                        if (d()) {
                            return;
                        }
                    }
                }
            }
        }

        C0281g() {
            this.f24479b = r1.f24452d.length - 1;
            b();
        }

        /* JADX INFO: finally extract failed */
        private boolean a(k<K, V> kVar) {
            try {
                long a2 = g.this.q.a();
                Object key = kVar.getKey();
                g gVar = g.this;
                Object obj = null;
                if (kVar.getKey() != null) {
                    Object obj2 = kVar.getValueReference().get();
                    if (obj2 != null) {
                        if (!gVar.a(kVar, a2)) {
                            obj = obj2;
                        }
                    }
                }
                if (obj != null) {
                    this.g = new ah<>(key, obj);
                    this.f24481d.a();
                    return true;
                }
                this.f24481d.a();
                return false;
            } catch (Throwable th) {
                this.f24481d.a();
                throw th;
            }
        }
    }

    final class h extends C0281g<K> {
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
            return this.f24455a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f24455a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    static class j<K, V> implements w<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public volatile w<K, V> f24486a;

        /* renamed from: b  reason: collision with root package name */
        final com.google.common.util.concurrent.w<V> f24487b;

        /* renamed from: c  reason: collision with root package name */
        final com.google.common.a.q f24488c;

        public final w<K, V> a(ReferenceQueue<V> referenceQueue, @NullableDecl V v, k<K, V> kVar) {
            return this;
        }

        public final k<K, V> b() {
            return null;
        }

        public final boolean c() {
            return true;
        }

        public j() {
            this(g.j());
        }

        public final int a() {
            return this.f24486a.a();
        }

        public final boolean d() {
            return this.f24486a.d();
        }

        public final V e() throws ExecutionException {
            return com.google.common.util.concurrent.z.a(this.f24487b);
        }

        public final V get() {
            return this.f24486a.get();
        }

        public final long f() {
            return this.f24488c.a(TimeUnit.NANOSECONDS);
        }

        public final boolean b(@NullableDecl V v) {
            return this.f24487b.b(v);
        }

        public final void a(@NullableDecl V v) {
            if (v != null) {
                b(v);
            } else {
                this.f24486a = g.j();
            }
        }

        public j(w<K, V> wVar) {
            this.f24487b = new com.google.common.util.concurrent.w<>();
            this.f24488c = com.google.common.a.q.a();
            this.f24486a = wVar;
        }

        public final boolean a(Throwable th) {
            return this.f24487b.a(th);
        }

        public final com.google.common.util.concurrent.q<V> a(K k, d<? super K, V> dVar) {
            com.google.common.util.concurrent.q<V> qVar;
            try {
                this.f24488c.c();
                Object obj = this.f24486a.get();
                if (obj == null) {
                    Object load = dVar.load(k);
                    if (b(load)) {
                        return this.f24487b;
                    }
                    return com.google.common.util.concurrent.l.a(load);
                }
                com.google.common.util.concurrent.q reload = dVar.reload(k, obj);
                if (reload == null) {
                    return com.google.common.util.concurrent.l.a(null);
                }
                AnonymousClass1 r4 = new com.google.common.a.f<V, V>() {
                    public final V apply(V v) {
                        j.this.b(v);
                        return v;
                    }
                };
                Executor a2 = com.google.common.util.concurrent.v.a();
                com.google.common.a.m.a(r4);
                d.a aVar = new d.a(reload, r4);
                reload.a(aVar, com.google.common.util.concurrent.v.a(a2, aVar));
                return aVar;
            } catch (Throwable th) {
                if (a(th)) {
                    qVar = this.f24487b;
                } else {
                    qVar = com.google.common.util.concurrent.l.a(th);
                }
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return qVar;
            }
        }
    }

    static class k<K, V> implements b<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final g<K, V> localCache;

        public final ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        public final void invalidateAll() {
            this.localCache.clear();
        }

        public final long size() {
            return this.localCache.n();
        }

        /* access modifiers changed from: package-private */
        public final Object writeReplace() {
            return new l(this.localCache);
        }

        public final void cleanUp() {
            for (n<K, V> c2 : this.localCache.f24452d) {
                c2.c();
            }
        }

        public final e stats() {
            a.C0279a aVar = new a.C0279a();
            aVar.a(this.localCache.s);
            for (n<K, V> nVar : this.localCache.f24452d) {
                aVar.a(nVar.statsCounter);
            }
            return aVar.b();
        }

        private k(g<K, V> gVar) {
            this.localCache = gVar;
        }

        public final void putAll(Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        k(c<? super K, ? super V> cVar) {
            this(new g<>(cVar, null));
        }

        public final void invalidate(Object obj) {
            com.google.common.a.m.a(obj);
            this.localCache.remove(obj);
        }

        public final void invalidateAll(Iterable<?> iterable) {
            g<K, V> gVar = this.localCache;
            for (Object remove : iterable) {
                gVar.remove(remove);
            }
        }

        public final ak<K, V> getAllPresent(Iterable<?> iterable) {
            g<K, V> gVar = this.localCache;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            int i2 = 0;
            for (Object next : iterable) {
                Object obj = gVar.get(next);
                if (obj == null) {
                    i2++;
                } else {
                    linkedHashMap.put(next, obj);
                    i++;
                }
            }
            gVar.s.a(i);
            gVar.s.b(i2);
            return ak.copyOf((Map<? extends K, ? extends V>) linkedHashMap);
        }

        @NullableDecl
        public final V getIfPresent(Object obj) {
            g<K, V> gVar = this.localCache;
            int a2 = gVar.a(com.google.common.a.m.a(obj));
            V a3 = gVar.a(a2).a(obj, a2);
            if (a3 == null) {
                gVar.s.b(1);
            } else {
                gVar.s.a(1);
            }
            return a3;
        }

        public final void put(K k, V v) {
            this.localCache.put(k, v);
        }

        public final V get(K k, final Callable<? extends V> callable) throws ExecutionException {
            com.google.common.a.m.a(callable);
            g<K, V> gVar = this.localCache;
            AnonymousClass1 r1 = new d<Object, V>() {
                public final V load(Object obj) throws Exception {
                    return callable.call();
                }
            };
            int a2 = gVar.a(com.google.common.a.m.a(k));
            return gVar.a(a2).a(k, a2, (d<? super K, V>) r1);
        }
    }

    static class l<K, V> extends f<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        @MonotonicNonNullDecl

        /* renamed from: a  reason: collision with root package name */
        transient b<K, V> f24492a;
        final int concurrencyLevel;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final com.google.common.a.d<Object> keyEquivalence;
        final p keyStrength;
        final d<? super K, V> loader;
        final long maxWeight;
        final m<? super K, ? super V> removalListener;
        @NullableDecl
        final com.google.common.a.v ticker;
        final com.google.common.a.d<Object> valueEquivalence;
        final p valueStrength;
        final p<K, V> weigher;

        private Object readResolve() {
            return this.f24492a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final b<K, V> delegate() {
            return this.f24492a;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        l(com.google.common.b.g<K, V> r17) {
            /*
                r16 = this;
                r0 = r17
                com.google.common.b.g$p r1 = r0.h
                com.google.common.b.g$p r2 = r0.i
                com.google.common.a.d<java.lang.Object> r3 = r0.f24454f
                com.google.common.a.d<java.lang.Object> r4 = r0.g
                long r5 = r0.m
                long r7 = r0.l
                long r9 = r0.j
                com.google.common.b.p<K, V> r11 = r0.k
                int r12 = r0.f24453e
                com.google.common.b.m<K, V> r13 = r0.p
                com.google.common.a.v r14 = r0.q
                com.google.common.b.d<? super K, V> r15 = r0.t
                r0 = r16
                r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.b.g.l.<init>(com.google.common.b.g):void");
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            objectInputStream.defaultReadObject();
            c<Object, Object> a2 = c.a();
            p pVar = this.keyStrength;
            boolean z15 = true;
            if (a2.k == null) {
                z = true;
            } else {
                z = false;
            }
            com.google.common.a.m.a(z, "Key strength was already set to %s", (Object) a2.k);
            a2.k = (p) com.google.common.a.m.a(pVar);
            c a3 = a2.a(this.valueStrength);
            com.google.common.a.d<Object> dVar = this.keyEquivalence;
            if (a3.p == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.google.common.a.m.a(z2, "key equivalence was already set to %s", (Object) a3.p);
            a3.p = (com.google.common.a.d) com.google.common.a.m.a(dVar);
            com.google.common.a.d<Object> dVar2 = this.valueEquivalence;
            if (a3.q == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.google.common.a.m.a(z3, "value equivalence was already set to %s", (Object) a3.q);
            a3.q = (com.google.common.a.d) com.google.common.a.m.a(dVar2);
            int i = this.concurrencyLevel;
            if (a3.g == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            com.google.common.a.m.b(z4, "concurrency level was already set to %s", a3.g);
            if (i > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            com.google.common.a.m.a(z5);
            a3.g = i;
            c a4 = a3.a(this.removalListener);
            a4.f24436e = false;
            if (this.expireAfterWriteNanos > 0) {
                long j = this.expireAfterWriteNanos;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (a4.m == -1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                com.google.common.a.m.a(z13, "expireAfterWrite was already set to %s ns", a4.m);
                if (j >= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                com.google.common.a.m.a(z14, "duration cannot be negative: %s %s", j, timeUnit);
                a4.m = timeUnit.toNanos(j);
            }
            if (this.expireAfterAccessNanos > 0) {
                long j2 = this.expireAfterAccessNanos;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (a4.n == -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                com.google.common.a.m.a(z11, "expireAfterAccess was already set to %s ns", a4.n);
                if (j2 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                com.google.common.a.m.a(z12, "duration cannot be negative: %s %s", j2, timeUnit2);
                a4.n = timeUnit2.toNanos(j2);
            }
            if (this.weigher != c.b.INSTANCE) {
                p<K, V> pVar2 = this.weigher;
                if (a4.j == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                com.google.common.a.m.b(z6);
                if (a4.f24436e) {
                    if (a4.h == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    com.google.common.a.m.a(z10, "weigher can not be combined with maximum size", a4.h);
                }
                a4.j = (p) com.google.common.a.m.a(pVar2);
                if (this.maxWeight != -1) {
                    long j3 = this.maxWeight;
                    if (a4.i == -1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    com.google.common.a.m.a(z7, "maximum weight was already set to %s", a4.i);
                    if (a4.h == -1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    com.google.common.a.m.a(z8, "maximum size was already set to %s", a4.h);
                    a4.i = j3;
                    if (j3 >= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    com.google.common.a.m.a(z9, (Object) "maximum weight must not be negative");
                }
            } else if (this.maxWeight != -1) {
                a4.a(this.maxWeight);
            }
            if (this.ticker != null) {
                com.google.common.a.v vVar = this.ticker;
                if (a4.s != null) {
                    z15 = false;
                }
                com.google.common.a.m.b(z15);
                a4.s = (com.google.common.a.v) com.google.common.a.m.a(vVar);
            }
            this.f24492a = a4.d();
        }

        private l(p pVar, p pVar2, com.google.common.a.d<Object> dVar, com.google.common.a.d<Object> dVar2, long j, long j2, long j3, p<K, V> pVar3, int i, m<? super K, ? super V> mVar, com.google.common.a.v vVar, d<? super K, V> dVar3) {
            this.keyStrength = pVar;
            this.valueStrength = pVar2;
            this.keyEquivalence = dVar;
            this.valueEquivalence = dVar2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = pVar3;
            this.concurrencyLevel = i;
            this.removalListener = mVar;
            this.ticker = (vVar == com.google.common.a.v.b() || vVar == c.f24435d) ? null : vVar;
            this.loader = dVar3;
        }
    }

    enum m implements k<Object, Object> {
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

        public final k<Object, Object> getNext() {
            return null;
        }

        public final k<Object, Object> getNextInAccessQueue() {
            return this;
        }

        public final k<Object, Object> getNextInWriteQueue() {
            return this;
        }

        public final k<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        public final k<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        public final w<Object, Object> getValueReference() {
            return null;
        }

        public final long getWriteTime() {
            return 0;
        }

        public final void setAccessTime(long j) {
        }

        public final void setNextInAccessQueue(k<Object, Object> kVar) {
        }

        public final void setNextInWriteQueue(k<Object, Object> kVar) {
        }

        public final void setPreviousInAccessQueue(k<Object, Object> kVar) {
        }

        public final void setPreviousInWriteQueue(k<Object, Object> kVar) {
        }

        public final void setValueReference(w<Object, Object> wVar) {
        }

        public final void setWriteTime(long j) {
        }
    }

    static class n<K, V> extends ReentrantLock {
        @GuardedBy
        final Queue<k<K, V>> accessQueue;
        volatile int count;
        @NullableDecl
        final ReferenceQueue<K> keyReferenceQueue;
        @Weak
        final g<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<k<K, V>> recencyQueue;
        final a.b statsCounter;
        @MonotonicNonNullDecl
        volatile AtomicReferenceArray<k<K, V>> table;
        int threshold;
        @GuardedBy
        long totalWeight;
        @NullableDecl
        final ReferenceQueue<V> valueReferenceQueue;
        @GuardedBy
        final Queue<k<K, V>> writeQueue;

        /* access modifiers changed from: package-private */
        public final void b() {
            k();
        }

        @GuardedBy
        private void a(k<K, V> kVar, K k, V v, long j) {
            w valueReference = kVar.getValueReference();
            int weigh = this.map.k.weigh(k, v);
            com.google.common.a.m.b(weigh >= 0, (Object) "Weights must be non-negative");
            kVar.setValueReference(this.map.i.referenceValue(this, kVar, v, weigh));
            h();
            this.totalWeight += (long) weigh;
            if (this.map.g()) {
                kVar.setAccessTime(j);
            }
            if (this.map.f()) {
                kVar.setWriteTime(j);
            }
            this.accessQueue.add(kVar);
            this.writeQueue.add(kVar);
            valueReference.a(v);
        }

        /* access modifiers changed from: package-private */
        public final V a(K k, int i, d<? super K, V> dVar) throws ExecutionException {
            com.google.common.a.m.a(k);
            com.google.common.a.m.a(dVar);
            try {
                if (this.count != 0) {
                    k d2 = d(k, i);
                    if (d2 != null) {
                        long a2 = this.map.q.a();
                        Object a3 = a(d2, a2);
                        if (a3 != null) {
                            b(d2, a2);
                            this.statsCounter.a(1);
                            V a4 = a(d2, k, i, a3, a2, dVar);
                            a();
                            return a4;
                        }
                        w valueReference = d2.getValueReference();
                        if (valueReference.c()) {
                            V a5 = a(d2, k, valueReference);
                            a();
                            return a5;
                        }
                    }
                }
                V b2 = b(k, i, dVar);
                a();
                return b2;
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof Error) {
                    throw new com.google.common.util.concurrent.f((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new com.google.common.util.concurrent.y(cause);
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                a();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V a(K r4, int r5, com.google.common.b.g.j<K, V> r6, com.google.common.util.concurrent.q<V> r7) throws java.util.concurrent.ExecutionException {
            /*
                r3 = this;
                java.lang.Object r7 = com.google.common.util.concurrent.z.a(r7)     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0021
                com.google.common.b.a$b r0 = r3.statsCounter     // Catch:{ all -> 0x003a }
                long r1 = r6.f()     // Catch:{ all -> 0x003a }
                r0.a((long) r1)     // Catch:{ all -> 0x003a }
                r3.a((K) r4, (int) r5, (com.google.common.b.g.j<K, V>) r6, (V) r7)     // Catch:{ all -> 0x003a }
                if (r7 != 0) goto L_0x0020
                com.google.common.b.a$b r0 = r3.statsCounter
                long r1 = r6.f()
                r0.b((long) r1)
                r3.a((K) r4, (int) r5, (com.google.common.b.g.j<K, V>) r6)
            L_0x0020:
                return r7
            L_0x0021:
                com.google.common.b.d$b r0 = new com.google.common.b.d$b     // Catch:{ all -> 0x003a }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "CacheLoader returned null for key "
                r1.<init>(r2)     // Catch:{ all -> 0x003a }
                r1.append(r4)     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "."
                r1.append(r2)     // Catch:{ all -> 0x003a }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003a }
                r0.<init>(r1)     // Catch:{ all -> 0x003a }
                throw r0     // Catch:{ all -> 0x003a }
            L_0x003a:
                r0 = move-exception
                goto L_0x003e
            L_0x003c:
                r0 = move-exception
                r7 = 0
            L_0x003e:
                if (r7 != 0) goto L_0x004c
                com.google.common.b.a$b r7 = r3.statsCounter
                long r1 = r6.f()
                r7.b((long) r1)
                r3.a((K) r4, (int) r5, (com.google.common.b.g.j<K, V>) r6)
            L_0x004c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.b.g.n.a(java.lang.Object, int, com.google.common.b.g$j, com.google.common.util.concurrent.q):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        public final void a(@NullableDecl K k, @NullableDecl V v, int i, l lVar) {
            this.totalWeight -= (long) i;
            if (lVar.wasEvicted()) {
                this.statsCounter.a();
            }
            if (this.map.o != g.v) {
                this.map.o.offer(n.create(k, v, lVar));
            }
        }

        @GuardedBy
        private void a(k<K, V> kVar) {
            if (this.map.a()) {
                h();
                if (((long) kVar.getValueReference().a()) <= this.maxSegmentWeight || a(kVar, kVar.getHash(), l.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        k i = i();
                        if (!a(i, i.getHash(), l.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        public final V a(k<K, V> kVar, long j) {
            if (kVar.getKey() == null) {
                d();
                return null;
            }
            V v = kVar.getValueReference().get();
            if (v == null) {
                d();
                return null;
            } else if (!this.map.a(kVar, j)) {
                return v;
            } else {
                b(j);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final V a(Object obj, int i) {
            try {
                if (this.count != 0) {
                    long a2 = this.map.q.a();
                    k a3 = a(obj, i, a2);
                    if (a3 == null) {
                        return null;
                    }
                    Object obj2 = a3.getValueReference().get();
                    if (obj2 != null) {
                        b(a3, a2);
                        V a4 = a(a3, a3.getKey(), i, obj2, a2, this.map.t);
                        a();
                        return a4;
                    }
                    d();
                }
                a();
                return null;
            } finally {
                a();
            }
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final V a(K k, int i, V v, boolean z) {
            int i2;
            lock();
            try {
                long a2 = this.map.q.a();
                a(a2);
                if (this.count + 1 > this.threshold) {
                    j();
                    int i3 = this.count;
                }
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                k kVar = atomicReferenceArray.get(length);
                k kVar2 = kVar;
                while (kVar2 != null) {
                    Object key = kVar2.getKey();
                    if (kVar2.getHash() != i || key == null || !this.map.f24454f.equivalent(k, key)) {
                        kVar2 = kVar2.getNext();
                    } else {
                        w valueReference = kVar2.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 == null) {
                            this.modCount++;
                            if (valueReference.d()) {
                                a(k, v2, valueReference.a(), l.COLLECTED);
                                a(kVar2, k, v, a2);
                                i2 = this.count;
                            } else {
                                a(kVar2, k, v, a2);
                                i2 = this.count + 1;
                            }
                            this.count = i2;
                            a(kVar2);
                            return null;
                        } else if (z) {
                            c(kVar2, a2);
                            unlock();
                            b();
                            return v2;
                        } else {
                            this.modCount++;
                            a(k, v2, valueReference.a(), l.REPLACED);
                            a(kVar2, k, v, a2);
                            a(kVar2);
                            unlock();
                            b();
                            return v2;
                        }
                    }
                }
                this.modCount++;
                k a3 = a(k, i, kVar);
                a(a3, k, v, a2);
                atomicReferenceArray.set(length, a3);
                this.count++;
                a(a3);
                unlock();
                b();
                return null;
            } finally {
                unlock();
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(K k, int i, V v, V v2) {
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a2 = this.map.q.a();
                a(a2);
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                k kVar = atomicReferenceArray.get(length);
                k kVar2 = kVar;
                while (kVar2 != null) {
                    Object key = kVar2.getKey();
                    if (kVar2.getHash() != i2 || key == null || !this.map.f24454f.equivalent(k2, key)) {
                        V v3 = v;
                        kVar2 = kVar2.getNext();
                    } else {
                        w valueReference = kVar2.getValueReference();
                        Object obj = valueReference.get();
                        if (obj == null) {
                            if (valueReference.d()) {
                                int i3 = this.count;
                                this.modCount++;
                                atomicReferenceArray.set(length, a(kVar, kVar2, key, i, obj, valueReference, l.COLLECTED));
                                this.count--;
                            }
                            return false;
                        } else if (this.map.g.equivalent(v, obj)) {
                            this.modCount++;
                            a(k2, (V) obj, valueReference.a(), l.REPLACED);
                            a(kVar2, k, v2, a2);
                            a(kVar2);
                            unlock();
                            b();
                            return true;
                        } else {
                            c(kVar2, a2);
                            unlock();
                            b();
                            return false;
                        }
                    }
                }
                unlock();
                b();
                return false;
            } finally {
                unlock();
                b();
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
                a(a2);
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                k kVar = atomicReferenceArray.get(length);
                k kVar2 = kVar;
                while (kVar2 != null) {
                    Object key = kVar2.getKey();
                    if (kVar2.getHash() != i2 || key == null || !this.map.f24454f.equivalent(k2, key)) {
                        kVar2 = kVar2.getNext();
                    } else {
                        w valueReference = kVar2.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 == null) {
                            if (valueReference.d()) {
                                int i3 = this.count;
                                this.modCount++;
                                atomicReferenceArray.set(length, a(kVar, kVar2, key, i, v2, valueReference, l.COLLECTED));
                                this.count--;
                            }
                            return null;
                        }
                        this.modCount++;
                        a(k2, v2, valueReference.a(), l.REPLACED);
                        a(kVar2, k, v, a2);
                        a(kVar2);
                        unlock();
                        b();
                        return v2;
                    }
                }
                unlock();
                b();
                return null;
            } finally {
                unlock();
                b();
            }
        }

        private boolean a(K k, int i, j<K, V> jVar, V v) {
            lock();
            long a2 = this.map.q.a();
            a(a2);
            int i2 = this.count + 1;
            if (i2 > this.threshold) {
                j();
                i2 = this.count + 1;
            }
            AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
            int length = i & (atomicReferenceArray.length() - 1);
            k kVar = atomicReferenceArray.get(length);
            k kVar2 = kVar;
            while (kVar2 != null) {
                Object key = kVar2.getKey();
                if (kVar2.getHash() != i || key == null || !this.map.f24454f.equivalent(k, key)) {
                    try {
                        kVar2 = kVar2.getNext();
                    } catch (Throwable th) {
                        unlock();
                        b();
                        throw th;
                    }
                } else {
                    w<Object, Object> valueReference = kVar2.getValueReference();
                    Object obj = valueReference.get();
                    if (jVar != valueReference) {
                        if (obj != null || valueReference == g.u) {
                            a(k, v, 0, l.REPLACED);
                            unlock();
                            b();
                            return false;
                        }
                    }
                    this.modCount++;
                    if (jVar.d()) {
                        a(k, (V) obj, jVar.a(), obj == null ? l.COLLECTED : l.REPLACED);
                        i2--;
                    }
                    a(kVar2, k, v, a2);
                    this.count = i2;
                    a(kVar2);
                    unlock();
                    b();
                    return true;
                }
            }
            this.modCount++;
            k a3 = a(k, i, kVar);
            a(a3, k, v, a2);
            atomicReferenceArray.set(length, a3);
            this.count = i2;
            a(a3);
            unlock();
            b();
            return true;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(k<K, V> kVar, int i) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                k<K, V> kVar2 = atomicReferenceArray.get(length);
                for (k<K, V> kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.getNext()) {
                    if (kVar3 == kVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, a(kVar2, kVar3, kVar3.getKey(), i, kVar3.getValueReference().get(), kVar3.getValueReference(), l.COLLECTED));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                b();
                return false;
            } finally {
                unlock();
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(K k, int i, w<K, V> wVar) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                k kVar = atomicReferenceArray.get(length);
                k kVar2 = kVar;
                while (kVar2 != null) {
                    Object key = kVar2.getKey();
                    if (kVar2.getHash() != i || key == null || !this.map.f24454f.equivalent(k, key)) {
                        kVar2 = kVar2.getNext();
                    } else if (kVar2.getValueReference() == wVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, a(kVar, kVar2, key, i, wVar.get(), wVar, l.COLLECTED));
                        this.count--;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            b();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    b();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    b();
                }
            }
        }

        private boolean a(K k, int i, j<K, V> jVar) {
            lock();
            try {
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                k kVar = atomicReferenceArray.get(length);
                k kVar2 = kVar;
                while (kVar2 != null) {
                    Object key = kVar2.getKey();
                    if (kVar2.getHash() != i || key == null || !this.map.f24454f.equivalent(k, key)) {
                        kVar2 = kVar2.getNext();
                    } else if (kVar2.getValueReference() == jVar) {
                        if (jVar.d()) {
                            kVar2.setValueReference(jVar.f24486a);
                        } else {
                            atomicReferenceArray.set(length, b(kVar, kVar2));
                        }
                        return true;
                    } else {
                        unlock();
                        b();
                        return false;
                    }
                }
                unlock();
                b();
                return false;
            } finally {
                unlock();
                b();
            }
        }

        @VisibleForTesting
        @GuardedBy
        private boolean a(k<K, V> kVar, int i, l lVar) {
            int i2 = this.count;
            AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            k<K, V> kVar2 = atomicReferenceArray.get(length);
            for (k<K, V> kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.getNext()) {
                if (kVar3 == kVar) {
                    this.modCount++;
                    atomicReferenceArray.set(length, a(kVar2, kVar3, kVar3.getKey(), i, kVar3.getValueReference().get(), kVar3.getValueReference(), lVar));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                c();
            }
        }

        private void k() {
            if (!isHeldByCurrentThread()) {
                this.map.m();
            }
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            d(this.map.q.a());
            k();
        }

        private void d() {
            if (tryLock()) {
                try {
                    e();
                } finally {
                    unlock();
                }
            }
        }

        @GuardedBy
        private void e() {
            if (this.map.h()) {
                f();
            }
            if (this.map.i()) {
                g();
            }
        }

        @GuardedBy
        private void f() {
            int i = 0;
            do {
                Reference<? extends T> poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((k) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy
        private void g() {
            int i = 0;
            do {
                Reference<? extends T> poll = this.valueReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((w) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy
        private void h() {
            while (true) {
                k poll = this.recencyQueue.poll();
                if (poll == null) {
                    return;
                }
                if (this.accessQueue.contains(poll)) {
                    this.accessQueue.add(poll);
                }
            }
        }

        @GuardedBy
        private k<K, V> i() {
            for (k<K, V> kVar : this.accessQueue) {
                if (kVar.getValueReference().a() > 0) {
                    return kVar;
                }
            }
            throw new AssertionError();
        }

        @GuardedBy
        private void j() {
            AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray<k<K, V>> a2 = a(length << 1);
                this.threshold = (a2.length() * 3) / 4;
                int length2 = a2.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    k kVar = atomicReferenceArray.get(i2);
                    if (kVar != null) {
                        k next = kVar.getNext();
                        int hash = kVar.getHash() & length2;
                        if (next == null) {
                            a2.set(hash, kVar);
                        } else {
                            k kVar2 = kVar;
                            while (next != null) {
                                int hash2 = next.getHash() & length2;
                                if (hash2 != hash) {
                                    kVar2 = next;
                                    hash = hash2;
                                }
                                next = next.getNext();
                            }
                            a2.set(hash, kVar2);
                            while (kVar != kVar2) {
                                int hash3 = kVar.getHash() & length2;
                                k a3 = a(kVar, a2.get(hash3));
                                if (a3 != null) {
                                    a2.set(hash3, a3);
                                } else {
                                    b(kVar);
                                    i--;
                                }
                                kVar = kVar.getNext();
                            }
                        }
                    }
                }
                this.table = a2;
                this.count = i;
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        public final void a(long j) {
            d(j);
        }

        private static AtomicReferenceArray<k<K, V>> a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        private k<K, V> b(int i) {
            AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        private void b(long j) {
            if (tryLock()) {
                try {
                    c(j);
                } finally {
                    unlock();
                }
            }
        }

        @GuardedBy
        private void b(k<K, V> kVar) {
            Object key = kVar.getKey();
            kVar.getHash();
            a((K) key, (V) kVar.getValueReference().get(), kVar.getValueReference().a(), l.COLLECTED);
            this.writeQueue.remove(kVar);
            this.accessQueue.remove(kVar);
        }

        @GuardedBy
        private void c(long j) {
            k peek;
            k peek2;
            h();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.a(peek, j)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.a(peek2, j)) {
                            return;
                        }
                    } while (a(peek2, peek2.getHash(), l.EXPIRED));
                    throw new AssertionError();
                }
            } while (a(peek, peek.getHash(), l.EXPIRED));
            throw new AssertionError();
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

        @NullableDecl
        @GuardedBy
        private k<K, V> b(k<K, V> kVar, k<K, V> kVar2) {
            int i = this.count;
            k<K, V> next = kVar2.getNext();
            while (kVar != kVar2) {
                k<K, V> a2 = a(kVar, next);
                if (a2 != null) {
                    next = a2;
                } else {
                    b(kVar);
                    i--;
                }
                kVar = kVar.getNext();
            }
            this.count = i;
            return next;
        }

        @GuardedBy
        private void c(k<K, V> kVar, long j) {
            if (this.map.g()) {
                kVar.setAccessTime(j);
            }
            this.accessQueue.add(kVar);
        }

        @GuardedBy
        private k<K, V> a(k<K, V> kVar, k<K, V> kVar2) {
            if (kVar.getKey() == null) {
                return null;
            }
            w valueReference = kVar.getValueReference();
            Object obj = valueReference.get();
            if (obj == null && valueReference.d()) {
                return null;
            }
            k<K, V> copyEntry = this.map.r.copyEntry(this, kVar, kVar2);
            copyEntry.setValueReference(valueReference.a(this.valueReferenceQueue, obj, copyEntry));
            return copyEntry;
        }

        @NullableDecl
        private k<K, V> d(Object obj, int i) {
            for (k<K, V> b2 = b(i); b2 != null; b2 = b2.getNext()) {
                if (b2.getHash() == i) {
                    Object key = b2.getKey();
                    if (key == null) {
                        d();
                    } else if (this.map.f24454f.equivalent(obj, key)) {
                        return b2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final V c(Object obj, int i) {
            l lVar;
            lock();
            try {
                a(this.map.q.a());
                int i2 = this.count;
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                k kVar = atomicReferenceArray.get(length);
                k kVar2 = kVar;
                while (kVar2 != null) {
                    Object key = kVar2.getKey();
                    if (kVar2.getHash() != i || key == null || !this.map.f24454f.equivalent(obj, key)) {
                        kVar2 = kVar2.getNext();
                    } else {
                        w valueReference = kVar2.getValueReference();
                        V v = valueReference.get();
                        if (v != null) {
                            lVar = l.EXPLICIT;
                        } else if (valueReference.d()) {
                            lVar = l.COLLECTED;
                        } else {
                            unlock();
                            b();
                            return null;
                        }
                        l lVar2 = lVar;
                        this.modCount++;
                        atomicReferenceArray.set(length, a(kVar, kVar2, key, i, v, valueReference, lVar2));
                        this.count--;
                        return v;
                    }
                }
                unlock();
                b();
                return null;
            } finally {
                unlock();
                b();
            }
        }

        private void b(k<K, V> kVar, long j) {
            if (this.map.g()) {
                kVar.setAccessTime(j);
            }
            this.recencyQueue.add(kVar);
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    k a2 = a(obj, i, this.map.q.a());
                    if (a2 == null) {
                        return false;
                    }
                    if (a2.getValueReference().get() != null) {
                        z = true;
                    }
                    a();
                    return z;
                }
                a();
                return false;
            } finally {
                a();
            }
        }

        @GuardedBy
        private k<K, V> a(K k, int i, @NullableDecl k<K, V> kVar) {
            return this.map.r.newEntry(this, com.google.common.a.m.a(k), i, kVar);
        }

        @NullableDecl
        private k<K, V> a(Object obj, int i, long j) {
            k<K, V> d2 = d(obj, i);
            if (d2 == null) {
                return null;
            }
            if (!this.map.a(d2, j)) {
                return d2;
            }
            b(j);
            return null;
        }

        /* JADX INFO: finally extract failed */
        @NullableDecl
        private j<K, V> a(K k, int i, boolean z) {
            lock();
            try {
                long a2 = this.map.q.a();
                a(a2);
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                k kVar = atomicReferenceArray.get(length);
                k kVar2 = kVar;
                while (kVar2 != null) {
                    Object key = kVar2.getKey();
                    if (kVar2.getHash() != i || key == null || !this.map.f24454f.equivalent(k, key)) {
                        kVar2 = kVar2.getNext();
                    } else {
                        w valueReference = kVar2.getValueReference();
                        if (!valueReference.c()) {
                            if (!z || a2 - kVar2.getWriteTime() >= this.map.n) {
                                this.modCount++;
                                j<K, V> jVar = new j<>(valueReference);
                                kVar2.setValueReference(jVar);
                                unlock();
                                b();
                                return jVar;
                            }
                        }
                        unlock();
                        b();
                        return null;
                    }
                }
                this.modCount++;
                j<K, V> jVar2 = new j<>();
                k a3 = a(k, i, kVar);
                a3.setValueReference(jVar2);
                atomicReferenceArray.set(length, a3);
                unlock();
                b();
                return jVar2;
            } catch (Throwable th) {
                unlock();
                b();
                throw th;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
            r3 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private V b(K r17, int r18, com.google.common.b.d<? super K, V> r19) throws java.util.concurrent.ExecutionException {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                r16.lock()
                com.google.common.b.g<K, V> r3 = r1.map     // Catch:{ all -> 0x00d0 }
                com.google.common.a.v r3 = r3.q     // Catch:{ all -> 0x00d0 }
                long r3 = r3.a()     // Catch:{ all -> 0x00d0 }
                r1.a((long) r3)     // Catch:{ all -> 0x00d0 }
                int r5 = r1.count     // Catch:{ all -> 0x00d0 }
                r6 = 1
                int r5 = r5 - r6
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.b.k<K, V>> r7 = r1.table     // Catch:{ all -> 0x00d0 }
                int r8 = r7.length()     // Catch:{ all -> 0x00d0 }
                int r8 = r8 - r6
                r8 = r8 & r2
                java.lang.Object r9 = r7.get(r8)     // Catch:{ all -> 0x00d0 }
                com.google.common.b.k r9 = (com.google.common.b.k) r9     // Catch:{ all -> 0x00d0 }
                r10 = r9
            L_0x0027:
                r11 = 0
                if (r10 == 0) goto L_0x008e
                java.lang.Object r12 = r10.getKey()     // Catch:{ all -> 0x00d0 }
                int r13 = r10.getHash()     // Catch:{ all -> 0x00d0 }
                if (r13 != r2) goto L_0x0089
                if (r12 == 0) goto L_0x0089
                com.google.common.b.g<K, V> r13 = r1.map     // Catch:{ all -> 0x00d0 }
                com.google.common.a.d<java.lang.Object> r13 = r13.f24454f     // Catch:{ all -> 0x00d0 }
                boolean r13 = r13.equivalent(r0, r12)     // Catch:{ all -> 0x00d0 }
                if (r13 == 0) goto L_0x0089
                com.google.common.b.g$w r13 = r10.getValueReference()     // Catch:{ all -> 0x00d0 }
                boolean r14 = r13.c()     // Catch:{ all -> 0x00d0 }
                if (r14 == 0) goto L_0x004c
                r3 = 0
                goto L_0x0090
            L_0x004c:
                java.lang.Object r14 = r13.get()     // Catch:{ all -> 0x00d0 }
                if (r14 != 0) goto L_0x005c
                int r3 = r13.a()     // Catch:{ all -> 0x00d0 }
                com.google.common.b.l r4 = com.google.common.b.l.COLLECTED     // Catch:{ all -> 0x00d0 }
                r1.a((K) r12, (V) r14, (int) r3, (com.google.common.b.l) r4)     // Catch:{ all -> 0x00d0 }
                goto L_0x006d
            L_0x005c:
                com.google.common.b.g<K, V> r15 = r1.map     // Catch:{ all -> 0x00d0 }
                boolean r15 = r15.a((com.google.common.b.k<K, V>) r10, (long) r3)     // Catch:{ all -> 0x00d0 }
                if (r15 == 0) goto L_0x007a
                int r3 = r13.a()     // Catch:{ all -> 0x00d0 }
                com.google.common.b.l r4 = com.google.common.b.l.EXPIRED     // Catch:{ all -> 0x00d0 }
                r1.a((K) r12, (V) r14, (int) r3, (com.google.common.b.l) r4)     // Catch:{ all -> 0x00d0 }
            L_0x006d:
                java.util.Queue<com.google.common.b.k<K, V>> r3 = r1.writeQueue     // Catch:{ all -> 0x00d0 }
                r3.remove(r10)     // Catch:{ all -> 0x00d0 }
                java.util.Queue<com.google.common.b.k<K, V>> r3 = r1.accessQueue     // Catch:{ all -> 0x00d0 }
                r3.remove(r10)     // Catch:{ all -> 0x00d0 }
                r1.count = r5     // Catch:{ all -> 0x00d0 }
                goto L_0x008f
            L_0x007a:
                r1.c((com.google.common.b.k<K, V>) r10, (long) r3)     // Catch:{ all -> 0x00d0 }
                com.google.common.b.a$b r0 = r1.statsCounter     // Catch:{ all -> 0x00d0 }
                r0.a((int) r6)     // Catch:{ all -> 0x00d0 }
                r16.unlock()
                r16.b()
                return r14
            L_0x0089:
                com.google.common.b.k r10 = r10.getNext()     // Catch:{ all -> 0x00d0 }
                goto L_0x0027
            L_0x008e:
                r13 = r11
            L_0x008f:
                r3 = 1
            L_0x0090:
                if (r3 == 0) goto L_0x00a7
                com.google.common.b.g$j r11 = new com.google.common.b.g$j     // Catch:{ all -> 0x00d0 }
                r11.<init>()     // Catch:{ all -> 0x00d0 }
                if (r10 != 0) goto L_0x00a4
                com.google.common.b.k r10 = r1.a((K) r0, (int) r2, (com.google.common.b.k<K, V>) r9)     // Catch:{ all -> 0x00d0 }
                r10.setValueReference(r11)     // Catch:{ all -> 0x00d0 }
                r7.set(r8, r10)     // Catch:{ all -> 0x00d0 }
                goto L_0x00a7
            L_0x00a4:
                r10.setValueReference(r11)     // Catch:{ all -> 0x00d0 }
            L_0x00a7:
                r16.unlock()
                r16.b()
                if (r3 == 0) goto L_0x00cb
                monitor-enter(r10)     // Catch:{ all -> 0x00c4 }
                r3 = r19
                com.google.common.util.concurrent.q r3 = r11.a(r0, r3)     // Catch:{ all -> 0x00c1 }
                java.lang.Object r0 = r1.a((java.lang.Object) r0, (int) r2, (com.google.common.b.g.j) r11, (com.google.common.util.concurrent.q) r3)     // Catch:{ all -> 0x00c1 }
                monitor-exit(r10)     // Catch:{ all -> 0x00c1 }
                com.google.common.b.a$b r2 = r1.statsCounter
                r2.b((int) r6)
                return r0
            L_0x00c1:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00c1 }
                throw r0     // Catch:{ all -> 0x00c4 }
            L_0x00c4:
                r0 = move-exception
                com.google.common.b.a$b r2 = r1.statsCounter
                r2.b((int) r6)
                throw r0
            L_0x00cb:
                java.lang.Object r0 = r1.a((com.google.common.b.k<K, V>) r10, (K) r0, (com.google.common.b.g.w<K, V>) r13)
                return r0
            L_0x00d0:
                r0 = move-exception
                r16.unlock()
                r16.b()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.b.g.n.b(java.lang.Object, int, com.google.common.b.d):java.lang.Object");
        }

        private V a(k<K, V> kVar, K k, w<K, V> wVar) throws ExecutionException {
            if (wVar.c()) {
                com.google.common.a.m.a(!Thread.holdsLock(kVar), "Recursive load of: %s", (Object) k);
                try {
                    V e2 = wVar.e();
                    if (e2 != null) {
                        b(kVar, this.map.q.a());
                        return e2;
                    }
                    throw new d.b("CacheLoader returned null for key " + k + ClassUtils.PACKAGE_SEPARATOR);
                } finally {
                    this.statsCounter.b(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Object obj, int i, Object obj2) {
            l lVar;
            lock();
            try {
                a(this.map.q.a());
                int i2 = this.count;
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                k kVar = atomicReferenceArray.get(length);
                k kVar2 = kVar;
                while (kVar2 != null) {
                    Object key = kVar2.getKey();
                    if (kVar2.getHash() != i || key == null || !this.map.f24454f.equivalent(obj, key)) {
                        kVar2 = kVar2.getNext();
                    } else {
                        w valueReference = kVar2.getValueReference();
                        Object obj3 = valueReference.get();
                        if (this.map.g.equivalent(obj2, obj3)) {
                            lVar = l.EXPLICIT;
                        } else if (obj3 != null || !valueReference.d()) {
                            unlock();
                            b();
                            return false;
                        } else {
                            lVar = l.COLLECTED;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, a(kVar, kVar2, key, i, obj3, valueReference, lVar));
                        this.count--;
                        if (lVar != l.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                b();
                return false;
            } finally {
                unlock();
                b();
            }
        }

        n(g<K, V> gVar, int i, long j, a.b bVar) {
            ReferenceQueue<K> referenceQueue;
            Queue<k<K, V>> queue;
            Queue<k<K, V>> queue2;
            Queue<k<K, V>> queue3;
            this.map = gVar;
            this.maxSegmentWeight = j;
            this.statsCounter = (a.b) com.google.common.a.m.a(bVar);
            AtomicReferenceArray<k<K, V>> a2 = a(i);
            this.threshold = (a2.length() * 3) / 4;
            if (!this.map.b() && ((long) this.threshold) == this.maxSegmentWeight) {
                this.threshold++;
            }
            this.table = a2;
            ReferenceQueue<V> referenceQueue2 = null;
            if (gVar.h()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.keyReferenceQueue = referenceQueue;
            this.valueReferenceQueue = gVar.i() ? new ReferenceQueue<>() : referenceQueue2;
            if (gVar.d()) {
                queue = new ConcurrentLinkedQueue<>();
            } else {
                queue = g.l();
            }
            this.recencyQueue = queue;
            if (gVar.e()) {
                queue2 = new ag<>();
            } else {
                queue2 = g.l();
            }
            this.writeQueue = queue2;
            if (gVar.d()) {
                queue3 = new c<>();
            } else {
                queue3 = g.l();
            }
            this.accessQueue = queue3;
        }

        @NullableDecl
        private V a(K k, int i, d<? super K, V> dVar, boolean z) {
            final j a2 = a(k, i, true);
            if (a2 == null) {
                return null;
            }
            com.google.common.util.concurrent.q a3 = a2.a(k, dVar);
            final K k2 = k;
            final int i2 = i;
            final com.google.common.util.concurrent.q qVar = a3;
            AnonymousClass1 r0 = new Runnable() {
                public final void run() {
                    try {
                        n.this.a(k2, i2, a2, qVar);
                    } catch (Throwable th) {
                        g.f24449a.log(Level.WARNING, "Exception thrown during refresh", th);
                        a2.a(th);
                    }
                }
            };
            a3.a(r0, com.google.common.util.concurrent.v.a());
            if (a3.isDone()) {
                try {
                    return com.google.common.util.concurrent.z.a(a3);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        private V a(k<K, V> kVar, K k, int i, V v, long j, d<? super K, V> dVar) {
            if (this.map.c() && j - kVar.getWriteTime() > this.map.n && !kVar.getValueReference().c()) {
                V a2 = a(k, i, dVar, true);
                if (a2 != null) {
                    return a2;
                }
            }
            return v;
        }

        @NullableDecl
        @GuardedBy
        private k<K, V> a(k<K, V> kVar, k<K, V> kVar2, @NullableDecl K k, int i, V v, w<K, V> wVar, l lVar) {
            a(k, v, wVar.a(), lVar);
            this.writeQueue.remove(kVar2);
            this.accessQueue.remove(kVar2);
            if (!wVar.c()) {
                return b(kVar, kVar2);
            }
            wVar.a(null);
            return kVar;
        }
    }

    static class o<K, V> extends SoftReference<V> implements w<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final k<K, V> f24498a;

        public int a() {
            return 1;
        }

        public final void a(V v) {
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return true;
        }

        public final k<K, V> b() {
            return this.f24498a;
        }

        public final V e() {
            return get();
        }

        o(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            super(v, referenceQueue);
            this.f24498a = kVar;
        }

        public w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            return new o(referenceQueue, v, kVar);
        }
    }

    public enum p {
        STRONG {
            /* access modifiers changed from: package-private */
            public final com.google.common.a.d<Object> defaultEquivalence() {
                return com.google.common.a.d.equals();
            }

            /* access modifiers changed from: package-private */
            public final <K, V> w<K, V> referenceValue(n<K, V> nVar, k<K, V> kVar, V v, int i) {
                if (i == 1) {
                    return new t(v);
                }
                return new ae(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            public final com.google.common.a.d<Object> defaultEquivalence() {
                return com.google.common.a.d.identity();
            }

            /* access modifiers changed from: package-private */
            public final <K, V> w<K, V> referenceValue(n<K, V> nVar, k<K, V> kVar, V v, int i) {
                if (i == 1) {
                    return new o(nVar.valueReferenceQueue, v, kVar);
                }
                return new ad(nVar.valueReferenceQueue, v, kVar, i);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public final com.google.common.a.d<Object> defaultEquivalence() {
                return com.google.common.a.d.identity();
            }

            /* access modifiers changed from: package-private */
            public final <K, V> w<K, V> referenceValue(n<K, V> nVar, k<K, V> kVar, V v, int i) {
                if (i == 1) {
                    return new ab(nVar.valueReferenceQueue, v, kVar);
                }
                return new af(nVar.valueReferenceQueue, v, kVar, i);
            }
        };

        /* access modifiers changed from: package-private */
        public abstract com.google.common.a.d<Object> defaultEquivalence();

        /* access modifiers changed from: package-private */
        public abstract <K, V> w<K, V> referenceValue(n<K, V> nVar, k<K, V> kVar, V v, int i);
    }

    static final class q<K, V> extends s<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f24499a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f24500b = g.k();

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f24501c = g.k();

        public final long getAccessTime() {
            return this.f24499a;
        }

        public final k<K, V> getNextInAccessQueue() {
            return this.f24500b;
        }

        public final k<K, V> getPreviousInAccessQueue() {
            return this.f24501c;
        }

        public final void setAccessTime(long j) {
            this.f24499a = j;
        }

        public final void setNextInAccessQueue(k<K, V> kVar) {
            this.f24500b = kVar;
        }

        public final void setPreviousInAccessQueue(k<K, V> kVar) {
            this.f24501c = kVar;
        }

        q(K k, int i, @NullableDecl k<K, V> kVar) {
            super(k, i, kVar);
        }
    }

    static final class r<K, V> extends s<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f24502a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f24503b = g.k();

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f24504c = g.k();

        /* renamed from: d  reason: collision with root package name */
        volatile long f24505d = Long.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        k<K, V> f24506e = g.k();

        /* renamed from: f  reason: collision with root package name */
        k<K, V> f24507f = g.k();

        public final long getAccessTime() {
            return this.f24502a;
        }

        public final k<K, V> getNextInAccessQueue() {
            return this.f24503b;
        }

        public final k<K, V> getNextInWriteQueue() {
            return this.f24506e;
        }

        public final k<K, V> getPreviousInAccessQueue() {
            return this.f24504c;
        }

        public final k<K, V> getPreviousInWriteQueue() {
            return this.f24507f;
        }

        public final long getWriteTime() {
            return this.f24505d;
        }

        public final void setAccessTime(long j) {
            this.f24502a = j;
        }

        public final void setNextInAccessQueue(k<K, V> kVar) {
            this.f24503b = kVar;
        }

        public final void setNextInWriteQueue(k<K, V> kVar) {
            this.f24506e = kVar;
        }

        public final void setPreviousInAccessQueue(k<K, V> kVar) {
            this.f24504c = kVar;
        }

        public final void setPreviousInWriteQueue(k<K, V> kVar) {
            this.f24507f = kVar;
        }

        public final void setWriteTime(long j) {
            this.f24505d = j;
        }

        r(K k, int i, @NullableDecl k<K, V> kVar) {
            super(k, i, kVar);
        }
    }

    static class s<K, V> extends b<K, V> {
        final K g;
        final int h;
        @NullableDecl
        final k<K, V> i;
        volatile w<K, V> j = g.j();

        public int getHash() {
            return this.h;
        }

        public K getKey() {
            return this.g;
        }

        public k<K, V> getNext() {
            return this.i;
        }

        public w<K, V> getValueReference() {
            return this.j;
        }

        public void setValueReference(w<K, V> wVar) {
            this.j = wVar;
        }

        s(K k, int i2, @NullableDecl k<K, V> kVar) {
            this.g = k;
            this.h = i2;
            this.i = kVar;
        }
    }

    static class t<K, V> implements w<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final V f24508a;

        public int a() {
            return 1;
        }

        public final w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            return this;
        }

        public final void a(V v) {
        }

        public final k<K, V> b() {
            return null;
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return true;
        }

        public V get() {
            return this.f24508a;
        }

        public final V e() {
            return get();
        }

        t(V v) {
            this.f24508a = v;
        }
    }

    static final class u<K, V> extends s<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f24509a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f24510b = g.k();

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f24511c = g.k();

        public final k<K, V> getNextInWriteQueue() {
            return this.f24510b;
        }

        public final k<K, V> getPreviousInWriteQueue() {
            return this.f24511c;
        }

        public final long getWriteTime() {
            return this.f24509a;
        }

        public final void setNextInWriteQueue(k<K, V> kVar) {
            this.f24510b = kVar;
        }

        public final void setPreviousInWriteQueue(k<K, V> kVar) {
            this.f24511c = kVar;
        }

        public final void setWriteTime(long j) {
            this.f24509a = j;
        }

        u(K k, int i, @NullableDecl k<K, V> kVar) {
            super(k, i, kVar);
        }
    }

    final class v extends C0281g<V> {
        public final V next() {
            return a().getValue();
        }

        v() {
            super();
        }
    }

    interface w<K, V> {
        int a();

        w<K, V> a(ReferenceQueue<V> referenceQueue, @NullableDecl V v, k<K, V> kVar);

        void a(@NullableDecl V v);

        @NullableDecl
        k<K, V> b();

        boolean c();

        boolean d();

        V e() throws ExecutionException;

        @NullableDecl
        V get();
    }

    final class x extends AbstractCollection<V> {

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<?, ?> f24514b;

        public final void clear() {
            this.f24514b.clear();
        }

        public final boolean isEmpty() {
            return this.f24514b.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new v();
        }

        public final int size() {
            return this.f24514b.size();
        }

        public final Object[] toArray() {
            return g.a((Collection<E>) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f24514b.containsValue(obj);
        }

        public final <E> E[] toArray(E[] eArr) {
            return g.a((Collection<E>) this).toArray(eArr);
        }

        x(ConcurrentMap<?, ?> concurrentMap) {
            this.f24514b = concurrentMap;
        }
    }

    static final class y<K, V> extends aa<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f24515a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f24516b = g.k();

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f24517c = g.k();

        public final long getAccessTime() {
            return this.f24515a;
        }

        public final k<K, V> getNextInAccessQueue() {
            return this.f24516b;
        }

        public final k<K, V> getPreviousInAccessQueue() {
            return this.f24517c;
        }

        public final void setAccessTime(long j) {
            this.f24515a = j;
        }

        public final void setNextInAccessQueue(k<K, V> kVar) {
            this.f24516b = kVar;
        }

        public final void setPreviousInAccessQueue(k<K, V> kVar) {
            this.f24517c = kVar;
        }

        y(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl k<K, V> kVar) {
            super(referenceQueue, k, i, kVar);
        }
    }

    static final class z<K, V> extends aa<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f24518a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f24519b = g.k();

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f24520c = g.k();

        /* renamed from: d  reason: collision with root package name */
        volatile long f24521d = Long.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        k<K, V> f24522e = g.k();

        /* renamed from: f  reason: collision with root package name */
        k<K, V> f24523f = g.k();

        public final long getAccessTime() {
            return this.f24518a;
        }

        public final k<K, V> getNextInAccessQueue() {
            return this.f24519b;
        }

        public final k<K, V> getNextInWriteQueue() {
            return this.f24522e;
        }

        public final k<K, V> getPreviousInAccessQueue() {
            return this.f24520c;
        }

        public final k<K, V> getPreviousInWriteQueue() {
            return this.f24523f;
        }

        public final long getWriteTime() {
            return this.f24521d;
        }

        public final void setAccessTime(long j) {
            this.f24518a = j;
        }

        public final void setNextInAccessQueue(k<K, V> kVar) {
            this.f24519b = kVar;
        }

        public final void setNextInWriteQueue(k<K, V> kVar) {
            this.f24522e = kVar;
        }

        public final void setPreviousInAccessQueue(k<K, V> kVar) {
            this.f24520c = kVar;
        }

        public final void setPreviousInWriteQueue(k<K, V> kVar) {
            this.f24523f = kVar;
        }

        public final void setWriteTime(long j) {
            this.f24521d = j;
        }

        z(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl k<K, V> kVar) {
            super(referenceQueue, k, i, kVar);
        }
    }

    static <K, V> w<K, V> j() {
        return u;
    }

    static <K, V> k<K, V> k() {
        return m.INSTANCE;
    }

    static <E> Queue<E> l() {
        return v;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return o();
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return p();
    }

    private boolean o() {
        if (this.m > 0) {
            return true;
        }
        return false;
    }

    private boolean p() {
        if (this.l > 0) {
            return true;
        }
        return false;
    }

    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.y;
        if (set != null) {
            return set;
        }
        f fVar = new f(this);
        this.y = fVar;
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        if (this.h != p.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        if (this.i != p.STRONG) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.w;
        if (set != null) {
            return set;
        }
        i iVar = new i(this);
        this.w = iVar;
        return iVar;
    }

    public int size() {
        return com.google.common.f.a.a(n());
    }

    public Collection<V> values() {
        Collection<V> collection = this.x;
        if (collection != null) {
            return collection;
        }
        x xVar = new x(this);
        this.x = xVar;
        return xVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.k != c.b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (this.n > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (p() || a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (o() || c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        while (true) {
            n poll = this.o.poll();
            if (poll != null) {
                try {
                    this.p.onRemoval(poll);
                } catch (Throwable th) {
                    f24449a.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final long n() {
        n<K, V>[] nVarArr = this.f24452d;
        long j2 = 0;
        for (n<K, V> nVar : nVarArr) {
            j2 += (long) Math.max(0, nVar.count);
        }
        return j2;
    }

    public boolean isEmpty() {
        n<K, V>[] nVarArr = this.f24452d;
        long j2 = 0;
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            if (nVarArr[i2].count != 0) {
                return false;
            }
            j2 += (long) nVarArr[i2].modCount;
        }
        if (j2 != 0) {
            for (int i3 = 0; i3 < nVarArr.length; i3++) {
                if (nVarArr[i3].count != 0) {
                    return false;
                }
                j2 -= (long) nVarArr[i3].modCount;
            }
            if (j2 != 0) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        l lVar;
        n<K, V>[] nVarArr = this.f24452d;
        int length = nVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            n<K, V> nVar = nVarArr[i2];
            if (nVar.count != 0) {
                nVar.lock();
                try {
                    nVar.a(nVar.map.q.a());
                    AtomicReferenceArray<k<K, V>> atomicReferenceArray = nVar.table;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (k kVar = atomicReferenceArray.get(i3); kVar != null; kVar = kVar.getNext()) {
                            if (kVar.getValueReference().d()) {
                                Object key = kVar.getKey();
                                Object obj = kVar.getValueReference().get();
                                if (key != null) {
                                    if (obj != null) {
                                        lVar = l.EXPLICIT;
                                        kVar.getHash();
                                        nVar.a(key, obj, kVar.getValueReference().a(), lVar);
                                    }
                                }
                                lVar = l.COLLECTED;
                                kVar.getHash();
                                nVar.a(key, obj, kVar.getValueReference().a(), lVar);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (nVar.map.h()) {
                        do {
                        } while (nVar.keyReferenceQueue.poll() != null);
                    }
                    if (nVar.map.i()) {
                        do {
                        } while (nVar.valueReferenceQueue.poll() != null);
                    }
                    nVar.writeQueue.clear();
                    nVar.accessQueue.clear();
                    nVar.readCount.set(0);
                    nVar.modCount++;
                    nVar.count = 0;
                } finally {
                    nVar.unlock();
                    nVar.b();
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

    static <K, V> void b(k<K, V> kVar) {
        k k2 = k();
        kVar.setNextInAccessQueue(k2);
        kVar.setPreviousInAccessQueue(k2);
    }

    static <K, V> void c(k<K, V> kVar) {
        k k2 = k();
        kVar.setNextInWriteQueue(k2);
        kVar.setPreviousInWriteQueue(k2);
    }

    public static <E> ArrayList<E> a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        aw.a((Collection<T>) arrayList, collection.iterator());
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
        int hash = this.f24454f.hash(obj);
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
    public final n<K, V> a(int i2) {
        return this.f24452d[(i2 >>> this.f24451c) & this.f24450b];
    }

    public boolean containsValue(@NullableDecl Object obj) {
        long j2;
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a2 = this.q.a();
        n<K, V>[] nVarArr = this.f24452d;
        long j3 = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = nVarArr.length;
            long j4 = 0;
            int i3 = 0;
            while (i3 < length) {
                n<K, V> nVar = nVarArr[i3];
                int i4 = nVar.count;
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = nVar.table;
                for (int i5 = 0; i5 < atomicReferenceArray.length(); i5++) {
                    k kVar = atomicReferenceArray.get(i5);
                    while (kVar != null) {
                        n<K, V>[] nVarArr2 = nVarArr;
                        Object a3 = nVar.a(kVar, a2);
                        if (a3 != null) {
                            j2 = a2;
                            if (this.g.equivalent(obj2, a3)) {
                                return true;
                            }
                        } else {
                            j2 = a2;
                        }
                        kVar = kVar.getNext();
                        nVarArr = nVarArr2;
                        a2 = j2;
                    }
                    long j5 = a2;
                    n<K, V>[] nVarArr3 = nVarArr;
                }
                n<K, V>[] nVarArr4 = nVarArr;
                j4 += (long) nVar.modCount;
                i3++;
                a2 = a2;
            }
            long j6 = a2;
            n<K, V>[] nVarArr5 = nVarArr;
            if (j4 == j3) {
                break;
            }
            i2++;
            j3 = j4;
            nVarArr = nVarArr5;
            a2 = j6;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(w<K, V> wVar) {
        k b2 = wVar.b();
        int hash = b2.getHash();
        a(hash).a(b2.getKey(), hash, wVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(k<K, V> kVar) {
        int hash = kVar.getHash();
        a(hash).a(kVar, hash);
    }

    static <K, V> void a(k<K, V> kVar, k<K, V> kVar2) {
        kVar.setNextInAccessQueue(kVar2);
        kVar2.setPreviousInAccessQueue(kVar);
    }

    static <K, V> void b(k<K, V> kVar, k<K, V> kVar2) {
        kVar.setNextInWriteQueue(kVar2);
        kVar2.setPreviousInWriteQueue(kVar);
    }

    @NullableDecl
    public V getOrDefault(@NullableDecl Object obj, @NullableDecl V v2) {
        V v3 = get(obj);
        if (v3 != null) {
            return v3;
        }
        return v2;
    }

    public V put(K k2, V v2) {
        com.google.common.a.m.a(k2);
        com.google.common.a.m.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, false);
    }

    public V putIfAbsent(K k2, V v2) {
        com.google.common.a.m.a(k2);
        com.google.common.a.m.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, true);
    }

    public V replace(K k2, V v2) {
        com.google.common.a.m.a(k2);
        com.google.common.a.m.a(v2);
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

    g(c<? super K, ? super V> cVar, @NullableDecl d<? super K, V> dVar) {
        int i2;
        long j2;
        long j3;
        long j4;
        Queue<n<K, V>> queue;
        boolean z2;
        com.google.common.a.v vVar;
        boolean z3;
        boolean z4;
        int i3;
        if (cVar.g == -1) {
            i2 = 4;
        } else {
            i2 = cVar.g;
        }
        this.f24453e = Math.min(i2, 65536);
        this.h = cVar.b();
        this.i = cVar.c();
        this.f24454f = (com.google.common.a.d) com.google.common.a.i.a(cVar.p, cVar.b().defaultEquivalence());
        this.g = (com.google.common.a.d) com.google.common.a.i.a(cVar.q, cVar.c().defaultEquivalence());
        long j5 = 0;
        if (cVar.m == 0 || cVar.n == 0) {
            j2 = 0;
        } else if (cVar.j == null) {
            j2 = cVar.h;
        } else {
            j2 = cVar.i;
        }
        this.j = j2;
        this.k = (p) com.google.common.a.i.a(cVar.j, c.b.INSTANCE);
        if (cVar.n == -1) {
            j3 = 0;
        } else {
            j3 = cVar.n;
        }
        this.l = j3;
        if (cVar.m == -1) {
            j4 = 0;
        } else {
            j4 = cVar.m;
        }
        this.m = j4;
        this.n = cVar.o != -1 ? cVar.o : j5;
        this.p = (m) com.google.common.a.i.a(cVar.r, c.a.INSTANCE);
        if (this.p == c.a.INSTANCE) {
            queue = l();
        } else {
            queue = new ConcurrentLinkedQueue<>();
        }
        this.o = queue;
        int i4 = 0;
        int i5 = 1;
        if (f() || g()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (cVar.s != null) {
            vVar = cVar.s;
        } else if (z2) {
            vVar = com.google.common.a.v.b();
        } else {
            vVar = c.f24435d;
        }
        this.q = vVar;
        p pVar = this.h;
        if (d() || g()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (e() || f()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.r = d.getFactory(pVar, z3, z4);
        this.s = (a.b) cVar.t.get();
        this.t = null;
        if (cVar.f24437f == -1) {
            i3 = 16;
        } else {
            i3 = cVar.f24437f;
        }
        int min = Math.min(i3, 1073741824);
        if (a() && !b()) {
            min = Math.min(min, (int) this.j);
        }
        int i6 = 1;
        int i7 = 0;
        while (i6 < this.f24453e && (!a() || ((long) (i6 * 20)) <= this.j)) {
            i7++;
            i6 <<= 1;
        }
        this.f24451c = 32 - i7;
        this.f24450b = i6 - 1;
        this.f24452d = new n[i6];
        int i8 = min / i6;
        while (i5 < (i8 * i6 < min ? i8 + 1 : i8)) {
            i5 <<= 1;
        }
        if (a()) {
            long j6 = (long) i6;
            long j7 = (this.j / j6) + 1;
            long j8 = this.j % j6;
            while (i4 < this.f24452d.length) {
                if (((long) i4) == j8) {
                    j7--;
                }
                this.f24452d[i4] = a(i5, j7, (a.b) cVar.t.get());
                i4++;
            }
            return;
        }
        while (i4 < this.f24452d.length) {
            this.f24452d[i4] = a(i5, -1, (a.b) cVar.t.get());
            i4++;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(k<K, V> kVar, long j2) {
        com.google.common.a.m.a(kVar);
        if (p() && j2 - kVar.getAccessTime() >= this.l) {
            return true;
        }
        if (!o() || j2 - kVar.getWriteTime() < this.m) {
            return false;
        }
        return true;
    }

    private n<K, V> a(int i2, long j2, a.b bVar) {
        n nVar = new n(this, i2, j2, bVar);
        return nVar;
    }

    public boolean replace(K k2, @NullableDecl V v2, V v3) {
        com.google.common.a.m.a(k2);
        com.google.common.a.m.a(v3);
        if (v2 == null) {
            return false;
        }
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, v3);
    }
}
