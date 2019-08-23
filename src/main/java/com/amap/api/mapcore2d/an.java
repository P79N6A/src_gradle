package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import com.amap.api.maps2d.model.TileProvider;
import java.util.Iterator;

public class an extends ao {

    /* renamed from: a  reason: collision with root package name */
    av f5597a;

    /* renamed from: b  reason: collision with root package name */
    public String f5598b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f5599c = 19;

    /* renamed from: d  reason: collision with root package name */
    public int f5600d = 3;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5601e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5602f;
    public boolean g;
    public boolean h = true;
    public long i;
    public cb j;
    TileProvider k;
    public int l = -1;
    public String m = "";
    ba n;
    u o;
    bn<bs> p;
    private String r = "LayerPropertys";
    private boolean s;

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.s;
    }

    public int hashCode() {
        return this.l;
    }

    public String toString() {
        return this.f5598b;
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.q.e();
        this.o.a((ba) null);
        this.n.c();
        this.p.clear();
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.s = z;
        if (z) {
            this.q.d();
            return;
        }
        this.n.c();
        this.q.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        return this.f5598b.equals(((an) obj).f5598b);
    }

    public an(av avVar) {
        this.f5597a = avVar;
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas) {
        try {
            if (this.p != null) {
                Iterator it2 = this.p.iterator();
                while (it2.hasNext()) {
                    bs bsVar = (bs) it2.next();
                    if (bsVar != null) {
                        if (bsVar.h < 0) {
                            boolean z = this.f5601e;
                        } else {
                            Bitmap a2 = this.n.a(bsVar.h);
                            PointF a3 = this.f5597a.a(bsVar.f5777b, bsVar.f5778c);
                            if (!(a2 == null || a3 == null)) {
                                canvas.drawBitmap(a2, null, new RectF(a3.x, a3.y, a3.x + ((float) this.f5597a.f5643a), a3.y + ((float) this.f5597a.f5643a)), null);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            cm.a(th, this.r, "drawLayer");
        }
    }
}
