package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class bu extends View {

    /* renamed from: a  reason: collision with root package name */
    CopyOnWriteArrayList<Integer> f5788a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private y f5789b;

    /* renamed from: c  reason: collision with root package name */
    private CopyOnWriteArrayList<ak> f5790c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private a f5791d = new a();

    class a implements Comparator<Object> {
        private a() {
        }

        public int compare(Object obj, Object obj2) {
            ak akVar = (ak) obj;
            ak akVar2 = (ak) obj2;
            if (!(akVar == null || akVar2 == null)) {
                try {
                    if (akVar.getZIndex() > akVar2.getZIndex()) {
                        return 1;
                    }
                    if (akVar.getZIndex() < akVar2.getZIndex()) {
                        return -1;
                    }
                } catch (Exception e2) {
                    cm.a(e2, "TileOverlayView", "compare");
                }
            }
            return 0;
        }
    }

    public void b() {
        Iterator<ak> it2 = this.f5790c.iterator();
        while (it2.hasNext()) {
            ak next = it2.next();
            if (next != null) {
                next.remove();
            }
        }
        this.f5790c.clear();
    }

    public void d() {
        Iterator<ak> it2 = this.f5790c.iterator();
        while (it2.hasNext()) {
            ak next = it2.next();
            if (next != null) {
                next.a();
            }
        }
    }

    public void e() {
        Iterator<ak> it2 = this.f5790c.iterator();
        while (it2.hasNext()) {
            ak next = it2.next();
            if (next != null) {
                next.b();
            }
        }
    }

    public void f() {
        Iterator<ak> it2 = this.f5790c.iterator();
        while (it2.hasNext()) {
            ak next = it2.next();
            if (next != null) {
                next.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Object[] array = this.f5790c.toArray();
        Arrays.sort(array, this.f5791d);
        this.f5790c.clear();
        for (Object obj : array) {
            if (obj != null) {
                this.f5790c.add((ak) obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        if (this.f5790c.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean b(ak akVar) {
        return this.f5790c.remove(akVar);
    }

    public void a(ak akVar) {
        if (akVar != null) {
            b(akVar);
            this.f5790c.add(akVar);
            c();
        }
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas) {
        Iterator<ak> it2 = this.f5790c.iterator();
        while (it2.hasNext()) {
            ak next = it2.next();
            if (next.isVisible()) {
                next.a(canvas);
            }
        }
    }

    public void a(boolean z) {
        Iterator<ak> it2 = this.f5790c.iterator();
        while (it2.hasNext()) {
            ak next = it2.next();
            if (next != null && next.isVisible()) {
                next.a(z);
            }
        }
    }

    public bu(Context context, y yVar) {
        super(context);
        this.f5789b = yVar;
    }
}
