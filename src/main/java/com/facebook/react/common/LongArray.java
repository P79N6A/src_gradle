package com.facebook.react.common;

public class LongArray {
    private long[] mArray;
    private int mLength;

    public int size() {
        return this.mLength;
    }

    public boolean isEmpty() {
        if (this.mLength == 0) {
            return true;
        }
        return false;
    }

    private void growArrayIfNeeded() {
        if (this.mLength == this.mArray.length) {
            double d2 = (double) this.mLength;
            Double.isNaN(d2);
            long[] jArr = new long[Math.max(this.mLength + 1, (int) (d2 * 1.8d))];
            System.arraycopy(this.mArray, 0, jArr, 0, this.mLength);
            this.mArray = jArr;
        }
    }

    private LongArray(int i) {
        this.mArray = new long[i];
    }

    public static LongArray createWithInitialCapacity(int i) {
        return new LongArray(i);
    }

    public void add(long j) {
        growArrayIfNeeded();
        long[] jArr = this.mArray;
        int i = this.mLength;
        this.mLength = i + 1;
        jArr[i] = j;
    }

    public void dropTail(int i) {
        if (i <= this.mLength) {
            this.mLength -= i;
            return;
        }
        throw new IndexOutOfBoundsException("Trying to drop " + i + " items from array of length " + this.mLength);
    }

    public long get(int i) {
        if (i < this.mLength) {
            return this.mArray[i];
        }
        throw new IndexOutOfBoundsException(i + " >= " + this.mLength);
    }

    public void set(int i, long j) {
        if (i < this.mLength) {
            this.mArray[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException(i + " >= " + this.mLength);
    }
}
