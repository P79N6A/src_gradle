package com.bytedance.ies.dmt.ui.sliding;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public final class a extends DmtSlidingPaneLayout {
    private float l;
    private boolean m;

    public a(Context context) {
        this(context, null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (MotionEventCompat.getActionMasked(motionEvent) == 2 && !this.m) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0) {
            this.l = motionEvent.getX();
        } else if (actionMasked == 2) {
            if (!this.m) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (!b()) {
                if (a(this, false, Math.round(x - this.l), Math.round(x), Math.round(y))) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    return super.onInterceptTouchEvent(obtain);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private a(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.m = true;
        ViewConfiguration.get(context);
    }
}
