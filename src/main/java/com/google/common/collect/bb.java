package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.bb.g;
import com.google.common.collect.bb.l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
public final class bb<K, V, E extends g<K, V, E>, S extends l<K, V, E, S>> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {

    /* renamed from: e  reason: collision with root package name */
    static final aa<Object, Object, Object> f24620e = new aa<Object, Object, Object>() {
        public final /* bridge */ /* synthetic */ aa a(ReferenceQueue referenceQueue, g gVar) {
            return this;
        }

        public final /* bridge */ /* synthetic */ g a() {
            return null;
        }

        public final void clear() {
        }

        public final Object get() {
            return null;
        }
    };
    private static final long serialVersionUID = 5;

    /* renamed from: a  reason: collision with root package name */
    final transient int f24621a;

    /* renamed from: b  reason: collision with root package name */
    final transient int f24622b;

    /* renamed from: c  reason: collision with root package name */
    final transient l<K, V, E, S>[] f24623c;
    final int concurrencyLevel;

    /* renamed from: d  reason: collision with root package name */
    final transient h<K, V, E, S> f24624d;
    @MonotonicNonNullDecl

    /* renamed from: f  reason: collision with root package name */
    transient Set<K> f24625f;
    @MonotonicNonNullDecl
    transient Collection<V> g;
    @MonotonicNonNullDecl
    transient Set<Map.Entry<K, V>> h;
    final com.google.common.a.d<Object> keyEquivalence;

