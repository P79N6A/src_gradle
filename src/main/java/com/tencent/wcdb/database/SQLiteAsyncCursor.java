package com.tencent.wcdb.database;

import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.CursorIndexOutOfBoundsException;
import com.tencent.wcdb.StaleDataException;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;

public class SQLiteAsyncCursor extends AbstractCursor {
    public static final SQLiteDatabase.CursorFactory FACTORY = new SQLiteDatabase.CursorFactory() {
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
            return new SQLiteAsyncCursor(sQLiteCursorDriver, str, (SQLiteAsyncQuery) sQLiteProgram);
        }

        public final SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
            return new SQLiteAsyncQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    private final String[] mColumns;
    public volatile int mCount;
    private long mCurrentRow;
    private final SQLiteCursorDriver mDriver;
    public final SQLiteAsyncQuery mQuery;
    private QueryThread mQueryThread;
    public final Object mWaitLock;
    public ChunkedCursorWindow mWindow;

    class QueryThread extends Thread {
        private int mFetchPos;
        private int mMinPos;
        private volatile int mRequestPos;

        /* access modifiers changed from: package-private */
        public void quit() {
            interrupt();
        }

        public void run() {
            int i;
            int i2;
            int fillRows;
            try {
                int count = SQLiteAsyncCursor.this.mQuery.getCount();
                synchronized (SQLiteAsyncCursor.this.mWaitLock) {
                    SQLiteAsyncCursor.this.mCount = count;
                    SQLiteAsyncCursor.this.mWaitLock.notifyAll();
                }
                while (!interrupted()) {
                    synchronized (this) {
                        while (this.mRequestPos + 256 <= this.mFetchPos && this.mRequestPos >= this.mMinPos) {
                            wait();
                        }
                        i = this.mRequestPos;
                        i2 = i + 256;
                    }
                    if (i < this.mMinPos) {
                        SQLiteAsyncCursor.this.mQuery.reset();
                        this.mFetchPos = 0;
                        SQLiteAsyncCursor.this.mWindow.clear();
                        this.mMinPos = 0;
                    }
                    if (this.mFetchPos < i2) {
                        if (SQLiteAsyncCursor.this.mWindow.getNumChunks() > 32) {
                            long removeChunk = SQLiteAsyncCursor.this.mWindow.removeChunk(this.mMinPos);
                            if (removeChunk != -1) {
                                this.mMinPos = (int) removeChunk;
                            }
                        }
                        synchronized (SQLiteAsyncCursor.this.mWaitLock) {
                            fillRows = SQLiteAsyncCursor.this.mQuery.fillRows(SQLiteAsyncCursor.this.mWindow, this.mFetchPos, 32);
                            if (this.mFetchPos <= i && this.mFetchPos + fillRows > i) {
                                SQLiteAsyncCursor.this.mWaitLock.notifyAll();
                            }
                        }
                        this.mFetchPos += fillRows;
                    }
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                SQLiteAsyncCursor.this.mQuery.release();
                throw th;
            }
            SQLiteAsyncCursor.this.mQuery.release();
        }

        QueryThread() {
            super("SQLiteAsyncCursor.QueryThread");
        }

        /* access modifiers changed from: package-private */
        public void requestPos(int i) {
            synchronized (this) {
                this.mRequestPos = i;
                notifyAll();
            }
        }
    }

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

    private void checkValidRow() {
        if (this.mCurrentRow == 0) {
            if (!isValidPosition(this.mPos)) {
                throw new CursorIndexOutOfBoundsException(this.mPos, this.mCount);
            }
            throw new StaleDataException("Cannot get valid Row object");
        }
    }

    private boolean requestRow() {
        if (this.mWindow == null || !isValidPosition(this.mPos)) {
            return false;
        }
        this.mQueryThread.requestPos(this.mPos);
        this.mCurrentRow = this.mWindow.getRowUnsafe(this.mPos);
        if (this.mCurrentRow == 0) {
            this.mCurrentRow = waitForRow(this.mPos);
        }
        if (this.mCurrentRow != 0) {
            return true;
        }
        return false;
    }

