package com.tencent.wcdb.database;

import android.os.SystemClock;
import android.util.Printer;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;
import com.tencent.wcdb.support.PrefixPrinter;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

public final class SQLiteConnectionPool implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> mAcquiredConnections = new WeakHashMap<>();
    private final ArrayList<SQLiteConnection> mAvailableNonPrimaryConnections = new ArrayList<>();
    private SQLiteConnection mAvailablePrimaryConnection;
    private volatile SQLiteChangeListener mChangeListener;
    private volatile SQLiteCheckpointListener mCheckpointListener;
    private SQLiteCipherSpec mCipher;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final AtomicBoolean mConnectionLeaked = new AtomicBoolean();
    private ConnectionWaiter mConnectionWaiterPool;
    private ConnectionWaiter mConnectionWaiterQueue;
    private final WeakReference<SQLiteDatabase> mDB;
    private boolean mIsOpen;
    public final Object mLock = new Object();
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private byte[] mPassword;
    private volatile SQLiteTrace mTraceCallback;

    enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    static final class ConnectionWaiter {
        public SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public RuntimeException mException;
        public ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public String mSql;
        public long mStartTime;
        public Thread mThread;
        public boolean mWantPrimaryConnection;

        private ConnectionWaiter() {
        }
    }

    private static int getPriority(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteChangeListener getChangeListener() {
        return this.mChangeListener;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteCheckpointListener getCheckpointListener() {
        return this.mCheckpointListener;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteTrace getTraceCallback() {
        return this.mTraceCallback;
    }

    private void discardAcquiredConnectionsLocked() {
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.DISCARD);
    }

    public final void close() {
        dispose(false);
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
        if (this.mAvailablePrimaryConnection != null) {
            closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
            this.mAvailablePrimaryConnection = null;
        }
    }

    private void open() {
        this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
        this.mIsOpen = true;
    }

    private void throwIfClosedLocked() {
        if (!this.mIsOpen) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        for (int i = 0; i < size; i++) {
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.get(i));
        }
        this.mAvailableNonPrimaryConnections.clear();
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        while (true) {
            int i = size - 1;
            if (size > this.mMaxConnectionPoolSize - 1) {
                closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.remove(i));
                size = i;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        return "SQLiteConnectionPool: " + this.mConfiguration.path;
    }

    /* access modifiers changed from: package-private */
    public final void onConnectionLeaked() {
        Log.w("WCDB.SQLiteConnectionPool", "A SQLiteConnection object for database '" + this.mConfiguration.label + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.mConnectionLeaked.set(true);
    }

    private void reconfigureAllConnectionsLocked() {
        if (this.mAvailablePrimaryConnection != null) {
            try {
                this.mAvailablePrimaryConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e2) {
                Log.e("WCDB.SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.mAvailablePrimaryConnection, e2);
                closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
                this.mAvailablePrimaryConnection = null;
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i);
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e3) {
                Log.e("WCDB.SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection, e3);
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
                this.mAvailableNonPrimaryConnections.remove(i);
                size--;
                i--;
            }
            i++;
        }
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.RECONFIGURE);
    }

    private void wakeConnectionWaitersLocked() {
        SQLiteConnection sQLiteConnection;
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z2 = false;
        while (connectionWaiter != null) {
            boolean z3 = true;
            if (this.mIsOpen) {
                try {
                    if (connectionWaiter.mWantPrimaryConnection || z) {
                        sQLiteConnection = null;
                    } else {
                        sQLiteConnection = tryAcquireNonPrimaryConnectionLocked(connectionWaiter.mSql, connectionWaiter.mConnectionFlags);
                        if (sQLiteConnection == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnection == null && !z2) {
                        sQLiteConnection = tryAcquirePrimaryConnectionLocked(connectionWaiter.mConnectionFlags);
                        if (sQLiteConnection == null) {
                            z2 = true;
                        }
                    }
                    if (sQLiteConnection != null) {
                        connectionWaiter.mAssignedConnection = sQLiteConnection;
                    } else if (!z || !z2) {
                        z3 = false;
                    } else {
                        return;
                    }
                } catch (RuntimeException e2) {
                    connectionWaiter.mException = e2;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.mNext;
            if (z3) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = connectionWaiter3;
                } else {
                    this.mConnectionWaiterQueue = connectionWaiter3;
                }
                connectionWaiter.mNext = null;
                LockSupport.unpark(connectionWaiter.mThread);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setTraceCallback(SQLiteTrace sQLiteTrace) {
        this.mTraceCallback = sQLiteTrace;
    }

    public final void logConnectionPoolBusy(String str) {
        synchronized (this.mLock) {
            logConnectionPoolBusyLocked(str, 0, 0);
        }
    }

    private void closeConnectionAndLogExceptionsLocked(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.close();
        } catch (RuntimeException e2) {
            Log.e("WCDB.SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection + e2.getMessage());
        }
    }

    private void recycleConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        connectionWaiter.mNext = this.mConnectionWaiterPool;
        connectionWaiter.mThread = null;
        connectionWaiter.mSql = null;
        connectionWaiter.mAssignedConnection = null;
        connectionWaiter.mException = null;
        connectionWaiter.mNonce++;
        this.mConnectionWaiterPool = connectionWaiter;
    }

    /* access modifiers changed from: package-private */
    public final void setCheckpointListener(SQLiteCheckpointListener sQLiteCheckpointListener) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.mDB.get();
        if (this.mCheckpointListener != null) {
            this.mCheckpointListener.onDetach(sQLiteDatabase);
        }
        this.mCheckpointListener = sQLiteCheckpointListener;
        if (this.mCheckpointListener != null) {
            this.mCheckpointListener.onAttach(sQLiteDatabase);
        }
    }

    private void setMaxConnectionPoolSizeLocked(int i) {
        if (i <= 0) {
            if ((this.mConfiguration.openFlags & 536870912) != 0) {
                i = 4;
            } else {
                i = 1;
            }
        }
        this.mMaxConnectionPoolSize = i;
        Log.i("WCDB.SQLiteConnectionPool", "Max connection pool size is %d.", Integer.valueOf(this.mMaxConnectionPoolSize));
    }

    private SQLiteConnection tryAcquirePrimaryConnectionLocked(int i) {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            this.mAvailablePrimaryConnection = null;
            finishAcquireConnectionLocked(sQLiteConnection, i);
            return sQLiteConnection;
        }
        for (SQLiteConnection isPrimaryConnection : this.mAcquiredConnections.keySet()) {
            if (isPrimaryConnection.isPrimaryConnection()) {
                return null;
            }
        }
        SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        return openConnectionLocked;
    }

    public final void cancelConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        ConnectionWaiter connectionWaiter2;
        if (connectionWaiter.mAssignedConnection == null && connectionWaiter.mException == null) {
            ConnectionWaiter connectionWaiter3 = null;
            ConnectionWaiter connectionWaiter4 = this.mConnectionWaiterQueue;
            while (true) {
                ConnectionWaiter connectionWaiter5 = connectionWaiter4;
                connectionWaiter2 = connectionWaiter3;
                connectionWaiter3 = connectionWaiter5;
                if (connectionWaiter3 == connectionWaiter) {
                    break;
                }
                connectionWaiter4 = connectionWaiter3.mNext;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = connectionWaiter.mNext;
            } else {
                this.mConnectionWaiterQueue = connectionWaiter.mNext;
            }
            connectionWaiter.mException = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.mThread);
            wakeConnectionWaitersLocked();
        }
    }

    private void dispose(boolean z) {
        if (!z) {
            synchronized (this.mLock) {
                throwIfClosedLocked();
                this.mIsOpen = false;
                closeAvailableConnectionsAndLogExceptionsLocked();
                int size = this.mAcquiredConnections.size();
                if (size != 0) {
                    Log.i("WCDB.SQLiteConnectionPool", "The connection pool for " + this.mConfiguration.label + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                }
                wakeConnectionWaitersLocked();
            }
        }
    }

    private void markAcquiredConnectionsLocked(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (!this.mAcquiredConnections.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.mAcquiredConnections.size());
            for (Map.Entry next : this.mAcquiredConnections.entrySet()) {
                AcquiredConnectionStatus acquiredConnectionStatus2 = (AcquiredConnectionStatus) next.getValue();
                if (!(acquiredConnectionStatus == acquiredConnectionStatus2 || acquiredConnectionStatus2 == AcquiredConnectionStatus.DISCARD)) {
                    arrayList.add(next.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mAcquiredConnections.put(arrayList.get(i), acquiredConnectionStatus);
            }
        }
    }

    public final void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            if (this.mAvailablePrimaryConnection != null) {
                this.mAvailablePrimaryConnection.collectDbStats(arrayList);
            }
            Iterator<SQLiteConnection> it2 = this.mAvailableNonPrimaryConnections.iterator();
            while (it2.hasNext()) {
                it2.next().collectDbStats(arrayList);
            }
            for (SQLiteConnection collectDbStatsUnsafe : this.mAcquiredConnections.keySet()) {
                collectDbStatsUnsafe.collectDbStatsUnsafe(arrayList);
            }
        }
    }

    public final void releaseConnection(SQLiteConnection sQLiteConnection) {
        synchronized (this.mLock) {
            AcquiredConnectionStatus remove = this.mAcquiredConnections.remove(sQLiteConnection);
            if (remove == null) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            } else if (!this.mIsOpen) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else if (sQLiteConnection.isPrimaryConnection()) {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailablePrimaryConnection = sQLiteConnection;
                }
                wakeConnectionWaitersLocked();
            } else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailableNonPrimaryConnections.add(sQLiteConnection);
                }
                wakeConnectionWaitersLocked();
            }
        }
    }

    public final void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        boolean z;
        boolean z2;
        if (sQLiteDatabaseConfiguration != null) {
            synchronized (this.mLock) {
                throwIfClosedLocked();
                if (((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & 536870912) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.mAcquiredConnections.isEmpty()) {
                        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
                    } else {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                }
                if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (!this.mAcquiredConnections.isEmpty()) {
                        throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                }
                if (((this.mConfiguration.openFlags ^ sQLiteDatabaseConfiguration.openFlags) & 268435473) == 0) {
                    if (DatabaseUtils.objectEquals(this.mConfiguration.vfsName, sQLiteDatabaseConfiguration.vfsName)) {
                        this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                        setMaxConnectionPoolSizeLocked(0);
                        closeExcessConnectionsAndLogExceptionsLocked();
                        reconfigureAllConnectionsLocked();
                        wakeConnectionWaitersLocked();
                    }
                }
                if (z) {
                    closeAvailableConnectionsAndLogExceptionsLocked();
                }
                SQLiteConnection openConnectionLocked = openConnectionLocked(sQLiteDatabaseConfiguration, true);
                closeAvailableConnectionsAndLogExceptionsLocked();
                discardAcquiredConnectionsLocked();
                this.mAvailablePrimaryConnection = openConnectionLocked;
                this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                setMaxConnectionPoolSizeLocked(0);
                wakeConnectionWaitersLocked();
            }
            return;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z, int i) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        if (connectionWaiter != null) {
            int priority = getPriority(i);
            while (priority <= connectionWaiter.mPriority) {
                if (!z && connectionWaiter.mWantPrimaryConnection) {
                    connectionWaiter = connectionWaiter.mNext;
                    if (connectionWaiter == null) {
                        break;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.mNextConnectionId;
        this.mNextConnectionId = i + 1;
        return SQLiteConnection.open(this, sQLiteDatabaseConfiguration, i, z, this.mPassword, this.mCipher);
    }

    /* access modifiers changed from: package-private */
    public final void notifyCheckpoint(String str, int i) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.mDB.get();
        SQLiteCheckpointListener sQLiteCheckpointListener = this.mCheckpointListener;
        if (sQLiteCheckpointListener != null && sQLiteDatabase != null) {
            sQLiteCheckpointListener.onWALCommit(sQLiteDatabase, str, i);
        }
    }

    private void finishAcquireConnectionLocked(SQLiteConnection sQLiteConnection, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            sQLiteConnection.setOnlyAllowReadOnlyOperations(z);
            this.mAcquiredConnections.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e2) {
            Log.e("WCDB.SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i);
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            throw e2;
        }
    }

    private boolean recycleConnectionLocked(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e2) {
                Log.e("WCDB.SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e2);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        closeConnectionAndLogExceptionsLocked(sQLiteConnection);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void setChangeListener(SQLiteChangeListener sQLiteChangeListener, boolean z) {
        boolean z2;
        if (sQLiteChangeListener != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            z = false;
        }
        synchronized (this.mLock) {
            if (!(this.mConfiguration.updateNotificationEnabled == z2 && this.mConfiguration.updateNotificationRowID == z)) {
                this.mConfiguration.updateNotificationEnabled = z2;
                this.mConfiguration.updateNotificationRowID = z;
                closeExcessConnectionsAndLogExceptionsLocked();
                reconfigureAllConnectionsLocked();
            }
            this.mChangeListener = sQLiteChangeListener;
        }
    }

    public final boolean shouldYieldConnection(SQLiteConnection sQLiteConnection, int i) {
        synchronized (this.mLock) {
            if (!this.mAcquiredConnections.containsKey(sQLiteConnection)) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            } else if (!this.mIsOpen) {
                return false;
            } else {
                boolean isSessionBlockingImportantConnectionWaitersLocked = isSessionBlockingImportantConnectionWaitersLocked(sQLiteConnection.isPrimaryConnection(), i);
                return isSessionBlockingImportantConnectionWaitersLocked;
            }
        }
    }

    private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String str, int i) {
        int size = this.mAvailableNonPrimaryConnections.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i2);
                if (sQLiteConnection.isPreparedStatementInCache(str)) {
                    this.mAvailableNonPrimaryConnections.remove(i2);
                    finishAcquireConnectionLocked(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection remove = this.mAvailableNonPrimaryConnections.remove(size - 1);
            finishAcquireConnectionLocked(remove, i);
            return remove;
        }
        int size2 = this.mAcquiredConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size2++;
        }
        if (size2 >= this.mMaxConnectionPoolSize) {
            return null;
        }
        SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, false);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        return openConnectionLocked;
    }

    public final void dump(Printer printer, boolean z) {
        Printer create = PrefixPrinter.create(printer, "    ");
        synchronized (this.mLock) {
            printer.println("Connection pool for " + this.mConfiguration.path + ":");
            StringBuilder sb = new StringBuilder("  Open: ");
            sb.append(this.mIsOpen);
            printer.println(sb.toString());
            printer.println("  Max connections: " + this.mMaxConnectionPoolSize);
            printer.println("  Available primary connection:");
            if (this.mAvailablePrimaryConnection != null) {
                this.mAvailablePrimaryConnection.dump(create, z);
            } else {
                create.println("<none>");
            }
            printer.println("  Available non-primary connections:");
            int i = 0;
            if (!this.mAvailableNonPrimaryConnections.isEmpty()) {
                int size = this.mAvailableNonPrimaryConnections.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.mAvailableNonPrimaryConnections.get(i2).dump(create, z);
                }
            } else {
                create.println("<none>");
            }
            printer.println("  Acquired connections:");
            if (!this.mAcquiredConnections.isEmpty()) {
                for (Map.Entry next : this.mAcquiredConnections.entrySet()) {
                    ((SQLiteConnection) next.getKey()).dumpUnsafe(create, z);
                    create.println("  Status: " + next.getValue());
                }
            } else {
                create.println("<none>");
            }
            printer.println("  Connection waiters:");
            if (this.mConnectionWaiterQueue != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                while (connectionWaiter != null) {
                    create.println(i + ": waited for " + (uptimeMillis - connectionWaiter.mStartTime) + " ms - thread=" + connectionWaiter.mThread + ", priority=" + connectionWaiter.mPriority + ", sql='" + connectionWaiter.mSql + "'");
                    connectionWaiter = connectionWaiter.mNext;
                    i++;
                }
            } else {
                create.println("<none>");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void traceExecute(String str, int i, long j) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.mDB.get();
        SQLiteTrace sQLiteTrace = this.mTraceCallback;
        if (sQLiteTrace != null && sQLiteDatabase != null) {
            sQLiteTrace.onSQLExecuted(sQLiteDatabase, str, i, j);
        }
    }

    private SQLiteConnectionPool(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i) {
        this.mDB = new WeakReference<>(sQLiteDatabase);
        this.mConfiguration = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        setMaxConnectionPoolSizeLocked(i);
    }

    public final SQLiteConnection acquireConnection(String str, int i, CancellationSignal cancellationSignal) {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        SQLiteConnection waitForConnection = waitForConnection(str, i, cancellationSignal);
        if (this.mTraceCallback != null) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.mDB.get();
            if (sQLiteDatabase != null) {
                if ((i & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.mTraceCallback.onConnectionObtained(sQLiteDatabase, str, uptimeMillis2, z);
            }
        }
        return waitForConnection;
    }

    private void logConnectionPoolBusyLocked(String str, long j, int i) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (j != 0) {
            Thread currentThread = Thread.currentThread();
            sb.append("The connection pool for database '");
            sb.append(this.mConfiguration.label);
            sb.append("' has been unable to grant a connection to thread ");
            sb.append(currentThread.getId());
            sb.append(" (");
            sb.append(currentThread.getName());
            sb.append(") ");
            sb.append("with flags 0x");
            sb.append(Integer.toHexString(i));
            sb.append(" for ");
            sb.append(((float) j) * 0.001f);
            sb.append(" seconds.\n");
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (!this.mAcquiredConnections.isEmpty()) {
            i2 = 0;
            for (SQLiteConnection describeCurrentOperationUnsafe : this.mAcquiredConnections.keySet()) {
                String describeCurrentOperationUnsafe2 = describeCurrentOperationUnsafe.describeCurrentOperationUnsafe();
                if (describeCurrentOperationUnsafe2 != null) {
                    arrayList.add(describeCurrentOperationUnsafe2);
                    i3++;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = 0;
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size++;
        }
        sb.append("Connections: ");
        sb.append(i3);
        sb.append(" active, ");
        sb.append(i2);
        sb.append(" idle, ");
        sb.append(size);
        sb.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append("  ");
                sb.append((String) it2.next());
                sb.append("\n");
            }
        }
        String sb2 = sb.toString();
        Log.w("WCDB.SQLiteConnectionPool", sb2);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.mDB.get();
        if (sQLiteDatabase != null && this.mTraceCallback != null) {
            this.mTraceCallback.onConnectionPoolBusy(sQLiteDatabase, str, arrayList, sb2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r10 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r10.setOnCancelListener(new com.tencent.wcdb.database.SQLiteConnectionPool.AnonymousClass1(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r6 = r1.mStartTime + 3000;
        r2 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r9.mConnectionLeaked.compareAndSet(true, false) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        r8 = r9.mLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        wakeConnectionWaitersLocked();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r2 * 1000000);
        java.lang.Thread.interrupted();
        r2 = r9.mLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0093, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throwIfClosedLocked();
        r3 = r1.mAssignedConnection;
        r8 = r1.mException;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009b, code lost:
        if (r3 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009d, code lost:
        if (r8 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        r15 = android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a6, code lost:
        if (r15 >= r6) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a8, code lost:
        r15 = r15 - r6;
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ac, code lost:
        logConnectionPoolBusyLocked(r19, r15 - r1.mStartTime, r0);
        r6 = r15 + 3000;
        r15 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ba, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bb, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bd, code lost:
        recycleConnectionWaiterLocked(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c0, code lost:
        if (r3 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c2, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c3, code lost:
        if (r10 == null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c5, code lost:
        r10.setOnCancelListener(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c8, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ce, code lost:
        if (r10 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00d0, code lost:
        r10.setOnCancelListener(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.wcdb.database.SQLiteConnection waitForConnection(java.lang.String r19, int r20, com.tencent.wcdb.support.CancellationSignal r21) {
        /*
            r18 = this;
            r9 = r18
            r0 = r20
            r10 = r21
            r1 = r0 & 2
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x000e
            r6 = 1
            goto L_0x000f
        L_0x000e:
            r6 = 0
        L_0x000f:
            java.lang.Object r13 = r9.mLock
            monitor-enter(r13)
            r18.throwIfClosedLocked()     // Catch:{ all -> 0x00d4 }
            if (r10 == 0) goto L_0x001a
            r21.throwIfCanceled()     // Catch:{ all -> 0x00d4 }
        L_0x001a:
            r14 = 0
            if (r6 != 0) goto L_0x0022
            com.tencent.wcdb.database.SQLiteConnection r1 = r18.tryAcquireNonPrimaryConnectionLocked(r19, r20)     // Catch:{ all -> 0x00d4 }
            goto L_0x0023
        L_0x0022:
            r1 = r14
        L_0x0023:
            if (r1 != 0) goto L_0x0029
            com.tencent.wcdb.database.SQLiteConnection r1 = r9.tryAcquirePrimaryConnectionLocked(r0)     // Catch:{ all -> 0x00d4 }
        L_0x0029:
            if (r1 == 0) goto L_0x002d
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
            return r1
        L_0x002d:
            int r15 = getPriority(r20)     // Catch:{ all -> 0x00d4 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00d4 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d4 }
            r1 = r18
            r5 = r15
            r7 = r19
            r8 = r20
            com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionWaiter r1 = r1.obtainConnectionWaiterLocked(r2, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x00d4 }
            com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionWaiter r2 = r9.mConnectionWaiterQueue     // Catch:{ all -> 0x00d4 }
            r3 = r14
        L_0x0047:
            if (r2 == 0) goto L_0x0058
            int r4 = r2.mPriority     // Catch:{ all -> 0x00d4 }
            if (r15 <= r4) goto L_0x0050
            r1.mNext = r2     // Catch:{ all -> 0x00d4 }
            goto L_0x0058
        L_0x0050:
            com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionWaiter r3 = r2.mNext     // Catch:{ all -> 0x00d4 }
            r17 = r3
            r3 = r2
            r2 = r17
            goto L_0x0047
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            r3.mNext = r1     // Catch:{ all -> 0x00d4 }
            goto L_0x005f
        L_0x005d:
            r9.mConnectionWaiterQueue = r1     // Catch:{ all -> 0x00d4 }
        L_0x005f:
            int r2 = r1.mNonce     // Catch:{ all -> 0x00d4 }
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
            if (r10 == 0) goto L_0x006c
            com.tencent.wcdb.database.SQLiteConnectionPool$1 r3 = new com.tencent.wcdb.database.SQLiteConnectionPool$1
            r3.<init>(r1, r2)
            r10.setOnCancelListener(r3)
        L_0x006c:
            long r2 = r1.mStartTime     // Catch:{ all -> 0x00cd }
            r4 = 3000(0xbb8, double:1.482E-320)
            long r2 = r2 + r4
            r6 = r2
            r2 = r4
        L_0x0073:
            java.util.concurrent.atomic.AtomicBoolean r8 = r9.mConnectionLeaked     // Catch:{ all -> 0x00cd }
            boolean r8 = r8.compareAndSet(r12, r11)     // Catch:{ all -> 0x00cd }
            if (r8 == 0) goto L_0x0086
            java.lang.Object r8 = r9.mLock     // Catch:{ all -> 0x00cd }
            monitor-enter(r8)     // Catch:{ all -> 0x00cd }
            r18.wakeConnectionWaitersLocked()     // Catch:{ all -> 0x0083 }
            monitor-exit(r8)     // Catch:{ all -> 0x0083 }
            goto L_0x0086
        L_0x0083:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x0086:
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r15
            java.util.concurrent.locks.LockSupport.parkNanos(r2)     // Catch:{ all -> 0x00cd }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x00cd }
            java.lang.Object r2 = r9.mLock     // Catch:{ all -> 0x00cd }
            monitor-enter(r2)     // Catch:{ all -> 0x00cd }
            r18.throwIfClosedLocked()     // Catch:{ all -> 0x00ca }
            com.tencent.wcdb.database.SQLiteConnection r3 = r1.mAssignedConnection     // Catch:{ all -> 0x00ca }
            java.lang.RuntimeException r8 = r1.mException     // Catch:{ all -> 0x00ca }
            if (r3 != 0) goto L_0x00bd
            if (r8 == 0) goto L_0x00a0
            goto L_0x00bd
        L_0x00a0:
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00ca }
            int r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ac
            long r15 = r15 - r6
            r3 = r19
            goto L_0x00ba
        L_0x00ac:
            long r6 = r1.mStartTime     // Catch:{ all -> 0x00ca }
            r3 = 0
            long r6 = r15 - r6
            r3 = r19
            r9.logConnectionPoolBusyLocked(r3, r6, r0)     // Catch:{ all -> 0x00ca }
            r6 = 0
            long r15 = r15 + r4
            r6 = r15
            r15 = r4
        L_0x00ba:
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            r2 = r15
            goto L_0x0073
        L_0x00bd:
            r9.recycleConnectionWaiterLocked(r1)     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00c9
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            if (r10 == 0) goto L_0x00c8
            r10.setOnCancelListener(r14)
        L_0x00c8:
            return r3
        L_0x00c9:
            throw r8     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            if (r10 == 0) goto L_0x00d3
            r10.setOnCancelListener(r14)
        L_0x00d3:
            throw r0
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnectionPool.waitForConnection(java.lang.String, int, com.tencent.wcdb.support.CancellationSignal):com.tencent.wcdb.database.SQLiteConnection");
    }

    public static SQLiteConnectionPool open(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        return open(sQLiteDatabase, sQLiteDatabaseConfiguration, bArr, sQLiteCipherSpec, 1);
    }

    public static SQLiteConnectionPool open(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        if (sQLiteDatabaseConfiguration != null) {
            SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabase, sQLiteDatabaseConfiguration, i);
            sQLiteConnectionPool.mPassword = bArr;
            if (sQLiteCipherSpec == null) {
                sQLiteCipherSpec2 = null;
            } else {
                sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
            }
            sQLiteConnectionPool.mCipher = sQLiteCipherSpec2;
            sQLiteConnectionPool.open();
            return sQLiteConnectionPool;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    /* access modifiers changed from: package-private */
    public final void notifyChanges(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.mDB.get();
        SQLiteChangeListener sQLiteChangeListener = this.mChangeListener;
        if (sQLiteChangeListener != null && sQLiteDatabase != null) {
            sQLiteChangeListener.onChange(sQLiteDatabase, str, str2, jArr, jArr2, jArr3);
        }
    }

    private ConnectionWaiter obtainConnectionWaiterLocked(Thread thread, long j, int i, boolean z, String str, int i2) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterPool;
        if (connectionWaiter != null) {
            this.mConnectionWaiterPool = connectionWaiter.mNext;
            connectionWaiter.mNext = null;
        } else {
            connectionWaiter = new ConnectionWaiter();
        }
        connectionWaiter.mThread = thread;
        connectionWaiter.mStartTime = j;
        connectionWaiter.mPriority = i;
        connectionWaiter.mWantPrimaryConnection = z;
        connectionWaiter.mSql = str;
        connectionWaiter.mConnectionFlags = i2;
        return connectionWaiter;
    }
}
