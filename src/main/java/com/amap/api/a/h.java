package com.amap.api.a;

import android.os.RemoteException;
import com.amap.api.maps2d.model.LatLng;
import java.util.List;

public interface h extends f {
    int getColor() throws RemoteException;

    List<LatLng> getPoints() throws RemoteException;

    float getWidth() throws RemoteException;

    boolean isDottedLine();

    boolean isGeodesic();

    void setColor(int i) throws RemoteException;

    void setDottedLine(boolean z);

    void setGeodesic(boolean z) throws RemoteException;

    void setPoints(List<LatLng> list) throws RemoteException;

    void setWidth(float f2) throws RemoteException;
}
