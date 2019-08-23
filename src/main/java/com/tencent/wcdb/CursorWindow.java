package com.tencent.wcdb;

import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.wcdb.database.SQLiteClosable;

public class CursorWindow extends SQLiteClosable implements Parcelable {
    public static final Parcelable.Creator<CursorWindow> CREATOR = new Parcelable.Creator<CursorWindow>() {
        public final CursorWindow[] newArray(int i) {
            return new CursorWindow[i];
        }

        public final CursorWindow createFromParcel(Parcel parcel) {
            return new CursorWindow(parcel);
        }
    };
    private static int sCursorWindowSize;
    private final String mName;
    private int mStartPos;
    public long mWindowPtr;

    private static native boolean nativeAllocRow(long j);

    private static native void nativeClear(long j);

    private static native void nativeCopyStringToBuffer(long j, int i, int i2, CharArrayBuffer charArrayBuffer);

    private static native long nativeCreate(String str, int i);

    private static native void nativeDispose(long j);

    private static native void nativeFreeLastRow(long j);

    private static native byte[] nativeGetBlob(long j, int i, int i2);

    private static native double nativeGetDouble(long j, int i, int i2);

    private static native long nativeGetLong(long j, int i, int i2);

    private static native int nativeGetNumRows(long j);

    private static native String nativeGetString(long j, int i, int i2);

    private static native int nativeGetType(long j, int i, int i2);

    private static native boolean nativePutBlob(long j, byte[] bArr, int i, int i2);

    private static native boolean nativePutDouble(long j, double d2, int i, int i2);

    private static native boolean nativePutLong(long j, long j2, int i, int i2);

    private static native boolean nativePutNull(long j, int i, int i2);

    private static native boolean nativePutString(long j, String str, int i, int i2);

    private static native boolean nativeSetNumColumns(long j, int i);

    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.mName;
    }

    public int getStartPosition() {
        return this.mStartPos;
    }

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

    public boolean allocRow() {
        acquireReference();
        try {
            return nativeAllocRow(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public void clear() {
        acquireReference();
        try {
            this.mStartPos = 0;
            nativeClear(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public void freeLastRow() {
        acquireReference();
        try {
            nativeFreeLastRow(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public int getNumRows() {
        acquireReference();
        try {
            return nativeGetNumRows(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    static {
        int identifier = Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", "android");
        if (identifier != 0) {
            sCursorWindowSize = Resources.getSystem().getInteger(identifier) * 1024;
        } else {
            sCursorWindowSize = 2097152;
        }
    }

    public String toString() {
        return getName() + " {" + Long.toHexString(this.mWindowPtr) + "}";
    }

    public void setStartPosition(int i) {
        this.mStartPos = i;
    }

    @Deprecated
    public CursorWindow(boolean z) {
        this((String) null);
    }

    public static int windowSize(int i) {
        int i2 = sCursorWindowSize;
        if (i > 0) {
            sCursorWindowSize = i;
        }
        return i2;
    }

    private CursorWindow(Parcel parcel) {
        throw new UnsupportedOperationException();
    }

    public static CursorWindow newFromParcel(Parcel parcel) {
        return CREATOR.createFromParcel(parcel);
    }

    public boolean setNumColumns(int i) {
        acquireReference();
        try {
            return nativeSetNumColumns(this.mWindowPtr, i);
        } finally {
            releaseReference();
        }
    }

    public CursorWindow(String str) {
        this.mName = (str == null || str.length() == 0) ? "<unnamed>" : "<unnamed>";
        this.mWindowPtr = nativeCreate(this.mName, sCursorWindowSize);
        if (this.mWindowPtr == 0) {
            throw new CursorWindowAllocationException("Cursor window allocation of " + (sCursorWindowSize / 1024) + " kb failed. ");
        }
    }

    public float getFloat(int i, int i2) {
        return (float) getDouble(i, i2);
    }

    public int getInt(int i, int i2) {
        return (int) getLong(i, i2);
    }

    public short getShort(int i, int i2) {
        return (short) ((int) getLong(i, i2));
    }

    public void writeToParcel(Parcel parcel, int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public boolean isBlob(int i, int i2) {
        int type = getType(i, i2);
        if (type == 4 || type == 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isFloat(int i, int i2) {
        if (getType(i, i2) == 2) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isLong(int i, int i2) {
        if (getType(i, i2) == 1) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isNull(int i, int i2) {
        if (getType(i, i2) == 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isString(int i, int i2) {
        int type = getType(i, i2);
        if (type == 3 || type == 0) {
            return true;
        }
        return false;
    }

    public byte[] getBlob(int i, int i2) {
        acquireReference();
        try {
            return nativeGetBlob(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public double getDouble(int i, int i2) {
        acquireReference();
        try {
            return nativeGetDouble(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public long getLong(int i, int i2) {
        acquireReference();
        try {
            return nativeGetLong(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public String getString(int i, int i2) {
        acquireReference();
        try {
            return nativeGetString(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public int getType(int i, int i2) {
        acquireReference();
        try {
            return nativeGetType(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public boolean putNull(int i, int i2) {
        acquireReference();
        try {
            return nativePutNull(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public void copyStringToBuffer(int i, int i2, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            acquireReference();
            try {
                nativeCopyStringToBuffer(this.mWindowPtr, i - this.mStartPos, i2, charArrayBuffer);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
    }

    public boolean putBlob(byte[] bArr, int i, int i2) {
        acquireReference();
        try {
            return nativePutBlob(this.mWindowPtr, bArr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public boolean putDouble(double d2, int i, int i2) {
        acquireReference();
        try {
            return nativePutDouble(this.mWindowPtr, d2, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public boolean putLong(long j, int i, int i2) {
        acquireReference();
        try {
            return nativePutLong(this.mWindowPtr, j, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public boolean putString(String str, int i, int i2) {
        acquireReference();
        try {
            return nativePutString(this.mWindowPtr, str, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }
}
