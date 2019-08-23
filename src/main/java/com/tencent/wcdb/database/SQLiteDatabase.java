package com.tencent.wcdb.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Printer;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.DefaultDatabaseErrorHandler;
import com.tencent.wcdb.SQLException;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class SQLiteDatabase extends SQLiteClosable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = new WeakHashMap<>();
    private final SQLiteDatabaseConfiguration mConfigurationLocked;
    private SQLiteConnectionPool mConnectionPoolLocked;
    private final CursorFactory mCursorFactory;
    private final DatabaseErrorHandler mErrorHandler;
    private boolean mHasAttachedDbsLocked;
    private final Object mLock = new Object();
    private final ThreadLocal<SQLiteSession> mThreadSession = new ThreadLocal<SQLiteSession>() {
        /* access modifiers changed from: protected */
        public SQLiteSession initialValue() {
            return SQLiteDatabase.this.createSession();
        }
    };

    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram);

        SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal);
    }

    public interface CustomFunction {
        void callback(String[] strArr);
    }

    @Deprecated
    public final boolean isDbLockedByOtherThreads() {
        return false;
    }

    @Deprecated
    public final void markTableSyncable(String str, String str2) {
    }

    @Deprecated
    public final void markTableSyncable(String str, String str2, String str3) {
    }

    @Deprecated
    public final void setLockingEnabled(boolean z) {
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openOrCreateDatabase(str, bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(str, bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, 0);
    }

    public static int releaseMemory() {
        return SQLiteGlobal.releaseMemory();
    }

    public final void beginTransaction() {
        beginTransaction(null, true);
    }

    public final void beginTransactionNonExclusive() {
        beginTransaction(null, false);
    }

    public final long getPageSize() {
        return DatabaseUtils.longForQuery(this, "PRAGMA page_size;", null);
    }

    @Deprecated
    public final Map<String, String> getSyncedTables() {
        return new HashMap(0);
    }

    /* access modifiers changed from: protected */
    public final void onAllReferencesReleased() {
        dispose(false);
    }

    /* access modifiers changed from: package-private */
    public final void onCorruption() {
        this.mErrorHandler.onCorruption(this);
    }

    @Deprecated
    public final boolean yieldIfContended() {
        return yieldIfContendedHelper(false, -1);
    }

    public final boolean yieldIfContendedSafely() {
        return yieldIfContendedHelper(true, -1);
    }

    private static boolean isMainThread() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || myLooper != Looper.getMainLooper()) {
            return false;
        }
        return true;
    }

    private boolean isReadOnlyLocked() {
        if ((this.mConfigurationLocked.openFlags & 1) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public final boolean getAsyncCheckpointEnabled() {
        SQLiteCheckpointListener checkpointCallback = getCheckpointCallback();
        if (checkpointCallback == null || !(checkpointCallback instanceof SQLiteAsyncCheckpointer)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String getLabel() {
        String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.label;
        }
        return str;
    }

    public final long getMaximumSize() {
        return DatabaseUtils.longForQuery(this, "PRAGMA max_page_count;", null) * getPageSize();
    }

    public final String getPath() {
        String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.path;
        }
        return str;
    }

    public final int getSynchronousMode() {
        int i;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            i = this.mConfigurationLocked.synchronousMode;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteSession getThreadSession() {
        return this.mThreadSession.get();
    }

    public final int getVersion() {
        return Long.valueOf(DatabaseUtils.longForQuery(this, "PRAGMA user_version;", null)).intValue();
    }

    public final boolean isInMemoryDatabase() {
        boolean isInMemoryDb;
        synchronized (this.mLock) {
            isInMemoryDb = this.mConfigurationLocked.isInMemoryDb();
        }
        return isInMemoryDb;
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.mLock) {
            if (this.mConnectionPoolLocked != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean isReadOnly() {
        boolean isReadOnlyLocked;
        synchronized (this.mLock) {
            isReadOnlyLocked = isReadOnlyLocked();
        }
        return isReadOnlyLocked;
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList<>();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    static ArrayList<SQLiteDebug.DbStats> getDbStats() {
        ArrayList<SQLiteDebug.DbStats> arrayList = new ArrayList<>();
        Iterator<SQLiteDatabase> it2 = getActiveDatabases().iterator();
        while (it2.hasNext()) {
            it2.next().collectDbStats(arrayList);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteSession createSession() {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            sQLiteConnectionPool = this.mConnectionPoolLocked;
        }
        return new SQLiteSession(sQLiteConnectionPool);
    }

    public final void endTransaction() {
        acquireReference();
        try {
            getThreadSession().endTransaction(null);
        } finally {
            releaseReference();
        }
    }

    public final SQLiteChangeListener getChangeListener() {
        SQLiteChangeListener changeListener;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            changeListener = this.mConnectionPoolLocked.getChangeListener();
        }
        return changeListener;
    }

    public final SQLiteCheckpointListener getCheckpointCallback() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (!this.mConfigurationLocked.customWALHookEnabled) {
                return null;
            }
            SQLiteCheckpointListener checkpointListener = this.mConnectionPoolLocked.getCheckpointListener();
            return checkpointListener;
        }
    }

    public final SQLiteTrace getTraceCallback() {
        SQLiteTrace traceCallback;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            traceCallback = this.mConnectionPoolLocked.getTraceCallback();
        }
        return traceCallback;
    }

    public final boolean inTransaction() {
        acquireReference();
        try {
            return getThreadSession().hasTransaction();
        } finally {
            releaseReference();
        }
    }

    public final boolean isDbLockedByCurrentThread() {
        acquireReference();
        try {
            return getThreadSession().hasConnection();
        } finally {
            releaseReference();
        }
    }

    public final boolean isWriteAheadLoggingEnabled() {
        boolean z;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if ((this.mConfigurationLocked.openFlags & 536870912) != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void setTransactionSuccessful() {
        acquireReference();
        try {
            getThreadSession().setTransactionSuccessful();
        } finally {
            releaseReference();
        }
    }

    public final String toString() {
        return "SQLiteDatabase: " + getPath();
    }

    static {
        SQLiteGlobal.loadLib();
    }

    private void throwIfNotOpenLocked() {
        if (this.mConnectionPoolLocked == null) {
            throw new IllegalStateException("The database '" + this.mConfigurationLocked.label + "' is not open.");
        }
    }

    public final void disableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if ((this.mConfigurationLocked.openFlags & 536870912) != 0) {
                this.mConfigurationLocked.openFlags &= -536870913;
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (RuntimeException e2) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                    sQLiteDatabaseConfiguration.openFlags = 536870912 | sQLiteDatabaseConfiguration.openFlags;
                    throw e2;
                }
            }
        }
    }

    public final void reopenReadWrite() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (isReadOnlyLocked()) {
                int i = this.mConfigurationLocked.openFlags;
                this.mConfigurationLocked.openFlags = (this.mConfigurationLocked.openFlags & -2) | 0;
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (RuntimeException e2) {
                    this.mConfigurationLocked.openFlags = i;
                    throw e2;
                }
            }
        }
    }

    public final boolean enableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if ((this.mConfigurationLocked.openFlags & 536870912) != 0) {
                return true;
            }
            if (isReadOnlyLocked()) {
                return false;
            }
            if (this.mConfigurationLocked.isInMemoryDb()) {
                Log.i("WCDB.SQLiteDatabase", "can't enable WAL for memory databases.");
                return false;
            } else if (this.mHasAttachedDbsLocked) {
                Log.i("WCDB.SQLiteDatabase", "this database: " + this.mConfigurationLocked.label + " has attached databases. can't  enable WAL.");
                return false;
            } else {
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                sQLiteDatabaseConfiguration.openFlags = 536870912 | sQLiteDatabaseConfiguration.openFlags;
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                    return true;
                } catch (RuntimeException e2) {
                    this.mConfigurationLocked.openFlags &= -536870913;
                    throw e2;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = rawQuery("pragma database_list;", null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r1.moveToNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r0.add(new android.util.Pair(r1.getString(1), r1.getString(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        releaseReference();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r1 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005c, code lost:
        releaseReference();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055 A[SYNTHETIC, Splitter:B:30:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.mLock
            monitor-enter(r1)
            com.tencent.wcdb.database.SQLiteConnectionPool r2 = r5.mConnectionPoolLocked     // Catch:{ all -> 0x0060 }
            r3 = 0
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            return r3
        L_0x000f:
            boolean r2 = r5.mHasAttachedDbsLocked     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x0023
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = "main"
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r4 = r5.mConfigurationLocked     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = r4.path     // Catch:{ all -> 0x0060 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0060 }
            r0.add(r2)     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            return r0
        L_0x0023:
            r5.acquireReference()     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "pragma database_list;"
            com.tencent.wcdb.Cursor r1 = r5.rawQuery(r1, r3)     // Catch:{ all -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0046
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x004f }
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch:{ all -> 0x004f }
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch:{ all -> 0x004f }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x004f }
            r0.add(r2)     // Catch:{ all -> 0x004f }
            goto L_0x002d
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ all -> 0x0059 }
        L_0x004b:
            r5.releaseReference()
            return r0
        L_0x004f:
            r0 = move-exception
            goto L_0x0053
        L_0x0051:
            r0 = move-exception
            r1 = r3
        L_0x0053:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005b
        L_0x0059:
            r0 = move-exception
            goto L_0x005c
        L_0x005b:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x005c:
            r5.releaseReference()
            throw r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.getAttachedDbs():java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        releaseReference();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.util.ArrayList();
        r0.add(new android.util.Pair("main", getPath()));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9 A[Catch:{ all -> 0x00a3, all -> 0x0027 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isDatabaseIntegrityOk() {
        /*
            r7 = this;
            r7.acquireReference()
            java.util.List r0 = r7.getAttachedDbs()     // Catch:{ SQLiteException -> 0x002a }
            if (r0 == 0) goto L_0x000a
            goto L_0x003d
        L_0x000a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLiteException -> 0x002a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x002a }
            java.lang.String r2 = "databaselist for: "
            r1.<init>(r2)     // Catch:{ SQLiteException -> 0x002a }
            java.lang.String r2 = r7.getPath()     // Catch:{ SQLiteException -> 0x002a }
            r1.append(r2)     // Catch:{ SQLiteException -> 0x002a }
            java.lang.String r2 = " couldn't be retrieved. probably because the database is closed"
            r1.append(r2)     // Catch:{ SQLiteException -> 0x002a }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x002a }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x002a }
            throw r0     // Catch:{ SQLiteException -> 0x002a }
        L_0x0027:
            r0 = move-exception
            goto L_0x00b2
        L_0x002a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0027 }
            r0.<init>()     // Catch:{ all -> 0x0027 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "main"
            java.lang.String r3 = r7.getPath()     // Catch:{ all -> 0x0027 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
            r0.add(r1)     // Catch:{ all -> 0x0027 }
        L_0x003d:
            r1 = 0
            r2 = 0
        L_0x003f:
            int r3 = r0.size()     // Catch:{ all -> 0x0027 }
            if (r2 >= r3) goto L_0x00ad
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x0027 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0027 }
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            java.lang.String r6 = "PRAGMA "
            r5.<init>(r6)     // Catch:{ all -> 0x00a5 }
            java.lang.Object r6 = r3.first     // Catch:{ all -> 0x00a5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00a5 }
            r5.append(r6)     // Catch:{ all -> 0x00a5 }
            java.lang.String r6 = ".integrity_check(1);"
            r5.append(r6)     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00a5 }
            com.tencent.wcdb.database.SQLiteStatement r5 = r7.compileStatement(r5)     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = r5.simpleQueryForString()     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "ok"
            boolean r6 = com.tencent.wcdb.DatabaseUtils.objectEquals(r4, r6)     // Catch:{ all -> 0x00a3 }
            if (r6 != 0) goto L_0x009b
            java.lang.String r0 = "WCDB.SQLiteDatabase"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "PRAGMA integrity_check on "
            r2.<init>(r6)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r3 = r3.second     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a3 }
            r2.append(r3)     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = " returned: "
            r2.append(r3)     // Catch:{ all -> 0x00a3 }
            r2.append(r4)     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a3 }
            com.tencent.wcdb.support.Log.e(r0, r2)     // Catch:{ all -> 0x00a3 }
            if (r5 == 0) goto L_0x0097
            r5.close()     // Catch:{ all -> 0x0027 }
        L_0x0097:
            r7.releaseReference()
            return r1
        L_0x009b:
            if (r5 == 0) goto L_0x00a0
            r5.close()     // Catch:{ all -> 0x0027 }
        L_0x00a0:
            int r2 = r2 + 1
            goto L_0x003f
        L_0x00a3:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a5:
            r0 = move-exception
            r5 = r4
        L_0x00a7:
            if (r5 == 0) goto L_0x00ac
            r5.close()     // Catch:{ all -> 0x0027 }
        L_0x00ac:
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x00ad:
            r7.releaseReference()
            r0 = 1
            return r0
        L_0x00b2:
            r7.releaseReference()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.isDatabaseIntegrityOk():boolean");
    }

    public final void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, true);
    }

    public final void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, false);
    }

    public final void execSQL(String str) throws SQLException {
        executeSql(str, null, null);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory) {
        return openDatabase(":memory:", cursorFactory, 268435456);
    }

    public static SQLiteDatabase openOrCreateMemoryDatabaseInWalMode(CursorFactory cursorFactory) {
        return openDatabase(":memory:", null, null, cursorFactory, 805306368, null, 0);
    }

    /* access modifiers changed from: package-private */
    public final int getThreadDefaultConnectionFlags(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        if (isMainThread()) {
            return i | 4;
        }
        return i;
    }

    public final boolean needUpgrade(int i) {
        if (i > getVersion()) {
            return true;
        }
        return false;
    }

    public final void setAsyncCheckpointEnabled(boolean z) {
        SQLiteAsyncCheckpointer sQLiteAsyncCheckpointer;
        if (z) {
            sQLiteAsyncCheckpointer = new SQLiteAsyncCheckpointer();
        } else {
            sQLiteAsyncCheckpointer = null;
        }
        setCheckpointCallback(sQLiteAsyncCheckpointer);
    }

    public final void setTraceCallback(SQLiteTrace sQLiteTrace) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConnectionPoolLocked.setTraceCallback(sQLiteTrace);
        }
    }

    public final boolean yieldIfContendedSafely(long j) {
        return yieldIfContendedHelper(true, j);
    }

    private void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            if (this.mConnectionPoolLocked != null) {
                this.mConnectionPoolLocked.collectDbStats(arrayList);
            }
        }
    }

    public final SQLiteStatement compileStatement(String str) throws SQLException {
        acquireReference();
        try {
            return new SQLiteStatement(this, str, null);
        } finally {
            releaseReference();
        }
    }

    public final void setPageSize(long j) {
        execSQL("PRAGMA page_size = " + j);
    }

    public final void setVersion(int i) {
        execSQL("PRAGMA user_version = " + i);
    }

    private void dispose(boolean z) {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            sQLiteConnectionPool = this.mConnectionPoolLocked;
            this.mConnectionPoolLocked = null;
        }
        if (!z) {
            synchronized (sActiveDatabases) {
                sActiveDatabases.remove(this);
            }
            if (sQLiteConnectionPool != null) {
                sQLiteConnectionPool.close();
            }
        }
    }

    public static String findEditTable(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(32);
            int indexOf2 = str.indexOf(44);
            if (indexOf > 0 && (indexOf < indexOf2 || indexOf2 < 0)) {
                return str.substring(0, indexOf);
            }
            if (indexOf2 <= 0 || (indexOf2 >= indexOf && indexOf >= 0)) {
                return str;
            }
            return str.substring(0, indexOf2);
        }
        throw new IllegalStateException("Invalid tables");
    }

    private Set<String> keySet(ContentValues contentValues) {
        if (Build.VERSION.SDK_INT >= 11) {
            return contentValues.keySet();
        }
        try {
            Field declaredField = Class.forName("android.content.ContentValues").getDeclaredField("mValues");
            declaredField.setAccessible(true);
            return ((HashMap) declaredField.get(contentValues)).keySet();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void setCheckpointCallback(SQLiteCheckpointListener sQLiteCheckpointListener) {
        boolean z;
        if (sQLiteCheckpointListener != null) {
            z = true;
        } else {
            z = false;
        }
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (this.mConfigurationLocked.customWALHookEnabled != z) {
                this.mConfigurationLocked.customWALHookEnabled = z;
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (RuntimeException e2) {
                    this.mConfigurationLocked.customWALHookEnabled = true ^ z;
                    throw e2;
                }
            }
            this.mConnectionPoolLocked.setCheckpointListener(sQLiteCheckpointListener);
        }
    }

    public final void setForeignKeyConstraintsEnabled(boolean z) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (this.mConfigurationLocked.foreignKeyConstraintsEnabled != z) {
                this.mConfigurationLocked.foreignKeyConstraintsEnabled = z;
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (RuntimeException e2) {
                    this.mConfigurationLocked.foreignKeyConstraintsEnabled = !z;
                    throw e2;
                }
            }
        }
    }

    public final void setLocale(Locale locale) {
        if (locale != null) {
            synchronized (this.mLock) {
                throwIfNotOpenLocked();
                Locale locale2 = this.mConfigurationLocked.locale;
                this.mConfigurationLocked.locale = locale;
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (RuntimeException e2) {
                    this.mConfigurationLocked.locale = locale2;
                    throw e2;
                }
            }
            return;
        }
        throw new IllegalArgumentException("locale must not be null.");
    }

    public final void setMaxSqlCacheSize(int i) {
        if (i > 100 || i < 0) {
            throw new IllegalStateException("expected value between 0 and 100");
        }
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            int i2 = this.mConfigurationLocked.maxSqlCacheSize;
            this.mConfigurationLocked.maxSqlCacheSize = i;
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (RuntimeException e2) {
                this.mConfigurationLocked.maxSqlCacheSize = i2;
                throw e2;
            }
        }
    }

    public final long setMaximumSize(long j) {
        long pageSize = getPageSize();
        long j2 = j / pageSize;
        if (j % pageSize != 0) {
            j2++;
        }
        return DatabaseUtils.longForQuery(this, "PRAGMA max_page_count = " + j2, null) * pageSize;
    }

    public final void setSynchronousMode(int i) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            int i2 = this.mConfigurationLocked.synchronousMode;
            if (i2 != i) {
                this.mConfigurationLocked.synchronousMode = i;
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (RuntimeException e2) {
                    this.mConfigurationLocked.synchronousMode = i2;
                    throw e2;
                }
            }
        }
    }

    public static boolean deleteDatabase(File file) {
        if (file != null) {
            boolean delete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                final String str = file.getName() + "-mj";
                File[] listFiles = parentFile.listFiles(new FileFilter() {
                    public final boolean accept(File file) {
                        return file.getName().startsWith(str);
                    }
                });
                if (listFiles != null) {
                    for (File delete2 : listFiles) {
                        delete |= delete2.delete();
                    }
                }
            }
            return delete;
        }
        throw new IllegalArgumentException("file must not be null");
    }

    public final void releaseNativeConnection(long j, Exception exc) {
        getThreadSession().releaseConnectionForNativeHandle(exc);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file.getPath(), cursorFactory);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, CursorFactory cursorFactory) {
        return openDatabase(str, null, null, cursorFactory, 805306368, null, 0);
    }

    public final void execSQL(String str, Object[] objArr) throws SQLException {
        executeSql(str, objArr, null);
    }

    public final Cursor rawQuery(String str, Object[] objArr) {
        return rawQueryWithFactory(null, str, objArr, null, null);
    }

    public final void setChangeListener(SQLiteChangeListener sQLiteChangeListener, boolean z) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConnectionPoolLocked.setChangeListener(sQLiteChangeListener, z);
        }
    }

    private void beginTransaction(SQLiteTransactionListener sQLiteTransactionListener, boolean z) {
        int i;
        acquireReference();
        try {
            SQLiteSession threadSession = getThreadSession();
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            threadSession.beginTransaction(i, sQLiteTransactionListener, getThreadDefaultConnectionFlags(false), null);
        } finally {
            releaseReference();
        }
    }

    public static void dumpAll(Printer printer, boolean z) {
        Iterator<SQLiteDatabase> it2 = getActiveDatabases().iterator();
        while (it2.hasNext()) {
            it2.next().dump(printer, z);
        }
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        acquireReference();
        try {
            return getThreadSession().yieldTransaction(j, z, null);
        } finally {
            releaseReference();
        }
    }

    public final void dump(Printer printer, boolean z) {
        synchronized (this.mLock) {
            if (this.mConnectionPoolLocked != null) {
                this.mConnectionPoolLocked.dump(printer, z);
            }
        }
    }

    public final Pair<Integer, Integer> walCheckpoint(String str, boolean z) {
        int i;
        acquireReference();
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        try {
            return getThreadSession().walCheckpoint(str, i);
        } finally {
            releaseReference();
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory) {
        return openDatabase(str, null, null, cursorFactory, 268435456, null, 0);
    }

    public final void execSQL(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        executeSql(str, objArr, cancellationSignal);
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, cursorFactory, i, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cursorFactory, 268435456, databaseErrorHandler);
    }

    public final long insertOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public final long replaceOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 120 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openInner(byte[] r3, com.tencent.wcdb.database.SQLiteCipherSpec r4, int r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r1 = r2.mConfigurationLocked     // Catch:{ all -> 0x001c }
            com.tencent.wcdb.database.SQLiteConnectionPool r3 = com.tencent.wcdb.database.SQLiteConnectionPool.open(r2, r1, r3, r4, r5)     // Catch:{ all -> 0x001c }
            r2.mConnectionPoolLocked = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteDatabase, java.lang.Object> r3 = sActiveDatabases
            monitor-enter(r3)
            java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteDatabase, java.lang.Object> r4 = sActiveDatabases     // Catch:{ all -> 0x0017 }
            r5 = 0
            r4.put(r2, r5)     // Catch:{ all -> 0x0017 }
            monitor-exit(r3)     // Catch:{ all -> 0x0017 }
            return
        L_0x0017:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0017 }
            throw r4
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r3
        L_0x001c:
            r3 = move-exception
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.openInner(byte[], com.tencent.wcdb.database.SQLiteCipherSpec, int):void");
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, null, null, cursorFactory, 805306368, null, i);
    }

    public final long insert(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        } catch (SQLException e3) {
            Log.e("WCDB.SQLiteDatabase", "Error inserting %s: %s", contentValues, e3);
            return -1;
        }
    }

    public final Cursor rawQuery(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        return rawQueryWithFactory(null, str, objArr, null, cancellationSignal);
    }

    private int executeSql(String str, Object[] objArr, CancellationSignal cancellationSignal) throws SQLException {
        SQLiteStatement sQLiteStatement;
        acquireReference();
        try {
            if (DatabaseUtils.getSqlStatementType(str) == 3) {
                boolean z = false;
                synchronized (this.mLock) {
                    if (!this.mHasAttachedDbsLocked) {
                        this.mHasAttachedDbsLocked = true;
                        z = true;
                    }
                }
                if (z) {
                    disableWriteAheadLogging();
                }
            }
            sQLiteStatement = new SQLiteStatement(this, str, objArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete(cancellationSignal);
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        onCorruption();
        openInner(r2, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        com.tencent.wcdb.support.Log.e("WCDB.SQLiteDatabase", "Failed to open database '" + getLabel() + "'.", r2);
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0006 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void open(byte[] r2, com.tencent.wcdb.database.SQLiteCipherSpec r3, int r4) {
        /*
            r1 = this;
            r1.openInner(r2, r3, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0006 }
            return
        L_0x0004:
            r2 = move-exception
            goto L_0x000d
        L_0x0006:
            r1.onCorruption()     // Catch:{ SQLiteException -> 0x0004 }
            r1.openInner(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0004 }
            return
        L_0x000d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to open database '"
            r3.<init>(r4)
            java.lang.String r4 = r1.getLabel()
            r3.append(r4)
            java.lang.String r4 = "'."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r2
            java.lang.String r0 = "WCDB.SQLiteDatabase"
            com.tencent.wcdb.support.Log.e(r0, r3, r4)
            r1.close()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.open(byte[], com.tencent.wcdb.database.SQLiteCipherSpec, int):void");
    }

    public final long acquireNativeConnectionHandle(String str, boolean z, boolean z2) {
        int i;
        if (str == null) {
            str = "unnamedNative";
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        if (z2) {
            i |= 4;
        }
        long nativeHandle = getThreadSession().acquireConnectionForNativeHandle(i).getNativeHandle(str);
        if (nativeHandle != 0) {
            return nativeHandle;
        }
        throw new IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    public final void addCustomFunction(String str, int i, CustomFunction customFunction) {
        SQLiteCustomFunction sQLiteCustomFunction = new SQLiteCustomFunction(str, i, customFunction);
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConfigurationLocked.customFunctions.add(sQLiteCustomFunction);
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (RuntimeException e2) {
                this.mConfigurationLocked.customFunctions.remove(sQLiteCustomFunction);
                throw e2;
            }
        }
    }

    public final long replace(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        } catch (SQLException e3) {
            Log.e("WCDB.SQLiteDatabase", "Error inserting " + contentValues, e3);
            return -1;
        }
    }

    public final int delete(String str, String str2, String[] strArr) {
        SQLiteStatement sQLiteStatement;
        String str3;
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(str);
            if (!TextUtils.isEmpty(str2)) {
                str3 = " WHERE " + str2;
            } else {
                str3 = "";
            }
            sb.append(str3);
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), strArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, null, null, cursorFactory, 268435456, null, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, boolean z) {
        int i;
        if (z) {
            i = 805306368;
        } else {
            i = 268435456;
        }
        return openDatabase(str, null, null, cursorFactory, i, null, 0);
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, null, null, cursorFactory, i, databaseErrorHandler, 0);
    }

    public final Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2) {
        return rawQueryWithFactory(cursorFactory, str, objArr, str2, null);
    }

    public final int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    private SQLiteDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        this.mCursorFactory = cursorFactory;
        this.mErrorHandler = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler(true) : databaseErrorHandler;
        this.mConfigurationLocked = new SQLiteDatabaseConfiguration(str, i);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 805306368, null, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file.getPath(), bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, 0);
    }

    public final long insertWithOnConflict(String str, String str2, ContentValues contentValues, int i) {
        int i2;
        SQLiteStatement sQLiteStatement;
        String str3;
        String str4;
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            Object[] objArr = null;
            if (contentValues == null || contentValues.size() <= 0) {
                i2 = 0;
            } else {
                i2 = contentValues.size();
            }
            if (i2 > 0) {
                objArr = new Object[i2];
                int i3 = 0;
                for (String next : keySet(contentValues)) {
                    if (i3 > 0) {
                        str4 = ",";
                    } else {
                        str4 = "";
                    }
                    sb.append(str4);
                    sb.append(next);
                    objArr[i3] = contentValues.get(next);
                    i3++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                for (int i4 = 0; i4 < i2; i4++) {
                    if (i4 > 0) {
                        str3 = ",?";
                    } else {
                        str3 = "?";
                    }
                    sb.append(str3);
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
            }
            sb.append(')');
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            long executeInsert = sQLiteStatement.executeInsert();
            sQLiteStatement.close();
            releaseReference();
            return executeInsert;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler, int i2) {
        return openDatabase(str, null, null, cursorFactory, i, databaseErrorHandler, i2);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file.getPath(), bArr, sQLiteCipherSpec, cursorFactory, databaseErrorHandler, 0);
    }

    public final Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2, CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2, cancellationSignal);
            if (cursorFactory == null) {
                cursorFactory = this.mCursorFactory;
            }
            return sQLiteDirectCursorDriver.query(cursorFactory, objArr);
        } finally {
            releaseReference();
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openOrCreateDatabase(file.getPath(), bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, i);
    }

    public final int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        int i2;
        SQLiteStatement sQLiteStatement;
        String str3;
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            if (strArr == null) {
                i2 = size;
            } else {
                i2 = strArr.length + size;
            }
            Object[] objArr = new Object[i2];
            int i3 = 0;
            for (String next : keySet(contentValues)) {
                if (i3 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(next);
                objArr[i3] = contentValues.get(next);
                sb.append("=?");
                i3++;
            }
            if (strArr != null) {
                for (int i4 = size; i4 < i2; i4++) {
                    objArr[i4] = strArr[i4 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public static SQLiteDatabase openDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, i, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openOrCreateDatabase(file.getPath(), bArr, sQLiteCipherSpec, cursorFactory, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 805306368, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 268435456, databaseErrorHandler, i);
    }

    public final Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, null);
    }

    public static SQLiteDatabase openDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler, int i2) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, i, cursorFactory, databaseErrorHandler);
        sQLiteDatabase.open(bArr, sQLiteCipherSpec, i2);
        return sQLiteDatabase;
    }

    public final Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, str6);
    }

    public final Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return queryWithFactory(null, z, str, strArr, str2, objArr, str3, str4, str5, str6, null);
    }

    public final Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return queryWithFactory(cursorFactory, z, str, strArr, str2, objArr, str3, str4, str5, str6, null);
    }

    public final Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        return queryWithFactory(null, z, str, strArr, str2, objArr, str3, str4, str5, str6, cancellationSignal);
    }

    public final Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), objArr, findEditTable(str), cancellationSignal);
        } finally {
            releaseReference();
        }
    }
}
