package com.swmansion.gesturehandler;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;

public class g extends b<g> {
    private static float u = 10.0f;

    /* renamed from: a  reason: collision with root package name */
    public long f78780a = 500;

    /* renamed from: b  reason: collision with root package name */
    public float f78781b;
    private float v;
    private float w;
    private Handler x;

    /* access modifiers changed from: protected */
    public final void h() {
        if (this.x != null) {
            this.x.removeCallbacksAndMessages(null);
            this.x = null;
        }
    }

    public g(Context context) {
        a(true);
        this.f78781b = u * context.getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: protected */
    public final void a(MotionEvent motionEvent) {
        if (this.g == 0) {
            f();
            this.v = motionEvent.getRawX();
            this.w = motionEvent.getRawY();
            this.x = new Handler();
            this.x.postDelayed(new Runnable() {
                public final void run() {
                    g.this.e();
                }
            }, this.f78780a);
        }
        if (motionEvent.getActionMasked() == 1) {
            if (this.x != null) {
                this.x.removeCallbacksAndMessages(null);
                this.x = null;
            }
            if (this.g == 4) {
                g();
            } else {
                d();
            }
        } else {
            float rawX = motionEvent.getRawX() - this.v;
            float rawY = motionEvent.getRawY() - this.w;
            if ((rawX * rawX) + (rawY * rawY) > this.f78781b) {
                if (this.g == 4) {
                    c();
                    return;
                }
                d();
            }
        }
    }
}
