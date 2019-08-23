package com.amap.api.a;

import android.os.RemoteException;
import com.amap.api.maps2d.model.LatLng;
import java.util.List;

public interface g extends f {
    boolean contains(LatLng latLng) throws RemoteException;

    int getFillColor() throws RemoteException;

    List<LatLng> getPoints() throws RemoteException;

    int getStrokeColor() throws RemoteException;

    float getStrokeWidth() throws RemoteException;

    void setFillColor(int i) throws RemoteException;

    void setPoints(List<LatLng> list) throws RemoteException;

    void setStrokeColor(int i) throws RemoteException;

    void setStrokeWidth(float f2) throws RemoteException;
}
