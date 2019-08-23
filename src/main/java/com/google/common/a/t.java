package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class t {

    @VisibleForTesting
    static class a<T> implements s<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        volatile transient boolean f24417a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        transient T f24418b;
        final s<T> delegate;

        public final T get() {
            if (!this.f24417a) {
                synchronized (this) {
                    if (!this.f24417a) {
                        T t = this.delegate.get();
                        this.f24418b = t;
                        this.f24417a = true;
                        return t;
                    }
                }
            }
            return this.f24418b;
        }

        public final String toString() {
            return "Suppliers.memoize(" + this.delegate + ")";
        }

        a(s<T> sVar) {
            this.delegate = (s) m.a(sVar);
        }
    }

    @VisibleForTesting
    static class b<T> implements s<T> {

        /* renamed from: a  reason: collision with root package name */
        volatile s<T> f24419a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f24420b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        T f24421c;

        public final String toString() {
            return "Suppliers.memoize(" + this.f24419a + ")";
        }

        public final T get() {
            if (!this.f24420b) {
                synchronized (this) {
                    if (!this.f24420b) {
                        T t = this.f24419a.get();
                        this.f24421c = t;
                        this.f24420b = true;
                        this.f24419a = null;
                        return t;
                    }
                }
            }
            return this.f24421c;
        }

        b(s<T> sVar) {
            this.f24419a = (s) m.a(sVar);
        }
    }

    public static class c<T> implements s<T>, Serializable {
        private static final long serialVersionUID = 0;
        @NullableDecl
        final T instance;

        public final T get() {
            return this.instance;
        }

        public final int hashCode() {
            return j.a(this.instance);
        }

        public final String toString() {
            return "Suppliers.ofInstance(" + this.instance + ")";
        }

        public c(@NullableDecl T t) {
            this.instance = t;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj instanceof c) {
                return j.a(this.instance, ((c) obj).instance);
            }
            return false;
        }
    }

    public static <T> s<T> a(s<T> sVar) {
        if ((sVar instanceof b) || (sVar instanceof a)) {
            return sVar;
        }
        if (sVar instanceof Serializable) {
            return new a(sVar);
        }
        return new b(sVar);
    }
}
