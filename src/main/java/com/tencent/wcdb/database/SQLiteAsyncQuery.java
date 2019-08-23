package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

public class SQLiteAsyncQuery extends SQLiteProgram {
    private final int mResultColumns = getColumnNames().length;

    private static native int nativeCount(long j);

    private static native int nativeFillRows(long j, long j2, int i, int i2);

    /* access modifiers changed from: package-private */
    public void release() {
        releasePreparedStatement();
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        if (this.mPreparedStatement != null) {
            this.mPreparedStatement.reset(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void acquire() {
        if (this.mPreparedStatement == null) {
            acquirePreparedStatement();
            this.mPreparedStatement.bindArguments(getBindArgs());
        }
    }

    /* access modifiers changed from: package-private */
    public int getCount() {
        acquire();
        try {
            return nativeCount(this.mPreparedStatement.getPtr());
        } catch (SQLiteException e2) {
            Log.e("WCDB.SQLiteAsyncQuery", "Got exception on getCount: " + e2.getMessage() + ", SQL: " + getSql());
            checkCorruption(e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public int fillRows(ChunkedCursorWindow chunkedCursorWindow, int i, int i2) {
        acquire();
        if (chunkedCursorWindow.getNumColumns() != this.mResultColumns) {
            chunkedCursorWindow.setNumColumns(this.mResultColumns);
        }
        try {
            return nativeFillRows(this.mPreparedStatement.getPtr(), chunkedCursorWindow.mWindowPtr, i, i2);
        } catch (SQLiteException e2) {
            Log.e("WCDB.SQLiteAsyncQuery", "Got exception on fillRows: " + e2.getMessage() + ", SQL: " + getSql());
            checkCorruption(e2);
            throw e2;
        }
    }

    public SQLiteAsyncQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
    }
}
