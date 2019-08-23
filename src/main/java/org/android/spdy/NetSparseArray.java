package org.android.spdy;

public class NetSparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public NetSparseArray() {
        this(10);
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
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    public void remove(int i) {
        delete(i);
    }

    public E get(int i) {
        return get(i, null);
    }

    public NetSparseArray(int i) {
        this.mKeys = new int[i];
        this.mValues = new Object[i];
    }

    public int keyAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i];
    }

    public void toArray(E[] eArr) {
        for (int i = 0; i < eArr.length; i++) {
            eArr[i] = this.mValues[i];
        }
    }

    public E valueAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mValues[i];
    }

    public void delete(int i) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i);
        if (binarySearch >= 0 && this.mValues[binarySearch] != DELETED) {
            this.mValues[binarySearch] = DELETED;
            this.mGarbage = true;
        }
    }

    public int indexOfKey(int i) {
        if (this.mGarbage) {
            gc();
        }
        return binarySearch(this.mKeys, 0, this.mSize, i);
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

    public E get(int i, E e2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i);
        if (binarySearch < 0 || this.mValues[binarySearch] == DELETED) {
            return e2;
        }
        return this.mValues[binarySearch];
    }

    public void append(int i, E e2) {
        if (this.mSize == 0 || i > this.mKeys[this.mSize - 1]) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                gc();
            }
            int i2 = this.mSize;
            if (i2 >= this.mKeys.length) {
                int i3 = i2 + 1;
                int[] iArr = new int[i3];
                Object[] objArr = new Object[i3];
                System.arraycopy(this.mKeys, 0, iArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = iArr;
                this.mValues = objArr;
            }
            this.mKeys[i2] = i;
            this.mValues[i2] = e2;
            this.mSize = i2 + 1;
            return;
        }
        put(i, e2);
    }

    public void put(int i, E e2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e2;
            return;
        }
        int i2 = binarySearch ^ -1;
        if (i2 >= this.mSize || this.mValues[i2] != DELETED) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                gc();
                i2 = binarySearch(this.mKeys, 0, this.mSize, i) ^ -1;
            }
            if (this.mSize >= this.mKeys.length) {
                int i3 = this.mSize + 20;
                int[] iArr = new int[i3];
                Object[] objArr = new Object[i3];
                System.arraycopy(this.mKeys, 0, iArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = iArr;
                this.mValues = objArr;
            }
            if (this.mSize - i2 != 0) {
                int[] iArr2 = this.mKeys;
                int i4 = i2 + 1;
                System.arraycopy(iArr2, i2, iArr2, i4, this.mSize - i2);
                Object[] objArr2 = this.mValues;
                System.arraycopy(objArr2, i2, objArr2, i4, this.mSize - i2);
            }
            this.mKeys[i2] = i;
            this.mValues[i2] = e2;
            this.mSize++;
            return;
        }
        this.mKeys[i2] = i;
        this.mValues[i2] = e2;
    }

    private static int binarySearch(int[] iArr, int i, int i2, int i3) {
        int i4 = i2 + i;
        int i5 = i - 1;
        int i6 = i4;
        while (i6 - i5 > 1) {
            int i7 = (i6 + i5) / 2;
            if (iArr[i7] < i3) {
                i5 = i7;
            } else {
                i6 = i7;
            }
        }
        if (i6 == i4) {
            return i4 ^ -1;
        }
        if (iArr[i6] == i3) {
            return i6;
        }
        return i6 ^ -1;
    }
}
