package com.google.common.collect;

import com.google.common.a.j;
import com.google.common.a.m;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
public class n<K, V> extends AbstractMap<K, V> implements Serializable {
    @MonotonicNonNullDecl
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    transient long[] f24776a;
    @MonotonicNonNullDecl
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    transient Object[] f24777b;
    @MonotonicNonNullDecl
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    transient Object[] f24778c;

    /* renamed from: d  reason: collision with root package name */
    transient float f24779d;

    /* renamed from: e  reason: collision with root package name */
    transient int f24780e;
    @MonotonicNonNullDecl

    /* renamed from: f  reason: collision with root package name */
    private transient int[] f24781f;
    private transient int g;
    @MonotonicNonNullDecl
    private transient Set<K> h;
    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> i;
    @MonotonicNonNullDecl
    private transient Collection<V> j;
    public transient int size;

    class a extends AbstractSet<Map.Entry<K, V>> {
        public final void clear() {
            n.this.clear();
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new b<Map.Entry<K, V>>() {
                /* access modifiers changed from: package-private */
                public final /* synthetic */ Object a(int i) {
                    return new d(i);
                }
            };
        }

        public final int size() {
            return n.this.size;
        }

        a() {
        }

        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int indexOf = n.this.indexOf(entry.getKey());
            if (indexOf == -1 || !j.a(n.this.f24778c[indexOf], entry.getValue())) {
                return false;
            }
            return true;
        }

