package android.arch.persistence.room;

import android.arch.core.executor.ArchTaskExecutor;
import android.arch.core.internal.SafeIterableMap;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.ArraySet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

public class InvalidationTracker {
    private static final String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};
    public volatile SupportSQLiteStatement mCleanupStatement;
    public final RoomDatabase mDatabase;
    private volatile boolean mInitialized;
    public long mMaxVersion;
    private ObservedTableTracker mObservedTableTracker;
    @VisibleForTesting
    final SafeIterableMap<Observer, ObserverWrapper> mObserverMap;
    AtomicBoolean mPendingRefresh;
    public Object[] mQueryArgs = new Object[1];
    @VisibleForTesting
    Runnable mRefreshRunnable;
    @VisibleForTesting
    @NonNull
    ArrayMap<String, Integer> mTableIdLookup;
    private String[] mTableNames;
    @VisibleForTesting
    @NonNull
    long[] mTableVersions;

    static class ObservedTableTracker {
        boolean mNeedsSync;
        boolean mPendingSync;
        final long[] mTableObservers;
        final int[] mTriggerStateChanges;
        final boolean[] mTriggerStates;

        /* access modifiers changed from: package-private */
        public void onSyncCompleted() {
            synchronized (this) {
                this.mPendingSync = false;
            }
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public int[] getTablesToSync() {
            boolean z;
            synchronized (this) {
                if (this.mNeedsSync) {
                    if (!this.mPendingSync) {
                        int length = this.mTableObservers.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                if (this.mTableObservers[i] > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z != this.mTriggerStates[i]) {
                                    int[] iArr = this.mTriggerStateChanges;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.mTriggerStateChanges[i] = 0;
                                }
                                this.mTriggerStates[i] = z;
                                i++;
                            } else {
                                this.mPendingSync = true;
                                this.mNeedsSync = false;
                                int[] iArr2 = this.mTriggerStateChanges;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        ObservedTableTracker(int i) {
            this.mTableObservers = new long[i];
            this.mTriggerStates = new boolean[i];
            this.mTriggerStateChanges = new int[i];
            Arrays.fill(this.mTableObservers, 0);
            Arrays.fill(this.mTriggerStates, false);
        }

        /* access modifiers changed from: package-private */
        public boolean onAdded(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.mTableObservers[i];
                    this.mTableObservers[i] = 1 + j;
                    if (j == 0) {
                        this.mNeedsSync = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public boolean onRemoved(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.mTableObservers[i];
                    this.mTableObservers[i] = j - 1;
                    if (j == 1) {
                        this.mNeedsSync = true;
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    public static abstract class Observer {
        final String[] mTables;

        public abstract void onInvalidated(@NonNull Set<String> set);

        public Observer(@NonNull String[] strArr) {
            this.mTables = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        protected Observer(@NonNull String str, String... strArr) {
            this.mTables = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.mTables[strArr.length] = str;
        }
    }

    static class ObserverWrapper {
        final Observer mObserver;
        private final Set<String> mSingleTableSet;
        final int[] mTableIds;
        private final String[] mTableNames;
        private final long[] mVersions;

        /* access modifiers changed from: package-private */
        public void checkForInvalidation(long[] jArr) {
            int length = this.mTableIds.length;
            Set set = null;
            for (int i = 0; i < length; i++) {
                long j = jArr[this.mTableIds[i]];
                if (this.mVersions[i] < j) {
                    this.mVersions[i] = j;
                    if (length == 1) {
                        set = this.mSingleTableSet;
                    } else {
                        if (set == null) {
                            set = new ArraySet(length);
                        }
                        set.add(this.mTableNames[i]);
                    }
                }
            }
            if (set != null) {
                this.mObserver.onInvalidated(set);
            }
        }

        ObserverWrapper(Observer observer, int[] iArr, String[] strArr, long[] jArr) {
            this.mObserver = observer;
            this.mTableIds = iArr;
            this.mTableNames = strArr;
            this.mVersions = jArr;
            if (iArr.length == 1) {
                ArraySet arraySet = new ArraySet();
                arraySet.add(this.mTableNames[0]);
                this.mSingleTableSet = Collections.unmodifiableSet(arraySet);
                return;
            }
            this.mSingleTableSet = null;
        }
    }

    static class WeakObserver extends Observer {
        final WeakReference<Observer> mDelegateRef;
        final InvalidationTracker mTracker;

        public void onInvalidated(@NonNull Set<String> set) {
            Observer observer = (Observer) this.mDelegateRef.get();
            if (observer == null) {
                this.mTracker.removeObserver(this);
            } else {
                observer.onInvalidated(set);
            }
        }

        WeakObserver(InvalidationTracker invalidationTracker, Observer observer) {
            super(observer.mTables);
            this.mTracker = invalidationTracker;
            this.mDelegateRef = new WeakReference<>(observer);
        }
    }

    @WorkerThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void refreshVersionsSync() {
        syncTriggers();
        this.mRefreshRunnable.run();
    }

    public boolean ensureInitialization() {
        if (!this.mDatabase.isOpen()) {
            return false;
        }
        if (!this.mInitialized) {
            this.mDatabase.getOpenHelper().getWritableDatabase();
        }
        if (!this.mInitialized) {
            return false;
        }
        return true;
    }

    public void refreshVersionsAsync() {
        if (this.mPendingRefresh.compareAndSet(false, true)) {
            ArchTaskExecutor.getInstance().executeOnDiskIO(this.mRefreshRunnable);
        }
    }

    /* access modifiers changed from: package-private */
    public void syncTriggers() {
        if (this.mDatabase.isOpen()) {
            syncTriggers(this.mDatabase.getOpenHelper().getWritableDatabase());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void addWeakObserver(Observer observer) {
        addObserver(new WeakObserver(this, observer));
    }

    @WorkerThread
    public void removeObserver(@NonNull Observer observer) {
        ObserverWrapper observerWrapper;
        synchronized (this.mObserverMap) {
            observerWrapper = (ObserverWrapper) this.mObserverMap.remove(observer);
        }
        if (observerWrapper != null && this.mObservedTableTracker.onRemoved(observerWrapper.mTableIds)) {
            syncTriggers();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void internalInit(SupportSQLiteDatabase supportSQLiteDatabase) {
        synchronized (this) {
            if (!this.mInitialized) {
                supportSQLiteDatabase.beginTransaction();
                try {
                    supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
                    supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
                    supportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                    syncTriggers(supportSQLiteDatabase);
                    this.mCleanupStatement = supportSQLiteDatabase.compileStatement("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
                    this.mInitialized = true;
                } catch (Throwable th) {
                    supportSQLiteDatabase.endTransaction();
                    throw th;
                }
            }
        }
    }

    @WorkerThread
    public void addObserver(@NonNull Observer observer) {
        ObserverWrapper observerWrapper;
        String[] strArr = observer.mTables;
        int[] iArr = new int[strArr.length];
        int length = strArr.length;
        long[] jArr = new long[strArr.length];
        int i = 0;
        while (i < length) {
            Integer num = (Integer) this.mTableIdLookup.get(strArr[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                jArr[i] = this.mMaxVersion;
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + strArr[i]);
            }
        }
        ObserverWrapper observerWrapper2 = new ObserverWrapper(observer, iArr, strArr, jArr);
        synchronized (this.mObserverMap) {
            observerWrapper = (ObserverWrapper) this.mObserverMap.putIfAbsent(observer, observerWrapper2);
        }
        if (observerWrapper == null && this.mObservedTableTracker.onAdded(iArr)) {
            syncTriggers();
        }
    }

    /* access modifiers changed from: package-private */
    public void syncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (!supportSQLiteDatabase.inTransaction()) {
            while (true) {
                try {
                    Lock closeLock = this.mDatabase.getCloseLock();
                    closeLock.lock();
                    try {
                        int[] tablesToSync = this.mObservedTableTracker.getTablesToSync();
                        if (tablesToSync == null) {
                            closeLock.unlock();
                            return;
                        }
                        int length = tablesToSync.length;
                        supportSQLiteDatabase.beginTransaction();
                        for (int i = 0; i < length; i++) {
                            switch (tablesToSync[i]) {
                                case 1:
                                    startTrackingTable(supportSQLiteDatabase, i);
                                    break;
                                case 2:
                                    stopTrackingTable(supportSQLiteDatabase, i);
                                    break;
                            }
                        }
                        supportSQLiteDatabase.setTransactionSuccessful();
                        supportSQLiteDatabase.endTransaction();
                        this.mObservedTableTracker.onSyncCompleted();
                        closeLock.unlock();
                    } catch (Throwable th) {
                        closeLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
        }
    }

    private void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String str = this.mTableNames[i];
        StringBuilder sb = new StringBuilder();
        for (String appendTriggerName : TRIGGERS) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            appendTriggerName(sb, str, appendTriggerName);
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public InvalidationTracker(RoomDatabase roomDatabase, String... strArr) {
        this.mPendingRefresh = new AtomicBoolean(false);
        this.mInitialized = false;
        this.mObserverMap = new SafeIterableMap<>();
        this.mRefreshRunnable = new Runnable() {
            private boolean checkUpdatedTable() {
                Cursor query = InvalidationTracker.this.mDatabase.query("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", InvalidationTracker.this.mQueryArgs);
                boolean z = false;
                while (query.moveToNext()) {
                    try {
                        long j = query.getLong(0);
                        InvalidationTracker.this.mTableVersions[query.getInt(1)] = j;
                        InvalidationTracker.this.mMaxVersion = j;
                        z = true;
                    } finally {
                        query.close();
                    }
                }
                return z;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
                r3 = r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x007e, code lost:
                r0.unlock();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0081, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
                r3 = false;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x007d A[ExcHandler: all (r1v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0009] */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r6 = this;
                    android.arch.persistence.room.InvalidationTracker r0 = android.arch.persistence.room.InvalidationTracker.this
                    android.arch.persistence.room.RoomDatabase r0 = r0.mDatabase
                    java.util.concurrent.locks.Lock r0 = r0.getCloseLock()
                    r1 = 0
                    r0.lock()     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.room.InvalidationTracker r2 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    boolean r2 = r2.ensureInitialization()     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    if (r2 != 0) goto L_0x0018
                    r0.unlock()
                    return
                L_0x0018:
                    android.arch.persistence.room.InvalidationTracker r2 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    java.util.concurrent.atomic.AtomicBoolean r2 = r2.mPendingRefresh     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    r3 = 1
                    boolean r2 = r2.compareAndSet(r3, r1)     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    if (r2 != 0) goto L_0x0027
                    r0.unlock()
                    return
                L_0x0027:
                    android.arch.persistence.room.InvalidationTracker r2 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.room.RoomDatabase r2 = r2.mDatabase     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    boolean r2 = r2.inTransaction()     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    if (r2 == 0) goto L_0x0035
                    r0.unlock()
                    return
                L_0x0035:
                    android.arch.persistence.room.InvalidationTracker r2 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.db.SupportSQLiteStatement r2 = r2.mCleanupStatement     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    r2.executeUpdateDelete()     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.room.InvalidationTracker r2 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    java.lang.Object[] r2 = r2.mQueryArgs     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.room.InvalidationTracker r3 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    long r3 = r3.mMaxVersion     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    r2[r1] = r3     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.room.InvalidationTracker r2 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.room.RoomDatabase r2 = r2.mDatabase     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    boolean r2 = r2.mWriteAheadLoggingEnabled     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    if (r2 == 0) goto L_0x0078
                    android.arch.persistence.room.InvalidationTracker r2 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.room.RoomDatabase r2 = r2.mDatabase     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.db.SupportSQLiteOpenHelper r2 = r2.getOpenHelper()     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    android.arch.persistence.db.SupportSQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    r2.beginTransaction()     // Catch:{ all -> 0x0071 }
                    boolean r3 = r6.checkUpdatedTable()     // Catch:{ all -> 0x0071 }
                    r2.setTransactionSuccessful()     // Catch:{ all -> 0x006c }
                    r2.endTransaction()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007d }
                    goto L_0x0083
                L_0x006c:
                    r1 = move-exception
                    r5 = r3
                    r3 = r1
                    r1 = r5
                    goto L_0x0072
                L_0x0071:
                    r3 = move-exception
                L_0x0072:
                    r2.endTransaction()     // Catch:{ SQLiteException | IllegalStateException -> 0x0076, all -> 0x007d }
                    throw r3     // Catch:{ SQLiteException | IllegalStateException -> 0x0076, all -> 0x007d }
                L_0x0076:
                    r3 = r1
                    goto L_0x0083
                L_0x0078:
                    boolean r3 = r6.checkUpdatedTable()     // Catch:{ SQLiteException | IllegalStateException -> 0x0082, all -> 0x007d }
                    goto L_0x0083
                L_0x007d:
                    r1 = move-exception
                    r0.unlock()
                    throw r1
                L_0x0082:
                    r3 = 0
                L_0x0083:
                    r0.unlock()
                    if (r3 == 0) goto L_0x00b4
                    android.arch.persistence.room.InvalidationTracker r0 = android.arch.persistence.room.InvalidationTracker.this
                    android.arch.core.internal.SafeIterableMap<android.arch.persistence.room.InvalidationTracker$Observer, android.arch.persistence.room.InvalidationTracker$ObserverWrapper> r0 = r0.mObserverMap
                    monitor-enter(r0)
                    android.arch.persistence.room.InvalidationTracker r1 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ all -> 0x00b1 }
                    android.arch.core.internal.SafeIterableMap<android.arch.persistence.room.InvalidationTracker$Observer, android.arch.persistence.room.InvalidationTracker$ObserverWrapper> r1 = r1.mObserverMap     // Catch:{ all -> 0x00b1 }
                    java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b1 }
                L_0x0095:
                    boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00b1 }
                    if (r2 == 0) goto L_0x00af
                    java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00b1 }
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b1 }
                    java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b1 }
                    android.arch.persistence.room.InvalidationTracker$ObserverWrapper r2 = (android.arch.persistence.room.InvalidationTracker.ObserverWrapper) r2     // Catch:{ all -> 0x00b1 }
                    android.arch.persistence.room.InvalidationTracker r3 = android.arch.persistence.room.InvalidationTracker.this     // Catch:{ all -> 0x00b1 }
                    long[] r3 = r3.mTableVersions     // Catch:{ all -> 0x00b1 }
                    r2.checkForInvalidation(r3)     // Catch:{ all -> 0x00b1 }
                    goto L_0x0095
                L_0x00af:
                    monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                    return
                L_0x00b1:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                    throw r1
                L_0x00b4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.arch.persistence.room.InvalidationTracker.AnonymousClass1.run():void");
            }
        };
        this.mDatabase = roomDatabase;
        this.mObservedTableTracker = new ObservedTableTracker(strArr.length);
        this.mTableIdLookup = new ArrayMap<>();
        int length = strArr.length;
        this.mTableNames = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.mTableIdLookup.put(lowerCase, Integer.valueOf(i));
            this.mTableNames[i] = lowerCase;
        }
        this.mTableVersions = new long[strArr.length];
        Arrays.fill(this.mTableVersions, 0);
    }

    private void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String str = this.mTableNames[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : TRIGGERS) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            appendTriggerName(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN INSERT OR REPLACE INTO room_table_modification_log");
            sb.append(" VALUES(null, ");
            sb.append(i);
            sb.append("); END");
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    private static void appendTriggerName(StringBuilder sb, String str, String str2) {
        sb.append("`room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }
}
