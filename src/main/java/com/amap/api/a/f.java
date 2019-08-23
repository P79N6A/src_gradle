package com.amap.api.a;

import android.os.RemoteException;

public interface f {
    void destroy();

    boolean equalsRemote(f fVar) throws RemoteException;

    String getId() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    void setZIndex(float f2) throws RemoteException;
}
