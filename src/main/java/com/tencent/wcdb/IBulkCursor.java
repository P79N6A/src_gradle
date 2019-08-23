package com.tencent.wcdb;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

public interface IBulkCursor extends IInterface {
    public static final String descriptor = "android.content.IBulkCursor";

    void close() throws RemoteException;

    void deactivate() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    CursorWindow getWindow(int i) throws RemoteException;

    void onMove(int i) throws RemoteException;

    int requery(IContentObserver iContentObserver) throws RemoteException;

    Bundle respond(Bundle bundle) throws RemoteException;
}
