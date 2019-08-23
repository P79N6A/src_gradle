package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;

public class RecoverKit implements CancellationSignal.OnCancelListener {
    private SQLiteDatabase mDB;
    private int mFailedCount;
    private String mLastError;
    private long mNativePtr;
    private int mSuccessCount;

    private static native void nativeCancel(long j);

    private static native int nativeFailureCount(long j);

    private static native void nativeFinish(long j);

    private static native long nativeInit(String str, byte[] bArr);

    private static native String nativeLastError(long j);

    private static native int nativeRun(long j, long j2, boolean z);

    private static native int nativeSuccessCount(long j);

    public int failureCount() {
        return this.mFailedCount;
    }

    public String lastError() {
        return this.mLastError;
    }

    public int successCount() {
        return this.mSuccessCount;
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

    public int run(boolean z) {
        if (this.mNativePtr != 0) {
            long acquireNativeConnectionHandle = this.mDB.acquireNativeConnectionHandle("recover", false, false);
            int nativeRun = nativeRun(this.mNativePtr, acquireNativeConnectionHandle, z);
            this.mDB.releaseNativeConnection(acquireNativeConnectionHandle, null);
            this.mSuccessCount = nativeSuccessCount(this.mNativePtr);
            this.mFailedCount = nativeFailureCount(this.mNativePtr);
            this.mLastError = nativeLastError(this.mNativePtr);
            nativeFinish(this.mNativePtr);
            this.mNativePtr = 0;
            return nativeRun;
        }
        throw new IllegalStateException("RecoverKit not initialized.");
    }

    public int run(boolean z, CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int run = run(z);
        cancellationSignal.setOnCancelListener(null);
        return run;
    }

    public RecoverKit(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) throws SQLiteException {
        this.mDB = sQLiteDatabase;
        this.mNativePtr = nativeInit(str, bArr);
        if (this.mNativePtr == 0) {
            throw new SQLiteException("Failed initialize recover context.");
        }
    }
}
