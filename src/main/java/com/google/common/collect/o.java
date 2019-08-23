package com.google.common.collect;

import com.google.common.a.j;
import com.google.common.a.m;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
public final class o<E> extends AbstractSet<E> implements Serializable {
    @MonotonicNonNullDecl

    /* renamed from: a  reason: collision with root package name */
    transient Object[] f24795a;

    /* renamed from: b  reason: collision with root package name */
    transient float f24796b;

    /* renamed from: c  reason: collision with root package name */
    transient int f24797c;

    /* renamed from: d  reason: collision with root package name */
    transient int f24798d;
    @MonotonicNonNullDecl

    /* renamed from: e  reason: collision with root package name */
    private transient int[] f24799e;
    @MonotonicNonNullDecl
    public transient long[] entries;

    /* renamed from: f  reason: collision with root package name */
    private transient int f24800f;

    private static int a(long j) {
        return (int) j;
    }

    private static long a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    public static int getHash(long j) {
        return (int) (j >>> 32);
    }

    public final int size() {
        return this.f24798d;
    }

    private int a() {
        return this.f24799e.length - 1;
    }

    public static <E> o<E> create() {
        return new o<>();
    }

    public final boolean isEmpty() {
        if (this.f24798d == 0) {
            return true;
        }
        return false;
    }

