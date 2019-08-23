package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.RemoteException;
import com.amap.api.a.f;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;

public class x implements aa {

    /* renamed from: a  reason: collision with root package name */
    private final double f6296a = 0.01745329251994329d;

    /* renamed from: b  reason: collision with root package name */
    private final double f6297b = 6371000.79d;

    /* renamed from: c  reason: collision with root package name */
    private y f6298c;

    /* renamed from: d  reason: collision with root package name */
    private BitmapDescriptor f6299d;

    /* renamed from: e  reason: collision with root package name */
    private LatLng f6300e;

    /* renamed from: f  reason: collision with root package name */
    private float f6301f;
    private float g;
    private LatLngBounds h;
    private float i;
    private float j;
    private boolean k = true;
    private float l;
    private float m = 0.5f;
    private float n = 0.5f;
    private String o;
    private Bitmap p;

    public float getBearing() throws RemoteException {
        return this.i;
    }

    public LatLngBounds getBounds() throws RemoteException {
        return this.h;
    }

    public float getHeight() throws RemoteException {
        return this.g;
    }

    public LatLng getPosition() throws RemoteException {
        return this.f6300e;
    }

    public float getTransparency() throws RemoteException {
        return this.l;
    }

    public float getWidth() throws RemoteException {
        return this.f6301f;
    }

    public float getZIndex() throws RemoteException {
        return this.j;
    }

    public boolean isVisible() throws RemoteException {
        return this.k;
    }

    public int hashCodeRemote() throws RemoteException {
        return super.hashCode();
    }

    public void b() throws RemoteException {
        if (this.f6300e == null) {
            d();
            return;
        }
        if (this.h == null) {
            c();
        }
    }

    public String getId() throws RemoteException {
        if (this.o == null) {
            this.o = v.a("GroundOverlay");
        }
        return this.o;
    }

    public void remove() throws RemoteException {
        this.f6298c.removeGLOverlay(getId());
    }

    public boolean a() {
        if (this.h == null) {
            return false;
        }
        LatLngBounds mapBounds = this.f6298c.getMapBounds();
        if (mapBounds != null && !mapBounds.contains(this.h) && !this.h.intersects(mapBounds)) {
            return false;
        }
        return true;
    }

