package com.swmansion.gesturehandler;

import android.view.MotionEvent;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    long f78790a;

    /* renamed from: b  reason: collision with root package name */
    long f78791b;

    /* renamed from: c  reason: collision with root package name */
    double f78792c;

    /* renamed from: d  reason: collision with root package name */
    public double f78793d;

    /* renamed from: e  reason: collision with root package name */
    public float f78794e;

    /* renamed from: f  reason: collision with root package name */
    public float f78795f;
    boolean g;
    int[] h = new int[2];
    a i;

    public interface a {
        void a();

        boolean a(m mVar);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.g) {
            this.g = false;
            if (this.i != null) {
                this.i.a();
            }
        }
    }

    public m(a aVar) {
        this.i = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent) {
        this.f78791b = this.f78790a;
        this.f78790a = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.h[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.h[1]);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        this.f78794e = (x + x2) * 0.5f;
        this.f78795f = (y + y2) * 0.5f;
        double d2 = -Math.atan2((double) (y2 - y), (double) (x2 - x));
        if (Double.isNaN(this.f78792c)) {
            this.f78793d = 0.0d;
        } else {
            this.f78793d = this.f78792c - d2;
        }
        this.f78792c = d2;
        if (this.f78793d > 3.141592653589793d) {
            this.f78793d -= 3.141592653589793d;
        } else if (this.f78793d < -3.141592653589793d) {
            this.f78793d += 3.141592653589793d;
        }
        if (this.f78793d > 1.5707963267948966d) {
            this.f78793d -= 3.141592653589793d;
            return;
        }
        if (this.f78793d < -1.5707963267948966d) {
            this.f78793d += 3.141592653589793d;
        }
    }
}
