package android.support.v4.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class LongSparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private long[] mKeys;
    private int mSize;
    private Object[] mValues;

    public LongSparseArray() {
        this(10);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public void clear() {
        int i = this.mSize;
        Object[] objArr = this.mValues;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    private void gc() {
        int i = this.mSize;
        long[] jArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    public LongSparseArray<E> clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.mKeys = (long[]) this.mKeys.clone();
            longSparseArray.mValues = (Object[]) this.mValues.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i));
            sb.append('=');
            Object valueAt = valueAt(i);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void remove(long j) {
        delete(j);
    }

    @Nullable
    public E get(long j) {
        return get(j, null);
    }

    public boolean containsKey(long j) {
        if (indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(E e2) {
        if (indexOfValue(e2) >= 0) {
            return true;
        }
        return false;
    }

    public int indexOfKey(long j) {
        if (this.mGarbage) {
            gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
    }

    public long keyAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i];
    }

    public E valueAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mValues[i];
    }

    public LongSparseArray(int i) {
        if (i == 0) {
            this.mKeys = ContainerHelpers.EMPTY_LONGS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int idealLongArraySize = ContainerHelpers.idealLongArraySize(i);
            this.mKeys = new long[idealLongArraySize];
            this.mValues = new Object[idealLongArraySize];
        }
        this.mSize = 0;
    }

    public void delete(long j) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        if (binarySearch >= 0 && this.mValues[binarySearch] != DELETED) {
            this.mValues[binarySearch] = DELETED;
            this.mGarbage = true;
        }
    }

    public int indexOfValue(E e2) {
        if (this.mGarbage) {
            gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public void putAll(@NonNull LongSparseArray<? extends E> longSparseArray) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            put(longSparseArray.keyAt(i), longSparseArray.valueAt(i));
        }
    }

    public void removeAt(int i) {
        if (this.mValues[i] != DELETED) {
            this.mValues[i] = DELETED;
            this.mGarbage = true;
        }
    }

    public void setValueAt(int i, E e2) {
        if (this.mGarbage) {
            gc();
        }
        this.mValues[i] = e2;
    }

    public E get(long j, E e2) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        if (binarySearch < 0 || this.mValues[binarySearch] == DELETED) {
            return e2;
        }
        return this.mValues[binarySearch];
    }

    public void append(long j, E e2) {
        if (this.mSize == 0 || j > this.mKeys[this.mSize - 1]) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                gc();
            }
            int i = this.mSize;
            if (i >= this.mKeys.length) {
                int idealLongArraySize = ContainerHelpers.idealLongArraySize(i + 1);
                long[] jArr = new long[idealLongArraySize];
                Object[] objArr = new Object[idealLongArraySize];
                System.arraycopy(this.mKeys, 0, jArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = jArr;
                this.mValues = objArr;
            }
            this.mKeys[i] = j;
            this.mValues[i] = e2;
            this.mSize = i + 1;
            return;
        }
        put(j, e2);
    }

    public void put(long j, E e2) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e2;
            return;
        }
        int i = binarySearch ^ -1;
        if (i >= this.mSize || this.mValues[i] != DELETED) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                gc();
                i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j) ^ -1;
            }
            if (this.mSize >= this.mKeys.length) {
                int idealLongArraySize = ContainerHelpers.idealLongArraySize(this.mSize + 1);
                long[] jArr = new long[idealLongArraySize];
                Object[] objArr = new Object[idealLongArraySize];
                System.arraycopy(this.mKeys, 0, jArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = jArr;
                this.mValues = objArr;
            }
            if (this.mSize - i != 0) {
                long[] jArr2 = this.mKeys;
                int i2 = i + 1;
                System.arraycopy(jArr2, i, jArr2, i2, this.mSize - i);
                Object[] objArr2 = this.mValues;
                System.arraycopy(objArr2, i, objArr2, i2, this.mSize - i);
            }
            this.mKeys[i] = j;
            this.mValues[i] = e2;
            this.mSize++;
            return;
        }
        this.mKeys[i] = j;
        this.mValues[i] = e2;
    }
}
