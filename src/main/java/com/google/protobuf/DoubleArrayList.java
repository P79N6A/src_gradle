package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, PrimitiveNonBoxingCollection, RandomAccess {
    private static final DoubleArrayList EMPTY_LIST;
    private double[] array;
    private int size;

    public static DoubleArrayList emptyList() {
        return EMPTY_LIST;
    }

    public final int size() {
        return this.size;
    }

    static {
        DoubleArrayList doubleArrayList = new DoubleArrayList();
        EMPTY_LIST = doubleArrayList;
        doubleArrayList.makeImmutable();
    }

    DoubleArrayList() {
        this(new double[10], 0);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i2]));
        }
        return i;
    }

    public final void addDouble(double d2) {
        addDouble(this.size, d2);
    }

    public final double getDouble(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    public final Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        return "Index:" + i + ", Size:" + this.size;
    }

    public final Internal.DoubleList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new DoubleArrayList(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Double remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double d2 = this.array[i];
        System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
        this.size--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        if (doubleArrayList.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size >= doubleArrayList.size) {
            int i = this.size + doubleArrayList.size;
            if (i > this.array.length) {
                this.array = Arrays.copyOf(this.array, i);
            }
            System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
            this.size = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.array[i]))) {
                System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private DoubleArrayList(double[] dArr, int i) {
        this.array = dArr;
        this.size = i;
    }

    public final void add(int i, Double d2) {
        addDouble(i, d2.doubleValue());
    }

    public final Double set(int i, Double d2) {
        return Double.valueOf(setDouble(i, d2.doubleValue()));
    }

    public final double setDouble(int i, double d2) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double d3 = this.array[i];
        this.array[i] = d2;
        return d3;
    }

    private void addDouble(int i, double d2) {
        ensureIsMutable();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        if (this.size < this.array.length) {
            double[] dArr = this.array;
            System.arraycopy(dArr, i, dArr, i + 1, this.size - i);
        } else {
            double[] dArr2 = new double[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.array, 0, dArr2, 0, i);
            System.arraycopy(this.array, i, dArr2, i + 1, this.size - i);
            this.array = dArr2;
        }
        this.array[i] = d2;
        this.size++;
        this.modCount++;
    }
}
