package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

public class SQLiteDirectQuery extends SQLiteProgram {
    private static final int[] SQLITE_TYPE_MAPPING = {3, 1, 2, 3, 4, 0};
    private final CancellationSignal mCancellationSignal;

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native int nativeStep(long j, int i);

    /* access modifiers changed from: protected */
    public void onAllReferencesReleased() {
        synchronized (this) {
            if (this.mPreparedStatement != null) {
                this.mPreparedStatement.detachCancellationSignal(this.mCancellationSignal);
                this.mPreparedStatement.endOperation(null);
            }
        }
        super.onAllReferencesReleased();
    }

    public byte[] getBlob(int i) {
        return nativeGetBlob(this.mPreparedStatement.getPtr(), i);
    }

    public double getDouble(int i) {
        return nativeGetDouble(this.mPreparedStatement.getPtr(), i);
    }

    public long getLong(int i) {
        return nativeGetLong(this.mPreparedStatement.getPtr(), i);
    }

    public String getString(int i) {
        return nativeGetString(this.mPreparedStatement.getPtr(), i);
    }

    public int getType(int i) {
        return SQLITE_TYPE_MAPPING[nativeGetType(this.mPreparedStatement.getPtr(), i)];
    }

    public synchronized void reset(boolean z) {
        if (this.mPreparedStatement != null) {
            this.mPreparedStatement.reset(false);
            if (z) {
                this.mPreparedStatement.detachCancellationSignal(this.mCancellationSignal);
                this.mPreparedStatement.endOperation(null);
                releasePreparedStatement();
            }
        }
    }

    public int step(int i) {
        try {
            if (acquirePreparedStatement()) {
                this.mPreparedStatement.beginOperation("directQuery", getBindArgs());
                this.mPreparedStatement.attachCancellationSignal(this.mCancellationSignal);
            }
            return nativeStep(this.mPreparedStatement.getPtr(), i);
        } catch (RuntimeException e2) {
            if (e2 instanceof SQLiteException) {
                Log.e("WCDB.SQLiteDirectQuery", "Got exception on stepping: " + e2.getMessage() + ", SQL: " + getSql());
                checkCorruption((SQLiteException) e2);
            }
            if (this.mPreparedStatement != null) {
                this.mPreparedStatement.detachCancellationSignal(this.mCancellationSignal);
                this.mPreparedStatement.failOperation(e2);
            }
            releasePreparedStatement();
            throw e2;
        }
    }

    public SQLiteDirectQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }
}
