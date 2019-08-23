package com.google.common.collect;

import com.google.common.a.f;
import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class az {

    static class a<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        @NullableDecl
        final E first;
        final E[] rest;

        public final int size() {
            return com.google.common.f.a.a(((long) this.rest.length) + 1);
        }

        public final E get(int i) {
            m.a(i, size());
            if (i == 0) {
                return this.first;
            }
            return this.rest[i - 1];
        }

        a(@NullableDecl E e2, E[] eArr) {
            this.first = e2;
            this.rest = (Object[]) m.a(eArr);
        }
    }

    static class b<T> extends c<T> implements RandomAccess {
        b(List<T> list) {
            super(list);
        }
    }

    static class c<T> extends AbstractList<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<T> f24605a;

        public void clear() {
            this.f24605a.clear();
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public int size() {
            return this.f24605a.size();
        }

        c(List<T> list) {
            this.f24605a = (List) m.a(list);
        }

        private int b(int i) {
            int size = size();
            m.a(i, size);
            return (size - 1) - i;
        }

        public final int a(int i) {
            int size = size();
            m.b(i, size);
            return size - i;
        }

        public T get(int i) {
            return this.f24605a.get(b(i));
        }

        public ListIterator<T> listIterator(int i) {
            final ListIterator<T> listIterator = this.f24605a.listIterator(a(i));
            return new ListIterator<T>() {

                /* renamed from: a  reason: collision with root package name */
                boolean f24606a;

                public final boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                public final boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                public final int previousIndex() {
                    return nextIndex() - 1;
                }

                public final int nextIndex() {
                    return c.this.a(listIterator.nextIndex());
                }

                public final void remove() {
                    l.a(this.f24606a);
                    listIterator.remove();
                    this.f24606a = false;
                }

                public final T next() {
                    if (hasNext()) {
                        this.f24606a = true;
                        return listIterator.previous();
                    }
                    throw new NoSuchElementException();
                }

                public final T previous() {
                    if (hasPrevious()) {
                        this.f24606a = true;
                        return listIterator.next();
                    }
                    throw new NoSuchElementException();
                }

                public final void add(T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.f24606a = false;
                }

                public final void set(T t) {
                    m.b(this.f24606a);
                    listIterator.set(t);
                }
            };
        }

        public T remove(int i) {
            return this.f24605a.remove(b(i));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        public void add(int i, @NullableDecl T t) {
            this.f24605a.add(a(i), t);
        }

        public T set(int i, @NullableDecl T t) {
            return this.f24605a.set(b(i), t);
        }

        public List<T> subList(int i, int i2) {
            m.a(i, i2, size());
            return az.a(this.f24605a.subList(a(i2), a(i)));
        }
    }

    static class d<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final f<? super F, ? extends T> function;

        public final void clear() {
            this.fromList.clear();
        }

        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        public final Iterator<T> iterator() {
            return listIterator();
        }

        public final int size() {
            return this.fromList.size();
        }

        public final T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        public final ListIterator<T> listIterator(int i) {
            return new ce<F, T>(this.fromList.listIterator(i)) {
                /* access modifiers changed from: package-private */
                public final T a(F f2) {
                    return d.this.function.apply(f2);
                }
            };
        }

        public final T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        d(List<F> list, f<? super F, ? extends T> fVar) {
            this.fromList = (List) m.a(list);
            this.function = (f) m.a(fVar);
        }
    }

    static class e<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final f<? super F, ? extends T> function;

        public final void clear() {
            this.fromList.clear();
        }

        public final int size() {
            return this.fromList.size();
        }

        public final ListIterator<T> listIterator(int i) {
            return new ce<F, T>(this.fromList.listIterator(i)) {
                /* access modifiers changed from: package-private */
                public final T a(F f2) {
                    return e.this.function.apply(f2);
                }
            };
        }

        e(List<F> list, f<? super F, ? extends T> fVar) {
            this.fromList = (List) m.a(list);
            this.function = (f) m.a(fVar);
        }
    }

    @GwtCompatible
    public static <E> ArrayList<E> a() {
        return new ArrayList<>();
    }

    @GwtCompatible
    @CanIgnoreReturnValue
    public static <E> ArrayList<E> a(Iterator<? extends E> it2) {
        ArrayList<E> a2 = a();
        aw.a((Collection<T>) a2, it2);
        return a2;
    }

    @GwtCompatible
    @CanIgnoreReturnValue
    public static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        m.a(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>(m.a(iterable));
        }
        return a(iterable.iterator());
    }

    @GwtCompatible
    @CanIgnoreReturnValue
    @SafeVarargs
    public static <E> ArrayList<E> a(E... eArr) {
        m.a(eArr);
        int length = eArr.length;
        l.a(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(com.google.common.f.a.a(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <T> List<T> a(List<T> list) {
        if (list instanceof ai) {
            return ((ai) list).reverse();
        }
        if (list instanceof c) {
            return ((c) list).f24605a;
        }
        if (list instanceof RandomAccess) {
            return new b(list);
        }
        return new c(list);
    }

    public static <F, T> List<T> a(List<F> list, f<? super F, ? extends T> fVar) {
        if (list instanceof RandomAccess) {
            return new d(list, fVar);
        }
        return new e(list, fVar);
    }
}
