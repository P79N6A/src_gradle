package com.bytedance.android.livesdk.feed;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.android.live.uikit.refresh.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class BannerSwipeRefreshLayout extends b {
    public static ChangeQuickRedirect n;
    public ViewPager o;
    public View p;
    public RecyclerView q;
    private List<RecyclerView> r = new ArrayList();
    private int s;
    private boolean t;
    private float u;
    private float v;
    private float w;
    private float x;
    private int y;

    public interface a {
        void a(ViewPager viewPager, View view);

        void a(RecyclerView recyclerView);
    }

    public BannerSwipeRefreshLayout(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, n, false, 8357, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, n, false, 8357, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.s = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
        this.t = false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, n, false, 8358, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, n, false, 8358, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (!((this.o == null || this.p == null) && this.q == null)) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.u = motionEvent.getX();
                    this.w = this.u;
                    this.v = motionEvent.getY();
                    this.x = this.v;
                    this.t = false;
                    this.y = MotionEventCompat.getPointerId(motionEvent, 0);
                } else if (action == 2) {
                    if (this.t) {
                        return false;
                    }
                    int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.y);
                    float x2 = MotionEventCompat.getX(motionEvent, findPointerIndex);
                    float abs = Math.abs(x2 - this.w);
                    float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                    float abs2 = Math.abs(y2 - this.x);
                    if (this.o == null || this.p == null) {
                        if (this.q != null) {
                            if ((x2 - this.w <= 0.0f || this.q.getScrollX() != 0) && abs > ((float) this.s) && abs * 0.5f > abs2 && ((float) this.q.getBottom()) > y2) {
                                this.t = true;
                                return false;
                            } else if (abs2 < ((float) (this.s + 100))) {
                                return false;
                            } else {
                                if (x2 - this.u > 0.0f) {
                                    f2 = this.u + ((float) this.s);
                                } else {
                                    f2 = this.u - ((float) this.s);
                                }
                                this.w = f2;
                                this.x = y2;
                            }
                        }
                    } else if ((x2 - this.w <= 0.0f || this.o.getCurrentItem() != 0) && abs > ((float) this.s) && abs * 0.5f > abs2 && ((float) this.p.getBottom()) > y2) {
                        this.t = true;
                        return false;
                    } else if (abs2 < ((float) (this.s + 100))) {
                        return false;
                    } else {
                        if (x2 - this.u > 0.0f) {
                            f3 = this.u + ((float) this.s);
                        } else {
                            f3 = this.u - ((float) this.s);
                        }
                        this.w = f3;
                        this.x = y2;
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
        a(context);
    }
}
