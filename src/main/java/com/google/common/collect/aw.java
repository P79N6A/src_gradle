package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.a.n;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class aw {

    static final class a<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        static final ch<Object> f24602a = new a(new Object[0], 0, 0, 0);

        /* renamed from: b  reason: collision with root package name */
        private final T[] f24603b;

        /* renamed from: c  reason: collision with root package name */
        private final int f24604c = 0;

        /* access modifiers changed from: protected */
        public final T a(int i) {
            return this.f24603b[this.f24604c + i];
        }

        private a(T[] tArr, int i, int i2, int i3) {
            super(0, 0);
            this.f24603b = tArr;
        }
    }

    enum b implements Iterator<Object> {
        INSTANCE;

        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            l.a(false);
        }
    }

    private static <T> ch<T> b() {
        return a.f24602a;
    }

    static <T> cg<T> a() {
        return b();
    }

    @NullableDecl
    static <T> T a(Iterator<T> it2) {
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        it2.remove();
        return next;
    }

    static void b(Iterator<?> it2) {
        m.a(it2);
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    @NullableDecl
    public static <T> T a(Iterator<? extends T> it2, @NullableDecl T t) {
        if (it2.hasNext()) {
            return it2.next();
        }
        return t;
    }

    public static <T> T b(Iterator<T> it2, n<? super T> nVar) {
        m.a(it2);
        m.a(nVar);
        while (it2.hasNext()) {
            T next = it2.next();
            if (nVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> int c(Iterator<T> it2, n<? super T> nVar) {
        m.a(nVar, (Object) "predicate");
        int i = 0;
        while (it2.hasNext()) {
            if (nVar.apply(it2.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @CanIgnoreReturnValue
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it2) {
        m.a(collection);
        m.a(it2);
        boolean z = false;
        while (it2.hasNext()) {
            z |= collection.add(it2.next());
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static <T> boolean a(Iterator<T> it2, n<? super T> nVar) {
        m.a(nVar);
        boolean z = false;
        while (it2.hasNext()) {
            if (nVar.apply(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
