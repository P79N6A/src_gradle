package com.tencent.wcdb.database;

import android.content.Context;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.Log;

public abstract class SQLiteOpenHelper {
    private SQLiteCipherSpec mCipher;
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private boolean mForcedSingleConnection;
    private boolean mIsInitializing;
    private int mMode;
    private final String mName;
    private boolean mNeedMode;
    private final int mNewVersion;
    private byte[] mPassword;

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    static {
        SQLiteGlobal.loadLib();
    }

    public String getDatabaseName() {
        return this.mName;
    }

    public SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(false);
        }
        return databaseLocked;
    }

    public SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(true);
        }
        return databaseLocked;
    }

    public synchronized void close() {
        if (this.mIsInitializing) {
            throw new IllegalStateException("Closed during initialization");
        } else if (this.mDatabase != null && this.mDatabase.isOpen()) {
            this.mDatabase.close();
            this.mDatabase = null;
        }
    }

    public void setForcedSingleConnection(boolean z) {
        synchronized (this) {
            this.mForcedSingleConnection = z;
        }
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != z) {
                if (this.mDatabase != null && this.mDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
                    if (z) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                }
                this.mEnableWriteAheadLogging = z;
            }
        }
    }

    private SQLiteDatabase getDatabaseLocked(boolean z) {
        SQLiteDatabase openDatabase;
        int i;
        if (this.mDatabase != null) {
            if (!this.mDatabase.isOpen()) {
                this.mDatabase = null;
            } else if (!z || !this.mDatabase.isReadOnly()) {
                return this.mDatabase;
            }
        }
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            try {
                this.mIsInitializing = true;
                if (sQLiteDatabase == null) {
                    if (this.mName == null) {
                        openDatabase = SQLiteDatabase.create(null);
                    } else {
                        boolean z2 = this.mForcedSingleConnection;
                        this.mNeedMode = true;
                        if (this.mEnableWriteAheadLogging) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        this.mMode = i;
                        sQLiteDatabase = com.tencent.wcdb.support.Context.openOrCreateDatabase(this.mContext, this.mName, this.mPassword, this.mCipher, this.mMode, this.mFactory, this.mErrorHandler, z2 ? 1 : 0);
                    }
                    sQLiteDatabase = openDatabase;
                } else if (z && sQLiteDatabase.isReadOnly()) {
                    sQLiteDatabase.reopenReadWrite();
                }
            } catch (SQLiteException e2) {
                if (!z) {
                    Log.e("WCDB.SQLiteOpenHelper", "Couldn't open " + this.mName + " for writing (will try read-only):", e2);
                    openDatabase = SQLiteDatabase.openDatabase(this.mContext.getDatabasePath(this.mName).getPath(), this.mPassword, this.mCipher, this.mFactory, 1, this.mErrorHandler);
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                this.mIsInitializing = false;
                if (!(sQLiteDatabase == null || sQLiteDatabase == this.mDatabase)) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
            SQLiteDatabase databaseLockedLast = getDatabaseLockedLast(sQLiteDatabase);
            this.mIsInitializing = false;
            if (!(sQLiteDatabase == null || sQLiteDatabase == this.mDatabase)) {
                sQLiteDatabase.close();
            }
            return databaseLockedLast;
        }
        throw new IllegalStateException("getDatabase called recursively");
    }

    private SQLiteDatabase getDatabaseLockedLast(SQLiteDatabase sQLiteDatabase) {
        onConfigure(sQLiteDatabase);
        int version = sQLiteDatabase.getVersion();
        if (version != this.mNewVersion) {
            if (!sQLiteDatabase.isReadOnly()) {
                sQLiteDatabase.beginTransaction();
                if (version == 0) {
                    try {
                        onCreate(sQLiteDatabase);
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } else if (version > this.mNewVersion) {
                    onDowngrade(sQLiteDatabase, version, this.mNewVersion);
                } else {
                    onUpgrade(sQLiteDatabase, version, this.mNewVersion);
                }
                sQLiteDatabase.setVersion(this.mNewVersion);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } else {
                throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
            }
        }
        onOpen(sQLiteDatabase);
        if (sQLiteDatabase.isReadOnly()) {
            Log.w("WCDB.SQLiteOpenHelper", "Opened " + this.mName + " in read-only mode");
        }
        this.mDatabase = sQLiteDatabase;
        return sQLiteDatabase;
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, null, null, cursorFactory, i, databaseErrorHandler);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, bArr, null, cursorFactory, i, databaseErrorHandler);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        if (i > 0) {
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i;
            this.mErrorHandler = databaseErrorHandler;
            this.mPassword = bArr;
            if (sQLiteCipherSpec == null) {
                sQLiteCipherSpec2 = null;
            } else {
                sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
            }
            this.mCipher = sQLiteCipherSpec2;
            this.mNeedMode = false;
            return;
        }
        throw new IllegalArgumentException("Version must be >= 1, was " + i);
    }
}
