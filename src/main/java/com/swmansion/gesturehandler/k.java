package com.swmansion.gesturehandler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

public class k extends b<k> {

    /* renamed from: a  reason: collision with root package name */
    public ScaleGestureDetector f78787a;

    /* renamed from: b  reason: collision with root package name */
    public double f78788b;
    public double u;
    public float v;
    public float w;
    private ScaleGestureDetector.OnScaleGestureListener x = new ScaleGestureDetector.OnScaleGestureListener() {
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            k.this.v = scaleGestureDetector.getCurrentSpan();
            return true;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            double d2 = k.this.f78788b;
            k kVar = k.this;
            double d3 = k.this.f78788b;
            double scaleFactor = (double) scaleGestureDetector.getScaleFactor();
            Double.isNaN(scaleFactor);
            kVar.f78788b = d3 * scaleFactor;
            long timeDelta = scaleGestureDetector.getTimeDelta();
            if (timeDelta > 0) {
                k kVar2 = k.this;
                double d4 = k.this.f78788b - d2;
                double d5 = (double) timeDelta;
                Double.isNaN(d5);
                kVar2.u = d4 / d5;
            }
            if (Math.abs(k.this.v - scaleGestureDetector.getCurrentSpan()) >= k.this.w && k.this.g == 2) {
                k.this.e();
            }
            return true;
        }
    };

    public k() {
        a(false);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f78787a = null;
        this.u = 0.0d;
        this.f78788b = 1.0d;
    }

    /* access modifiers changed from: protected */
    public final void a(MotionEvent motionEvent) {
        if (this.g == 0) {
            Context context = this.f78773f.getContext();
            this.u = 0.0d;
            this.f78788b = 1.0d;
            this.f78787a = new ScaleGestureDetector(context, this.x);
            this.w = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            f();
        }
        if (this.f78787a != null) {
            this.f78787a.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (this.g != 4 || pointerCount >= 2) {
            if (motionEvent.getActionMasked() == 1) {
                d();
            }
            return;
        }
        g();
    }
}
