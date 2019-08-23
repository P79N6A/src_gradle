package com.amap.api.mapcore2d;

import android.graphics.Point;
import android.os.RemoteException;
import com.amap.api.a.m;
import com.amap.api.maps2d.model.CameraPosition;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private b f5589a;

    /* renamed from: b  reason: collision with root package name */
    private int f5590b;

    public a(b bVar) {
        this.f5589a = bVar;
    }

    /* access modifiers changed from: protected */
    public void a(m mVar) throws RemoteException {
        try {
            if (this.f5589a != null) {
                if (this.f5589a.i() != null) {
                    float zoomLevel = this.f5589a.getZoomLevel();
                    if (mVar.nowType == m.a.scrollBy) {
                        if (this.f5589a.f5688b != null) {
                            this.f5589a.f5688b.d((int) mVar.xPixel, (int) mVar.yPixel);
                        }
                        this.f5589a.postInvalidate();
                    } else if (mVar.nowType == m.a.zoomIn) {
                        this.f5589a.i().a(true);
                    } else if (mVar.nowType == m.a.zoomOut) {
                        this.f5589a.i().a(false);
                    } else if (mVar.nowType == m.a.zoomTo) {
                        this.f5589a.i().c(mVar.zoom);
                    } else if (mVar.nowType == m.a.zoomBy) {
                        float a2 = this.f5589a.a(mVar.amount + zoomLevel);
                        Point point = mVar.focus;
                        float f2 = a2 - zoomLevel;
                        if (point != null) {
                            this.f5589a.a(f2, point, false, 0);
                        } else {
                            this.f5589a.i().c(a2);
                        }
                    } else if (mVar.nowType == m.a.newCameraPosition) {
                        CameraPosition cameraPosition = mVar.cameraPosition;
                        if (cameraPosition != null) {
                            this.f5589a.i().a(new w((int) (cameraPosition.target.latitude * 1000000.0d), (int) (cameraPosition.target.longitude * 1000000.0d)), cameraPosition.zoom);
                        }
                    } else if (mVar.nowType == m.a.changeCenter) {
                        CameraPosition cameraPosition2 = mVar.cameraPosition;
                        this.f5589a.i().a(new w((int) (cameraPosition2.target.latitude * 1000000.0d), (int) (cameraPosition2.target.longitude * 1000000.0d)));
                    } else {
                        if (mVar.nowType != m.a.newLatLngBounds) {
                            if (mVar.nowType != m.a.newLatLngBoundsWithSize) {
                                mVar.isChangeFinished = true;
                            }
                        }
                        this.f5589a.a(mVar, false, -1);
                    }
                    if (zoomLevel != ((float) this.f5590b) && this.f5589a.c().isScaleControlsEnabled()) {
                        this.f5589a.s();
                    }
                    l.a().b();
                }
            }
        } catch (Exception e2) {
            cm.a(e2, "AMapCallback", "runCameraUpdate");
        }
    }
}
