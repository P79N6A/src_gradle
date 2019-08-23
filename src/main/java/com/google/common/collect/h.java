package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.bg;
import com.google.common.collect.bh;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class h<E> extends AbstractCollection<E> implements bg<E> {
    @MonotonicNonNullDecl

    /* renamed from: a  reason: collision with root package name */
    private transient Set<E> f24766a;
    @MonotonicNonNullDecl

    /* renamed from: b  reason: collision with root package name */
    private transient Set<bg.a<E>> f24767b;

    class a extends bh.b<E> {
        /* access modifiers changed from: package-private */
        public final bg<E> a() {
            return h.this;
        }

        public final Iterator<E> iterator() {
            return h.this.a();
        }

        a() {
        }
    }

    class b extends bh.c<E> {
        /* access modifiers changed from: package-private */
        public final bg<E> a() {
            return h.this;
        }

        public final Iterator<bg.a<E>> iterator() {
            return h.this.b();
        }

        public final int size() {
            return h.this.c();
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<E> a();

    /* access modifiers changed from: package-private */
    public abstract Iterator<bg.a<E>> b();

    /* access modifiers changed from: package-private */
    public abstract int c();

    public abstract void clear();

    h() {
    }

    public Set<E> elementSet() {
        Set<E> set = this.f24766a;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.f24766a = aVar;
        return aVar;
    }

    public Set<bg.a<E>> entrySet() {
        Set<bg.a<E>> set = this.f24767b;
        if (set != null) {
            return set;
        }
        b bVar = new b();
        this.f24767b = bVar;
        return bVar;
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final String toString() {
        return entrySet().toString();
    }

    public final boolean equals(@NullableDecl Object obj) {
        return bh.a((bg<?>) this, obj);
    }

    @CanIgnoreReturnValue
    public final boolean add(@NullableDecl E e2) {
        add(e2, 1);
        return true;
    }

    public boolean contains(@NullableDecl Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj) {
        if (remove(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof bg) {
            collection = ((bg) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        m.a(collection);
        if (collection instanceof bg) {
            collection = ((bg) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        m.a(this);
        m.a(collection);
        boolean z = true;
        if (collection instanceof bg) {
            bg<T> a2 = bh.a(collection);
            if (a2 instanceof e) {
                e eVar = (e) a2;
                if (eVar.isEmpty()) {
                    z = false;
                } else {
                    m.a(this);
                    for (int a3 = eVar.f24756a.a(); a3 >= 0; a3 = eVar.f24756a.a(a3)) {
                        add(eVar.f24756a.b(a3), eVar.f24756a.c(a3));
                    }
                }
            } else if (a2.isEmpty()) {
                z = false;
            } else {
                for (bg.a aVar : a2.entrySet()) {
                    add(aVar.getElement(), aVar.getCount());
                }
            }
            return z;
        } else if (collection.isEmpty()) {
            return false;
        } else {
            z = aw.a((Collection<T>) this, collection.iterator());
        }
        return z;
    }

    @CanIgnoreReturnValue
    public int add(@NullableDecl E e2, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public int setCount(@NullableDecl E e2, int i) {
        l.a(i, "count");
        int count = count(e2);
        int i2 = i - count;
        if (i2 > 0) {
            add(e2, i2);
        } else if (i2 < 0) {
            remove(e2, -i2);
        }
        return count;
    }

    @CanIgnoreReturnValue
    public boolean setCount(@NullableDecl E e2, int i, int i2) {
        l.a(i, "oldCount");
        l.a(i2, "newCount");
        if (count(e2) != i) {
            return false;
        }
        setCount(e2, i2);
        return true;
    }
}