    public final Iterator<E> iterator() {
        return new Iterator<E>() {

            /* renamed from: a  reason: collision with root package name */
            int f24801a = o.this.f24797c;

            /* renamed from: b  reason: collision with root package name */
            int f24802b;

            /* renamed from: c  reason: collision with root package name */
            int f24803c;

            public final boolean hasNext() {
                if (this.f24802b >= 0) {
                    return true;
                }
                return false;
            }

            private void a() {
                if (o.this.f24797c != this.f24801a) {
                    throw new ConcurrentModificationException();
                }
            }

            public final E next() {
                a();
                if (hasNext()) {
                    this.f24803c = this.f24802b;
                    E e2 = o.this.f24795a[this.f24802b];
                    o oVar = o.this;
                    int i = this.f24802b + 1;
                    if (i >= oVar.f24798d) {
                        i = -1;
                    }
                    this.f24802b = i;
                    return e2;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                boolean z;
                a();
                if (this.f24803c >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                l.a(z);
                this.f24801a++;
                o.this.remove(o.this.f24795a[this.f24803c], o.getHash(o.this.entries[this.f24803c]));
                this.f24802b--;
                this.f24803c = -1;
            }

            {
                int i;
                if (o.this.isEmpty()) {
                    i = -1;
                } else {
                    i = 0;
                }
                this.f24802b = i;
                this.f24803c = -1;
            }
        };
    }

    o() {
        a(3, 1.0f);
    }

    public final Object[] toArray() {
        return Arrays.copyOf(this.f24795a, this.f24798d);
    }

    public final void clear() {
        this.f24797c++;
        Arrays.fill(this.f24795a, 0, this.f24798d, null);
        Arrays.fill(this.f24799e, -1);
        Arrays.fill(this.entries, -1);
        this.f24798d = 0;
    }

    public final void trimToSize() {
        int i = this.f24798d;
        if (i < this.entries.length) {
            c(i);
        }
        int max = Math.max(1, Integer.highestOneBit((int) (((float) i) / this.f24796b)));
        if (max < 1073741824) {
            double d2 = (double) i;
            double d3 = (double) max;
            Double.isNaN(d2);
            Double.isNaN(d3);
            if (d2 / d3 > ((double) this.f24796b)) {
                max <<= 1;
            }
        }
        if (max < this.f24799e.length) {
            d(max);
        }
    }

    private static long[] b(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    public static <E> o<E> createWithExpectedSize(int i) {
        return new o<>(i);
    }

    public static <E> o<E> create(Collection<? extends E> collection) {
        o<E> createWithExpectedSize = createWithExpectedSize(collection.size());
        createWithExpectedSize.addAll(collection);
        return createWithExpectedSize;
    }

    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj) {
        return remove(obj, af.a(obj));
    }

    private o(int i) {
        a(i, 1.0f);
    }

    private static int[] a(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void c(int i) {
        this.f24795a = Arrays.copyOf(this.f24795a, i);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.entries = copyOf;
    }

    public static <E> o<E> create(E... eArr) {
        o<E> createWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(createWithExpectedSize, eArr);
        return createWithExpectedSize;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f24798d);
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            objectOutputStream.writeObject(it2.next());
        }
    }

    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr = this.f24795a;
        int i = this.f24798d;
        m.a(0, i + 0, objArr.length);
        if (tArr.length < i) {
            tArr = bl.a(tArr, i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }

    public final boolean contains(@NullableDecl Object obj) {
        int a2 = af.a(obj);
        int i = this.f24799e[a() & a2];
        while (i != -1) {
            long j = this.entries[i];
            if (getHash(j) == a2 && j.a(obj, this.f24795a[i])) {
                return true;
            }
            i = a(j);
        }
        return false;
    }

    private void d(int i) {
        if (this.f24799e.length >= 1073741824) {
            this.f24800f = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f24796b)) + 1;
        int[] a2 = a(i);
        long[] jArr = this.entries;
        int length = a2.length - 1;
        for (int i3 = 0; i3 < this.f24798d; i3++) {
            int hash = getHash(jArr[i3]);
            int i4 = hash & length;
            int i5 = a2[i4];
            a2[i4] = i3;
            jArr[i3] = (((long) hash) << 32) | (4294967295L & ((long) i5));
        }
        this.f24800f = i2;
        this.f24799e = a2;
    }

    @CanIgnoreReturnValue
    public final boolean add(@NullableDecl E e2) {
        long[] jArr = this.entries;
        Object[] objArr = this.f24795a;
        int a2 = af.a((Object) e2);
        int a3 = a() & a2;
        int i = this.f24798d;
        int i2 = this.f24799e[a3];
        if (i2 == -1) {
            this.f24799e[a3] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (getHash(j) == a2 && j.a(e2, objArr[i2])) {
                    return false;
                }
                int a4 = a(j);
                if (a4 == -1) {
                    jArr[i2] = a(j, i);
                    break;
                }
                i2 = a4;
            }
        }
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            int i4 = i + 1;
            int length = this.entries.length;
            if (i4 > length) {
                int max = Math.max(1, length >>> 1) + length;
                if (max >= 0) {
                    i3 = max;
                }
                if (i3 != length) {
                    c(i3);
                }
            }
            this.entries[i] = (((long) a2) << 32) | 4294967295L;
            this.f24795a[i] = e2;
            this.f24798d = i4;
            if (i >= this.f24800f) {
                d(this.f24799e.length * 2);
            }
            this.f24797c++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    private void a(int i, float f2) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, (Object) "Initial capacity must be non-negative");
        m.a(true, (Object) "Illegal load factor");
        int a2 = af.a(i, 1.0d);
        this.f24799e = a(a2);
        this.f24796b = 1.0f;
        this.f24795a = new Object[i];
        this.entries = b(i);
        this.f24800f = Math.max(1, (int) (((float) a2) * 1.0f));
    }

    @CanIgnoreReturnValue
    public final boolean remove(Object obj, int i) {
        long j;
        int a2 = a() & i;
        int i2 = this.f24799e[a2];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (getHash(this.entries[i2]) != i || !j.a(obj, this.f24795a[i2])) {
                int a3 = a(this.entries[i2]);
                if (a3 == -1) {
                    return false;
                }
                int i4 = a3;
                i3 = i2;
                i2 = i4;
            } else {
                if (i3 == -1) {
                    this.f24799e[a2] = a(this.entries[i2]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = a(jArr[i3], a(this.entries[i2]));
                }
                int size = size() - 1;
                if (i2 < size) {
                    Object[] objArr = this.f24795a;
                    objArr[i2] = objArr[size];
                    this.f24795a[size] = null;
                    long j2 = this.entries[size];
                    this.entries[i2] = j2;
                    this.entries[size] = -1;
                    int hash = getHash(j2) & a();
                    int i5 = this.f24799e[hash];
                    if (i5 == size) {
                        this.f24799e[hash] = i2;
                    } else {
                        while (true) {
                            j = this.entries[i5];
                            int a4 = a(j);
                            if (a4 == size) {
                                break;
                            }
                            i5 = a4;
                        }
                        this.entries[i5] = a(j, i2);
                    }
                } else {
                    this.f24795a[i2] = null;
                    this.entries[i2] = -1;
                }
                this.f24798d--;
                this.f24797c++;
                return true;
            }
        }
    }
}