    static abstract class a<K, V> extends aa<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        final int concurrencyLevel;
        public transient ConcurrentMap<K, V> delegate;
        final com.google.common.a.d<Object> keyEquivalence;
        final n keyStrength;
        final com.google.common.a.d<Object> valueEquivalence;
        final n valueStrength;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }

        a(n nVar, n nVar2, com.google.common.a.d<Object> dVar, com.google.common.a.d<Object> dVar2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = nVar;
            this.valueStrength = nVar2;
            this.keyEquivalence = dVar;
            this.valueEquivalence = dVar2;
            this.concurrencyLevel = i;
            this.delegate = concurrentMap;
        }
    }

    interface aa<K, V, E extends g<K, V, E>> {
        aa<K, V, E> a(ReferenceQueue<V> referenceQueue, E e2);

        E a();

        void clear();

        @NullableDecl
        V get();
    }

    static final class ab<K, V, E extends g<K, V, E>> extends WeakReference<V> implements aa<K, V, E> {
        @Weak

        /* renamed from: a  reason: collision with root package name */
        final E f24626a;

        public final E a() {
            return this.f24626a;
        }

        public final aa<K, V, E> a(ReferenceQueue<V> referenceQueue, E e2) {
            return new ab(referenceQueue, get(), e2);
        }

        ab(ReferenceQueue<V> referenceQueue, V v, E e2) {
            super(v, referenceQueue);
            this.f24626a = e2;
        }
    }

    final class ac extends f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f24627a;

        /* renamed from: b  reason: collision with root package name */
        V f24628b;

        public final K getKey() {
            return this.f24627a;
        }

        public final V getValue() {
            return this.f24628b;
        }

        public final int hashCode() {
            return this.f24627a.hashCode() ^ this.f24628b.hashCode();
        }

        public final V setValue(V v) {
            V put = bb.this.put(this.f24627a, v);
            this.f24628b = v;
            return put;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f24627a.equals(entry.getKey()) || !this.f24628b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        ac(K k, V v) {
            this.f24627a = k;
            this.f24628b = v;
        }
    }

    static abstract class b<K, V, E extends g<K, V, E>> implements g<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final K f24630a;

        /* renamed from: b  reason: collision with root package name */
        final int f24631b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        final E f24632c;

        public final K a() {
            return this.f24630a;
        }

        public final int b() {
            return this.f24631b;
        }

        public final E c() {
            return this.f24632c;
        }

        b(K k, int i, @NullableDecl E e2) {
            this.f24630a = k;
            this.f24631b = i;
            this.f24632c = e2;
        }
    }

    static abstract class c<K, V, E extends g<K, V, E>> extends WeakReference<K> implements g<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final int f24633a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        final E f24634b;

        public final int b() {
            return this.f24633a;
        }

        public final E c() {
            return this.f24634b;
        }

        public final K a() {
            return get();
        }

        c(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl E e2) {
            super(k, referenceQueue);
            this.f24633a = i;
            this.f24634b = e2;
        }
    }

    final class d extends f<Map.Entry<K, V>> {
        public final /* synthetic */ Object next() {
            return a();
        }

        d() {
            super();
        }
    }

    final class e extends k<Map.Entry<K, V>> {
        public final void clear() {
            bb.this.clear();
        }

        public final boolean isEmpty() {
            return bb.this.isEmpty();
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public final int size() {
            return bb.this.size();
        }

        e() {
            super((byte) 0);
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (key == null || !bb.this.remove(key, entry.getValue())) {
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
            Object obj2 = bb.this.get(key);
            if (obj2 == null || !bb.this.b().equivalent(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }
    }

    abstract class f<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        int f24637b;

        /* renamed from: c  reason: collision with root package name */
        int f24638c = -1;
        @MonotonicNonNullDecl

        /* renamed from: d  reason: collision with root package name */
        l<K, V, E, S> f24639d;
        @MonotonicNonNullDecl

        /* renamed from: e  reason: collision with root package name */
        AtomicReferenceArray<E> f24640e;
        @NullableDecl

        /* renamed from: f  reason: collision with root package name */
        E f24641f;
        @NullableDecl
        ac g;
        @NullableDecl
        ac h;

        public boolean hasNext() {
            if (this.g != null) {
                return true;
            }
            return false;
        }

        private boolean c() {
            if (this.f24641f != null) {
                do {
                    this.f24641f = this.f24641f.c();
                    if (this.f24641f != null) {
                    }
                } while (!a(this.f24641f));
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final ac a() {
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
            l.a(z);
            bb.this.remove(this.h.getKey());
            this.h = null;
        }

        private boolean d() {
            while (this.f24638c >= 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.f24640e;
                int i2 = this.f24638c;
                this.f24638c = i2 - 1;
                E e2 = (g) atomicReferenceArray.get(i2);
                this.f24641f = e2;
                if (e2 != null && (a(this.f24641f) || c())) {
                    return true;
                }
            }
            return false;
        }

        private void b() {
            this.g = null;
            if (!c() && !d()) {
                while (this.f24637b >= 0) {
                    l<K, V, E, S>[] lVarArr = bb.this.f24623c;
                    int i2 = this.f24637b;
                    this.f24637b = i2 - 1;
                    this.f24639d = lVarArr[i2];
                    if (this.f24639d.count != 0) {
                        this.f24640e = this.f24639d.table;
                        this.f24638c = this.f24640e.length() - 1;
                        if (d()) {
                            return;
                        }
                    }
                }
            }
        }

        f() {
            this.f24637b = r1.f24623c.length - 1;
            b();
        }

        /* JADX INFO: finally extract failed */
        private boolean a(E e2) {
            try {
                Object a2 = e2.a();
                Object obj = null;
                if (e2.a() != null) {
                    Object d2 = e2.d();
                    if (d2 != null) {
                        obj = d2;
                    }
                }
                if (obj != null) {
                    this.g = new ac<>(a2, obj);
                    this.f24639d.e();
                    return true;
                }
                this.f24639d.e();
                return false;
            } catch (Throwable th) {
                this.f24639d.e();
                throw th;
            }
        }
    }

    interface g<K, V, E extends g<K, V, E>> {
        K a();

        int b();

        E c();

        V d();
    }

    interface h<K, V, E extends g<K, V, E>, S extends l<K, V, E, S>> {
        E a(S s, E e2, @NullableDecl E e3);

        E a(S s, K k, int i, @NullableDecl E e2);

        S a(bb<K, V, E, S> bbVar, int i, int i2);

        n a();

        void a(S s, E e2, V v);

        n b();
    }

    final class i extends f<K> {
        public final K next() {
            return a().getKey();
        }

        i() {
            super();
        }
    }

    final class j extends k<K> {
        public final void clear() {
            bb.this.clear();
        }

        public final boolean isEmpty() {
            return bb.this.isEmpty();
        }

        public final Iterator<K> iterator() {
            return new i();
        }

        public final int size() {
            return bb.this.size();
        }

        j() {
            super((byte) 0);
        }

        public final boolean contains(Object obj) {
            return bb.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (bb.this.remove(obj) != null) {
                return true;
            }
            return false;
        }
    }

    static abstract class k<E> extends AbstractSet<E> {
        private k() {
        }

        public Object[] toArray() {
            return bb.toArrayList(this).toArray();
        }

        /* synthetic */ k(byte b2) {
            this();
        }

        public <T> T[] toArray(T[] tArr) {
            return bb.toArrayList(this).toArray(tArr);
        }
    }

    static abstract class l<K, V, E extends g<K, V, E>, S extends l<K, V, E, S>> extends ReentrantLock {
        volatile int count;
        @Weak
        final bb<K, V, E, S> map;
        final int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        @MonotonicNonNullDecl
        volatile AtomicReferenceArray<E> table;
        int threshold;

        /* access modifiers changed from: package-private */
        public abstract S a();

        /* access modifiers changed from: package-private */
        @GuardedBy
        public void b() {
        }

        /* access modifiers changed from: package-private */
        public void c() {
        }

        @GuardedBy
        private void f() {
            h();
        }

        private void g() {
            h();
        }

        /* access modifiers changed from: package-private */
        public final boolean a(K k, int i, V v, V v2) {
            lock();
            try {
                f();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                g gVar2 = gVar;
                while (gVar2 != null) {
                    Object a2 = gVar2.a();
                    if (gVar2.b() != i || a2 == null || !this.map.keyEquivalence.equivalent(k, a2)) {
                        gVar2 = gVar2.c();
                    } else {
                        Object d2 = gVar2.d();
                        if (d2 == null) {
                            if (a((E) gVar2)) {
                                int i2 = this.count;
                                this.modCount++;
                                atomicReferenceArray.set(length, b((E) gVar, (E) gVar2));
                                this.count--;
                            }
                            return false;
                        } else if (this.map.b().equivalent(v, d2)) {
                            this.modCount++;
                            a((E) gVar2, v2);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        @CanIgnoreReturnValue
        public final boolean a(K k, int i, aa<K, V, E> aaVar) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                g gVar2 = gVar;
                while (gVar2 != null) {
                    Object a2 = gVar2.a();
                    if (gVar2.b() != i || a2 == null || !this.map.keyEquivalence.equivalent(k, a2)) {
                        gVar2 = gVar2.c();
                    } else if (((z) gVar2).e() == aaVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, b((E) gVar, (E) gVar2));
                        this.count--;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public final void e() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                g();
            }
        }

        private void h() {
            if (tryLock()) {
                try {
                    b();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            if (tryLock()) {
                try {
                    b();
                } finally {
                    unlock();
                }
            }
        }

        private static AtomicReferenceArray<E> a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        static <T> void c(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* access modifiers changed from: package-private */
        public aa<K, V, E> getWeakValueReferenceForTesting(g<K, V, ?> gVar) {
            throw new AssertionError();
        }

        static <K, V, E extends g<K, V, E>> boolean a(E e2) {
            if (e2.d() == null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        public final void b(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends T> poll = referenceQueue.poll();
                if (poll != null) {
                    aa aaVar = (aa) poll;
                    bb<K, V, E, S> bbVar = this.map;
                    g a2 = aaVar.a();
                    int b2 = a2.b();
                    bbVar.a(b2).a((K) a2.a(), b2, aaVar);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        public final void a(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends T> poll = referenceQueue.poll();
                if (poll != null) {
                    g gVar = (g) poll;
                    bb<K, V, E, S> bbVar = this.map;
                    int b2 = gVar.b();
                    bbVar.a(b2).a((E) gVar, b2);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        private E e(Object obj, int i) {
            return d(obj, i);
        }

        /* access modifiers changed from: package-private */
        public aa<K, V, E> newWeakValueReferenceForTesting(g<K, V, ?> gVar, V v) {
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public void setWeakValueReferenceForTesting(g<K, V, ?> gVar, aa<K, V, ? extends g<K, V, ?>> aaVar) {
            throw new AssertionError();
        }

        private E a(E e2, E e3) {
            return this.map.f24624d.a(a(), e2, e3);
        }

        private void a(E e2, V v) {
            this.map.f24624d.a(a(), e2, v);
        }

        @GuardedBy
        private E b(E e2, E e3) {
            int i = this.count;
            E c2 = e3.c();
            while (e2 != e3) {
                E a2 = a(e2, c2);
                if (a2 != null) {
                    c2 = a2;
                } else {
                    i--;
                }
                e2 = e2.c();
            }
            this.count = i;
            return c2;
        }

        private E d(Object obj, int i) {
            if (this.count != 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                for (E e2 = (g) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); e2 != null; e2 = e2.c()) {
                    if (e2.b() == i) {
                        Object a2 = e2.a();
                        if (a2 == null) {
                            d();
                        } else if (this.map.keyEquivalence.equivalent(obj, a2)) {
                            return e2;
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public final V a(Object obj, int i) {
            try {
                g e2 = e(obj, i);
                if (e2 == null) {
                    e();
                    return null;
                }
                V d2 = e2.d();
                if (d2 == null) {
                    d();
                }
                e();
                return d2;
            } catch (Throwable th) {
                e();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    g e2 = e(obj, i);
                    if (!(e2 == null || e2.d() == null)) {
                        z = true;
                    }
                    return z;
                }
                e();
                return false;
            } finally {
                e();
            }
        }

        /* access modifiers changed from: package-private */
        @CanIgnoreReturnValue
        public final V c(Object obj, int i) {
            lock();
            f();
            int i2 = this.count;
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            g gVar = (g) atomicReferenceArray.get(length);
            g gVar2 = gVar;
            while (gVar2 != null) {
                Object a2 = gVar2.a();
                if (gVar2.b() != i || a2 == null || !this.map.keyEquivalence.equivalent(obj, a2)) {
                    try {
                        gVar2 = gVar2.c();
                    } catch (Throwable th) {
                        unlock();
                        throw th;
                    }
                } else {
                    V d2 = gVar2.d();
                    if (d2 != null || a((E) gVar2)) {
                        this.modCount++;
                        atomicReferenceArray.set(length, b((E) gVar, (E) gVar2));
                        this.count--;
                        unlock();
                        return d2;
                    }
                    unlock();
                    return null;
                }
            }
            unlock();
            return null;
        }

        /* access modifiers changed from: package-private */
        @CanIgnoreReturnValue
        public final boolean a(E e2, int i) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                E e3 = (g) atomicReferenceArray.get(length);
                for (E e4 = e3; e4 != null; e4 = e4.c()) {
                    if (e4 == e2) {
                        this.modCount++;
                        atomicReferenceArray.set(length, b(e3, e4));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        l(bb<K, V, E, S> bbVar, int i, int i2) {
            this.map = bbVar;
            this.maxSegmentSize = i2;
            AtomicReferenceArray<E> a2 = a(i);
            this.threshold = (a2.length() * 3) / 4;
            if (this.threshold == this.maxSegmentSize) {
                this.threshold++;
            }
            this.table = a2;
        }

        /* access modifiers changed from: package-private */
        public final V a(K k, int i, V v) {
            lock();
            try {
                f();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                g gVar2 = gVar;
                while (gVar2 != null) {
                    Object a2 = gVar2.a();
                    if (gVar2.b() != i || a2 == null || !this.map.keyEquivalence.equivalent(k, a2)) {
                        gVar2 = gVar2.c();
                    } else {
                        V d2 = gVar2.d();
                        if (d2 == null) {
                            if (a((E) gVar2)) {
                                int i2 = this.count;
                                this.modCount++;
                                atomicReferenceArray.set(length, b((E) gVar, (E) gVar2));
                                this.count--;
                            }
                            return null;
                        }
                        this.modCount++;
                        a((E) gVar2, v);
                        unlock();
                        return d2;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
            if (r8.map.b().equivalent(r11, r4.d()) == false) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
            if (a((E) r4) != false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
            unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r8.modCount++;
            r0.set(r1, b((E) r3, (E) r4));
            r8.count--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
            unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
            return r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.f()     // Catch:{ all -> 0x006b }
                int r0 = r8.count     // Catch:{ all -> 0x006b }
                java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r8.table     // Catch:{ all -> 0x006b }
                int r1 = r0.length()     // Catch:{ all -> 0x006b }
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x006b }
                com.google.common.collect.bb$g r3 = (com.google.common.collect.bb.g) r3     // Catch:{ all -> 0x006b }
                r4 = r3
            L_0x0018:
                r5 = 0
                if (r4 == 0) goto L_0x0067
                java.lang.Object r6 = r4.a()     // Catch:{ all -> 0x006b }
                int r7 = r4.b()     // Catch:{ all -> 0x006b }
                if (r7 != r10) goto L_0x0062
                if (r6 == 0) goto L_0x0062
                com.google.common.collect.bb<K, V, E, S> r7 = r8.map     // Catch:{ all -> 0x006b }
                com.google.common.a.d<java.lang.Object> r7 = r7.keyEquivalence     // Catch:{ all -> 0x006b }
                boolean r6 = r7.equivalent(r9, r6)     // Catch:{ all -> 0x006b }
                if (r6 == 0) goto L_0x0062
                java.lang.Object r9 = r4.d()     // Catch:{ all -> 0x006b }
                com.google.common.collect.bb<K, V, E, S> r10 = r8.map     // Catch:{ all -> 0x006b }
                com.google.common.a.d r10 = r10.b()     // Catch:{ all -> 0x006b }
                boolean r9 = r10.equivalent(r11, r9)     // Catch:{ all -> 0x006b }
                if (r9 == 0) goto L_0x0043
                r5 = 1
                goto L_0x004d
            L_0x0043:
                boolean r9 = a((E) r4)     // Catch:{ all -> 0x006b }
                if (r9 != 0) goto L_0x004d
                r8.unlock()
                return r5
            L_0x004d:
                int r9 = r8.modCount     // Catch:{ all -> 0x006b }
                int r9 = r9 + r2
                r8.modCount = r9     // Catch:{ all -> 0x006b }
                com.google.common.collect.bb$g r9 = r8.b((E) r3, (E) r4)     // Catch:{ all -> 0x006b }
                int r10 = r8.count     // Catch:{ all -> 0x006b }
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch:{ all -> 0x006b }
                r8.count = r10     // Catch:{ all -> 0x006b }
                r8.unlock()
                return r5
            L_0x0062:
                com.google.common.collect.bb$g r4 = r4.c()     // Catch:{ all -> 0x006b }
                goto L_0x0018
            L_0x0067:
                r8.unlock()
                return r5
            L_0x006b:
                r9 = move-exception
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.bb.l.b(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* access modifiers changed from: package-private */
        public final V a(K k, int i, V v, boolean z) {
            lock();
            try {
                f();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    if (length < 1073741824) {
                        int i3 = this.count;
                        AtomicReferenceArray<E> a2 = a(length << 1);
                        this.threshold = (a2.length() * 3) / 4;
                        int length2 = a2.length() - 1;
                        for (int i4 = 0; i4 < length; i4++) {
                            g gVar = (g) atomicReferenceArray.get(i4);
                            if (gVar != null) {
                                g c2 = gVar.c();
                                int b2 = gVar.b() & length2;
                                if (c2 == null) {
                                    a2.set(b2, gVar);
                                } else {
                                    g gVar2 = gVar;
                                    while (c2 != null) {
                                        int b3 = c2.b() & length2;
                                        if (b3 != b2) {
                                            gVar2 = c2;
                                            b2 = b3;
                                        }
                                        c2 = c2.c();
                                    }
                                    a2.set(b2, gVar2);
                                    while (gVar != gVar2) {
                                        int b4 = gVar.b() & length2;
                                        g a3 = a((E) gVar, (E) (g) a2.get(b4));
                                        if (a3 != null) {
                                            a2.set(b4, a3);
                                        } else {
                                            i3--;
                                        }
                                        gVar = gVar.c();
                                    }
                                }
                            }
                        }
                        this.table = a2;
                        this.count = i3;
                    }
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray2 = this.table;
                int length3 = (atomicReferenceArray2.length() - 1) & i;
                g gVar3 = (g) atomicReferenceArray2.get(length3);
                g gVar4 = gVar3;
                while (gVar4 != null) {
                    Object a4 = gVar4.a();
                    if (gVar4.b() != i || a4 == null || !this.map.keyEquivalence.equivalent(k, a4)) {
                        gVar4 = gVar4.c();
                    } else {
                        V d2 = gVar4.d();
                        if (d2 == null) {
                            this.modCount++;
                            a((E) gVar4, v);
                            this.count = this.count;
                            return null;
                        } else if (z) {
                            unlock();
                            return d2;
                        } else {
                            this.modCount++;
                            a((E) gVar4, v);
                            unlock();
                            return d2;
                        }
                    }
                }
                this.modCount++;
                g a5 = this.map.f24624d.a(a(), k, i, gVar3);
                a((E) a5, v);
                atomicReferenceArray2.set(length3, a5);
                this.count = i2;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }
    }

    static final class m<K, V> extends a<K, V> {
        private static final long serialVersionUID = 3;

        private Object readResolve() {
            return this.delegate;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            objectInputStream.defaultReadObject();
            int readInt = objectInputStream.readInt();
            ba baVar = new ba();
            boolean z6 = false;
            if (baVar.f24615b == -1) {
                z = true;
            } else {
                z = false;
            }
            com.google.common.a.m.b(z, "initial capacity was already set to %s", baVar.f24615b);
            if (readInt >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.google.common.a.m.a(z2);
            baVar.f24615b = readInt;
            ba a2 = baVar.a(this.keyStrength);
            n nVar = this.valueStrength;
            if (a2.f24618e == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.google.common.a.m.a(z3, "Value strength was already set to %s", (Object) a2.f24618e);
            a2.f24618e = (n) com.google.common.a.m.a(nVar);
            if (nVar != n.STRONG) {
                a2.f24614a = true;
            }
            com.google.common.a.d<Object> dVar = this.keyEquivalence;
            if (a2.f24619f == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            com.google.common.a.m.a(z4, "key equivalence was already set to %s", (Object) a2.f24619f);
            a2.f24619f = (com.google.common.a.d) com.google.common.a.m.a(dVar);
            a2.f24614a = true;
            int i = this.concurrencyLevel;
            if (a2.f24616c == -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            com.google.common.a.m.b(z5, "concurrency level was already set to %s", a2.f24616c);
            if (i > 0) {
                z6 = true;
            }
            com.google.common.a.m.a(z6);
            a2.f24616c = i;
            this.delegate = a2.e();
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.delegate.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }

        m(n nVar, n nVar2, com.google.common.a.d<Object> dVar, com.google.common.a.d<Object> dVar2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(nVar, nVar2, dVar, dVar2, i, concurrentMap);
        }
    }

    enum n {
        STRONG {
            /* access modifiers changed from: package-private */
            public final com.google.common.a.d<Object> defaultEquivalence() {
                return com.google.common.a.d.equals();
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public final com.google.common.a.d<Object> defaultEquivalence() {
                return com.google.common.a.d.identity();
            }
        };

        /* access modifiers changed from: package-private */
        public abstract com.google.common.a.d<Object> defaultEquivalence();
    }

    static final class o<K, V> extends b<K, V, o<K, V>> implements s<K, V, o<K, V>> {
        @NullableDecl

        /* renamed from: d  reason: collision with root package name */
        public volatile V f24644d;

        static final class a<K, V> implements h<K, V, o<K, V>, p<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            static final a<?, ?> f24645a = new a<>();

            a() {
            }

            public final n a() {
                return n.STRONG;
            }

            public final n b() {
                return n.STRONG;
            }

            public final /* synthetic */ l a(bb bbVar, int i, int i2) {
                return new p(bbVar, i, i2);
            }

            public final /* synthetic */ g a(l lVar, g gVar, @NullableDecl g gVar2) {
                o oVar = (o) gVar;
                o oVar2 = new o(oVar.f24630a, oVar.f24631b, (o) gVar2);
                oVar2.f24644d = oVar.f24644d;
                return oVar2;
            }

            public final /* bridge */ /* synthetic */ void a(l lVar, g gVar, Object obj) {
                ((o) gVar).f24644d = obj;
            }

            public final /* synthetic */ g a(l lVar, Object obj, int i, @NullableDecl g gVar) {
                return new o(obj, i, (o) gVar);
            }
        }

        @NullableDecl
        public final V d() {
            return this.f24644d;
        }

        o(K k, int i, @NullableDecl o<K, V> oVar) {
            super(k, i, oVar);
        }
    }

    static final class p<K, V> extends l<K, V, o<K, V>, p<K, V>> {
        /* access modifiers changed from: package-private */
        public final /* bridge */ /* synthetic */ l a() {
            return this;
        }

        public final o<K, V> castForTesting(g<K, V, ?> gVar) {
            return (o) gVar;
        }

        p(bb<K, V, o<K, V>, p<K, V>> bbVar, int i, int i2) {
            super(bbVar, i, i2);
        }
    }

    static final class q<K, V> extends b<K, V, q<K, V>> implements z<K, V, q<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        public volatile aa<K, V, q<K, V>> f24646d = bb.a();

        static final class a<K, V> implements h<K, V, q<K, V>, r<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            static final a<?, ?> f24647a = new a<>();

            a() {
            }

            public final n a() {
                return n.STRONG;
            }

            public final n b() {
                return n.WEAK;
            }

            public final /* synthetic */ l a(bb bbVar, int i, int i2) {
                return new r(bbVar, i, i2);
            }

            public final /* synthetic */ void a(l lVar, g gVar, Object obj) {
                q qVar = (q) gVar;
                ReferenceQueue<V> referenceQueue = ((r) lVar).queueForValues;
                aa<K, V, q<K, V>> aaVar = qVar.f24646d;
                qVar.f24646d = new ab(referenceQueue, obj, qVar);
                aaVar.clear();
            }

            public final /* synthetic */ g a(l lVar, g gVar, @NullableDecl g gVar2) {
                r rVar = (r) lVar;
                q qVar = (q) gVar;
                q qVar2 = (q) gVar2;
                if (l.a(qVar)) {
                    return null;
                }
                ReferenceQueue<V> referenceQueue = rVar.queueForValues;
                q qVar3 = new q(qVar.f24630a, qVar.f24631b, qVar2);
                qVar3.f24646d = qVar.f24646d.a(referenceQueue, qVar3);
                return qVar3;
            }

            public final /* synthetic */ g a(l lVar, Object obj, int i, @NullableDecl g gVar) {
                return new q(obj, i, (q) gVar);
            }
        }

        public final aa<K, V, q<K, V>> e() {
            return this.f24646d;
        }

        public final V d() {
            return this.f24646d.get();
        }

        q(K k, int i, @NullableDecl q<K, V> qVar) {
            super(k, i, qVar);
        }
    }

    static final class r<K, V> extends l<K, V, q<K, V>, r<K, V>> {
        public final ReferenceQueue<V> queueForValues = new ReferenceQueue<>();

        /* access modifiers changed from: package-private */
        public final /* bridge */ /* synthetic */ l a() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            b(this.queueForValues);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            c(this.queueForValues);
        }

        public final q<K, V> castForTesting(g<K, V, ?> gVar) {
            return (q) gVar;
        }

        public final aa<K, V, q<K, V>> getWeakValueReferenceForTesting(g<K, V, ?> gVar) {
            return castForTesting((g) gVar).e();
        }

        public final aa<K, V, q<K, V>> newWeakValueReferenceForTesting(g<K, V, ?> gVar, V v) {
            return new ab(this.queueForValues, v, castForTesting((g) gVar));
        }

        public final void setWeakValueReferenceForTesting(g<K, V, ?> gVar, aa<K, V, ? extends g<K, V, ?>> aaVar) {
            q castForTesting = castForTesting((g) gVar);
            aa<K, V, q<K, V>> aaVar2 = castForTesting.f24646d;
            castForTesting.f24646d = aaVar;
            aaVar2.clear();
        }

        r(bb<K, V, q<K, V>, r<K, V>> bbVar, int i, int i2) {
            super(bbVar, i, i2);
        }
    }

    interface s extends g {
    }

    final class t extends f<V> {
        public final V next() {
            return a().getValue();
        }

        t() {
            super();
        }
    }

    final class u extends AbstractCollection<V> {
        public final void clear() {
            bb.this.clear();
        }

        public final boolean isEmpty() {
            return bb.this.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new t();
        }

        public final int size() {
            return bb.this.size();
        }

        public final Object[] toArray() {
            return bb.toArrayList(this).toArray();
        }

        u() {
        }

        public final boolean contains(Object obj) {
            return bb.this.containsValue(obj);
        }

        public final <T> T[] toArray(T[] tArr) {
            return bb.toArrayList(this).toArray(tArr);
        }
    }

    static final class v<K, V> extends c<K, V, v<K, V>> implements s<K, V, v<K, V>> {
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        public volatile V f24650c;

        static final class a<K, V> implements h<K, V, v<K, V>, w<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            static final a<?, ?> f24651a = new a<>();

            a() {
            }

            public final n a() {
                return n.WEAK;
            }

            public final n b() {
                return n.STRONG;
            }

            public final /* synthetic */ l a(bb bbVar, int i, int i2) {
                return new w(bbVar, i, i2);
            }

            public final /* synthetic */ g a(l lVar, g gVar, @NullableDecl g gVar2) {
                w wVar = (w) lVar;
                v vVar = (v) gVar;
                v vVar2 = (v) gVar2;
                if (vVar.a() == null) {
                    return null;
                }
                v vVar3 = new v(wVar.queueForKeys, vVar.a(), vVar.f24633a, vVar2);
                vVar3.f24650c = vVar.f24650c;
                return vVar3;
            }

            public final /* bridge */ /* synthetic */ void a(l lVar, g gVar, Object obj) {
                ((v) gVar).f24650c = obj;
            }

            public final /* synthetic */ g a(l lVar, Object obj, int i, @NullableDecl g gVar) {
                return new v(((w) lVar).queueForKeys, obj, i, (v) gVar);
            }
        }

        @NullableDecl
        public final V d() {
            return this.f24650c;
        }

        v(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl v<K, V> vVar) {
            super(referenceQueue, k, i, vVar);
        }
    }

    static final class w<K, V> extends l<K, V, v<K, V>, w<K, V>> {
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();

        /* access modifiers changed from: package-private */
        public final /* bridge */ /* synthetic */ l a() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            a(this.queueForKeys);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            c(this.queueForKeys);
        }

        public final v<K, V> castForTesting(g<K, V, ?> gVar) {
            return (v) gVar;
        }

        w(bb<K, V, v<K, V>, w<K, V>> bbVar, int i, int i2) {
            super(bbVar, i, i2);
        }
    }

    static final class x<K, V> extends c<K, V, x<K, V>> implements z<K, V, x<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        public volatile aa<K, V, x<K, V>> f24652c = bb.a();

        static final class a<K, V> implements h<K, V, x<K, V>, y<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            static final a<?, ?> f24653a = new a<>();

            a() {
            }

            public final n a() {
                return n.WEAK;
            }

            public final n b() {
                return n.WEAK;
            }

            public final /* synthetic */ l a(bb bbVar, int i, int i2) {
                return new y(bbVar, i, i2);
            }

            public final /* synthetic */ void a(l lVar, g gVar, Object obj) {
                x xVar = (x) gVar;
                ReferenceQueue<V> referenceQueue = ((y) lVar).queueForValues;
                aa<K, V, x<K, V>> aaVar = xVar.f24652c;
                xVar.f24652c = new ab(referenceQueue, obj, xVar);
                aaVar.clear();
            }

            public final /* synthetic */ g a(l lVar, g gVar, @NullableDecl g gVar2) {
                y yVar = (y) lVar;
                x xVar = (x) gVar;
                x xVar2 = (x) gVar2;
                if (xVar.a() == null || l.a(xVar)) {
                    return null;
                }
                ReferenceQueue<K> referenceQueue = yVar.queueForKeys;
                ReferenceQueue<V> referenceQueue2 = yVar.queueForValues;
                x xVar3 = new x(referenceQueue, xVar.a(), xVar.f24633a, xVar2);
                xVar3.f24652c = xVar.f24652c.a(referenceQueue2, xVar3);
                return xVar3;
            }

            public final /* synthetic */ g a(l lVar, Object obj, int i, @NullableDecl g gVar) {
                return new x(((y) lVar).queueForKeys, obj, i, (x) gVar);
            }
        }

        public final aa<K, V, x<K, V>> e() {
            return this.f24652c;
        }

        public final V d() {
            return this.f24652c.get();
        }

        x(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl x<K, V> xVar) {
            super(referenceQueue, k, i, xVar);
        }
    }

    static final class y<K, V> extends l<K, V, x<K, V>, y<K, V>> {
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();
        public final ReferenceQueue<V> queueForValues = new ReferenceQueue<>();

        /* access modifiers changed from: package-private */
        public final /* bridge */ /* synthetic */ l a() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            c(this.queueForKeys);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            a(this.queueForKeys);
            b(this.queueForValues);
        }

        public final x<K, V> castForTesting(g<K, V, ?> gVar) {
            return (x) gVar;
        }

        public final aa<K, V, x<K, V>> getWeakValueReferenceForTesting(g<K, V, ?> gVar) {
            return castForTesting((g) gVar).e();
        }

        public final aa<K, V, x<K, V>> newWeakValueReferenceForTesting(g<K, V, ?> gVar, V v) {
            return new ab(this.queueForValues, v, castForTesting((g) gVar));
        }

        public final void setWeakValueReferenceForTesting(g<K, V, ?> gVar, aa<K, V, ? extends g<K, V, ?>> aaVar) {
            x castForTesting = castForTesting((g) gVar);
            aa<K, V, x<K, V>> aaVar2 = castForTesting.f24652c;
            castForTesting.f24652c = aaVar;
            aaVar2.clear();
        }

        y(bb<K, V, x<K, V>, y<K, V>> bbVar, int i, int i2) {
            super(bbVar, i, i2);
        }
    }

    interface z<K, V, E extends g<K, V, E>> extends g<K, V, E> {
        aa<K, V, E> e();
    }

    static <K, V, E extends g<K, V, E>> aa<K, V, E> a() {
        return f24620e;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final com.google.common.a.d<Object> b() {
        return this.f24624d.b().defaultEquivalence();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.h;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.h = eVar;
        return eVar;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f24625f;
        if (set != null) {
            return set;
        }
        j jVar = new j();
        this.f24625f = jVar;
        return jVar;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.g;
        if (collection != null) {
            return collection;
        }
        u uVar = new u();
        this.g = uVar;
        return uVar;
    }

    public final int size() {
        l<K, V, E, S>[] lVarArr = this.f24623c;
        long j2 = 0;
        for (l<K, V, E, S> lVar : lVarArr) {
            j2 += (long) lVar.count;
        }
        return com.google.common.f.a.a(j2);
    }

    public final void clear() {
        l<K, V, E, S>[] lVarArr = this.f24623c;
        int length = lVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            l<K, V, E, S> lVar = lVarArr[i2];
            if (lVar.count != 0) {
                lVar.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = lVar.table;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    lVar.c();
                    lVar.readCount.set(0);
                    lVar.modCount++;
                    lVar.count = 0;
                } finally {
                    lVar.unlock();
                }
            }
        }
    }

    public final boolean isEmpty() {
        l<K, V, E, S>[] lVarArr = this.f24623c;
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

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        m mVar = new m(this.f24624d.a(), this.f24624d.b(), this.keyEquivalence, this.f24624d.b().defaultEquivalence(), this.concurrencyLevel, this);
        return mVar;
    }

    /* access modifiers changed from: package-private */
    public final l<K, V, E, S> a(int i2) {
        return this.f24623c[(i2 >>> this.f24622b) & this.f24621a];
    }

    private int a(Object obj) {
        int hash = this.keyEquivalence.hash(obj);
        int i2 = hash + ((hash << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    public static <E> ArrayList<E> toArrayList(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        aw.a((Collection<T>) arrayList, collection.iterator());
        return arrayList;
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        return a(a2).b(obj, a2);
    }

    public final V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return a(a2).a(obj, a2);
    }

    @CanIgnoreReturnValue
    public final V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return a(a2).c(obj, a2);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Object obj2;
        Object obj3 = obj;
        if (obj3 == null) {
            return false;
        }
        l<K, V, E, S>[] lVarArr = this.f24623c;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j3 = 0;
            for (l<K, V, E, S> lVar : lVarArr) {
                int i3 = lVar.count;
                AtomicReferenceArray<E> atomicReferenceArray = lVar.table;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (g gVar = (g) atomicReferenceArray.get(i4); gVar != null; gVar = gVar.c()) {
                        if (gVar.a() == null) {
                            lVar.d();
                        } else {
                            obj2 = gVar.d();
                            if (obj2 == null) {
                                lVar.d();
                            }
                            if (obj2 == null && b().equivalent(obj3, obj2)) {
                                return true;
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                        }
                    }
                }
                j3 += (long) lVar.modCount;
            }
            if (j3 == j2) {
                break;
            }
            i2++;
            j2 = j3;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public final V put(K k2, V v2) {
        com.google.common.a.m.a(k2);
        com.google.common.a.m.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, false);
    }

    @CanIgnoreReturnValue
    public final V putIfAbsent(K k2, V v2) {
        com.google.common.a.m.a(k2);
        com.google.common.a.m.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, true);
    }

    @CanIgnoreReturnValue
    public final V replace(K k2, V v2) {
        com.google.common.a.m.a(k2);
        com.google.common.a.m.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2);
    }

    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        return a(a2).b(obj, a2, obj2);
    }

    bb(ba baVar, h<K, V, E, S> hVar) {
        this.concurrencyLevel = Math.min(baVar.b(), 65536);
        this.keyEquivalence = (com.google.common.a.d) com.google.common.a.i.a(baVar.f24619f, baVar.c().defaultEquivalence());
        this.f24624d = hVar;
        int min = Math.min(baVar.a(), 1073741824);
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.concurrencyLevel) {
            i4++;
            i3 <<= 1;
        }
        this.f24622b = 32 - i4;
        this.f24621a = i3 - 1;
        this.f24623c = new l[i3];
        int i5 = min / i3;
        while (i2 < (i3 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        for (int i6 = 0; i6 < this.f24623c.length; i6++) {
            this.f24623c[i6] = this.f24624d.a(this, i2, -1);
        }
    }

    @CanIgnoreReturnValue
    public final boolean replace(K k2, @NullableDecl V v2, V v3) {
        com.google.common.a.m.a(k2);
        com.google.common.a.m.a(v3);
        if (v2 == null) {
            return false;
        }
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, v3);
    }
}
