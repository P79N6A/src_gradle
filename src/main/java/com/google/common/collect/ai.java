package com.google.common.collect;

import com.google.common.a.j;
import com.google.common.a.m;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ag;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class ai<E> extends ag<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private static final ch<Object> f24540a = new b(bp.f24688a, 0);

    public static final class a<E> extends ag.a<E> {
        public a() {
            this(4);
        }

        public final ai<E> a() {
            this.f24539c = true;
            return ai.b(this.f24537a, this.f24538b);
        }

        a(int i) {
            super(i);
        }

        @CanIgnoreReturnValue
        public final /* bridge */ /* synthetic */ ag.b a(Iterable iterable) {
            super.a(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final a<E> a(Iterator<? extends E> it2) {
            super.a(it2);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public final a<E> b(E e2) {
            super.b(e2);
            return this;
        }

        @CanIgnoreReturnValue
        public final /* bridge */ /* synthetic */ ag.b a(Object[] objArr) {
            super.a((E[]) objArr);
            return this;
        }
    }

    static class b<E> extends a<E> {

        /* renamed from: a  reason: collision with root package name */
        private final ai<E> f24541a;

        /* access modifiers changed from: protected */
        public final E a(int i) {
            return this.f24541a.get(i);
        }

        b(ai<E> aiVar, int i) {
            super(aiVar.size(), i);
            this.f24541a = aiVar;
        }
    }

    static class c<E> extends ai<E> {

        /* renamed from: a  reason: collision with root package name */
        private final transient ai<E> f24542a;

        public final ai<E> reverse() {
            return this.f24542a;
        }

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return this.f24542a.isPartialView();
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return ai.super.iterator();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ai.super.listIterator();
        }

        public final int size() {
            return this.f24542a.size();
        }

        c(ai<E> aiVar) {
            this.f24542a = aiVar;
        }

        private int a(int i) {
            return (size() - 1) - i;
        }

        private int b(int i) {
            return size() - i;
        }

        public final boolean contains(@NullableDecl Object obj) {
            return this.f24542a.contains(obj);
        }

        public final int indexOf(@NullableDecl Object obj) {
            int lastIndexOf = this.f24542a.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return a(lastIndexOf);
            }
            return -1;
        }

        public final int lastIndexOf(@NullableDecl Object obj) {
            int indexOf = this.f24542a.indexOf(obj);
            if (indexOf >= 0) {
                return a(indexOf);
            }
            return -1;
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ai.super.listIterator(i);
        }

        public final E get(int i) {
            m.a(i, size());
            return this.f24542a.get(a(i));
        }

        public final ai<E> subList(int i, int i2) {
            m.a(i, i2, size());
            return this.f24542a.subList(b(i2), b(i)).reverse();
        }
    }

    static class d implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return ai.copyOf((E[]) this.elements);
        }

        d(Object[] objArr) {
            this.elements = objArr;
        }
    }

    class e extends ai<E> {

        /* renamed from: a  reason: collision with root package name */
        final transient int f24543a;

        /* renamed from: b  reason: collision with root package name */
        final transient int f24544b;

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return this.f24544b;
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return ai.super.iterator();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ai.super.listIterator();
        }

        public final E get(int i) {
            m.a(i, this.f24544b);
            return ai.this.get(i + this.f24543a);
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ai.super.listIterator(i);
        }

        public final ai<E> subList(int i, int i2) {
            m.a(i, i2, this.f24544b);
            return ai.this.subList(i + this.f24543a, i2 + this.f24543a);
        }

        e(int i, int i2) {
            this.f24543a = i;
            this.f24544b = i2;
        }
    }

    public final ai<E> asList() {
        return this;
    }

    ai() {
    }

    public static <E> ai<E> of() {
        return bp.f24688a;
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return b(e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return b(e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12) {
        return b(e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
    }

    @SafeVarargs
    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13, E... eArr) {
        E[] eArr2 = eArr;
        m.a(eArr2.length <= 2147483635, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr2.length + 12)];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        objArr[6] = e8;
        objArr[7] = e9;
        objArr[8] = e10;
        objArr[9] = e11;
        objArr[10] = e12;
        objArr[11] = e13;
        System.arraycopy(eArr2, 0, objArr, 12, eArr2.length);
        return b(objArr);
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public cg<E> iterator() {
        return listIterator();
    }

    public ch<E> listIterator() {
        return listIterator(0);
    }

    public ai<E> reverse() {
        if (size() <= 1) {
            return this;
        }
        return new c(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new d(toArray());
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    static <E> ai<E> a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    private static <E> ai<E> b(Object... objArr) {
        return a(bl.a(objArr));
    }

    @Beta
    public static <E> a<E> builderWithExpectedSize(int i) {
        l.a(i, "expectedSize");
        return new a<>(i);
    }

    public static <E> ai<E> of(E e2) {
        return b(e2);
    }

    public boolean contains(@NullableDecl Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public static <E> ai<E> copyOf(Iterable<? extends E> iterable) {
        m.a(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E extends Comparable<? super E>> ai<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) av.a(iterable, (T[]) new Comparable[0]);
        bl.a((Object[]) comparableArr);
        Arrays.sort(comparableArr);
        return a(comparableArr);
    }

    public ch<E> listIterator(int i) {
        m.b(i, size());
        if (isEmpty()) {
            return f24540a;
        }
        return new b(this, i);
    }

    public static <E> ai<E> copyOf(Collection<? extends E> collection) {
        if (!(collection instanceof ag)) {
            return b(collection.toArray());
        }
        ai<E> asList = ((ag) collection).asList();
        if (asList.isPartialView()) {
            asList = a(asList.toArray());
        }
        return asList;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj != null) {
            int size = size();
            int i = 0;
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < size) {
                    if (obj.equals(get(i))) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj != null) {
            if (obj == null) {
                for (int size = size() - 1; size >= 0; size--) {
                    if (get(size) == null) {
                        return size;
                    }
                }
            } else {
                for (int size2 = size() - 1; size2 >= 0; size2--) {
                    if (obj.equals(get(size2))) {
                        return size2;
                    }
                }
            }
        }
        return -1;
    }

    public static <E> ai<E> copyOf(Iterator<? extends E> it2) {
        if (!it2.hasNext()) {
            return of();
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return of(next);
        }
        return new a().b(next).a(it2).a();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == m.a(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (j.a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it2 = iterator();
                Iterator it3 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it3.hasNext()) {
                            if (!j.a(it2.next(), it3.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it3.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static <E> ai<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        return b((Object[]) eArr.clone());
    }

    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    static <E> ai<E> b(Object[] objArr, int i) {
        if (i == 0) {
            return of();
        }
        return new bp(objArr, i);
    }

    public static <E> ai<E> of(E e2, E e3) {
        return b(e2, e3);
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public ai<E> subList(int i, int i2) {
        m.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        return new e(i, i3);
    }

    public static <E> ai<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        m.a(comparator);
        Object[] a2 = av.a(iterable);
        bl.a(a2);
        Arrays.sort(a2, comparator);
        return a(a2);
    }

    public static <E> ai<E> of(E e2, E e3, E e4) {
        return b(e2, e3, e4);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5) {
        return b(e2, e3, e4, e5);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6) {
        return b(e2, e3, e4, e5, e6);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6, E e7) {
        return b(e2, e3, e4, e5, e6, e7);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return b(e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return b(e2, e3, e4, e5, e6, e7, e8, e9);
    }
}
