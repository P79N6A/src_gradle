package com.swmansion.gesturehandler;

import android.os.Handler;
import android.view.MotionEvent;

public class a extends b<a> {
    private final Runnable A = new Runnable() {
        public final void run() {
            a.this.d();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f78765a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f78766b = 1;
    private long u = 800;
    private long v = 160;
    private float w;
    private float x;
    private Handler y;
    private int z;

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.y != null) {
            this.y.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.y != null) {
            this.y.removeCallbacksAndMessages(null);
        }
    }

    private boolean c(MotionEvent motionEvent) {
        if (this.z != this.f78766b || (((this.f78765a & 1) == 0 || motionEvent.getRawX() - this.w <= ((float) this.v)) && (((this.f78765a & 2) == 0 || this.w - motionEvent.getRawX() <= ((float) this.v)) && (((this.f78765a & 4) == 0 || this.x - motionEvent.getRawY() <= ((float) this.v)) && ((this.f78765a & 8) == 0 || motionEvent.getRawY() - this.x <= ((float) this.v)))))) {
            return false;
        }
        this.y.removeCallbacksAndMessages(null);
        e();
        g();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(MotionEvent motionEvent) {
        int i = this.g;
        if (i == 0) {
            this.w = motionEvent.getRawX();
            this.x = motionEvent.getRawY();
            f();
            this.z = 1;
            if (this.y == null) {
                this.y = new Handler();
            } else {
                this.y.removeCallbacksAndMessages(null);
            }
            this.y.postDelayed(this.A, this.u);
        }
        if (i == 2) {
            c(motionEvent);
            if (motionEvent.getPointerCount() > this.z) {
                this.z = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() == 1 && !c(motionEvent)) {
                d();
            }
        }
    }
}
