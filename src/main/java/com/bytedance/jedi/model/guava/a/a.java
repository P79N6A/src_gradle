package com.bytedance.jedi.model.guava.a;

import com.bytedance.jedi.model.guava.annotations.ForOverride;
import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import com.bytedance.jedi.model.guava.annotations.NullableDecl;
import java.io.Serializable;
import java.util.Arrays;

@GwtCompatible
public abstract class a<T> {

    /* renamed from: com.bytedance.jedi.model.guava.a.a$a  reason: collision with other inner class name */
    static final class C0217a extends a<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final C0217a f21621a = new C0217a();
        private static final long serialVersionUID = 1;

        C0217a() {
        }

        private Object readResolve() {
            return f21621a;
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

    static final class b<T> implements d<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final a<T> equivalence;
        @NullableDecl
        private final T target;

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.equivalence, this.target});
        }

        public final String toString() {
            return this.equivalence + ".equivalentTo(" + this.target + ")";
        }

        public final boolean apply(@NullableDecl T t) {
            return this.equivalence.equivalent(t, this.target);
        }

        public final boolean equals(@NullableDecl Object obj) {
            boolean z;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.equivalence.equals(bVar.equivalence)) {
                T t = this.target;
                T t2 = bVar.target;
                if (t == t2 || (t != null && t.equals(t2))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        b(a<T> aVar, @NullableDecl T t) {
            this.equivalence = (a) c.a(aVar);
            this.target = t;
        }
    }

    static final class c extends a<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final c f21622a = new c();
        private static final long serialVersionUID = 1;

        /* access modifiers changed from: protected */
        public final boolean a(Object obj, Object obj2) {
            return false;
        }

        c() {
        }

        private Object readResolve() {
            return f21622a;
        }

        /* access modifiers changed from: protected */
        public final int a(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class d<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final a<? super T> equivalence;
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
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.equivalence.equals(dVar.equivalence)) {
                    return this.equivalence.equivalent(this.reference, dVar.reference);
                }
            }
            return false;
        }

        private d(a<? super T> aVar, @NullableDecl T t) {
            this.equivalence = (a) c.a(aVar);
            this.reference = t;
        }

        /* synthetic */ d(a aVar, Object obj, byte b2) {
            this(aVar, obj);
        }
    }

    /* access modifiers changed from: protected */
    @ForOverride
    public abstract int a(T t);

    /* access modifiers changed from: protected */
    @ForOverride
    public abstract boolean a(T t, T t2);

    protected a() {
    }

    public static a<Object> equals() {
        return C0217a.f21621a;
    }

    public static a<Object> identity() {
        return c.f21622a;
    }

    public final d<T> equivalentTo(@NullableDecl T t) {
        return new b(this, t);
    }

    public final <S extends T> d<S> wrap(@NullableDecl S s) {
        return new d<>(this, s, (byte) 0);
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
