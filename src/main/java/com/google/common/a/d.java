package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class d<T> {

    static final class a extends d<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final a f24402a = new a();
        private static final long serialVersionUID = 1;

        a() {
        }

        private Object readResolve() {
            return f24402a;
        }

        /* access modifiers changed from: protected */
        public final int a(Object obj) {
            return obj.hashCode();
        }

        /* access modifiers changed from: protected */
        public final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    static final class b<T> implements n<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final d<T> equivalence;
        @NullableDecl
        private final T target;

        public final int hashCode() {
            return j.a(this.equivalence, this.target);
        }

        public final String toString() {
            return this.equivalence + ".equivalentTo(" + this.target + ")";
        }

        public final boolean apply(@NullableDecl T t) {
            return this.equivalence.equivalent(t, this.target);
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.equivalence.equals(bVar.equivalence) || !j.a(this.target, bVar.target)) {
                return false;
            }
            return true;
        }

        b(d<T> dVar, @NullableDecl T t) {
            this.equivalence = (d) m.a(dVar);
            this.target = t;
        }
    }

    static final class c extends d<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final c f24403a = new c();
        private static final long serialVersionUID = 1;

        /* access modifiers changed from: protected */
        public final boolean a(Object obj, Object obj2) {
            return false;
        }

        c() {
        }

        private Object readResolve() {
            return f24403a;
        }

        /* access modifiers changed from: protected */
        public final int a(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* renamed from: com.google.common.a.d$d  reason: collision with other inner class name */
    public static final class C0277d<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final d<? super T> equivalence;
        @NullableDecl
        private final T reference;

        @NullableDecl
        public final T get() {
            return this.reference;
        }

        public final int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public final String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0277d) {
                C0277d dVar = (C0277d) obj;
                if (this.equivalence.equals(dVar.equivalence)) {
                    return this.equivalence.equivalent(this.reference, dVar.reference);
                }
            }
            return false;
        }

        private C0277d(d<? super T> dVar, @NullableDecl T t) {
            this.equivalence = (d) m.a(dVar);
            this.reference = t;
        }

        /* synthetic */ C0277d(d dVar, Object obj, byte b2) {
            this(dVar, obj);
        }
    }

    /* access modifiers changed from: protected */
    @ForOverride
    public abstract int a(T t);

    /* access modifiers changed from: protected */
    @ForOverride
    public abstract boolean a(T t, T t2);

    protected d() {
    }

    public static d<Object> equals() {
        return a.f24402a;
    }

    public static d<Object> identity() {
        return c.f24403a;
    }

    @GwtCompatible
    public final <S extends T> d<Iterable<S>> pairwise() {
        return new l(this);
    }

    public final n<T> equivalentTo(@NullableDecl T t) {
        return new b(this, t);
    }

    public final <F> d<F> onResultOf(f<F, ? extends T> fVar) {
        return new g(fVar, this);
    }

    public final <S extends T> C0277d<S> wrap(@NullableDecl S s) {
        return new C0277d<>(this, s, (byte) 0);
    }

    public final int hash(@NullableDecl T t) {
        if (t == null) {
            return 0;
        }
        return a(t);
    }

    public final boolean equivalent(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return a(t, t2);
    }
}
