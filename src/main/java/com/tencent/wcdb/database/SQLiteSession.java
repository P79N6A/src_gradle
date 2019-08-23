package com.tencent.wcdb.database;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.Process;
import android.util.Pair;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.support.CancellationSignal;

public final class SQLiteSession {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final SQLiteConnectionPool mConnectionPool;
    private int mConnectionUseCount;
    private Transaction mTransactionPool;
    private Transaction mTransactionStack;

    static final class Transaction {
        public boolean mChildFailed;
        public SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public Transaction mParent;

        private Transaction() {
        }
    }

    public final boolean hasConnection() {
        if (this.mConnection != null) {
            return true;
        }
        return false;
    }

    public final boolean hasTransaction() {
        if (this.mTransactionStack != null) {
            return true;
        }
        return false;
    }

    private void throwIfNestedTransaction() {
        if (hasNestedTransaction()) {
            throw new IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    private void throwIfNoTransaction() {
        if (this.mTransactionStack == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    public final boolean hasNestedTransaction() {
        if (this.mTransactionStack == null || this.mTransactionStack.mParent == null) {
            return false;
        }
        return true;
    }

    public final void setTransactionSuccessful() {
        throwIfNoTransaction();
        throwIfTransactionMarkedSuccessful();
        this.mTransactionStack.mMarkedSuccessful = true;
    }

    private void releaseConnection() {
        int i = this.mConnectionUseCount - 1;
        this.mConnectionUseCount = i;
        if (i == 0) {
            try {
                this.mConnection.setAcquisitionState(null, 0);
                this.mConnectionPool.releaseConnection(this.mConnection);
            } finally {
                this.mConnection = null;
            }
        }
    }

    private void throwIfTransactionMarkedSuccessful() {
        if (this.mTransactionStack != null && this.mTransactionStack.mMarkedSuccessful) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    /* access modifiers changed from: package-private */
    public final SQLiteConnection acquireConnectionForNativeHandle(int i) {
        acquireConnection(null, i, null);
        return this.mConnection;
    }

    public final void endTransaction(CancellationSignal cancellationSignal) {
        throwIfNoTransaction();
        endTransactionUnchecked(cancellationSignal, false);
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool != null) {
            this.mConnectionPool = sQLiteConnectionPool;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    private void recycleTransaction(Transaction transaction) {
        transaction.mParent = this.mTransactionPool;
        transaction.mListener = null;
        this.mTransactionPool = transaction;
    }

    /* access modifiers changed from: package-private */
    public final void releaseConnectionForNativeHandle(Exception exc) {
        if (this.mConnection != null) {
            this.mConnection.endNativeHandle(exc);
        }
        releaseConnection();
    }

    /* access modifiers changed from: package-private */
    public final void releasePreparedStatement(SQLiteConnection.PreparedStatement preparedStatement) {
        if (this.mConnection != null) {
            this.mConnection.releasePreparedStatement(preparedStatement);
            releaseConnection();
        }
    }

    /* access modifiers changed from: package-private */
    public final SQLiteConnection.PreparedStatement acquirePreparedStatement(String str, int i) {
        acquireConnection(str, i, null);
        return this.mConnection.acquirePreparedStatement(str);
    }

    private Transaction obtainTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        Transaction transaction = this.mTransactionPool;
        if (transaction != null) {
            this.mTransactionPool = transaction.mParent;
            transaction.mParent = null;
            transaction.mMarkedSuccessful = false;
            transaction.mChildFailed = false;
        } else {
            transaction = new Transaction();
        }
        transaction.mMode = i;
        transaction.mListener = sQLiteTransactionListener;
        return transaction;
    }

    public final Pair<Integer, Integer> walCheckpoint(String str, int i) {
        acquireConnection(null, i, null);
        try {
            return this.mConnection.walCheckpoint(str);
        } finally {
            releaseConnection();
        }
    }

    private boolean yieldTransactionUnchecked(long j, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags)) {
            return false;
        }
        int i = this.mTransactionStack.mMode;
        SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionStack.mListener;
        int i2 = this.mConnectionFlags;
        endTransactionUnchecked(cancellationSignal, true);
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
            }
        }
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
        return true;
    }

    private void endTransactionUnchecked(CancellationSignal cancellationSignal, boolean z) {
        boolean z2;
        RuntimeException runtimeException;
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.mTransactionStack;
        if ((transaction.mMarkedSuccessful || z) && !transaction.mChildFailed) {
            z2 = true;
        } else {
            z2 = false;
        }
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        if (sQLiteTransactionListener != null) {
            if (z2) {
                try {
                    sQLiteTransactionListener.onCommit();
                } catch (RuntimeException e2) {
                    runtimeException = e2;
                    z2 = false;
                }
            } else {
                sQLiteTransactionListener.onRollback();
            }
        }
        runtimeException = null;
        this.mTransactionStack = transaction.mParent;
        recycleTransaction(transaction);
        if (this.mTransactionStack != null) {
            if (!z2) {
                this.mTransactionStack.mChildFailed = true;
            }
        } else if (z2) {
            try {
                this.mConnection.execute("COMMIT;", null, cancellationSignal);
            } finally {
                releaseConnection();
            }
        } else {
            this.mConnection.execute("ROLLBACK;", null, cancellationSignal);
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    private void acquireConnection(String str, int i, CancellationSignal cancellationSignal) {
        if (this.mConnection == null) {
            this.mConnection = this.mConnectionPool.acquireConnection(str, i, cancellationSignal);
            this.mConnectionFlags = i;
            this.mConnection.setAcquisitionState(Thread.currentThread(), Process.myTid());
        }
        this.mConnectionUseCount++;
    }

    public final boolean yieldTransaction(long j, boolean z, CancellationSignal cancellationSignal) {
        if (z) {
            throwIfNoTransaction();
            throwIfTransactionMarkedSuccessful();
            throwIfNestedTransaction();
        } else if (this.mTransactionStack == null || this.mTransactionStack.mMarkedSuccessful || this.mTransactionStack.mParent != null) {
            return false;
        }
        if (this.mTransactionStack.mChildFailed) {
            return false;
        }
        return yieldTransactionUnchecked(j, cancellationSignal);
    }

    public final void beginTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) {
        throwIfTransactionMarkedSuccessful();
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
    }

    public final void prepare(String str, int i, CancellationSignal cancellationSignal, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str != null) {
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            acquireConnection(str, i, cancellationSignal);
            try {
                this.mConnection.prepare(str, sQLiteStatementInfo);
            } finally {
                releaseConnection();
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    private boolean executeSpecial(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        switch (DatabaseUtils.getSqlStatementType(str)) {
            case 4:
                beginTransaction(2, null, i, cancellationSignal);
                return true;
            case 5:
                setTransactionSuccessful();
                endTransaction(cancellationSignal);
                return true;
            case 6:
                endTransaction(cancellationSignal);
                return true;
            default:
                return false;
        }
    }

    public final void execute(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (!executeSpecial(str, objArr, i, cancellationSignal)) {
            acquireConnection(str, i, cancellationSignal);
            try {
                this.mConnection.execute(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public final int executeForChangedRowCount(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0;
        } else {
            acquireConnection(str, i, cancellationSignal);
            try {
                return this.mConnection.executeForChangedRowCount(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public final long executeForLastInsertedRowId(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0;
        } else {
            acquireConnection(str, i, cancellationSignal);
            try {
                return this.mConnection.executeForLastInsertedRowId(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public final long executeForLong(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0;
        } else {
            acquireConnection(str, i, cancellationSignal);
            try {
                return this.mConnection.executeForLong(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public final String executeForString(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return null;
        } else {
            acquireConnection(str, i, cancellationSignal);
            try {
                return this.mConnection.executeForString(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    private void beginTransactionUnchecked(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.mTransactionStack == null) {
            acquireConnection(null, i2, cancellationSignal);
        }
        try {
            if (this.mTransactionStack == null) {
                switch (i) {
                    case 1:
                        this.mConnection.execute("BEGIN IMMEDIATE;", null, cancellationSignal);
                        break;
                    case 2:
                        this.mConnection.execute("BEGIN EXCLUSIVE;", null, cancellationSignal);
                        break;
                    default:
                        this.mConnection.execute("BEGIN;", null, cancellationSignal);
                        break;
                }
            }
            if (sQLiteTransactionListener != null) {
                sQLiteTransactionListener.onBegin();
            }
            Transaction obtainTransaction = obtainTransaction(i, sQLiteTransactionListener);
            obtainTransaction.mParent = this.mTransactionStack;
            this.mTransactionStack = obtainTransaction;
            if (this.mTransactionStack == null) {
                releaseConnection();
            }
        } catch (RuntimeException e2) {
            if (this.mTransactionStack == null) {
                this.mConnection.execute("ROLLBACK;", null, cancellationSignal);
            }
            throw e2;
        } catch (Throwable th) {
            if (this.mTransactionStack == null) {
                releaseConnection();
            }
            throw th;
        }
    }

    public final int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, CancellationSignal cancellationSignal) {
        int i4 = i3;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (cursorWindow != null) {
            Object[] objArr2 = objArr;
            if (executeSpecial(str, objArr, i4, cancellationSignal2)) {
                cursorWindow.clear();
                return 0;
            }
            acquireConnection(str, i4, cancellationSignal2);
            try {
                return this.mConnection.executeForCursorWindow(str, objArr, cursorWindow, i, i2, z, cancellationSignal);
            } finally {
                releaseConnection();
            }
        } else {
            throw new IllegalArgumentException("window must not be null.");
        }
    }
}
