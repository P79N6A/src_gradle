package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class o {

    static class a<T> implements n<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends n<? super T>> components;

        public final int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends n<? super T>> list = this.components;
            StringBuilder sb = new StringBuilder("Predicates.");
            sb.append("and");
            sb.append('(');
            boolean z = true;
            for (T next : list) {
                if (!z) {
                    sb.append(',');
                }
                sb.append(next);
                z = false;
            }
            sb.append(')');
            return sb.toString();
        }

        private a(List<? extends n<? super T>> list) {
            this.components = list;
        }

        public final boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!((n) this.components.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj instanceof a) {
                return this.components.equals(((a) obj).components);
            }
            return false;
        }

        /* synthetic */ a(List list, byte b2) {
            this(list);
        }
    }

    static class b<A, B> implements n<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f  reason: collision with root package name */
        final f<A, ? extends B> f24415f;
        final n<B> p;

        public final int hashCode() {
            return this.f24415f.hashCode() ^ this.p.hashCode();
        }

        public final String toString() {
            return this.p + "(" + this.f24415f + ")";
        }

        public final boolean apply(@NullableDecl A a2) {
            return this.p.apply(this.f24415f.apply(a2));
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f24415f.equals(bVar.f24415f) || !this.p.equals(bVar.p)) {
                return false;
            }
            return true;
        }

        private b(n<B> nVar, f<A, ? extends B> fVar) {
            this.p = (n) m.a(nVar);
            this.f24415f = (f) m.a(fVar);
        }

        /* synthetic */ b(n nVar, f fVar, byte b2) {
            this(nVar, fVar);
        }
    }

    static class c<T> implements n<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        public final int hashCode() {
            return this.target.hashCode();
        }

        public final String toString() {
            return "Predicates.in(" + this.target + ")";
        }

        private c(Collection<?> collection) {
            this.target = (Collection) m.a(collection);
        }

        public final boolean apply(@NullableDecl T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj instanceof c) {
                return this.target.equals(((c) obj).target);
            }
            return false;
        }

        /* synthetic */ c(Collection collection, byte b2) {
            this(collection);
        }
    }

    static class d<T> implements n<T>, Serializable {
        private static final long serialVersionUID = 0;
        final n<T> predicate;

        public final int hashCode() {
            return this.predicate.hashCode() ^ -1;
        }

        public final String toString() {
            return "Predicates.not(" + this.predicate + ")";
        }

        d(n<T> nVar) {
            this.predicate = (n) m.a(nVar);
        }

        public final boolean apply(@NullableDecl T t) {
            if (!this.predicate.apply(t)) {
                return true;
            }
            return false;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj instanceof d) {
                return this.predicate.equals(((d) obj).predicate);
            }
            return false;
        }
    }

    public static <T> n<T> a(n<T> nVar) {
        return new d(nVar);
    }

    public static <T> n<T> a(Collection<? extends T> collection) {
        return new c(collection, (byte) 0);
    }

    public static <A, B> n<A> a(n<B> nVar, f<A, ? extends B> fVar) {
        return new b(nVar, fVar, (byte) 0);
    }

    public static <T> n<T> a(n<? super T> nVar, n<? super T> nVar2) {
        return new a(Arrays.asList(new n[]{(n) m.a(nVar), (n) m.a(nVar2)}), (byte) 0);
    }
}
