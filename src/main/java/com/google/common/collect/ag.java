package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ai;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class ag<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f24536a = new Object[0];

    static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f24537a;

        /* renamed from: b  reason: collision with root package name */
        int f24538b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f24539c;

        a(int i) {
            l.a(i, "initialCapacity");
            this.f24537a = new Object[i];
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public a<E> b(E e2) {
            m.a(e2);
            a(this.f24538b + 1);
            Object[] objArr = this.f24537a;
            int i = this.f24538b;
            this.f24538b = i + 1;
            objArr[i] = e2;
            return this;
        }

        private void a(int i) {
            if (this.f24537a.length < i) {
                this.f24537a = Arrays.copyOf(this.f24537a, a(this.f24537a.length, i));
                this.f24539c = false;
                return;
            }
            if (this.f24539c) {
                this.f24537a = (Object[]) this.f24537a.clone();
                this.f24539c = false;
            }
        }

        @CanIgnoreReturnValue
        public b<E> a(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                a(this.f24538b + collection.size());
                if (collection instanceof ag) {
                    this.f24538b = ((ag) collection).a(this.f24537a, this.f24538b);
                    return this;
                }
            }
            super.a(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        public b<E> a(E... eArr) {
            bl.a(eArr);
            a(this.f24538b + eArr.length);
            System.arraycopy(eArr, 0, this.f24537a, this.f24538b, eArr.length);
            this.f24538b += eArr.length;
            return this;
        }
    }

    public static abstract class b<E> {
        @CanIgnoreReturnValue
        public abstract b<E> b(E e2);

        b() {
        }

        @CanIgnoreReturnValue
        public b<E> a(Iterator<? extends E> it2) {
            while (it2.hasNext()) {
                b(it2.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public b<E> a(Iterable<? extends E> iterable) {
            for (Object b2 : iterable) {
                b(b2);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public b<E> a(E... eArr) {
            for (E b2 : eArr) {
                b(b2);
            }
            return this;
        }

        static int a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    public abstract boolean isPartialView();

    public abstract cg<E> iterator();

    ag() {
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return f24536a;
        }
        Object[] objArr = new Object[size];
        a(objArr, 0);
        return objArr;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new ai.d(toArray());
    }

    public ai<E> asList() {
        if (isEmpty()) {
            return ai.of();
        }
        return ai.a(toArray());
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        m.a(tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = bl.a(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    public int a(Object[] objArr, int i) {
        cg it2 = iterator();
        while (it2.hasNext()) {
            objArr[i] = it2.next();
            i++;
        }
        return i;
    }
}
