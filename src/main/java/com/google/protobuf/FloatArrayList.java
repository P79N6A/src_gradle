package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, PrimitiveNonBoxingCollection, RandomAccess {
    private static final FloatArrayList EMPTY_LIST;
    private float[] array;
    private int size;

    public static FloatArrayList emptyList() {
        return EMPTY_LIST;
    }

    public final int size() {
        return this.size;
    }

    static {
        FloatArrayList floatArrayList = new FloatArrayList();
        EMPTY_LIST = floatArrayList;
        floatArrayList.makeImmutable();
    }

    FloatArrayList() {
        this(new float[10], 0);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.array[i2]);
        }
        return i;
    }

    public final void addFloat(float f2) {
        addFloat(this.size, f2);
    }

    public final float getFloat(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    public final Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        return "Index:" + i + ", Size:" + this.size;
    }

    public final Internal.FloatList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new FloatArrayList(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Float remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float f2 = this.array[i];
        System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
        this.size--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        if (floatArrayList.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size >= floatArrayList.size) {
            int i = this.size + floatArrayList.size;
            if (i > this.array.length) {
                this.array = Arrays.copyOf(this.array, i);
            }
            System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
            this.size = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.array[i]))) {
                System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private FloatArrayList(float[] fArr, int i) {
        this.array = fArr;
        this.size = i;
    }

    public final void add(int i, Float f2) {
        addFloat(i, f2.floatValue());
    }

    public final Float set(int i, Float f2) {
        return Float.valueOf(setFloat(i, f2.floatValue()));
    }

    public final float setFloat(int i, float f2) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float f3 = this.array[i];
        this.array[i] = f2;
        return f3;
    }

    private void addFloat(int i, float f2) {
        ensureIsMutable();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
        if (this.size < this.array.length) {
            float[] fArr = this.array;
            System.arraycopy(fArr, i, fArr, i + 1, this.size - i);
        } else {
            float[] fArr2 = new float[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.array, 0, fArr2, 0, i);
            System.arraycopy(this.array, i, fArr2, i + 1, this.size - i);
            this.array = fArr2;
        }
        this.array[i] = f2;
        this.size++;
        this.modCount++;
    }
}
