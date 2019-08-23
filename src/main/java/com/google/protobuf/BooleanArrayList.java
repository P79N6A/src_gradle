package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, PrimitiveNonBoxingCollection, RandomAccess {
    private static final BooleanArrayList EMPTY_LIST;
    private boolean[] array;
    private int size;

    public static BooleanArrayList emptyList() {
        return EMPTY_LIST;
    }

    public final int size() {
        return this.size;
    }

    static {
        BooleanArrayList booleanArrayList = new BooleanArrayList();
        EMPTY_LIST = booleanArrayList;
        booleanArrayList.makeImmutable();
    }

    BooleanArrayList() {
        this(new boolean[10], 0);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Internal.hashBoolean(this.array[i2]);
        }
        return i;
    }

    public final void addBoolean(boolean z) {
        addBoolean(this.size, z);
    }

    public final boolean getBoolean(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    public final Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        return "Index:" + i + ", Size:" + this.size;
    }

    public final Internal.BooleanList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new BooleanArrayList(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Boolean remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean z = this.array[i];
        System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
        this.size--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        if (booleanArrayList.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size >= booleanArrayList.size) {
            int i = this.size + booleanArrayList.size;
            if (i > this.array.length) {
                this.array = Arrays.copyOf(this.array, i);
            }
            System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
            this.size = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Boolean.valueOf(this.array[i]))) {
                System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private BooleanArrayList(boolean[] zArr, int i) {
        this.array = zArr;
        this.size = i;
    }

    public final void add(int i, Boolean bool) {
        addBoolean(i, bool.booleanValue());
    }

    public final Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(setBoolean(i, bool.booleanValue()));
    }

    public final boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean z2 = this.array[i];
        this.array[i] = z;
        return z2;
    }

    private void addBoolean(int i, boolean z) {
        ensureIsMutable();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        if (this.size < this.array.length) {
            boolean[] zArr = this.array;
            System.arraycopy(zArr, i, zArr, i + 1, this.size - i);
        } else {
            boolean[] zArr2 = new boolean[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.array, 0, zArr2, 0, i);
            System.arraycopy(this.array, i, zArr2, i + 1, this.size - i);
            this.array = zArr2;
        }
        this.array[i] = z;
        this.size++;
        this.modCount++;
    }
}
