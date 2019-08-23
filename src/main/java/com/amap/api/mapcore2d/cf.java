package com.amap.api.mapcore2d;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.animation.Animation;

public class cf extends e {

    /* renamed from: c  reason: collision with root package name */
    public float f5832c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5833d;

    /* renamed from: e  reason: collision with root package name */
    private Animation.AnimationListener f5834e;

    /* renamed from: f  reason: collision with root package name */
    private b f5835f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private boolean m;

    /* access modifiers changed from: protected */
    public void c() {
        b();
    }

    /* access modifiers changed from: protected */
    public void a() {
        try {
            if (this.f5835f != null) {
                if (this.f5835f.f5687a != null) {
                    if (this.l) {
                        this.f5835f.f5687a.h.f5645c += this.k;
                    } else {
                        this.f5835f.f5687a.h.f5645c -= this.k;
                    }
                    Matrix matrix = new Matrix();
                    matrix.setScale(this.f5835f.f5687a.h.f5645c, this.f5835f.f5687a.h.f5645c, this.g, this.h);
                    this.f5835f.c(this.f5835f.f5687a.h.f5645c);
                    this.f5835f.b(matrix);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (!this.m) {
            try {
                if (this.f5835f != null) {
                    if (this.f5835f.a() != null) {
                        this.f5835f.a().f5667e.f5670b = false;
                        if (this.f5833d) {
                            Point point = new Point((int) this.g, (int) this.h);
                            w a2 = this.f5835f.d().a((int) this.g, (int) this.h);
                            this.f5835f.a().h.l = this.f5835f.a().h.a(a2);
                            this.f5835f.a().h.a(point);
                            this.f5835f.a().f5665c.a(false, false);
                        }
                        this.f5835f.i().c(this.f5832c);
                        this.f5834e.onAnimationEnd(null);
                        if (this.f5833d) {
                            Point point2 = new Point(this.f5835f.a().f5665c.c() / 2, this.f5835f.a().f5665c.d() / 2);
                            w a3 = this.f5835f.d().a(this.f5835f.a().f5665c.c() / 2, this.f5835f.a().f5665c.d() / 2);
                            this.f5835f.a().h.l = this.f5835f.a().h.a(a3);
                            this.f5835f.a().h.a(point2);
                            this.f5835f.a().f5665c.a(false, false);
                        }
                        this.f5835f.f5687a.h.f5645c = 1.0f;
                        bb.j = 1.0f;
                        this.f5835f.a().a(true);
                        l.a().b();
                        this.f5994a = 160;
                    }
                }
            } catch (Exception e2) {
                cm.a(e2, "ZoomCtlAnim", "onStop");
            }
        }
    }

    public void a(int i2) {
        this.f5994a = i2 / 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cf(b bVar, Animation.AnimationListener animationListener, int i2) {
        super(i2 < 160 ? 160 : i2, 40);
        this.m = false;
        this.f5832c = -1.0f;
        this.f5833d = false;
        this.f5835f = bVar;
        this.f5834e = animationListener;
        this.f5994a /= 2;
    }

    public void a(float f2, boolean z, float f3, float f4) {
        this.f5835f.f5689c[0] = this.f5835f.f5689c[1];
        this.f5835f.f5689c[1] = f2;
        if (this.f5835f.f5689c[0] != this.f5835f.f5689c[1]) {
            this.f5835f.a().a(this.f5835f.g());
            if (!f()) {
                if (this.f5994a < 160) {
                    this.f5994a = 160;
                }
                a(this.f5835f.o(), f2, z, f3, f4);
                this.f5835f.a().f5667e.a(true);
                this.f5835f.a().f5667e.f5670b = true;
                this.f5834e.onAnimationStart(null);
                super.d();
                return;
            }
            this.m = true;
            e();
            a(this.j, f2, z, f3, f4);
            this.f5835f.a().f5667e.a(true);
            this.f5835f.a().f5667e.f5670b = true;
            this.f5834e.onAnimationStart(null);
            super.d();
            this.m = false;
        }
    }

    public void a(float f2, float f3, boolean z, float f4, float f5) {
        this.l = z;
        this.g = f4;
        this.h = f5;
        this.i = f2;
        this.f5835f.f5687a.h.f5645c = this.i;
        if (this.l) {
            this.k = (this.f5835f.f5687a.h.f5645c * ((float) this.f5995b)) / ((float) this.f5994a);
            this.j = this.i * 2.0f;
            return;
        }
        this.k = ((this.f5835f.f5687a.h.f5645c * 0.5f) * ((float) this.f5995b)) / ((float) this.f5994a);
        this.j = this.i * 0.5f;
    }
}
