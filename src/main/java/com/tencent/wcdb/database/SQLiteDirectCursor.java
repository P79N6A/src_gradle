package com.tencent.wcdb.database;

import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

public class SQLiteDirectCursor extends AbstractCursor {
    public static final SQLiteDatabase.CursorFactory FACTORY = new SQLiteDatabase.CursorFactory() {
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
            return new SQLiteDirectCursor(sQLiteCursorDriver, str, (SQLiteDirectQuery) sQLiteProgram);
        }

        public final SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
            return new SQLiteDirectQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    private final String[] mColumns;
    private int mCount;
    private boolean mCountFinished;
    private final SQLiteCursorDriver mDriver;
    private final SQLiteDirectQuery mQuery;

    public String[] getColumnNames() {
        return this.mColumns;
    }

    public void close() {
        super.close();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    public void deactivate() {
        super.deactivate();
        this.mDriver.cursorDeactivated();
    }

    public int getCount() {
        if (!this.mCountFinished) {
            Log.w("WCDB.SQLiteDirectCursor", "Count query on SQLiteDirectCursor is slow. Iterate through the end to get count or use other implementations.");
            this.mCount = this.mPos + this.mQuery.step(Integer.MAX_VALUE) + 1;
            this.mCountFinished = true;
            this.mQuery.reset(false);
            this.mPos = this.mQuery.step(this.mPos + 1) - 1;
        }
        return this.mCount;
    }

    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.mQuery.getDatabase().isOpen()) {
                return false;
            }
            this.mPos = -1;
            this.mCountFinished = false;
            this.mCount = -1;
            this.mDriver.cursorRequeried(this);
            this.mQuery.reset(false);
            try {
                return super.requery();
            } catch (IllegalStateException e2) {
                Log.w("WCDB.SQLiteDirectCursor", "requery() failed " + e2.getMessage(), e2);
                return false;
            }
        }
    }

    public byte[] getBlob(int i) {
        return this.mQuery.getBlob(i);
    }

    public double getDouble(int i) {
        return this.mQuery.getDouble(i);
    }

    public float getFloat(int i) {
        return (float) this.mQuery.getDouble(i);
    }

    public int getInt(int i) {
        return (int) this.mQuery.getLong(i);
    }

    public long getLong(int i) {
        return this.mQuery.getLong(i);
    }

    public String getString(int i) {
        return this.mQuery.getString(i);
    }

    public int getType(int i) {
        return this.mQuery.getType(i);
    }

    public short getShort(int i) {
        return (short) ((int) this.mQuery.getLong(i));
    }

    public boolean isNull(int i) {
        if (getType(i) == 0) {
            return true;
        }
        return false;
    }

    public boolean moveToPosition(int i) {
        int i2;
        if (i < 0) {
            this.mQuery.reset(false);
            this.mPos = -1;
            return false;
        } else if (!this.mCountFinished || i < this.mCount) {
            if (i < this.mPos) {
                Log.w("WCDB.SQLiteDirectCursor", "Moving backward on SQLiteDirectCursor is slow. Get rid of backward movement or use other implementations.");
                this.mQuery.reset(false);
                i2 = this.mQuery.step(i + 1) - 1;
            } else if (i == this.mPos) {
                return true;
            } else {
                i2 = this.mPos + this.mQuery.step(i - this.mPos);
            }
            if (i2 < i) {
                this.mCount = i2 + 1;
                this.mCountFinished = true;
                this.mPos = this.mCount;
            } else {
                this.mPos = i2;
                if (i2 >= this.mCount) {
                    this.mCount = i2 + 1;
                    this.mCountFinished = false;
                }
            }
            if (this.mPos < this.mCount) {
                return true;
            }
            return false;
        } else {
            this.mPos = this.mCount;
            return false;
        }
    }

    public SQLiteDirectCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteDirectQuery sQLiteDirectQuery) {
        if (sQLiteDirectQuery != null) {
            this.mQuery = sQLiteDirectQuery;
            this.mDriver = sQLiteCursorDriver;
            this.mColumns = sQLiteDirectQuery.getColumnNames();
            this.mCount = -1;
            this.mCountFinished = false;
            return;
        }
        throw new IllegalArgumentException("query object cannot be null");
    }
}
