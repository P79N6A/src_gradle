package com.tencent.wcdb.database;

import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.Arrays;

public abstract class SQLiteProgram extends SQLiteClosable {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private final Object[] mBindArgs;
    private SQLiteSession mBoundSession;
    private final String[] mColumnNames;
    private final SQLiteDatabase mDatabase;
    private final int mNumParameters;
    protected SQLiteConnection.PreparedStatement mPreparedStatement;
    private final boolean mReadOnly;
    private final String mSql;

    @Deprecated
    public final int getUniqueId() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public final Object[] getBindArgs() {
        return this.mBindArgs;
    }

    public final String[] getColumnNames() {
        return this.mColumnNames;
    }

    public final SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    /* access modifiers changed from: protected */
    public final String getSql() {
        return this.mSql;
    }

    /* access modifiers changed from: protected */
    public final SQLiteSession getSession() {
        return this.mDatabase.getThreadSession();
    }

    /* access modifiers changed from: protected */
    public void onAllReferencesReleased() {
        releasePreparedStatement();
        clearBindings();
    }

    public void clearBindings() {
        if (this.mBindArgs != null) {
            Arrays.fill(this.mBindArgs, null);
        }
    }

    /* access modifiers changed from: protected */
    public final int getConnectionFlags() {
        return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        synchronized (this) {
            if (this.mBoundSession != null || this.mPreparedStatement != null) {
                throw new SQLiteMisuseException("Acquired prepared statement is not released.");
            }
        }
        super.finalize();
    }

    /* access modifiers changed from: protected */
    public synchronized boolean acquirePreparedStatement() {
        SQLiteSession threadSession = this.mDatabase.getThreadSession();
        if (threadSession == this.mBoundSession) {
            return false;
        }
        if (this.mBoundSession == null) {
            this.mBoundSession = threadSession;
            this.mPreparedStatement = threadSession.acquirePreparedStatement(this.mSql, this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly));
            this.mPreparedStatement.bindArguments(this.mBindArgs);
            return true;
        }
        throw new IllegalStateException("SQLiteProgram has bound to another thread.");
    }

    /* access modifiers changed from: protected */
    public synchronized void releasePreparedStatement() {
        if (this.mBoundSession != null || this.mPreparedStatement != null) {
            if (this.mBoundSession == null || this.mPreparedStatement == null) {
                throw new IllegalStateException("Internal state error.");
            } else if (this.mBoundSession == this.mDatabase.getThreadSession()) {
                this.mBoundSession.releasePreparedStatement(this.mPreparedStatement);
                this.mPreparedStatement = null;
                this.mBoundSession = null;
            } else {
                throw new IllegalStateException("SQLiteProgram has bound to another thread.");
            }
        }
    }

    public void bindNull(int i) {
        bind(i, null);
    }

    public void bindAllArgsAsStrings(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                bindString(length, strArr[length - 1]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void checkCorruption(SQLiteException sQLiteException) {
        boolean z = true;
        if (!(sQLiteException instanceof SQLiteDatabaseCorruptException) && (!(sQLiteException instanceof SQLiteFullException) || !this.mReadOnly)) {
            z = false;
        }
        if (z) {
            SQLiteDebug.collectLastIOTraceStats(this.mDatabase);
            this.mDatabase.onCorruption();
        }
    }

    public void bindDouble(int i, double d2) {
        bind(i, Double.valueOf(d2));
    }

    public void bindLong(int i, long j) {
        bind(i, Long.valueOf(j));
    }

    public void bindBlob(int i, byte[] bArr) {
        if (bArr != null) {
            bind(i, bArr);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i + " is null");
    }

    public void bindString(int i, String str) {
        if (str != null) {
            bind(i, str);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i + " is null");
    }

    private void bind(int i, Object obj) {
        if (i <= 0 || i > this.mNumParameters) {
            throw new IllegalArgumentException("Cannot bind argument at index " + i + " because the index is out of range.  The statement has " + this.mNumParameters + " parameters.");
        }
        this.mBindArgs[i - 1] = obj;
    }

    protected SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        this.mSql = str.trim();
        int sqlStatementType = DatabaseUtils.getSqlStatementType(this.mSql);
        switch (sqlStatementType) {
            case 4:
            case 5:
            case 6:
                this.mReadOnly = false;
                this.mColumnNames = EMPTY_STRING_ARRAY;
                this.mNumParameters = 0;
                break;
            default:
                boolean z = sqlStatementType != 1 ? false : true;
                SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
                sQLiteDatabase.getThreadSession().prepare(this.mSql, sQLiteDatabase.getThreadDefaultConnectionFlags(z), cancellationSignal, sQLiteStatementInfo);
                this.mReadOnly = sQLiteStatementInfo.readOnly;
                this.mColumnNames = sQLiteStatementInfo.columnNames;
                this.mNumParameters = sQLiteStatementInfo.numParameters;
                break;
        }
        if (objArr == null || objArr.length <= this.mNumParameters) {
            if (this.mNumParameters != 0) {
                this.mBindArgs = new Object[this.mNumParameters];
                if (objArr != null) {
                    System.arraycopy(objArr, 0, this.mBindArgs, 0, objArr.length);
                }
            } else {
                this.mBindArgs = null;
            }
            this.mPreparedStatement = null;
            this.mBoundSession = null;
            return;
        }
        throw new IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + this.mNumParameters + " arguments.");
    }
}
