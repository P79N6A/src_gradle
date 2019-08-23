package com.tencent.wcdb;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

public final class CursorToBulkCursorAdaptor extends BulkCursorNative implements IBinder.DeathRecipient {
    private CrossProcessCursor mCursor;
    private CursorWindow mFilledWindow;
    private final Object mLock = new Object();
    private ContentObserverProxy mObserver;
    private final String mProviderName;

    static final class ContentObserverProxy extends ContentObserver {
        protected IContentObserver mRemote;

        public final boolean deliverSelfNotifications() {
            return false;
        }

        public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient) {
            return this.mRemote.asBinder().unlinkToDeath(deathRecipient, 0);
        }

        public final void onChange(boolean z, Uri uri) {
            try {
                this.mRemote.onChange(z, uri);
            } catch (RemoteException unused) {
            }
        }

        public ContentObserverProxy(IContentObserver iContentObserver, IBinder.DeathRecipient deathRecipient) {
            super(null);
            this.mRemote = iContentObserver;
            try {
                iContentObserver.asBinder().linkToDeath(deathRecipient, 0);
            } catch (RemoteException unused) {
            }
        }
    }

    private void closeFilledWindowLocked() {
        if (this.mFilledWindow != null) {
            this.mFilledWindow.close();
            this.mFilledWindow = null;
        }
    }

    private void throwIfCursorIsClosed() {
        if (this.mCursor == null) {
            throw new StaleDataException("Attempted to access a cursor after it has been closed.");
        }
    }

    public final void binderDied() {
        synchronized (this.mLock) {
            disposeLocked();
        }
    }

    public final void close() {
        synchronized (this.mLock) {
            disposeLocked();
        }
    }

    private void disposeLocked() {
        if (this.mCursor != null) {
            unregisterObserverProxyLocked();
            this.mCursor.close();
            this.mCursor = null;
        }
        closeFilledWindowLocked();
    }

    private void unregisterObserverProxyLocked() {
        if (this.mObserver != null) {
            this.mCursor.unregisterContentObserver(this.mObserver);
            this.mObserver.unlinkToDeath(this);
            this.mObserver = null;
        }
    }

    public final void deactivate() {
        synchronized (this.mLock) {
            if (this.mCursor != null) {
                unregisterObserverProxyLocked();
                this.mCursor.deactivate();
            }
            closeFilledWindowLocked();
        }
    }

    public final Bundle getExtras() {
        Bundle extras;
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            extras = this.mCursor.getExtras();
        }
        return extras;
    }

    public final BulkCursorDescriptor getBulkCursorDescriptor() {
        BulkCursorDescriptor bulkCursorDescriptor;
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            bulkCursorDescriptor = new BulkCursorDescriptor();
            bulkCursorDescriptor.cursor = this;
            bulkCursorDescriptor.columnNames = this.mCursor.getColumnNames();
            bulkCursorDescriptor.wantsAllOnMoveCalls = this.mCursor.getWantsAllOnMoveCalls();
            bulkCursorDescriptor.count = this.mCursor.getCount();
            bulkCursorDescriptor.window = this.mCursor.getWindow();
            if (bulkCursorDescriptor.window != null) {
                bulkCursorDescriptor.window.acquireReference();
            }
        }
        return bulkCursorDescriptor;
    }

    private void createAndRegisterObserverProxyLocked(IContentObserver iContentObserver) {
        if (this.mObserver == null) {
            this.mObserver = new ContentObserverProxy(iContentObserver, this);
            this.mCursor.registerContentObserver(this.mObserver);
            return;
        }
        throw new IllegalStateException("an observer is already registered");
    }

    public final void onMove(int i) {
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            this.mCursor.onMove(this.mCursor.getPosition(), i);
        }
    }

    public final Bundle respond(Bundle bundle) {
        Bundle respond;
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            respond = this.mCursor.respond(bundle);
        }
        return respond;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.wcdb.CursorWindow getWindow(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            r4.throwIfCursorIsClosed()     // Catch:{ all -> 0x0050 }
            com.tencent.wcdb.CrossProcessCursor r1 = r4.mCursor     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.moveToPosition(r5)     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0014
            r4.closeFilledWindowLocked()     // Catch:{ all -> 0x0050 }
            r5 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r5
        L_0x0014:
            com.tencent.wcdb.CrossProcessCursor r1 = r4.mCursor     // Catch:{ all -> 0x0050 }
            com.tencent.wcdb.CursorWindow r1 = r1.getWindow()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0020
            r4.closeFilledWindowLocked()     // Catch:{ all -> 0x0050 }
            goto L_0x0049
        L_0x0020:
            com.tencent.wcdb.CursorWindow r1 = r4.mFilledWindow     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0030
            com.tencent.wcdb.CursorWindow r1 = new com.tencent.wcdb.CursorWindow     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = r4.mProviderName     // Catch:{ all -> 0x0050 }
            r1.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0050 }
            r4.mFilledWindow = r1     // Catch:{ all -> 0x0050 }
            com.tencent.wcdb.CursorWindow r1 = r4.mFilledWindow     // Catch:{ all -> 0x0050 }
            goto L_0x0044
        L_0x0030:
            int r2 = r1.getStartPosition()     // Catch:{ all -> 0x0050 }
            if (r5 < r2) goto L_0x0041
            int r2 = r1.getStartPosition()     // Catch:{ all -> 0x0050 }
            int r3 = r1.getNumRows()     // Catch:{ all -> 0x0050 }
            int r2 = r2 + r3
            if (r5 < r2) goto L_0x0044
        L_0x0041:
            r1.clear()     // Catch:{ all -> 0x0050 }
        L_0x0044:
            com.tencent.wcdb.CrossProcessCursor r2 = r4.mCursor     // Catch:{ all -> 0x0050 }
            r2.fillWindow(r5, r1)     // Catch:{ all -> 0x0050 }
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.acquireReference()     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r1
        L_0x0050:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.CursorToBulkCursorAdaptor.getWindow(int):com.tencent.wcdb.CursorWindow");
    }

    public final int requery(IContentObserver iContentObserver) {
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            closeFilledWindowLocked();
            try {
                if (!this.mCursor.requery()) {
                    return -1;
                }
                unregisterObserverProxyLocked();
                createAndRegisterObserverProxyLocked(iContentObserver);
                int count = this.mCursor.getCount();
                return count;
            } catch (IllegalStateException e2) {
                throw new IllegalStateException(this.mProviderName + " Requery misuse db, mCursor isClosed:" + this.mCursor.isClosed(), e2);
            }
        }
    }

    public CursorToBulkCursorAdaptor(Cursor cursor, IContentObserver iContentObserver, String str) {
        if (cursor instanceof CrossProcessCursor) {
            this.mCursor = (CrossProcessCursor) cursor;
        } else {
            this.mCursor = new CrossProcessCursorWrapper(cursor);
        }
        this.mProviderName = str;
        synchronized (this.mLock) {
            createAndRegisterObserverProxyLocked(iContentObserver);
        }
    }
}
