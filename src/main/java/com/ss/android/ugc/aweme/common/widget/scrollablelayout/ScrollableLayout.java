package com.ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.R$styleable;

public class ScrollableLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40569a;
    protected int A;
    protected boolean B;
    protected int C;
    protected int D;
    protected int E;
    protected int F;
    protected boolean G;
    protected int H;
    protected boolean I;
    protected b J;
    protected b K;
    protected boolean L;
    int M;

    /* renamed from: b  reason: collision with root package name */
    protected Context f40570b;

    /* renamed from: c  reason: collision with root package name */
    protected Scroller f40571c;

    /* renamed from: d  reason: collision with root package name */
    protected float f40572d;

    /* renamed from: e  reason: collision with root package name */
    protected float f40573e;

    /* renamed from: f  reason: collision with root package name */
    protected float f40574f;
    protected float g;
    protected VelocityTracker h;
    protected int i;
    protected int j;
    protected int k;
    protected boolean l;
    protected float m;
    protected float n;
    protected float o;
    protected float p;
    protected float q;
    protected float r;
    protected View s;
    protected ViewPager t;
    protected a u;
    protected int v;
    protected int w;
    protected int x;
    protected boolean y;
    protected boolean z;

    public interface b {
        void a(float f2, float f3);

        void b(int i, int i2);

        boolean q_();
    }

    public enum a {
        UP,
        DOWN;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public int getCurScrollY() {
        return this.F;
    }

    public b getHelper() {
        return this.K;
    }

    public int getMaxY() {
        return this.D;
    }

    public int getMinY() {
        return this.C;
    }

    public int getTabsMarginTop() {
        return this.E;
    }

    private boolean b() {
        if (this.F >= this.D) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40569a, false, 33958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40569a, false, 33958, new Class[0], Void.TYPE);
            return;
        }
        if (this.F != 0) {
            scrollTo(0, 0);
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f40569a, false, 33961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40569a, false, 33961, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null && !this.s.isClickable()) {
            this.s.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.t = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f40569a, false, 33964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40569a, false, 33964, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40571c.computeScrollOffset()) {
            int currY = this.f40571c.getCurrY();
            if (this.u != a.UP) {
                if (this.K.a()) {
                    scrollTo(0, getScrollY() + (currY - this.A));
                    if (this.F <= this.C) {
                        this.f40571c.forceFinished(true);
                        return;
                    }
                }
                invalidate();
            } else if (b()) {
                int finalY = this.f40571c.getFinalY() - currY;
                int duration = this.f40571c.getDuration() - this.f40571c.timePassed();
                b bVar = this.K;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(finalY), Integer.valueOf(duration)}, this, f40569a, false, 33963, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(finalY), Integer.valueOf(duration)}, this, f40569a, false, 33963, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                } else if (this.f40571c != null) {
                    if (this.x >= 14) {
                        i2 = (int) this.f40571c.getCurrVelocity();
                    } else {
                        i2 = finalY / duration;
                    }
                }
                bVar.a(i2, finalY, duration);
                this.f40571c.forceFinished(true);
                return;
            } else {
                scrollTo(0, currY);
            }
            this.A = currY;
        }
    }

    public void setMinY(int i2) {
        this.C = i2;
    }

    public void setOnScrollListener(b bVar) {
        this.J = bVar;
    }

    public void setScrollMinY(int i2) {
        this.H = i2;
    }

    public void setTabsMarginTop(int i2) {
        this.E = i2;
    }

    public ScrollableLayout(Context context) {
        this(context, null);
    }

    public void setCanScrollUp(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40569a, false, 33957, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f40569a, false, 33957, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.I != z2) {
            this.I = z2;
            if (this.I) {
                this.D = this.v - this.E;
                return;
            }
            if (this.F != 0) {
                scrollTo(0, 0);
            }
            this.D = 0;
        }
    }

    public void setMaxScrollHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40569a, false, 33959, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40569a, false, 33959, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.D = Math.min(i2, this.v - this.E);
        this.D = Math.max(this.D, 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        a aVar;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f40569a, false, 33962, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f40569a, false, 33962, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int abs = (int) Math.abs(x2 - this.f40572d);
            int abs2 = (int) Math.abs(y2 - this.f40573e);
            switch (motionEvent.getAction()) {
                case 0:
                    this.B = false;
                    this.l = false;
                    this.m = motionEvent.getRawX();
                    this.n = motionEvent.getRawY();
                    this.y = true;
                    this.z = true;
                    this.f40572d = x2;
                    this.f40573e = y2;
                    this.f40574f = x2;
                    this.g = y2;
                    this.w = getScrollY();
                    if (((int) y2) + getScrollY() <= this.v) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.G = z2;
                    if (PatchProxy.isSupport(new Object[0], this, f40569a, false, 33967, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f40569a, false, 33967, new Class[0], Void.TYPE);
                    } else if (this.h == null) {
                        this.h = VelocityTracker.obtain();
                    } else {
                        this.h.clear();
                    }
                    this.h.addMovement(motionEvent2);
                    this.f40571c.forceFinished(true);
                    break;
                case 1:
                    if (this.J != null) {
                        this.J.q_();
                    }
                    if (this.z && abs2 > abs && abs2 > this.i) {
                        this.h.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.k);
                        float f2 = -this.h.getYVelocity();
                        if (Math.abs(f2) > ((float) this.j)) {
                            if (f2 > 0.0f) {
                                aVar = a.UP;
                            } else {
                                aVar = a.DOWN;
                            }
                            this.u = aVar;
                            if (this.u != a.UP || !b()) {
                                this.f40571c.fling(0, getScrollY(), 0, (int) f2, 0, 0, -2147483647, Integer.MAX_VALUE);
                                this.f40571c.computeScrollOffset();
                                this.A = getScrollY();
                                invalidate();
                            }
                        }
                        if (this.G || !b()) {
                            int action = motionEvent.getAction();
                            motionEvent2.setAction(3);
                            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            motionEvent2.setAction(action);
                            return dispatchTouchEvent;
                        }
                    }
                case 2:
                    if (!this.B) {
                        if (PatchProxy.isSupport(new Object[0], this, f40569a, false, 33968, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f40569a, false, 33968, new Class[0], Void.TYPE);
                        } else if (this.h == null) {
                            this.h = VelocityTracker.obtain();
                        }
                        this.h.addMovement(motionEvent2);
                        float f3 = this.g - y2;
                        if (this.J != null) {
                            this.J.a(this.f40574f - x2, f3);
                        }
                        if (this.y) {
                            if (abs > this.i && abs > abs2) {
                                this.y = false;
                                this.z = false;
                            } else if (abs2 > this.i && abs2 > abs) {
                                this.y = false;
                                this.z = true;
                            }
                        }
                        if (this.z && abs2 > this.i && abs2 > abs && (!b() || this.K.a())) {
                            if (this.t != null) {
                                this.t.requestDisallowInterceptTouchEvent(true);
                            }
                            scrollBy(0, (int) (f3 + 0.5f));
                        }
                        this.f40574f = x2;
                        this.g = y2;
                        this.o = motionEvent.getRawX();
                        this.p = motionEvent.getRawY();
                        this.q = (float) ((int) (this.o - this.m));
                        this.r = (float) ((int) (this.p - this.n));
                        if (Math.abs(this.r) > ((float) this.H) && Math.abs(this.r) * 0.1f > Math.abs(this.q)) {
                            this.l = false;
                            break;
                        } else {
                            this.l = true;
                            break;
                        }
                    }
                    break;
                case 3:
                    if (this.J != null) {
                        this.J.q_();
                    }
                    if (this.z && this.G && (abs > this.i || abs2 > this.i)) {
                        int action2 = motionEvent.getAction();
                        motionEvent2.setAction(3);
                        boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                        motionEvent2.setAction(action2);
                        return dispatchTouchEvent2;
                    }
            }
            super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void scrollBy(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40569a, false, 33965, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40569a, false, 33965, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int scrollY = getScrollY();
        if (scrollY + i3 < this.M) {
            i4 = i3 / 3;
        } else {
            i4 = i3;
        }
        int i5 = i4 + scrollY;
        if (i5 >= this.D) {
            i5 = this.D;
        } else if (i5 <= this.C) {
            i5 = this.C;
        }
        super.scrollBy(i2, i5 - scrollY);
    }

    public void scrollTo(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40569a, false, 33966, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40569a, false, 33966, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 >= this.D) {
            i4 = this.D;
        } else if (i3 <= this.C) {
            i4 = this.C;
        } else {
            i4 = i3;
        }
        this.F = i4;
        if (this.J != null) {
            this.J.b(i4, this.D);
        }
        super.scrollTo(i2, i4);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40569a, false, 33960, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40569a, false, 33960, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s = getChildAt(0);
        if (this.s != null) {
            measureChildWithMargins(this.s, i2, 0, 0, 0);
            this.v = this.s.getMeasuredHeight();
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) + (this.v - this.E), 1073741824));
        if (!this.L) {
            this.D = this.v - this.E;
            this.L = true;
        }
        if (!this.I) {
            this.D = 0;
        }
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.H = 10;
        this.I = true;
        this.f40570b = context;
        this.K = new b();
        this.f40571c = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = viewConfiguration.getScaledTouchSlop();
        this.j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.k = viewConfiguration.getScaledMaximumFlingVelocity();
        this.x = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollableLayout);
        this.E = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
