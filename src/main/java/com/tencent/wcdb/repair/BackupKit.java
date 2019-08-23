package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.Arrays;

public class BackupKit implements CancellationSignal.OnCancelListener {
    private SQLiteDatabase mDB;
    private String mLastError;
    private long mNativePtr;
    private int mStatementCount;
    private String[] mTableDesc;

    private static native void nativeCancel(long j);

    private static native void nativeFinish(long j);

    private static native long nativeInit(String str, byte[] bArr, int i);

    private static native String nativeLastError(long j);

    private static native int nativeRun(long j, long j2, String[] strArr);

    private static native int nativeStatementCount(long j);

    public String lastError() {
        return this.mLastError;
    }

    public int statementCount() {
        return this.mStatementCount;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public void onCancel() {
        if (this.mNativePtr != 0) {
            nativeCancel(this.mNativePtr);
        }
    }

    public void release() {
        if (this.mNativePtr != 0) {
            nativeFinish(this.mNativePtr);
            this.mNativePtr = 0;
        }
    }

    public int run() {
        if (this.mNativePtr != 0) {
            long acquireNativeConnectionHandle = this.mDB.acquireNativeConnectionHandle("backup", false, false);
            int nativeRun = nativeRun(this.mNativePtr, acquireNativeConnectionHandle, this.mTableDesc);
            this.mDB.releaseNativeConnection(acquireNativeConnectionHandle, null);
            this.mStatementCount = nativeStatementCount(this.mNativePtr);
            this.mLastError = nativeLastError(this.mNativePtr);
            nativeFinish(this.mNativePtr);
            this.mNativePtr = 0;
            return nativeRun;
        }
        throw new IllegalStateException("BackupKit not initialized.");
    }

    public int run(CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int run = run();
        cancellationSignal.setOnCancelListener(null);
        return run;
    }

    public BackupKit(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr, int i, String[] strArr) throws SQLiteException {
        String[] strArr2;
        this.mDB = sQLiteDatabase;
        if (strArr != null) {
            strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        } else {
            strArr2 = null;
        }
        this.mTableDesc = strArr2;
        if (str != null) {
            this.mNativePtr = nativeInit(str, bArr, i);
            if (this.mNativePtr == 0) {
                throw new SQLiteException("Failed initialize backup context.");
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
