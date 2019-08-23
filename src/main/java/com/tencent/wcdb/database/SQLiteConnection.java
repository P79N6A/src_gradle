package com.tencent.wcdb.database;

import android.annotation.SuppressLint;
import android.util.Pair;
import android.util.Printer;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.LruCache;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;

public final class SQLiteConnection implements CancellationSignal.OnCancelListener {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final Pattern TRIM_SQL_PATTERN = Pattern.compile("[\\s]*\\n+[\\s]*");
    private Thread mAcquiredThread;
    public int mAcquiredTid;
    private int mCancellationSignalAttachCount;
    private SQLiteCipherSpec mCipher;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final int mConnectionId;
    private long mConnectionPtr;
    private final boolean mIsPrimaryConnection;
    private final boolean mIsReadOnlyConnection;
    private int mNativeHandleCount;
    private Operation mNativeOperation;
    private boolean mOnlyAllowReadOnlyOperations;
    private byte[] mPassword;
    public final SQLiteConnectionPool mPool;
    private final PreparedStatementCache mPreparedStatementCache;
    private PreparedStatement mPreparedStatementPool;
    public final OperationLog mRecentOperations = new OperationLog();

    @SuppressLint({"SimpleDateFormat"})
    static final class Operation {
        private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        public ArrayList<Object> mBindArgs;
        public int mCookie;
        public long mEndTime;
        public Exception mException;
        public boolean mFinished;
        public String mKind;
        public String mSql;
        public long mStartTime;
        public int mTid;
        public int mType;

        private Operation() {
        }

        public final String getFormattedStartTime() {
            return sDateFormat.format(new Date(this.mStartTime));
        }

        private String getStatus() {
            if (!this.mFinished) {
                return "running";
            }
            if (this.mException != null) {
                return "failed";
            }
            return "succeeded";
        }

        public final void describe(StringBuilder sb, boolean z) {
            sb.append(this.mKind);
            if (this.mFinished) {
                sb.append(" took ");
                sb.append(this.mEndTime - this.mStartTime);
                sb.append("ms");
            } else {
                sb.append(" started ");
                sb.append(System.currentTimeMillis() - this.mStartTime);
                sb.append("ms ago");
            }
            sb.append(" - ");
            sb.append(getStatus());
            if (this.mSql != null) {
                sb.append(", sql=\"");
                sb.append(SQLiteConnection.trimSqlForDisplay(this.mSql));
                sb.append("\"");
            }
            if (this.mTid > 0) {
                sb.append(", tid=");
                sb.append(this.mTid);
            }
            if (!(!z || this.mBindArgs == null || this.mBindArgs.size() == 0)) {
                sb.append(", bindArgs=[");
                int size = this.mBindArgs.size();
                for (int i = 0; i < size; i++) {
                    Object obj = this.mBindArgs.get(i);
                    if (i != 0) {
                        sb.append(", ");
                    }
                    if (obj == null) {
                        sb.append("null");
                    } else if (obj instanceof byte[]) {
                        sb.append("<byte[]>");
                    } else if (obj instanceof String) {
                        sb.append("\"");
                        sb.append((String) obj);
                        sb.append("\"");
                    } else {
                        sb.append(obj);
                    }
                }
                sb.append("]");
            }
            if (this.mException != null && this.mException.getMessage() != null) {
                sb.append(", exception=\"");
                sb.append(this.mException.getMessage());
                sb.append("\"");
            }
        }
    }

    final class OperationLog {
        private int mGeneration;
        private int mIndex;
        private final Operation[] mOperations;

        public final String describeCurrentOperation() {
            synchronized (this.mOperations) {
                Operation operation = this.mOperations[this.mIndex];
                if (operation == null || operation.mFinished) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                operation.describe(sb, false);
                String sb2 = sb.toString();
                return sb2;
            }
        }

        private OperationLog() {
            this.mOperations = new Operation[20];
        }

        private Operation getOperationLocked(int i) {
            Operation operation = this.mOperations[i & 255];
            if (operation.mCookie == i) {
                return operation;
            }
            return null;
        }

        private int newOperationCookieLocked(int i) {
            int i2 = this.mGeneration;
            this.mGeneration = i2 + 1;
            return i | (i2 << 8);
        }

        private boolean endOperationDeferLogLocked(Operation operation) {
            if (operation == null) {
                return false;
            }
            operation.mEndTime = System.currentTimeMillis();
            operation.mFinished = true;
            if (operation.mException == null || operation.mException.getMessage() == null) {
                return SQLiteDebug.shouldLogSlowQuery(operation.mEndTime - operation.mStartTime);
            }
            return true;
        }

