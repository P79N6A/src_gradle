package com.tencent.wcdb;

import java.util.Iterator;

public final class CursorJoiner implements Iterable<Result>, Iterator<Result> {
    private int[] mColumnsLeft;
    private int[] mColumnsRight;
    private Result mCompareResult;
    private boolean mCompareResultIsValid;
    private Cursor mCursorLeft;
    private Cursor mCursorRight;
    private String[] mValues;

    public enum Result {
        RIGHT,
        LEFT,
        BOTH
    }

    public final Iterator<Result> iterator() {
        return this;
    }

    public final void remove() {
        throw new UnsupportedOperationException("not implemented");
    }

    private void incrementCursors() {
        if (this.mCompareResultIsValid) {
            switch (this.mCompareResult) {
                case BOTH:
                    this.mCursorLeft.moveToNext();
                    this.mCursorRight.moveToNext();
                    break;
                case LEFT:
                    this.mCursorLeft.moveToNext();
                    break;
                case RIGHT:
                    this.mCursorRight.moveToNext();
                    break;
            }
            this.mCompareResultIsValid = false;
        }
    }

    public final boolean hasNext() {
        if (this.mCompareResultIsValid) {
            switch (this.mCompareResult) {
                case BOTH:
                    if (!this.mCursorLeft.isLast() || !this.mCursorRight.isLast()) {
                        return true;
                    }
                    return false;
                case LEFT:
                    if (!this.mCursorLeft.isLast() || !this.mCursorRight.isAfterLast()) {
                        return true;
                    }
                    return false;
                case RIGHT:
                    if (!this.mCursorLeft.isAfterLast() || !this.mCursorRight.isLast()) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalStateException("bad value for mCompareResult, " + this.mCompareResult);
            }
        } else if (!this.mCursorLeft.isAfterLast() || !this.mCursorRight.isAfterLast()) {
            return true;
        } else {
            return false;
        }
    }

    public final Result next() {
        if (hasNext()) {
            incrementCursors();
            boolean z = !this.mCursorLeft.isAfterLast();
            boolean z2 = !this.mCursorRight.isAfterLast();
            if (z && z2) {
                populateValues(this.mValues, this.mCursorLeft, this.mColumnsLeft, 0);
                populateValues(this.mValues, this.mCursorRight, this.mColumnsRight, 1);
                switch (compareStrings(this.mValues)) {
                    case -1:
                        this.mCompareResult = Result.LEFT;
                        break;
                    case 0:
                        this.mCompareResult = Result.BOTH;
                        break;
                    case 1:
                        this.mCompareResult = Result.RIGHT;
                        break;
                }
            } else if (z) {
                this.mCompareResult = Result.LEFT;
            } else {
                this.mCompareResult = Result.RIGHT;
            }
            this.mCompareResultIsValid = true;
            return this.mCompareResult;
        }
        throw new IllegalStateException("you must only call next() when hasNext() is true");
    }

    private static int compareStrings(String... strArr) {
        if (strArr.length % 2 == 0) {
            for (int i = 0; i < strArr.length; i += 2) {
                if (strArr[i] != null) {
                    int i2 = i + 1;
                    if (strArr[i2] == null) {
                        return 1;
                    }
                    int compareTo = strArr[i].compareTo(strArr[i2]);
                    if (compareTo != 0) {
                        if (compareTo < 0) {
                            return -1;
                        }
                        return 1;
                    }
                } else if (strArr[i + 1] != null) {
                    return -1;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("you must specify an even number of values");
    }

    private int[] buildColumnIndiciesArray(Cursor cursor, String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = cursor.getColumnIndexOrThrow(strArr[i]);
        }
        return iArr;
    }

    private static void populateValues(String[] strArr, Cursor cursor, int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            strArr[(i2 * 2) + i] = cursor.getString(iArr[i2]);
        }
    }

    public CursorJoiner(Cursor cursor, String[] strArr, Cursor cursor2, String[] strArr2) {
        if (strArr.length == strArr2.length) {
            this.mCursorLeft = cursor;
            this.mCursorRight = cursor2;
            this.mCursorLeft.moveToFirst();
            this.mCursorRight.moveToFirst();
            this.mCompareResultIsValid = false;
            this.mColumnsLeft = buildColumnIndiciesArray(cursor, strArr);
            this.mColumnsRight = buildColumnIndiciesArray(cursor2, strArr2);
            this.mValues = new String[(this.mColumnsLeft.length * 2)];
            return;
        }
        throw new IllegalArgumentException("you must have the same number of columns on the left and right, " + strArr.length + " != " + strArr2.length);
    }
}
