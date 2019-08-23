package com.amap.api.a;

import android.os.RemoteException;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;

public interface c {
    float getBearing() throws RemoteException;

    LatLngBounds getBounds() throws RemoteException;

    float getHeight() throws RemoteException;

    LatLng getPosition() throws RemoteException;

    float getTransparency() throws RemoteException;

    float getWidth() throws RemoteException;

    void setBearing(float f2) throws RemoteException;

    void setDimensions(float f2) throws RemoteException;

    void setDimensions(float f2, float f3) throws RemoteException;

    void setImage(BitmapDescriptor bitmapDescriptor) throws RemoteException;

    void setPosition(LatLng latLng) throws RemoteException;

    void setPositionFromBounds(LatLngBounds latLngBounds) throws RemoteException;

    void setTransparency(float f2) throws RemoteException;
}
