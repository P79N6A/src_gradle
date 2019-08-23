package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.RemoteException;
import com.amap.api.a.f;
import com.amap.api.maps2d.AMapUtils;
import com.amap.api.maps2d.model.LatLng;

public class o implements z {

    /* renamed from: a  reason: collision with root package name */
    private LatLng f6253a;

    /* renamed from: b  reason: collision with root package name */
    private double f6254b;

    /* renamed from: c  reason: collision with root package name */
    private float f6255c = 10.0f;

    /* renamed from: d  reason: collision with root package name */
    private int f6256d = -16777216;

    /* renamed from: e  reason: collision with root package name */
    private int f6257e;

    /* renamed from: f  reason: collision with root package name */
    private float f6258f;
    private boolean g = true;
    private String h;
    private y i;

    public boolean a() {
        return true;
    }

    public void destroy() {
        this.f6253a = null;
    }

    public int hashCodeRemote() throws RemoteException {
        return 0;
    }

    public LatLng getCenter() throws RemoteException {
        return this.f6253a;
    }

    public int getFillColor() throws RemoteException {
        return this.f6257e;
    }

    public double getRadius() throws RemoteException {
        return this.f6254b;
    }

    public int getStrokeColor() throws RemoteException {
        return this.f6256d;
    }

    public float getStrokeWidth() throws RemoteException {
        return this.f6255c;
    }

    public float getZIndex() throws RemoteException {
        return this.f6258f;
    }

    public boolean isVisible() throws RemoteException {
        return this.g;
    }

    public String getId() throws RemoteException {
        if (this.h == null) {
            this.h = v.a("Circle");
        }
        return this.h;
    }

    public void remove() throws RemoteException {
        this.i.removeGLOverlay(getId());
        this.i.postInvalidate();
    }

    public void setCenter(LatLng latLng) throws RemoteException {
        this.f6253a = latLng;
    }

    public void setFillColor(int i2) throws RemoteException {
        this.f6257e = i2;
    }

    public void setRadius(double d2) throws RemoteException {
        this.f6254b = d2;
    }

    public void setStrokeColor(int i2) throws RemoteException {
        this.f6256d = i2;
    }

    public void setStrokeWidth(float f2) throws RemoteException {
        this.f6255c = f2;
    }

    public void setVisible(boolean z) throws RemoteException {
        this.g = z;
        this.i.postInvalidate();
    }

    public void setZIndex(float f2) throws RemoteException {
        this.f6258f = f2;
        this.i.invalidate();
    }

    public o(y yVar) {
        this.i = yVar;
        try {
            this.h = getId();
        } catch (RemoteException e2) {
            cm.a(e2, "CircleDelegateImp", "CircleDelegateIme");
        }
    }

    public boolean contains(LatLng latLng) throws RemoteException {
        if (this.f6254b >= ((double) AMapUtils.calculateLineDistance(this.f6253a, latLng))) {
            return true;
        }
        return false;
    }

    public boolean equalsRemote(f fVar) throws RemoteException {
        if (equals(fVar) || fVar.getId().equals(getId())) {
            return true;
        }
        return false;
    }

    public void a(Canvas canvas) throws RemoteException {
        if (getCenter() != null && this.f6254b > 0.0d && isVisible()) {
            try {
                float a2 = this.i.a().f5664b.a((float) getRadius());
                w wVar = new w((int) (this.f6253a.latitude * 1000000.0d), (int) (this.f6253a.longitude * 1000000.0d));
                Point point = new Point();
                this.i.d().a(wVar, point);
                Paint paint = new Paint();
                paint.setColor(getFillColor());
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawCircle((float) point.x, (float) point.y, a2, paint);
                paint.setColor(getStrokeColor());
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(getStrokeWidth());
                canvas.drawCircle((float) point.x, (float) point.y, a2, paint);
            } catch (Throwable th) {
                cm.a(th, "CircleDelegateImp", "draw");
            }
        }
    }
}
