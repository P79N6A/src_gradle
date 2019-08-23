package com.amap.api.mapcore2d;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.Message;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import java.util.LinkedList;

public final class aq implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    private float f5611a;

    /* renamed from: b  reason: collision with root package name */
    private float f5612b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public az f5613c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5614d;

    /* renamed from: e  reason: collision with root package name */
    private b f5615e = new b();

    /* renamed from: f  reason: collision with root package name */
    private a f5616f = new a();

    class a implements bz {

        /* renamed from: b  reason: collision with root package name */
        private by f5618b;

        /* renamed from: c  reason: collision with root package name */
        private Message f5619c;

        /* renamed from: d  reason: collision with root package name */
        private Runnable f5620d;

        private void d() {
            this.f5618b = null;
            this.f5619c = null;
            this.f5620d = null;
        }

        public boolean a() {
            if (this.f5618b != null) {
                return this.f5618b.f();
            }
            return false;
        }

        public void b() {
            if (this.f5618b != null) {
                this.f5618b.e();
            }
        }

        public void c() {
            if (this.f5619c != null) {
                this.f5619c.getTarget().sendMessage(this.f5619c);
            }
            if (this.f5620d != null) {
                this.f5620d.run();
            }
            d();
            if (aq.this.f5613c != null && aq.this.f5613c.f5666d != null) {
                aq.this.f5613c.f5666d.f5677a = false;
            }
        }

        private a() {
        }

        public void a(w wVar) {
            if (wVar != null && aq.this.f5613c != null) {
                if (wVar.d() == Long.MIN_VALUE || wVar.c() == Long.MIN_VALUE) {
                    aq.this.a(aq.this.f5613c.h.b(wVar));
                    return;
                }
                aq.this.a(wVar);
            }
        }

        private by a(w wVar, int i) {
            int i2;
            if (i < 500) {
                i2 = 500;
            } else {
                i2 = i;
            }
            try {
                by byVar = new by(i2, 10, aq.this.f5613c.h.l, wVar, i2, this);
                return byVar;
            } catch (Throwable th) {
                cm.a(th, "MapController", "makeTransTool");
                return null;
            }
        }

        public void a(w wVar, Message message, Runnable runnable, int i) {
            if (aq.this.f5613c != null) {
                aq.this.f5613c.f5666d.f5677a = true;
                aq.this.f5613c.h.m = wVar.g();
            }
            this.f5618b = a(wVar, i);
            this.f5619c = message;
            this.f5620d = runnable;
            if (this.f5618b != null) {
                this.f5618b.d();
            }
        }
    }

    class b implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        private LinkedList<Animation> f5622b;

        /* renamed from: c  reason: collision with root package name */
        private cf f5623c;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        public void a() {
            this.f5622b.clear();
        }

        private b() {
            this.f5622b = new LinkedList<>();
            this.f5623c = null;
        }

        public void onAnimationEnd(Animation animation) {
            if (aq.this.f5613c != null) {
                if (this.f5622b.size() == 0) {
                    aq.this.f5613c.f5667e.b();
                } else {
                    aq.this.f5613c.f5665c.g().startAnimation(this.f5622b.remove());
                }
            }
        }

        public void a(int i, int i2, float f2, float f3, int i3) {
            boolean z;
            try {
                if (this.f5623c == null) {
                    this.f5623c = new cf(aq.this.f5613c.f5665c.g(), this, i3);
                } else {
                    cf cfVar = this.f5623c;
                    if (i3 <= 160) {
                        i3 = 160;
                    }
                    cfVar.a(i3);
                }
                this.f5623c.f5832c = f2;
                if (f2 > f3) {
                    z = true;
                } else {
                    z = false;
                }
                this.f5623c.a(f2, z, (float) i, (float) i2);
            } catch (Throwable th) {
                cm.a(th, "MapController", "zoomTo");
            }
        }

        private void a(float f2, int i, int i2, boolean z, int i3) {
            try {
                if (this.f5623c != null || aq.this.f5613c == null || aq.this.f5613c.f5665c == null) {
                    cf cfVar = this.f5623c;
                    if (i3 <= 160) {
                        i3 = 160;
                    }
                    cfVar.a(i3);
                } else {
                    this.f5623c = new cf(aq.this.f5613c.f5665c.g(), this, i3);
                }
                if (this.f5623c != null) {
                    this.f5623c.f5833d = z;
                    this.f5623c.f5832c = f2;
                    this.f5623c.a(f2, false, (float) i, (float) i2);
                }
            } catch (Throwable th) {
                cm.a(th, "MapController", "doZoomOut");
            }
        }

        private void b(float f2, int i, int i2, boolean z, int i3) {
            try {
                if (this.f5623c == null) {
                    this.f5623c = new cf(aq.this.f5613c.f5665c.g(), this, i3);
                } else {
                    cf cfVar = this.f5623c;
                    if (i3 <= 160) {
                        i3 = 160;
                    }
                    cfVar.a(i3);
                }
                this.f5623c.f5832c = f2;
                this.f5623c.f5833d = z;
                if (this.f5623c.f5833d) {
                    Point point = new Point(i, i2);
                    w a2 = aq.this.f5613c.f5665c.g().d().a(i, i2);
                    aq.this.f5613c.h.l = aq.this.f5613c.h.a(a2);
                    aq.this.f5613c.h.a(point);
                }
                this.f5623c.a(f2, true, (float) i, (float) i2);
            } catch (Throwable th) {
                cm.a(th, "MapController", "doZoomIn");
            }
        }

        public void a(int i, int i2, float f2, boolean z, boolean z2, int i3) {
            if (!z) {
                a(f2, i, i2, z2, i3);
            } else {
                b(f2, i, i2, z2, i3);
            }
        }
    }

    public final void e() {
        this.f5614d = true;
    }

    public final float b() {
        return this.f5612b;
    }

    public final void a(w wVar) {
        if (b(wVar)) {
            c(wVar);
        }
    }

    public final void a(w wVar, float f2) {
        if (b(wVar) || f(f2)) {
            c(wVar);
            e(f2);
        }
    }

    public final boolean a(int i) {
        return a(1, i);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i, int i2) {
        if (this.f5613c == null || this.f5613c.f5665c == null) {
            return false;
        }
        return a(this.f5613c.f5665c.c() / 2, this.f5613c.f5665c.d() / 2, true, false, i, i2);
    }

    public final void a(boolean z) {
        float f2;
        this.f5613c.f5665c.g().r();
        if (z) {
            f2 = this.f5613c.f5665c.e() + 1.0f;
        } else {
            f2 = this.f5613c.f5665c.e() - 1.0f;
        }
        float a2 = this.f5613c.f5665c.g().a(f2);
        if (a2 != this.f5613c.f5665c.e()) {
            c(a2);
        }
    }

    public final boolean a(float f2, int i, int i2, int i3) {
        return a(i, i2, f2, i3);
    }

    public final void a(w wVar, int i) {
        this.f5616f.a(wVar, null, null, i);
    }

    public final boolean a(int i, int i2, float f2, int i3) {
        boolean z = false;
        if (this.f5613c == null || this.f5613c.f5665c == null) {
            return false;
        }
        this.f5613c.f5665c.g().r();
        float e2 = this.f5613c.f5665c.e();
        if (f2 != e2) {
            this.f5615e.a(i, i2, f2, e2, i3);
            z = true;
        }
        try {
            if (this.f5613c.g.c().isScaleControlsEnabled()) {
                this.f5613c.g.s();
            }
        } catch (RemoteException e3) {
            cm.a(e3, "MapController", "zoomToAnimation");
        }
        return z;
    }

    public final float a() {
        return this.f5611a;
    }

    public final boolean c() {
        return a(0);
    }

    public final boolean d() {
        return b(0);
    }

    public final boolean f() {
        return this.f5616f.a();
    }

    public final void g() {
        this.f5616f.b();
    }

    public final void b(float f2) {
        this.f5612b = f2;
    }

    public final void b(boolean z) {
        this.f5615e.a();
        this.f5616f.b();
    }

    public final float c(float f2) {
        if (!f(f2)) {
            return f2;
        }
        e(f2);
        return f2;
    }

    aq(az azVar) {
        this.f5613c = azVar;
    }

    private boolean f(float f2) {
        if (this.f5613c == null || this.f5613c.f5665c == null || f2 == this.f5613c.f5665c.e()) {
            return false;
        }
        return true;
    }

    private boolean b(w wVar) {
        if (wVar == null || this.f5613c == null || this.f5613c.f5665c == null) {
            return false;
        }
        w f2 = this.f5613c.f5665c.f();
        if (f2 == null) {
            return false;
        }
        if (wVar.b() == f2.b() && wVar.a() == f2.a()) {
            return false;
        }
        return true;
    }

    private void c(w wVar) {
        if (!(this.f5613c == null || this.f5613c.g == null)) {
            this.f5613c.g.r();
        }
        if (this.f5613c != null && this.f5613c.f5665c != null) {
            this.f5613c.f5665c.a(wVar);
        }
    }

    public final void a(float f2) {
        this.f5611a = f2;
    }

    public final float d(float f2) {
        if (this.f5613c == null || this.f5613c.f5665c == null) {
            return f2;
        }
        if (f2 < ((float) this.f5613c.f5665c.b())) {
            f2 = (float) this.f5613c.f5665c.b();
        }
        if (f2 > ((float) this.f5613c.f5665c.a())) {
            f2 = (float) this.f5613c.f5665c.a();
        }
        return f2;
    }

    private float e(float f2) {
        if (this.f5613c == null || this.f5613c.f5665c == null) {
            return f2;
        }
        b g = this.f5613c.f5665c.g();
        g.r();
        float a2 = g.a(f2);
        this.f5613c.f5665c.a(a2);
        try {
            if (this.f5613c.g.c().isScaleControlsEnabled()) {
                this.f5613c.g.s();
            }
        } catch (RemoteException e2) {
            cm.a(e2, "MapController", "setZoom");
        }
        return a2;
    }

    public final boolean b(int i) {
        return b(1, i);
    }

    public final float a(float f2, int i) {
        if (f2 >= ((float) q.f6268c)) {
            f2 = (float) q.f6268c;
        }
        if (f2 <= ((float) q.f6269d)) {
            f2 = (float) q.f6269d;
        }
        if (!f(f2)) {
            return f2;
        }
        b(f2, i);
        return f2;
    }

    public final boolean b(float f2, int i) {
        return a(this.f5613c.f5665c.c() / 2, this.f5613c.f5665c.d() / 2, f2, i);
    }

    public final boolean c(int i, int i2) {
        return a(i, i2, true, true);
    }

    public final void d(int i, int i2) {
        if (this.f5614d) {
            this.f5614d = false;
        } else if ((i != 0 || i2 != 0) && this.f5613c != null) {
            try {
                if (q.s) {
                    this.f5613c.h.a(new PointF(0.0f, 0.0f), new PointF((float) i, (float) i2), this.f5613c.f5665c.e());
                }
                this.f5613c.f5665c.a(false, false);
            } catch (Throwable th) {
                cm.a(th, "MapController", "scrollBy");
            }
        }
    }

    public final void a(float f2, float f3) {
        a(f2, f3, 0, 0, 0);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i, int i2) {
        if (this.f5613c == null || this.f5613c.f5665c == null) {
            return false;
        }
        return a(this.f5613c.f5665c.c() / 2, this.f5613c.f5665c.d() / 2, false, false, i, i2);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        boolean z = true;
        switch (i) {
            case 19:
                d(0, -10);
                break;
            case 20:
                d(0, 10);
                break;
            case 21:
                d(-10, 0);
                break;
            case 22:
                d(10, 0);
                break;
            default:
                z = false;
                break;
        }
        return z;
    }

    public final void a(int i, int i2, int i3) {
        if (this.f5614d) {
            this.f5614d = false;
        } else if ((i != 0 || i2 != 0) && this.f5613c != null) {
            try {
                if (q.s) {
                    a(this.f5613c.h.a(new PointF(0.0f, 0.0f), new PointF((float) i, (float) i2)), i3);
                }
                this.f5613c.f5665c.a(false, false);
            } catch (Throwable th) {
                cm.a(th, "MapController", "scrollBy");
            }
        }
    }

    private boolean a(int i, int i2, boolean z, boolean z2) {
        return a(i, i2, z, z2, 1, 0);
    }

    public final void a(float f2, float f3, int i, int i2, int i3) {
        float f4;
        float f5;
        if (f2 > 0.0f && f3 > 0.0f && this.f5613c != null && this.f5613c.f5665c != null && this.f5613c.f5664b != null) {
            try {
                float e2 = this.f5613c.f5665c.e();
                int b2 = this.f5613c.f5664b.b(i, i2, i3);
                int a2 = this.f5613c.f5664b.a(i, i2, i3);
                if (b2 == 0 && a2 == 0) {
                    this.f5611a = f2;
                    this.f5612b = f3;
                    return;
                }
                try {
                    double min = this.f5613c.h.k / Math.min((double) (((float) a2) / f2), (double) (((float) b2) / f3));
                    int i4 = 0;
                    double d2 = this.f5613c.h.f5646d;
                    while (true) {
                        d2 /= 2.0d;
                        if (d2 <= min) {
                            break;
                        }
                        i4++;
                    }
                    double d3 = this.f5613c.h.f5646d;
                    double d4 = (double) (1 << i4);
                    Double.isNaN(d4);
                    double log = Math.log((d3 / d4) / min) / Math.log(2.0d);
                    double d5 = (double) i4;
                    Double.isNaN(d5);
                    f5 = (float) (d5 + log);
                } catch (Exception e3) {
                    e = e3;
                    f4 = e2;
                    cm.a(e, "MapController", "zoomToSpan");
                    c(f4);
                }
                try {
                    float d6 = d(f5);
                    float f6 = (float) ((int) d6);
                    double d7 = (double) (d6 - f6);
                    try {
                        if (d7 > 1.0d - ((1.0d - az.f5663a) * 0.4d)) {
                            f4 = f6 + ((float) az.f5663a);
                        } else if (d7 > az.f5663a) {
                            f4 = f6 + ((float) (az.f5663a - 9.999999747378752E-5d));
                        } else {
                            double d8 = az.f5663a;
                            Double.isNaN(d7);
                            if (Math.abs(d7 - d8) <= 9.999999747378752E-5d) {
                                d6 = ((float) (az.f5663a - 9.999999747378752E-5d)) + f6;
                            }
                            f4 = d6;
                        }
                    } catch (Exception e4) {
                        Exception exc = e4;
                        f4 = d6;
                        e = exc;
                        cm.a(e, "MapController", "zoomToSpan");
                        c(f4);
                    }
                } catch (Exception e5) {
                    e = e5;
                    f4 = f5;
                    cm.a(e, "MapController", "zoomToSpan");
                    c(f4);
                }
                c(f4);
            } catch (Exception e6) {
                e = e6;
                f4 = 0.0f;
                cm.a(e, "MapController", "zoomToSpan");
                c(f4);
            }
        }
    }

    private boolean a(int i, int i2, boolean z, boolean z2, int i3, int i4) {
        float f2;
        int i5 = i3;
        boolean z3 = false;
        if (this.f5613c == null || this.f5613c.f5665c == null) {
            return false;
        }
        this.f5613c.f5665c.g().r();
        if (z) {
            f2 = this.f5613c.f5665c.e() + ((float) i5);
        } else {
            f2 = this.f5613c.f5665c.e() - ((float) i5);
        }
        float a2 = this.f5613c.f5665c.g().a(f2);
        if (a2 != this.f5613c.f5665c.e()) {
            a(i, i2, a2, z, z2, i4);
            z3 = true;
        }
        try {
            if (this.f5613c.g.c().isScaleControlsEnabled()) {
                this.f5613c.g.s();
            }
        } catch (RemoteException e2) {
            cm.a(e2, "MapController", "zoomWithAnimation");
        }
        return z3;
    }

    public final void a(int i, int i2, float f2, boolean z, boolean z2, int i3) {
        this.f5615e.a(i, i2, f2, z, z2, i3);
    }
}
