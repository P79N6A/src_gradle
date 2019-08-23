package com.swmansion.gesturehandler;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.m;

public class n extends b<n> {

    /* renamed from: a  reason: collision with root package name */
    public m f78796a;

    /* renamed from: b  reason: collision with root package name */
    public double f78797b;
    public double u;
    private m.a v = new m.a() {
        public final void a() {
            n.this.g();
        }

        public final boolean a(m mVar) {
            double d2 = n.this.f78797b;
            n.this.f78797b += mVar.f78793d;
            long j = mVar.f78790a - mVar.f78791b;
            if (j > 0) {
                n nVar = n.this;
                double d3 = n.this.f78797b - d2;
                double d4 = (double) j;
                Double.isNaN(d4);
                nVar.u = d3 / d4;
            }
            if (Math.abs(n.this.f78797b) >= 0.08726646259971647d && n.this.g == 2) {
                n.this.e();
            }
            return true;
        }
    };

    public n() {
        a(false);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f78796a = null;
        this.u = 0.0d;
        this.f78797b = 0.0d;
    }

    /* access modifiers changed from: protected */
    public final void a(MotionEvent motionEvent) {
        int i = this.g;
        if (i == 0) {
            this.u = 0.0d;
            this.f78797b = 0.0d;
            this.f78796a = new m(this.v);
            f();
        }
        if (this.f78796a != null) {
            m mVar = this.f78796a;
            switch (motionEvent.getActionMasked()) {
                case 0:
                    mVar.g = false;
                    mVar.h[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
                    mVar.h[1] = -1;
                    break;
                case 1:
                    mVar.a();
                    break;
                case 2:
                    if (mVar.g) {
                        mVar.a(motionEvent);
                        if (mVar.i != null) {
                            mVar.i.a(mVar);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (!mVar.g) {
                        mVar.h[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                        mVar.g = true;
                        mVar.f78791b = motionEvent.getEventTime();
                        mVar.f78792c = Double.NaN;
                        mVar.a(motionEvent);
                        m.a aVar = mVar.i;
                        break;
                    }
                    break;
                case 6:
                    if (mVar.g) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == mVar.h[0] || pointerId == mVar.h[1]) {
                            mVar.a();
                            break;
                        }
                    }
                    break;
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            if (i == 4) {
                g();
                return;
            }
            d();
        }
    }
}
