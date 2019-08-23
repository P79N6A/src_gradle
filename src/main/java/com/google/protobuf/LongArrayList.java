package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, PrimitiveNonBoxingCollection, RandomAccess {
    private static final LongArrayList EMPTY_LIST;
    private long[] array;
    private int size;

    public static LongArrayList emptyList() {
        return EMPTY_LIST;
    }

    public final int size() {
        return this.size;
    }

    static {
        LongArrayList longArrayList = new LongArrayList();
        EMPTY_LIST = longArrayList;
        longArrayList.makeImmutable();
    }

    LongArrayList() {
        this(new long[10], 0);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Internal.hashLong(this.array[i2]);
        }
        return i;
    }

    public final void addLong(long j) {
        addLong(this.size, j);
    }

    public final long getLong(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    public final Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        return "Index:" + i + ", Size:" + this.size;
    }

    public final Internal.LongList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Long remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long j = this.array[i];
        System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        if (longArrayList.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size >= longArrayList.size) {
            int i = this.size + longArrayList.size;
            if (i > this.array.length) {
                this.array = Arrays.copyOf(this.array, i);
            }
            System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
            this.size = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.array[i]))) {
                System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private LongArrayList(long[] jArr, int i) {
        this.array = jArr;
        this.size = i;
    }

    public final void add(int i, Long l) {
        addLong(i, l.longValue());
    }

    public final Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    public final long setLong(int i, long j) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long j2 = this.array[i];
        this.array[i] = j;
        return j2;
    }

    private void addLong(int i, long j) {
        ensureIsMutable();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        if (this.size < this.array.length) {
            long[] jArr = this.array;
            System.arraycopy(jArr, i, jArr, i + 1, this.size - i);
        } else {
            long[] jArr2 = new long[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.array, 0, jArr2, 0, i);
            System.arraycopy(this.array, i, jArr2, i + 1, this.size - i);
            this.array = jArr2;
        }
        this.array[i] = j;
        this.size++;
        this.modCount++;
    }
}
