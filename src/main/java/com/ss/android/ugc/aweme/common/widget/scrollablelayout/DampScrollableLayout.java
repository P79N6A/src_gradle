package com.ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;

public class DampScrollableLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40563a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f40564b = "DampScrollableLayout";
    protected boolean A;
    protected int B;
    protected boolean C;
    protected int D;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected boolean I;
    protected int J;
    protected boolean K;
    protected ScrollableLayout.b L;
    protected b M;
    protected boolean N;

    /* renamed from: c  reason: collision with root package name */
    protected Context f40565c;

    /* renamed from: d  reason: collision with root package name */
    protected Scroller f40566d;

    /* renamed from: e  reason: collision with root package name */
    protected float f40567e;

    /* renamed from: f  reason: collision with root package name */
    protected float f40568f;
    protected float g;
    protected float h;
    protected VelocityTracker i;
    protected int j;
    protected int k;
    protected int l;
    protected boolean m;
    protected float n;
    protected float o;
    protected float p;
    protected float q;
    protected float r;
    protected float s;
    protected View t;
    protected ViewPager u;
    protected a v;
    protected int w;
    protected int x;
    protected int y;
    protected boolean z;

    public enum a {
        UP,
        DOWN;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    private static int b(int i2, int i3) {
        return i2 - i3;
    }

    public int getCurScrollY() {
        return this.H;
    }

    public b getHelper() {
        return this.M;
    }

    public int getMaxY() {
        return this.E;
    }

    public int getMinY() {
        return this.D;
    }

    public int getTabsMarginTop() {
        return this.G;
    }

    private boolean b() {
        if (this.H >= this.E) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40563a, false, 33933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40563a, false, 33933, new Class[0], Void.TYPE);
            return;
        }
        if (this.H != 0) {
            scrollTo(0, 0);
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f40563a, false, 33936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40563a, false, 33936, new Class[0], Void.TYPE);
            return;
        }
        if (this.t != null && !this.t.isClickable()) {
            this.t.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.u = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f40563a, false, 33939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40563a, false, 33939, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40566d.computeScrollOffset()) {
            int currY = this.f40566d.getCurrY();
            if (this.v == a.UP) {
                if (b()) {
                    int finalY = this.f40566d.getFinalY() - currY;
                    int b2 = b(this.f40566d.getDuration(), this.f40566d.timePassed());
                    this.M.a(a(finalY, b2), finalY, b2);
                    this.f40566d.forceFinished(true);
                    return;
                }
                scrollTo(0, currY);
            } else if (this.M.a()) {
                scrollTo(0, getScrollY() + (currY - this.B));
                if ((Math.abs(a(this.f40566d.getFinalY() - currY, b(this.f40566d.getDuration(), this.f40566d.timePassed()))) <= 0 || Math.abs(Math.max(this.f40566d.getFinalY(), this.D) - this.H) < 5) && this.H < this.F) {
                    this.f40566d.abortAnimation();
                    this.f40566d.startScroll(0, this.H, 0, -this.H, Math.abs(this.H) * 2);
                    this.v = a.UP;
                    return;
                } else if (this.H <= this.D) {
                    this.f40566d.forceFinished(true);
                    return;
                }
            }
            invalidate();
            this.B = currY;
        }
    }

    public void setMinY(int i2) {
        this.D = i2;
    }

    public void setOnScrollListener(ScrollableLayout.b bVar) {
        this.L = bVar;
    }

    public void setScrollMinY(int i2) {
        this.J = i2;
    }

    public void setTabsMarginTop(int i2) {
        this.G = i2;
    }

    public DampScrollableLayout(Context context) {
        this(context, null);
    }

    public void setCanScrollUp(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40563a, false, 33932, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f40563a, false, 33932, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.K != z2) {
            this.K = z2;
            if (this.K) {
                this.E = this.w - this.G;
                return;
            }
            if (this.H != 0) {
                scrollTo(0, 0);
            }
            this.E = 0;
        }
    }

    public void setMaxScrollHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40563a, false, 33934, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40563a, false, 33934, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.E = Math.min(i2, this.w - this.G);
        this.E = Math.max(this.E, 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        a aVar;
        boolean z3;
        MotionEvent motionEvent2 = motionEvent;
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f40563a, false, 33937, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f40563a, false, 33937, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (motionEvent.getActionIndex() != 0) {
                return true;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int abs = (int) Math.abs(x2 - this.f40567e);
            int abs2 = (int) Math.abs(y2 - this.f40568f);
            switch (motionEvent.getAction() & 255) {
                case 0:
                case 5:
                    this.C = false;
                    this.m = false;
                    this.n = motionEvent.getRawX();
                    this.o = motionEvent.getRawY();
                    this.z = true;
                    this.A = true;
                    this.f40567e = x2;
                    this.f40568f = y2;
                    this.g = x2;
                    this.h = y2;
                    this.x = getScrollY();
                    if (((int) y2) + getScrollY() <= this.w) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.I = z2;
                    if (PatchProxy.isSupport(new Object[0], this, f40563a, false, 33942, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f40563a, false, 33942, new Class[0], Void.TYPE);
                    } else if (this.i == null) {
                        this.i = VelocityTracker.obtain();
                    } else {
                        this.i.clear();
                    }
                    this.i.addMovement(motionEvent2);
                    this.f40566d.forceFinished(true);
                    break;
                case 1:
                case 3:
                case 6:
                    if (this.L != null) {
                        z4 = this.L.q_();
                    }
                    if (!z4 && this.A && ((abs2 > abs || this.H < 0) && abs2 > this.j)) {
                        if (getScrollY() < 0) {
                            this.v = a.UP;
                            this.f40566d.startScroll(0, getScrollY(), 0, -getScrollY(), -getScrollY());
                            this.f40566d.computeScrollOffset();
                            this.B = getScrollY();
                            invalidate();
                        } else {
                            this.i.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.l);
                            float f2 = -this.i.getYVelocity();
                            if (Math.abs(f2) > ((float) this.k)) {
                                if (f2 > 0.0f) {
                                    aVar = a.UP;
                                } else {
                                    aVar = a.DOWN;
                                }
                                this.v = aVar;
                                if (this.v != a.UP || !b()) {
                                    this.f40566d.fling(0, getScrollY(), 0, (int) f2, 0, 0, -2147483647, Integer.MAX_VALUE);
                                    this.B = getScrollY();
                                    invalidate();
                                }
                            }
                        }
                        if (this.I || !b()) {
                            int action = motionEvent.getAction();
                            motionEvent2.setAction(3);
                            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            motionEvent2.setAction(action);
                            return dispatchTouchEvent;
                        }
                    }
                case 2:
                    if (!this.C) {
                        if (PatchProxy.isSupport(new Object[0], this, f40563a, false, 33943, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f40563a, false, 33943, new Class[0], Void.TYPE);
                        } else if (this.i == null) {
                            this.i = VelocityTracker.obtain();
                        }
                        this.i.addMovement(motionEvent2);
                        float f3 = this.h - y2;
                        if (this.L != null) {
                            this.L.a(this.g - x2, f3);
                        }
                        if (this.z) {
                            if (abs > this.j && abs > abs2) {
                                this.z = false;
                                this.A = false;
                            } else if (abs2 > this.j && abs2 > abs) {
                                this.z = false;
                                this.A = true;
                            }
                        }
                        StringBuilder sb = new StringBuilder("shift: ");
                        if (abs2 > this.j) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        sb.append(z3);
                        new StringBuilder("stick: ").append(!b());
                        if (this.A && abs2 > this.j && abs2 > abs && (!b() || this.M.a())) {
                            if (this.u != null) {
                                this.u.requestDisallowInterceptTouchEvent(true);
                            }
                            double d2 = (double) f3;
                            Double.isNaN(d2);
                            scrollBy(0, (int) (d2 + 0.5d));
                        }
                        this.g = x2;
                        this.h = y2;
                        this.p = motionEvent.getRawX();
                        this.q = motionEvent.getRawY();
                        this.r = (float) ((int) (this.p - this.n));
                        this.s = (float) ((int) (this.q - this.o));
                        if (Math.abs(this.s) > ((float) this.J)) {
                            double abs3 = (double) Math.abs(this.s);
                            Double.isNaN(abs3);
                            if (abs3 * 0.1d > ((double) Math.abs(this.r))) {
                                this.m = false;
                                break;
                            }
                        }
                        this.m = true;
                        break;
                    }
                    break;
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (IllegalArgumentException unused) {
        }
    }

    public DampScrollableLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int a(int i2, int i3) {
        if (this.f40566d == null || i3 == 0) {
            return 0;
        }
        return i2 / i3;
    }

    public void scrollTo(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40563a, false, 33941, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40563a, false, 33941, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 >= this.E) {
            i4 = this.E;
        } else if (i3 <= this.D) {
            i4 = this.D;
        } else {
            i4 = i3;
        }
        this.H = i4;
        if (this.L != null && (!(this.L instanceof AbsFragment) || ((AbsFragment) this.L).isViewValid())) {
            this.L.b(i4, this.E);
        }
        super.scrollTo(i2, i4);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40563a, false, 33935, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40563a, false, 33935, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.t = getChildAt(0);
        if (this.t != null) {
            measureChildWithMargins(this.t, i2, 0, 0, 0);
            this.w = this.t.getMeasuredHeight();
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) + (this.w - this.G), 1073741824));
        if (!this.N) {
            this.E = this.w - this.G;
            this.N = true;
        }
        if (!this.K) {
            this.E = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void scrollBy(int r11, int r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40563a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 33940(0x8494, float:4.756E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40563a
            r3 = 0
            r4 = 33940(0x8494, float:4.756E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            int r0 = r10.getScrollY()
            if (r12 >= 0) goto L_0x0070
            int r1 = r0 + r12
            int r2 = r10.F
            if (r1 >= r2) goto L_0x0070
            float r2 = (float) r12
            r3 = 1067030938(0x3f99999a, float:1.2)
            float r2 = r2 * r3
            int r3 = r10.D
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
            float r1 = (float) r1
            float r3 = r3 * r1
            float r4 = r4 - r3
            float r2 = r2 * r4
            int r1 = (int) r2
            goto L_0x0071
        L_0x0070:
            r1 = r12
        L_0x0071:
            int r1 = r1 + r0
            int r2 = r10.E
            if (r1 < r2) goto L_0x0079
            int r1 = r10.E
            goto L_0x007f
        L_0x0079:
            int r2 = r10.D
            if (r1 > r2) goto L_0x007f
            int r1 = r10.D
        L_0x007f:
            int r1 = r1 - r0
            super.scrollBy(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout.scrollBy(int, int):void");
    }

    public DampScrollableLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.J = 10;
        this.K = true;
        this.f40565c = context;
        this.M = new b();
        this.f40566d = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.j = viewConfiguration.getScaledTouchSlop();
        this.k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.y = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollableLayout);
        this.G = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
