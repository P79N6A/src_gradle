package com.tencent.wcdb.database;

import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

public final class SQLiteQuery extends SQLiteProgram {
    private final CancellationSignal mCancellationSignal;

    public final String toString() {
        return "SQLiteQuery: " + getSql();
    }

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }

    /* access modifiers changed from: package-private */
    public final int fillWindow(CursorWindow cursorWindow, int i, int i2, boolean z) {
        acquireReference();
        try {
            cursorWindow.acquireReference();
            int executeForCursorWindow = getSession().executeForCursorWindow(getSql(), getBindArgs(), cursorWindow, i, i2, z, getConnectionFlags(), this.mCancellationSignal);
            cursorWindow.releaseReference();
            releaseReference();
            return executeForCursorWindow;
        } catch (SQLiteException e2) {
            Log.e("WCDB.SQLiteQuery", "exception: " + e2.getMessage() + "; query: " + getSql());
            checkCorruption(e2);
            throw e2;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }
}
