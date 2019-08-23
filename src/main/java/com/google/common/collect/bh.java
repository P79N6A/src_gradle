package com.google.common.collect;

import com.google.common.a.j;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.bg;
import com.google.common.collect.by;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bh {

    static abstract class a<E> implements bg.a<E> {
        a() {
        }

        public int hashCode() {
            int i;
            Object element = getElement();
            if (element == null) {
                i = 0;
            } else {
                i = element.hashCode();
            }
            return i ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            return valueOf + " x " + count;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof bg.a)) {
                return false;
            }
            bg.a aVar = (bg.a) obj;
            if (getCount() != aVar.getCount() || !j.a(getElement(), aVar.getElement())) {
                return false;
            }
            return true;
        }
    }

    static abstract class b<E> extends by.c<E> {
        /* access modifiers changed from: package-private */
        public abstract bg<E> a();

        b() {
        }

        public void clear() {
            a().clear();
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public int size() {
            return a().entrySet().size();
        }

        public boolean contains(Object obj) {
            return a().contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return a().containsAll(collection);
        }

        public boolean remove(Object obj) {
            if (a().remove(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }
    }

    static abstract class c<E> extends by.c<bg.a<E>> {
        /* access modifiers changed from: package-private */
        public abstract bg<E> a();

        c() {
        }

        public void clear() {
            a().clear();
        }

        public boolean remove(Object obj) {
            if (obj instanceof bg.a) {
                bg.a aVar = (bg.a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return a().setCount(element, count, 0);
                }
            }
            return false;
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof bg.a)) {
                return false;
            }
            bg.a aVar = (bg.a) obj;
            if (aVar.getCount() > 0 && a().count(aVar.getElement()) == aVar.getCount()) {
                return true;
            }
            return false;
        }
    }

    static class d<E> extends a<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        @NullableDecl
        private final E element;

        public final d<E> nextInBucket() {
            return null;
        }

        public final int getCount() {
            return this.count;
        }

        @NullableDecl
        public final E getElement() {
            return this.element;
        }

        d(@NullableDecl E e2, int i) {
            this.element = e2;
            this.count = i;
            l.a(i, "count");
        }
    }

    static final class e<E> implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        private final bg<E> f24667a;

        /* renamed from: b  reason: collision with root package name */
        private final Iterator<bg.a<E>> f24668b;
        @MonotonicNonNullDecl

        /* renamed from: c  reason: collision with root package name */
        private bg.a<E> f24669c;

        /* renamed from: d  reason: collision with root package name */
        private int f24670d;

        /* renamed from: e  reason: collision with root package name */
        private int f24671e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f24672f;

        public final boolean hasNext() {
            if (this.f24670d > 0 || this.f24668b.hasNext()) {
                return true;
            }
            return false;
        }

        public final E next() {
            if (hasNext()) {
                if (this.f24670d == 0) {
                    this.f24669c = this.f24668b.next();
                    int count = this.f24669c.getCount();
                    this.f24670d = count;
                    this.f24671e = count;
                }
                this.f24670d--;
                this.f24672f = true;
                return this.f24669c.getElement();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            l.a(this.f24672f);
            if (this.f24671e == 1) {
                this.f24668b.remove();
            } else {
                this.f24667a.remove(this.f24669c.getElement());
            }
            this.f24671e--;
            this.f24672f = false;
        }

        e(bg<E> bgVar, Iterator<bg.a<E>> it2) {
            this.f24667a = bgVar;
            this.f24668b = it2;
        }
    }

    static <T> bg<T> a(Iterable<T> iterable) {
        return (bg) iterable;
    }

    public static <E> bg.a<E> a(@NullableDecl E e2, int i) {
        return new d(e2, i);
    }

    static boolean a(bg<?> bgVar, @NullableDecl Object obj) {
        if (obj == bgVar) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar2 = (bg) obj;
        if (bgVar.size() != bgVar2.size() || bgVar.entrySet().size() != bgVar2.entrySet().size()) {
            return false;
        }
        for (bg.a aVar : bgVar2.entrySet()) {
            if (bgVar.count(aVar.getElement()) != aVar.getCount()) {
                return false;
            }
        }
        return true;
    }
}
