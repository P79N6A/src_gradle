package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import com.amap.api.a.e;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.MarkerOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ay implements ab {

    /* renamed from: a  reason: collision with root package name */
    private static int f5656a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f5657b;

    /* renamed from: c  reason: collision with root package name */
    private float f5658c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public CopyOnWriteArrayList<BitmapDescriptor> f5659d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f5660e = 20;

    /* renamed from: f  reason: collision with root package name */
    private String f5661f;
    private LatLng g;
    private LatLng h;
    private String i;
    private String j;
    private float k = 0.5f;
    private float l = 1.0f;
    private boolean m;
    private boolean n = true;
    /* access modifiers changed from: private */
    public at o;
    private Object p;
    private boolean q;
    private a r;
    private boolean s;
    private int t;
    private int u;
    private float v;
    private int w;

    class a extends Thread {
        public void run() {
            try {
                setName("MarkerThread");
                while (!Thread.currentThread().isInterrupted() && ay.this.f5659d != null && ay.this.f5659d.size() > 1) {
                    if (ay.this.f5657b == ay.this.f5659d.size() - 1) {
                        int unused = ay.this.f5657b = 0;
                    } else {
                        int unused2 = ay.this.f5657b = ay.this.f5657b + 1;
                    }
                    ay.this.o.a().postInvalidate();
                    Thread.sleep((long) (ay.this.f5660e * 250));
                    if (ay.this.f5659d == null) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (InterruptedException e2) {
                cm.a(e2, "MarkerDelegateImp", "run");
            } catch (Throwable unused3) {
            }
        }

        private a() {
        }
    }

    public float g() {
        return this.k;
    }

    public int getAddIndex() {
        return this.w;
    }

    public Object getObject() {
        return this.p;
    }

    public int getPeriod() throws RemoteException {
        return this.f5660e;
    }

    public String getSnippet() {
        return this.j;
    }

    public String getTitle() {
        return this.i;
    }

    public float getZIndex() {
        return this.v;
    }

    public float h() {
        return this.l;
    }

    public boolean isDraggable() {
        return this.m;
    }

    public boolean isViewMode() {
        return this.s;
    }

    public boolean isVisible() {
        return this.n;
    }

    public int hashCodeRemote() {
        return super.hashCode();
    }

    public boolean isInfoWindowShown() {
        return this.o.f(this);
    }

    public boolean remove() {
        return this.o.b((ab) this);
    }

    public ae e() {
        ae d2 = d();
        if (d2 == null) {
            return null;
        }
        return d2;
    }

    public String getId() {
        if (this.f5661f == null) {
            this.f5661f = a("Marker");
        }
        return this.f5661f;
    }

    public void hideInfoWindow() {
        if (isInfoWindowShown()) {
            this.o.e(this);
        }
    }

    public void showInfoWindow() {
        if (isVisible()) {
            this.o.d(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f5659d == null) {
            this.f5659d = new CopyOnWriteArrayList<>();
        } else {
            this.f5659d.clear();
        }
    }

    public int getHeight() {
        if (f() != null) {
            return f().getHeight();
        }
        return 0;
    }

    public int getWidth() {
        if (f() != null) {
            return f().getWidth();
        }
        return 0;
    }

    public s b() {
        s sVar = new s();
        if (!(this.f5659d == null || this.f5659d.size() == 0)) {
            sVar.f6277a = (double) (((float) getWidth()) * this.k);
            sVar.f6278b = (double) (((float) getHeight()) * this.l);
        }
        return sVar;
    }

    public BitmapDescriptor f() {
        if (this.f5659d == null) {
            return null;
        }
        if (this.f5659d.size() == 0) {
            c();
            this.f5659d.add(BitmapDescriptorFactory.defaultMarker());
        } else if (this.f5659d.get(0) == null) {
            this.f5659d.clear();
            return f();
        }
        return this.f5659d.get(0);
    }

    public ArrayList<BitmapDescriptor> getIcons() {
        if (this.f5659d == null || this.f5659d.size() <= 0) {
            return null;
        }
        ArrayList<BitmapDescriptor> arrayList = new ArrayList<>();
        Iterator<BitmapDescriptor> it2 = this.f5659d.iterator();
        while (it2.hasNext()) {
            BitmapDescriptor next = it2.next();
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public LatLng getPosition() {
        if (!this.s) {
            return this.g;
        }
        s sVar = new s();
        this.o.f5630a.a(this.t, this.u, sVar);
        return new LatLng(sVar.f6278b, sVar.f6277a);
    }

    public LatLng getRealPosition() {
        if (this.s) {
            s sVar = new s();
            this.o.f5630a.a(this.t, this.u, sVar);
            return new LatLng(sVar.f6278b, sVar.f6277a);
        } else if (this.q) {
            return this.h;
        } else {
            return this.g;
        }
    }

    public ae d() {
        w wVar;
        if (getPosition() == null) {
            return null;
        }
        ae aeVar = new ae();
        try {
            if (this.q) {
                wVar = new w((int) (getRealPosition().latitude * 1000000.0d), (int) (getRealPosition().longitude * 1000000.0d));
            } else {
                wVar = new w((int) (getPosition().latitude * 1000000.0d), (int) (getPosition().longitude * 1000000.0d));
            }
            Point point = new Point();
            this.o.a().d().a(wVar, point);
            aeVar.f5591a = point.x;
            aeVar.f5592b = point.y;
        } catch (Throwable unused) {
        }
        return aeVar;
    }

    public void destroy() {
        try {
            if (this.f5659d == null) {
                this.g = null;
                this.p = null;
                this.r = null;
                return;
            }
            Iterator<BitmapDescriptor> it2 = this.f5659d.iterator();
            while (it2.hasNext()) {
                BitmapDescriptor next = it2.next();
                if (next != null) {
                    Bitmap bitmap = next.getBitmap();
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            this.f5659d = null;
            this.g = null;
            this.p = null;
            this.r = null;
            if (!(this.o == null || this.o.f5630a == null)) {
                this.o.f5630a.invalidate();
            }
        } catch (Exception e2) {
            cm.a(e2, "MarkerDelegateImp", "destroy");
        }
    }

    public Rect a() {
        ae e2 = e();
        if (e2 == null) {
            return new Rect(0, 0, 0, 0);
        }
        try {
            int width = getWidth();
            int height = getHeight();
            Rect rect = new Rect();
            if (this.f5658c == 0.0f) {
                float f2 = (float) height;
                rect.top = (int) (((float) e2.f5592b) - (this.l * f2));
                float f3 = (float) width;
                rect.left = (int) (((float) e2.f5591a) - (this.k * f3));
                rect.bottom = (int) (((float) e2.f5592b) + (f2 * (1.0f - this.l)));
                rect.right = (int) (((float) e2.f5591a) + ((1.0f - this.k) * f3));
            } else {
                float f4 = (float) width;
                float f5 = (float) height;
                ae a2 = a((-this.k) * f4, (this.l - 1.0f) * f5);
                ae a3 = a((-this.k) * f4, this.l * f5);
                ae a4 = a((1.0f - this.k) * f4, this.l * f5);
                ae a5 = a((1.0f - this.k) * f4, (this.l - 1.0f) * f5);
                rect.top = e2.f5592b - Math.max(a2.f5592b, Math.max(a3.f5592b, Math.max(a4.f5592b, a5.f5592b)));
                rect.left = e2.f5591a + Math.min(a2.f5591a, Math.min(a3.f5591a, Math.min(a4.f5591a, a5.f5591a)));
                rect.bottom = e2.f5592b - Math.min(a2.f5592b, Math.min(a3.f5592b, Math.min(a4.f5592b, a5.f5592b)));
                rect.right = e2.f5591a + Math.max(a2.f5591a, Math.max(a3.f5591a, Math.max(a4.f5591a, a5.f5591a)));
            }
            return rect;
        } catch (Throwable th) {
            cm.a(th, "MarkerDelegateImp", "getRect");
            return new Rect(0, 0, 0, 0);
        }
    }

    public void setAddIndex(int i2) {
        this.w = i2;
    }

    public void setDraggable(boolean z) {
        this.m = z;
    }

    public void setObject(Object obj) {
        this.p = obj;
    }

    public void setSnippet(String str) {
        this.j = str;
    }

    public void setTitle(String str) {
        this.i = str;
    }

    public void setZIndex(float f2) {
        this.v = f2;
        this.o.d();
    }

    public void setPeriod(int i2) throws RemoteException {
        if (i2 <= 1) {
            this.f5660e = 1;
        } else {
            this.f5660e = i2;
        }
    }

    private static String a(String str) {
        f5656a++;
        return str + f5656a;
    }

    public boolean equalsRemote(e eVar) {
        if (eVar == null || (!equals(eVar) && !eVar.getId().equals(getId()))) {
            return false;
        }
        return true;
    }

    public void setVisible(boolean z) {
        this.n = z;
        if (!z && isInfoWindowShown()) {
            this.o.e(this);
        }
        this.o.a().postInvalidate();
    }

    private void a(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            c();
            this.f5659d.add(bitmapDescriptor.clone());
        }
        this.o.a().postInvalidate();
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            try {
                if (this.f5659d != null) {
                    this.f5659d.clear();
                    this.f5659d.add(bitmapDescriptor);
                    if (isInfoWindowShown()) {
                        this.o.e(this);
                        this.o.d(this);
                    }
                    this.o.a().postInvalidate();
                }
            } catch (Throwable th) {
                cm.a(th, "MarkerDelegateImp", "setIcon");
            }
        }
    }

    public void setIcons(ArrayList<BitmapDescriptor> arrayList) throws RemoteException {
        if (arrayList != null) {
            a(arrayList);
            if (this.r == null) {
                this.r = new a();
                this.r.start();
            }
            if (isInfoWindowShown()) {
                this.o.e(this);
                this.o.d(this);
            }
            this.o.a().postInvalidate();
        }
    }

    public void setPosition(LatLng latLng) {
        if (latLng != null) {
            if (this.q) {
                try {
                    double[] a2 = fg.a(latLng.longitude, latLng.latitude);
                    this.h = new LatLng(a2[1], a2[0]);
                } catch (Exception e2) {
                    cm.a(e2, "MarkerDelegateImp", "setPosition");
                    this.h = latLng;
                }
            }
            this.s = false;
            this.g = latLng;
            this.o.a().postInvalidate();
        }
    }

    public void setRotateAngle(float f2) {
        this.f5658c = (((-f2) % 360.0f) + 360.0f) % 360.0f;
        if (isInfoWindowShown()) {
            this.o.e(this);
            this.o.d(this);
        }
        this.o.a().postInvalidate();
    }

    public void a(LatLng latLng) {
        if (this.q) {
            this.h = latLng;
        } else {
            this.g = latLng;
        }
        try {
            Point screenLocation = this.o.a().getAMapProjection().toScreenLocation(latLng);
            this.t = screenLocation.x;
            this.u = screenLocation.y;
        } catch (Throwable th) {
            cm.a(th, "MarkerDelegateImp", "setOffSetPosition");
        }
    }

    public void a(ArrayList<BitmapDescriptor> arrayList) {
        c();
        if (arrayList != null) {
            Iterator<BitmapDescriptor> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                BitmapDescriptor next = it2.next();
                if (next != null) {
                    this.f5659d.add(next.clone());
                }
            }
            if (arrayList.size() > 1 && this.r == null) {
                this.r = new a();
                this.r.start();
            }
        }
        this.o.a().postInvalidate();
    }

    public void setPositionByPixels(int i2, int i3) {
        this.t = i2;
        this.u = i3;
        this.s = true;
        if (isInfoWindowShown()) {
            showInfoWindow();
        }
    }

    public void setAnchor(float f2, float f3) {
        if (this.k != f2 || this.l != f3) {
            this.k = f2;
            this.l = f3;
            if (isInfoWindowShown()) {
                this.o.e(this);
                this.o.d(this);
            }
            this.o.a().postInvalidate();
        }
    }

    private ae a(float f2, float f3) {
        double d2 = (double) this.f5658c;
        Double.isNaN(d2);
        ae aeVar = new ae();
        double d3 = (double) f2;
        double d4 = (double) ((float) ((d2 * 3.141592653589793d) / 180.0d));
        double cos = Math.cos(d4);
        Double.isNaN(d3);
        double d5 = (double) f3;
        double sin = Math.sin(d4);
        Double.isNaN(d5);
        aeVar.f5591a = (int) ((cos * d3) + (sin * d5));
        double cos2 = Math.cos(d4);
        Double.isNaN(d5);
        double sin2 = Math.sin(d4);
        Double.isNaN(d3);
        aeVar.f5592b = (int) ((d5 * cos2) - (d3 * sin2));
        return aeVar;
    }

    public ay(MarkerOptions markerOptions, at atVar) {
        this.o = atVar;
        this.q = markerOptions.isGps();
        this.v = markerOptions.getZIndex();
        if (markerOptions.getPosition() != null) {
            if (this.q) {
                try {
                    double[] a2 = fg.a(markerOptions.getPosition().longitude, markerOptions.getPosition().latitude);
                    this.h = new LatLng(a2[1], a2[0]);
                } catch (Exception e2) {
                    cm.a(e2, "MarkerDelegateImp", "MarkerDelegateImp");
                    this.h = markerOptions.getPosition();
                }
            }
            this.g = markerOptions.getPosition();
        }
        this.k = markerOptions.getAnchorU();
        this.l = markerOptions.getAnchorV();
        this.n = markerOptions.isVisible();
        this.j = markerOptions.getSnippet();
        this.i = markerOptions.getTitle();
        this.m = markerOptions.isDraggable();
        this.f5660e = markerOptions.getPeriod();
        this.f5661f = getId();
        a(markerOptions.getIcons());
        if (this.f5659d != null && this.f5659d.size() == 0) {
            a(markerOptions.getIcon());
        }
    }

    public void a(Canvas canvas, y yVar) {
        ae aeVar;
        Bitmap bitmap;
        if (this.n && getPosition() != null && f() != null) {
            if (isViewMode()) {
                aeVar = new ae(this.t, this.u);
            } else {
                aeVar = e();
            }
            ArrayList<BitmapDescriptor> icons = getIcons();
            if (icons != null) {
                if (icons.size() > 1) {
                    bitmap = icons.get(this.f5657b).getBitmap();
                } else if (icons.size() == 1) {
                    bitmap = icons.get(0).getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    canvas.save();
                    canvas.rotate(this.f5658c, (float) aeVar.f5591a, (float) aeVar.f5592b);
                    canvas.drawBitmap(bitmap, ((float) aeVar.f5591a) - (g() * ((float) bitmap.getWidth())), ((float) aeVar.f5592b) - (h() * ((float) bitmap.getHeight())), null);
                    canvas.restore();
                }
            }
        }
    }
}
