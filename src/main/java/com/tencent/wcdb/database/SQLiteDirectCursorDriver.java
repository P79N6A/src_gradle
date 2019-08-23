package com.tencent.wcdb.database;

import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;

public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private static SQLiteDatabase.CursorFactory DEFAULT_FACTORY = SQLiteCursor.FACTORY;
    private final CancellationSignal mCancellationSignal;
    private final SQLiteDatabase mDatabase;
    private final String mEditTable;
    private SQLiteProgram mQuery;
    private final String mSql;

    public final void cursorClosed() {
    }

    public final void cursorDeactivated() {
    }

    public final void cursorRequeried(Cursor cursor) {
    }

    public final String toString() {
        return "SQLiteDirectCursorDriver: " + this.mSql;
    }

    public final void setBindArguments(String[] strArr) {
        this.mQuery.bindAllArgsAsStrings(strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.wcdb.Cursor query(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory r5, java.lang.Object[] r6) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0004
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r5 = DEFAULT_FACTORY
        L_0x0004:
            r0 = 0
            com.tencent.wcdb.database.SQLiteDatabase r1 = r4.mDatabase     // Catch:{ RuntimeException -> 0x001d }
            java.lang.String r2 = r4.mSql     // Catch:{ RuntimeException -> 0x001d }
            com.tencent.wcdb.support.CancellationSignal r3 = r4.mCancellationSignal     // Catch:{ RuntimeException -> 0x001d }
            com.tencent.wcdb.database.SQLiteProgram r6 = r5.newQuery(r1, r2, r6, r3)     // Catch:{ RuntimeException -> 0x001d }
            com.tencent.wcdb.database.SQLiteDatabase r0 = r4.mDatabase     // Catch:{ RuntimeException -> 0x001a }
            java.lang.String r1 = r4.mEditTable     // Catch:{ RuntimeException -> 0x001a }
            com.tencent.wcdb.Cursor r5 = r5.newCursor(r0, r4, r1, r6)     // Catch:{ RuntimeException -> 0x001a }
            r4.mQuery = r6
            return r5
        L_0x001a:
            r5 = move-exception
            r0 = r6
            goto L_0x001e
        L_0x001d:
            r5 = move-exception
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.close()
        L_0x0023:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDirectCursorDriver.query(com.tencent.wcdb.database.SQLiteDatabase$CursorFactory, java.lang.Object[]):com.tencent.wcdb.Cursor");
    }

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
        this.mCancellationSignal = cancellationSignal;
    }
}