        public final boolean remove(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int indexOf = n.this.indexOf(entry.getKey());
                if (indexOf != -1 && j.a(n.this.f24778c[indexOf], entry.getValue())) {
                    n.this.removeEntry(indexOf);
                    return true;
                }
            }
            return false;
        }
    }

    abstract class b<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        int f24786b;

        /* renamed from: c  reason: collision with root package name */
        int f24787c;

        /* renamed from: d  reason: collision with root package name */
        int f24788d;

        /* access modifiers changed from: package-private */
        public abstract T a(int i);

        public boolean hasNext() {
            if (this.f24787c >= 0) {
                return true;
            }
            return false;
        }

        private void a() {
            if (n.this.f24780e != this.f24786b) {
                throw new ConcurrentModificationException();
            }
        }

        public T next() {
            a();
            if (hasNext()) {
                this.f24788d = this.f24787c;
                T a2 = a(this.f24787c);
                this.f24787c = n.this.d(this.f24787c);
                return a2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            a();
            if (this.f24788d >= 0) {
                z = true;
            } else {
                z = false;
            }
            l.a(z);
            this.f24786b++;
            n.this.removeEntry(this.f24788d);
            this.f24787c = n.this.a(this.f24787c, this.f24788d);
            this.f24788d = -1;
        }

        private b() {
            this.f24786b = n.this.f24780e;
            this.f24787c = n.this.a();
            this.f24788d = -1;
        }

        /* synthetic */ b(n nVar, byte b2) {
            this();
        }
    }

    class c extends AbstractSet<K> {
        public final void clear() {
            n.this.clear();
        }

        public final Iterator<K> iterator() {
            return new b<K>() {
                /* access modifiers changed from: package-private */
                public final K a(int i) {
                    return n.this.f24777b[i];
                }
            };
        }

        public final int size() {
            return n.this.size;
        }

        c() {
        }

        public final boolean contains(Object obj) {
            return n.this.containsKey(obj);
        }

        public final boolean remove(@NullableDecl Object obj) {
            int indexOf = n.this.indexOf(obj);
            if (indexOf == -1) {
                return false;
            }
            n.this.removeEntry(indexOf);
            return true;
        }
    }

    final class d extends f<K, V> {
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        private final K f24792b;

        /* renamed from: c  reason: collision with root package name */
        private int f24793c;

        public final K getKey() {
            return this.f24792b;
        }

        public final V getValue() {
            a();
            if (this.f24793c == -1) {
                return null;
            }
            return n.this.f24778c[this.f24793c];
        }

        private void a() {
            if (this.f24793c == -1 || this.f24793c >= n.this.size() || !j.a(this.f24792b, n.this.f24777b[this.f24793c])) {
                this.f24793c = n.this.indexOf(this.f24792b);
            }
        }

        public final V setValue(V v) {
            a();
            if (this.f24793c == -1) {
                n.this.put(this.f24792b, v);
                return null;
            }
            V v2 = n.this.f24778c[this.f24793c];
            n.this.f24778c[this.f24793c] = v;
            return v2;
        }

        d(int i) {
            this.f24792b = n.this.f24777b[i];
            this.f24793c = i;
        }
    }

    class e extends AbstractCollection<V> {
        public final void clear() {
            n.this.clear();
        }

        public final Iterator<V> iterator() {
            return new b<V>() {
                /* access modifiers changed from: package-private */
                public final V a(int i) {
                    return n.this.f24778c[i];
                }
            };
        }

        public final int size() {
            return n.this.size;
        }

        e() {
        }
    }

    private static int a(long j2) {
        return (int) (j2 >>> 32);
    }

    private static long a(long j2, int i2) {
        return (j2 & -4294967296L) | (((long) i2) & 4294967295L);
    }

    private static int b(long j2) {
        return (int) j2;
    }

    /* access modifiers changed from: package-private */
    public int a(int i2, int i3) {
        return i2 - 1;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
    }

    public int size() {
        return this.size;
    }

    private int b() {
        return this.f24781f.length - 1;
    }

    public static <K, V> n<K, V> create() {
        return new n<>();
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    n() {
        a(3, 1.0f);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.i != null) {
            return this.i;
        }
        a aVar = new a();
        this.i = aVar;
        return aVar;
    }

    public Set<K> keySet() {
        if (this.h != null) {
            return this.h;
        }
        c cVar = new c();
        this.h = cVar;
        return cVar;
    }

    public Collection<V> values() {
        if (this.j != null) {
            return this.j;
        }
        e eVar = new e();
        this.j = eVar;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public void clear() {
        this.f24780e++;
        Arrays.fill(this.f24777b, 0, this.size, null);
        Arrays.fill(this.f24778c, 0, this.size, null);
        Arrays.fill(this.f24781f, -1);
        Arrays.fill(this.f24776a, -1);
        this.size = 0;
    }

    public void trimToSize() {
        int i2 = this.size;
        if (i2 < this.f24776a.length) {
            b(i2);
        }
        int max = Math.max(1, Integer.highestOneBit((int) (((float) i2) / this.f24779d)));
        if (max < 1073741824) {
            double d2 = (double) i2;
            double d3 = (double) max;
            Double.isNaN(d2);
            Double.isNaN(d3);
            if (d2 / d3 > ((double) this.f24779d)) {
                max <<= 1;
            }
        }
        if (max < this.f24781f.length) {
            f(max);
        }
    }

    private n(int i2) {
        this(i2, 1.0f);
    }

    public static <K, V> n<K, V> createWithExpectedSize(int i2) {
        return new n<>(i2);
    }

    private static int[] e(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int d(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.size) {
            return i3;
        }
        return -1;
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        return a(obj, af.a(obj));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size);
        for (int i2 = 0; i2 < this.size; i2++) {
            objectOutputStream.writeObject(this.f24777b[i2]);
            objectOutputStream.writeObject(this.f24778c[i2]);
        }
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (int i2 = 0; i2 < this.size; i2++) {
            if (j.a(obj, this.f24778c[i2])) {
                return true;
            }
        }
        return false;
    }

    public V get(@NullableDecl Object obj) {
        int indexOf = indexOf(obj);
        a(indexOf);
        if (indexOf == -1) {
            return null;
        }
        return this.f24778c[indexOf];
    }

    @CanIgnoreReturnValue
    public V removeEntry(int i2) {
        return a(this.f24777b[i2], a(this.f24776a[i2]));
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.f24777b = Arrays.copyOf(this.f24777b, i2);
        this.f24778c = Arrays.copyOf(this.f24778c, i2);
        long[] jArr = this.f24776a;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1);
        }
        this.f24776a = copyOf;
    }

    public int indexOf(@NullableDecl Object obj) {
        int a2 = af.a(obj);
        int i2 = this.f24781f[b() & a2];
        while (i2 != -1) {
            long j2 = this.f24776a[i2];
            if (a(j2) == a2 && j.a(obj, this.f24777b[i2])) {
                return i2;
            }
            i2 = b(j2);
        }
        return -1;
    }

    private void f(int i2) {
        if (this.f24781f.length >= 1073741824) {
            this.g = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (((float) i2) * this.f24779d)) + 1;
        int[] e2 = e(i2);
        long[] jArr = this.f24776a;
        int length = e2.length - 1;
        for (int i4 = 0; i4 < this.size; i4++) {
            int a2 = a(jArr[i4]);
            int i5 = a2 & length;
            int i6 = e2[i5];
            e2[i5] = i4;
            jArr[i4] = (((long) a2) << 32) | (4294967295L & ((long) i6));
        }
        this.g = i3;
        this.f24781f = e2;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        int size2 = size() - 1;
        if (i2 < size2) {
            Object[] objArr = this.f24777b;
            objArr[i2] = objArr[size2];
            Object[] objArr2 = this.f24778c;
            objArr2[i2] = objArr2[size2];
            this.f24777b[size2] = null;
            this.f24778c[size2] = null;
            long j2 = this.f24776a[size2];
            this.f24776a[i2] = j2;
            this.f24776a[size2] = -1;
            int a2 = a(j2) & b();
            int i3 = this.f24781f[a2];
            if (i3 == size2) {
                this.f24781f[a2] = i2;
            } else {
                while (true) {
                    long j3 = this.f24776a[i3];
                    int b2 = b(j3);
                    if (b2 == size2) {
                        this.f24776a[i3] = a(j3, i2);
                        return;
                    }
                    i3 = b2;
                }
            }
        } else {
            this.f24777b[i2] = null;
            this.f24778c[i2] = null;
            this.f24776a[i2] = -1;
        }
    }

    n(int i2, float f2) {
        a(i2, f2);
    }

    @NullableDecl
    private V a(@NullableDecl Object obj, int i2) {
        int b2 = b() & i2;
        int i3 = this.f24781f[b2];
        if (i3 == -1) {
            return null;
        }
        int i4 = -1;
        while (true) {
            if (a(this.f24776a[i3]) != i2 || !j.a(obj, this.f24777b[i3])) {
                int b3 = b(this.f24776a[i3]);
                if (b3 == -1) {
                    return null;
                }
                int i5 = b3;
                i4 = i3;
                i3 = i5;
            } else {
                V v = this.f24778c[i3];
                if (i4 == -1) {
                    this.f24781f[b2] = b(this.f24776a[i3]);
                } else {
                    long[] jArr = this.f24776a;
                    jArr[i4] = a(jArr[i4], b(this.f24776a[i3]));
                }
                c(i3);
                this.size--;
                this.f24780e++;
                return v;
            }
        }
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.f24776a;
        Object[] objArr = this.f24777b;
        V[] vArr = this.f24778c;
        int a2 = af.a((Object) k);
        int b2 = b() & a2;
        int i2 = this.size;
        int i3 = this.f24781f[b2];
        if (i3 == -1) {
            this.f24781f[b2] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (a(j2) != a2 || !j.a(k, objArr[i3])) {
                    int b3 = b(j2);
                    if (b3 == -1) {
                        jArr[i3] = a(j2, i2);
                        break;
                    }
                    i3 = b3;
                } else {
                    V v2 = vArr[i3];
                    vArr[i3] = v;
                    a(i3);
                    return v2;
                }
            }
        }
        int i4 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            int length = this.f24776a.length;
            if (i5 > length) {
                int max = Math.max(1, length >>> 1) + length;
                if (max >= 0) {
                    i4 = max;
                }
                if (i4 != length) {
                    b(i4);
                }
            }
            a(i2, k, v, a2);
            this.size = i5;
            if (i2 >= this.g) {
                f(this.f24781f.length * 2);
            }
            this.f24780e++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float f2) {
        boolean z;
        boolean z2 = false;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, (Object) "Initial capacity must be non-negative");
        if (f2 > 0.0f) {
            z2 = true;
        }
        m.a(z2, (Object) "Illegal load factor");
        int a2 = af.a(i2, (double) f2);
        this.f24781f = e(a2);
        this.f24779d = f2;
        this.f24777b = new Object[i2];
        this.f24778c = new Object[i2];
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1);
        this.f24776a = jArr;
        this.g = Math.max(1, (int) (((float) a2) * f2));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, @NullableDecl K k, @NullableDecl V v, int i3) {
        this.f24776a[i2] = (((long) i3) << 32) | 4294967295L;
        this.f24777b[i2] = k;
        this.f24778c[i2] = v;
    }
}
