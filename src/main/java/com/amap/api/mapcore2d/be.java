package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.RemoteException;
import com.amap.api.a.f;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;

public class be implements af {

    /* renamed from: a  reason: collision with root package name */
    private y f5732a;

    /* renamed from: b  reason: collision with root package name */
    private float f5733b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5734c = true;

    /* renamed from: d  reason: collision with root package name */
    private String f5735d;

    /* renamed from: e  reason: collision with root package name */
    private float f5736e;

    /* renamed from: f  reason: collision with root package name */
    private int f5737f;
    private int g;
    private List<LatLng> h;
    private List<ae> i = new ArrayList();
    private LatLngBounds j = null;

    public void destroy() {
    }

    public int getFillColor() throws RemoteException {
        return this.f5737f;
    }

    public int getStrokeColor() throws RemoteException {
        return this.g;
    }

    public float getStrokeWidth() throws RemoteException {
        return this.f5736e;
    }

    public float getZIndex() throws RemoteException {
        return this.f5733b;
    }

    public boolean isVisible() throws RemoteException {
        return this.f5734c;
    }

    public List<LatLng> getPoints() throws RemoteException {
        return b();
    }

    public int hashCodeRemote() throws RemoteException {
        return super.hashCode();
    }

    public String getId() throws RemoteException {
        if (this.f5735d == null) {
            this.f5735d = v.a("Polygon");
        }
        return this.f5735d;
    }

    public void remove() throws RemoteException {
        this.f5732a.removeGLOverlay(getId());
    }

    public boolean a() {
        if (this.j == null) {
            return false;
        }
        LatLngBounds mapBounds = this.f5732a.getMapBounds();
        if (mapBounds != null && !this.j.contains(mapBounds) && !this.j.intersects(mapBounds)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public List<LatLng> b() throws RemoteException {
        if (this.i == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ae next : this.i) {
            if (next != null) {
                s sVar = new s();
                this.f5732a.b(next.f5591a, next.f5592b, sVar);
                arrayList.add(new LatLng(sVar.f6278b, sVar.f6277a));
            }
        }
        return arrayList;
    }

    public void setFillColor(int i2) throws RemoteException {
        this.f5737f = i2;
    }

    public void setStrokeColor(int i2) throws RemoteException {
        this.g = i2;
    }

    public void setStrokeWidth(float f2) throws RemoteException {
        this.f5736e = f2;
    }

    public void setVisible(boolean z) throws RemoteException {
        this.f5734c = z;
    }

    public void setPoints(List<LatLng> list) throws RemoteException {
        this.h = list;
        a(list);
    }

    public void setZIndex(float f2) throws RemoteException {
        this.f5733b = f2;
        this.f5732a.invalidate();
    }

    public boolean contains(LatLng latLng) throws RemoteException {
        return cm.a(latLng, getPoints());
    }

    public boolean equalsRemote(f fVar) throws RemoteException {
        if (equals(fVar) || fVar.getId().equals(getId())) {
            return true;
        }
        return false;
    }

    public be(y yVar) {
        this.f5732a = yVar;
        try {
            this.f5735d = getId();
        } catch (RemoteException e2) {
            cm.a(e2, "PolygonDelegateImp", "PolygonDelegateImp");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<LatLng> list) throws RemoteException {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        this.i.clear();
        if (list != null) {
            LatLng latLng = null;
            for (LatLng next : list) {
                if (next != null && !next.equals(latLng)) {
                    ae aeVar = new ae();
                    this.f5732a.a(next.latitude, next.longitude, aeVar);
                    this.i.add(aeVar);
                    builder.include(next);
                    latLng = next;
                }
            }
            int size = this.i.size();
            if (size > 1) {
                ae aeVar2 = this.i.get(0);
                int i2 = size - 1;
                ae aeVar3 = this.i.get(i2);
                if (aeVar2.f5591a == aeVar3.f5591a && aeVar2.f5592b == aeVar3.f5592b) {
                    this.i.remove(i2);
                }
            }
        }
        this.j = builder.build();
    }

    public void a(Canvas canvas) throws RemoteException {
        if (this.i != null && this.i.size() != 0) {
            Path path = new Path();
            Point a2 = this.f5732a.d().a(new w(this.i.get(0).f5592b, this.i.get(0).f5591a), new Point());
            path.moveTo((float) a2.x, (float) a2.y);
            for (int i2 = 1; i2 < this.i.size(); i2++) {
                Point a3 = this.f5732a.d().a(new w(this.i.get(i2).f5592b, this.i.get(i2).f5591a), new Point());
                path.lineTo((float) a3.x, (float) a3.y);
            }
            Paint paint = new Paint();
            paint.setColor(getFillColor());
            paint.setAntiAlias(true);
            path.close();
            paint.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, paint);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(getStrokeColor());
            paint.setStrokeWidth(getStrokeWidth());
            canvas.drawPath(path, paint);
        }
    }
}