    public void destroy() {
        try {
            remove();
            if (this.f6299d != null) {
                Bitmap bitmap = this.f6299d.getBitmap();
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f6299d = null;
                }
            }
            this.f6300e = null;
            this.h = null;
        } catch (Exception e2) {
            cm.a(e2, "GroundOverlayDelegateImp", "destroy");
        }
    }

    private void c() {
        double d2 = (double) this.f6301f;
        Double.isNaN(d2);
        double cos = d2 / ((Math.cos(this.f6300e.latitude * 0.01745329251994329d) * 6371000.79d) * 0.01745329251994329d);
        double d3 = (double) this.g;
        Double.isNaN(d3);
        double d4 = d3 / 111194.94043265979d;
        try {
            double d5 = this.f6300e.latitude;
            double d6 = (double) (1.0f - this.n);
            Double.isNaN(d6);
            double d7 = d5 - (d6 * d4);
            double d8 = this.f6300e.longitude;
            double d9 = (double) this.m;
            Double.isNaN(d9);
            LatLng latLng = new LatLng(d7, d8 - (d9 * cos));
            double d10 = this.f6300e.latitude;
            double d11 = (double) this.n;
            Double.isNaN(d11);
            double d12 = d10 + (d11 * d4);
            double d13 = this.f6300e.longitude;
            double d14 = (double) (1.0f - this.m);
            Double.isNaN(d14);
            this.h = new LatLngBounds(latLng, new LatLng(d12, d13 + (d14 * cos)));
        } catch (Throwable unused) {
        }
    }

    private void d() {
        LatLng latLng = this.h.southwest;
        LatLng latLng2 = this.h.northeast;
        double d2 = latLng.latitude;
        double d3 = (double) (1.0f - this.n);
        Double.isNaN(d3);
        double d4 = d2 + (d3 * (latLng2.latitude - latLng.latitude));
        double d5 = latLng.longitude;
        double d6 = (double) this.m;
        Double.isNaN(d6);
        this.f6300e = new LatLng(d4, d5 + (d6 * (latLng2.longitude - latLng.longitude)));
        this.f6301f = (float) (Math.cos(this.f6300e.latitude * 0.01745329251994329d) * 6371000.79d * (latLng2.longitude - latLng.longitude) * 0.01745329251994329d);
        this.g = (float) ((latLng2.latitude - latLng.latitude) * 6371000.79d * 0.01745329251994329d);
    }

    public void setImage(BitmapDescriptor bitmapDescriptor) throws RemoteException {
        this.f6299d = bitmapDescriptor;
    }

    public void setTransparency(float f2) throws RemoteException {
        this.l = f2;
    }

    public void setDimensions(float f2) throws RemoteException {
        float f3 = this.f6301f;
        this.f6301f = f2;
        this.g = f2;
    }

    public void setVisible(boolean z) throws RemoteException {
        this.k = z;
        this.f6298c.postInvalidate();
    }

    public void setZIndex(float f2) throws RemoteException {
        this.j = f2;
        this.f6298c.postInvalidate();
    }

    private w a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new w((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
    }

    public boolean equalsRemote(f fVar) throws RemoteException {
        if (equals(fVar) || fVar.getId().equals(getId())) {
            return true;
        }
        return false;
    }

    public void setBearing(float f2) throws RemoteException {
        float f3 = (((-f2) % 360.0f) + 360.0f) % 360.0f;
        Double.doubleToLongBits((double) this.i);
        Double.doubleToLongBits((double) f3);
        this.i = f3;
    }

    public void setPosition(LatLng latLng) throws RemoteException {
        if (this.f6300e == null || this.f6300e.equals(latLng)) {
            this.f6300e = latLng;
            return;
        }
        this.f6300e = latLng;
        c();
    }

    public void setPositionFromBounds(LatLngBounds latLngBounds) throws RemoteException {
        if (this.h == null || this.h.equals(latLngBounds)) {
            this.h = latLngBounds;
            return;
        }
        this.h = latLngBounds;
        d();
    }

    x(y yVar) {
        this.f6298c = yVar;
        try {
            this.o = getId();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlayDelegateImp", "GroundOverlayDelegateImp");
        }
    }

    public void a(Canvas canvas) throws RemoteException {
        if (this.k && ((this.f6300e != null || this.h != null) && this.f6299d != null)) {
            b();
            if (this.f6301f != 0.0f || this.g != 0.0f) {
                this.p = this.f6299d.getBitmap();
                if (this.p != null && !this.p.isRecycled()) {
                    LatLng latLng = this.h.southwest;
                    LatLng latLng2 = this.h.northeast;
                    LatLng latLng3 = this.f6300e;
                    w a2 = a(latLng);
                    w a3 = a(latLng2);
                    w a4 = a(latLng3);
                    Point point = new Point();
                    Point point2 = new Point();
                    Point point3 = new Point();
                    this.f6298c.d().a(a2, point);
                    this.f6298c.d().a(a3, point2);
                    this.f6298c.d().a(a4, point3);
                    Paint paint = new Paint();
                    RectF rectF = new RectF((float) point.x, (float) point2.y, (float) point2.x, (float) point.y);
                    paint.setAlpha((int) (255.0f - (this.l * 255.0f)));
                    paint.setFilterBitmap(true);
                    canvas.save();
                    canvas.rotate(this.i, (float) point3.x, (float) point3.y);
                    canvas.drawBitmap(this.p, null, rectF, paint);
                    canvas.restore();
                }
            }
        }
    }

    public void setAnchor(float f2, float f3) throws RemoteException {
        this.m = f2;
        this.n = f3;
    }

    public void setDimensions(float f2, float f3) throws RemoteException {
        if (this.f6301f != f2) {
            float f4 = this.g;
        }
        this.f6301f = f2;
        this.g = f3;
    }
}
