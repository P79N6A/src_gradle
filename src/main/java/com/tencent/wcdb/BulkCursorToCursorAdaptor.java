package com.tencent.wcdb;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.support.Log;

public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor {
    private IBulkCursor mBulkCursor;
    private String[] mColumns;
    private int mCount;
    private AbstractCursor.SelfContentObserver mObserverBridge = new AbstractCursor.SelfContentObserver(this);
    private boolean mWantsAllOnMoveCalls;

    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    public final void registerContentObserver(ContentObserver contentObserver) {
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public final void unregisterContentObserver(ContentObserver contentObserver) {
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public final String[] getColumnNames() {
        throwIfCursorIsClosed();
        return this.mColumns;
    }

    public final int getCount() {
        throwIfCursorIsClosed();
        return this.mCount;
    }

    private void throwIfCursorIsClosed() {
        if (this.mBulkCursor == null) {
            throw new StaleDataException("Attempted to access a cursor after it has been closed.");
        }
    }

    public final void close() {
        super.close();
        if (this.mBulkCursor != null) {
            try {
                this.mBulkCursor.close();
            } catch (RemoteException unused) {
                Log.w("BulkCursor", "Remote process exception when closing");
            } finally {
                this.mBulkCursor = null;
            }
        }
    }

    public final void deactivate() {
        super.deactivate();
        if (this.mBulkCursor != null) {
            try {
                this.mBulkCursor.deactivate();
            } catch (RemoteException unused) {
                Log.w("BulkCursor", "Remote process exception when deactivating");
            }
        }
    }

    public final Bundle getExtras() {
        throwIfCursorIsClosed();
        try {
            return this.mBulkCursor.getExtras();
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final IContentObserver getObserver() {
        try {
            return (IContentObserver) this.mObserverBridge.getClass().getMethod("getContentObserver", new Class[0]).invoke(this.mObserverBridge, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean requery() {
        throwIfCursorIsClosed();
        try {
            this.mCount = this.mBulkCursor.requery(getObserver());
            if (this.mCount != -1) {
                this.mPos = -1;
                closeWindow();
                super.requery();
                return true;
            }
            deactivate();
            return false;
        } catch (Exception e2) {
            Log.e("BulkCursor", "Unable to requery because the remote process exception " + e2.getMessage());
            deactivate();
            return false;
        }
    }

    public final Bundle respond(Bundle bundle) {
        throwIfCursorIsClosed();
        try {
            return this.mBulkCursor.respond(bundle);
        } catch (RemoteException e2) {
            Log.w("BulkCursor", "respond() threw RemoteException, returning an empty bundle.", e2);
            return Bundle.EMPTY;
        }
    }

    public final void initialize(BulkCursorDescriptor bulkCursorDescriptor) {
        this.mBulkCursor = bulkCursorDescriptor.cursor;
        this.mColumns = bulkCursorDescriptor.columnNames;
        this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(this.mColumns);
        this.mWantsAllOnMoveCalls = bulkCursorDescriptor.wantsAllOnMoveCalls;
        this.mCount = bulkCursorDescriptor.count;
        if (bulkCursorDescriptor.window != null) {
            setWindow(bulkCursorDescriptor.window);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMove(int r3, int r4) {
        /*
            r2 = this;
            r2.throwIfCursorIsClosed()
            r3 = 0
            com.tencent.wcdb.CursorWindow r0 = r2.mWindow     // Catch:{ RemoteException -> 0x003a }
            if (r0 == 0) goto L_0x002a
            com.tencent.wcdb.CursorWindow r0 = r2.mWindow     // Catch:{ RemoteException -> 0x003a }
            int r0 = r0.getStartPosition()     // Catch:{ RemoteException -> 0x003a }
            if (r4 < r0) goto L_0x002a
            com.tencent.wcdb.CursorWindow r0 = r2.mWindow     // Catch:{ RemoteException -> 0x003a }
            int r0 = r0.getStartPosition()     // Catch:{ RemoteException -> 0x003a }
            com.tencent.wcdb.CursorWindow r1 = r2.mWindow     // Catch:{ RemoteException -> 0x003a }
            int r1 = r1.getNumRows()     // Catch:{ RemoteException -> 0x003a }
            int r0 = r0 + r1
            if (r4 < r0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            boolean r0 = r2.mWantsAllOnMoveCalls     // Catch:{ RemoteException -> 0x003a }
            if (r0 == 0) goto L_0x0033
            com.tencent.wcdb.IBulkCursor r0 = r2.mBulkCursor     // Catch:{ RemoteException -> 0x003a }
            r0.onMove(r4)     // Catch:{ RemoteException -> 0x003a }
            goto L_0x0033
        L_0x002a:
            com.tencent.wcdb.IBulkCursor r0 = r2.mBulkCursor     // Catch:{ RemoteException -> 0x003a }
            com.tencent.wcdb.CursorWindow r4 = r0.getWindow(r4)     // Catch:{ RemoteException -> 0x003a }
            r2.setWindow(r4)     // Catch:{ RemoteException -> 0x003a }
        L_0x0033:
            com.tencent.wcdb.CursorWindow r4 = r2.mWindow
            if (r4 != 0) goto L_0x0038
            return r3
        L_0x0038:
            r3 = 1
            return r3
        L_0x003a:
            java.lang.String r4 = "BulkCursor"
            java.lang.String r0 = "Unable to get window because the remote process is dead"
            com.tencent.wcdb.support.Log.e(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.BulkCursorToCursorAdaptor.onMove(int, int):boolean");
    }
}
