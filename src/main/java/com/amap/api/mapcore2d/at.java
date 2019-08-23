package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.amap.api.a.e;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class at extends View {

    /* renamed from: a  reason: collision with root package name */
    b f5630a;

    /* renamed from: b  reason: collision with root package name */
    a f5631b = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<aj> f5632c = new ArrayList<>(8);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<ab> f5633d = new ArrayList<>(8);

    /* renamed from: e  reason: collision with root package name */
    private volatile int f5634e = 0;

    /* renamed from: f  reason: collision with root package name */
    private Handler f5635f = new Handler();
    private Runnable g = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            com.amap.api.mapcore2d.dg.b(r0, "MapOverlayImageView", "changeOverlayIndex");
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void run() {
            /*
                r3 = this;
                monitor-enter(r3)
                com.amap.api.mapcore2d.at r0 = com.amap.api.mapcore2d.at.this     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                java.util.ArrayList r0 = r0.f5633d     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                com.amap.api.mapcore2d.at r1 = com.amap.api.mapcore2d.at.this     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                com.amap.api.mapcore2d.at$a r1 = r1.f5631b     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                java.util.Collections.sort(r0, r1)     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                com.amap.api.mapcore2d.at r0 = com.amap.api.mapcore2d.at.this     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                java.util.ArrayList r0 = r0.f5632c     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                com.amap.api.mapcore2d.at r1 = com.amap.api.mapcore2d.at.this     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                com.amap.api.mapcore2d.at$a r1 = r1.f5631b     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                java.util.Collections.sort(r0, r1)     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                com.amap.api.mapcore2d.at r0 = com.amap.api.mapcore2d.at.this     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                r0.invalidate()     // Catch:{ Throwable -> 0x0024, all -> 0x0022 }
                monitor-exit(r3)
                return
            L_0x0022:
                r0 = move-exception
                goto L_0x002e
            L_0x0024:
                r0 = move-exception
                java.lang.String r1 = "MapOverlayImageView"
                java.lang.String r2 = "changeOverlayIndex"
                com.amap.api.mapcore2d.dg.b((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x0030, all -> 0x0022 }
                monitor-exit(r3)
                return
            L_0x002e:
                monitor-exit(r3)
                throw r0
            L_0x0030:
                monitor-exit(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.at.AnonymousClass1.run():void");
        }
    };
    private ae h;
    private ab i;
    private ab j = null;
    private float k = 0.0f;
    private CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<>();

    static class a implements Serializable, Comparator<ac> {
        a() {
        }

        /* renamed from: a */
        public int compare(ac acVar, ac acVar2) {
            if (!(acVar == null || acVar2 == null)) {
                try {
                    if (acVar.getZIndex() > acVar2.getZIndex()) {
                        return 1;
                    }
                    if (acVar.getZIndex() < acVar2.getZIndex()) {
                        return -1;
                    }
                } catch (Throwable th) {
                    cm.a(th, "MapOverlayImageView", "compare");
                }
            }
            return 0;
        }
    }

    public ab e() {
        return this.i;
    }

    private int h() {
        int i2 = this.f5634e;
        this.f5634e = i2 + 1;
        return i2;
    }

    public b a() {
        return this.f5630a;
    }

    /* access modifiers changed from: protected */
    public int b() {
        return this.f5633d.size();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f5635f.removeCallbacks(this.g);
        this.f5635f.postDelayed(this.g, 5);
    }

    public void f() {
        try {
            if (this.f5635f != null) {
                this.f5635f.removeCallbacksAndMessages(null);
            }
            c();
        } catch (Exception e2) {
            cm.a(e2, "MapOverlayImageView", "destory");
        }
    }

    public synchronized void c() {
        try {
            if (this.f5633d != null) {
                Iterator<ab> it2 = this.f5633d.iterator();
                while (it2.hasNext()) {
                    it2.next().destroy();
                }
                this.f5633d.clear();
            }
            if (this.f5632c != null) {
                this.f5632c.clear();
            }
            this.f5630a.invalidate();
        } catch (Throwable th) {
            cm.a(th, "MapOverlayImageView", "clear");
        }
    }

    private void i() {
        Iterator<ab> it2 = this.f5633d.iterator();
        while (it2.hasNext()) {
            ab next = it2.next();
            if (!(next == null || this.i == null || !this.i.getId().equals(next.getId()))) {
                try {
                    if (this.i.isViewMode()) {
                        return;
                    }
                } catch (RemoteException e2) {
                    cm.a(e2, "MapOverlayImageView", "redrawInfoWindow");
                }
                Rect a2 = next.a();
                this.h = new ae(a2.left + (next.getWidth() / 2), a2.top);
                this.f5630a.redrawInfoWindow();
            }
        }
    }

    public synchronized List<Marker> g() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Rect rect = new Rect(0, 0, this.f5630a.getMapWidth(), this.f5630a.getMapHeight());
        ae aeVar = new ae();
        Iterator<ab> it2 = this.f5633d.iterator();
        while (it2.hasNext()) {
            ab next = it2.next();
            LatLng realPosition = next.getRealPosition();
            if (realPosition == null) {
                break;
            }
            this.f5630a.b(realPosition.latitude, realPosition.longitude, aeVar);
            if (a(rect, aeVar.f5591a, aeVar.f5592b)) {
                arrayList.add(new Marker((e) next));
            }
        }
        return arrayList;
    }

    public boolean f(ab abVar) {
        return this.f5630a.b(abVar);
    }

    public synchronized void b(aj ajVar) {
        this.f5632c.remove(ajVar);
        postInvalidate();
    }

    public void e(ab abVar) {
        if (f(abVar)) {
            this.f5630a.e();
        }
    }

    public synchronized void a(aj ajVar) throws RemoteException {
        this.f5632c.remove(ajVar);
        ajVar.setAddIndex(h());
        this.f5632c.add(ajVar);
        d();
    }

    public synchronized boolean b(ab abVar) {
        boolean remove;
        e(abVar);
        remove = this.f5633d.remove(abVar);
        postInvalidate();
        this.f5630a.invalidate();
        return remove;
    }

    public void d(ab abVar) {
        if (abVar != null) {
            if (this.h == null) {
                this.h = new ae();
            }
            Rect a2 = abVar.a();
            this.h = new ae(a2.left + (abVar.getWidth() / 2), a2.top);
            this.i = abVar;
            try {
                this.f5630a.a(e());
            } catch (Throwable th) {
                cm.a(th, "MapOverlayImageView", "showInfoWindow");
            }
        }
    }

    public synchronized ab a(MotionEvent motionEvent) {
        for (int size = this.f5633d.size() - 1; size >= 0; size--) {
            ab abVar = this.f5633d.get(size);
            if (abVar != null && a(abVar.a(), (int) motionEvent.getX(), (int) motionEvent.getY())) {
                return abVar;
            }
        }
        return null;
    }

    public synchronized boolean b(MotionEvent motionEvent) {
        boolean z;
        z = false;
        int size = this.f5633d.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            ab abVar = this.f5633d.get(size);
            if (abVar != null) {
                Rect a2 = abVar.a();
                boolean a3 = a(a2, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (a3) {
                    this.h = new ae(a2.left + (abVar.getWidth() / 2), a2.top);
                    this.i = abVar;
                    z = a3;
                    break;
                }
            }
            size--;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(com.amap.api.mapcore2d.ab r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0032
            com.amap.api.mapcore2d.ab r0 = r3.j     // Catch:{ all -> 0x002f }
            if (r0 != r4) goto L_0x0008
            goto L_0x0032
        L_0x0008:
            com.amap.api.mapcore2d.ab r0 = r3.j     // Catch:{ all -> 0x002f }
            r1 = 1325400064(0x4f000000, float:2.14748365E9)
            if (r0 == 0) goto L_0x001f
            com.amap.api.mapcore2d.ab r0 = r3.j     // Catch:{ all -> 0x002f }
            float r0 = r0.getZIndex()     // Catch:{ all -> 0x002f }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            com.amap.api.mapcore2d.ab r0 = r3.j     // Catch:{ all -> 0x002f }
            float r2 = r3.k     // Catch:{ all -> 0x002f }
            r0.setZIndex(r2)     // Catch:{ all -> 0x002f }
        L_0x001f:
            float r0 = r4.getZIndex()     // Catch:{ all -> 0x002f }
            r3.k = r0     // Catch:{ all -> 0x002f }
            r3.j = r4     // Catch:{ all -> 0x002f }
            r4.setZIndex(r1)     // Catch:{ all -> 0x002f }
            r3.d()     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0032:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.at.c(com.amap.api.mapcore2d.ab):void");
    }

    public synchronized ab a(String str) throws RemoteException {
        Iterator<ab> it2 = this.f5633d.iterator();
        while (it2.hasNext()) {
            ab next = it2.next();
            if (next != null && next.getId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public synchronized void a(Canvas canvas) {
        i();
        Rect rect = new Rect(0, 0, this.f5630a.getMapWidth(), this.f5630a.getMapHeight());
        ae aeVar = new ae();
        Iterator<ab> it2 = this.f5633d.iterator();
        Iterator<aj> it3 = this.f5632c.iterator();
        ab b2 = b(it2, rect, aeVar);
        aj a2 = a(it3, rect, aeVar);
        while (true) {
            if (b2 != null || a2 != null) {
                if (b2 == null) {
                    a2.draw(canvas);
                    a2 = a(it3, rect, aeVar);
                } else if (a2 == null) {
                    b2.a(canvas, this.f5630a);
                    b2 = b(it2, rect, aeVar);
                } else {
                    if (b2.getZIndex() >= a2.getZIndex()) {
                        if (b2.getZIndex() != a2.getZIndex() || b2.getAddIndex() >= a2.getAddIndex()) {
                            a2.draw(canvas);
                            a2 = a(it3, rect, aeVar);
                        }
                    }
                    b2.a(canvas, this.f5630a);
                    b2 = b(it2, rect, aeVar);
                }
            }
        }
    }

    public synchronized void a(ab abVar) {
        try {
            e(abVar);
            abVar.setAddIndex(h());
            this.f5633d.remove(abVar);
            this.f5633d.add(abVar);
            d();
        } catch (Throwable th) {
            cm.a(th, "MapOverlayImageView", "addMarker");
        }
    }

    public boolean a(Rect rect, int i2, int i3) {
        return rect.contains(i2, i3);
    }

    public at(Context context, AttributeSet attributeSet, b bVar) {
        super(context, attributeSet);
        this.f5630a = bVar;
    }

    private aj a(Iterator<aj> it2, Rect rect, ae aeVar) {
        while (it2.hasNext()) {
            aj next = it2.next();
            LatLng position = next.getPosition();
            if (position != null) {
                this.f5630a.b(position.latitude, position.longitude, aeVar);
                if (a(rect, aeVar.f5591a, aeVar.f5592b)) {
                    return next;
                }
            }
        }
        return null;
    }

    private ab b(Iterator<ab> it2, Rect rect, ae aeVar) {
        while (it2.hasNext()) {
            ab next = it2.next();
            LatLng realPosition = next.getRealPosition();
            if (realPosition != null) {
                this.f5630a.b(realPosition.latitude, realPosition.longitude, aeVar);
                if (a(rect, aeVar.f5591a, aeVar.f5592b)) {
                    return next;
                }
            }
        }
        return null;
    }
}
