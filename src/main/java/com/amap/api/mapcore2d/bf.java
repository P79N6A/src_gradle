package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.RemoteException;
import com.amap.api.a.f;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;

public class bf implements ag {

    /* renamed from: a  reason: collision with root package name */
    private y f5738a;

    /* renamed from: b  reason: collision with root package name */
    private float f5739b = 10.0f;

    /* renamed from: c  reason: collision with root package name */
    private int f5740c = -16777216;

    /* renamed from: d  reason: collision with root package name */
    private float f5741d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5742e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5743f;
    private boolean g;
    private String h;
    private List<ae> i = new ArrayList();
    private List<LatLng> j = new ArrayList();
    private LatLngBounds k = null;

    public void destroy() {
    }

    public int getColor() throws RemoteException {
        return this.f5740c;
    }

    public float getWidth() throws RemoteException {
        return this.f5739b;
    }

    public float getZIndex() throws RemoteException {
        return this.f5741d;
    }

    public boolean isDottedLine() {
        return this.f5743f;
    }

    public boolean isGeodesic() {
        return this.g;
    }

    public boolean isVisible() throws RemoteException {
        return this.f5742e;
    }

    public int hashCodeRemote() throws RemoteException {
        return super.hashCode();
    }

    public String getId() throws RemoteException {
        if (this.h == null) {
            this.h = v.a("Polyline");
        }
        return this.h;
    }

    public void remove() throws RemoteException {
        this.f5738a.removeGLOverlay(getId());
    }

    public List<LatLng> getPoints() throws RemoteException {
        if (this.g || this.f5743f) {
            return this.j;
        }
        return b();
    }

    private List<LatLng> b() throws RemoteException {
        if (this.i == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ae next : this.i) {
            if (next != null) {
                s sVar = new s();
                this.f5738a.b(next.f5591a, next.f5592b, sVar);
                arrayList.add(new LatLng(sVar.f6278b, sVar.f6277a));
            }
        }
        return arrayList;
    }

    public boolean a() {
        if (this.k == null) {
            return false;
        }
        LatLngBounds mapBounds = this.f5738a.getMapBounds();
        if (mapBounds != null && !mapBounds.contains(this.k) && !this.k.intersects(mapBounds)) {
            return false;
        }
        return true;
    }

    public void setColor(int i2) throws RemoteException {
        this.f5740c = i2;
    }

    public void setDottedLine(boolean z) {
        this.f5743f = z;
    }

    public void setVisible(boolean z) throws RemoteException {
        this.f5742e = z;
    }

    public void setWidth(float f2) throws RemoteException {
        this.f5739b = f2;
    }

    public void setGeodesic(boolean z) throws RemoteException {
        if (this.g != z) {
            this.g = z;
        }
    }

    public void setZIndex(float f2) throws RemoteException {
        this.f5741d = f2;
        this.f5738a.invalidate();
    }

    public void setPoints(List<LatLng> list) throws RemoteException {
        if (this.g || this.f5743f) {
            this.j = list;
        }
        a(list);
    }

    public boolean equalsRemote(f fVar) throws RemoteException {
        if (equals(fVar) || fVar.getId().equals(getId())) {
            return true;
        }
        return false;
    }

    public bf(y yVar) {
        this.f5738a = yVar;
        try {
            this.h = getId();
        } catch (RemoteException e2) {
            cm.a(e2, "PolylineDelegateImp", "PolylineDelegateImp");
        }
    }

