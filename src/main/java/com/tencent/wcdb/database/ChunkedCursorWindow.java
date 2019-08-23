package com.tencent.wcdb.database;

import com.tencent.wcdb.CursorWindowAllocationException;

public class ChunkedCursorWindow extends SQLiteClosable {
    private int mNumColumns;
    long mWindowPtr;

    private static native void nativeClear(long j);

    private static native long nativeCreate(int i);

    private static native void nativeDispose(long j);

    private static native void nativeEndRow(long j, long j2);

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native int nativeGetNumChunks(long j);

    private static native long nativeGetRow(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native long nativeRemoveChunk(long j, int i);

    private static native boolean nativeSetNumColumns(long j, int i);

    public int getNumColumns() {
        return this.mNumColumns;
    }

    /* access modifiers changed from: protected */
    public void onAllReferencesReleased() {
        dispose();
    }

    private void dispose() {
        if (this.mWindowPtr != 0) {
            nativeDispose(this.mWindowPtr);
            this.mWindowPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            dispose();
        } finally {
            super.finalize();
        }
    }

    public void clear() {
        acquireReference();
        try {
            nativeClear(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public int getNumChunks() {
        acquireReference();
        try {
            return nativeGetNumChunks(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    /* access modifiers changed from: package-private */
    public void endRowUnsafe(long j) {
        if (j != 0) {
            nativeEndRow(this.mWindowPtr, j);
            releaseReference();
        }
    }

    public ChunkedCursorWindow(int i) {
        this.mWindowPtr = nativeCreate(i);
        if (this.mWindowPtr == 0) {
            throw new CursorWindowAllocationException("Cursor window allocation failed.");
        }
    }

    /* access modifiers changed from: package-private */
    public long getRowUnsafe(int i) {
        acquireReference();
        long nativeGetRow = nativeGetRow(this.mWindowPtr, i);
        if (nativeGetRow == 0) {
            releaseReference();
        }
        return nativeGetRow;
    }

    public long removeChunk(int i) {
        acquireReference();
        try {
            return nativeRemoveChunk(this.mWindowPtr, i);
        } finally {
            releaseReference();
        }
    }

    public boolean setNumColumns(int i) {
        acquireReference();
        try {
            boolean nativeSetNumColumns = nativeSetNumColumns(this.mWindowPtr, i);
            if (nativeSetNumColumns) {
                this.mNumColumns = i;
            }
            return nativeSetNumColumns;
        } finally {
            releaseReference();
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] getBlobUnsafe(long j, int i) {
        return nativeGetBlob(j, i);
    }

    /* access modifiers changed from: package-private */
    public double getDoubleUnsafe(long j, int i) {
        return nativeGetDouble(j, i);
    }

    /* access modifiers changed from: package-private */
    public long getLongUnsafe(long j, int i) {
        return nativeGetLong(j, i);
    }

    /* access modifiers changed from: package-private */
    public String getStringUnsafe(long j, int i) {
        return nativeGetString(j, i);
    }

    /* access modifiers changed from: package-private */
    public int getTypeUnsafe(long j, int i) {
        return nativeGetType(j, i);
    }

    public byte[] getBlob(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe != 0) {
            try {
                return nativeGetBlob(rowUnsafe, i2);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        } else {
            throw new IllegalStateException("Couldn't read row " + i + ", column " + i2 + " from ChunkedCursorWindow.");
        }
    }

    public double getDouble(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe != 0) {
            try {
                return nativeGetDouble(rowUnsafe, i2);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        } else {
            throw new IllegalStateException("Couldn't read row " + i + ", column " + i2 + " from ChunkedCursorWindow.");
        }
    }

    public long getLong(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe != 0) {
            try {
                return nativeGetLong(rowUnsafe, i2);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        } else {
            throw new IllegalStateException("Couldn't read row " + i + ", column " + i2 + " from ChunkedCursorWindow.");
        }
    }

    public String getString(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe != 0) {
            try {
                return nativeGetString(rowUnsafe, i2);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        } else {
            throw new IllegalStateException("Couldn't read row " + i + ", column " + i2 + " from ChunkedCursorWindow.");
        }
    }

    public int getType(int i, int i2) {
        long rowUnsafe = getRowUnsafe(i);
        if (rowUnsafe != 0) {
            try {
                return nativeGetType(rowUnsafe, i2);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        } else {
            throw new IllegalStateException("Couldn't read row " + i + ", column " + i2 + " from ChunkedCursorWindow.");
        }
    }
}
