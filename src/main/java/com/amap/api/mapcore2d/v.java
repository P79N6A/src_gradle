package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.os.Handler;
import android.os.RemoteException;
import com.amap.api.maps2d.model.CircleOptions;
import com.amap.api.maps2d.model.GroundOverlayOptions;
import com.amap.api.maps2d.model.PolygonOptions;
import com.amap.api.maps2d.model.PolylineOptions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class v {

    /* renamed from: b  reason: collision with root package name */
    private static int f6284b;

    /* renamed from: a  reason: collision with root package name */
    y f6285a;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public CopyOnWriteArrayList<ad> f6286c = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public a f6287d = new a();

    /* renamed from: e  reason: collision with root package name */
    private Handler f6288e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private Runnable f6289f = new Runnable() {
        public synchronized void run() {
            try {
                Object[] array = v.this.f6286c.toArray();
                Arrays.sort(array, v.this.f6287d);
                v.this.f6286c.clear();
                for (Object obj : array) {
                    v.this.f6286c.add((ad) obj);
                }
            } catch (Throwable th) {
                dg.b(th, "MapOverlayImageView", "changeOverlayIndex");
            }
        }
    };

    class a implements Comparator<Object> {
        private a() {
        }

        public int compare(Object obj, Object obj2) {
            ad adVar = (ad) obj;
            ad adVar2 = (ad) obj2;
            if (!(adVar == null || adVar2 == null)) {
                try {
                    if (adVar.getZIndex() > adVar2.getZIndex()) {
                        return 1;
                    }
                    if (adVar.getZIndex() < adVar2.getZIndex()) {
                        return -1;
                    }
                } catch (Exception e2) {
                    cm.a(e2, "GLOverlayLayer", "compare");
                }
            }
            return 0;
        }
    }

    public void a(ad adVar) throws RemoteException {
        try {
            b(adVar.getId());
            this.f6286c.add(adVar);
            c();
        } catch (Throwable th) {
            cm.a(th, "GLOverlayLayer", "addOverlay");
        }
    }

    private void c() {
        this.f6288e.removeCallbacks(this.f6289f);
        this.f6288e.postDelayed(this.f6289f, 10);
    }

    public void b() {
        try {
            Iterator<ad> it2 = this.f6286c.iterator();
            while (it2.hasNext()) {
                it2.next().destroy();
            }
            a();
        } catch (Exception e2) {
            cm.a(e2, "GLOverlayLayer", "destory");
        }
    }

    public void a() {
        Iterator<ad> it2 = this.f6286c.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
        try {
            Iterator<ad> it3 = this.f6286c.iterator();
            while (it3.hasNext()) {
                it3.next().destroy();
            }
            this.f6286c.clear();
        } catch (Exception e2) {
            cm.a(e2, "GLOverlayLayer", "clear");
        }
    }

    public boolean b(String str) throws RemoteException {
        ad c2 = c(str);
        if (c2 != null) {
            return this.f6286c.remove(c2);
        }
        return false;
    }

    public static synchronized String a(String str) {
        String str2;
        synchronized (v.class) {
            f6284b++;
            str2 = str + f6284b;
        }
        return str2;
    }

    public v(y yVar) {
        this.f6285a = yVar;
    }

    private ad c(String str) throws RemoteException {
        Iterator<ad> it2 = this.f6286c.iterator();
        while (it2.hasNext()) {
            ad next = it2.next();
            if (next != null && next.getId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public synchronized af a(PolygonOptions polygonOptions) throws RemoteException {
        if (polygonOptions == null) {
            return null;
        }
        be beVar = new be(this.f6285a);
        beVar.setFillColor(polygonOptions.getFillColor());
        beVar.setPoints(polygonOptions.getPoints());
        beVar.setVisible(polygonOptions.isVisible());
        beVar.setStrokeWidth(polygonOptions.getStrokeWidth());
        beVar.setZIndex(polygonOptions.getZIndex());
        beVar.setStrokeColor(polygonOptions.getStrokeColor());
        a((ad) beVar);
        return beVar;
    }

    public synchronized aa a(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        if (groundOverlayOptions == null) {
            return null;
        }
        x xVar = new x(this.f6285a);
        xVar.setAnchor(groundOverlayOptions.getAnchorU(), groundOverlayOptions.getAnchorV());
        xVar.setDimensions(groundOverlayOptions.getWidth(), groundOverlayOptions.getHeight());
        xVar.setImage(groundOverlayOptions.getImage());
        xVar.setPosition(groundOverlayOptions.getLocation());
        xVar.setPositionFromBounds(groundOverlayOptions.getBounds());
        xVar.setBearing(groundOverlayOptions.getBearing());
        xVar.setTransparency(groundOverlayOptions.getTransparency());
        xVar.setVisible(groundOverlayOptions.isVisible());
        xVar.setZIndex(groundOverlayOptions.getZIndex());
        a((ad) xVar);
        return xVar;
    }

    public synchronized ag a(PolylineOptions polylineOptions) throws RemoteException {
        if (polylineOptions == null) {
            return null;
        }
        bf bfVar = new bf(this.f6285a);
        bfVar.setColor(polylineOptions.getColor());
        bfVar.setDottedLine(polylineOptions.isDottedLine());
        bfVar.setGeodesic(polylineOptions.isGeodesic());
        bfVar.setPoints(polylineOptions.getPoints());
        bfVar.setVisible(polylineOptions.isVisible());
        bfVar.setWidth(polylineOptions.getWidth());
        bfVar.setZIndex(polylineOptions.getZIndex());
        a((ad) bfVar);
        return bfVar;
    }

    public synchronized z a(CircleOptions circleOptions) throws RemoteException {
        if (circleOptions == null) {
            return null;
        }
        o oVar = new o(this.f6285a);
        oVar.setFillColor(circleOptions.getFillColor());
        oVar.setCenter(circleOptions.getCenter());
        oVar.setVisible(circleOptions.isVisible());
        oVar.setStrokeWidth(circleOptions.getStrokeWidth());
        oVar.setZIndex(circleOptions.getZIndex());
        oVar.setStrokeColor(circleOptions.getStrokeColor());
        oVar.setRadius(circleOptions.getRadius());
        a((ad) oVar);
        return oVar;
    }

    public void a(Canvas canvas) {
        Object[] array = this.f6286c.toArray();
        Arrays.sort(array, this.f6287d);
        this.f6286c.clear();
        for (Object obj : array) {
            try {
                this.f6286c.add((ad) obj);
            } catch (Throwable th) {
                cm.a(th, "GLOverlayLayer", "draw");
            }
        }
        int size = this.f6286c.size();
        Iterator<ad> it2 = this.f6286c.iterator();
        while (it2.hasNext()) {
            ad next = it2.next();
            try {
                if (next.isVisible()) {
                    if (size <= 20) {
                        next.a(canvas);
                    } else if (next.a()) {
                        next.a(canvas);
                    }
                }
            } catch (RemoteException e2) {
                cm.a(e2, "GLOverlayLayer", "draw");
            }
        }
    }
}
