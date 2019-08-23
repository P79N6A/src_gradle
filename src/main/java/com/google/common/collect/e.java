package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.bg;
import com.google.common.collect.bh;
import com.google.common.f.a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class e<E> extends h<E> implements Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    transient bm<E> f24756a;

    /* renamed from: b  reason: collision with root package name */
    transient long f24757b;

    public final int size() {
        return a.a(this.f24757b);
    }

    public final Iterator<E> iterator() {
        return new bh.e(this, entrySet().iterator());
    }

    public final void clear() {
        bm<E> bmVar = this.f24756a;
        bmVar.f24679d++;
        Arrays.fill(bmVar.f24676a, 0, bmVar.f24678c, null);
        Arrays.fill(bmVar.f24677b, 0, bmVar.f24678c, 0);
        Arrays.fill(bmVar.f24680e, -1);
        Arrays.fill(bmVar.f24681f, -1);
        bmVar.f24678c = 0;
        this.f24757b = 0;
    }

    public final int count(@NullableDecl Object obj) {
        return this.f24756a.b(obj);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(entrySet().size());
        for (bg.a aVar : entrySet()) {
            objectOutputStream.writeObject(aVar.getElement());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }

    @CanIgnoreReturnValue
    public final int setCount(@NullableDecl E e2, int i) {
        int i2;
        l.a(i, "count");
        if (i == 0) {
            i2 = this.f24756a.b(e2, af.a((Object) e2));
        } else {
            i2 = this.f24756a.a(e2, i);
        }
        this.f24757b += (long) (i - i2);
        return i2;
    }

    @CanIgnoreReturnValue
    public final int remove(@NullableDecl Object obj, int i) {
        boolean z;
        if (i == 0) {
            return count(obj);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, "occurrences cannot be negative: %s", i);
        int a2 = this.f24756a.a(obj);
        if (a2 == -1) {
            return 0;
        }
        int c2 = this.f24756a.c(a2);
        if (c2 > i) {
            this.f24756a.a(a2, c2 - i);
        } else {
            this.f24756a.f(a2);
            i = c2;
        }
        this.f24757b -= (long) i;
        return c2;
    }

    @CanIgnoreReturnValue
    public final int add(@NullableDecl E e2, int i) {
        boolean z;
        boolean z2;
        if (i == 0) {
            return count(e2);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, "occurrences cannot be negative: %s", i);
        int a2 = this.f24756a.a((Object) e2);
        if (a2 == -1) {
            this.f24756a.a(e2, i);
            this.f24757b += (long) i;
            return 0;
        }
        int c2 = this.f24756a.c(a2);
        long j = (long) i;
        long j2 = ((long) c2) + j;
        if (j2 <= 2147483647L) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f24756a.a(a2, (int) j2);
            this.f24757b += j;
            return c2;
        }
        throw new IllegalArgumentException(m.a("too many occurrences: %s", Long.valueOf(j2)));
    }

    public final boolean setCount(@NullableDecl E e2, int i, int i2) {
        l.a(i, "oldCount");
        l.a(i2, "newCount");
        int a2 = this.f24756a.a((Object) e2);
        if (a2 == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.f24756a.a(e2, i2);
                this.f24757b += (long) i2;
            }
            return true;
        } else if (this.f24756a.c(a2) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.f24756a.f(a2);
                this.f24757b -= (long) i;
            } else {
                this.f24756a.a(a2, i2);
                this.f24757b += (long) (i2 - i);
            }
            return true;
        }
    }
}
