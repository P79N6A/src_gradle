package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, PrimitiveNonBoxingCollection, RandomAccess {
    private static final IntArrayList EMPTY_LIST;
    private int[] array;
    private int size;

    public static IntArrayList emptyList() {
        return EMPTY_LIST;
    }

    public final int size() {
        return this.size;
    }

    static {
        IntArrayList intArrayList = new IntArrayList();
        EMPTY_LIST = intArrayList;
        intArrayList.makeImmutable();
    }

    IntArrayList() {
        this(new int[10], 0);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    public final void addInt(int i) {
        addInt(this.size, i);
    }

    public final int getInt(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    public final Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        return "Index:" + i + ", Size:" + this.size;
    }

    public final Internal.IntList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new IntArrayList(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Integer remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int i2 = this.array[i];
        System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
        this.size--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        if (intArrayList.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size >= intArrayList.size) {
            int i = this.size + intArrayList.size;
            if (i > this.array.length) {
                this.array = Arrays.copyOf(this.array, i);
            }
            System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
            this.size = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.array[i]))) {
                System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private IntArrayList(int[] iArr, int i) {
        this.array = iArr;
        this.size = i;
    }

    public final void add(int i, Integer num) {
        addInt(i, num.intValue());
    }

    public final Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    public final int setInt(int i, int i2) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int i3 = this.array[i];
        this.array[i] = i2;
        return i3;
    }

    private void addInt(int i, int i2) {
        ensureIsMutable();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        if (this.size < this.array.length) {
            int[] iArr = this.array;
            System.arraycopy(iArr, i, iArr, i + 1, this.size - i);
        } else {
            int[] iArr2 = new int[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.array, 0, iArr2, 0, i);
            System.arraycopy(this.array, i, iArr2, i + 1, this.size - i);
            this.array = iArr2;
        }
        this.array[i] = i2;
        this.size++;
        this.modCount++;
    }
}
