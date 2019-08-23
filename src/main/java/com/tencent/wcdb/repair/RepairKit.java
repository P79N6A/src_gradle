package com.tencent.wcdb.repair;

import android.database.Cursor;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;

public class RepairKit implements CancellationSignal.OnCancelListener {
    private Callback mCallback;
    private RepairCursor mCurrentCursor;
    private int mIntegrityFlags;
    private MasterInfo mMasterInfo;
    private long mNativePtr;

    public interface Callback {
        int onProgress(String str, int i, Cursor cursor);
    }

    public static class MasterInfo {
        public byte[] mKDFSalt;
        public long mMasterPtr;

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            release();
            super.finalize();
        }

        public void release() {
            if (this.mMasterPtr != 0) {
                RepairKit.nativeFreeMaster(this.mMasterPtr);
                this.mMasterPtr = 0;
            }
        }

        public static MasterInfo make(String[] strArr) {
            long nativeMakeMaster = RepairKit.nativeMakeMaster(strArr);
            if (nativeMakeMaster != 0) {
                return new MasterInfo(nativeMakeMaster, null);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }

        private MasterInfo(long j, byte[] bArr) {
            this.mMasterPtr = j;
            this.mKDFSalt = bArr;
        }

        public static boolean save(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) {
            long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("backupMaster", true, false);
            boolean nativeSaveMaster = RepairKit.nativeSaveMaster(acquireNativeConnectionHandle, str, bArr);
            sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, null);
            return nativeSaveMaster;
        }

        public static MasterInfo load(String str, byte[] bArr, String[] strArr) {
            if (str == null) {
                return make(strArr);
            }
            byte[] bArr2 = new byte[16];
            long nativeLoadMaster = RepairKit.nativeLoadMaster(str, bArr, strArr, bArr2);
            if (nativeLoadMaster != 0) {
                return new MasterInfo(nativeLoadMaster, bArr2);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }
    }

    static class RepairCursor extends AbstractCursor {
        long mPtr;

        private static native byte[] nativeGetBlob(long j, int i);

        private static native int nativeGetColumnCount(long j);

        private static native double nativeGetDouble(long j, int i);

        private static native long nativeGetLong(long j, int i);

        private static native String nativeGetString(long j, int i);

        private static native int nativeGetType(long j, int i);

        private RepairCursor() {
        }

        public int getColumnCount() {
            return nativeGetColumnCount(this.mPtr);
        }

        public String[] getColumnNames() {
            throw new UnsupportedOperationException();
        }

        public int getCount() {
            throw new UnsupportedOperationException();
        }

        public byte[] getBlob(int i) {
            return nativeGetBlob(this.mPtr, i);
        }

        public double getDouble(int i) {
            return nativeGetDouble(this.mPtr, i);
        }

        public float getFloat(int i) {
            return (float) getDouble(i);
        }

        public int getInt(int i) {
            return (int) getLong(i);
        }

        public long getLong(int i) {
            return nativeGetLong(this.mPtr, i);
        }

        public short getShort(int i) {
            return (short) ((int) getLong(i));
        }

        public String getString(int i) {
            return nativeGetString(this.mPtr, i);
        }

        public int getType(int i) {
            return nativeGetType(this.mPtr, i);
        }

        public boolean isNull(int i) {
            if (getType(i) == 0) {
                return true;
            }
            return false;
        }
    }

    private static native void nativeCancel(long j);

    private static native void nativeFini(long j);

    public static native void nativeFreeMaster(long j);

    private static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    private static native int nativeIntegrityFlags(long j);

    private static native String nativeLastError();

    public static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    public static native long nativeMakeMaster(String[] strArr);

    private native int nativeOutput(long j, long j2, long j3, int i);

    public static native boolean nativeSaveMaster(long j, String str, byte[] bArr);

    public Callback getCallback() {
        return this.mCallback;
    }

    public static String lastError() {
        return nativeLastError();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public boolean isDataCorrupted() {
        if ((this.mIntegrityFlags & 2) == 0) {
            return true;
        }
        return false;
    }

    public boolean isHeaderCorrupted() {
        if ((this.mIntegrityFlags & 1) == 0) {
            return true;
        }
        return false;
    }

    public boolean isSaltCorrupted() {
        if ((this.mIntegrityFlags & 4) == 0) {
            return true;
        }
        return false;
    }

    public void onCancel() {
        if (this.mNativePtr != 0) {
            nativeCancel(this.mNativePtr);
        }
    }

    public void release() {
        if (this.mMasterInfo != null) {
            this.mMasterInfo.release();
            this.mMasterInfo = null;
        }
        if (this.mNativePtr != 0) {
            nativeFini(this.mNativePtr);
            this.mNativePtr = 0;
        }
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public int output(SQLiteDatabase sQLiteDatabase, int i) {
        long j = 0;
        if (this.mNativePtr != 0) {
            if (this.mMasterInfo != null) {
                j = this.mMasterInfo.mMasterPtr;
            }
            long j2 = j;
            long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("repair", false, false);
            int nativeOutput = nativeOutput(this.mNativePtr, acquireNativeConnectionHandle, j2, i);
            sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, null);
            this.mCurrentCursor = null;
            this.mIntegrityFlags = nativeIntegrityFlags(this.mNativePtr);
            return nativeOutput;
        }
        throw new IllegalArgumentException();
    }

    private int onProgress(String str, int i, long j) {
        if (this.mCallback == null) {
            return 0;
        }
        if (this.mCurrentCursor == null) {
            this.mCurrentCursor = new RepairCursor();
        }
        this.mCurrentCursor.mPtr = j;
        return this.mCallback.onProgress(str, i, this.mCurrentCursor);
    }

    public int output(SQLiteDatabase sQLiteDatabase, int i, CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int output = output(sQLiteDatabase, i);
        cancellationSignal.setOnCancelListener(null);
        return output;
    }

    public RepairKit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, MasterInfo masterInfo) {
        byte[] bArr2;
        if (str != null) {
            if (masterInfo == null) {
                bArr2 = null;
            } else {
                bArr2 = masterInfo.mKDFSalt;
            }
            this.mNativePtr = nativeInit(str, bArr, sQLiteCipherSpec, bArr2);
            if (this.mNativePtr != 0) {
                this.mIntegrityFlags = nativeIntegrityFlags(this.mNativePtr);
                this.mMasterInfo = masterInfo;
                return;
            }
            throw new SQLiteException("Failed initialize RepairKit.");
        }
        throw new IllegalArgumentException();
    }
}
