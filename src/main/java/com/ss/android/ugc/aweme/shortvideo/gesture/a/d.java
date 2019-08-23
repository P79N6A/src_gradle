package com.ss.android.ugc.aweme.shortvideo.gesture.a;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class d extends a {
    public static ChangeQuickRedirect l;
    private final float i;
    private float j;
    private float k;
    protected float m;
    protected float n;
    protected float o;
    protected float p;
    public int q;
    private float r;
    private float s;

    public d(Context context) {
        super(context);
        this.i = (float) ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    public void b(MotionEvent motionEvent) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, l, false, 77415, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, l, false, 77415, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        super.b(motionEvent);
        MotionEvent motionEvent2 = this.f67901d;
        this.r = -1.0f;
        this.s = -1.0f;
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float f3 = 0.0f;
        if (motionEvent2.getPointerCount() >= 2) {
            f3 = motionEvent2.getX(1);
            f2 = motionEvent2.getY(1);
        } else {
            f2 = 0.0f;
        }
        this.m = f3 - x;
        this.n = f2 - y;
        float x2 = motionEvent.getX(0);
        float y2 = motionEvent.getY(0);
        if (motionEvent.getPointerCount() >= 2) {
            f3 = motionEvent.getX(1);
            f2 = motionEvent.getY(1);
        }
        this.o = f3 - x2;
        this.p = f2 - y2;
    }

    public final boolean c(MotionEvent motionEvent) {
        float f2;
        float f3;
        boolean z;
        boolean z2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, l, false, 77420, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, l, false, 77420, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        DisplayMetrics displayMetrics = this.f67899b.getResources().getDisplayMetrics();
        this.j = ((float) displayMetrics.widthPixels) - this.i;
        this.k = ((float) displayMetrics.heightPixels) - this.i;
        float f4 = this.i - ((float) this.q);
        float f5 = this.j + ((float) this.q);
        float f6 = this.k + ((float) this.q);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (PatchProxy.isSupport(new Object[]{motionEvent2, 1}, null, l, true, 77418, new Class[]{MotionEvent.class, Integer.TYPE}, Float.TYPE)) {
            f2 = ((Float) PatchProxy.accessDispatch(new Object[]{motionEvent2, 1}, null, l, true, 77418, new Class[]{MotionEvent.class, Integer.TYPE}, Float.TYPE)).floatValue();
        } else {
            float x = motionEvent.getX() - motionEvent.getRawX();
            if (1 < motionEvent.getPointerCount()) {
                f2 = x + motionEvent2.getX(1);
            } else {
                f2 = 0.0f;
            }
        }
        if (PatchProxy.isSupport(new Object[]{motionEvent2, 1}, null, l, true, 77419, new Class[]{MotionEvent.class, Integer.TYPE}, Float.TYPE)) {
            f3 = ((Float) PatchProxy.accessDispatch(new Object[]{motionEvent2, 1}, null, l, true, 77419, new Class[]{MotionEvent.class, Integer.TYPE}, Float.TYPE)).floatValue();
        } else {
            float y = motionEvent.getY() - motionEvent.getRawY();
            if (1 < motionEvent.getPointerCount()) {
                f3 = motionEvent2.getY(1) + y;
            } else {
                f3 = 0.0f;
            }
        }
        if (rawX < f4 || rawY < f4 || rawX > f5 || rawY > f6) {
            z = true;
        } else {
            z = false;
        }
        if (f2 < f4 || f3 < f4 || f2 > f5 || f3 > f6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z || !z2) && !z && !z2) {
            return false;
        }
        return true;
    }
}
