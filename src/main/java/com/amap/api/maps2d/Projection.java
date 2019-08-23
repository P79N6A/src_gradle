package com.amap.api.maps2d;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import com.amap.api.a.i;
import com.amap.api.mapcore2d.cm;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.RuntimeRemoteException;
import com.amap.api.maps2d.model.VisibleRegion;

public class Projection {

    /* renamed from: a  reason: collision with root package name */
    private final i f6325a;

    public VisibleRegion getVisibleRegion() {
        try {
            return this.f6325a.getVisibleRegion();
        } catch (RemoteException e2) {
            cm.a(e2, "Projection", "getVisibleRegion");
            throw new RuntimeRemoteException(e2);
        }
    }

    public Projection(i iVar) {
        this.f6325a = iVar;
    }

    public LatLng fromScreenLocation(Point point) {
        try {
            return this.f6325a.fromScreenLocation(point);
        } catch (RemoteException e2) {
            cm.a(e2, "Projection", "fromScreenLocation");
            throw new RuntimeRemoteException(e2);
        }
    }

    public PointF toMapLocation(LatLng latLng) {
        try {
            return this.f6325a.toMapLocation(latLng);
        } catch (RemoteException e2) {
            cm.a(e2, "Projection", "toMapLocation");
            throw new RuntimeRemoteException(e2);
        }
    }

    public Point toScreenLocation(LatLng latLng) {
        try {
            return this.f6325a.toScreenLocation(latLng);
        } catch (RemoteException e2) {
            cm.a(e2, "Projection", "toScreenLocation");
            throw new RuntimeRemoteException(e2);
        }
    }
}
