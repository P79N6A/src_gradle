package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public class BannerSwipeRefreshLayout extends SwipeRefreshLayout {
    public static ChangeQuickRedirect o;
    private View p;
    private int q;
    private boolean r;
    private float s;
    private float t;
    private float u;
    private int v;

    public void setHeader(View view) {
        this.p = view;
    }

    public BannerSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, o, false, 38207, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, o, false, 38207, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (this.p != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.s = motionEvent.getX();
                    this.t = this.s;
                    this.u = motionEvent.getY();
                    this.r = false;
                    this.v = motionEvent.getPointerId(0);
                } else if (action == 2) {
                    if (this.r) {
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.v);
                    float x = motionEvent.getX(findPointerIndex);
                    float abs = Math.abs(x - this.t);
                    float y = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.u);
                    if (abs <= ((float) this.q) || abs * 0.5f <= abs2 || ((float) this.p.getBottom()) <= y) {
                        if (x - this.t > 0.0f) {
                            f2 = this.s + ((float) this.q);
                        } else {
                            f2 = this.s - ((float) this.q);
                        }
                        this.t = f2;
                        this.u = y;
                    } else {
                        this.r = true;
                        return false;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public BannerSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (PatchProxy.isSupport(new Object[]{context}, this, o, false, 38206, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, o, false, 38206, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.q = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.r = false;
        setDoNotCatchException(true);
    }
}
