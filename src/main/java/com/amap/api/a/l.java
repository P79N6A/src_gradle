package com.amap.api.a;

import android.os.RemoteException;

public interface l {
    int getLogoPosition() throws RemoteException;

    int getZoomPosition() throws RemoteException;

    boolean isCompassEnabled() throws RemoteException;

    boolean isMyLocationButtonEnabled() throws RemoteException;

    boolean isScaleControlsEnabled() throws RemoteException;

    boolean isScrollGesturesEnabled() throws RemoteException;

    boolean isZoomControlsEnabled() throws RemoteException;

    boolean isZoomGesturesEnabled() throws RemoteException;

    boolean isZoomInByScreenCenter();

    void setAllGesturesEnabled(boolean z) throws RemoteException;

    void setCompassEnabled(boolean z) throws RemoteException;

    void setLogoPosition(int i) throws RemoteException;

    void setMyLocationButtonEnabled(boolean z) throws RemoteException;

    void setScaleControlsEnabled(boolean z) throws RemoteException;

    void setScrollGesturesEnabled(boolean z) throws RemoteException;

    void setZoomControlsEnabled(boolean z) throws RemoteException;

    void setZoomGesturesEnabled(boolean z) throws RemoteException;

    void setZoomInByScreenCenter(boolean z);

    void setZoomPosition(int i) throws RemoteException;
}
