package com.amap.api.mapcore2d;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.VisibleRegion;

public class bi implements ah {

    /* renamed from: a  reason: collision with root package name */
    private String f5746a = "ProjectionDelegateImp";

    /* renamed from: b  reason: collision with root package name */
    private y f5747b;

    public VisibleRegion getVisibleRegion() throws RemoteException {
        LatLngBounds latLngBounds;
        LatLng latLng;
        LatLng latLng2;
        LatLng latLng3;
        LatLng latLng4;
        LatLng latLng5;
        try {
            int mapWidth = this.f5747b.getMapWidth();
            int mapHeight = this.f5747b.getMapHeight();
            latLng4 = fromScreenLocation(new Point(0, 0));
            try {
                latLng2 = fromScreenLocation(new Point(mapWidth, 0));
                try {
                    latLng3 = fromScreenLocation(new Point(0, mapHeight));
                    try {
                        latLng5 = fromScreenLocation(new Point(mapWidth, mapHeight));
                        try {
                            latLng = latLng5;
                            latLngBounds = LatLngBounds.builder().include(latLng3).include(latLng5).include(latLng4).include(latLng2).build();
                        } catch (Throwable th) {
                            th = th;
                            cm.a(th, this.f5746a, "getVisibleRegion");
                            latLngBounds = null;
                            latLng = latLng5;
                            VisibleRegion visibleRegion = new VisibleRegion(latLng3, latLng, latLng4, latLng2, latLngBounds);
                            return visibleRegion;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        latLng5 = null;
                        cm.a(th, this.f5746a, "getVisibleRegion");
                        latLngBounds = null;
                        latLng = latLng5;
                        VisibleRegion visibleRegion2 = new VisibleRegion(latLng3, latLng, latLng4, latLng2, latLngBounds);
                        return visibleRegion2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    latLng5 = null;
                    latLng3 = null;
                    cm.a(th, this.f5746a, "getVisibleRegion");
                    latLngBounds = null;
                    latLng = latLng5;
                    VisibleRegion visibleRegion22 = new VisibleRegion(latLng3, latLng, latLng4, latLng2, latLngBounds);
                    return visibleRegion22;
                }
            } catch (Throwable th4) {
                th = th4;
                latLng5 = null;
                latLng3 = null;
                latLng2 = latLng3;
                cm.a(th, this.f5746a, "getVisibleRegion");
                latLngBounds = null;
                latLng = latLng5;
                VisibleRegion visibleRegion222 = new VisibleRegion(latLng3, latLng, latLng4, latLng2, latLngBounds);
                return visibleRegion222;
            }
        } catch (Throwable th5) {
            th = th5;
            latLng5 = null;
            latLng4 = null;
            latLng3 = null;
            latLng2 = latLng3;
            cm.a(th, this.f5746a, "getVisibleRegion");
            latLngBounds = null;
            latLng = latLng5;
            VisibleRegion visibleRegion2222 = new VisibleRegion(latLng3, latLng, latLng4, latLng2, latLngBounds);
            return visibleRegion2222;
        }
        VisibleRegion visibleRegion22222 = new VisibleRegion(latLng3, latLng, latLng4, latLng2, latLngBounds);
        return visibleRegion22222;
    }

    public bi(y yVar) {
        this.f5747b = yVar;
    }

    public LatLng fromScreenLocation(Point point) throws RemoteException {
        s sVar = new s();
        this.f5747b.a(point.x, point.y, sVar);
        return new LatLng(sVar.f6278b, sVar.f6277a);
    }

    public PointF toMapLocation(LatLng latLng) throws RemoteException {
        s sVar = new s();
        this.f5747b.a(latLng.latitude, latLng.longitude, sVar);
        return new PointF((float) sVar.f6277a, (float) sVar.f6278b);
    }

    public Point toScreenLocation(LatLng latLng) throws RemoteException {
        if (latLng == null) {
            return null;
        }
        ae aeVar = new ae();
        this.f5747b.b(latLng.latitude, latLng.longitude, aeVar);
        return new Point(aeVar.f5591a, aeVar.f5592b);
    }
}