        public final void endOperation(int i) {
            String str;
            String str2;
            int i2;
            long j;
            synchronized (this.mOperations) {
                Operation operationLocked = getOperationLocked(i);
                if (endOperationDeferLogLocked(operationLocked)) {
                    logOperationLocked(operationLocked, null);
                }
                str = operationLocked.mSql;
                str2 = operationLocked.mKind;
                i2 = operationLocked.mType;
                j = operationLocked.mEndTime - operationLocked.mStartTime;
            }
            if (!"prepare".equals(str2)) {
                SQLiteConnection.this.mPool.traceExecute(str, i2, j);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            if ("prepare".equals(r3) != false) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r9.this$0.mPool.traceExecute(r2, r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean endOperationDeferLog(int r10) {
            /*
                r9 = this;
                com.tencent.wcdb.database.SQLiteConnection$Operation[] r0 = r9.mOperations
                monitor-enter(r0)
                com.tencent.wcdb.database.SQLiteConnection$Operation r10 = r9.getOperationLocked(r10)     // Catch:{ all -> 0x002d }
                if (r10 != 0) goto L_0x000c
                r10 = 0
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return r10
            L_0x000c:
                boolean r1 = r9.endOperationDeferLogLocked(r10)     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r10.mSql     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r10.mKind     // Catch:{ all -> 0x002d }
                int r4 = r10.mType     // Catch:{ all -> 0x002d }
                long r5 = r10.mEndTime     // Catch:{ all -> 0x002d }
                long r7 = r10.mStartTime     // Catch:{ all -> 0x002d }
                r10 = 0
                long r5 = r5 - r7
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                java.lang.String r10 = "prepare"
                boolean r10 = r10.equals(r3)
                if (r10 != 0) goto L_0x002c
                com.tencent.wcdb.database.SQLiteConnection r10 = com.tencent.wcdb.database.SQLiteConnection.this
                com.tencent.wcdb.database.SQLiteConnectionPool r10 = r10.mPool
                r10.traceExecute(r2, r4, r5)
            L_0x002c:
                return r1
            L_0x002d:
                r10 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.OperationLog.endOperationDeferLog(int):boolean");
        }

        public final void failOperation(int i, Exception exc) {
            synchronized (this.mOperations) {
                Operation operationLocked = getOperationLocked(i);
                if (operationLocked != null) {
                    operationLocked.mException = exc;
                }
            }
        }

        private void logOperationLocked(Operation operation, String str) {
            StringBuilder sb = new StringBuilder();
            operation.describe(sb, false);
            if (str != null) {
                sb.append(", ");
                sb.append(str);
            }
            Log.i("WCDB.SQLiteConnection", sb.toString());
        }

        public final void logOperation(int i, String str) {
            synchronized (this.mOperations) {
                Operation operationLocked = getOperationLocked(i);
                if (operationLocked != null) {
                    logOperationLocked(operationLocked, str);
                }
            }
        }

        public final void dump(Printer printer, boolean z) {
            synchronized (this.mOperations) {
                printer.println("  Most recently executed operations:");
                int i = this.mIndex;
                Operation operation = this.mOperations[i];
                if (operation != null) {
                    int i2 = 0;
                    while (true) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("    ");
                        sb.append(i2);
                        sb.append(": [");
                        sb.append(operation.getFormattedStartTime());
                        sb.append("] ");
                        operation.describe(sb, z);
                        printer.println(sb.toString());
                        if (i > 0) {
                            i--;
                        } else {
                            i = 19;
                        }
                        i2++;
                        operation = this.mOperations[i];
                        if (operation != null) {
                            if (i2 >= 20) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    printer.println("    <none>");
                }
            }
        }

        public final Operation beginOperation(String str, String str2, Object[] objArr) {
            Operation operation;
            synchronized (this.mOperations) {
                int i = (this.mIndex + 1) % 20;
                operation = this.mOperations[i];
                if (operation == null) {
                    operation = new Operation();
                    this.mOperations[i] = operation;
                } else {
                    operation.mFinished = false;
                    operation.mException = null;
                    if (operation.mBindArgs != null) {
                        operation.mBindArgs.clear();
                    }
                }
                operation.mStartTime = System.currentTimeMillis();
                operation.mKind = str;
                operation.mSql = str2;
                if (objArr != null) {
                    if (operation.mBindArgs == null) {
                        operation.mBindArgs = new ArrayList<>();
                    } else {
                        operation.mBindArgs.clear();
                    }
                    for (Object obj : objArr) {
                        if (obj == null || !(obj instanceof byte[])) {
                            operation.mBindArgs.add(obj);
                        } else {
                            operation.mBindArgs.add(SQLiteConnection.EMPTY_BYTE_ARRAY);
                        }
                    }
                }
                operation.mCookie = newOperationCookieLocked(i);
                operation.mTid = SQLiteConnection.this.mAcquiredTid;
                this.mIndex = i;
            }
            return operation;
        }
    }

    static final class PreparedStatement {
        private WeakReference<SQLiteConnection> mConnection;
        public boolean mInCache;
        public boolean mInUse;
        public int mNumParameters;
        private Operation mOperation;
        public PreparedStatement mPoolNext;
        public boolean mReadOnly;
        public String mSql;
        public long mStatementPtr;
        public int mType;

        public final long getPtr() {
            return this.mStatementPtr;
        }

        public final String getSQL() {
            return this.mSql;
        }

        public final int getType() {
            return this.mType;
        }

        public final boolean isReadOnly() {
            return this.mReadOnly;
        }

        PreparedStatement(SQLiteConnection sQLiteConnection) {
            this.mConnection = new WeakReference<>(sQLiteConnection);
        }

        public final void attachCancellationSignal(CancellationSignal cancellationSignal) {
            SQLiteConnection sQLiteConnection = (SQLiteConnection) this.mConnection.get();
            if (sQLiteConnection != null) {
                sQLiteConnection.attachCancellationSignal(cancellationSignal);
            }
        }

        public final void bindArguments(Object[] objArr) {
            SQLiteConnection sQLiteConnection = (SQLiteConnection) this.mConnection.get();
            if (sQLiteConnection != null) {
                sQLiteConnection.bindArguments(this, objArr);
            }
        }

        public final void detachCancellationSignal(CancellationSignal cancellationSignal) {
            SQLiteConnection sQLiteConnection = (SQLiteConnection) this.mConnection.get();
            if (sQLiteConnection != null) {
                sQLiteConnection.detachCancellationSignal(cancellationSignal);
            }
        }

        public final void reset(boolean z) {
            SQLiteConnection sQLiteConnection = (SQLiteConnection) this.mConnection.get();
            if (sQLiteConnection != null) {
                sQLiteConnection.resetStatement(this, z);
            }
        }

        public final void failOperation(Exception exc) {
            if (this.mOperation != null) {
                SQLiteConnection sQLiteConnection = (SQLiteConnection) this.mConnection.get();
                if (sQLiteConnection != null) {
                    sQLiteConnection.mRecentOperations.failOperation(this.mOperation.mCookie, exc);
                }
            }
        }

        public final void endOperation(String str) {
            if (this.mOperation != null) {
                SQLiteConnection sQLiteConnection = (SQLiteConnection) this.mConnection.get();
                if (sQLiteConnection != null) {
                    if (sQLiteConnection.mRecentOperations.endOperationDeferLog(this.mOperation.mCookie)) {
                        sQLiteConnection.mRecentOperations.logOperation(this.mOperation.mCookie, str);
                    }
                    this.mOperation = null;
                }
            }
        }

        public final void beginOperation(String str, Object[] objArr) {
            SQLiteConnection sQLiteConnection = (SQLiteConnection) this.mConnection.get();
            if (sQLiteConnection != null) {
                this.mOperation = sQLiteConnection.mRecentOperations.beginOperation(str, this.mSql, objArr);
                this.mOperation.mType = this.mType;
            }
        }
    }

    final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        public final void dump(Printer printer) {
            printer.println("  Prepared statement cache:");
            Map snapshot = snapshot();
            if (!snapshot.isEmpty()) {
                int i = 0;
                for (Map.Entry entry : snapshot.entrySet()) {
                    PreparedStatement preparedStatement = (PreparedStatement) entry.getValue();
                    if (preparedStatement.mInCache) {
                        printer.println("    " + i + ": statementPtr=0x" + Long.toHexString(preparedStatement.getPtr()) + ", numParameters=" + preparedStatement.mNumParameters + ", type=" + preparedStatement.mType + ", readOnly=" + preparedStatement.mReadOnly + ", sql=\"" + SQLiteConnection.trimSqlForDisplay((String) entry.getKey()) + "\"");
                    }
                    i++;
                }
                return;
            }
            printer.println("    <none>");
        }

        public PreparedStatementCache(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        public final void entryRemoved(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            preparedStatement.mInCache = false;
            if (!preparedStatement.mInUse) {
                SQLiteConnection.this.finalizePreparedStatement(preparedStatement);
            }
        }
    }

    private void applyBlockGuardPolicy(PreparedStatement preparedStatement) {
    }

    private static boolean isCacheable(int i) {
        return i == 2 || i == 1;
    }

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d2);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native String nativeExecuteForString(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeIsReadOnly(long j, long j2);

    private native long nativeOpen(String str, int i, String str2);

    private static native long nativePrepareStatement(long j, String str);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatement(long j, long j2, boolean z);

    private static native long nativeSQLiteHandle(long j, boolean z);

    private static native void nativeSetKey(long j, byte[] bArr);

    private static native void nativeSetUpdateNotification(long j, boolean z, boolean z2);

    private static native void nativeSetWalHook(long j);

    private static native long nativeWalCheckpoint(long j, String str);

    public final int getConnectionId() {
        return this.mConnectionId;
    }

    public final boolean isPrimaryConnection() {
        return this.mIsPrimaryConnection;
    }

    /* access modifiers changed from: package-private */
    public final void close() {
        dispose(false);
    }

    /* access modifiers changed from: package-private */
    public final String describeCurrentOperationUnsafe() {
        return this.mRecentOperations.describeCurrentOperation();
    }

    public final void onCancel() {
        nativeCancel(this.mConnectionPtr);
    }

    private void setReadOnlyFromConfiguration() {
        if (this.mIsReadOnlyConnection) {
            execute("PRAGMA query_only = 1", null, null);
        }
    }

    private void setUpdateNotificationFromConfiguration() {
        nativeSetUpdateNotification(this.mConnectionPtr, this.mConfiguration.updateNotificationEnabled, this.mConfiguration.updateNotificationRowID);
    }

    private void setJournalSizeLimit() {
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection && executeForLong("PRAGMA journal_size_limit", null, null) != 524288) {
            executeForLong("PRAGMA journal_size_limit=524288", null, null);
        }
    }

    private void setSyncModeFromConfiguration() {
        int i = this.mConfiguration.synchronousMode;
        execute("PRAGMA synchronous=" + i, null, null);
    }

    private void setWalModeFromConfiguration() {
        String str;
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection) {
            if ((this.mConfiguration.openFlags & 536870912) != 0) {
                str = "WAL";
            } else {
                str = "PERSIST";
            }
            setJournalMode(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (!(this.mPool == null || this.mConnectionPtr == 0)) {
                this.mPool.onConnectionLeaked();
            }
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    private void setCheckpointStrategy() {
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection) {
            if (this.mConfiguration.customWALHookEnabled) {
                nativeSetWalHook(this.mConnectionPtr);
            } else if (executeForLong("PRAGMA wal_autocheckpoint", null, null) != 100) {
                executeForLong("PRAGMA wal_autocheckpoint=100", null, null);
            }
        }
    }

    private void setForeignKeyModeFromConfiguration() {
        long j;
        if (!this.mIsReadOnlyConnection) {
            if (this.mConfiguration.foreignKeyConstraintsEnabled) {
                j = 1;
            } else {
                j = 0;
            }
            if (executeForLong("PRAGMA foreign_keys", null, null) != j) {
                execute("PRAGMA foreign_keys=" + j, null, null);
            }
        }
    }

    public final String toString() {
        return "SQLiteConnection: " + this.mConfiguration.path + " (" + this.mConnectionId + ")";
    }

    private void open() {
        this.mConnectionPtr = nativeOpen(this.mConfiguration.path, this.mConfiguration.openFlags, this.mConfiguration.vfsName);
        if (this.mPassword != null && this.mPassword.length == 0) {
            this.mPassword = null;
        }
        if (this.mPassword != null) {
            nativeSetKey(this.mConnectionPtr, this.mPassword);
            setCipherSpec();
        }
        setPageSize();
        setReadOnlyFromConfiguration();
        setForeignKeyModeFromConfiguration();
        setWalModeFromConfiguration();
        setSyncModeFromConfiguration();
        setJournalSizeLimit();
        setCheckpointStrategy();
        setLocaleFromConfiguration();
        setUpdateNotificationFromConfiguration();
        int size = this.mConfiguration.customFunctions.size();
        for (int i = 0; i < size; i++) {
            nativeRegisterCustomFunction(this.mConnectionPtr, this.mConfiguration.customFunctions.get(i));
        }
    }

    private void setCipherSpec() {
        if (this.mCipher != null) {
            if (this.mCipher.cipher != null) {
                execute("PRAGMA cipher=" + DatabaseUtils.sqlEscapeString(this.mCipher.cipher), null, null);
            }
            if (this.mCipher.kdfIteration != 0) {
                execute("PRAGMA kdf_iter=" + this.mCipher.kdfIteration, null, null);
            }
            execute("PRAGMA cipher_use_hmac=" + this.mCipher.hmacEnabled, null, null);
        }
    }

    private void setPageSize() {
        long j;
        String str;
        int i;
        if (!this.mConfiguration.isInMemoryDb()) {
            if (this.mPassword != null) {
                str = "PRAGMA cipher_page_size";
                if (this.mCipher == null || this.mCipher.pageSize <= 0) {
                    i = SQLiteGlobal.defaultPageSize;
                } else {
                    i = this.mCipher.pageSize;
                }
                j = (long) i;
            } else {
                str = "PRAGMA page_size";
                j = (long) SQLiteGlobal.defaultPageSize;
            }
            if (executeForLong(str, null, null) != j) {
                execute(str + "=" + j, null, null);
            }
        }
    }

    private void setLocaleFromConfiguration() {
        this.mConfiguration.openFlags |= 16;
        if ((this.mConfiguration.openFlags & 16) == 0) {
            String locale = this.mConfiguration.locale.toString();
            nativeRegisterLocalizedCollators(this.mConnectionPtr, locale);
            if (!this.mIsReadOnlyConnection) {
                try {
                    execute("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
                    String executeForString = executeForString("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
                    if (executeForString == null || !executeForString.equals(locale)) {
                        execute("BEGIN", null, null);
                        execute("DELETE FROM android_metadata", null, null);
                        execute("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{locale}, null);
                        execute("REINDEX LOCALIZED", null, null);
                        execute("COMMIT", null, null);
                    }
                } catch (RuntimeException e2) {
                    throw new SQLiteException("Failed to change locale for db '" + this.mConfiguration.label + "' to '" + locale + "'.", e2);
                } catch (Throwable th) {
                    execute("ROLLBACK", null, null);
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setOnlyAllowReadOnlyOperations(boolean z) {
        this.mOnlyAllowReadOnlyOperations = z;
    }

    private void recyclePreparedStatement(PreparedStatement preparedStatement) {
        preparedStatement.mSql = null;
        preparedStatement.mPoolNext = this.mPreparedStatementPool;
        this.mPreparedStatementPool = preparedStatement;
    }

    public static String trimSqlForDisplay(String str) {
        return TRIM_SQL_PATTERN.matcher(str).replaceAll(" ");
    }

    /* access modifiers changed from: package-private */
    public final void collectDbStatsUnsafe(ArrayList<SQLiteDebug.DbStats> arrayList) {
        arrayList.add(getMainDbStatsUnsafe(0, 0, 0));
    }

    public final void finalizePreparedStatement(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.mConnectionPtr, preparedStatement.getPtr());
        recyclePreparedStatement(preparedStatement);
    }

    /* access modifiers changed from: package-private */
    public final boolean isPreparedStatementInCache(String str) {
        if (this.mPreparedStatementCache.get(str) != null) {
            return true;
        }
        return false;
    }

    private void throwIfStatementForbidden(PreparedStatement preparedStatement) {
        if (this.mOnlyAllowReadOnlyOperations && !preparedStatement.mReadOnly) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    public final void attachCancellationSignal(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            this.mCancellationSignalAttachCount++;
            if (this.mCancellationSignalAttachCount == 1) {
                nativeResetCancel(this.mConnectionPtr, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    public final void detachCancellationSignal(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            this.mCancellationSignalAttachCount--;
            if (this.mCancellationSignalAttachCount == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.mConnectionPtr, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void releasePreparedStatement(PreparedStatement preparedStatement) {
        preparedStatement.mInUse = false;
        if (preparedStatement.mInCache) {
            try {
                resetStatement(preparedStatement, true);
            } catch (SQLiteException unused) {
                this.mPreparedStatementCache.remove(preparedStatement.mSql);
            }
        } else {
            finalizePreparedStatement(preparedStatement);
        }
    }

    private void dispose(boolean z) {
        if (this.mConnectionPtr != 0) {
            int i = this.mRecentOperations.beginOperation("close", null, null).mCookie;
            try {
                this.mPreparedStatementCache.evictAll();
                nativeClose(this.mConnectionPtr);
                this.mConnectionPtr = 0;
            } finally {
                this.mRecentOperations.endOperation(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void endNativeHandle(Exception exc) {
        int i = this.mNativeHandleCount - 1;
        this.mNativeHandleCount = i;
        if (i == 0 && this.mNativeOperation != null) {
            nativeSQLiteHandle(this.mConnectionPtr, false);
            if (exc == null) {
                this.mRecentOperations.endOperationDeferLog(this.mNativeOperation.mCookie);
            } else {
                this.mRecentOperations.failOperation(this.mNativeOperation.mCookie, exc);
            }
            this.mNativeOperation = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final long getNativeHandle(String str) {
        if (this.mConnectionPtr == 0) {
            return 0;
        }
        if (str != null && this.mNativeOperation == null) {
            this.mNativeOperation = this.mRecentOperations.beginOperation(str, null, null);
            this.mNativeOperation.mType = 99;
        }
        this.mNativeHandleCount++;
        return nativeSQLiteHandle(this.mConnectionPtr, true);
    }

    public final Pair<Integer, Integer> walCheckpoint(String str) {
        if (str == null || str.isEmpty()) {
            str = "main";
        }
        long nativeWalCheckpoint = nativeWalCheckpoint(this.mConnectionPtr, str);
        return new Pair<>(Integer.valueOf((int) (nativeWalCheckpoint >> 32)), Integer.valueOf((int) (nativeWalCheckpoint & 4294967295L)));
    }

    private void setJournalMode(String str) {
        String executeForString = executeForString("PRAGMA journal_mode", null, null);
        if (!executeForString.equalsIgnoreCase(str)) {
            try {
                if (executeForString("PRAGMA journal_mode=" + str, null, null).equalsIgnoreCase(str)) {
                    return;
                }
            } catch (SQLiteDatabaseLockedException unused) {
            }
            Log.w("WCDB.SQLiteConnection", "Could not change the database journal mode of '" + this.mConfiguration.label + "' from '" + executeForString + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
        }
    }

    /* access modifiers changed from: package-private */
    public final PreparedStatement acquirePreparedStatement(String str) {
        boolean z;
        PreparedStatement preparedStatement = (PreparedStatement) this.mPreparedStatementCache.get(str);
        if (preparedStatement == null) {
            z = false;
        } else if (!preparedStatement.mInUse) {
            preparedStatement.mInUse = true;
            return preparedStatement;
        } else {
            z = true;
        }
        long nativePrepareStatement = nativePrepareStatement(this.mConnectionPtr, str);
        try {
            int nativeGetParameterCount = nativeGetParameterCount(this.mConnectionPtr, nativePrepareStatement);
            int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
            PreparedStatement obtainPreparedStatement = obtainPreparedStatement(str, nativePrepareStatement, nativeGetParameterCount, sqlStatementType, nativeIsReadOnly(this.mConnectionPtr, nativePrepareStatement));
            if (!z) {
                try {
                    if (isCacheable(sqlStatementType)) {
                        this.mPreparedStatementCache.put(str, obtainPreparedStatement);
                        obtainPreparedStatement.mInCache = true;
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    preparedStatement = obtainPreparedStatement;
                    nativeFinalizeStatement(this.mConnectionPtr, nativePrepareStatement);
                    throw e;
                }
            }
            obtainPreparedStatement.mInUse = true;
            return obtainPreparedStatement;
        } catch (RuntimeException e3) {
            e = e3;
            if (preparedStatement == null || !preparedStatement.mInCache) {
                nativeFinalizeStatement(this.mConnectionPtr, nativePrepareStatement);
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        r16 = r5;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c5, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041 A[Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096 A[Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4 A[ExcHandler:  FINALLY, Splitter:B:11:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void collectDbStats(java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.DbStats> r25) {
        /*
            r24 = this;
            r9 = r24
            r0 = r25
            long r1 = r9.mConnectionPtr
            int r2 = nativeGetDbLookaside(r1)
            r10 = 0
            r12 = 0
            java.lang.String r1 = "PRAGMA page_count;"
            long r3 = r9.executeForLong(r1, r12, r12)     // Catch:{ SQLiteException -> 0x001a }
            java.lang.String r1 = "PRAGMA page_size;"
            long r5 = r9.executeForLong(r1, r12, r12)     // Catch:{ SQLiteException -> 0x001b }
            goto L_0x001c
        L_0x001a:
            r3 = r10
        L_0x001b:
            r5 = r10
        L_0x001c:
            r1 = r24
            com.tencent.wcdb.database.SQLiteDebug$DbStats r1 = r1.getMainDbStatsUnsafe(r2, r3, r5)
            r0.add(r1)
            com.tencent.wcdb.CursorWindow r13 = new com.tencent.wcdb.CursorWindow
            java.lang.String r1 = "collectDbStats"
            r13.<init>((java.lang.String) r1)
            java.lang.String r2 = "PRAGMA database_list;"
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r24
            r4 = r13
            r1.executeForCursorWindow(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            r1 = 1
            r2 = 1
        L_0x003b:
            int r3 = r13.getNumRows()     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            if (r2 >= r3) goto L_0x00c0
            java.lang.String r3 = r13.getString(r2, r1)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            r4 = 2
            java.lang.String r4 = r13.getString(r2, r4)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x007d, all -> 0x00c4 }
            java.lang.String r6 = "PRAGMA "
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x007d, all -> 0x00c4 }
            r5.append(r3)     // Catch:{ SQLiteException -> 0x007d, all -> 0x00c4 }
            java.lang.String r6 = ".page_count;"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x007d, all -> 0x00c4 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x007d, all -> 0x00c4 }
            long r5 = r9.executeForLong(r5, r12, r12)     // Catch:{ SQLiteException -> 0x007d, all -> 0x00c4 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x007e, all -> 0x00c4 }
            java.lang.String r8 = "PRAGMA "
            r7.<init>(r8)     // Catch:{ SQLiteException -> 0x007e, all -> 0x00c4 }
            r7.append(r3)     // Catch:{ SQLiteException -> 0x007e, all -> 0x00c4 }
            java.lang.String r8 = ".page_size;"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x007e, all -> 0x00c4 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x007e, all -> 0x00c4 }
            long r7 = r9.executeForLong(r7, r12, r12)     // Catch:{ SQLiteException -> 0x007e, all -> 0x00c4 }
            r16 = r5
            r18 = r7
            goto L_0x0082
        L_0x007d:
            r5 = r10
        L_0x007e:
            r16 = r5
            r18 = r10
        L_0x0082:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            java.lang.String r6 = "  (attached) "
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            r5.append(r3)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            java.lang.String r3 = r5.toString()     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            int r5 = r4.length()     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            if (r5 == 0) goto L_0x00aa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            r5.append(r3)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            java.lang.String r3 = ": "
            r5.append(r3)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            r5.append(r4)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            java.lang.String r3 = r5.toString()     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
        L_0x00aa:
            r15 = r3
            com.tencent.wcdb.database.SQLiteDebug$DbStats r3 = new com.tencent.wcdb.database.SQLiteDebug$DbStats     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r14 = r3
            r14.<init>(r15, r16, r18, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c4 }
            int r2 = r2 + 1
            goto L_0x003b
        L_0x00c0:
            r13.close()
            return
        L_0x00c4:
            r0 = move-exception
            r13.close()
            throw r0
        L_0x00c9:
            r13.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.collectDbStats(java.util.ArrayList):void");
    }

    /* access modifiers changed from: package-private */
    public final void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        this.mOnlyAllowReadOnlyOperations = false;
        int size = sQLiteDatabaseConfiguration.customFunctions.size();
        for (int i = 0; i < size; i++) {
            SQLiteCustomFunction sQLiteCustomFunction = sQLiteDatabaseConfiguration.customFunctions.get(i);
            if (!this.mConfiguration.customFunctions.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.mConnectionPtr, sQLiteCustomFunction);
            }
        }
        if (((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & 536870912) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = !sQLiteDatabaseConfiguration.locale.equals(this.mConfiguration.locale);
        if (sQLiteDatabaseConfiguration.customWALHookEnabled != this.mConfiguration.customWALHookEnabled) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sQLiteDatabaseConfiguration.synchronousMode != this.mConfiguration.synchronousMode) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!(sQLiteDatabaseConfiguration.updateNotificationEnabled == this.mConfiguration.updateNotificationEnabled && sQLiteDatabaseConfiguration.updateNotificationRowID == this.mConfiguration.updateNotificationRowID)) {
            z5 = true;
        }
        this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
        this.mPreparedStatementCache.resize(sQLiteDatabaseConfiguration.maxSqlCacheSize);
        if (z2) {
            setForeignKeyModeFromConfiguration();
        }
        if (z) {
            setWalModeFromConfiguration();
        }
        if (z4) {
            setSyncModeFromConfiguration();
        }
        if (z3) {
            setCheckpointStrategy();
        }
        if (z6) {
            setLocaleFromConfiguration();
        }
        if (z5) {
            setUpdateNotificationFromConfiguration();
        }
    }

    public final void dump(Printer printer, boolean z) {
        dumpUnsafe(printer, z);
    }

    private void notifyCheckpoint(String str, int i) {
        this.mPool.notifyCheckpoint(str, i);
    }

    /* access modifiers changed from: package-private */
    public final void setAcquisitionState(Thread thread, int i) {
        this.mAcquiredThread = thread;
        this.mAcquiredTid = i;
    }

    public final void resetStatement(PreparedStatement preparedStatement, boolean z) {
        nativeResetStatement(this.mConnectionPtr, preparedStatement.getPtr(), z);
    }

    public final void prepare(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        PreparedStatement acquirePreparedStatement;
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("prepare", str, null);
            int i = beginOperation.mCookie;
            try {
                acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                if (sQLiteStatementInfo != null) {
                    sQLiteStatementInfo.numParameters = acquirePreparedStatement.mNumParameters;
                    sQLiteStatementInfo.readOnly = acquirePreparedStatement.mReadOnly;
                    int nativeGetColumnCount = nativeGetColumnCount(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    if (nativeGetColumnCount == 0) {
                        sQLiteStatementInfo.columnNames = EMPTY_STRING_ARRAY;
                    } else {
                        sQLiteStatementInfo.columnNames = new String[nativeGetColumnCount];
                        for (int i2 = 0; i2 < nativeGetColumnCount; i2++) {
                            sQLiteStatementInfo.columnNames[i2] = nativeGetColumnName(this.mConnectionPtr, acquirePreparedStatement.getPtr(), i2);
                        }
                    }
                }
                releasePreparedStatement(acquirePreparedStatement);
                this.mRecentOperations.endOperation(i);
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.mPool != null) {
                        this.mPool.logConnectionPoolBusy(str);
                    }
                    this.mRecentOperations.failOperation(i, e2);
                    throw e2;
                } catch (Throwable th) {
                    this.mRecentOperations.endOperation(i);
                    throw th;
                }
            } catch (Throwable th2) {
                releasePreparedStatement(acquirePreparedStatement);
                throw th2;
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public final void bindArguments(PreparedStatement preparedStatement, Object[] objArr) {
        int i;
        long j;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i != preparedStatement.mNumParameters) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.mNumParameters + " bind arguments but " + i + " were provided.");
        } else if (i != 0) {
            long ptr = preparedStatement.getPtr();
            for (int i2 = 0; i2 < i; i2++) {
                Boolean bool = objArr[i2];
                int typeOfObject = DatabaseUtils.getTypeOfObject(bool);
                if (typeOfObject != 4) {
                    switch (typeOfObject) {
                        case 0:
                            nativeBindNull(this.mConnectionPtr, ptr, i2 + 1);
                            break;
                        case 1:
                            nativeBindLong(this.mConnectionPtr, ptr, i2 + 1, ((Number) bool).longValue());
                            break;
                        case 2:
                            nativeBindDouble(this.mConnectionPtr, ptr, i2 + 1, ((Number) bool).doubleValue());
                            break;
                        default:
                            if (!(bool instanceof Boolean)) {
                                nativeBindString(this.mConnectionPtr, ptr, i2 + 1, bool.toString());
                                break;
                            } else {
                                long j2 = this.mConnectionPtr;
                                int i3 = i2 + 1;
                                if (bool.booleanValue()) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                nativeBindLong(j2, ptr, i3, j);
                                break;
                            }
                    }
                } else {
                    nativeBindBlob(this.mConnectionPtr, ptr, i2 + 1, (byte[]) bool);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dumpUnsafe(Printer printer, boolean z) {
        printer.println("Connection #" + this.mConnectionId + ":");
        if (z) {
            printer.println("  connectionPtr: 0x" + Long.toHexString(this.mConnectionPtr));
        }
        printer.println("  isPrimaryConnection: " + this.mIsPrimaryConnection);
        printer.println("  onlyAllowReadOnlyOperations: " + this.mOnlyAllowReadOnlyOperations);
        if (this.mAcquiredThread != null) {
            printer.println("  acquiredThread: " + this.mAcquiredThread + " (tid: " + this.mAcquiredTid + ")");
        }
        this.mRecentOperations.dump(printer, z);
        if (z) {
            this.mPreparedStatementCache.dump(printer);
        }
    }

    private SQLiteDebug.DbStats getMainDbStatsUnsafe(int i, long j, long j2) {
        String str = this.mConfiguration.path;
        if (!this.mIsPrimaryConnection) {
            str = str + " (" + this.mConnectionId + ")";
        }
        SQLiteDebug.DbStats dbStats = new SQLiteDebug.DbStats(str, j, j2, i, this.mPreparedStatementCache.hitCount(), this.mPreparedStatementCache.missCount(), this.mPreparedStatementCache.size());
        return dbStats;
    }

    public final void execute(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("execute", str, objArr);
            int i = beginOperation.mCookie;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    nativeExecute(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    detachCancellationSignal(cancellationSignal);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(i);
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.mPool != null) {
                        this.mPool.logConnectionPoolBusy(str);
                    }
                    this.mRecentOperations.failOperation(i, e2);
                    throw e2;
                } catch (Throwable th2) {
                    this.mRecentOperations.endOperation(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public final long executeForLastInsertedRowId(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("executeForLastInsertedRowId", str, objArr);
            int i = beginOperation.mCookie;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    long nativeExecuteForLastInsertedRowId = nativeExecuteForLastInsertedRowId(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    detachCancellationSignal(cancellationSignal);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(i);
                    return nativeExecuteForLastInsertedRowId;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.mPool != null) {
                        this.mPool.logConnectionPoolBusy(str);
                    }
                    this.mRecentOperations.failOperation(i, e2);
                    throw e2;
                } catch (Throwable th2) {
                    this.mRecentOperations.endOperation(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public final long executeForLong(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("executeForLong", str, objArr);
            int i = beginOperation.mCookie;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    long nativeExecuteForLong = nativeExecuteForLong(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    detachCancellationSignal(cancellationSignal);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(i);
                    return nativeExecuteForLong;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.mPool != null) {
                        this.mPool.logConnectionPoolBusy(str);
                    }
                    this.mRecentOperations.failOperation(i, e2);
                    throw e2;
                } catch (Throwable th2) {
                    this.mRecentOperations.endOperation(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public final String executeForString(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("executeForString", str, objArr);
            int i = beginOperation.mCookie;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    String nativeExecuteForString = nativeExecuteForString(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    detachCancellationSignal(cancellationSignal);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(i);
                    return nativeExecuteForString;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.mPool != null) {
                        this.mPool.logConnectionPoolBusy(str);
                    }
                    this.mRecentOperations.failOperation(i, e2);
                    throw e2;
                } catch (Throwable th2) {
                    this.mRecentOperations.endOperation(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int executeForChangedRowCount(java.lang.String r9, java.lang.Object[] r10, com.tencent.wcdb.support.CancellationSignal r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0096
            r0 = 0
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r1 = r8.mRecentOperations
            java.lang.String r2 = "executeForChangedRowCount"
            com.tencent.wcdb.database.SQLiteConnection$Operation r1 = r1.beginOperation(r2, r9, r10)
            int r2 = r1.mCookie
            com.tencent.wcdb.database.SQLiteConnection$PreparedStatement r3 = r8.acquirePreparedStatement(r9)     // Catch:{ RuntimeException -> 0x0062 }
            int r4 = r3.mType     // Catch:{ RuntimeException -> 0x0062 }
            r1.mType = r4     // Catch:{ RuntimeException -> 0x0062 }
            r8.throwIfStatementForbidden(r3)     // Catch:{ all -> 0x005b }
            r8.bindArguments(r3, r10)     // Catch:{ all -> 0x005b }
            r8.applyBlockGuardPolicy(r3)     // Catch:{ all -> 0x005b }
            r8.attachCancellationSignal(r11)     // Catch:{ all -> 0x005b }
            long r4 = r8.mConnectionPtr     // Catch:{ all -> 0x0056 }
            long r6 = r3.getPtr()     // Catch:{ all -> 0x0056 }
            int r10 = nativeExecuteForChangedRowCount(r4, r6)     // Catch:{ all -> 0x0056 }
            r8.detachCancellationSignal(r11)     // Catch:{ all -> 0x0053 }
            r8.releasePreparedStatement(r3)     // Catch:{ RuntimeException -> 0x0050, all -> 0x004d }
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r9 = r8.mRecentOperations
            boolean r9 = r9.endOperationDeferLog(r2)
            if (r9 == 0) goto L_0x004c
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r9 = r8.mRecentOperations
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "changedRows="
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            r9.logOperation(r2, r11)
        L_0x004c:
            return r10
        L_0x004d:
            r9 = move-exception
            r0 = r10
            goto L_0x007a
        L_0x0050:
            r11 = move-exception
            r0 = r10
            goto L_0x0063
        L_0x0053:
            r11 = move-exception
            r0 = r10
            goto L_0x005c
        L_0x0056:
            r10 = move-exception
            r8.detachCancellationSignal(r11)     // Catch:{ all -> 0x005b }
            throw r10     // Catch:{ all -> 0x005b }
        L_0x005b:
            r11 = move-exception
        L_0x005c:
            r8.releasePreparedStatement(r3)     // Catch:{ RuntimeException -> 0x0062 }
            throw r11     // Catch:{ RuntimeException -> 0x0062 }
        L_0x0060:
            r9 = move-exception
            goto L_0x007a
        L_0x0062:
            r11 = move-exception
        L_0x0063:
            boolean r10 = r11 instanceof com.tencent.wcdb.database.SQLiteDatabaseLockedException     // Catch:{ all -> 0x0060 }
            if (r10 != 0) goto L_0x006b
            boolean r10 = r11 instanceof com.tencent.wcdb.database.SQLiteTableLockedException     // Catch:{ all -> 0x0060 }
            if (r10 == 0) goto L_0x0074
        L_0x006b:
            com.tencent.wcdb.database.SQLiteConnectionPool r10 = r8.mPool     // Catch:{ all -> 0x0060 }
            if (r10 == 0) goto L_0x0074
            com.tencent.wcdb.database.SQLiteConnectionPool r10 = r8.mPool     // Catch:{ all -> 0x0060 }
            r10.logConnectionPoolBusy(r9)     // Catch:{ all -> 0x0060 }
        L_0x0074:
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r9 = r8.mRecentOperations     // Catch:{ all -> 0x0060 }
            r9.failOperation(r2, r11)     // Catch:{ all -> 0x0060 }
            throw r11     // Catch:{ all -> 0x0060 }
        L_0x007a:
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r10 = r8.mRecentOperations
            boolean r10 = r10.endOperationDeferLog(r2)
            if (r10 == 0) goto L_0x0095
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r10 = r8.mRecentOperations
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "changedRows="
            r11.<init>(r1)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.logOperation(r2, r11)
        L_0x0095:
            throw r9
        L_0x0096:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "sql must not be null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.executeForChangedRowCount(java.lang.String, java.lang.Object[], com.tencent.wcdb.support.CancellationSignal):int");
    }

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        this.mPool.notifyChanges(str, str2, jArr, jArr2, jArr3);
    }

    private PreparedStatement obtainPreparedStatement(String str, long j, int i, int i2, boolean z) {
        PreparedStatement preparedStatement = this.mPreparedStatementPool;
        if (preparedStatement != null) {
            this.mPreparedStatementPool = preparedStatement.mPoolNext;
            preparedStatement.mPoolNext = null;
            preparedStatement.mInCache = false;
        } else {
            preparedStatement = new PreparedStatement(this);
        }
        preparedStatement.mSql = str;
        preparedStatement.mStatementPtr = j;
        preparedStatement.mNumParameters = i;
        preparedStatement.mType = i2;
        preparedStatement.mReadOnly = z;
        return preparedStatement;
    }

    static SQLiteConnection open(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteConnection sQLiteConnection = new SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i, z, bArr, sQLiteCipherSpec);
        try {
            sQLiteConnection.open();
            return sQLiteConnection;
        } catch (SQLiteException e2) {
            SQLiteDebug.collectLastIOTraceStats(sQLiteConnection);
            sQLiteConnection.dispose(false);
            throw e2;
        }
    }

    private SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2 = null;
        this.mPassword = bArr;
        this.mCipher = sQLiteCipherSpec != null ? new SQLiteCipherSpec(sQLiteCipherSpec) : sQLiteCipherSpec2;
        this.mPool = sQLiteConnectionPool;
        this.mConfiguration = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.mConnectionId = i;
        this.mIsPrimaryConnection = z;
        this.mIsReadOnlyConnection = (sQLiteDatabaseConfiguration.openFlags & 1) == 0 ? false : true;
        this.mPreparedStatementCache = new PreparedStatementCache(this.mConfiguration.maxSqlCacheSize);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec A[Catch:{ all -> 0x0120 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int executeForCursorWindow(java.lang.String r18, java.lang.Object[] r19, com.tencent.wcdb.CursorWindow r20, int r21, int r22, boolean r23, com.tencent.wcdb.support.CancellationSignal r24) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r3 = r20
            r13 = r21
            r14 = r24
            if (r2 == 0) goto L_0x012d
            if (r3 == 0) goto L_0x0125
            r20.acquireReference()
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r4 = r1.mRecentOperations     // Catch:{ all -> 0x0120 }
            java.lang.String r5 = "executeForCursorWindow"
            com.tencent.wcdb.database.SQLiteConnection$Operation r4 = r4.beginOperation(r5, r2, r0)     // Catch:{ all -> 0x0120 }
            int r15 = r4.mCookie     // Catch:{ all -> 0x0120 }
            r16 = -1
            com.tencent.wcdb.database.SQLiteConnection$PreparedStatement r12 = r17.acquirePreparedStatement(r18)     // Catch:{ RuntimeException -> 0x00c5, all -> 0x00c0 }
            int r5 = r12.mType     // Catch:{ RuntimeException -> 0x00c5, all -> 0x00c0 }
            r4.mType = r5     // Catch:{ RuntimeException -> 0x00c5, all -> 0x00c0 }
            r1.throwIfStatementForbidden(r12)     // Catch:{ all -> 0x00b6 }
            r1.bindArguments(r12, r0)     // Catch:{ all -> 0x00b6 }
            r1.applyBlockGuardPolicy(r12)     // Catch:{ all -> 0x00b6 }
            r1.attachCancellationSignal(r14)     // Catch:{ all -> 0x00b6 }
            long r4 = r1.mConnectionPtr     // Catch:{ all -> 0x00ac }
            long r6 = r12.getPtr()     // Catch:{ all -> 0x00ac }
            long r8 = r3.mWindowPtr     // Catch:{ all -> 0x00ac }
            r10 = r21
            r11 = r22
            r2 = r12
            r12 = r23
            long r4 = nativeExecuteForCursorWindow(r4, r6, r8, r10, r11, r12)     // Catch:{ all -> 0x00aa }
            r0 = 32
            long r6 = r4 >> r0
            int r6 = (int) r6
            int r4 = (int) r4
            int r5 = r20.getNumRows()     // Catch:{ all -> 0x00a6 }
            r3.setStartPosition(r6)     // Catch:{ all -> 0x00a2 }
            r1.detachCancellationSignal(r14)     // Catch:{ all -> 0x009e }
            r1.releasePreparedStatement(r2)     // Catch:{ RuntimeException -> 0x009a, all -> 0x0098 }
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r0 = r1.mRecentOperations     // Catch:{ all -> 0x0120 }
            boolean r0 = r0.endOperationDeferLog(r15)     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x0094
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r0 = r1.mRecentOperations     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            java.lang.String r7 = "window='"
            r2.<init>(r7)     // Catch:{ all -> 0x0120 }
            r2.append(r3)     // Catch:{ all -> 0x0120 }
            java.lang.String r7 = "', startPos="
            r2.append(r7)     // Catch:{ all -> 0x0120 }
            r2.append(r13)     // Catch:{ all -> 0x0120 }
            java.lang.String r7 = ", actualPos="
            r2.append(r7)     // Catch:{ all -> 0x0120 }
            r2.append(r6)     // Catch:{ all -> 0x0120 }
            java.lang.String r6 = ", filledRows="
            r2.append(r6)     // Catch:{ all -> 0x0120 }
            r2.append(r5)     // Catch:{ all -> 0x0120 }
            java.lang.String r5 = ", countedRows="
            r2.append(r5)     // Catch:{ all -> 0x0120 }
            r2.append(r4)     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0120 }
            r0.logOperation(r15, r2)     // Catch:{ all -> 0x0120 }
        L_0x0094:
            r20.releaseReference()
            return r4
        L_0x0098:
            r0 = move-exception
            goto L_0x00e4
        L_0x009a:
            r0 = move-exception
            r16 = r6
            goto L_0x00c8
        L_0x009e:
            r0 = move-exception
            r16 = r6
            goto L_0x00ba
        L_0x00a2:
            r0 = move-exception
            r16 = r6
            goto L_0x00b0
        L_0x00a6:
            r0 = move-exception
            r16 = r6
            goto L_0x00af
        L_0x00aa:
            r0 = move-exception
            goto L_0x00ae
        L_0x00ac:
            r0 = move-exception
            r2 = r12
        L_0x00ae:
            r4 = -1
        L_0x00af:
            r5 = -1
        L_0x00b0:
            r1.detachCancellationSignal(r14)     // Catch:{ all -> 0x00b4 }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            goto L_0x00ba
        L_0x00b6:
            r0 = move-exception
            r2 = r12
            r4 = -1
            r5 = -1
        L_0x00ba:
            r1.releasePreparedStatement(r2)     // Catch:{ RuntimeException -> 0x00be }
            throw r0     // Catch:{ RuntimeException -> 0x00be }
        L_0x00be:
            r0 = move-exception
            goto L_0x00c8
        L_0x00c0:
            r0 = move-exception
            r4 = -1
            r5 = -1
            r6 = -1
            goto L_0x00e4
        L_0x00c5:
            r0 = move-exception
            r4 = -1
            r5 = -1
        L_0x00c8:
            boolean r2 = r0 instanceof com.tencent.wcdb.database.SQLiteDatabaseLockedException     // Catch:{ all -> 0x00e1 }
            if (r2 != 0) goto L_0x00d0
            boolean r2 = r0 instanceof com.tencent.wcdb.database.SQLiteTableLockedException     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x00db
        L_0x00d0:
            com.tencent.wcdb.database.SQLiteConnectionPool r2 = r1.mPool     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x00db
            com.tencent.wcdb.database.SQLiteConnectionPool r2 = r1.mPool     // Catch:{ all -> 0x00e1 }
            r6 = r18
            r2.logConnectionPoolBusy(r6)     // Catch:{ all -> 0x00e1 }
        L_0x00db:
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r2 = r1.mRecentOperations     // Catch:{ all -> 0x00e1 }
            r2.failOperation(r15, r0)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            r6 = r16
        L_0x00e4:
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r2 = r1.mRecentOperations     // Catch:{ all -> 0x0120 }
            boolean r2 = r2.endOperationDeferLog(r15)     // Catch:{ all -> 0x0120 }
            if (r2 == 0) goto L_0x011f
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r2 = r1.mRecentOperations     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            java.lang.String r8 = "window='"
            r7.<init>(r8)     // Catch:{ all -> 0x0120 }
            r7.append(r3)     // Catch:{ all -> 0x0120 }
            java.lang.String r8 = "', startPos="
            r7.append(r8)     // Catch:{ all -> 0x0120 }
            r7.append(r13)     // Catch:{ all -> 0x0120 }
            java.lang.String r8 = ", actualPos="
            r7.append(r8)     // Catch:{ all -> 0x0120 }
            r7.append(r6)     // Catch:{ all -> 0x0120 }
            java.lang.String r6 = ", filledRows="
            r7.append(r6)     // Catch:{ all -> 0x0120 }
            r7.append(r5)     // Catch:{ all -> 0x0120 }
            java.lang.String r5 = ", countedRows="
            r7.append(r5)     // Catch:{ all -> 0x0120 }
            r7.append(r4)     // Catch:{ all -> 0x0120 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x0120 }
            r2.logOperation(r15, r4)     // Catch:{ all -> 0x0120 }
        L_0x011f:
            throw r0     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r0 = move-exception
            r20.releaseReference()
            throw r0
        L_0x0125:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "window must not be null."
            r0.<init>(r2)
            throw r0
        L_0x012d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "sql must not be null."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.executeForCursorWindow(java.lang.String, java.lang.Object[], com.tencent.wcdb.CursorWindow, int, int, boolean, com.tencent.wcdb.support.CancellationSignal):int");
    }
}
