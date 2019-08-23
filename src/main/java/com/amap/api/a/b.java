package com.amap.api.a;

import android.os.RemoteException;
import com.amap.api.maps2d.model.LatLng;

public interface b extends f {
    boolean contains(LatLng latLng) throws RemoteException;

    LatLng getCenter() throws RemoteException;

    int getFillColor() throws RemoteException;

    double getRadius() throws RemoteException;

    int getStrokeColor() throws RemoteException;

    float getStrokeWidth() throws RemoteException;

    void setCenter(LatLng latLng) throws RemoteException;

    void setFillColor(int i) throws RemoteException;

    void setRadius(double d2) throws RemoteException;

    void setStrokeColor(int i) throws RemoteException;

    void setStrokeWidth(float f2) throws RemoteException;
}