    public void a(Canvas canvas) throws RemoteException {
        if (this.i != null && this.i.size() != 0 && this.f5739b > 0.0f) {
            try {
                Path path = new Path();
                Point a2 = this.f5738a.d().a(new w(this.i.get(0).f5592b, this.i.get(0).f5591a), new Point());
                path.moveTo((float) a2.x, (float) a2.y);
                for (int i2 = 1; i2 < this.i.size(); i2++) {
                    Point a3 = this.f5738a.d().a(new w(this.i.get(i2).f5592b, this.i.get(i2).f5591a), new Point());
                    path.lineTo((float) a3.x, (float) a3.y);
                }
                Paint paint = new Paint();
                paint.setColor(getColor());
                paint.setAntiAlias(true);
                paint.setStrokeWidth(getWidth());
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeJoin(Paint.Join.ROUND);
                if (this.f5743f) {
                    int width = (int) getWidth();
                    float f2 = (float) (width * 3);
                    float f3 = (float) width;
                    paint.setPathEffect(new DashPathEffect(new float[]{f2, f3, f2, f3}, 1.0f));
                }
                canvas.drawPath(path, paint);
            } catch (Throwable th) {
                cm.a(th, "PolylineDelegateImp", "draw");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<LatLng> list) throws RemoteException {
        List<LatLng> list2 = list;
        if (list2 != null) {
            try {
                if (list.size() != 0) {
                    LatLngBounds.Builder builder = LatLngBounds.builder();
                    this.i.clear();
                    if (list2 != null) {
                        LatLng latLng = null;
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            LatLng latLng2 = list2.get(i2);
                            if (latLng2 != null && !latLng2.equals(latLng)) {
                                if (!this.g) {
                                    ae aeVar = new ae();
                                    this.f5738a.a(latLng2.latitude, latLng2.longitude, aeVar);
                                    this.i.add(aeVar);
                                    builder.include(latLng2);
                                } else if (latLng != null) {
                                    if (Math.abs(latLng2.longitude - latLng.longitude) < 0.01d) {
                                        ae aeVar2 = new ae();
                                        this.f5738a.a(latLng.latitude, latLng.longitude, aeVar2);
                                        this.i.add(aeVar2);
                                        builder.include(latLng);
                                        ae aeVar3 = new ae();
                                        this.f5738a.a(latLng2.latitude, latLng2.longitude, aeVar3);
                                        this.i.add(aeVar3);
                                        builder.include(latLng2);
                                    } else {
                                        a(latLng, latLng2, this.i, builder);
                                    }
                                }
                                latLng = latLng2;
                            }
                        }
                    }
                    if (this.i.size() > 0) {
                        this.k = builder.build();
                    }
                }
            } catch (Throwable th) {
                cm.a(th, "PolylineDelegateImp", "calLatLng2Geo");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<ae> list, List<ae> list2, double d2) {
        List<ae> list3 = list;
        if (list.size() == 3) {
            int i2 = 0;
            int i3 = 0;
            while (i3 <= 10) {
                float f2 = (float) i3;
                float f3 = f2 / 10.0f;
                ae aeVar = new ae();
                double d3 = (double) f3;
                Double.isNaN(d3);
                double d4 = 1.0d - d3;
                double d5 = d4 * d4;
                double d6 = (double) list3.get(i2).f5591a;
                Double.isNaN(d6);
                double d7 = (double) (2.0f * f3);
                Double.isNaN(d7);
                double d8 = d7 * d4;
                double d9 = (double) list3.get(1).f5591a;
                Double.isNaN(d9);
                double d10 = (d6 * d5) + (d9 * d8 * d2);
                float f4 = f3 * f3;
                double d11 = (double) (((float) list3.get(2).f5591a) * f4);
                Double.isNaN(d11);
                double d12 = d10 + d11;
                double d13 = (double) list3.get(i2).f5592b;
                Double.isNaN(d13);
                double d14 = (double) list3.get(1).f5592b;
                Double.isNaN(d14);
                double d15 = (d13 * d5) + (d14 * d8 * d2);
                double d16 = (double) (((float) list3.get(2).f5592b) * f4);
                Double.isNaN(d16);
                double d17 = d15 + d16;
                double d18 = (double) f4;
                Double.isNaN(d18);
                double d19 = d5 + (d8 * d2) + d18;
                aeVar.f5591a = (int) (d12 / d19);
                aeVar.f5592b = (int) (d17 / d19);
                list2.add(aeVar);
                i3 = (int) (1.0f + f2);
                i2 = 0;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(LatLng latLng, LatLng latLng2, List<ae> list, LatLngBounds.Builder builder) {
        int i2;
        LatLng latLng3 = latLng;
        LatLng latLng4 = latLng2;
        double abs = (Math.abs(latLng3.longitude - latLng4.longitude) * 3.141592653589793d) / 180.0d;
        LatLng latLng5 = new LatLng((latLng4.latitude + latLng3.latitude) / 2.0d, (latLng4.longitude + latLng3.longitude) / 2.0d);
        builder.include(latLng3).include(latLng5).include(latLng4);
        if (latLng5.latitude > 0.0d) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        ae aeVar = new ae();
        this.f5738a.a(latLng3.latitude, latLng3.longitude, aeVar);
        ae aeVar2 = new ae();
        this.f5738a.a(latLng4.latitude, latLng4.longitude, aeVar2);
        ae aeVar3 = new ae();
        this.f5738a.a(latLng5.latitude, latLng5.longitude, aeVar3);
        double d2 = abs * 0.5d;
        double cos = Math.cos(d2);
        ae a2 = a(aeVar, aeVar2, aeVar3, Math.hypot((double) (aeVar.f5591a - aeVar2.f5591a), (double) (aeVar.f5592b - aeVar2.f5592b)) * 0.5d * Math.tan(d2), i2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aeVar);
        arrayList.add(a2);
        arrayList.add(aeVar2);
        a(arrayList, list, cos);
    }

    /* access modifiers changed from: package-private */
    public ae a(ae aeVar, ae aeVar2, ae aeVar3, double d2, int i2) {
        ae aeVar4 = new ae();
        double d3 = (double) (aeVar2.f5591a - aeVar.f5591a);
        double d4 = (double) (aeVar2.f5592b - aeVar.f5592b);
        Double.isNaN(d4);
        Double.isNaN(d4);
        Double.isNaN(d3);
        Double.isNaN(d3);
        double d5 = (double) i2;
        Double.isNaN(d5);
        double sqrt = (d5 * d2) / Math.sqrt(((d4 * d4) / (d3 * d3)) + 1.0d);
        double d6 = (double) aeVar3.f5592b;
        Double.isNaN(d6);
        aeVar4.f5592b = (int) (sqrt + d6);
        double d7 = (double) (aeVar3.f5592b - aeVar4.f5592b);
        Double.isNaN(d7);
        Double.isNaN(d4);
        Double.isNaN(d3);
        double d8 = (double) aeVar3.f5591a;
        Double.isNaN(d8);
        aeVar4.f5591a = (int) (((d7 * d4) / d3) + d8);
        return aeVar4;
    }
}
