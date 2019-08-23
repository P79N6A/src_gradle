package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ag;
import com.google.common.collect.ar;
import com.google.common.collect.bg;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class ap<E> extends aq<E> implements bg<E> {
    @LazyInit

    /* renamed from: a  reason: collision with root package name */
    private transient ai<E> f24578a;
    @LazyInit

    /* renamed from: b  reason: collision with root package name */
    private transient ar<bg.a<E>> f24579b;

    public static class a<E> extends ag.b<E> {

        /* renamed from: a  reason: collision with root package name */
        bm<E> f24584a;

        /* renamed from: b  reason: collision with root package name */
        boolean f24585b;

        /* renamed from: c  reason: collision with root package name */
        boolean f24586c;

        public a() {
            this(4);
        }

        public final ap<E> a() {
            if (this.f24584a.f24678c == 0) {
                return ap.of();
            }
            if (this.f24586c) {
                this.f24584a = new bm<>(this.f24584a);
                this.f24586c = false;
            }
            this.f24585b = true;
            return new br(this.f24584a);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final a<E> a(Iterator<? extends E> it2) {
            super.a(it2);
            return this;
        }

        a(int i) {
            this.f24584a = new bm<>(i);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final a<E> a(E... eArr) {
            super.a(eArr);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final a<E> b(E e2) {
            return a(e2, 1);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final a<E> a(Iterable<? extends E> iterable) {
            bm<E> bmVar;
            if (iterable instanceof bg) {
                bg a2 = bh.a(iterable);
                if (a2 instanceof br) {
                    bmVar = ((br) a2).f24702b;
                } else if (a2 instanceof e) {
                    bmVar = ((e) a2).f24756a;
                } else {
                    bmVar = null;
                }
                if (bmVar != null) {
                    this.f24584a.e(Math.max(this.f24584a.f24678c, bmVar.f24678c));
                    for (int a3 = bmVar.a(); a3 >= 0; a3 = bmVar.a(a3)) {
                        a(bmVar.b(a3), bmVar.c(a3));
                    }
                } else {
                    this.f24584a.e(Math.max(this.f24584a.f24678c, a2.entrySet().size()));
                    for (bg.a aVar : a2.entrySet()) {
                        a(aVar.getElement(), aVar.getCount());
                    }
                }
            } else {
                super.a(iterable);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public final a<E> a(E e2, int i) {
            if (i == 0) {
                return this;
            }
            if (this.f24585b) {
                this.f24584a = new bm<>(this.f24584a);
                this.f24586c = false;
            }
            this.f24585b = false;
            m.a(e2);
            this.f24584a.a(e2, i + this.f24584a.b((Object) e2));
            return this;
        }
    }

    final class b extends ar.b<bg.a<E>> {
        private static final long serialVersionUID = 0;

        public final int hashCode() {
            return ap.this.hashCode();
        }

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return ap.this.isPartialView();
        }

        /* access modifiers changed from: package-private */
        public final Object writeReplace() {
            return new c(ap.this);
        }

        public final int size() {
            return ap.this.elementSet().size();
        }

        private b() {
        }

        /* access modifiers changed from: package-private */
        public final /* bridge */ /* synthetic */ Object a(int i) {
            return ap.this.a(i);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof bg.a)) {
                return false;
            }
            bg.a aVar = (bg.a) obj;
            if (aVar.getCount() > 0 && ap.this.count(aVar.getElement()) == aVar.getCount()) {
                return true;
            }
            return false;
        }

        /* synthetic */ b(ap apVar, byte b2) {
            this();
        }
    }

    static class c<E> implements Serializable {
        final ap<E> multiset;

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.multiset.entrySet();
        }

        c(ap<E> apVar) {
            this.multiset = apVar;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract bg.a<E> a(int i);

    public abstract ar<E> elementSet();

    /* access modifiers changed from: package-private */
    public abstract Object writeReplace();

    ap() {
    }

    public static <E> ap<E> of() {
        return br.f24701a;
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public ai<E> asList() {
        ai<E> aiVar = this.f24578a;
        if (aiVar != null) {
            return aiVar;
        }
        ai<E> asList = super.asList();
        this.f24578a = asList;
        return asList;
    }

    public int hashCode() {
        return by.a(entrySet());
    }

    public cg<E> iterator() {
        final cg it2 = entrySet().iterator();
        return new cg<E>() {

            /* renamed from: a  reason: collision with root package name */
            int f24580a;
            @MonotonicNonNullDecl

            /* renamed from: b  reason: collision with root package name */
            E f24581b;

            public final boolean hasNext() {
                if (this.f24580a > 0 || it2.hasNext()) {
                    return true;
                }
                return false;
            }

            public final E next() {
                if (this.f24580a <= 0) {
                    bg.a aVar = (bg.a) it2.next();
                    this.f24581b = aVar.getElement();
                    this.f24580a = aVar.getCount();
                }
                this.f24580a--;
                return this.f24581b;
            }
        };
    }

    public String toString() {
        return entrySet().toString();
    }

    public ar<bg.a<E>> entrySet() {
        ar<bg.a<E>> arVar = this.f24579b;
        if (arVar == null) {
            if (isEmpty()) {
                arVar = ar.of();
            } else {
                arVar = new b<>(this, (byte) 0);
            }
            this.f24579b = arVar;
        }
        return arVar;
    }

    public static <E> ap<E> copyOf(E[] eArr) {
        return a(eArr);
    }

    public boolean equals(@NullableDecl Object obj) {
        return bh.a((bg<?>) this, obj);
    }

    private static <E> ap<E> a(E... eArr) {
        return new a().a(eArr).a();
    }

    public static <E> ap<E> copyOf(Iterator<? extends E> it2) {
        return new a().a(it2).a();
    }

    public static <E> ap<E> of(E e2) {
        return a((E[]) new Object[]{e2});
    }

    public boolean contains(@NullableDecl Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    public static <E> ap<E> copyOf(Iterable<? extends E> iterable) {
        int i;
        if (iterable instanceof ap) {
            ap<E> apVar = (ap) iterable;
            if (!apVar.isPartialView()) {
                return apVar;
            }
        }
        if (iterable instanceof bg) {
            i = ((bg) iterable).elementSet().size();
        } else {
            i = 11;
        }
        a aVar = new a(i);
        aVar.a(iterable);
        return aVar.a();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final int add(E e2, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final int setCount(E e2, int i) {
        throw new UnsupportedOperationException();
    }

    public static <E> ap<E> of(E e2, E e3) {
        return a((E[]) new Object[]{e2, e3});
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public final int a(Object[] objArr, int i) {
        cg it2 = entrySet().iterator();
        while (it2.hasNext()) {
            bg.a aVar = (bg.a) it2.next();
            Arrays.fill(objArr, i, aVar.getCount() + i, aVar.getElement());
            i += aVar.getCount();
        }
        return i;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean setCount(E e2, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public static <E> ap<E> of(E e2, E e3, E e4) {
        return a((E[]) new Object[]{e2, e3, e4});
    }

    public static <E> ap<E> of(E e2, E e3, E e4, E e5) {
        return a((E[]) new Object[]{e2, e3, e4, e5});
    }

    public static <E> ap<E> of(E e2, E e3, E e4, E e5, E e6) {
        return a((E[]) new Object[]{e2, e3, e4, e5, e6});
    }

    public static <E> ap<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        return new a().b(e2).b(e3).b(e4).b(e5).b(e6).b(e7).a(eArr).a();
    }
}