    public int getCount() {
        if (this.mCount >= 0) {
            return this.mCount;
        }
        if (this.mWindow == null) {
            return -1;
        }
        try {
            synchronized (this.mWaitLock) {
                while (this.mCount < 0) {
                    this.mWaitLock.wait();
                }
            }
        } catch (InterruptedException unused) {
        }
        return this.mCount;
    }

    public void onDeactivateOrClose() {
        if (this.mCurrentRow != 0) {
            this.mWindow.endRowUnsafe(this.mCurrentRow);
            this.mCurrentRow = 0;
        }
        if (this.mQueryThread != null) {
            this.mQueryThread.quit();
            try {
                this.mQueryThread.join();
            } catch (InterruptedException unused) {
            }
            this.mQueryThread = null;
        }
        if (this.mWindow != null) {
            this.mWindow.close();
            this.mWindow = null;
        }
        this.mCount = -1;
        this.mPos = -1;
        super.onDeactivateOrClose();
    }

    public float getFloat(int i) {
        return (float) getDouble(i);
    }

    public int getInt(int i) {
        return (int) getLong(i);
    }

    public short getShort(int i) {
        return (short) ((int) getLong(i));
    }

    private boolean isValidPosition(int i) {
        if (i < 0 || i >= getCount()) {
            return false;
        }
        return true;
    }

    public byte[] getBlob(int i) {
        checkValidRow();
        return this.mWindow.getBlobUnsafe(this.mCurrentRow, i);
    }

    public double getDouble(int i) {
        checkValidRow();
        return this.mWindow.getDoubleUnsafe(this.mCurrentRow, i);
    }

    public long getLong(int i) {
        checkValidRow();
        return this.mWindow.getLongUnsafe(this.mCurrentRow, i);
    }

    public String getString(int i) {
        checkValidRow();
        return this.mWindow.getStringUnsafe(this.mCurrentRow, i);
    }

    public int getType(int i) {
        checkValidRow();
        return this.mWindow.getTypeUnsafe(this.mCurrentRow, i);
    }

    public boolean isNull(int i) {
        if (getType(i) == 0) {
            return true;
        }
        return false;
    }

    private long waitForRow(int i) {
        long rowUnsafe;
        try {
            synchronized (this.mWaitLock) {
                while (true) {
                    rowUnsafe = this.mWindow.getRowUnsafe(i);
                    if (rowUnsafe == 0) {
                        if (isValidPosition(i)) {
                            this.mWaitLock.wait();
                        } else {
                            throw new CursorIndexOutOfBoundsException(this.mPos, this.mCount);
                        }
                    }
                }
            }
            return rowUnsafe;
        } catch (InterruptedException unused) {
            return 0;
        }
    }

    public boolean moveToPosition(int i) {
        if (i < -1) {
            i = -1;
        }
        if (i != this.mPos) {
            this.mWindow.endRowUnsafe(this.mCurrentRow);
            this.mCurrentRow = 0;
        }
        int count = getCount();
        if (i >= count) {
            this.mPos = count;
            return false;
        }
        this.mPos = i;
        if (i < 0 || !requestRow()) {
            return false;
        }
        return true;
    }

    public SQLiteAsyncCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteAsyncQuery sQLiteAsyncQuery) {
        if (sQLiteAsyncQuery != null) {
            this.mQuery = sQLiteAsyncQuery;
            this.mDriver = sQLiteCursorDriver;
            this.mColumns = sQLiteAsyncQuery.getColumnNames();
            this.mCount = -1;
            this.mWaitLock = new Object();
            this.mWindow = new ChunkedCursorWindow(16777216);
            this.mQueryThread = new QueryThread();
            this.mQueryThread.start();
            return;
        }
        throw new IllegalArgumentException("query object cannot be null");
    }
}
